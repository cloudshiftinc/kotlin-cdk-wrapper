@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

public enum class WindowsImageType(
  private val cdkObject: software.amazon.awscdk.services.codebuild.WindowsImageType,
) {
  STANDARD(software.amazon.awscdk.services.codebuild.WindowsImageType.STANDARD),
  SERVER_2019(software.amazon.awscdk.services.codebuild.WindowsImageType.SERVER_2019),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.WindowsImageType):
        WindowsImageType = when (cdkObject) {
      software.amazon.awscdk.services.codebuild.WindowsImageType.STANDARD ->
          WindowsImageType.STANDARD
      software.amazon.awscdk.services.codebuild.WindowsImageType.SERVER_2019 ->
          WindowsImageType.SERVER_2019
    }

    internal fun unwrap(wrapped: WindowsImageType):
        software.amazon.awscdk.services.codebuild.WindowsImageType = wrapped.cdkObject
  }
}
