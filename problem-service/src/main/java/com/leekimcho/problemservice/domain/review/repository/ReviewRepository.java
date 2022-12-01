package com.leekimcho.problemservice.domain.review.repository;

import com.leekimcho.problemservice.domain.review.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    @Query(value = "SELECT * FROM review r WHERE r.review_id = :reviewId AND r.member_id = :memberId", nativeQuery = true)
    Optional<Review> findReviewByIdAndMemberId(Long reviewId, Long memberId);
}