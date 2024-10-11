package com.example.file_upload_download.repository;

import com.example.file_upload_download.model.File;
import com.example.file_upload_download.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.List;

public interface FileRepository extends JpaRepository<File, Long> {
    List<File> findByUser(User user);
    Optional<File> findByFileNameAndUser(String fileName, User user);

}
