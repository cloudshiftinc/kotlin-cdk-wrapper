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

public open class CfnTransitGatewayAttachment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun options(): Any? = unwrap(this).getOptions()

  public open fun options(`value`: Any) {
    unwrap(this).setOptions(`value`)
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
    public fun options(options: Any)

    public fun subnetIds(subnetIds: List<String>)

    public fun tags(tags: List<CfnTag>)

    public fun transitGatewayId(transitGatewayId: String)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment.Builder
        = software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment.Builder.create(scope, id)

    override fun options(options: Any) {
      cdkBuilder.options(options)
    }

    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun transitGatewayId(transitGatewayId: String) {
      cdkBuilder.transitGatewayId(transitGatewayId)
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGatewayAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGatewayAttachment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment):
        CfnTransitGatewayAttachment = CfnTransitGatewayAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayAttachment):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment = wrapped.cdkObject
  }

  public interface OptionsProperty {
    public fun applianceModeSupport(): String? = unwrap(this).getApplianceModeSupport()

    public fun dnsSupport(): String? = unwrap(this).getDnsSupport()

    public fun ipv6Support(): String? = unwrap(this).getIpv6Support()

    public fun securityGroupReferencingSupport(): String? =
        unwrap(this).getSecurityGroupReferencingSupport()

    public interface Builder {
      public fun applianceModeSupport(applianceModeSupport: String)

      public fun dnsSupport(dnsSupport: String)

      public fun ipv6Support(ipv6Support: String)

      public fun securityGroupReferencingSupport(securityGroupReferencingSupport: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment.OptionsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment.OptionsProperty.builder()

      override fun applianceModeSupport(applianceModeSupport: String) {
        cdkBuilder.applianceModeSupport(applianceModeSupport)
      }

      override fun dnsSupport(dnsSupport: String) {
        cdkBuilder.dnsSupport(dnsSupport)
      }

      override fun ipv6Support(ipv6Support: String) {
        cdkBuilder.ipv6Support(ipv6Support)
      }

      override fun securityGroupReferencingSupport(securityGroupReferencingSupport: String) {
        cdkBuilder.securityGroupReferencingSupport(securityGroupReferencingSupport)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment.OptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment.OptionsProperty,
    ) : OptionsProperty {
      override fun applianceModeSupport(): String? = unwrap(this).getApplianceModeSupport()

      override fun dnsSupport(): String? = unwrap(this).getDnsSupport()

      override fun ipv6Support(): String? = unwrap(this).getIpv6Support()

      override fun securityGroupReferencingSupport(): String? =
          unwrap(this).getSecurityGroupReferencingSupport()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment.OptionsProperty):
          OptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OptionsProperty):
          software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment.OptionsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
