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

public open class CfnTransitGatewayMulticastDomain internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun attrTransitGatewayMulticastDomainArn(): String =
      unwrap(this).getAttrTransitGatewayMulticastDomainArn()

  public open fun attrTransitGatewayMulticastDomainId(): String =
      unwrap(this).getAttrTransitGatewayMulticastDomainId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun options(): Any? = unwrap(this).getOptions()

  public open fun options(`value`: Any) {
    unwrap(this).setOptions(`value`)
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

  public interface Builder {
    public fun options(options: Any)

    public fun tags(tags: List<CfnTag>)

    public fun transitGatewayId(transitGatewayId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain.Builder.create(scope,
        id)

    override fun options(options: Any) {
      cdkBuilder.options(options)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun transitGatewayId(transitGatewayId: String) {
      cdkBuilder.transitGatewayId(transitGatewayId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGatewayMulticastDomain {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGatewayMulticastDomain(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain):
        CfnTransitGatewayMulticastDomain = CfnTransitGatewayMulticastDomain(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayMulticastDomain):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain = wrapped.cdkObject
  }

  public interface OptionsProperty {
    public fun autoAcceptSharedAssociations(): String? =
        unwrap(this).getAutoAcceptSharedAssociations()

    public fun igmpv2Support(): String? = unwrap(this).getIgmpv2Support()

    public fun staticSourcesSupport(): String? = unwrap(this).getStaticSourcesSupport()

    public interface Builder {
      public fun autoAcceptSharedAssociations(autoAcceptSharedAssociations: String)

      public fun igmpv2Support(igmpv2Support: String)

      public fun staticSourcesSupport(staticSourcesSupport: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain.OptionsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain.OptionsProperty.builder()

      override fun autoAcceptSharedAssociations(autoAcceptSharedAssociations: String) {
        cdkBuilder.autoAcceptSharedAssociations(autoAcceptSharedAssociations)
      }

      override fun igmpv2Support(igmpv2Support: String) {
        cdkBuilder.igmpv2Support(igmpv2Support)
      }

      override fun staticSourcesSupport(staticSourcesSupport: String) {
        cdkBuilder.staticSourcesSupport(staticSourcesSupport)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain.OptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain.OptionsProperty,
    ) : OptionsProperty {
      override fun autoAcceptSharedAssociations(): String? =
          unwrap(this).getAutoAcceptSharedAssociations()

      override fun igmpv2Support(): String? = unwrap(this).getIgmpv2Support()

      override fun staticSourcesSupport(): String? = unwrap(this).getStaticSourcesSupport()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain.OptionsProperty):
          OptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OptionsProperty):
          software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain.OptionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
