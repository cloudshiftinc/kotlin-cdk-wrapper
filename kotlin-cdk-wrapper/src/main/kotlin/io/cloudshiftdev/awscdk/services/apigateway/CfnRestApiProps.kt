@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
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

public interface CfnRestApiProps {
  public fun apiKeySourceType(): String? = unwrap(this).getApiKeySourceType()

  public fun binaryMediaTypes(): List<String> = unwrap(this).getBinaryMediaTypes() ?: emptyList()

  public fun body(): Any? = unwrap(this).getBody()

  public fun bodyS3Location(): Any? = unwrap(this).getBodyS3Location()

  public fun cloneFrom(): String? = unwrap(this).getCloneFrom()

  public fun description(): String? = unwrap(this).getDescription()

  public fun disableExecuteApiEndpoint(): Any? = unwrap(this).getDisableExecuteApiEndpoint()

  public fun endpointConfiguration(): Any? = unwrap(this).getEndpointConfiguration()

  public fun failOnWarnings(): Any? = unwrap(this).getFailOnWarnings()

  public fun minimumCompressionSize(): Number? = unwrap(this).getMinimumCompressionSize()

  public fun mode(): String? = unwrap(this).getMode()

  public fun name(): String? = unwrap(this).getName()

  public fun parameters(): Any? = unwrap(this).getParameters()

  public fun policy(): Any? = unwrap(this).getPolicy()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun apiKeySourceType(apiKeySourceType: String)

    public fun binaryMediaTypes(binaryMediaTypes: List<String>)

    public fun binaryMediaTypes(vararg binaryMediaTypes: String)

    public fun body(body: Any)

    public fun bodyS3Location(bodyS3Location: IResolvable)

    public fun bodyS3Location(bodyS3Location: CfnRestApi.S3LocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a8263dd88d28eb60a198223d77321eae4d5fc4f96def26f35362c5e65ed4b1b")
    public fun bodyS3Location(bodyS3Location: CfnRestApi.S3LocationProperty.Builder.() -> Unit)

    public fun cloneFrom(cloneFrom: String)

    public fun description(description: String)

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable)

    public fun endpointConfiguration(endpointConfiguration: IResolvable)

    public
        fun endpointConfiguration(endpointConfiguration: CfnRestApi.EndpointConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00adf3cad9b409f91bdee38d4f666be552ca9838cbdc179ef66c4ad481401e4d")
    public
        fun endpointConfiguration(endpointConfiguration: CfnRestApi.EndpointConfigurationProperty.Builder.() -> Unit)

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

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnRestApiProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnRestApiProps.builder()

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

    override fun bodyS3Location(bodyS3Location: CfnRestApi.S3LocationProperty) {
      cdkBuilder.bodyS3Location(bodyS3Location.let(CfnRestApi.S3LocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a8263dd88d28eb60a198223d77321eae4d5fc4f96def26f35362c5e65ed4b1b")
    override fun bodyS3Location(bodyS3Location: CfnRestApi.S3LocationProperty.Builder.() -> Unit):
        Unit = bodyS3Location(CfnRestApi.S3LocationProperty(bodyS3Location))

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

    override
        fun endpointConfiguration(endpointConfiguration: CfnRestApi.EndpointConfigurationProperty) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(CfnRestApi.EndpointConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00adf3cad9b409f91bdee38d4f666be552ca9838cbdc179ef66c4ad481401e4d")
    override
        fun endpointConfiguration(endpointConfiguration: CfnRestApi.EndpointConfigurationProperty.Builder.() -> Unit):
        Unit =
        endpointConfiguration(CfnRestApi.EndpointConfigurationProperty(endpointConfiguration))

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

    public fun build(): software.amazon.awscdk.services.apigateway.CfnRestApiProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnRestApiProps,
  ) : CdkObject(cdkObject), CfnRestApiProps {
    override fun apiKeySourceType(): String? = unwrap(this).getApiKeySourceType()

    override fun binaryMediaTypes(): List<String> = unwrap(this).getBinaryMediaTypes() ?:
        emptyList()

    override fun body(): Any? = unwrap(this).getBody()

    override fun bodyS3Location(): Any? = unwrap(this).getBodyS3Location()

    override fun cloneFrom(): String? = unwrap(this).getCloneFrom()

    override fun description(): String? = unwrap(this).getDescription()

    override fun disableExecuteApiEndpoint(): Any? = unwrap(this).getDisableExecuteApiEndpoint()

    override fun endpointConfiguration(): Any? = unwrap(this).getEndpointConfiguration()

    override fun failOnWarnings(): Any? = unwrap(this).getFailOnWarnings()

    override fun minimumCompressionSize(): Number? = unwrap(this).getMinimumCompressionSize()

    override fun mode(): String? = unwrap(this).getMode()

    override fun name(): String? = unwrap(this).getName()

    override fun parameters(): Any? = unwrap(this).getParameters()

    override fun policy(): Any? = unwrap(this).getPolicy()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRestApiProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnRestApiProps):
        CfnRestApiProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRestApiProps):
        software.amazon.awscdk.services.apigateway.CfnRestApiProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnRestApiProps
  }
}
