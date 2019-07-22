import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Flashcard } from './Flashcard.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FlashcardServiceService {

  constructor(private http: HttpClient) { 

  }

  public getText(): Observable<Flashcard[]> {
    return this.http.get<Flashcard[]>('');
  }


}
