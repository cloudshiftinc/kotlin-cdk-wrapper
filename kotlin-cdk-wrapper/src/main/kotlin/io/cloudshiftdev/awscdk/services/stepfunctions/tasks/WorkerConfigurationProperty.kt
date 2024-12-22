@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Deprecated
import kotlin.Number
import kotlin.Unit

/**
 * Properties for the worker configuration.
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
public interface WorkerConfigurationProperty {
  /**
   * The number of workers of a defined `WorkerType` that are allocated when a job runs.
   */
  public fun numberOfWorkers(): Number

  /**
   * (deprecated) The type of predefined worker that is allocated when a job runs.
   *
   * Default: - must choose one of `workerType` or `workerTypeV2`
   *
   * @deprecated Use `workerTypeV2` for more flexibility in defining worker types.
   */
  @Deprecated(message = "deprecated in CDK")
  public fun workerType(): WorkerType? = unwrap(this).getWorkerType()?.let(WorkerType::wrap)

  /**
   * The type of predefined worker that is allocated when a job runs.
   *
   * Can be one of the
   * predefined values or dynamic values using `WorkerTypeV2.of(...)`.
   *
   * Default: - must choose one of `workerType` or `workerTypeV2`
   */
  public fun workerTypeV2(): WorkerTypeV2? = unwrap(this).getWorkerTypeV2()?.let(WorkerTypeV2::wrap)

  /**
   * A builder for [WorkerConfigurationProperty]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param numberOfWorkers The number of workers of a defined `WorkerType` that are allocated
     * when a job runs. 
     */
    public fun numberOfWorkers(numberOfWorkers: Number)

    /**
     * @param workerType The type of predefined worker that is allocated when a job runs.
     * @deprecated Use `workerTypeV2` for more flexibility in defining worker types.
     */
    @Deprecated(message = "deprecated in CDK")
    public fun workerType(workerType: WorkerType)

    /**
     * @param workerTypeV2 The type of predefined worker that is allocated when a job runs.
     * Can be one of the
     * predefined values or dynamic values using `WorkerTypeV2.of(...)`.
     */
    public fun workerTypeV2(workerTypeV2: WorkerTypeV2)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.WorkerConfigurationProperty.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.WorkerConfigurationProperty.builder()

    /**
     * @param numberOfWorkers The number of workers of a defined `WorkerType` that are allocated
     * when a job runs. 
     */
    override fun numberOfWorkers(numberOfWorkers: Number) {
      cdkBuilder.numberOfWorkers(numberOfWorkers)
    }

    /**
     * @param workerType The type of predefined worker that is allocated when a job runs.
     * @deprecated Use `workerTypeV2` for more flexibility in defining worker types.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun workerType(workerType: WorkerType) {
      cdkBuilder.workerType(workerType.let(WorkerType.Companion::unwrap))
    }

    /**
     * @param workerTypeV2 The type of predefined worker that is allocated when a job runs.
     * Can be one of the
     * predefined values or dynamic values using `WorkerTypeV2.of(...)`.
     */
    override fun workerTypeV2(workerTypeV2: WorkerTypeV2) {
      cdkBuilder.workerTypeV2(workerTypeV2.let(WorkerTypeV2.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.WorkerConfigurationProperty =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.WorkerConfigurationProperty,
  ) : CdkObject(cdkObject),
      WorkerConfigurationProperty {
    /**
     * The number of workers of a defined `WorkerType` that are allocated when a job runs.
     */
    override fun numberOfWorkers(): Number = unwrap(this).getNumberOfWorkers()

    /**
     * (deprecated) The type of predefined worker that is allocated when a job runs.
     *
     * Default: - must choose one of `workerType` or `workerTypeV2`
     *
     * @deprecated Use `workerTypeV2` for more flexibility in defining worker types.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun workerType(): WorkerType? = unwrap(this).getWorkerType()?.let(WorkerType::wrap)

    /**
     * The type of predefined worker that is allocated when a job runs.
     *
     * Can be one of the
     * predefined values or dynamic values using `WorkerTypeV2.of(...)`.
     *
     * Default: - must choose one of `workerType` or `workerTypeV2`
     */
    override fun workerTypeV2(): WorkerTypeV2? =
        unwrap(this).getWorkerTypeV2()?.let(WorkerTypeV2::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WorkerConfigurationProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.WorkerConfigurationProperty):
        WorkerConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
        WorkerConfigurationProperty ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: WorkerConfigurationProperty):
        software.amazon.awscdk.services.stepfunctions.tasks.WorkerConfigurationProperty = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.WorkerConfigurationProperty
  }
}
