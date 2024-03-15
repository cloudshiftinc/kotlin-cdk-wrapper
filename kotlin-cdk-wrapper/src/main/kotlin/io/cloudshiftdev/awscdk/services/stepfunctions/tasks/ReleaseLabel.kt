@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * The Amazon EMR release version to use for the job run.
 *
 * Can be extended to include new EMR releases
 *
 * For example, `new ReleaseLabel('emr-x.xx.x-latest');`
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
public open class ReleaseLabel internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel,
) : CdkObject(cdkObject) {
  /**
   * A literal string that contains the release-version ex.
   *
   * 'emr-x.x.x-latest'
   */
  public open fun label(): String = unwrap(this).getLabel()

  public companion object {
    public val EMR_5_32_0: ReleaseLabel =
        ReleaseLabel.wrap(software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel.EMR_5_32_0)

    public val EMR_5_33_0: ReleaseLabel =
        ReleaseLabel.wrap(software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel.EMR_5_33_0)

    public val EMR_6_2_0: ReleaseLabel =
        ReleaseLabel.wrap(software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel.EMR_6_2_0)

    public val EMR_6_3_0: ReleaseLabel =
        ReleaseLabel.wrap(software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel.EMR_6_3_0)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel):
        ReleaseLabel = ReleaseLabel(cdkObject)

    internal fun unwrap(wrapped: ReleaseLabel):
        software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel = wrapped.cdkObject
  }
}
