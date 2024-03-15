@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnFlowLogProps {
  public fun deliverCrossAccountRole(): String? = unwrap(this).getDeliverCrossAccountRole()

  public fun deliverLogsPermissionArn(): String? = unwrap(this).getDeliverLogsPermissionArn()

  public fun destinationOptions(): Any? = unwrap(this).getDestinationOptions()

  public fun logDestination(): String? = unwrap(this).getLogDestination()

  public fun logDestinationType(): String? = unwrap(this).getLogDestinationType()

  public fun logFormat(): String? = unwrap(this).getLogFormat()

  public fun logGroupName(): String? = unwrap(this).getLogGroupName()

  public fun maxAggregationInterval(): Number? = unwrap(this).getMaxAggregationInterval()

  public fun resourceId(): String

  public fun resourceType(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun trafficType(): String? = unwrap(this).getTrafficType()

  @CdkDslMarker
  public interface Builder {
    public fun deliverCrossAccountRole(deliverCrossAccountRole: String)

    public fun deliverLogsPermissionArn(deliverLogsPermissionArn: String)

    public fun destinationOptions(destinationOptions: Any)

    public fun logDestination(logDestination: String)

    public fun logDestinationType(logDestinationType: String)

    public fun logFormat(logFormat: String)

    public fun logGroupName(logGroupName: String)

    public fun maxAggregationInterval(maxAggregationInterval: Number)

    public fun resourceId(resourceId: String)

    public fun resourceType(resourceType: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun trafficType(trafficType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnFlowLogProps.Builder =
        software.amazon.awscdk.services.ec2.CfnFlowLogProps.builder()

    override fun deliverCrossAccountRole(deliverCrossAccountRole: String) {
      cdkBuilder.deliverCrossAccountRole(deliverCrossAccountRole)
    }

    override fun deliverLogsPermissionArn(deliverLogsPermissionArn: String) {
      cdkBuilder.deliverLogsPermissionArn(deliverLogsPermissionArn)
    }

    override fun destinationOptions(destinationOptions: Any) {
      cdkBuilder.destinationOptions(destinationOptions)
    }

    override fun logDestination(logDestination: String) {
      cdkBuilder.logDestination(logDestination)
    }

    override fun logDestinationType(logDestinationType: String) {
      cdkBuilder.logDestinationType(logDestinationType)
    }

    override fun logFormat(logFormat: String) {
      cdkBuilder.logFormat(logFormat)
    }

    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    override fun maxAggregationInterval(maxAggregationInterval: Number) {
      cdkBuilder.maxAggregationInterval(maxAggregationInterval)
    }

    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun trafficType(trafficType: String) {
      cdkBuilder.trafficType(trafficType)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnFlowLogProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnFlowLogProps,
  ) : CdkObject(cdkObject), CfnFlowLogProps {
    override fun deliverCrossAccountRole(): String? = unwrap(this).getDeliverCrossAccountRole()

    override fun deliverLogsPermissionArn(): String? = unwrap(this).getDeliverLogsPermissionArn()

    override fun destinationOptions(): Any? = unwrap(this).getDestinationOptions()

    override fun logDestination(): String? = unwrap(this).getLogDestination()

    override fun logDestinationType(): String? = unwrap(this).getLogDestinationType()

    override fun logFormat(): String? = unwrap(this).getLogFormat()

    override fun logGroupName(): String? = unwrap(this).getLogGroupName()

    override fun maxAggregationInterval(): Number? = unwrap(this).getMaxAggregationInterval()

    override fun resourceId(): String = unwrap(this).getResourceId()

    override fun resourceType(): String = unwrap(this).getResourceType()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun trafficType(): String? = unwrap(this).getTrafficType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFlowLogProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnFlowLogProps):
        CfnFlowLogProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFlowLogProps):
        software.amazon.awscdk.services.ec2.CfnFlowLogProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnFlowLogProps
  }
}
