package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGraphQLApi internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLApi,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun additionalAuthenticationProviders(): Any? =
      unwrap(this).getAdditionalAuthenticationProviders()

  public open fun additionalAuthenticationProviders(`value`: IResolvable) {
    unwrap(this).setAdditionalAuthenticationProviders(`value`.let(IResolvable::unwrap))
  }

  public open fun additionalAuthenticationProviders(__idx_ac66f0: List<Any>) {
    unwrap(this).setAdditionalAuthenticationProviders(__idx_ac66f0)
  }

  public open fun apiType(): String? = unwrap(this).getApiType()

  public open fun apiType(`value`: String) {
    unwrap(this).setApiType(`value`)
  }

  public open fun attrApiId(): String = unwrap(this).getAttrApiId()

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrGraphQlDns(): String = unwrap(this).getAttrGraphQlDns()

  public open fun attrGraphQlEndpointArn(): String = unwrap(this).getAttrGraphQlEndpointArn()

  public open fun attrGraphQlUrl(): String = unwrap(this).getAttrGraphQlUrl()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrRealtimeDns(): String = unwrap(this).getAttrRealtimeDns()

  public open fun attrRealtimeUrl(): String = unwrap(this).getAttrRealtimeUrl()

  public open fun authenticationType(): String = unwrap(this).getAuthenticationType()

  public open fun authenticationType(`value`: String) {
    unwrap(this).setAuthenticationType(`value`)
  }

  public open fun enhancedMetricsConfig(): Any? = unwrap(this).getEnhancedMetricsConfig()

  public open fun enhancedMetricsConfig(`value`: IResolvable) {
    unwrap(this).setEnhancedMetricsConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun enhancedMetricsConfig(`value`: EnhancedMetricsConfigProperty) {
    unwrap(this).setEnhancedMetricsConfig(`value`.let(EnhancedMetricsConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5c7cb6d997eb7a913c637402f730d7e5a2eea234cb5376e200f14f691bf25aca")
  public open fun enhancedMetricsConfig(`value`: EnhancedMetricsConfigProperty.Builder.() -> Unit):
      Unit = enhancedMetricsConfig(EnhancedMetricsConfigProperty(`value`))

  public open fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

  public open fun environmentVariables(`value`: Any) {
    unwrap(this).setEnvironmentVariables(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun introspectionConfig(): String? = unwrap(this).getIntrospectionConfig()

  public open fun introspectionConfig(`value`: String) {
    unwrap(this).setIntrospectionConfig(`value`)
  }

  public open fun lambdaAuthorizerConfig(): Any? = unwrap(this).getLambdaAuthorizerConfig()

  public open fun lambdaAuthorizerConfig(`value`: IResolvable) {
    unwrap(this).setLambdaAuthorizerConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun lambdaAuthorizerConfig(`value`: LambdaAuthorizerConfigProperty) {
    unwrap(this).setLambdaAuthorizerConfig(`value`.let(LambdaAuthorizerConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("226654479798f7d69b9831494fd1f18b4eae751c1940e3d6dd7d7793b9b25dbd")
  public open
      fun lambdaAuthorizerConfig(`value`: LambdaAuthorizerConfigProperty.Builder.() -> Unit): Unit =
      lambdaAuthorizerConfig(LambdaAuthorizerConfigProperty(`value`))

  public open fun logConfig(): Any? = unwrap(this).getLogConfig()

  public open fun logConfig(`value`: IResolvable) {
    unwrap(this).setLogConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun logConfig(`value`: LogConfigProperty) {
    unwrap(this).setLogConfig(`value`.let(LogConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6480098209f2ac20bfd8339046fd57d0cd067b9efde8da561a61daa0cadb30f9")
  public open fun logConfig(`value`: LogConfigProperty.Builder.() -> Unit): Unit =
      logConfig(LogConfigProperty(`value`))

  public open fun mergedApiExecutionRoleArn(): String? = unwrap(this).getMergedApiExecutionRoleArn()

  public open fun mergedApiExecutionRoleArn(`value`: String) {
    unwrap(this).setMergedApiExecutionRoleArn(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun openIdConnectConfig(): Any? = unwrap(this).getOpenIdConnectConfig()

  public open fun openIdConnectConfig(`value`: IResolvable) {
    unwrap(this).setOpenIdConnectConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun openIdConnectConfig(`value`: OpenIDConnectConfigProperty) {
    unwrap(this).setOpenIdConnectConfig(`value`.let(OpenIDConnectConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9e541f6d43022ab20caf6f4c7b278a91eb2996d21015ce459c57588123eb39ac")
  public open fun openIdConnectConfig(`value`: OpenIDConnectConfigProperty.Builder.() -> Unit): Unit
      = openIdConnectConfig(OpenIDConnectConfigProperty(`value`))

  public open fun ownerContact(): String? = unwrap(this).getOwnerContact()

  public open fun ownerContact(`value`: String) {
    unwrap(this).setOwnerContact(`value`)
  }

  public open fun queryDepthLimit(): Number? = unwrap(this).getQueryDepthLimit()

  public open fun queryDepthLimit(`value`: Number) {
    unwrap(this).setQueryDepthLimit(`value`)
  }

  public open fun resolverCountLimit(): Number? = unwrap(this).getResolverCountLimit()

  public open fun resolverCountLimit(`value`: Number) {
    unwrap(this).setResolverCountLimit(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun userPoolConfig(): Any? = unwrap(this).getUserPoolConfig()

  public open fun userPoolConfig(`value`: IResolvable) {
    unwrap(this).setUserPoolConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun userPoolConfig(`value`: UserPoolConfigProperty) {
    unwrap(this).setUserPoolConfig(`value`.let(UserPoolConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9dedb1423752ba769548b44201e47da5b6467be2433e52472f507f75ea376cfd")
  public open fun userPoolConfig(`value`: UserPoolConfigProperty.Builder.() -> Unit): Unit =
      userPoolConfig(UserPoolConfigProperty(`value`))

  public open fun visibility(): String? = unwrap(this).getVisibility()

  public open fun visibility(`value`: String) {
    unwrap(this).setVisibility(`value`)
  }

  public open fun xrayEnabled(): Any? = unwrap(this).getXrayEnabled()

  public open fun xrayEnabled(`value`: Boolean) {
    unwrap(this).setXrayEnabled(`value`)
  }

  public open fun xrayEnabled(`value`: IResolvable) {
    unwrap(this).setXrayEnabled(`value`.let(IResolvable::unwrap))
  }

  public interface Builder {
    public fun additionalAuthenticationProviders(additionalAuthenticationProviders: IResolvable)

    public fun additionalAuthenticationProviders(additionalAuthenticationProviders: List<Any>)

    public fun apiType(apiType: String)

    public fun authenticationType(authenticationType: String)

    public fun enhancedMetricsConfig(enhancedMetricsConfig: IResolvable)

    public fun enhancedMetricsConfig(enhancedMetricsConfig: EnhancedMetricsConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32a3cbe12d2f9c1e1a862aab95ce5d1ed65deac5e1e157ce800b5bd5fb9660b0")
    public
        fun enhancedMetricsConfig(enhancedMetricsConfig: EnhancedMetricsConfigProperty.Builder.() -> Unit)

    public fun environmentVariables(environmentVariables: Any)

    public fun introspectionConfig(introspectionConfig: String)

    public fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: IResolvable)

    public fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da0488f40eaf1552ec2288dda6c9768e72ad743ce7745489d6072e08448f082f")
    public
        fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfigProperty.Builder.() -> Unit)

    public fun logConfig(logConfig: IResolvable)

    public fun logConfig(logConfig: LogConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2c348d48fad955cda15b42b518ffcbb90f81c47fad3596459e8ddc515e4cf07")
    public fun logConfig(logConfig: LogConfigProperty.Builder.() -> Unit)

    public fun mergedApiExecutionRoleArn(mergedApiExecutionRoleArn: String)

    public fun name(name: String)

    public fun openIdConnectConfig(openIdConnectConfig: IResolvable)

    public fun openIdConnectConfig(openIdConnectConfig: OpenIDConnectConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe4a9b46f44d59c47b3c13cb4b1549218bdb0f63f34a8a03263e81ca1c843d27")
    public
        fun openIdConnectConfig(openIdConnectConfig: OpenIDConnectConfigProperty.Builder.() -> Unit)

    public fun ownerContact(ownerContact: String)

    public fun queryDepthLimit(queryDepthLimit: Number)

    public fun resolverCountLimit(resolverCountLimit: Number)

    public fun tags(tags: List<CfnTag>)

    public fun userPoolConfig(userPoolConfig: IResolvable)

    public fun userPoolConfig(userPoolConfig: UserPoolConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a451ad14d60acde1fe3c55adbbc11e432d8495048e155210873a9d30f0d2b986")
    public fun userPoolConfig(userPoolConfig: UserPoolConfigProperty.Builder.() -> Unit)

    public fun visibility(visibility: String)

    public fun xrayEnabled(xrayEnabled: Boolean)

    public fun xrayEnabled(xrayEnabled: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnGraphQLApi.Builder =
        software.amazon.awscdk.services.appsync.CfnGraphQLApi.Builder.create(scope, id)

    override fun additionalAuthenticationProviders(additionalAuthenticationProviders: IResolvable) {
      cdkBuilder.additionalAuthenticationProviders(additionalAuthenticationProviders.let(IResolvable::unwrap))
    }

    override fun additionalAuthenticationProviders(additionalAuthenticationProviders: List<Any>) {
      cdkBuilder.additionalAuthenticationProviders(additionalAuthenticationProviders)
    }

    override fun apiType(apiType: String) {
      cdkBuilder.apiType(apiType)
    }

    override fun authenticationType(authenticationType: String) {
      cdkBuilder.authenticationType(authenticationType)
    }

    override fun enhancedMetricsConfig(enhancedMetricsConfig: IResolvable) {
      cdkBuilder.enhancedMetricsConfig(enhancedMetricsConfig.let(IResolvable::unwrap))
    }

    override fun enhancedMetricsConfig(enhancedMetricsConfig: EnhancedMetricsConfigProperty) {
      cdkBuilder.enhancedMetricsConfig(enhancedMetricsConfig.let(EnhancedMetricsConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32a3cbe12d2f9c1e1a862aab95ce5d1ed65deac5e1e157ce800b5bd5fb9660b0")
    override
        fun enhancedMetricsConfig(enhancedMetricsConfig: EnhancedMetricsConfigProperty.Builder.() -> Unit):
        Unit = enhancedMetricsConfig(EnhancedMetricsConfigProperty(enhancedMetricsConfig))

    override fun environmentVariables(environmentVariables: Any) {
      cdkBuilder.environmentVariables(environmentVariables)
    }

    override fun introspectionConfig(introspectionConfig: String) {
      cdkBuilder.introspectionConfig(introspectionConfig)
    }

    override fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: IResolvable) {
      cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig.let(IResolvable::unwrap))
    }

    override fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfigProperty) {
      cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig.let(LambdaAuthorizerConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da0488f40eaf1552ec2288dda6c9768e72ad743ce7745489d6072e08448f082f")
    override
        fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfigProperty.Builder.() -> Unit):
        Unit = lambdaAuthorizerConfig(LambdaAuthorizerConfigProperty(lambdaAuthorizerConfig))

    override fun logConfig(logConfig: IResolvable) {
      cdkBuilder.logConfig(logConfig.let(IResolvable::unwrap))
    }

    override fun logConfig(logConfig: LogConfigProperty) {
      cdkBuilder.logConfig(logConfig.let(LogConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2c348d48fad955cda15b42b518ffcbb90f81c47fad3596459e8ddc515e4cf07")
    override fun logConfig(logConfig: LogConfigProperty.Builder.() -> Unit): Unit =
        logConfig(LogConfigProperty(logConfig))

    override fun mergedApiExecutionRoleArn(mergedApiExecutionRoleArn: String) {
      cdkBuilder.mergedApiExecutionRoleArn(mergedApiExecutionRoleArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun openIdConnectConfig(openIdConnectConfig: IResolvable) {
      cdkBuilder.openIdConnectConfig(openIdConnectConfig.let(IResolvable::unwrap))
    }

    override fun openIdConnectConfig(openIdConnectConfig: OpenIDConnectConfigProperty) {
      cdkBuilder.openIdConnectConfig(openIdConnectConfig.let(OpenIDConnectConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe4a9b46f44d59c47b3c13cb4b1549218bdb0f63f34a8a03263e81ca1c843d27")
    override
        fun openIdConnectConfig(openIdConnectConfig: OpenIDConnectConfigProperty.Builder.() -> Unit):
        Unit = openIdConnectConfig(OpenIDConnectConfigProperty(openIdConnectConfig))

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

    override fun userPoolConfig(userPoolConfig: IResolvable) {
      cdkBuilder.userPoolConfig(userPoolConfig.let(IResolvable::unwrap))
    }

    override fun userPoolConfig(userPoolConfig: UserPoolConfigProperty) {
      cdkBuilder.userPoolConfig(userPoolConfig.let(UserPoolConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a451ad14d60acde1fe3c55adbbc11e432d8495048e155210873a9d30f0d2b986")
    override fun userPoolConfig(userPoolConfig: UserPoolConfigProperty.Builder.() -> Unit): Unit =
        userPoolConfig(UserPoolConfigProperty(userPoolConfig))

    override fun visibility(visibility: String) {
      cdkBuilder.visibility(visibility)
    }

    override fun xrayEnabled(xrayEnabled: Boolean) {
      cdkBuilder.xrayEnabled(xrayEnabled)
    }

    override fun xrayEnabled(xrayEnabled: IResolvable) {
      cdkBuilder.xrayEnabled(xrayEnabled.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnGraphQLApi = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGraphQLApi {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGraphQLApi(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLApi):
        CfnGraphQLApi = CfnGraphQLApi(cdkObject)

    internal fun unwrap(wrapped: CfnGraphQLApi):
        software.amazon.awscdk.services.appsync.CfnGraphQLApi = wrapped.cdkObject
  }

  public interface LogConfigProperty {
    public fun cloudWatchLogsRoleArn(): String? = unwrap(this).getCloudWatchLogsRoleArn()

    public fun excludeVerboseContent(): Any? = unwrap(this).getExcludeVerboseContent()

    public fun fieldLogLevel(): String? = unwrap(this).getFieldLogLevel()

    public interface Builder {
      public fun cloudWatchLogsRoleArn(cloudWatchLogsRoleArn: String)

      public fun excludeVerboseContent(excludeVerboseContent: Boolean)

      public fun excludeVerboseContent(excludeVerboseContent: IResolvable)

      public fun fieldLogLevel(fieldLogLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.LogConfigProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.LogConfigProperty.builder()

      override fun cloudWatchLogsRoleArn(cloudWatchLogsRoleArn: String) {
        cdkBuilder.cloudWatchLogsRoleArn(cloudWatchLogsRoleArn)
      }

      override fun excludeVerboseContent(excludeVerboseContent: Boolean) {
        cdkBuilder.excludeVerboseContent(excludeVerboseContent)
      }

      override fun excludeVerboseContent(excludeVerboseContent: IResolvable) {
        cdkBuilder.excludeVerboseContent(excludeVerboseContent.let(IResolvable::unwrap))
      }

      override fun fieldLogLevel(fieldLogLevel: String) {
        cdkBuilder.fieldLogLevel(fieldLogLevel)
      }

      public fun build(): software.amazon.awscdk.services.appsync.CfnGraphQLApi.LogConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.LogConfigProperty,
    ) : LogConfigProperty {
      override fun cloudWatchLogsRoleArn(): String? = unwrap(this).getCloudWatchLogsRoleArn()

      override fun excludeVerboseContent(): Any? = unwrap(this).getExcludeVerboseContent()

      override fun fieldLogLevel(): String? = unwrap(this).getFieldLogLevel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LogConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLApi.LogConfigProperty):
          LogConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogConfigProperty):
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.LogConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AdditionalAuthenticationProviderProperty {
    public fun authenticationType(): String

    public fun lambdaAuthorizerConfig(): Any? = unwrap(this).getLambdaAuthorizerConfig()

    public fun openIdConnectConfig(): Any? = unwrap(this).getOpenIdConnectConfig()

    public fun userPoolConfig(): Any? = unwrap(this).getUserPoolConfig()

    public interface Builder {
      public fun authenticationType(authenticationType: String)

      public fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: IResolvable)

      public fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c725c71f314c4bd56eb2b17f58b70b2d257681b61ea70bc4693e8c8a18bfd3e")
      public
          fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfigProperty.Builder.() -> Unit)

      public fun openIdConnectConfig(openIdConnectConfig: IResolvable)

      public fun openIdConnectConfig(openIdConnectConfig: OpenIDConnectConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9498b6b157ad96b3b0958064168aed6238968a8c43d4575f26c6084b6c2f039")
      public
          fun openIdConnectConfig(openIdConnectConfig: OpenIDConnectConfigProperty.Builder.() -> Unit)

      public fun userPoolConfig(userPoolConfig: IResolvable)

      public fun userPoolConfig(userPoolConfig: CognitoUserPoolConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b11fb0086d77979f441505f9978f2cde9cb032a3d2b086df92ff5a5070e180d0")
      public fun userPoolConfig(userPoolConfig: CognitoUserPoolConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.AdditionalAuthenticationProviderProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.AdditionalAuthenticationProviderProperty.builder()

      override fun authenticationType(authenticationType: String) {
        cdkBuilder.authenticationType(authenticationType)
      }

      override fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: IResolvable) {
        cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig.let(IResolvable::unwrap))
      }

      override fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfigProperty) {
        cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig.let(LambdaAuthorizerConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c725c71f314c4bd56eb2b17f58b70b2d257681b61ea70bc4693e8c8a18bfd3e")
      override
          fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfigProperty.Builder.() -> Unit):
          Unit = lambdaAuthorizerConfig(LambdaAuthorizerConfigProperty(lambdaAuthorizerConfig))

      override fun openIdConnectConfig(openIdConnectConfig: IResolvable) {
        cdkBuilder.openIdConnectConfig(openIdConnectConfig.let(IResolvable::unwrap))
      }

      override fun openIdConnectConfig(openIdConnectConfig: OpenIDConnectConfigProperty) {
        cdkBuilder.openIdConnectConfig(openIdConnectConfig.let(OpenIDConnectConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9498b6b157ad96b3b0958064168aed6238968a8c43d4575f26c6084b6c2f039")
      override
          fun openIdConnectConfig(openIdConnectConfig: OpenIDConnectConfigProperty.Builder.() -> Unit):
          Unit = openIdConnectConfig(OpenIDConnectConfigProperty(openIdConnectConfig))

      override fun userPoolConfig(userPoolConfig: IResolvable) {
        cdkBuilder.userPoolConfig(userPoolConfig.let(IResolvable::unwrap))
      }

      override fun userPoolConfig(userPoolConfig: CognitoUserPoolConfigProperty) {
        cdkBuilder.userPoolConfig(userPoolConfig.let(CognitoUserPoolConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b11fb0086d77979f441505f9978f2cde9cb032a3d2b086df92ff5a5070e180d0")
      override fun userPoolConfig(userPoolConfig: CognitoUserPoolConfigProperty.Builder.() -> Unit):
          Unit = userPoolConfig(CognitoUserPoolConfigProperty(userPoolConfig))

      public fun build():
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.AdditionalAuthenticationProviderProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.AdditionalAuthenticationProviderProperty,
    ) : AdditionalAuthenticationProviderProperty {
      override fun authenticationType(): String = unwrap(this).getAuthenticationType()

      override fun lambdaAuthorizerConfig(): Any? = unwrap(this).getLambdaAuthorizerConfig()

      override fun openIdConnectConfig(): Any? = unwrap(this).getOpenIdConnectConfig()

      override fun userPoolConfig(): Any? = unwrap(this).getUserPoolConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AdditionalAuthenticationProviderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLApi.AdditionalAuthenticationProviderProperty):
          AdditionalAuthenticationProviderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdditionalAuthenticationProviderProperty):
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.AdditionalAuthenticationProviderProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LambdaAuthorizerConfigProperty {
    public fun authorizerResultTtlInSeconds(): Number? =
        unwrap(this).getAuthorizerResultTtlInSeconds()

    public fun authorizerUri(): String? = unwrap(this).getAuthorizerUri()

    public fun identityValidationExpression(): String? =
        unwrap(this).getIdentityValidationExpression()

    public interface Builder {
      public fun authorizerResultTtlInSeconds(authorizerResultTtlInSeconds: Number)

      public fun authorizerUri(authorizerUri: String)

      public fun identityValidationExpression(identityValidationExpression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.LambdaAuthorizerConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.LambdaAuthorizerConfigProperty.builder()

      override fun authorizerResultTtlInSeconds(authorizerResultTtlInSeconds: Number) {
        cdkBuilder.authorizerResultTtlInSeconds(authorizerResultTtlInSeconds)
      }

      override fun authorizerUri(authorizerUri: String) {
        cdkBuilder.authorizerUri(authorizerUri)
      }

      override fun identityValidationExpression(identityValidationExpression: String) {
        cdkBuilder.identityValidationExpression(identityValidationExpression)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.LambdaAuthorizerConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.LambdaAuthorizerConfigProperty,
    ) : LambdaAuthorizerConfigProperty {
      override fun authorizerResultTtlInSeconds(): Number? =
          unwrap(this).getAuthorizerResultTtlInSeconds()

      override fun authorizerUri(): String? = unwrap(this).getAuthorizerUri()

      override fun identityValidationExpression(): String? =
          unwrap(this).getIdentityValidationExpression()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaAuthorizerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLApi.LambdaAuthorizerConfigProperty):
          LambdaAuthorizerConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaAuthorizerConfigProperty):
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.LambdaAuthorizerConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface OpenIDConnectConfigProperty {
    public fun authTtl(): Number? = unwrap(this).getAuthTtl()

    public fun clientId(): String? = unwrap(this).getClientId()

    public fun iatTtl(): Number? = unwrap(this).getIatTtl()

    public fun issuer(): String? = unwrap(this).getIssuer()

    public interface Builder {
      public fun authTtl(authTtl: Number)

      public fun clientId(clientId: String)

      public fun iatTtl(iatTtl: Number)

      public fun issuer(issuer: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty.builder()

      override fun authTtl(authTtl: Number) {
        cdkBuilder.authTtl(authTtl)
      }

      override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      override fun iatTtl(iatTtl: Number) {
        cdkBuilder.iatTtl(iatTtl)
      }

      override fun issuer(issuer: String) {
        cdkBuilder.issuer(issuer)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty,
    ) : OpenIDConnectConfigProperty {
      override fun authTtl(): Number? = unwrap(this).getAuthTtl()

      override fun clientId(): String? = unwrap(this).getClientId()

      override fun iatTtl(): Number? = unwrap(this).getIatTtl()

      override fun issuer(): String? = unwrap(this).getIssuer()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OpenIDConnectConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty):
          OpenIDConnectConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenIDConnectConfigProperty):
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CognitoUserPoolConfigProperty {
    public fun appIdClientRegex(): String? = unwrap(this).getAppIdClientRegex()

    public fun awsRegion(): String? = unwrap(this).getAwsRegion()

    public fun userPoolId(): String? = unwrap(this).getUserPoolId()

    public interface Builder {
      public fun appIdClientRegex(appIdClientRegex: String)

      public fun awsRegion(awsRegion: String)

      public fun userPoolId(userPoolId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.CognitoUserPoolConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.CognitoUserPoolConfigProperty.builder()

      override fun appIdClientRegex(appIdClientRegex: String) {
        cdkBuilder.appIdClientRegex(appIdClientRegex)
      }

      override fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
      }

      override fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.CognitoUserPoolConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.CognitoUserPoolConfigProperty,
    ) : CognitoUserPoolConfigProperty {
      override fun appIdClientRegex(): String? = unwrap(this).getAppIdClientRegex()

      override fun awsRegion(): String? = unwrap(this).getAwsRegion()

      override fun userPoolId(): String? = unwrap(this).getUserPoolId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CognitoUserPoolConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLApi.CognitoUserPoolConfigProperty):
          CognitoUserPoolConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CognitoUserPoolConfigProperty):
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.CognitoUserPoolConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface UserPoolConfigProperty {
    public fun appIdClientRegex(): String? = unwrap(this).getAppIdClientRegex()

    public fun awsRegion(): String? = unwrap(this).getAwsRegion()

    public fun defaultAction(): String? = unwrap(this).getDefaultAction()

    public fun userPoolId(): String? = unwrap(this).getUserPoolId()

    public interface Builder {
      public fun appIdClientRegex(appIdClientRegex: String)

      public fun awsRegion(awsRegion: String)

      public fun defaultAction(defaultAction: String)

      public fun userPoolId(userPoolId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty.builder()

      override fun appIdClientRegex(appIdClientRegex: String) {
        cdkBuilder.appIdClientRegex(appIdClientRegex)
      }

      override fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
      }

      override fun defaultAction(defaultAction: String) {
        cdkBuilder.defaultAction(defaultAction)
      }

      override fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty,
    ) : UserPoolConfigProperty {
      override fun appIdClientRegex(): String? = unwrap(this).getAppIdClientRegex()

      override fun awsRegion(): String? = unwrap(this).getAwsRegion()

      override fun defaultAction(): String? = unwrap(this).getDefaultAction()

      override fun userPoolId(): String? = unwrap(this).getUserPoolId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty):
          UserPoolConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserPoolConfigProperty):
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EnhancedMetricsConfigProperty {
    public fun dataSourceLevelMetricsBehavior(): String

    public fun operationLevelMetricsConfig(): String

    public fun resolverLevelMetricsBehavior(): String

    public interface Builder {
      public fun dataSourceLevelMetricsBehavior(dataSourceLevelMetricsBehavior: String)

      public fun operationLevelMetricsConfig(operationLevelMetricsConfig: String)

      public fun resolverLevelMetricsBehavior(resolverLevelMetricsBehavior: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.EnhancedMetricsConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.EnhancedMetricsConfigProperty.builder()

      override fun dataSourceLevelMetricsBehavior(dataSourceLevelMetricsBehavior: String) {
        cdkBuilder.dataSourceLevelMetricsBehavior(dataSourceLevelMetricsBehavior)
      }

      override fun operationLevelMetricsConfig(operationLevelMetricsConfig: String) {
        cdkBuilder.operationLevelMetricsConfig(operationLevelMetricsConfig)
      }

      override fun resolverLevelMetricsBehavior(resolverLevelMetricsBehavior: String) {
        cdkBuilder.resolverLevelMetricsBehavior(resolverLevelMetricsBehavior)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.EnhancedMetricsConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.EnhancedMetricsConfigProperty,
    ) : EnhancedMetricsConfigProperty {
      override fun dataSourceLevelMetricsBehavior(): String =
          unwrap(this).getDataSourceLevelMetricsBehavior()

      override fun operationLevelMetricsConfig(): String =
          unwrap(this).getOperationLevelMetricsConfig()

      override fun resolverLevelMetricsBehavior(): String =
          unwrap(this).getResolverLevelMetricsBehavior()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EnhancedMetricsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLApi.EnhancedMetricsConfigProperty):
          EnhancedMetricsConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnhancedMetricsConfigProperty):
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.EnhancedMetricsConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
