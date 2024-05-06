package com.UploadFiles.UploadFiles.Responses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileInformation {
    private String name;
    private String url;
}
