package io.cloudshiftdev.awscdk.services.s3

public enum class EventType(
  private val cdkObject: software.amazon.awscdk.services.s3.EventType,
) {
  OBJECT_CREATED(software.amazon.awscdk.services.s3.EventType.OBJECT_CREATED),
  OBJECT_CREATED_PUT(software.amazon.awscdk.services.s3.EventType.OBJECT_CREATED_PUT),
  OBJECT_CREATED_POST(software.amazon.awscdk.services.s3.EventType.OBJECT_CREATED_POST),
  OBJECT_CREATED_COPY(software.amazon.awscdk.services.s3.EventType.OBJECT_CREATED_COPY),
  OBJECT_CREATED_COMPLETE_MULTIPART_UPLOAD(software.amazon.awscdk.services.s3.EventType.OBJECT_CREATED_COMPLETE_MULTIPART_UPLOAD),
  OBJECT_REMOVED(software.amazon.awscdk.services.s3.EventType.OBJECT_REMOVED),
  OBJECT_REMOVED_DELETE(software.amazon.awscdk.services.s3.EventType.OBJECT_REMOVED_DELETE),
  OBJECT_REMOVED_DELETE_MARKER_CREATED(software.amazon.awscdk.services.s3.EventType.OBJECT_REMOVED_DELETE_MARKER_CREATED),
  OBJECT_RESTORE_POST(software.amazon.awscdk.services.s3.EventType.OBJECT_RESTORE_POST),
  OBJECT_RESTORE_COMPLETED(software.amazon.awscdk.services.s3.EventType.OBJECT_RESTORE_COMPLETED),
  OBJECT_RESTORE_DELETE(software.amazon.awscdk.services.s3.EventType.OBJECT_RESTORE_DELETE),
  REDUCED_REDUNDANCY_LOST_OBJECT(software.amazon.awscdk.services.s3.EventType.REDUCED_REDUNDANCY_LOST_OBJECT),
  REPLICATION_OPERATION_FAILED_REPLICATION(software.amazon.awscdk.services.s3.EventType.REPLICATION_OPERATION_FAILED_REPLICATION),
  REPLICATION_OPERATION_MISSED_THRESHOLD(software.amazon.awscdk.services.s3.EventType.REPLICATION_OPERATION_MISSED_THRESHOLD),
  REPLICATION_OPERATION_REPLICATED_AFTER_THRESHOLD(software.amazon.awscdk.services.s3.EventType.REPLICATION_OPERATION_REPLICATED_AFTER_THRESHOLD),
  REPLICATION_OPERATION_NOT_TRACKED(software.amazon.awscdk.services.s3.EventType.REPLICATION_OPERATION_NOT_TRACKED),
  LIFECYCLE_EXPIRATION(software.amazon.awscdk.services.s3.EventType.LIFECYCLE_EXPIRATION),
  LIFECYCLE_EXPIRATION_DELETE(software.amazon.awscdk.services.s3.EventType.LIFECYCLE_EXPIRATION_DELETE),
  LIFECYCLE_EXPIRATION_DELETE_MARKER_CREATED(software.amazon.awscdk.services.s3.EventType.LIFECYCLE_EXPIRATION_DELETE_MARKER_CREATED),
  LIFECYCLE_TRANSITION(software.amazon.awscdk.services.s3.EventType.LIFECYCLE_TRANSITION),
  INTELLIGENT_TIERING(software.amazon.awscdk.services.s3.EventType.INTELLIGENT_TIERING),
  OBJECT_TAGGING(software.amazon.awscdk.services.s3.EventType.OBJECT_TAGGING),
  OBJECT_TAGGING_PUT(software.amazon.awscdk.services.s3.EventType.OBJECT_TAGGING_PUT),
  OBJECT_TAGGING_DELETE(software.amazon.awscdk.services.s3.EventType.OBJECT_TAGGING_DELETE),
  OBJECT_ACL_PUT(software.amazon.awscdk.services.s3.EventType.OBJECT_ACL_PUT),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.EventType): EventType = when
        (cdkObject) {
      software.amazon.awscdk.services.s3.EventType.OBJECT_CREATED -> EventType.OBJECT_CREATED
      software.amazon.awscdk.services.s3.EventType.OBJECT_CREATED_PUT ->
          EventType.OBJECT_CREATED_PUT
      software.amazon.awscdk.services.s3.EventType.OBJECT_CREATED_POST ->
          EventType.OBJECT_CREATED_POST
      software.amazon.awscdk.services.s3.EventType.OBJECT_CREATED_COPY ->
          EventType.OBJECT_CREATED_COPY
      software.amazon.awscdk.services.s3.EventType.OBJECT_CREATED_COMPLETE_MULTIPART_UPLOAD ->
          EventType.OBJECT_CREATED_COMPLETE_MULTIPART_UPLOAD
      software.amazon.awscdk.services.s3.EventType.OBJECT_REMOVED -> EventType.OBJECT_REMOVED
      software.amazon.awscdk.services.s3.EventType.OBJECT_REMOVED_DELETE ->
          EventType.OBJECT_REMOVED_DELETE
      software.amazon.awscdk.services.s3.EventType.OBJECT_REMOVED_DELETE_MARKER_CREATED ->
          EventType.OBJECT_REMOVED_DELETE_MARKER_CREATED
      software.amazon.awscdk.services.s3.EventType.OBJECT_RESTORE_POST ->
          EventType.OBJECT_RESTORE_POST
      software.amazon.awscdk.services.s3.EventType.OBJECT_RESTORE_COMPLETED ->
          EventType.OBJECT_RESTORE_COMPLETED
      software.amazon.awscdk.services.s3.EventType.OBJECT_RESTORE_DELETE ->
          EventType.OBJECT_RESTORE_DELETE
      software.amazon.awscdk.services.s3.EventType.REDUCED_REDUNDANCY_LOST_OBJECT ->
          EventType.REDUCED_REDUNDANCY_LOST_OBJECT
      software.amazon.awscdk.services.s3.EventType.REPLICATION_OPERATION_FAILED_REPLICATION ->
          EventType.REPLICATION_OPERATION_FAILED_REPLICATION
      software.amazon.awscdk.services.s3.EventType.REPLICATION_OPERATION_MISSED_THRESHOLD ->
          EventType.REPLICATION_OPERATION_MISSED_THRESHOLD
      software.amazon.awscdk.services.s3.EventType.REPLICATION_OPERATION_REPLICATED_AFTER_THRESHOLD ->
          EventType.REPLICATION_OPERATION_REPLICATED_AFTER_THRESHOLD
      software.amazon.awscdk.services.s3.EventType.REPLICATION_OPERATION_NOT_TRACKED ->
          EventType.REPLICATION_OPERATION_NOT_TRACKED
      software.amazon.awscdk.services.s3.EventType.LIFECYCLE_EXPIRATION ->
          EventType.LIFECYCLE_EXPIRATION
      software.amazon.awscdk.services.s3.EventType.LIFECYCLE_EXPIRATION_DELETE ->
          EventType.LIFECYCLE_EXPIRATION_DELETE
      software.amazon.awscdk.services.s3.EventType.LIFECYCLE_EXPIRATION_DELETE_MARKER_CREATED ->
          EventType.LIFECYCLE_EXPIRATION_DELETE_MARKER_CREATED
      software.amazon.awscdk.services.s3.EventType.LIFECYCLE_TRANSITION ->
          EventType.LIFECYCLE_TRANSITION
      software.amazon.awscdk.services.s3.EventType.INTELLIGENT_TIERING ->
          EventType.INTELLIGENT_TIERING
      software.amazon.awscdk.services.s3.EventType.OBJECT_TAGGING -> EventType.OBJECT_TAGGING
      software.amazon.awscdk.services.s3.EventType.OBJECT_TAGGING_PUT ->
          EventType.OBJECT_TAGGING_PUT
      software.amazon.awscdk.services.s3.EventType.OBJECT_TAGGING_DELETE ->
          EventType.OBJECT_TAGGING_DELETE
      software.amazon.awscdk.services.s3.EventType.OBJECT_ACL_PUT -> EventType.OBJECT_ACL_PUT
    }

    internal fun unwrap(wrapped: EventType): software.amazon.awscdk.services.s3.EventType =
        wrapped.cdkObject
  }
}
