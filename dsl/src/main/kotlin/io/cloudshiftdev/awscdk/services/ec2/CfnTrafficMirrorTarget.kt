package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTrafficMirrorTarget internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorTarget,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun gatewayLoadBalancerEndpointId(): String? =
      unwrap(this).getGatewayLoadBalancerEndpointId()

  public open fun gatewayLoadBalancerEndpointId(`value`: String) {
    unwrap(this).setGatewayLoadBalancerEndpointId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

  public open fun networkInterfaceId(`value`: String) {
    unwrap(this).setNetworkInterfaceId(`value`)
  }

  public open fun networkLoadBalancerArn(): String? = unwrap(this).getNetworkLoadBalancerArn()

  public open fun networkLoadBalancerArn(`value`: String) {
    unwrap(this).setNetworkLoadBalancerArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun description(description: String)

    public fun gatewayLoadBalancerEndpointId(gatewayLoadBalancerEndpointId: String)

    public fun networkInterfaceId(networkInterfaceId: String)

    public fun networkLoadBalancerArn(networkLoadBalancerArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnTrafficMirrorTarget.Builder =
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorTarget.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun gatewayLoadBalancerEndpointId(gatewayLoadBalancerEndpointId: String) {
      cdkBuilder.gatewayLoadBalancerEndpointId(gatewayLoadBalancerEndpointId)
    }

    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    override fun networkLoadBalancerArn(networkLoadBalancerArn: String) {
      cdkBuilder.networkLoadBalancerArn(networkLoadBalancerArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnTrafficMirrorTarget =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTrafficMirrorTarget {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTrafficMirrorTarget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorTarget):
        CfnTrafficMirrorTarget = CfnTrafficMirrorTarget(cdkObject)

    internal fun unwrap(wrapped: CfnTrafficMirrorTarget):
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorTarget = wrapped.cdkObject
  }
}
