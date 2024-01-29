package lesson14;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class StreamExample {
    public static <T> T koleksiyon(List<T> collection, T targetElement){
        Optional<T> result=collection.stream().filter((Predicate<? super T>) targetElement).findFirst();
        return result.orElse(null);
    }
    public static void main(String[] args) {
        List<String> stringList=List.of("mavi","sarı","mor","yeşil");

        String targetElement = "mavi";
        String foundElement =koleksiyon(stringList,targetElement);
        if (foundElement!=null){
            System.out.println("Öğe bulundu: "+foundElement);
        }else {
            System.out.println("Öğe bulunamadı. Sonuç: -1");
        }
    }
}
