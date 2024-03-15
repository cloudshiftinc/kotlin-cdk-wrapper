@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

public enum class EnvironmentFileType(
  private val cdkObject: software.amazon.awscdk.services.ecs.EnvironmentFileType,
) {
  S3(software.amazon.awscdk.services.ecs.EnvironmentFileType.S3),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.EnvironmentFileType):
        EnvironmentFileType = when (cdkObject) {
      software.amazon.awscdk.services.ecs.EnvironmentFileType.S3 -> EnvironmentFileType.S3
    }

    internal fun unwrap(wrapped: EnvironmentFileType):
        software.amazon.awscdk.services.ecs.EnvironmentFileType = wrapped.cdkObject
  }
}
