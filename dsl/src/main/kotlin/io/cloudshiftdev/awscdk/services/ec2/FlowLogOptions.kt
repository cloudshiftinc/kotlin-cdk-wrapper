package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Unit
import kotlin.collections.List

public interface FlowLogOptions {
  public fun destination(): FlowLogDestination? =
      unwrap(this).getDestination()?.let(FlowLogDestination::wrap)

  public fun logFormat(): List<LogFormat> = unwrap(this).getLogFormat()?.map(LogFormat::wrap) ?:
      emptyList()

  public fun maxAggregationInterval(): FlowLogMaxAggregationInterval? =
      unwrap(this).getMaxAggregationInterval()?.let(FlowLogMaxAggregationInterval::wrap)

  public fun trafficType(): FlowLogTrafficType? =
      unwrap(this).getTrafficType()?.let(FlowLogTrafficType::wrap)

  public interface Builder {
    public fun destination(destination: FlowLogDestination)

    public fun logFormat(logFormat: List<LogFormat>)

    public fun logFormat(vararg logFormat: LogFormat)

    public fun maxAggregationInterval(maxAggregationInterval: FlowLogMaxAggregationInterval)

    public fun trafficType(trafficType: FlowLogTrafficType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.FlowLogOptions.Builder =
        software.amazon.awscdk.services.ec2.FlowLogOptions.builder()

    override fun destination(destination: FlowLogDestination) {
      cdkBuilder.destination(destination.let(FlowLogDestination::unwrap))
    }

    override fun logFormat(logFormat: List<LogFormat>) {
      cdkBuilder.logFormat(logFormat.map(LogFormat::unwrap))
    }

    override fun logFormat(vararg logFormat: LogFormat): Unit = logFormat(logFormat.toList())

    override fun maxAggregationInterval(maxAggregationInterval: FlowLogMaxAggregationInterval) {
      cdkBuilder.maxAggregationInterval(maxAggregationInterval.let(FlowLogMaxAggregationInterval::unwrap))
    }

    override fun trafficType(trafficType: FlowLogTrafficType) {
      cdkBuilder.trafficType(trafficType.let(FlowLogTrafficType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.FlowLogOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.FlowLogOptions,
  ) : FlowLogOptions {
    override fun destination(): FlowLogDestination? =
        unwrap(this).getDestination()?.let(FlowLogDestination::wrap)

    override fun logFormat(): List<LogFormat> = unwrap(this).getLogFormat()?.map(LogFormat::wrap) ?:
        emptyList()

    override fun maxAggregationInterval(): FlowLogMaxAggregationInterval? =
        unwrap(this).getMaxAggregationInterval()?.let(FlowLogMaxAggregationInterval::wrap)

    override fun trafficType(): FlowLogTrafficType? =
        unwrap(this).getTrafficType()?.let(FlowLogTrafficType::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): FlowLogOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.FlowLogOptions): FlowLogOptions
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FlowLogOptions): software.amazon.awscdk.services.ec2.FlowLogOptions
        = (wrapped as Wrapper).cdkObject
  }
}
