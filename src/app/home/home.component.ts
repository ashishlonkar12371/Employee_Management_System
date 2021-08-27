import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpService } from '../http.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  

  p:number=1;
  EmpData:any[]=[]; 
  isradioClick:boolean=false;  

  constructor(private service:HttpService,
    private router:Router
    ) { }

  ngOnInit() {
   this.GetAllEMPData();
  }

  GetAllEMPData(){
      this.service.getAllEmployee()
      .subscribe((response)=>{
        //console.log(response);
        this.EmpData=(<any>response)
      })
  }

  onAddEmp(){
      this.router.navigate(['/addEmployee'])
  }

  onRadio(item){
    console.log(item);
    this.isradioClick=true;
  }

  IsRadioCheck(){
    if(this.isradioClick==true)
      return true;
    else
      return false;
  }

  onEdit(){
      if(this.IsRadioCheck()){
        alert('Employee is selected...');
      }else{
        alert('Please Select the Employee to update..');
      }
  }

}
