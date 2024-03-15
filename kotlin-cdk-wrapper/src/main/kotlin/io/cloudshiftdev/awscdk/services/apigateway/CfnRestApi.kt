@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRestApi internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.CfnRestApi,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun apiKeySourceType(): String? = unwrap(this).getApiKeySourceType()

  public open fun apiKeySourceType(`value`: String) {
    unwrap(this).setApiKeySourceType(`value`)
  }

  public open fun attrRestApiId(): String = unwrap(this).getAttrRestApiId()

  public open fun attrRootResourceId(): String = unwrap(this).getAttrRootResourceId()

  public open fun binaryMediaTypes(): List<String> = unwrap(this).getBinaryMediaTypes() ?:
      emptyList()

  public open fun binaryMediaTypes(`value`: List<String>) {
    unwrap(this).setBinaryMediaTypes(`value`)
  }

  public open fun binaryMediaTypes(vararg `value`: String): Unit =
      binaryMediaTypes(`value`.toList())

  public open fun body(): Any? = unwrap(this).getBody()

  public open fun body(`value`: Any) {
    unwrap(this).setBody(`value`)
  }

  public open fun bodyS3Location(): Any? = unwrap(this).getBodyS3Location()

  public open fun bodyS3Location(`value`: IResolvable) {
    unwrap(this).setBodyS3Location(`value`.let(IResolvable::unwrap))
  }

  public open fun bodyS3Location(`value`: S3LocationProperty) {
    unwrap(this).setBodyS3Location(`value`.let(S3LocationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fa2ebf7a3aed3c721bf1a8f32e5fc541cf91225fbb8829e78c2bf72b1f09437e")
  public open fun bodyS3Location(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      bodyS3Location(S3LocationProperty(`value`))

  public open fun cloneFrom(): String? = unwrap(this).getCloneFrom()

  public open fun cloneFrom(`value`: String) {
    unwrap(this).setCloneFrom(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun disableExecuteApiEndpoint(): Any? = unwrap(this).getDisableExecuteApiEndpoint()

  public open fun disableExecuteApiEndpoint(`value`: Boolean) {
    unwrap(this).setDisableExecuteApiEndpoint(`value`)
  }

  public open fun disableExecuteApiEndpoint(`value`: IResolvable) {
    unwrap(this).setDisableExecuteApiEndpoint(`value`.let(IResolvable::unwrap))
  }

  public open fun endpointConfiguration(): Any? = unwrap(this).getEndpointConfiguration()

  public open fun endpointConfiguration(`value`: IResolvable) {
    unwrap(this).setEndpointConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun endpointConfiguration(`value`: EndpointConfigurationProperty) {
    unwrap(this).setEndpointConfiguration(`value`.let(EndpointConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("96464e0753a5a8f1d671a4b9b2c059840d9694ece3a10e89fd4bbaf933a87cc5")
  public open fun endpointConfiguration(`value`: EndpointConfigurationProperty.Builder.() -> Unit):
      Unit = endpointConfiguration(EndpointConfigurationProperty(`value`))

  public open fun failOnWarnings(): Any? = unwrap(this).getFailOnWarnings()

  public open fun failOnWarnings(`value`: Boolean) {
    unwrap(this).setFailOnWarnings(`value`)
  }

  public open fun failOnWarnings(`value`: IResolvable) {
    unwrap(this).setFailOnWarnings(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun minimumCompressionSize(): Number? = unwrap(this).getMinimumCompressionSize()

  public open fun minimumCompressionSize(`value`: Number) {
    unwrap(this).setMinimumCompressionSize(`value`)
  }

  public open fun mode(): String? = unwrap(this).getMode()

  public open fun mode(`value`: String) {
    unwrap(this).setMode(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun parameters(): Any? = unwrap(this).getParameters()

  public open fun parameters(`value`: IResolvable) {
    unwrap(this).setParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun parameters(`value`: Map<String, String>) {
    unwrap(this).setParameters(`value`)
  }

  public open fun policy(): Any? = unwrap(this).getPolicy()

  public open fun policy(`value`: Any) {
    unwrap(this).setPolicy(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun apiKeySourceType(apiKeySourceType: String)

    public fun binaryMediaTypes(binaryMediaTypes: List<String>)

    public fun binaryMediaTypes(vararg binaryMediaTypes: String)

    public fun body(body: Any)

    public fun bodyS3Location(bodyS3Location: IResolvable)

    public fun bodyS3Location(bodyS3Location: S3LocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d35ffb3ff0b84ebe66af9cf1925819130283ff8be57b7629af7c56d91932bd31")
    public fun bodyS3Location(bodyS3Location: S3LocationProperty.Builder.() -> Unit)

    public fun cloneFrom(cloneFrom: String)

    public fun description(description: String)

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable)

    public fun endpointConfiguration(endpointConfiguration: IResolvable)

    public fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("111e703782ee9ff24896853eb6d31839e80c2f1b678f7a83c77fc256a7b2d65a")
    public
        fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty.Builder.() -> Unit)

    public fun failOnWarnings(failOnWarnings: Boolean)

    public fun failOnWarnings(failOnWarnings: IResolvable)

    public fun minimumCompressionSize(minimumCompressionSize: Number)

    public fun mode(mode: String)

    public fun name(name: String)

    public fun parameters(parameters: IResolvable)

    public fun parameters(parameters: Map<String, String>)

    public fun policy(policy: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnRestApi.Builder =
        software.amazon.awscdk.services.apigateway.CfnRestApi.Builder.create(scope, id)

    override fun apiKeySourceType(apiKeySourceType: String) {
      cdkBuilder.apiKeySourceType(apiKeySourceType)
    }

    override fun binaryMediaTypes(binaryMediaTypes: List<String>) {
      cdkBuilder.binaryMediaTypes(binaryMediaTypes)
    }

    override fun binaryMediaTypes(vararg binaryMediaTypes: String): Unit =
        binaryMediaTypes(binaryMediaTypes.toList())

    override fun body(body: Any) {
      cdkBuilder.body(body)
    }

    override fun bodyS3Location(bodyS3Location: IResolvable) {
      cdkBuilder.bodyS3Location(bodyS3Location.let(IResolvable::unwrap))
    }

    override fun bodyS3Location(bodyS3Location: S3LocationProperty) {
      cdkBuilder.bodyS3Location(bodyS3Location.let(S3LocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d35ffb3ff0b84ebe66af9cf1925819130283ff8be57b7629af7c56d91932bd31")
    override fun bodyS3Location(bodyS3Location: S3LocationProperty.Builder.() -> Unit): Unit =
        bodyS3Location(S3LocationProperty(bodyS3Location))

    override fun cloneFrom(cloneFrom: String) {
      cdkBuilder.cloneFrom(cloneFrom)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint.let(IResolvable::unwrap))
    }

    override fun endpointConfiguration(endpointConfiguration: IResolvable) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(IResolvable::unwrap))
    }

    override fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(EndpointConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("111e703782ee9ff24896853eb6d31839e80c2f1b678f7a83c77fc256a7b2d65a")
    override
        fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty.Builder.() -> Unit):
        Unit = endpointConfiguration(EndpointConfigurationProperty(endpointConfiguration))

    override fun failOnWarnings(failOnWarnings: Boolean) {
      cdkBuilder.failOnWarnings(failOnWarnings)
    }

    override fun failOnWarnings(failOnWarnings: IResolvable) {
      cdkBuilder.failOnWarnings(failOnWarnings.let(IResolvable::unwrap))
    }

    override fun minimumCompressionSize(minimumCompressionSize: Number) {
      cdkBuilder.minimumCompressionSize(minimumCompressionSize)
    }

    override fun mode(mode: String) {
      cdkBuilder.mode(mode)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.apigateway.CfnRestApi = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigateway.CfnRestApi.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRestApi {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRestApi(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnRestApi): CfnRestApi
        = CfnRestApi(cdkObject)

    internal fun unwrap(wrapped: CfnRestApi): software.amazon.awscdk.services.apigateway.CfnRestApi
        = wrapped.cdkObject
  }

  public interface S3LocationProperty {
    public fun bucket(): String? = unwrap(this).getBucket()

    public fun eTag(): String? = unwrap(this).getETag()

    public fun key(): String? = unwrap(this).getKey()

    public fun version(): String? = unwrap(this).getVersion()

    @CdkDslMarker
    public interface Builder {
      public fun bucket(bucket: String)

      public fun eTag(eTag: String)

      public fun key(key: String)

      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnRestApi.S3LocationProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnRestApi.S3LocationProperty.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun eTag(eTag: String) {
        cdkBuilder.eTag(eTag)
      }

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.apigateway.CfnRestApi.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnRestApi.S3LocationProperty,
    ) : CdkObject(cdkObject), S3LocationProperty {
      override fun bucket(): String? = unwrap(this).getBucket()

      override fun eTag(): String? = unwrap(this).getETag()

      override fun key(): String? = unwrap(this).getKey()

      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnRestApi.S3LocationProperty):
          S3LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.apigateway.CfnRestApi.S3LocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnRestApi.S3LocationProperty
    }
  }

  public interface EndpointConfigurationProperty {
    public fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()

    public fun vpcEndpointIds(): List<String> = unwrap(this).getVpcEndpointIds() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun types(types: List<String>)

      public fun types(vararg types: String)

      public fun vpcEndpointIds(vpcEndpointIds: List<String>)

      public fun vpcEndpointIds(vararg vpcEndpointIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnRestApi.EndpointConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apigateway.CfnRestApi.EndpointConfigurationProperty.builder()

      override fun types(types: List<String>) {
        cdkBuilder.types(types)
      }

      override fun types(vararg types: String): Unit = types(types.toList())

      override fun vpcEndpointIds(vpcEndpointIds: List<String>) {
        cdkBuilder.vpcEndpointIds(vpcEndpointIds)
      }

      override fun vpcEndpointIds(vararg vpcEndpointIds: String): Unit =
          vpcEndpointIds(vpcEndpointIds.toList())

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnRestApi.EndpointConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnRestApi.EndpointConfigurationProperty,
    ) : CdkObject(cdkObject), EndpointConfigurationProperty {
      override fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()

      override fun vpcEndpointIds(): List<String> = unwrap(this).getVpcEndpointIds() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnRestApi.EndpointConfigurationProperty):
          EndpointConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointConfigurationProperty):
          software.amazon.awscdk.services.apigateway.CfnRestApi.EndpointConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnRestApi.EndpointConfigurationProperty
    }
  }
}
