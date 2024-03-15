@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnApiProps {
  public fun apiKeySelectionExpression(): String? = unwrap(this).getApiKeySelectionExpression()

  public fun basePath(): String? = unwrap(this).getBasePath()

  public fun body(): Any? = unwrap(this).getBody()

  public fun bodyS3Location(): Any? = unwrap(this).getBodyS3Location()

  public fun corsConfiguration(): Any? = unwrap(this).getCorsConfiguration()

  public fun credentialsArn(): String? = unwrap(this).getCredentialsArn()

  public fun description(): String? = unwrap(this).getDescription()

  public fun disableExecuteApiEndpoint(): Any? = unwrap(this).getDisableExecuteApiEndpoint()

  public fun disableSchemaValidation(): Any? = unwrap(this).getDisableSchemaValidation()

  public fun failOnWarnings(): Any? = unwrap(this).getFailOnWarnings()

  public fun name(): String? = unwrap(this).getName()

  public fun protocolType(): String? = unwrap(this).getProtocolType()

  public fun routeKey(): String? = unwrap(this).getRouteKey()

  public fun routeSelectionExpression(): String? = unwrap(this).getRouteSelectionExpression()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun target(): String? = unwrap(this).getTarget()

  public fun version(): String? = unwrap(this).getVersion()

  @CdkDslMarker
  public interface Builder {
    public fun apiKeySelectionExpression(apiKeySelectionExpression: String)

    public fun basePath(basePath: String)

    public fun body(body: Any)

    public fun bodyS3Location(bodyS3Location: IResolvable)

    public fun bodyS3Location(bodyS3Location: CfnApi.BodyS3LocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f96d71807161d56ef0d717788230292af19650bde7c222e4e35bf6d11c0ca168")
    public fun bodyS3Location(bodyS3Location: CfnApi.BodyS3LocationProperty.Builder.() -> Unit)

    public fun corsConfiguration(corsConfiguration: IResolvable)

    public fun corsConfiguration(corsConfiguration: CfnApi.CorsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a92d7b738439b927cb69162409c5b3e4ecfcae985c234a30a0dfa59485f4957")
    public fun corsConfiguration(corsConfiguration: CfnApi.CorsProperty.Builder.() -> Unit)

    public fun credentialsArn(credentialsArn: String)

    public fun description(description: String)

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable)

    public fun disableSchemaValidation(disableSchemaValidation: Boolean)

    public fun disableSchemaValidation(disableSchemaValidation: IResolvable)

    public fun failOnWarnings(failOnWarnings: Boolean)

    public fun failOnWarnings(failOnWarnings: IResolvable)

    public fun name(name: String)

    public fun protocolType(protocolType: String)

    public fun routeKey(routeKey: String)

    public fun routeSelectionExpression(routeSelectionExpression: String)

    public fun tags(tags: Map<String, String>)

    public fun target(target: String)

    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnApiProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnApiProps.builder()

    override fun apiKeySelectionExpression(apiKeySelectionExpression: String) {
      cdkBuilder.apiKeySelectionExpression(apiKeySelectionExpression)
    }

    override fun basePath(basePath: String) {
      cdkBuilder.basePath(basePath)
    }

    override fun body(body: Any) {
      cdkBuilder.body(body)
    }

    override fun bodyS3Location(bodyS3Location: IResolvable) {
      cdkBuilder.bodyS3Location(bodyS3Location.let(IResolvable::unwrap))
    }

    override fun bodyS3Location(bodyS3Location: CfnApi.BodyS3LocationProperty) {
      cdkBuilder.bodyS3Location(bodyS3Location.let(CfnApi.BodyS3LocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f96d71807161d56ef0d717788230292af19650bde7c222e4e35bf6d11c0ca168")
    override fun bodyS3Location(bodyS3Location: CfnApi.BodyS3LocationProperty.Builder.() -> Unit):
        Unit = bodyS3Location(CfnApi.BodyS3LocationProperty(bodyS3Location))

    override fun corsConfiguration(corsConfiguration: IResolvable) {
      cdkBuilder.corsConfiguration(corsConfiguration.let(IResolvable::unwrap))
    }

    override fun corsConfiguration(corsConfiguration: CfnApi.CorsProperty) {
      cdkBuilder.corsConfiguration(corsConfiguration.let(CfnApi.CorsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a92d7b738439b927cb69162409c5b3e4ecfcae985c234a30a0dfa59485f4957")
    override fun corsConfiguration(corsConfiguration: CfnApi.CorsProperty.Builder.() -> Unit): Unit
        = corsConfiguration(CfnApi.CorsProperty(corsConfiguration))

    override fun credentialsArn(credentialsArn: String) {
      cdkBuilder.credentialsArn(credentialsArn)
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

    override fun disableSchemaValidation(disableSchemaValidation: Boolean) {
      cdkBuilder.disableSchemaValidation(disableSchemaValidation)
    }

    override fun disableSchemaValidation(disableSchemaValidation: IResolvable) {
      cdkBuilder.disableSchemaValidation(disableSchemaValidation.let(IResolvable::unwrap))
    }

    override fun failOnWarnings(failOnWarnings: Boolean) {
      cdkBuilder.failOnWarnings(failOnWarnings)
    }

    override fun failOnWarnings(failOnWarnings: IResolvable) {
      cdkBuilder.failOnWarnings(failOnWarnings.let(IResolvable::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun protocolType(protocolType: String) {
      cdkBuilder.protocolType(protocolType)
    }

    override fun routeKey(routeKey: String) {
      cdkBuilder.routeKey(routeKey)
    }

    override fun routeSelectionExpression(routeSelectionExpression: String) {
      cdkBuilder.routeSelectionExpression(routeSelectionExpression)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun target(target: String) {
      cdkBuilder.target(target)
    }

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnApiProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiProps,
  ) : CdkObject(cdkObject), CfnApiProps {
    override fun apiKeySelectionExpression(): String? = unwrap(this).getApiKeySelectionExpression()

    override fun basePath(): String? = unwrap(this).getBasePath()

    override fun body(): Any? = unwrap(this).getBody()

    override fun bodyS3Location(): Any? = unwrap(this).getBodyS3Location()

    override fun corsConfiguration(): Any? = unwrap(this).getCorsConfiguration()

    override fun credentialsArn(): String? = unwrap(this).getCredentialsArn()

    override fun description(): String? = unwrap(this).getDescription()

    override fun disableExecuteApiEndpoint(): Any? = unwrap(this).getDisableExecuteApiEndpoint()

    override fun disableSchemaValidation(): Any? = unwrap(this).getDisableSchemaValidation()

    override fun failOnWarnings(): Any? = unwrap(this).getFailOnWarnings()

    override fun name(): String? = unwrap(this).getName()

    override fun protocolType(): String? = unwrap(this).getProtocolType()

    override fun routeKey(): String? = unwrap(this).getRouteKey()

    override fun routeSelectionExpression(): String? = unwrap(this).getRouteSelectionExpression()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun target(): String? = unwrap(this).getTarget()

    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApiProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiProps):
        CfnApiProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApiProps):
        software.amazon.awscdk.services.apigatewayv2.CfnApiProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigatewayv2.CfnApiProps
  }
}
