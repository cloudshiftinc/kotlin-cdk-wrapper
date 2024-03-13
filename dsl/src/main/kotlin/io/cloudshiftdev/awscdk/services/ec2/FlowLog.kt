package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class FlowLog internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.FlowLog,
) : Resource(cdkObject), IFlowLog {
  public open fun bucket(): IBucket? = unwrap(this).getBucket()?.let(IBucket::wrap)

  public open fun deliveryStreamArn(): String? = unwrap(this).getDeliveryStreamArn()

  public override fun flowLogId(): String = unwrap(this).getFlowLogId()

  public open fun iamRole(): IRole? = unwrap(this).getIamRole()?.let(IRole::wrap)

  public open fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

  public open fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

  public interface Builder {
    public fun destination(destination: FlowLogDestination) {
    }

    public fun flowLogName(flowLogName: String) {
    }

    public fun logFormat(logFormat: List<LogFormat>) {
    }

    public fun maxAggregationInterval(maxAggregationInterval: FlowLogMaxAggregationInterval) {
    }

    public fun resourceType(resourceType: FlowLogResourceType) {
    }

    public fun trafficType(trafficType: FlowLogTrafficType) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.FlowLog.Builder =
        software.amazon.awscdk.services.ec2.FlowLog.Builder.create(scope, id)

    public override fun destination(destination: FlowLogDestination) {
      cdkBuilder.destination(destination.let(FlowLogDestination::unwrap))
    }

    public override fun flowLogName(flowLogName: String) {
      cdkBuilder.flowLogName(flowLogName)
    }

    public override fun logFormat(logFormat: List<LogFormat>) {
      cdkBuilder.logFormat(logFormat.map(LogFormat::unwrap))
    }

    public override
        fun maxAggregationInterval(maxAggregationInterval: FlowLogMaxAggregationInterval) {
      cdkBuilder.maxAggregationInterval(maxAggregationInterval.let(FlowLogMaxAggregationInterval::unwrap))
    }

    public override fun resourceType(resourceType: FlowLogResourceType) {
      cdkBuilder.resourceType(resourceType.let(FlowLogResourceType::unwrap))
    }

    public override fun trafficType(trafficType: FlowLogTrafficType) {
      cdkBuilder.trafficType(trafficType.let(FlowLogTrafficType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.FlowLog = cdkBuilder.build()
  }

  public companion object {
    public open fun fromFlowLogId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      flowLogId: String,
    ): IFlowLog =
        software.amazon.awscdk.services.ec2.FlowLog.fromFlowLogId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, flowLogId).let(IFlowLog::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): FlowLog {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return FlowLog(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.FlowLog): FlowLog =
        FlowLog(cdkObject)

    internal fun unwrap(wrapped: FlowLog): software.amazon.awscdk.services.ec2.FlowLog =
        wrapped.cdkObject
  }
}
