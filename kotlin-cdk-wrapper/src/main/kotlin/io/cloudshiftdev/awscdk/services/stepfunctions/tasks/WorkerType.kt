@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public enum class WorkerType(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.WorkerType,
) {
  STANDARD(software.amazon.awscdk.services.stepfunctions.tasks.WorkerType.STANDARD),
  G_025X(software.amazon.awscdk.services.stepfunctions.tasks.WorkerType.G_025X),
  G_1X(software.amazon.awscdk.services.stepfunctions.tasks.WorkerType.G_1X),
  G_2X(software.amazon.awscdk.services.stepfunctions.tasks.WorkerType.G_2X),
  G_4X(software.amazon.awscdk.services.stepfunctions.tasks.WorkerType.G_4X),
  G_8X(software.amazon.awscdk.services.stepfunctions.tasks.WorkerType.G_8X),
  Z_2X(software.amazon.awscdk.services.stepfunctions.tasks.WorkerType.Z_2X),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.WorkerType):
        WorkerType = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.tasks.WorkerType.STANDARD -> WorkerType.STANDARD
      software.amazon.awscdk.services.stepfunctions.tasks.WorkerType.G_025X -> WorkerType.G_025X
      software.amazon.awscdk.services.stepfunctions.tasks.WorkerType.G_1X -> WorkerType.G_1X
      software.amazon.awscdk.services.stepfunctions.tasks.WorkerType.G_2X -> WorkerType.G_2X
      software.amazon.awscdk.services.stepfunctions.tasks.WorkerType.G_4X -> WorkerType.G_4X
      software.amazon.awscdk.services.stepfunctions.tasks.WorkerType.G_8X -> WorkerType.G_8X
      software.amazon.awscdk.services.stepfunctions.tasks.WorkerType.Z_2X -> WorkerType.Z_2X
    }

    internal fun unwrap(wrapped: WorkerType):
        software.amazon.awscdk.services.stepfunctions.tasks.WorkerType = wrapped.cdkObject
  }
}
