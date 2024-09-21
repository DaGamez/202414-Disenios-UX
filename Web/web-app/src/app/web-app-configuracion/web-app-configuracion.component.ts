import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-web-app-configuracion',
  templateUrl: './web-app-configuracion.component.html',
  styleUrls: ['./web-app-configuracion.component.css']
})
export class WebAppConfiguracionComponent implements OnInit {
  selectedCountry: string = '';
  mostrarMenuPais:Boolean = false;
  diasFestivosCostaRica: Array<String>=["Año Nuevo: lunes 1 de enero","Jueves Santo: 28 de marzo"];
  diasFestivosColombia: Array<String>=["Navidad 25 de diciembre","Año Nuevo 1 de enero","Día de la Independencia 20 de julio"];
  diasFestivosSeleccionados: Array<String>=[];

  constructor() { }

  ngOnInit() {
  }

  actualizardiasFestivos(){
    if(this.selectedCountry == 'Costa Rica'){
      this.diasFestivosSeleccionados = this.diasFestivosCostaRica;
    }else if(this.selectedCountry == 'Colombia'){
      this.diasFestivosSeleccionados = this.diasFestivosColombia;
    }
  }

}
