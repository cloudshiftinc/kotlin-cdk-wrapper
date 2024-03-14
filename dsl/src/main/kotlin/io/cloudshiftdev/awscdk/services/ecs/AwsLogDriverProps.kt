package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import kotlin.String
import kotlin.Unit

public interface AwsLogDriverProps {
  public fun datetimeFormat(): String? = unwrap(this).getDatetimeFormat()

  public fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

  public fun logRetention(): RetentionDays? =
      unwrap(this).getLogRetention()?.let(RetentionDays::wrap)

  public fun maxBufferSize(): Size? = unwrap(this).getMaxBufferSize()?.let(Size::wrap)

  public fun mode(): AwsLogDriverMode? = unwrap(this).getMode()?.let(AwsLogDriverMode::wrap)

  public fun multilinePattern(): String? = unwrap(this).getMultilinePattern()

  public fun streamPrefix(): String

  public interface Builder {
    public fun datetimeFormat(datetimeFormat: String) {
    }

    public fun logGroup(logGroup: ILogGroup) {
    }

    public fun logRetention(logRetention: RetentionDays) {
    }

    public fun maxBufferSize(maxBufferSize: Size) {
    }

    public fun mode(mode: AwsLogDriverMode) {
    }

    public fun multilinePattern(multilinePattern: String) {
    }

    public fun streamPrefix(streamPrefix: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.AwsLogDriverProps.Builder =
        software.amazon.awscdk.services.ecs.AwsLogDriverProps.builder()

    public override fun datetimeFormat(datetimeFormat: String) {
      cdkBuilder.datetimeFormat(datetimeFormat)
    }

    public override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    public override fun logRetention(logRetention: RetentionDays) {
      cdkBuilder.logRetention(logRetention.let(RetentionDays::unwrap))
    }

    public override fun maxBufferSize(maxBufferSize: Size) {
      cdkBuilder.maxBufferSize(maxBufferSize.let(Size::unwrap))
    }

    public override fun mode(mode: AwsLogDriverMode) {
      cdkBuilder.mode(mode.let(AwsLogDriverMode::unwrap))
    }

    public override fun multilinePattern(multilinePattern: String) {
      cdkBuilder.multilinePattern(multilinePattern)
    }

    public override fun streamPrefix(streamPrefix: String) {
      cdkBuilder.streamPrefix(streamPrefix)
    }

    public fun build(): software.amazon.awscdk.services.ecs.AwsLogDriverProps = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.AwsLogDriverProps,
  ) : AwsLogDriverProps {
    public override fun datetimeFormat(): String? = unwrap(this).getDatetimeFormat()

    public override fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

    public override fun logRetention(): RetentionDays? =
        unwrap(this).getLogRetention()?.let(RetentionDays::wrap)

    public override fun maxBufferSize(): Size? = unwrap(this).getMaxBufferSize()?.let(Size::wrap)

    public override fun mode(): AwsLogDriverMode? =
        unwrap(this).getMode()?.let(AwsLogDriverMode::wrap)

    public override fun multilinePattern(): String? = unwrap(this).getMultilinePattern()

    public override fun streamPrefix(): String = unwrap(this).getStreamPrefix()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AwsLogDriverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AwsLogDriverProps):
        AwsLogDriverProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsLogDriverProps):
        software.amazon.awscdk.services.ecs.AwsLogDriverProps = (wrapped as Wrapper).cdkObject
  }
}
