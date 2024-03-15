@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

public enum class OutOfInfrequentAccessPolicy(
  private val cdkObject: software.amazon.awscdk.services.efs.OutOfInfrequentAccessPolicy,
) {
  AFTER_1_ACCESS(software.amazon.awscdk.services.efs.OutOfInfrequentAccessPolicy.AFTER_1_ACCESS),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.OutOfInfrequentAccessPolicy):
        OutOfInfrequentAccessPolicy = when (cdkObject) {
      software.amazon.awscdk.services.efs.OutOfInfrequentAccessPolicy.AFTER_1_ACCESS ->
          OutOfInfrequentAccessPolicy.AFTER_1_ACCESS
    }

    internal fun unwrap(wrapped: OutOfInfrequentAccessPolicy):
        software.amazon.awscdk.services.efs.OutOfInfrequentAccessPolicy = wrapped.cdkObject
  }
}
