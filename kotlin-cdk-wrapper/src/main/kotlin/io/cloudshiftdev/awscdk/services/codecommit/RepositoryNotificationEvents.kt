@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codecommit

public enum class RepositoryNotificationEvents(
  private val cdkObject: software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents,
) {
  COMMIT_COMMENT(software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.COMMIT_COMMENT),
  PULL_REQUEST_COMMENT(software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.PULL_REQUEST_COMMENT),
  APPROVAL_STATUS_CHANGED(software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.APPROVAL_STATUS_CHANGED),
  APPROVAL_RULE_OVERRIDDEN(software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.APPROVAL_RULE_OVERRIDDEN),
  PULL_REQUEST_CREATED(software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.PULL_REQUEST_CREATED),
  PULL_REQUEST_SOURCE_UPDATED(software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.PULL_REQUEST_SOURCE_UPDATED),
  PULL_REQUEST_STATUS_CHANGED(software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.PULL_REQUEST_STATUS_CHANGED),
  PULL_REQUEST_MERGED(software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.PULL_REQUEST_MERGED),
  BRANCH_OR_TAG_CREATED(software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.BRANCH_OR_TAG_CREATED),
  BRANCH_OR_TAG_DELETED(software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.BRANCH_OR_TAG_DELETED),
  BRANCH_OR_TAG_UPDATED(software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.BRANCH_OR_TAG_UPDATED),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents):
        RepositoryNotificationEvents = when (cdkObject) {
      software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.COMMIT_COMMENT ->
          RepositoryNotificationEvents.COMMIT_COMMENT
      software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.PULL_REQUEST_COMMENT ->
          RepositoryNotificationEvents.PULL_REQUEST_COMMENT
      software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.APPROVAL_STATUS_CHANGED ->
          RepositoryNotificationEvents.APPROVAL_STATUS_CHANGED
      software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.APPROVAL_RULE_OVERRIDDEN ->
          RepositoryNotificationEvents.APPROVAL_RULE_OVERRIDDEN
      software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.PULL_REQUEST_CREATED ->
          RepositoryNotificationEvents.PULL_REQUEST_CREATED
      software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.PULL_REQUEST_SOURCE_UPDATED ->
          RepositoryNotificationEvents.PULL_REQUEST_SOURCE_UPDATED
      software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.PULL_REQUEST_STATUS_CHANGED ->
          RepositoryNotificationEvents.PULL_REQUEST_STATUS_CHANGED
      software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.PULL_REQUEST_MERGED ->
          RepositoryNotificationEvents.PULL_REQUEST_MERGED
      software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.BRANCH_OR_TAG_CREATED ->
          RepositoryNotificationEvents.BRANCH_OR_TAG_CREATED
      software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.BRANCH_OR_TAG_DELETED ->
          RepositoryNotificationEvents.BRANCH_OR_TAG_DELETED
      software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.BRANCH_OR_TAG_UPDATED ->
          RepositoryNotificationEvents.BRANCH_OR_TAG_UPDATED
    }

    internal fun unwrap(wrapped: RepositoryNotificationEvents):
        software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents = wrapped.cdkObject
  }
}
