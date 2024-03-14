package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import kotlin.String
import kotlin.Unit

public interface SparkSubmitJobDriver {
  public fun entryPoint(): TaskInput

  public fun entryPointArguments(): TaskInput? =
      unwrap(this).getEntryPointArguments()?.let(TaskInput::wrap)

  public fun sparkSubmitParameters(): String? = unwrap(this).getSparkSubmitParameters()

  public interface Builder {
    public fun entryPoint(entryPoint: TaskInput) {
    }

    public fun entryPointArguments(entryPointArguments: TaskInput) {
    }

    public fun sparkSubmitParameters(sparkSubmitParameters: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver.builder()

    public override fun entryPoint(entryPoint: TaskInput) {
      cdkBuilder.entryPoint(entryPoint.let(TaskInput::unwrap))
    }

    public override fun entryPointArguments(entryPointArguments: TaskInput) {
      cdkBuilder.entryPointArguments(entryPointArguments.let(TaskInput::unwrap))
    }

    public override fun sparkSubmitParameters(sparkSubmitParameters: String) {
      cdkBuilder.sparkSubmitParameters(sparkSubmitParameters)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver,
  ) : SparkSubmitJobDriver {
    public override fun entryPoint(): TaskInput = unwrap(this).getEntryPoint().let(TaskInput::wrap)

    public override fun entryPointArguments(): TaskInput? =
        unwrap(this).getEntryPointArguments()?.let(TaskInput::wrap)

    public override fun sparkSubmitParameters(): String? = unwrap(this).getSparkSubmitParameters()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SparkSubmitJobDriver {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver):
        SparkSubmitJobDriver = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SparkSubmitJobDriver):
        software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver = (wrapped as
        Wrapper).cdkObject
  }
}
