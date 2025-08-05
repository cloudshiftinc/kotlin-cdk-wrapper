@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

public enum class RevisionType(
  private val cdkObject: software.amazon.awscdk.services.codepipeline.actions.RevisionType,
) {
  COMMIT_ID(software.amazon.awscdk.services.codepipeline.actions.RevisionType.COMMIT_ID),
  IMAGE_DIGEST(software.amazon.awscdk.services.codepipeline.actions.RevisionType.IMAGE_DIGEST),
  S3_OBJECT_VERSION_ID(software.amazon.awscdk.services.codepipeline.actions.RevisionType.S3_OBJECT_VERSION_ID),
  S3_OBJECT_KEY(software.amazon.awscdk.services.codepipeline.actions.RevisionType.S3_OBJECT_KEY),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.RevisionType):
        RevisionType = when (cdkObject) {
      software.amazon.awscdk.services.codepipeline.actions.RevisionType.COMMIT_ID ->
          RevisionType.COMMIT_ID
      software.amazon.awscdk.services.codepipeline.actions.RevisionType.IMAGE_DIGEST ->
          RevisionType.IMAGE_DIGEST
      software.amazon.awscdk.services.codepipeline.actions.RevisionType.S3_OBJECT_VERSION_ID ->
          RevisionType.S3_OBJECT_VERSION_ID
      software.amazon.awscdk.services.codepipeline.actions.RevisionType.S3_OBJECT_KEY ->
          RevisionType.S3_OBJECT_KEY
    }

    internal fun unwrap(wrapped: RevisionType):
        software.amazon.awscdk.services.codepipeline.actions.RevisionType = wrapped.cdkObject
  }
}
