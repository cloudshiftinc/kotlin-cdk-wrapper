@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface FlowLogProps : FlowLogOptions {
  public fun flowLogName(): String? = unwrap(this).getFlowLogName()

  public fun resourceType(): FlowLogResourceType

  @CdkDslMarker
  public interface Builder {
    public fun destination(destination: FlowLogDestination)

    public fun flowLogName(flowLogName: String)

    public fun logFormat(logFormat: List<LogFormat>)

    public fun logFormat(vararg logFormat: LogFormat)

    public fun maxAggregationInterval(maxAggregationInterval: FlowLogMaxAggregationInterval)

    public fun resourceType(resourceType: FlowLogResourceType)

    public fun trafficType(trafficType: FlowLogTrafficType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.FlowLogProps.Builder =
        software.amazon.awscdk.services.ec2.FlowLogProps.builder()

    override fun destination(destination: FlowLogDestination) {
      cdkBuilder.destination(destination.let(FlowLogDestination::unwrap))
    }

    override fun flowLogName(flowLogName: String) {
      cdkBuilder.flowLogName(flowLogName)
    }

    override fun logFormat(logFormat: List<LogFormat>) {
      cdkBuilder.logFormat(logFormat.map(LogFormat::unwrap))
    }

    override fun logFormat(vararg logFormat: LogFormat): Unit = logFormat(logFormat.toList())

    override fun maxAggregationInterval(maxAggregationInterval: FlowLogMaxAggregationInterval) {
      cdkBuilder.maxAggregationInterval(maxAggregationInterval.let(FlowLogMaxAggregationInterval::unwrap))
    }

    override fun resourceType(resourceType: FlowLogResourceType) {
      cdkBuilder.resourceType(resourceType.let(FlowLogResourceType::unwrap))
    }

    override fun trafficType(trafficType: FlowLogTrafficType) {
      cdkBuilder.trafficType(trafficType.let(FlowLogTrafficType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.FlowLogProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.FlowLogProps,
  ) : CdkObject(cdkObject), FlowLogProps {
    override fun destination(): FlowLogDestination? =
        unwrap(this).getDestination()?.let(FlowLogDestination::wrap)

    override fun flowLogName(): String? = unwrap(this).getFlowLogName()

    override fun logFormat(): List<LogFormat> = unwrap(this).getLogFormat()?.map(LogFormat::wrap) ?:
        emptyList()

    override fun maxAggregationInterval(): FlowLogMaxAggregationInterval? =
        unwrap(this).getMaxAggregationInterval()?.let(FlowLogMaxAggregationInterval::wrap)

    override fun resourceType(): FlowLogResourceType =
        unwrap(this).getResourceType().let(FlowLogResourceType::wrap)

    override fun trafficType(): FlowLogTrafficType? =
        unwrap(this).getTrafficType()?.let(FlowLogTrafficType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FlowLogProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.FlowLogProps): FlowLogProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FlowLogProps): software.amazon.awscdk.services.ec2.FlowLogProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.FlowLogProps
  }
}
