@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface HttpApiProps {
  public fun apiName(): String? = unwrap(this).getApiName()

  public fun corsPreflight(): CorsPreflightOptions? =
      unwrap(this).getCorsPreflight()?.let(CorsPreflightOptions::wrap)

  public fun createDefaultStage(): Boolean? = unwrap(this).getCreateDefaultStage()

  public fun defaultAuthorizationScopes(): List<String> =
      unwrap(this).getDefaultAuthorizationScopes() ?: emptyList()

  public fun defaultAuthorizer(): IHttpRouteAuthorizer? =
      unwrap(this).getDefaultAuthorizer()?.let(IHttpRouteAuthorizer::wrap)

  public fun defaultDomainMapping(): DomainMappingOptions? =
      unwrap(this).getDefaultDomainMapping()?.let(DomainMappingOptions::wrap)

  public fun defaultIntegration(): HttpRouteIntegration? =
      unwrap(this).getDefaultIntegration()?.let(HttpRouteIntegration::wrap)

  public fun description(): String? = unwrap(this).getDescription()

  public fun disableExecuteApiEndpoint(): Boolean? = unwrap(this).getDisableExecuteApiEndpoint()

  @CdkDslMarker
  public interface Builder {
    public fun apiName(apiName: String)

    public fun corsPreflight(corsPreflight: CorsPreflightOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b66409cd8d01fd0f2616915cc1ce989364df831ffc90497343cfecf7670564b0")
    public fun corsPreflight(corsPreflight: CorsPreflightOptions.Builder.() -> Unit)

    public fun createDefaultStage(createDefaultStage: Boolean)

    public fun defaultAuthorizationScopes(defaultAuthorizationScopes: List<String>)

    public fun defaultAuthorizationScopes(vararg defaultAuthorizationScopes: String)

    public fun defaultAuthorizer(defaultAuthorizer: IHttpRouteAuthorizer)

    public fun defaultDomainMapping(defaultDomainMapping: DomainMappingOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b857e97490b01547d9f712466f7663df3a7c1a793a918682297c6451345bbb9a")
    public fun defaultDomainMapping(defaultDomainMapping: DomainMappingOptions.Builder.() -> Unit)

    public fun defaultIntegration(defaultIntegration: HttpRouteIntegration)

    public fun description(description: String)

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.HttpApiProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpApiProps.builder()

    override fun apiName(apiName: String) {
      cdkBuilder.apiName(apiName)
    }

    override fun corsPreflight(corsPreflight: CorsPreflightOptions) {
      cdkBuilder.corsPreflight(corsPreflight.let(CorsPreflightOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b66409cd8d01fd0f2616915cc1ce989364df831ffc90497343cfecf7670564b0")
    override fun corsPreflight(corsPreflight: CorsPreflightOptions.Builder.() -> Unit): Unit =
        corsPreflight(CorsPreflightOptions(corsPreflight))

    override fun createDefaultStage(createDefaultStage: Boolean) {
      cdkBuilder.createDefaultStage(createDefaultStage)
    }

    override fun defaultAuthorizationScopes(defaultAuthorizationScopes: List<String>) {
      cdkBuilder.defaultAuthorizationScopes(defaultAuthorizationScopes)
    }

    override fun defaultAuthorizationScopes(vararg defaultAuthorizationScopes: String): Unit =
        defaultAuthorizationScopes(defaultAuthorizationScopes.toList())

    override fun defaultAuthorizer(defaultAuthorizer: IHttpRouteAuthorizer) {
      cdkBuilder.defaultAuthorizer(defaultAuthorizer.let(IHttpRouteAuthorizer::unwrap))
    }

    override fun defaultDomainMapping(defaultDomainMapping: DomainMappingOptions) {
      cdkBuilder.defaultDomainMapping(defaultDomainMapping.let(DomainMappingOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b857e97490b01547d9f712466f7663df3a7c1a793a918682297c6451345bbb9a")
    override
        fun defaultDomainMapping(defaultDomainMapping: DomainMappingOptions.Builder.() -> Unit):
        Unit = defaultDomainMapping(DomainMappingOptions(defaultDomainMapping))

    override fun defaultIntegration(defaultIntegration: HttpRouteIntegration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(HttpRouteIntegration::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpApiProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpApiProps,
  ) : CdkObject(cdkObject), HttpApiProps {
    override fun apiName(): String? = unwrap(this).getApiName()

    override fun corsPreflight(): CorsPreflightOptions? =
        unwrap(this).getCorsPreflight()?.let(CorsPreflightOptions::wrap)

    override fun createDefaultStage(): Boolean? = unwrap(this).getCreateDefaultStage()

    override fun defaultAuthorizationScopes(): List<String> =
        unwrap(this).getDefaultAuthorizationScopes() ?: emptyList()

    override fun defaultAuthorizer(): IHttpRouteAuthorizer? =
        unwrap(this).getDefaultAuthorizer()?.let(IHttpRouteAuthorizer::wrap)

    override fun defaultDomainMapping(): DomainMappingOptions? =
        unwrap(this).getDefaultDomainMapping()?.let(DomainMappingOptions::wrap)

    override fun defaultIntegration(): HttpRouteIntegration? =
        unwrap(this).getDefaultIntegration()?.let(HttpRouteIntegration::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun disableExecuteApiEndpoint(): Boolean? = unwrap(this).getDisableExecuteApiEndpoint()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpApiProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpApiProps):
        HttpApiProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpApiProps):
        software.amazon.awscdk.services.apigatewayv2.HttpApiProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigatewayv2.HttpApiProps
  }
}
