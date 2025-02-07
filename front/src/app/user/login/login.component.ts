import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  public invalid: boolean = false;
  public message: string = '';
  loading: boolean = false;

  constructor() {
  }

  ngOnInit(): void {
  }

  logIn(): void {

     this.message = "Fields cannot be empty!";
     this.invalid = true;
  }

    toRegister(): void {
    }
}