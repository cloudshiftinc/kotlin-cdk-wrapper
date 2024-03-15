@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import kotlin.String

/**
 * Class that returns a virtual cluster's id depending on input type.
 *
 * Example:
 *
 * ```
 * EmrContainersStartJobRun.Builder.create(this, "EMR Containers Start Job Run")
 * .virtualCluster(VirtualClusterInput.fromVirtualClusterId("de92jdei2910fwedz"))
 * .releaseLabel(ReleaseLabel.EMR_6_2_0)
 * .jobName("EMR-Containers-Job")
 * .jobDriver(JobDriver.builder()
 * .sparkSubmitJobDriver(SparkSubmitJobDriver.builder()
 * .entryPoint(TaskInput.fromText("local:///usr/lib/spark/examples/src/main/python/pi.py"))
 * .build())
 * .build())
 * .applicationConfig(List.of(ApplicationConfiguration.builder()
 * .classification(Classification.SPARK_DEFAULTS)
 * .properties(Map.of(
 * "spark.executor.instances", "1",
 * "spark.executor.memory", "512M"))
 * .build()))
 * .build();
 * ```
 */
public open class VirtualClusterInput internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.VirtualClusterInput,
) : CdkObject(cdkObject) {
  /**
   * The VirtualCluster Id.
   */
  public open fun id(): String = unwrap(this).getId()

  public companion object {
    public fun fromTaskInput(taskInput: TaskInput): VirtualClusterInput =
        software.amazon.awscdk.services.stepfunctions.tasks.VirtualClusterInput.fromTaskInput(taskInput.let(TaskInput::unwrap)).let(VirtualClusterInput::wrap)

    public fun fromVirtualClusterId(virtualClusterId: String): VirtualClusterInput =
        software.amazon.awscdk.services.stepfunctions.tasks.VirtualClusterInput.fromVirtualClusterId(virtualClusterId).let(VirtualClusterInput::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.VirtualClusterInput):
        VirtualClusterInput = VirtualClusterInput(cdkObject)

    internal fun unwrap(wrapped: VirtualClusterInput):
        software.amazon.awscdk.services.stepfunctions.tasks.VirtualClusterInput = wrapped.cdkObject
  }
}
