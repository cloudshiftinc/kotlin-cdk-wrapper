@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

public enum class LoadBalancerGeneration(
  private val cdkObject: software.amazon.awscdk.services.codedeploy.LoadBalancerGeneration,
) {
  FIRST(software.amazon.awscdk.services.codedeploy.LoadBalancerGeneration.FIRST),
  SECOND(software.amazon.awscdk.services.codedeploy.LoadBalancerGeneration.SECOND),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.LoadBalancerGeneration):
        LoadBalancerGeneration = when (cdkObject) {
      software.amazon.awscdk.services.codedeploy.LoadBalancerGeneration.FIRST ->
          LoadBalancerGeneration.FIRST
      software.amazon.awscdk.services.codedeploy.LoadBalancerGeneration.SECOND ->
          LoadBalancerGeneration.SECOND
    }

    internal fun unwrap(wrapped: LoadBalancerGeneration):
        software.amazon.awscdk.services.codedeploy.LoadBalancerGeneration = wrapped.cdkObject
  }
}
