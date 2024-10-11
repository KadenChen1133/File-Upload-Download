package com.example.file_upload_download.repository;

import com.example.file_upload_download.model.FileEntity;
import com.example.file_upload_download.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.List;

public interface FileRepository extends JpaRepository<FileEntity, Long> {
    List<FileEntity> findByUser(User user);
    Optional<FileEntity> findByFileNameAndUser(String fileName, User user);

}
