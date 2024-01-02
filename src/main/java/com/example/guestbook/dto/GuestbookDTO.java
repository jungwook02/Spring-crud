package com.example.guestbook.dto;

import java.time.LocalDateTime;

import lombok.*;
import org.springframework.cglib.core.Local;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor


public class GuestbookDTO {

    private  Long gno;
    private String title;
    private String content;
    private String writer;
    private LocalDateTime regDate;
    private LocalDateTime modDate;


}
