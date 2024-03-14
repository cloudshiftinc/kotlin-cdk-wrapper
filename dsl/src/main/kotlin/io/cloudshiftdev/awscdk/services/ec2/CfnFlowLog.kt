package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFlowLog internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnFlowLog,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun deliverCrossAccountRole(): String? = unwrap(this).getDeliverCrossAccountRole()

  public open fun deliverCrossAccountRole(`value`: String) {
    unwrap(this).setDeliverCrossAccountRole(`value`)
  }

  public open fun deliverLogsPermissionArn(): String? = unwrap(this).getDeliverLogsPermissionArn()

  public open fun deliverLogsPermissionArn(`value`: String) {
    unwrap(this).setDeliverLogsPermissionArn(`value`)
  }

  public open fun destinationOptions(): Any? = unwrap(this).getDestinationOptions()

  public open fun destinationOptions(`value`: Any) {
    unwrap(this).setDestinationOptions(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun logDestination(): String? = unwrap(this).getLogDestination()

  public open fun logDestination(`value`: String) {
    unwrap(this).setLogDestination(`value`)
  }

  public open fun logDestinationType(): String? = unwrap(this).getLogDestinationType()

  public open fun logDestinationType(`value`: String) {
    unwrap(this).setLogDestinationType(`value`)
  }

  public open fun logFormat(): String? = unwrap(this).getLogFormat()

  public open fun logFormat(`value`: String) {
    unwrap(this).setLogFormat(`value`)
  }

  public open fun logGroupName(): String? = unwrap(this).getLogGroupName()

  public open fun logGroupName(`value`: String) {
    unwrap(this).setLogGroupName(`value`)
  }

  public open fun maxAggregationInterval(): Number? = unwrap(this).getMaxAggregationInterval()

  public open fun maxAggregationInterval(`value`: Number) {
    unwrap(this).setMaxAggregationInterval(`value`)
  }

  public open fun resourceId(): String = unwrap(this).getResourceId()

  public open fun resourceId(`value`: String) {
    unwrap(this).setResourceId(`value`)
  }

  public open fun resourceType(): String = unwrap(this).getResourceType()

  public open fun resourceType(`value`: String) {
    unwrap(this).setResourceType(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun trafficType(): String? = unwrap(this).getTrafficType()

  public open fun trafficType(`value`: String) {
    unwrap(this).setTrafficType(`value`)
  }

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

    public fun trafficType(trafficType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnFlowLog.Builder =
        software.amazon.awscdk.services.ec2.CfnFlowLog.Builder.create(scope, id)

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

    override fun trafficType(trafficType: String) {
      cdkBuilder.trafficType(trafficType)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnFlowLog = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFlowLog {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFlowLog(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnFlowLog): CfnFlowLog =
        CfnFlowLog(cdkObject)

    internal fun unwrap(wrapped: CfnFlowLog): software.amazon.awscdk.services.ec2.CfnFlowLog =
        wrapped.cdkObject
  }

  public interface DestinationOptionsProperty {
    public fun fileFormat(): String

    public fun hiveCompatiblePartitions(): Any

    public fun perHourPartition(): Any

    public interface Builder {
      public fun fileFormat(fileFormat: String)

      public fun hiveCompatiblePartitions(hiveCompatiblePartitions: Boolean)

      public fun hiveCompatiblePartitions(hiveCompatiblePartitions: IResolvable)

      public fun perHourPartition(perHourPartition: Boolean)

      public fun perHourPartition(perHourPartition: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnFlowLog.DestinationOptionsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnFlowLog.DestinationOptionsProperty.builder()

      override fun fileFormat(fileFormat: String) {
        cdkBuilder.fileFormat(fileFormat)
      }

      override fun hiveCompatiblePartitions(hiveCompatiblePartitions: Boolean) {
        cdkBuilder.hiveCompatiblePartitions(hiveCompatiblePartitions)
      }

      override fun hiveCompatiblePartitions(hiveCompatiblePartitions: IResolvable) {
        cdkBuilder.hiveCompatiblePartitions(hiveCompatiblePartitions.let(IResolvable::unwrap))
      }

      override fun perHourPartition(perHourPartition: Boolean) {
        cdkBuilder.perHourPartition(perHourPartition)
      }

      override fun perHourPartition(perHourPartition: IResolvable) {
        cdkBuilder.perHourPartition(perHourPartition.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnFlowLog.DestinationOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnFlowLog.DestinationOptionsProperty,
    ) : DestinationOptionsProperty {
      override fun fileFormat(): String = unwrap(this).getFileFormat()

      override fun hiveCompatiblePartitions(): Any = unwrap(this).getHiveCompatiblePartitions()

      override fun perHourPartition(): Any = unwrap(this).getPerHourPartition()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnFlowLog.DestinationOptionsProperty):
          DestinationOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnFlowLog.DestinationOptionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
