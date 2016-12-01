/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comboboxterhubung.service;

import comboboxterhubung.entity.Jurusan;
import java.util.List;
public interface JurusanSevice {
    public List<Jurusan> getJurusanByFakultas(String kodefakultas);
}
