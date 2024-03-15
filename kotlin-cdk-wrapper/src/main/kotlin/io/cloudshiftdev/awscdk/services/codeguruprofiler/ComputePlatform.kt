@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codeguruprofiler

public enum class ComputePlatform(
  private val cdkObject: software.amazon.awscdk.services.codeguruprofiler.ComputePlatform,
) {
  AWS_LAMBDA(software.amazon.awscdk.services.codeguruprofiler.ComputePlatform.AWS_LAMBDA),
  DEFAULT(software.amazon.awscdk.services.codeguruprofiler.ComputePlatform.DEFAULT),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codeguruprofiler.ComputePlatform):
        ComputePlatform = when (cdkObject) {
      software.amazon.awscdk.services.codeguruprofiler.ComputePlatform.AWS_LAMBDA ->
          ComputePlatform.AWS_LAMBDA
      software.amazon.awscdk.services.codeguruprofiler.ComputePlatform.DEFAULT ->
          ComputePlatform.DEFAULT
    }

    internal fun unwrap(wrapped: ComputePlatform):
        software.amazon.awscdk.services.codeguruprofiler.ComputePlatform = wrapped.cdkObject
  }
}
