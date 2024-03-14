package io.cloudshiftdev.awscdk.services.datasync

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

public open class CfnAgent internal constructor(
  private val cdkObject: software.amazon.awscdk.services.datasync.CfnAgent,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun activationKey(): String? = unwrap(this).getActivationKey()

  public open fun activationKey(`value`: String) {
    unwrap(this).setActivationKey(`value`)
  }

  public open fun agentName(): String? = unwrap(this).getAgentName()

  public open fun agentName(`value`: String) {
    unwrap(this).setAgentName(`value`)
  }

  public open fun attrAgentArn(): String = unwrap(this).getAttrAgentArn()

  public open fun attrEndpointType(): String = unwrap(this).getAttrEndpointType()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun securityGroupArns(): List<String> = unwrap(this).getSecurityGroupArns() ?:
      emptyList()

  public open fun securityGroupArns(`value`: List<String>) {
    unwrap(this).setSecurityGroupArns(`value`)
  }

  public open fun subnetArns(): List<String> = unwrap(this).getSubnetArns() ?: emptyList()

  public open fun subnetArns(`value`: List<String>) {
    unwrap(this).setSubnetArns(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

  public open fun vpcEndpointId(`value`: String) {
    unwrap(this).setVpcEndpointId(`value`)
  }

  public interface Builder {
    public fun activationKey(activationKey: String) {
    }

    public fun agentName(agentName: String) {
    }

    public fun securityGroupArns(securityGroupArns: List<String>) {
    }

    public fun subnetArns(subnetArns: List<String>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun vpcEndpointId(vpcEndpointId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnAgent.Builder =
        software.amazon.awscdk.services.datasync.CfnAgent.Builder.create(scope, id)

    public override fun activationKey(activationKey: String) {
      cdkBuilder.activationKey(activationKey)
    }

    public override fun agentName(agentName: String) {
      cdkBuilder.agentName(agentName)
    }

    public override fun securityGroupArns(securityGroupArns: List<String>) {
      cdkBuilder.securityGroupArns(securityGroupArns)
    }

    public override fun subnetArns(subnetArns: List<String>) {
      cdkBuilder.subnetArns(subnetArns)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun vpcEndpointId(vpcEndpointId: String) {
      cdkBuilder.vpcEndpointId(vpcEndpointId)
    }

    public fun build(): software.amazon.awscdk.services.datasync.CfnAgent = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAgent {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAgent(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnAgent): CfnAgent =
        CfnAgent(cdkObject)

    internal fun unwrap(wrapped: CfnAgent): software.amazon.awscdk.services.datasync.CfnAgent =
        wrapped.cdkObject
  }
}
