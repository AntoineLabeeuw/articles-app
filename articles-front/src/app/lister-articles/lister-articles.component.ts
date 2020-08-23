import { ArticleServiceService } from './../service/article-service.service';
import { Article } from './../entites/article.dto';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-lister-articles',
  templateUrl: './lister-articles.component.html',
  styleUrls: ['./lister-articles.component.css']
})
export class ListerArticlesComponent implements OnInit {
  articles: Article[];
  constructor(private _articleSrv: ArticleServiceService) { }

  ngOnInit(): void {
    this._articleSrv.listerArticles().subscribe(
      articles => this.articles = articles,
      err => {},
      () => {}
    );
  }

}
