package check;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class check {

    public static void main(String[] args) throws IOException {

        String fileName = "G:\\桌面\\name.txt";
        String fileID ="G:\\桌面\\id.txt";

        Path path0 = Paths.get(fileName);
        Path path1=Paths.get(fileID);

        List<String> allId = Files.readAllLines(path1, StandardCharsets.UTF_8);
        List<String> allName = Files.readAllLines(path0, StandardCharsets.UTF_8);//原文出自【易百教程】，商业转载请联系作者获得授权，非商业请保留原文链接：https://www.yiibai.com/java/java-read-text-file.html

//        System.out.println(allName);
//        System.out.println(allId.toString());

        ArrayList<String> info=new ArrayList<>();

        //1.定义爬取规则，学号
        String regex="[0-9]{10}";

        //2.编译正则表达式成为一个匹配规则对象
        Pattern pattern=Pattern.compile(regex);

        String path = "G:\\桌面\\新建文件夹";		//要遍历的路径
        File file = new File(path);		//获取其file对象
        File[] fs = file.listFiles();	//遍历path下的文件和目录，放在File数组中
        for(File f:fs){					//遍历File[]数组
//            if(!f.isDirectory())		//若非目录(即文件)，则打印
//                System.out.println(f);

            String name=f.getName();
            info.add(name);

        }
        String infoma=info.toString();

        //3.通过匹配规则得到一个匹配器对象
        Matcher matcher= pattern.matcher(infoma);

        //4.通过匹配器去内容中爬取出信息
        while (matcher.find()){
            allName.remove(allId.lastIndexOf(matcher.group()));
            allId.remove(matcher.group());


            //System.out.println(matcher.group());
        }
        System.out.println("未交的学生学号：");
        System.out.println(allId);
        System.out.println("未交的学生名单("+allName.size()+"人)");
        System.out.println(allName);
    }

}

