import { Article } from './../entites/article.dto';
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';


const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json',
    responseType: 'text'
  })
};
@Injectable({
  providedIn: 'root'
})
export class ArticleServiceService {

  constructor(private http: HttpClient) { }
  listerArticles(): Observable<Article[]> {
    return this.http.get<Article[]>(`http://localhost:9000/articles`);
  }

  ajouterArticle(article: Article): Observable<any> {
    return this.http.post(`http://localhost:9000/articles`, article, httpOptions);
  }
}
