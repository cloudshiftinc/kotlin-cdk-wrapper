package io.cloudshiftdev.awscdk.services.fsx

public enum class LustreDeploymentType(
  private val cdkObject: software.amazon.awscdk.services.fsx.LustreDeploymentType,
) {
  SCRATCH_1(software.amazon.awscdk.services.fsx.LustreDeploymentType.SCRATCH_1),
  SCRATCH_2(software.amazon.awscdk.services.fsx.LustreDeploymentType.SCRATCH_2),
  PERSISTENT_1(software.amazon.awscdk.services.fsx.LustreDeploymentType.PERSISTENT_1),
  PERSISTENT_2(software.amazon.awscdk.services.fsx.LustreDeploymentType.PERSISTENT_2),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.LustreDeploymentType):
        LustreDeploymentType = when (cdkObject) {
      software.amazon.awscdk.services.fsx.LustreDeploymentType.SCRATCH_1 ->
          LustreDeploymentType.SCRATCH_1
      software.amazon.awscdk.services.fsx.LustreDeploymentType.SCRATCH_2 ->
          LustreDeploymentType.SCRATCH_2
      software.amazon.awscdk.services.fsx.LustreDeploymentType.PERSISTENT_1 ->
          LustreDeploymentType.PERSISTENT_1
      software.amazon.awscdk.services.fsx.LustreDeploymentType.PERSISTENT_2 ->
          LustreDeploymentType.PERSISTENT_2
    }

    internal fun unwrap(wrapped: LustreDeploymentType):
        software.amazon.awscdk.services.fsx.LustreDeploymentType = wrapped.cdkObject
  }
}
