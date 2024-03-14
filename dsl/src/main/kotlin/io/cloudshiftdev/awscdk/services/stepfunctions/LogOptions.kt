package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import kotlin.Boolean
import kotlin.Unit

public interface LogOptions {
  public fun destination(): ILogGroup

  public fun includeExecutionData(): Boolean? = unwrap(this).getIncludeExecutionData()

  public fun level(): LogLevel? = unwrap(this).getLevel()?.let(LogLevel::wrap)

  public interface Builder {
    public fun destination(destination: ILogGroup) {
    }

    public fun includeExecutionData(includeExecutionData: Boolean) {
    }

    public fun level(level: LogLevel) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.LogOptions.Builder =
        software.amazon.awscdk.services.stepfunctions.LogOptions.builder()

    public override fun destination(destination: ILogGroup) {
      cdkBuilder.destination(destination.let(ILogGroup::unwrap))
    }

    public override fun includeExecutionData(includeExecutionData: Boolean) {
      cdkBuilder.includeExecutionData(includeExecutionData)
    }

    public override fun level(level: LogLevel) {
      cdkBuilder.level(level.let(LogLevel::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.LogOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.LogOptions,
  ) : LogOptions {
    public override fun destination(): ILogGroup =
        unwrap(this).getDestination().let(ILogGroup::wrap)

    public override fun includeExecutionData(): Boolean? = unwrap(this).getIncludeExecutionData()

    public override fun level(): LogLevel? = unwrap(this).getLevel()?.let(LogLevel::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LogOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.LogOptions):
        LogOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogOptions):
        software.amazon.awscdk.services.stepfunctions.LogOptions = (wrapped as Wrapper).cdkObject
  }
}
