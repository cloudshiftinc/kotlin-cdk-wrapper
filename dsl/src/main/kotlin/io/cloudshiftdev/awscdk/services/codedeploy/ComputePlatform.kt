package io.cloudshiftdev.awscdk.services.codedeploy

public enum class ComputePlatform(
  private val cdkObject: software.amazon.awscdk.services.codedeploy.ComputePlatform,
) {
  SERVER(software.amazon.awscdk.services.codedeploy.ComputePlatform.SERVER),
  LAMBDA(software.amazon.awscdk.services.codedeploy.ComputePlatform.LAMBDA),
  ECS(software.amazon.awscdk.services.codedeploy.ComputePlatform.ECS),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.ComputePlatform):
        ComputePlatform = when (cdkObject) {
      software.amazon.awscdk.services.codedeploy.ComputePlatform.SERVER -> ComputePlatform.SERVER
      software.amazon.awscdk.services.codedeploy.ComputePlatform.LAMBDA -> ComputePlatform.LAMBDA
      software.amazon.awscdk.services.codedeploy.ComputePlatform.ECS -> ComputePlatform.ECS
    }

    internal fun unwrap(wrapped: ComputePlatform):
        software.amazon.awscdk.services.codedeploy.ComputePlatform = wrapped.cdkObject
  }
}
