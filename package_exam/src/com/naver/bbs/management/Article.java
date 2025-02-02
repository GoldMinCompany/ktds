package com.naver.bbs.management;

import com.naver.member.management.Member;



public class Article {
	
	/**
	 * 제목
	 */
	String title;
	
	/**
	 * 내용
	 */
	String description;
	/**
	 * 게시글 작성자 정보
	 */
	Member author;
	
	public static void main(String[] args) {
		
		Article newArticle = new Article();
		newArticle.title = "새로운 게시글";
		newArticle.description = "게시글의 내용";
		
		Member articleAuthor = new Member("userId", "사용자");
		
		newArticle.author = articleAuthor;
		
		// 게시글 제목 :
		// 게시글 내용 :
		// 게시글 작성자 ID : userId
		// 게시글 작성자 이름 : 사용자
		
		
		System.out.println("게시글 제목 : " + newArticle.title);
		System.out.println("게시글 내용 : " + newArticle.description);
		System.out.println("게시글 작성자 ID : "+ newArticle.author.getId());
		System.out.println("게시글 작성자 이름 : "+ newArticle.author.getName());
		
		
		
	}
	

}
