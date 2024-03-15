@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.refactorspaces

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplication internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.refactorspaces.CfnApplication,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun apiGatewayProxy(): Any? = unwrap(this).getApiGatewayProxy()

  public open fun apiGatewayProxy(`value`: IResolvable) {
    unwrap(this).setApiGatewayProxy(`value`.let(IResolvable::unwrap))
  }

  public open fun apiGatewayProxy(`value`: ApiGatewayProxyInputProperty) {
    unwrap(this).setApiGatewayProxy(`value`.let(ApiGatewayProxyInputProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5dcff8d68a1d086d00514bbf2c9429309b3723080f1a179a970150407e14d321")
  public open fun apiGatewayProxy(`value`: ApiGatewayProxyInputProperty.Builder.() -> Unit): Unit =
      apiGatewayProxy(ApiGatewayProxyInputProperty(`value`))

  public open fun attrApiGatewayId(): String = unwrap(this).getAttrApiGatewayId()

  public open fun attrApplicationIdentifier(): String = unwrap(this).getAttrApplicationIdentifier()

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrNlbArn(): String = unwrap(this).getAttrNlbArn()

  public open fun attrNlbName(): String = unwrap(this).getAttrNlbName()

  public open fun attrProxyUrl(): String = unwrap(this).getAttrProxyUrl()

  public open fun attrStageName(): String = unwrap(this).getAttrStageName()

  public open fun attrVpcLinkId(): String = unwrap(this).getAttrVpcLinkId()

  public open fun environmentIdentifier(): String = unwrap(this).getEnvironmentIdentifier()

  public open fun environmentIdentifier(`value`: String) {
    unwrap(this).setEnvironmentIdentifier(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun proxyType(): String = unwrap(this).getProxyType()

  public open fun proxyType(`value`: String) {
    unwrap(this).setProxyType(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun vpcId(): String = unwrap(this).getVpcId()

  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun apiGatewayProxy(apiGatewayProxy: IResolvable)

    public fun apiGatewayProxy(apiGatewayProxy: ApiGatewayProxyInputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82084cfa4d5be34cb317f6744332230060ebd89a2ad16fc185f5ce500b1462d8")
    public fun apiGatewayProxy(apiGatewayProxy: ApiGatewayProxyInputProperty.Builder.() -> Unit)

    public fun environmentIdentifier(environmentIdentifier: String)

    public fun name(name: String)

    public fun proxyType(proxyType: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.refactorspaces.CfnApplication.Builder =
        software.amazon.awscdk.services.refactorspaces.CfnApplication.Builder.create(scope, id)

    override fun apiGatewayProxy(apiGatewayProxy: IResolvable) {
      cdkBuilder.apiGatewayProxy(apiGatewayProxy.let(IResolvable::unwrap))
    }

    override fun apiGatewayProxy(apiGatewayProxy: ApiGatewayProxyInputProperty) {
      cdkBuilder.apiGatewayProxy(apiGatewayProxy.let(ApiGatewayProxyInputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82084cfa4d5be34cb317f6744332230060ebd89a2ad16fc185f5ce500b1462d8")
    override fun apiGatewayProxy(apiGatewayProxy: ApiGatewayProxyInputProperty.Builder.() -> Unit):
        Unit = apiGatewayProxy(ApiGatewayProxyInputProperty(apiGatewayProxy))

    override fun environmentIdentifier(environmentIdentifier: String) {
      cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun proxyType(proxyType: String) {
      cdkBuilder.proxyType(proxyType)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.refactorspaces.CfnApplication =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.refactorspaces.CfnApplication.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.refactorspaces.CfnApplication):
        CfnApplication = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication):
        software.amazon.awscdk.services.refactorspaces.CfnApplication = wrapped.cdkObject
  }

  public interface ApiGatewayProxyInputProperty {
    public fun endpointType(): String? = unwrap(this).getEndpointType()

    public fun stageName(): String? = unwrap(this).getStageName()

    @CdkDslMarker
    public interface Builder {
      public fun endpointType(endpointType: String)

      public fun stageName(stageName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.refactorspaces.CfnApplication.ApiGatewayProxyInputProperty.Builder
          =
          software.amazon.awscdk.services.refactorspaces.CfnApplication.ApiGatewayProxyInputProperty.builder()

      override fun endpointType(endpointType: String) {
        cdkBuilder.endpointType(endpointType)
      }

      override fun stageName(stageName: String) {
        cdkBuilder.stageName(stageName)
      }

      public fun build():
          software.amazon.awscdk.services.refactorspaces.CfnApplication.ApiGatewayProxyInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.refactorspaces.CfnApplication.ApiGatewayProxyInputProperty,
    ) : CdkObject(cdkObject), ApiGatewayProxyInputProperty {
      override fun endpointType(): String? = unwrap(this).getEndpointType()

      override fun stageName(): String? = unwrap(this).getStageName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApiGatewayProxyInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.refactorspaces.CfnApplication.ApiGatewayProxyInputProperty):
          ApiGatewayProxyInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApiGatewayProxyInputProperty):
          software.amazon.awscdk.services.refactorspaces.CfnApplication.ApiGatewayProxyInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.refactorspaces.CfnApplication.ApiGatewayProxyInputProperty
    }
  }
}
