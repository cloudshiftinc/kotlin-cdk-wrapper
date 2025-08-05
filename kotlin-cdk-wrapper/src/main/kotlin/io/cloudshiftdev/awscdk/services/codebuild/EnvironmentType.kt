@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

public enum class EnvironmentType(
  private val cdkObject: software.amazon.awscdk.services.codebuild.EnvironmentType,
) {
  ARM_CONTAINER(software.amazon.awscdk.services.codebuild.EnvironmentType.ARM_CONTAINER),
  LINUX_CONTAINER(software.amazon.awscdk.services.codebuild.EnvironmentType.LINUX_CONTAINER),
  LINUX_GPU_CONTAINER(software.amazon.awscdk.services.codebuild.EnvironmentType.LINUX_GPU_CONTAINER),
  WINDOWS_SERVER_2019_CONTAINER(software.amazon.awscdk.services.codebuild.EnvironmentType.WINDOWS_SERVER_2019_CONTAINER),
  WINDOWS_SERVER_2022_CONTAINER(software.amazon.awscdk.services.codebuild.EnvironmentType.WINDOWS_SERVER_2022_CONTAINER),
  MAC_ARM(software.amazon.awscdk.services.codebuild.EnvironmentType.MAC_ARM),
  LINUX_EC2(software.amazon.awscdk.services.codebuild.EnvironmentType.LINUX_EC2),
  ARM_EC2(software.amazon.awscdk.services.codebuild.EnvironmentType.ARM_EC2),
  WINDOWS_EC2(software.amazon.awscdk.services.codebuild.EnvironmentType.WINDOWS_EC2),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.EnvironmentType):
        EnvironmentType = when (cdkObject) {
      software.amazon.awscdk.services.codebuild.EnvironmentType.ARM_CONTAINER ->
          EnvironmentType.ARM_CONTAINER
      software.amazon.awscdk.services.codebuild.EnvironmentType.LINUX_CONTAINER ->
          EnvironmentType.LINUX_CONTAINER
      software.amazon.awscdk.services.codebuild.EnvironmentType.LINUX_GPU_CONTAINER ->
          EnvironmentType.LINUX_GPU_CONTAINER
      software.amazon.awscdk.services.codebuild.EnvironmentType.WINDOWS_SERVER_2019_CONTAINER ->
          EnvironmentType.WINDOWS_SERVER_2019_CONTAINER
      software.amazon.awscdk.services.codebuild.EnvironmentType.WINDOWS_SERVER_2022_CONTAINER ->
          EnvironmentType.WINDOWS_SERVER_2022_CONTAINER
      software.amazon.awscdk.services.codebuild.EnvironmentType.MAC_ARM -> EnvironmentType.MAC_ARM
      software.amazon.awscdk.services.codebuild.EnvironmentType.LINUX_EC2 ->
          EnvironmentType.LINUX_EC2
      software.amazon.awscdk.services.codebuild.EnvironmentType.ARM_EC2 -> EnvironmentType.ARM_EC2
      software.amazon.awscdk.services.codebuild.EnvironmentType.WINDOWS_EC2 ->
          EnvironmentType.WINDOWS_EC2
    }

    internal fun unwrap(wrapped: EnvironmentType):
        software.amazon.awscdk.services.codebuild.EnvironmentType = wrapped.cdkObject
  }
}
