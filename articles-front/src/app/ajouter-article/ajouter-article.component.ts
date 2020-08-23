import { Component, OnInit } from '@angular/core';
import { ArticleServiceService } from './../service/article-service.service';
import { Article } from '../entites/article.dto';

@Component({
  selector: 'app-ajouter-article',
  templateUrl: './ajouter-article.component.html',
  styleUrls: ['./ajouter-article.component.css']
})
export class AjouterArticleComponent implements OnInit {
  article: Article;
  constructor(private _articleSrv: ArticleServiceService) { }

  ngOnInit(): void {
    this.article = {};
  }

  ajouterArticle(): void {
    this._articleSrv.ajouterArticle(this.article).subscribe();
  }


}
