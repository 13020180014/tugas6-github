class Kendaraan{ boolean mesin; int kapasitas;

void jalan(){ }

void berhenti(){ }

}

class Mobil extends Kendaraan{ public static void main(String args[]){ Mobil sedan = new Mobil();

sedan.mesin = true; sedan.kapasitas = 5; sedan.jalan(); sedan.berhenti();

}

}