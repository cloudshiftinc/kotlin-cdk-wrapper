package io.cloudshiftdev.awscdk.services.stepfunctions

import kotlin.Unit

public interface ProcessorConfig {
  public fun executionType(): ProcessorType? =
      unwrap(this).getExecutionType()?.let(ProcessorType::wrap)

  public fun mode(): ProcessorMode? = unwrap(this).getMode()?.let(ProcessorMode::wrap)

  public interface Builder {
    public fun executionType(executionType: ProcessorType)

    public fun mode(mode: ProcessorMode)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.ProcessorConfig.Builder =
        software.amazon.awscdk.services.stepfunctions.ProcessorConfig.builder()

    override fun executionType(executionType: ProcessorType) {
      cdkBuilder.executionType(executionType.let(ProcessorType::unwrap))
    }

    override fun mode(mode: ProcessorMode) {
      cdkBuilder.mode(mode.let(ProcessorMode::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.ProcessorConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.ProcessorConfig,
  ) : ProcessorConfig {
    override fun executionType(): ProcessorType? =
        unwrap(this).getExecutionType()?.let(ProcessorType::wrap)

    override fun mode(): ProcessorMode? = unwrap(this).getMode()?.let(ProcessorMode::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ProcessorConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ProcessorConfig):
        ProcessorConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProcessorConfig):
        software.amazon.awscdk.services.stepfunctions.ProcessorConfig = (wrapped as
        Wrapper).cdkObject
  }
}
