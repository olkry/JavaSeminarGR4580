package HardwareStore;

import java.util.Objects;

public class Laptops {

      // Очень упрощённо
      public String model;
      public String cpu; // Фирма - Intel или AMD
      public int ozu; // оперативная память - 16 или 32
      public int hdd; // размер жесткого диска - 512 или 1024 ГБ
      public String videoType; // Фирма nVideo или Radeon
      public int videoRam; // обьём видеопамяти 3 или 6 ГБ
      public int windowsVersion; // Версия винды 10 или 11
      public int year;
      // Ограничемся только этим, и использовать будем только по 2 значения,
      // что преведены в комментариях

      public Laptops(String model, String cpu, int ozu, int hdd, String videoType,
                  int videoRam, int windowsVersion, int year) {
            this.model = model;
            this.cpu = cpu;
            this.ozu = ozu;
            this.hdd = hdd;
            this.videoType = videoType;
            this.videoRam = videoRam;
            this.windowsVersion = windowsVersion;
            this.year = year;
      }

      @Override
      public String toString() {

            return ">>> " + "Модель: " + model + ", Процессор: " + cpu + ", Оператива: " + ozu
                        + "GB" + ", Память HDD: " + hdd + "GB" + ", Видюха:" + videoType + " "
                        + videoRam + "GB" + ", Версия винды: " + windowsVersion
                        + ", Год выпуска: " + year + "\n";
      }

      @Override
      public boolean equals(Object obj) {  // Сравнение по техническим характеристикам самого железа
            if (obj == null) {
                  return false;
            }
            Laptops lap = (Laptops) obj;
            return ozu == lap.ozu && hdd == lap.hdd && videoRam == lap.videoRam;
      }

      @Override
      public int hashCode() {

            return Objects.hash(model, cpu, ozu, hdd, videoType, videoRam, windowsVersion, year);
      }

}
