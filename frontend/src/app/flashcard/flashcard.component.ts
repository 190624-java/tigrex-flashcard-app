import { Component, OnInit } from '@angular/core';
import { Flashcard } from '../Flashcard.model';
import { FlashcardServiceService } from '../flashcard-service.service';

@Component({
  selector: 'app-flashcard',
  templateUrl: './flashcard.component.html',
  styleUrls: ['./flashcard.component.css']
})
export class FlashcardComponent implements OnInit {

  constructor(private flashcardService: FlashcardServiceService) { 

  }

  ngOnInit() {
    this.getFlashcards();
  }

  public flashcards: Flashcard[] = [];
  public testData: String = "Test Data";

  getFlashcards(): void {
    this.flashcardService.getText().subscribe(flashcards => this.flashcards = flashcards);
  }
}
