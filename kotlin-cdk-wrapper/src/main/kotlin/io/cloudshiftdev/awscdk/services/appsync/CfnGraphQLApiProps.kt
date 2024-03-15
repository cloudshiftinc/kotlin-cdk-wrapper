@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

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
import kotlin.jvm.JvmName

public interface CfnGraphQLApiProps {
  public fun additionalAuthenticationProviders(): Any? =
      unwrap(this).getAdditionalAuthenticationProviders()

  public fun apiType(): String? = unwrap(this).getApiType()

  public fun authenticationType(): String

  public fun enhancedMetricsConfig(): Any? = unwrap(this).getEnhancedMetricsConfig()

  public fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

  public fun introspectionConfig(): String? = unwrap(this).getIntrospectionConfig()

  public fun lambdaAuthorizerConfig(): Any? = unwrap(this).getLambdaAuthorizerConfig()

  public fun logConfig(): Any? = unwrap(this).getLogConfig()

  public fun mergedApiExecutionRoleArn(): String? = unwrap(this).getMergedApiExecutionRoleArn()

  public fun name(): String

  public fun openIdConnectConfig(): Any? = unwrap(this).getOpenIdConnectConfig()

  public fun ownerContact(): String? = unwrap(this).getOwnerContact()

  public fun queryDepthLimit(): Number? = unwrap(this).getQueryDepthLimit()

  public fun resolverCountLimit(): Number? = unwrap(this).getResolverCountLimit()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun userPoolConfig(): Any? = unwrap(this).getUserPoolConfig()

  public fun visibility(): String? = unwrap(this).getVisibility()

  public fun xrayEnabled(): Any? = unwrap(this).getXrayEnabled()

  @CdkDslMarker
  public interface Builder {
    public fun additionalAuthenticationProviders(additionalAuthenticationProviders: IResolvable)

    public fun additionalAuthenticationProviders(additionalAuthenticationProviders: List<Any>)

    public fun additionalAuthenticationProviders(vararg additionalAuthenticationProviders: Any)

    public fun apiType(apiType: String)

    public fun authenticationType(authenticationType: String)

    public fun enhancedMetricsConfig(enhancedMetricsConfig: IResolvable)

    public
        fun enhancedMetricsConfig(enhancedMetricsConfig: CfnGraphQLApi.EnhancedMetricsConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b0efa0f39cce019574232dd75add87d04ee18d03c60f1dbda18e21794e6c20b1")
    public
        fun enhancedMetricsConfig(enhancedMetricsConfig: CfnGraphQLApi.EnhancedMetricsConfigProperty.Builder.() -> Unit)

    public fun environmentVariables(environmentVariables: Any)

    public fun introspectionConfig(introspectionConfig: String)

    public fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: IResolvable)

    public
        fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: CfnGraphQLApi.LambdaAuthorizerConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2eb76c1ec5d398128c9b07af4116598bba626361c451a0df93d8bfcda785edb0")
    public
        fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: CfnGraphQLApi.LambdaAuthorizerConfigProperty.Builder.() -> Unit)

    public fun logConfig(logConfig: IResolvable)

    public fun logConfig(logConfig: CfnGraphQLApi.LogConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("de74a6546ba74cbad9f5040bb79d027d0bd1f18bbef73ff841a5f0241675204f")
    public fun logConfig(logConfig: CfnGraphQLApi.LogConfigProperty.Builder.() -> Unit)

    public fun mergedApiExecutionRoleArn(mergedApiExecutionRoleArn: String)

    public fun name(name: String)

    public fun openIdConnectConfig(openIdConnectConfig: IResolvable)

    public fun openIdConnectConfig(openIdConnectConfig: CfnGraphQLApi.OpenIDConnectConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d88378825460c8ca91d2d2bf9d9f2d5311246886798201fa77244444769e6353")
    public
        fun openIdConnectConfig(openIdConnectConfig: CfnGraphQLApi.OpenIDConnectConfigProperty.Builder.() -> Unit)

    public fun ownerContact(ownerContact: String)

    public fun queryDepthLimit(queryDepthLimit: Number)

    public fun resolverCountLimit(resolverCountLimit: Number)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun userPoolConfig(userPoolConfig: IResolvable)

    public fun userPoolConfig(userPoolConfig: CfnGraphQLApi.UserPoolConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("293d6aa648fb922aa813c180441e910a52a682312f7a05060ef891a5f134031c")
    public
        fun userPoolConfig(userPoolConfig: CfnGraphQLApi.UserPoolConfigProperty.Builder.() -> Unit)

    public fun visibility(visibility: String)

    public fun xrayEnabled(xrayEnabled: Boolean)

    public fun xrayEnabled(xrayEnabled: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnGraphQLApiProps.Builder =
        software.amazon.awscdk.services.appsync.CfnGraphQLApiProps.builder()

    override fun additionalAuthenticationProviders(additionalAuthenticationProviders: IResolvable) {
      cdkBuilder.additionalAuthenticationProviders(additionalAuthenticationProviders.let(IResolvable::unwrap))
    }

    override fun additionalAuthenticationProviders(additionalAuthenticationProviders: List<Any>) {
      cdkBuilder.additionalAuthenticationProviders(additionalAuthenticationProviders)
    }

    override fun additionalAuthenticationProviders(vararg additionalAuthenticationProviders: Any):
        Unit = additionalAuthenticationProviders(additionalAuthenticationProviders.toList())

    override fun apiType(apiType: String) {
      cdkBuilder.apiType(apiType)
    }

    override fun authenticationType(authenticationType: String) {
      cdkBuilder.authenticationType(authenticationType)
    }

    override fun enhancedMetricsConfig(enhancedMetricsConfig: IResolvable) {
      cdkBuilder.enhancedMetricsConfig(enhancedMetricsConfig.let(IResolvable::unwrap))
    }

    override
        fun enhancedMetricsConfig(enhancedMetricsConfig: CfnGraphQLApi.EnhancedMetricsConfigProperty) {
      cdkBuilder.enhancedMetricsConfig(enhancedMetricsConfig.let(CfnGraphQLApi.EnhancedMetricsConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b0efa0f39cce019574232dd75add87d04ee18d03c60f1dbda18e21794e6c20b1")
    override
        fun enhancedMetricsConfig(enhancedMetricsConfig: CfnGraphQLApi.EnhancedMetricsConfigProperty.Builder.() -> Unit):
        Unit =
        enhancedMetricsConfig(CfnGraphQLApi.EnhancedMetricsConfigProperty(enhancedMetricsConfig))

    override fun environmentVariables(environmentVariables: Any) {
      cdkBuilder.environmentVariables(environmentVariables)
    }

    override fun introspectionConfig(introspectionConfig: String) {
      cdkBuilder.introspectionConfig(introspectionConfig)
    }

    override fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: IResolvable) {
      cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig.let(IResolvable::unwrap))
    }

    override
        fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: CfnGraphQLApi.LambdaAuthorizerConfigProperty) {
      cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig.let(CfnGraphQLApi.LambdaAuthorizerConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2eb76c1ec5d398128c9b07af4116598bba626361c451a0df93d8bfcda785edb0")
    override
        fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: CfnGraphQLApi.LambdaAuthorizerConfigProperty.Builder.() -> Unit):
        Unit =
        lambdaAuthorizerConfig(CfnGraphQLApi.LambdaAuthorizerConfigProperty(lambdaAuthorizerConfig))

    override fun logConfig(logConfig: IResolvable) {
      cdkBuilder.logConfig(logConfig.let(IResolvable::unwrap))
    }

    override fun logConfig(logConfig: CfnGraphQLApi.LogConfigProperty) {
      cdkBuilder.logConfig(logConfig.let(CfnGraphQLApi.LogConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("de74a6546ba74cbad9f5040bb79d027d0bd1f18bbef73ff841a5f0241675204f")
    override fun logConfig(logConfig: CfnGraphQLApi.LogConfigProperty.Builder.() -> Unit): Unit =
        logConfig(CfnGraphQLApi.LogConfigProperty(logConfig))

    override fun mergedApiExecutionRoleArn(mergedApiExecutionRoleArn: String) {
      cdkBuilder.mergedApiExecutionRoleArn(mergedApiExecutionRoleArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun openIdConnectConfig(openIdConnectConfig: IResolvable) {
      cdkBuilder.openIdConnectConfig(openIdConnectConfig.let(IResolvable::unwrap))
    }

    override
        fun openIdConnectConfig(openIdConnectConfig: CfnGraphQLApi.OpenIDConnectConfigProperty) {
      cdkBuilder.openIdConnectConfig(openIdConnectConfig.let(CfnGraphQLApi.OpenIDConnectConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d88378825460c8ca91d2d2bf9d9f2d5311246886798201fa77244444769e6353")
    override
        fun openIdConnectConfig(openIdConnectConfig: CfnGraphQLApi.OpenIDConnectConfigProperty.Builder.() -> Unit):
        Unit = openIdConnectConfig(CfnGraphQLApi.OpenIDConnectConfigProperty(openIdConnectConfig))

    override fun ownerContact(ownerContact: String) {
      cdkBuilder.ownerContact(ownerContact)
    }

    override fun queryDepthLimit(queryDepthLimit: Number) {
      cdkBuilder.queryDepthLimit(queryDepthLimit)
    }

    override fun resolverCountLimit(resolverCountLimit: Number) {
      cdkBuilder.resolverCountLimit(resolverCountLimit)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun userPoolConfig(userPoolConfig: IResolvable) {
      cdkBuilder.userPoolConfig(userPoolConfig.let(IResolvable::unwrap))
    }

    override fun userPoolConfig(userPoolConfig: CfnGraphQLApi.UserPoolConfigProperty) {
      cdkBuilder.userPoolConfig(userPoolConfig.let(CfnGraphQLApi.UserPoolConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("293d6aa648fb922aa813c180441e910a52a682312f7a05060ef891a5f134031c")
    override
        fun userPoolConfig(userPoolConfig: CfnGraphQLApi.UserPoolConfigProperty.Builder.() -> Unit):
        Unit = userPoolConfig(CfnGraphQLApi.UserPoolConfigProperty(userPoolConfig))

    override fun visibility(visibility: String) {
      cdkBuilder.visibility(visibility)
    }

    override fun xrayEnabled(xrayEnabled: Boolean) {
      cdkBuilder.xrayEnabled(xrayEnabled)
    }

    override fun xrayEnabled(xrayEnabled: IResolvable) {
      cdkBuilder.xrayEnabled(xrayEnabled.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnGraphQLApiProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLApiProps,
  ) : CdkObject(cdkObject), CfnGraphQLApiProps {
    override fun additionalAuthenticationProviders(): Any? =
        unwrap(this).getAdditionalAuthenticationProviders()

    override fun apiType(): String? = unwrap(this).getApiType()

    override fun authenticationType(): String = unwrap(this).getAuthenticationType()

    override fun enhancedMetricsConfig(): Any? = unwrap(this).getEnhancedMetricsConfig()

    override fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

    override fun introspectionConfig(): String? = unwrap(this).getIntrospectionConfig()

    override fun lambdaAuthorizerConfig(): Any? = unwrap(this).getLambdaAuthorizerConfig()

    override fun logConfig(): Any? = unwrap(this).getLogConfig()

    override fun mergedApiExecutionRoleArn(): String? = unwrap(this).getMergedApiExecutionRoleArn()

    override fun name(): String = unwrap(this).getName()

    override fun openIdConnectConfig(): Any? = unwrap(this).getOpenIdConnectConfig()

    override fun ownerContact(): String? = unwrap(this).getOwnerContact()

    override fun queryDepthLimit(): Number? = unwrap(this).getQueryDepthLimit()

    override fun resolverCountLimit(): Number? = unwrap(this).getResolverCountLimit()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun userPoolConfig(): Any? = unwrap(this).getUserPoolConfig()

    override fun visibility(): String? = unwrap(this).getVisibility()

    override fun xrayEnabled(): Any? = unwrap(this).getXrayEnabled()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGraphQLApiProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLApiProps):
        CfnGraphQLApiProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGraphQLApiProps):
        software.amazon.awscdk.services.appsync.CfnGraphQLApiProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.CfnGraphQLApiProps
  }
}
