@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * The type of predefined worker that is allocated when a job runs.
 *
 * If you need to use a WorkerTypeV2 that doesn't exist as a static member, you
 * can instantiate a `WorkerTypeV2` object, e.g: `WorkerTypeV2.of('other type')`.
 *
 * Example:
 *
 * ```
 * GlueStartJobRun.Builder.create(this, "Task")
 * .glueJobName("my-glue-job")
 * .workerConfiguration(WorkerConfigurationProperty.builder()
 * .workerTypeV2(WorkerTypeV2.G_1X) // Worker type
 * .numberOfWorkers(2)
 * .build())
 * .build();
 * ```
 */
public open class WorkerTypeV2(
  cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.WorkerTypeV2,
) : CdkObject(cdkObject) {
  /**
   * The name of this WorkerType, as expected by Job resource.
   */
  public open fun name(): String = unwrap(this).getName()

  public companion object {
    public val G_025_X: WorkerTypeV2 =
        WorkerTypeV2.wrap(software.amazon.awscdk.services.stepfunctions.tasks.WorkerTypeV2.G_025_X)

    public val G_1_X: WorkerTypeV2 =
        WorkerTypeV2.wrap(software.amazon.awscdk.services.stepfunctions.tasks.WorkerTypeV2.G_1_X)

    public val G_2_X: WorkerTypeV2 =
        WorkerTypeV2.wrap(software.amazon.awscdk.services.stepfunctions.tasks.WorkerTypeV2.G_2_X)

    public val G_4_X: WorkerTypeV2 =
        WorkerTypeV2.wrap(software.amazon.awscdk.services.stepfunctions.tasks.WorkerTypeV2.G_4_X)

    public val G_8_X: WorkerTypeV2 =
        WorkerTypeV2.wrap(software.amazon.awscdk.services.stepfunctions.tasks.WorkerTypeV2.G_8_X)

    public val STANDARD: WorkerTypeV2 =
        WorkerTypeV2.wrap(software.amazon.awscdk.services.stepfunctions.tasks.WorkerTypeV2.STANDARD)

    public val Z_2_X: WorkerTypeV2 =
        WorkerTypeV2.wrap(software.amazon.awscdk.services.stepfunctions.tasks.WorkerTypeV2.Z_2_X)

    public fun of(workerType: String): WorkerTypeV2 =
        software.amazon.awscdk.services.stepfunctions.tasks.WorkerTypeV2.of(workerType).let(WorkerTypeV2::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.WorkerTypeV2):
        WorkerTypeV2 = WorkerTypeV2(cdkObject)

    internal fun unwrap(wrapped: WorkerTypeV2):
        software.amazon.awscdk.services.stepfunctions.tasks.WorkerTypeV2 = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.WorkerTypeV2
  }
}
