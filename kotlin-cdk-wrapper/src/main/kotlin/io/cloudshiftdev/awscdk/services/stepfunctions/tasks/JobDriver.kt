@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Specify the driver that the EMR Containers job runs on.
 *
 * The job driver is used to provide an input for the job that will be run.
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
public interface JobDriver {
  /**
   * The job driver parameters specified for spark submit.
   *
   * [Documentation](https://docs.aws.amazon.com/emr-on-eks/latest/APIReference/API_SparkSubmitJobDriver.html)
   */
  public fun sparkSubmitJobDriver(): SparkSubmitJobDriver

  /**
   * A builder for [JobDriver]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param sparkSubmitJobDriver The job driver parameters specified for spark submit. 
     */
    public fun sparkSubmitJobDriver(sparkSubmitJobDriver: SparkSubmitJobDriver)

    /**
     * @param sparkSubmitJobDriver The job driver parameters specified for spark submit. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd65666a6cd5e8d0877bea883bee5e98c04d753bb31b5c14947f8ae7155c0061")
    public fun sparkSubmitJobDriver(sparkSubmitJobDriver: SparkSubmitJobDriver.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.tasks.JobDriver.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.JobDriver.builder()

    /**
     * @param sparkSubmitJobDriver The job driver parameters specified for spark submit. 
     */
    override fun sparkSubmitJobDriver(sparkSubmitJobDriver: SparkSubmitJobDriver) {
      cdkBuilder.sparkSubmitJobDriver(sparkSubmitJobDriver.let(SparkSubmitJobDriver::unwrap))
    }

    /**
     * @param sparkSubmitJobDriver The job driver parameters specified for spark submit. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd65666a6cd5e8d0877bea883bee5e98c04d753bb31b5c14947f8ae7155c0061")
    override
        fun sparkSubmitJobDriver(sparkSubmitJobDriver: SparkSubmitJobDriver.Builder.() -> Unit):
        Unit = sparkSubmitJobDriver(SparkSubmitJobDriver(sparkSubmitJobDriver))

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.JobDriver =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.JobDriver,
  ) : CdkObject(cdkObject), JobDriver {
    /**
     * The job driver parameters specified for spark submit.
     *
     * [Documentation](https://docs.aws.amazon.com/emr-on-eks/latest/APIReference/API_SparkSubmitJobDriver.html)
     */
    override fun sparkSubmitJobDriver(): SparkSubmitJobDriver =
        unwrap(this).getSparkSubmitJobDriver().let(SparkSubmitJobDriver::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): JobDriver {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.JobDriver):
        JobDriver = CdkObjectWrappers.wrap(cdkObject) as? JobDriver ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: JobDriver):
        software.amazon.awscdk.services.stepfunctions.tasks.JobDriver = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.JobDriver
  }
}
