/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistimlogic;

/**
 *
 * @author A-16
 */
public class sistemPerkuliahan {
    private perkuliahan[] dataperkuliahans;
    private Dosen[] dataDosens;
    private mahasiswa[] datamahasiswas;
    private staf[] datastafs;

    public sistemPerkuliahan() {
    }

    public sistemPerkuliahan(int maxperkuliahan,int maxDosen, mahasiswa[] datamahasiswas, staf[] datastafs) {
        this.dataperkuliahans = dataperkuliahans;
        this.dataDosens = dataDosens;
        this.datamahasiswas = datamahasiswas;
        this.datastafs = datastafs;
    }

   
    
}
