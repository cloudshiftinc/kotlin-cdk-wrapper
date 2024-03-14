package io.cloudshiftdev.awscdk.services.rds

public enum class InstanceUpdateBehaviour(
  private val cdkObject: software.amazon.awscdk.services.rds.InstanceUpdateBehaviour,
) {
  BULK(software.amazon.awscdk.services.rds.InstanceUpdateBehaviour.BULK),
  ROLLING(software.amazon.awscdk.services.rds.InstanceUpdateBehaviour.ROLLING),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.InstanceUpdateBehaviour):
        InstanceUpdateBehaviour = when (cdkObject) {
      software.amazon.awscdk.services.rds.InstanceUpdateBehaviour.BULK ->
          InstanceUpdateBehaviour.BULK
      software.amazon.awscdk.services.rds.InstanceUpdateBehaviour.ROLLING ->
          InstanceUpdateBehaviour.ROLLING
    }

    internal fun unwrap(wrapped: InstanceUpdateBehaviour):
        software.amazon.awscdk.services.rds.InstanceUpdateBehaviour = wrapped.cdkObject
  }
}
