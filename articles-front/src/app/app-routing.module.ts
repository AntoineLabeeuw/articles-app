import { AccueilComponent } from './accueil/accueil.component';
import { AjouterArticleComponent } from './ajouter-article/ajouter-article.component';
import { ListerArticlesComponent } from './lister-articles/lister-articles.component';
import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  { path: 'accueil', component: AccueilComponent},
  { path: 'liste', component: ListerArticlesComponent},
  { path: 'ajout', component: AjouterArticleComponent},
  { path: '', pathMatch: 'full', redirectTo: '/accueil' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
