package io.cloudshiftdev.awscdk.services.ec2

public enum class PlacementGroupSpreadLevel(
  private val cdkObject: software.amazon.awscdk.services.ec2.PlacementGroupSpreadLevel,
) {
  HOST(software.amazon.awscdk.services.ec2.PlacementGroupSpreadLevel.HOST),
  RACK(software.amazon.awscdk.services.ec2.PlacementGroupSpreadLevel.RACK),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.PlacementGroupSpreadLevel):
        PlacementGroupSpreadLevel = when (cdkObject) {
      software.amazon.awscdk.services.ec2.PlacementGroupSpreadLevel.HOST ->
          PlacementGroupSpreadLevel.HOST
      software.amazon.awscdk.services.ec2.PlacementGroupSpreadLevel.RACK ->
          PlacementGroupSpreadLevel.RACK
    }

    internal fun unwrap(wrapped: PlacementGroupSpreadLevel):
        software.amazon.awscdk.services.ec2.PlacementGroupSpreadLevel = wrapped.cdkObject
  }
}
