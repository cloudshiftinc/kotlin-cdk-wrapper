package io.cloudshiftdev.awscdk.services.eks

public enum class DefaultCapacityType(
  private val cdkObject: software.amazon.awscdk.services.eks.DefaultCapacityType,
) {
  NODEGROUP(software.amazon.awscdk.services.eks.DefaultCapacityType.NODEGROUP),
  EC2(software.amazon.awscdk.services.eks.DefaultCapacityType.EC2),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.DefaultCapacityType):
        DefaultCapacityType = when (cdkObject) {
      software.amazon.awscdk.services.eks.DefaultCapacityType.NODEGROUP ->
          DefaultCapacityType.NODEGROUP
      software.amazon.awscdk.services.eks.DefaultCapacityType.EC2 -> DefaultCapacityType.EC2
    }

    internal fun unwrap(wrapped: DefaultCapacityType):
        software.amazon.awscdk.services.eks.DefaultCapacityType = wrapped.cdkObject
  }
}
