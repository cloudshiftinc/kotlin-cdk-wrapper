@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

public enum class ProjectionType(
  private val cdkObject: software.amazon.awscdk.services.dynamodb.ProjectionType,
) {
  KEYS_ONLY(software.amazon.awscdk.services.dynamodb.ProjectionType.KEYS_ONLY),
  INCLUDE(software.amazon.awscdk.services.dynamodb.ProjectionType.INCLUDE),
  ALL(software.amazon.awscdk.services.dynamodb.ProjectionType.ALL),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.ProjectionType):
        ProjectionType = when (cdkObject) {
      software.amazon.awscdk.services.dynamodb.ProjectionType.KEYS_ONLY -> ProjectionType.KEYS_ONLY
      software.amazon.awscdk.services.dynamodb.ProjectionType.INCLUDE -> ProjectionType.INCLUDE
      software.amazon.awscdk.services.dynamodb.ProjectionType.ALL -> ProjectionType.ALL
    }

    internal fun unwrap(wrapped: ProjectionType):
        software.amazon.awscdk.services.dynamodb.ProjectionType = wrapped.cdkObject
  }
}
