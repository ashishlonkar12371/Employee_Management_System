import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HttpService {
  BaseUrl:string="http://localhost:8080/api/";
  
  constructor(private http:HttpClient) { }

    LoginCheck(obj){
      return (this.http.post(`${this.BaseUrl}loginvalidation`,obj));
    }   

    getAllEmployee(){
      return (this.http.get(`${this.BaseUrl}listOfEmployee`));
    }

    getAllCountry(){
         return (this.http.get(`${this.BaseUrl}listOfCountries`));
    }

    AddEMP(obj){
       return  (this.http.post(`${this.BaseUrl}saveEmployee`,obj,{responseType:"text"}));
    }

    getParticularEmpDetails(id){
      return (this.http.get(`${this.BaseUrl}getemployeebyid/${id}`));
    }

}
