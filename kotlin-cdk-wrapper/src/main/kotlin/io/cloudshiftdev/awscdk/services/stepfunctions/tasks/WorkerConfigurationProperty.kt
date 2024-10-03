@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
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
 * .workerType(WorkerType.G_1X) // Worker type
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
   * The type of predefined worker that is allocated when a job runs.
   */
  public fun workerType(): WorkerType

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
     */
    public fun workerType(workerType: WorkerType)
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
     */
    override fun workerType(workerType: WorkerType) {
      cdkBuilder.workerType(workerType.let(WorkerType.Companion::unwrap))
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
     * The type of predefined worker that is allocated when a job runs.
     */
    override fun workerType(): WorkerType = unwrap(this).getWorkerType().let(WorkerType::wrap)
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
