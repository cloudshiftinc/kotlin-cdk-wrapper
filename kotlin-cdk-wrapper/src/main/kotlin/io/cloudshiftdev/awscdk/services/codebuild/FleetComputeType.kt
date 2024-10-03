@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

public enum class FleetComputeType(
  private val cdkObject: software.amazon.awscdk.services.codebuild.FleetComputeType,
) {
  SMALL(software.amazon.awscdk.services.codebuild.FleetComputeType.SMALL),
  MEDIUM(software.amazon.awscdk.services.codebuild.FleetComputeType.MEDIUM),
  LARGE(software.amazon.awscdk.services.codebuild.FleetComputeType.LARGE),
  X_LARGE(software.amazon.awscdk.services.codebuild.FleetComputeType.X_LARGE),
  X2_LARGE(software.amazon.awscdk.services.codebuild.FleetComputeType.X2_LARGE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.FleetComputeType):
        FleetComputeType = when (cdkObject) {
      software.amazon.awscdk.services.codebuild.FleetComputeType.SMALL -> FleetComputeType.SMALL
      software.amazon.awscdk.services.codebuild.FleetComputeType.MEDIUM -> FleetComputeType.MEDIUM
      software.amazon.awscdk.services.codebuild.FleetComputeType.LARGE -> FleetComputeType.LARGE
      software.amazon.awscdk.services.codebuild.FleetComputeType.X_LARGE -> FleetComputeType.X_LARGE
      software.amazon.awscdk.services.codebuild.FleetComputeType.X2_LARGE ->
          FleetComputeType.X2_LARGE
    }

    internal fun unwrap(wrapped: FleetComputeType):
        software.amazon.awscdk.services.codebuild.FleetComputeType = wrapped.cdkObject
  }
}
