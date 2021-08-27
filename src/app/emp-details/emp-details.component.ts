import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HttpService } from '../http.service';


@Component({
  selector: 'app-emp-details',
  templateUrl: './emp-details.component.html',
  styleUrls: ['./emp-details.component.css']
})
export class EmpDetailsComponent implements OnInit {

  empobj:any={};

  constructor(private routes:ActivatedRoute,
              private service:HttpService) { }

  ngOnInit() {
    this.GetParticularRecord();
  }

  GetParticularRecord(){
      this.routes.paramMap
      .subscribe((param)=>{
        let id=+param.get("id")
        this.service.getParticularEmpDetails(id)
        .subscribe((response)=>{
          console.log(response);
          this.empobj=(<any>response)
        })
      })
  }

}
