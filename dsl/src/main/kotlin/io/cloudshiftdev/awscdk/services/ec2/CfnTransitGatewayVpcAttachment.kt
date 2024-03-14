package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTransitGatewayVpcAttachment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun addSubnetIds(): List<String> = unwrap(this).getAddSubnetIds() ?: emptyList()

  public open fun addSubnetIds(`value`: List<String>) {
    unwrap(this).setAddSubnetIds(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun options(): Any? = unwrap(this).getOptions()

  public open fun options(`value`: Any) {
    unwrap(this).setOptions(`value`)
  }

  public open fun removeSubnetIds(): List<String> = unwrap(this).getRemoveSubnetIds() ?: emptyList()

  public open fun removeSubnetIds(`value`: List<String>) {
    unwrap(this).setRemoveSubnetIds(`value`)
  }

  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun transitGatewayId(): String = unwrap(this).getTransitGatewayId()

  public open fun transitGatewayId(`value`: String) {
    unwrap(this).setTransitGatewayId(`value`)
  }

  public open fun vpcId(): String = unwrap(this).getVpcId()

  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  public interface Builder {
    public fun addSubnetIds(addSubnetIds: List<String>) {
    }

    public fun options(options: Any) {
    }

    public fun removeSubnetIds(removeSubnetIds: List<String>) {
    }

    public fun subnetIds(subnetIds: List<String>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun transitGatewayId(transitGatewayId: String) {
    }

    public fun vpcId(vpcId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment.Builder.create(scope, id)

    public override fun addSubnetIds(addSubnetIds: List<String>) {
      cdkBuilder.addSubnetIds(addSubnetIds)
    }

    public override fun options(options: Any) {
      cdkBuilder.options(options)
    }

    public override fun removeSubnetIds(removeSubnetIds: List<String>) {
      cdkBuilder.removeSubnetIds(removeSubnetIds)
    }

    public override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun transitGatewayId(transitGatewayId: String) {
      cdkBuilder.transitGatewayId(transitGatewayId)
    }

    public override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGatewayVpcAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGatewayVpcAttachment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment):
        CfnTransitGatewayVpcAttachment = CfnTransitGatewayVpcAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayVpcAttachment):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment = wrapped.cdkObject
  }

  public interface OptionsProperty {
    public fun applianceModeSupport(): String? = unwrap(this).getApplianceModeSupport()

    public fun dnsSupport(): String? = unwrap(this).getDnsSupport()

    public fun ipv6Support(): String? = unwrap(this).getIpv6Support()

    public interface Builder {
      public fun applianceModeSupport(applianceModeSupport: String) {
      }

      public fun dnsSupport(dnsSupport: String) {
      }

      public fun ipv6Support(ipv6Support: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment.OptionsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment.OptionsProperty.builder()

      public override fun applianceModeSupport(applianceModeSupport: String) {
        cdkBuilder.applianceModeSupport(applianceModeSupport)
      }

      public override fun dnsSupport(dnsSupport: String) {
        cdkBuilder.dnsSupport(dnsSupport)
      }

      public override fun ipv6Support(ipv6Support: String) {
        cdkBuilder.ipv6Support(ipv6Support)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment.OptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment.OptionsProperty,
    ) : OptionsProperty {
      public override fun applianceModeSupport(): String? = unwrap(this).getApplianceModeSupport()

      public override fun dnsSupport(): String? = unwrap(this).getDnsSupport()

      public override fun ipv6Support(): String? = unwrap(this).getIpv6Support()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment.OptionsProperty):
          OptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OptionsProperty):
          software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment.OptionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
