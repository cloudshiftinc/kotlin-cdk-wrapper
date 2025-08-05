@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

public enum class Transformation(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.Transformation,
) {
  NONE(software.amazon.awscdk.services.stepfunctions.Transformation.NONE),
  COMPACT(software.amazon.awscdk.services.stepfunctions.Transformation.COMPACT),
  FLATTEN(software.amazon.awscdk.services.stepfunctions.Transformation.FLATTEN),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Transformation):
        Transformation = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.Transformation.NONE -> Transformation.NONE
      software.amazon.awscdk.services.stepfunctions.Transformation.COMPACT -> Transformation.COMPACT
      software.amazon.awscdk.services.stepfunctions.Transformation.FLATTEN -> Transformation.FLATTEN
    }

    internal fun unwrap(wrapped: Transformation):
        software.amazon.awscdk.services.stepfunctions.Transformation = wrapped.cdkObject
  }
}
