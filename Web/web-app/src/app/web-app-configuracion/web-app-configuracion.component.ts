import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-web-app-configuracion',
  templateUrl: './web-app-configuracion.component.html',
  styleUrls: ['./web-app-configuracion.component.css']
})
export class WebAppConfiguracionComponent implements OnInit {

  mostrarMenuPais:Boolean = false;
  diasFestivosCostaRica: Array<String>=["Año Nuevo: lunes 1 de enero","Jueves Santo: 28 de marzo"];

  constructor() { }

  ngOnInit() {
  }

}
