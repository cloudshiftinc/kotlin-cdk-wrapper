package io.cloudshiftdev.awscdk.services.ec2

public enum class PlacementGroupStrategy(
  private val cdkObject: software.amazon.awscdk.services.ec2.PlacementGroupStrategy,
) {
  CLUSTER(software.amazon.awscdk.services.ec2.PlacementGroupStrategy.CLUSTER),
  PARTITION(software.amazon.awscdk.services.ec2.PlacementGroupStrategy.PARTITION),
  SPREAD(software.amazon.awscdk.services.ec2.PlacementGroupStrategy.SPREAD),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.PlacementGroupStrategy):
        PlacementGroupStrategy = when (cdkObject) {
      software.amazon.awscdk.services.ec2.PlacementGroupStrategy.CLUSTER ->
          PlacementGroupStrategy.CLUSTER
      software.amazon.awscdk.services.ec2.PlacementGroupStrategy.PARTITION ->
          PlacementGroupStrategy.PARTITION
      software.amazon.awscdk.services.ec2.PlacementGroupStrategy.SPREAD ->
          PlacementGroupStrategy.SPREAD
    }

    internal fun unwrap(wrapped: PlacementGroupStrategy):
        software.amazon.awscdk.services.ec2.PlacementGroupStrategy = wrapped.cdkObject
  }
}
