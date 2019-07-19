import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ViewComponent } from './view/view.component';
import { SubmitComponent } from './submit/submit.component';
import { FlashcardComponent } from './flashcard/flashcard.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ViewComponent,
    SubmitComponent,
    FlashcardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
