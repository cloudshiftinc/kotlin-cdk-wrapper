package io.cloudshiftdev.awscdk.services.apprunner

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVpcIngressConnection internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrDomainName(): String = unwrap(this).getAttrDomainName()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attrVpcIngressConnectionArn(): String =
      unwrap(this).getAttrVpcIngressConnectionArn()

  public open fun ingressVpcConfiguration(): Any = unwrap(this).getIngressVpcConfiguration()

  public open fun ingressVpcConfiguration(`value`: IResolvable) {
    unwrap(this).setIngressVpcConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun ingressVpcConfiguration(`value`: IngressVpcConfigurationProperty) {
    unwrap(this).setIngressVpcConfiguration(`value`.let(IngressVpcConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("465498462b9de592866f9a8f249515eb5e34c2c02bafdb4d2a2a9e55df7c6c2b")
  public open
      fun ingressVpcConfiguration(`value`: IngressVpcConfigurationProperty.Builder.() -> Unit): Unit
      = ingressVpcConfiguration(IngressVpcConfigurationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun serviceArn(): String = unwrap(this).getServiceArn()

  public open fun serviceArn(`value`: String) {
    unwrap(this).setServiceArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun vpcIngressConnectionName(): String? = unwrap(this).getVpcIngressConnectionName()

  public open fun vpcIngressConnectionName(`value`: String) {
    unwrap(this).setVpcIngressConnectionName(`value`)
  }

  public interface Builder {
    public fun ingressVpcConfiguration(ingressVpcConfiguration: IResolvable) {
    }

    public fun ingressVpcConfiguration(ingressVpcConfiguration: IngressVpcConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80b0ca5f0097ddac8852115093d814ff5b98399275ebb4b5a669f001d5066de5")
    public
        fun ingressVpcConfiguration(ingressVpcConfiguration: IngressVpcConfigurationProperty.Builder.() -> Unit) {
    }

    public fun serviceArn(serviceArn: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun vpcIngressConnectionName(vpcIngressConnectionName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection.Builder =
        software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection.Builder.create(scope, id)

    public override fun ingressVpcConfiguration(ingressVpcConfiguration: IResolvable) {
      cdkBuilder.ingressVpcConfiguration(ingressVpcConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun ingressVpcConfiguration(ingressVpcConfiguration: IngressVpcConfigurationProperty) {
      cdkBuilder.ingressVpcConfiguration(ingressVpcConfiguration.let(IngressVpcConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80b0ca5f0097ddac8852115093d814ff5b98399275ebb4b5a669f001d5066de5")
    public override
        fun ingressVpcConfiguration(ingressVpcConfiguration: IngressVpcConfigurationProperty.Builder.() -> Unit):
        Unit = ingressVpcConfiguration(IngressVpcConfigurationProperty(ingressVpcConfiguration))

    public override fun serviceArn(serviceArn: String) {
      cdkBuilder.serviceArn(serviceArn)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun vpcIngressConnectionName(vpcIngressConnectionName: String) {
      cdkBuilder.vpcIngressConnectionName(vpcIngressConnectionName)
    }

    public fun build(): software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVpcIngressConnection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVpcIngressConnection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection):
        CfnVpcIngressConnection = CfnVpcIngressConnection(cdkObject)

    internal fun unwrap(wrapped: CfnVpcIngressConnection):
        software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection = wrapped.cdkObject
  }

  public interface IngressVpcConfigurationProperty {
    public fun vpcEndpointId(): String

    public fun vpcId(): String

    public interface Builder {
      public fun vpcEndpointId(vpcEndpointId: String) {
      }

      public fun vpcId(vpcId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection.IngressVpcConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection.IngressVpcConfigurationProperty.builder()

      public override fun vpcEndpointId(vpcEndpointId: String) {
        cdkBuilder.vpcEndpointId(vpcEndpointId)
      }

      public override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection.IngressVpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection.IngressVpcConfigurationProperty,
    ) : IngressVpcConfigurationProperty {
      public override fun vpcEndpointId(): String = unwrap(this).getVpcEndpointId()

      public override fun vpcId(): String = unwrap(this).getVpcId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IngressVpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection.IngressVpcConfigurationProperty):
          IngressVpcConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngressVpcConfigurationProperty):
          software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection.IngressVpcConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
