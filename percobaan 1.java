
public class praktikum1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String username = "masRendra";
    String password = "m4l4n9";
    String uname,pwd;
    
    System.out.print("Masukkan username: ");
    uname = scanner.nextLine();
    System.out.print("Masukkan password: ");
    pwd = scanner.nextLine();
    
    if (uname.equals(username) && pwd.equals(password)){
        System.out.println("Anda Berhasil login kedalam sistem!");
    } else {
        System.out.println("Login gagal!");
        return;
    }
    System.out.println("");
    System.out.println("....................................................................................");
    System.out.println("------------------------------------DASHBOARD---------------------------------------");

    System.out.println("");
    System.out.println("Kemana tujuan anda selanjutnya untuk berbisnis: ");
    System.out.println("1. Maladewa ");
    System.out.println("2. Dubai ");
    System.out.println("3. Peru ");
    System.out.println("4. Roma ");
    System.out.println("5. Buenos Aires ");
    System.out.print("Pilihan anda (1/2/3/4/5): ");
    int tujuanInput = scanner.nextInt();
    String tujuan = "";
    
    switch (tujuanInput) {
        case 1: 
          tujuan = "Maladewa";
          break;
        case 2: 
          tujuan = "Dubai";
          break;
        case 3: 
          tujuan = "Peru";
          break;
        case 4: 
          tujuan = "Roma";
          break;
        case 5: 
          tujuan = "Buenos Aires";
          break;
        default: System.out.println("Tidak ada opsi");
        return;       
    }
    
    System.out.println("");
    System.out.println("Pilih kendaraan anda: ");
    System.out.println("1. Private Jet");
    System.out.println("2. Commercial Aircraft");
    System.out.println("3. Yatch");
    System.out.println("4. Luxury Car(cargo)");
    System.out.println("5. Cruise Ship");  
    System.out.print("Pilihan anda (1/2/3/4/5): ");
    int vehicleinput = scanner.nextInt();
    String vehicle = ("");
    int vcharga = 0;
    
    switch (vehicleinput) {
        case 1: 
          vehicle = ("Private Jet");
          vcharga = getvcharga(tujuan, vehicle);
          break;
        case 2: 
          vehicle = ("Commercial Aircraft");
          vcharga = getvcharga(tujuan, vehicle);
          break;
        case 3: 
          vehicle = ("Yatch");
          vcharga = getvcharga(tujuan, vehicle);
          break;
        case 4: 
          vehicle = ("Luxury Car(cargo)");
          vcharga = getvcharga(tujuan, vehicle);
          break;
        case 5: 
          vehicle = ("Cruise Ship");
          vcharga = getvcharga(tujuan, vehicle);
          break;
        default: 
            System.out.println("Tidak ada opsi");
            return;
      }
    
    System.out.println("");
    System.out.println("Pilih tempat anda menginap: ");
    System.out.println("1. Luxury Resort");
    System.out.println("2. 5 Star Hotel");
    System.out.println("3. Private villa");
    System.out.println("4. Boutique Hotel");
    System.out.println("5. Penthouse");
    System.out.println("6. Luxury Apartment");
    System.out.println("7. Beachfront Villa");
    System.out.println("8. Cruise Ship Luxury Suites");
    System.out.println("9. Covert Branch Headquarters");
    System.out.print("Pilihan anda (1/2/3/4/5/6/7/8/9): ");
    int inapinput = scanner.nextInt();
    String inap = "";
    int ipharga = 0;
      
    switch (inapinput) {
      case 1: 
        inap = "Luxury Resort";
        ipharga = 45000000;
        break;
      case 2: 
        inap = "5 Star Hotel";
        ipharga = 30000000;
        break;
      case 3: 
        inap = "Private villa";
        ipharga = 0;
        break;
      case 4: 
        inap = "Boutique Hotel";
        ipharga = 10000000;
        break;
      case 5: 
        inap = "Penthouse";
        ipharga = 40000000;
        break;
      case 6: 
        inap = "Luxury Apartment";
        ipharga = 20000000;
        break;
      case 7: 
        inap = "Beachfront Villa";
        ipharga = 18000000;
        break;
      case 8: 
        inap = "Cruise Ship Luxury Suites";
        ipharga = 80000000;
        break;
      case 9: 
        inap = "Covert Branch Headquarters";
        ipharga = 0;
        break;
      default:
          System.out.println("Tidak ada opsi");
          return;
    }

      System.out.println("");
      System.out.println("--------------------------------------HASIL-----------------------------------------");
      System.out.println("Anda telah memilih tujuan untuk pergi ke " + tujuan + " dengan menggunakan " + vehicle);
      System.out.println("lalu menempati " + inap + " sebagai tempat tinggal sementara selama satu minggu.");
      int totalBiaya = vcharga + ipharga;
      System.out.println("Estimasi biaya: " + totalBiaya);
      scanner.close();
      System.out.println("....................................................................................");
      System.out.println("");
    }

  public static int getvcharga(String tujuan, String vehicle) {
    int vcharga = 0;

    switch (tujuan) {
      case "Maladewa":
        switch (vehicle) {
          case "Private Jet": vcharga = 300000000; break;
          case "Commercial Aircraft": vcharga = 25000000; break;
          case "Yatch": vcharga = 155000000; break;
          case "Luxury Car(cargo)": vcharga = 66500000; break;
          case "Cruise Ship": vcharga = 720000000; break;
          default: 
              System.out.println("Kendaraan tidak valid untuk tujuan ini");
        }
        break;
      case "Dubai":
        switch (vehicle) {
          case "Private Jet": vcharga = 450000000; break;
          case "Commercial Aircraft": vcharga = 40000000; break;
          case "Yatch": vcharga = 700000000; break;
          case "Luxury Car(cargo)": vcharga = 150000000; break;
          case "Cruise Ship": vcharga = 845000000; break;
          default: 
              System.out.println("Kendaraan tidak valid untuk tujuan ini");
        }
        break;
      case "Peru":
        switch (vehicle) {
          case "Private Jet": vcharga = 870000000; break;
          case "Commercial Aircraft": vcharga = 90000000; break;
          case "Yatch": vcharga = 180000000; break;
          case "Luxury Car(cargo)": vcharga = 290000000; break;
          case "Cruise Ship": vcharga = 980000000; break;
          default: 
              System.out.println("Kendaraan tidak valid untuk tujuan ini");
        }
        break;
      case "Roma":
        switch (vehicle) {
          case "Private Jet": vcharga = 500000000; break;
          case "Commercial Aircraft": vcharga = 35000000; break;
          case "Yatch": vcharga = 200000000; break;
          case "Luxury Car(cargo)": vcharga = 120000000; break;
          case "Cruise Ship": vcharga = 900000000; break;
          default: 
              System.out.println("Kendaraan tidak valid untuk tujuan ini");
        }
        break;
      case "Buenos Aires":
        switch (vehicle) {
          case "Private Jet": vcharga = 600000000; break;
          case "Commercial Aircraft": vcharga = 45000000; break;
          case "Yatch": vcharga = 250000000; break;
          case "Luxury Car(cargo)": vcharga = 130000000; break;
          case "Cruise Ship": vcharga = 950000000; break;
          default: 
              System.out.println("Kendaraan tidak valid untuk tujuan ini");
    }
    break;
  default: System.out.println("Tujuan tidak valid.");
    }

    return vcharga;
  }
}

