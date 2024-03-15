@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import kotlin.String
import kotlin.Unit

public interface SparkSubmitJobDriver {
  public fun entryPoint(): TaskInput

  public fun entryPointArguments(): TaskInput? =
      unwrap(this).getEntryPointArguments()?.let(TaskInput::wrap)

  public fun sparkSubmitParameters(): String? = unwrap(this).getSparkSubmitParameters()

  @CdkDslMarker
  public interface Builder {
    public fun entryPoint(entryPoint: TaskInput)

    public fun entryPointArguments(entryPointArguments: TaskInput)

    public fun sparkSubmitParameters(sparkSubmitParameters: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver.builder()

    override fun entryPoint(entryPoint: TaskInput) {
      cdkBuilder.entryPoint(entryPoint.let(TaskInput::unwrap))
    }

    override fun entryPointArguments(entryPointArguments: TaskInput) {
      cdkBuilder.entryPointArguments(entryPointArguments.let(TaskInput::unwrap))
    }

    override fun sparkSubmitParameters(sparkSubmitParameters: String) {
      cdkBuilder.sparkSubmitParameters(sparkSubmitParameters)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver,
  ) : CdkObject(cdkObject), SparkSubmitJobDriver {
    override fun entryPoint(): TaskInput = unwrap(this).getEntryPoint().let(TaskInput::wrap)

    override fun entryPointArguments(): TaskInput? =
        unwrap(this).getEntryPointArguments()?.let(TaskInput::wrap)

    override fun sparkSubmitParameters(): String? = unwrap(this).getSparkSubmitParameters()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SparkSubmitJobDriver {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver):
        SparkSubmitJobDriver = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SparkSubmitJobDriver):
        software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver
  }
}
