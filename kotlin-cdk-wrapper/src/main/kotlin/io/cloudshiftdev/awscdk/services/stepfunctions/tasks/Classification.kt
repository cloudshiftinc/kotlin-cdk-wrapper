@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * The classification within a EMR Containers application configuration.
 *
 * Class can be extended to add other classifications.
 * For example, new Classification('xxx-yyy');
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
public open class Classification internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.Classification,
) : CdkObject(cdkObject) {
  public constructor(classificationStatement: String) :
      this(software.amazon.awscdk.services.stepfunctions.tasks.Classification(classificationStatement))

  /**
   * A literal string in case a new EMR classification is released, if not already defined.
   */
  public open fun classificationStatement(): String = unwrap(this).getClassificationStatement()

  public companion object {
    public val SPARK: Classification =
        Classification.wrap(software.amazon.awscdk.services.stepfunctions.tasks.Classification.SPARK)

    public val SPARK_DEFAULTS: Classification =
        Classification.wrap(software.amazon.awscdk.services.stepfunctions.tasks.Classification.SPARK_DEFAULTS)

    public val SPARK_ENV: Classification =
        Classification.wrap(software.amazon.awscdk.services.stepfunctions.tasks.Classification.SPARK_ENV)

    public val SPARK_HIVE_SITE: Classification =
        Classification.wrap(software.amazon.awscdk.services.stepfunctions.tasks.Classification.SPARK_HIVE_SITE)

    public val SPARK_LOG4_J: Classification =
        Classification.wrap(software.amazon.awscdk.services.stepfunctions.tasks.Classification.SPARK_LOG4_J)

    public val SPARK_METRICS: Classification =
        Classification.wrap(software.amazon.awscdk.services.stepfunctions.tasks.Classification.SPARK_METRICS)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.Classification):
        Classification = Classification(cdkObject)

    internal fun unwrap(wrapped: Classification):
        software.amazon.awscdk.services.stepfunctions.tasks.Classification = wrapped.cdkObject
  }
}
