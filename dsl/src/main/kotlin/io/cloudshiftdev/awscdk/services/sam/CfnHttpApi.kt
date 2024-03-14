package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.CfnResource
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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnHttpApi internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accessLogSetting(): Any? = unwrap(this).getAccessLogSetting()

  public open fun accessLogSetting(`value`: IResolvable) {
    unwrap(this).setAccessLogSetting(`value`.let(IResolvable::unwrap))
  }

  public open fun accessLogSetting(`value`: AccessLogSettingProperty) {
    unwrap(this).setAccessLogSetting(`value`.let(AccessLogSettingProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ce708fc1fe5bf19c828d53af99612ccd2101227d2fe37d49aa28eb147d43bce9")
  public open fun accessLogSetting(`value`: AccessLogSettingProperty.Builder.() -> Unit): Unit =
      accessLogSetting(AccessLogSettingProperty(`value`))

  public open fun auth(): Any? = unwrap(this).getAuth()

  public open fun auth(`value`: IResolvable) {
    unwrap(this).setAuth(`value`.let(IResolvable::unwrap))
  }

  public open fun auth(`value`: HttpApiAuthProperty) {
    unwrap(this).setAuth(`value`.let(HttpApiAuthProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7c140977d6b47eb6b761dc4354f7e3fbd2add8bee67eb227a7d089df170d80b8")
  public open fun auth(`value`: HttpApiAuthProperty.Builder.() -> Unit): Unit =
      auth(HttpApiAuthProperty(`value`))

  public open fun corsConfiguration(): Any? = unwrap(this).getCorsConfiguration()

  public open fun corsConfiguration(`value`: Boolean) {
    unwrap(this).setCorsConfiguration(`value`)
  }

  public open fun corsConfiguration(`value`: IResolvable) {
    unwrap(this).setCorsConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun corsConfiguration(`value`: CorsConfigurationObjectProperty) {
    unwrap(this).setCorsConfiguration(`value`.let(CorsConfigurationObjectProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9301c7e41885df338be2950f469d009888b23401909b126267c245670dd13cb5")
  public open fun corsConfiguration(`value`: CorsConfigurationObjectProperty.Builder.() -> Unit):
      Unit = corsConfiguration(CorsConfigurationObjectProperty(`value`))

  public open fun defaultRouteSettings(): Any? = unwrap(this).getDefaultRouteSettings()

  public open fun defaultRouteSettings(`value`: IResolvable) {
    unwrap(this).setDefaultRouteSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun defaultRouteSettings(`value`: RouteSettingsProperty) {
    unwrap(this).setDefaultRouteSettings(`value`.let(RouteSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e23c44addc95584779f8a58ec56681801dffde3ab12b1ba7e6e5ffa4070f464b")
  public open fun defaultRouteSettings(`value`: RouteSettingsProperty.Builder.() -> Unit): Unit =
      defaultRouteSettings(RouteSettingsProperty(`value`))

  public open fun definitionBody(): Any? = unwrap(this).getDefinitionBody()

  public open fun definitionBody(`value`: Any) {
    unwrap(this).setDefinitionBody(`value`)
  }

  public open fun definitionUri(): Any? = unwrap(this).getDefinitionUri()

  public open fun definitionUri(`value`: String) {
    unwrap(this).setDefinitionUri(`value`)
  }

  public open fun definitionUri(`value`: IResolvable) {
    unwrap(this).setDefinitionUri(`value`.let(IResolvable::unwrap))
  }

  public open fun definitionUri(`value`: S3LocationProperty) {
    unwrap(this).setDefinitionUri(`value`.let(S3LocationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9ab18e80f66bf974d61b6f815ea904fca29e52883e66f9156be72dacf0bcdb0a")
  public open fun definitionUri(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      definitionUri(S3LocationProperty(`value`))

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

  public open fun domain(): Any? = unwrap(this).getDomain()

  public open fun domain(`value`: IResolvable) {
    unwrap(this).setDomain(`value`.let(IResolvable::unwrap))
  }

  public open fun domain(`value`: HttpApiDomainConfigurationProperty) {
    unwrap(this).setDomain(`value`.let(HttpApiDomainConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8e6e0606e7edc5e4f6d0fa3af0827294bbdcbb3c54ecd00c73c936e95940e0b7")
  public open fun domain(`value`: HttpApiDomainConfigurationProperty.Builder.() -> Unit): Unit =
      domain(HttpApiDomainConfigurationProperty(`value`))

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

  public open fun routeSettings(): Any? = unwrap(this).getRouteSettings()

  public open fun routeSettings(`value`: IResolvable) {
    unwrap(this).setRouteSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun routeSettings(`value`: RouteSettingsProperty) {
    unwrap(this).setRouteSettings(`value`.let(RouteSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("122db4170fc5e96f6e66ba4c6d164aa7afd1ce71d37854a0a74feed912945a13")
  public open fun routeSettings(`value`: RouteSettingsProperty.Builder.() -> Unit): Unit =
      routeSettings(RouteSettingsProperty(`value`))

  public open fun stageName(): String? = unwrap(this).getStageName()

  public open fun stageName(`value`: String) {
    unwrap(this).setStageName(`value`)
  }

  public open fun stageVariables(): Any? = unwrap(this).getStageVariables()

  public open fun stageVariables(`value`: IResolvable) {
    unwrap(this).setStageVariables(`value`.let(IResolvable::unwrap))
  }

  public open fun stageVariables(`value`: Map<String, String>) {
    unwrap(this).setStageVariables(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public interface Builder {
    public fun accessLogSetting(accessLogSetting: IResolvable) {
    }

    public fun accessLogSetting(accessLogSetting: AccessLogSettingProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27fc057401a5d7a5d013ac2bb6d28842a5ff241951767bce13ec3850d1f787ad")
    public fun accessLogSetting(accessLogSetting: AccessLogSettingProperty.Builder.() -> Unit) {
    }

    public fun auth(auth: IResolvable) {
    }

    public fun auth(auth: HttpApiAuthProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a779237a63b2c50dcc942019ee720af6ff6a169c8ee8100e54f5fbdbe7495cd9")
    public fun auth(auth: HttpApiAuthProperty.Builder.() -> Unit) {
    }

    public fun corsConfiguration(corsConfiguration: Boolean) {
    }

    public fun corsConfiguration(corsConfiguration: IResolvable) {
    }

    public fun corsConfiguration(corsConfiguration: CorsConfigurationObjectProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c4352e90c50a24ba2c5ab20731e2d41f0d2cdd3c4b1c8c36a20b7145bd68ca5")
    public
        fun corsConfiguration(corsConfiguration: CorsConfigurationObjectProperty.Builder.() -> Unit) {
    }

    public fun defaultRouteSettings(defaultRouteSettings: IResolvable) {
    }

    public fun defaultRouteSettings(defaultRouteSettings: RouteSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d02f4ebd0b0030589ef3027f71a159ddd8df4faf6defa9c9b36f4f96faf2ded")
    public
        fun defaultRouteSettings(defaultRouteSettings: RouteSettingsProperty.Builder.() -> Unit) {
    }

    public fun definitionBody(definitionBody: Any) {
    }

    public fun definitionUri(definitionUri: String) {
    }

    public fun definitionUri(definitionUri: IResolvable) {
    }

    public fun definitionUri(definitionUri: S3LocationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ccd2a4751970c416ab43589ee56d5f47ba4322661d82c438df9fc9c7b171174")
    public fun definitionUri(definitionUri: S3LocationProperty.Builder.() -> Unit) {
    }

    public fun description(description: String) {
    }

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
    }

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable) {
    }

    public fun domain(domain: IResolvable) {
    }

    public fun domain(domain: HttpApiDomainConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("055db83241c767b60ce00b8122ea0426e3797afdd652679e11aa097044dae30c")
    public fun domain(domain: HttpApiDomainConfigurationProperty.Builder.() -> Unit) {
    }

    public fun failOnWarnings(failOnWarnings: Boolean) {
    }

    public fun failOnWarnings(failOnWarnings: IResolvable) {
    }

    public fun routeSettings(routeSettings: IResolvable) {
    }

    public fun routeSettings(routeSettings: RouteSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93572e5fb6b2eb215ed7e170356249b7724ef9b63ed9dc5385838c39ee82aa8c")
    public fun routeSettings(routeSettings: RouteSettingsProperty.Builder.() -> Unit) {
    }

    public fun stageName(stageName: String) {
    }

    public fun stageVariables(stageVariables: IResolvable) {
    }

    public fun stageVariables(stageVariables: Map<String, String>) {
    }

    public fun tags(tags: Map<String, String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnHttpApi.Builder =
        software.amazon.awscdk.services.sam.CfnHttpApi.Builder.create(scope, id)

    public override fun accessLogSetting(accessLogSetting: IResolvable) {
      cdkBuilder.accessLogSetting(accessLogSetting.let(IResolvable::unwrap))
    }

    public override fun accessLogSetting(accessLogSetting: AccessLogSettingProperty) {
      cdkBuilder.accessLogSetting(accessLogSetting.let(AccessLogSettingProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27fc057401a5d7a5d013ac2bb6d28842a5ff241951767bce13ec3850d1f787ad")
    public override
        fun accessLogSetting(accessLogSetting: AccessLogSettingProperty.Builder.() -> Unit): Unit =
        accessLogSetting(AccessLogSettingProperty(accessLogSetting))

    public override fun auth(auth: IResolvable) {
      cdkBuilder.auth(auth.let(IResolvable::unwrap))
    }

    public override fun auth(auth: HttpApiAuthProperty) {
      cdkBuilder.auth(auth.let(HttpApiAuthProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a779237a63b2c50dcc942019ee720af6ff6a169c8ee8100e54f5fbdbe7495cd9")
    public override fun auth(auth: HttpApiAuthProperty.Builder.() -> Unit): Unit =
        auth(HttpApiAuthProperty(auth))

    public override fun corsConfiguration(corsConfiguration: Boolean) {
      cdkBuilder.corsConfiguration(corsConfiguration)
    }

    public override fun corsConfiguration(corsConfiguration: IResolvable) {
      cdkBuilder.corsConfiguration(corsConfiguration.let(IResolvable::unwrap))
    }

    public override fun corsConfiguration(corsConfiguration: CorsConfigurationObjectProperty) {
      cdkBuilder.corsConfiguration(corsConfiguration.let(CorsConfigurationObjectProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c4352e90c50a24ba2c5ab20731e2d41f0d2cdd3c4b1c8c36a20b7145bd68ca5")
    public override
        fun corsConfiguration(corsConfiguration: CorsConfigurationObjectProperty.Builder.() -> Unit):
        Unit = corsConfiguration(CorsConfigurationObjectProperty(corsConfiguration))

    public override fun defaultRouteSettings(defaultRouteSettings: IResolvable) {
      cdkBuilder.defaultRouteSettings(defaultRouteSettings.let(IResolvable::unwrap))
    }

    public override fun defaultRouteSettings(defaultRouteSettings: RouteSettingsProperty) {
      cdkBuilder.defaultRouteSettings(defaultRouteSettings.let(RouteSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d02f4ebd0b0030589ef3027f71a159ddd8df4faf6defa9c9b36f4f96faf2ded")
    public override
        fun defaultRouteSettings(defaultRouteSettings: RouteSettingsProperty.Builder.() -> Unit):
        Unit = defaultRouteSettings(RouteSettingsProperty(defaultRouteSettings))

    public override fun definitionBody(definitionBody: Any) {
      cdkBuilder.definitionBody(definitionBody)
    }

    public override fun definitionUri(definitionUri: String) {
      cdkBuilder.definitionUri(definitionUri)
    }

    public override fun definitionUri(definitionUri: IResolvable) {
      cdkBuilder.definitionUri(definitionUri.let(IResolvable::unwrap))
    }

    public override fun definitionUri(definitionUri: S3LocationProperty) {
      cdkBuilder.definitionUri(definitionUri.let(S3LocationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ccd2a4751970c416ab43589ee56d5f47ba4322661d82c438df9fc9c7b171174")
    public override fun definitionUri(definitionUri: S3LocationProperty.Builder.() -> Unit): Unit =
        definitionUri(S3LocationProperty(definitionUri))

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    public override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint.let(IResolvable::unwrap))
    }

    public override fun domain(domain: IResolvable) {
      cdkBuilder.domain(domain.let(IResolvable::unwrap))
    }

    public override fun domain(domain: HttpApiDomainConfigurationProperty) {
      cdkBuilder.domain(domain.let(HttpApiDomainConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("055db83241c767b60ce00b8122ea0426e3797afdd652679e11aa097044dae30c")
    public override fun domain(domain: HttpApiDomainConfigurationProperty.Builder.() -> Unit): Unit
        = domain(HttpApiDomainConfigurationProperty(domain))

    public override fun failOnWarnings(failOnWarnings: Boolean) {
      cdkBuilder.failOnWarnings(failOnWarnings)
    }

    public override fun failOnWarnings(failOnWarnings: IResolvable) {
      cdkBuilder.failOnWarnings(failOnWarnings.let(IResolvable::unwrap))
    }

    public override fun routeSettings(routeSettings: IResolvable) {
      cdkBuilder.routeSettings(routeSettings.let(IResolvable::unwrap))
    }

    public override fun routeSettings(routeSettings: RouteSettingsProperty) {
      cdkBuilder.routeSettings(routeSettings.let(RouteSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93572e5fb6b2eb215ed7e170356249b7724ef9b63ed9dc5385838c39ee82aa8c")
    public override fun routeSettings(routeSettings: RouteSettingsProperty.Builder.() -> Unit): Unit
        = routeSettings(RouteSettingsProperty(routeSettings))

    public override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public override fun stageVariables(stageVariables: IResolvable) {
      cdkBuilder.stageVariables(stageVariables.let(IResolvable::unwrap))
    }

    public override fun stageVariables(stageVariables: Map<String, String>) {
      cdkBuilder.stageVariables(stageVariables)
    }

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.sam.CfnHttpApi = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnHttpApi {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnHttpApi(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi): CfnHttpApi =
        CfnHttpApi(cdkObject)

    internal fun unwrap(wrapped: CfnHttpApi): software.amazon.awscdk.services.sam.CfnHttpApi =
        wrapped.cdkObject
  }

  public interface AccessLogSettingProperty {
    public fun destinationArn(): String? = unwrap(this).getDestinationArn()

    public fun format(): String? = unwrap(this).getFormat()

    public interface Builder {
      public fun destinationArn(destinationArn: String) {
      }

      public fun format(format: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnHttpApi.AccessLogSettingProperty.Builder =
          software.amazon.awscdk.services.sam.CfnHttpApi.AccessLogSettingProperty.builder()

      public override fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
      }

      public override fun format(format: String) {
        cdkBuilder.format(format)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnHttpApi.AccessLogSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnHttpApi.AccessLogSettingProperty,
    ) : AccessLogSettingProperty {
      public override fun destinationArn(): String? = unwrap(this).getDestinationArn()

      public override fun format(): String? = unwrap(this).getFormat()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AccessLogSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi.AccessLogSettingProperty):
          AccessLogSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessLogSettingProperty):
          software.amazon.awscdk.services.sam.CfnHttpApi.AccessLogSettingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface Route53ConfigurationProperty {
    public fun distributedDomainName(): String? = unwrap(this).getDistributedDomainName()

    public fun evaluateTargetHealth(): Any? = unwrap(this).getEvaluateTargetHealth()

    public fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

    public fun hostedZoneName(): String? = unwrap(this).getHostedZoneName()

    public fun ipV6(): Any? = unwrap(this).getIpV6()

    public interface Builder {
      public fun distributedDomainName(distributedDomainName: String) {
      }

      public fun evaluateTargetHealth(evaluateTargetHealth: Boolean) {
      }

      public fun evaluateTargetHealth(evaluateTargetHealth: IResolvable) {
      }

      public fun hostedZoneId(hostedZoneId: String) {
      }

      public fun hostedZoneName(hostedZoneName: String) {
      }

      public fun ipV6(ipV6: Boolean) {
      }

      public fun ipV6(ipV6: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnHttpApi.Route53ConfigurationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnHttpApi.Route53ConfigurationProperty.builder()

      public override fun distributedDomainName(distributedDomainName: String) {
        cdkBuilder.distributedDomainName(distributedDomainName)
      }

      public override fun evaluateTargetHealth(evaluateTargetHealth: Boolean) {
        cdkBuilder.evaluateTargetHealth(evaluateTargetHealth)
      }

      public override fun evaluateTargetHealth(evaluateTargetHealth: IResolvable) {
        cdkBuilder.evaluateTargetHealth(evaluateTargetHealth.let(IResolvable::unwrap))
      }

      public override fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
      }

      public override fun hostedZoneName(hostedZoneName: String) {
        cdkBuilder.hostedZoneName(hostedZoneName)
      }

      public override fun ipV6(ipV6: Boolean) {
        cdkBuilder.ipV6(ipV6)
      }

      public override fun ipV6(ipV6: IResolvable) {
        cdkBuilder.ipV6(ipV6.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnHttpApi.Route53ConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnHttpApi.Route53ConfigurationProperty,
    ) : Route53ConfigurationProperty {
      public override fun distributedDomainName(): String? = unwrap(this).getDistributedDomainName()

      public override fun evaluateTargetHealth(): Any? = unwrap(this).getEvaluateTargetHealth()

      public override fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

      public override fun hostedZoneName(): String? = unwrap(this).getHostedZoneName()

      public override fun ipV6(): Any? = unwrap(this).getIpV6()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): Route53ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi.Route53ConfigurationProperty):
          Route53ConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Route53ConfigurationProperty):
          software.amazon.awscdk.services.sam.CfnHttpApi.Route53ConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HttpApiAuthProperty {
    public fun authorizers(): Any? = unwrap(this).getAuthorizers()

    public fun defaultAuthorizer(): String? = unwrap(this).getDefaultAuthorizer()

    public interface Builder {
      public fun authorizers(authorizers: Any) {
      }

      public fun defaultAuthorizer(defaultAuthorizer: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiAuthProperty.Builder =
          software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiAuthProperty.builder()

      public override fun authorizers(authorizers: Any) {
        cdkBuilder.authorizers(authorizers)
      }

      public override fun defaultAuthorizer(defaultAuthorizer: String) {
        cdkBuilder.defaultAuthorizer(defaultAuthorizer)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiAuthProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiAuthProperty,
    ) : HttpApiAuthProperty {
      public override fun authorizers(): Any? = unwrap(this).getAuthorizers()

      public override fun defaultAuthorizer(): String? = unwrap(this).getDefaultAuthorizer()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HttpApiAuthProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiAuthProperty):
          HttpApiAuthProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpApiAuthProperty):
          software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiAuthProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface S3LocationProperty {
    public fun bucket(): String

    public fun key(): String

    public fun version(): Number

    public interface Builder {
      public fun bucket(bucket: String) {
      }

      public fun key(key: String) {
      }

      public fun version(version: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnHttpApi.S3LocationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnHttpApi.S3LocationProperty.builder()

      public override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun version(version: Number) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnHttpApi.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi.S3LocationProperty,
    ) : S3LocationProperty {
      public override fun bucket(): String = unwrap(this).getBucket()

      public override fun key(): String = unwrap(this).getKey()

      public override fun version(): Number = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi.S3LocationProperty):
          S3LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.sam.CfnHttpApi.S3LocationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CorsConfigurationObjectProperty {
    public fun allowCredentials(): Any? = unwrap(this).getAllowCredentials()

    public fun allowHeaders(): List<String> = unwrap(this).getAllowHeaders() ?: emptyList()

    public fun allowMethods(): List<String> = unwrap(this).getAllowMethods() ?: emptyList()

    public fun allowOrigins(): List<String> = unwrap(this).getAllowOrigins() ?: emptyList()

    public fun exposeHeaders(): List<String> = unwrap(this).getExposeHeaders() ?: emptyList()

    public fun maxAge(): Number? = unwrap(this).getMaxAge()

    public interface Builder {
      public fun allowCredentials(allowCredentials: Boolean) {
      }

      public fun allowCredentials(allowCredentials: IResolvable) {
      }

      public fun allowHeaders(allowHeaders: List<String>) {
      }

      public fun allowMethods(allowMethods: List<String>) {
      }

      public fun allowOrigins(allowOrigins: List<String>) {
      }

      public fun exposeHeaders(exposeHeaders: List<String>) {
      }

      public fun maxAge(maxAge: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnHttpApi.CorsConfigurationObjectProperty.Builder =
          software.amazon.awscdk.services.sam.CfnHttpApi.CorsConfigurationObjectProperty.builder()

      public override fun allowCredentials(allowCredentials: Boolean) {
        cdkBuilder.allowCredentials(allowCredentials)
      }

      public override fun allowCredentials(allowCredentials: IResolvable) {
        cdkBuilder.allowCredentials(allowCredentials.let(IResolvable::unwrap))
      }

      public override fun allowHeaders(allowHeaders: List<String>) {
        cdkBuilder.allowHeaders(allowHeaders)
      }

      public override fun allowMethods(allowMethods: List<String>) {
        cdkBuilder.allowMethods(allowMethods)
      }

      public override fun allowOrigins(allowOrigins: List<String>) {
        cdkBuilder.allowOrigins(allowOrigins)
      }

      public override fun exposeHeaders(exposeHeaders: List<String>) {
        cdkBuilder.exposeHeaders(exposeHeaders)
      }

      public override fun maxAge(maxAge: Number) {
        cdkBuilder.maxAge(maxAge)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnHttpApi.CorsConfigurationObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnHttpApi.CorsConfigurationObjectProperty,
    ) : CorsConfigurationObjectProperty {
      public override fun allowCredentials(): Any? = unwrap(this).getAllowCredentials()

      public override fun allowHeaders(): List<String> = unwrap(this).getAllowHeaders() ?:
          emptyList()

      public override fun allowMethods(): List<String> = unwrap(this).getAllowMethods() ?:
          emptyList()

      public override fun allowOrigins(): List<String> = unwrap(this).getAllowOrigins() ?:
          emptyList()

      public override fun exposeHeaders(): List<String> = unwrap(this).getExposeHeaders() ?:
          emptyList()

      public override fun maxAge(): Number? = unwrap(this).getMaxAge()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CorsConfigurationObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi.CorsConfigurationObjectProperty):
          CorsConfigurationObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CorsConfigurationObjectProperty):
          software.amazon.awscdk.services.sam.CfnHttpApi.CorsConfigurationObjectProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RouteSettingsProperty {
    public fun dataTraceEnabled(): Any? = unwrap(this).getDataTraceEnabled()

    public fun detailedMetricsEnabled(): Any? = unwrap(this).getDetailedMetricsEnabled()

    public fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

    public fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

    public fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()

    public interface Builder {
      public fun dataTraceEnabled(dataTraceEnabled: Boolean) {
      }

      public fun dataTraceEnabled(dataTraceEnabled: IResolvable) {
      }

      public fun detailedMetricsEnabled(detailedMetricsEnabled: Boolean) {
      }

      public fun detailedMetricsEnabled(detailedMetricsEnabled: IResolvable) {
      }

      public fun loggingLevel(loggingLevel: String) {
      }

      public fun throttlingBurstLimit(throttlingBurstLimit: Number) {
      }

      public fun throttlingRateLimit(throttlingRateLimit: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnHttpApi.RouteSettingsProperty.Builder =
          software.amazon.awscdk.services.sam.CfnHttpApi.RouteSettingsProperty.builder()

      public override fun dataTraceEnabled(dataTraceEnabled: Boolean) {
        cdkBuilder.dataTraceEnabled(dataTraceEnabled)
      }

      public override fun dataTraceEnabled(dataTraceEnabled: IResolvable) {
        cdkBuilder.dataTraceEnabled(dataTraceEnabled.let(IResolvable::unwrap))
      }

      public override fun detailedMetricsEnabled(detailedMetricsEnabled: Boolean) {
        cdkBuilder.detailedMetricsEnabled(detailedMetricsEnabled)
      }

      public override fun detailedMetricsEnabled(detailedMetricsEnabled: IResolvable) {
        cdkBuilder.detailedMetricsEnabled(detailedMetricsEnabled.let(IResolvable::unwrap))
      }

      public override fun loggingLevel(loggingLevel: String) {
        cdkBuilder.loggingLevel(loggingLevel)
      }

      public override fun throttlingBurstLimit(throttlingBurstLimit: Number) {
        cdkBuilder.throttlingBurstLimit(throttlingBurstLimit)
      }

      public override fun throttlingRateLimit(throttlingRateLimit: Number) {
        cdkBuilder.throttlingRateLimit(throttlingRateLimit)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnHttpApi.RouteSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi.RouteSettingsProperty,
    ) : RouteSettingsProperty {
      public override fun dataTraceEnabled(): Any? = unwrap(this).getDataTraceEnabled()

      public override fun detailedMetricsEnabled(): Any? = unwrap(this).getDetailedMetricsEnabled()

      public override fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

      public override fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

      public override fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RouteSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi.RouteSettingsProperty):
          RouteSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RouteSettingsProperty):
          software.amazon.awscdk.services.sam.CfnHttpApi.RouteSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HttpApiDomainConfigurationProperty {
    public fun basePath(): String? = unwrap(this).getBasePath()

    public fun certificateArn(): String

    public fun domainName(): String

    public fun endpointConfiguration(): String? = unwrap(this).getEndpointConfiguration()

    public fun mutualTlsAuthentication(): Any? = unwrap(this).getMutualTlsAuthentication()

    public fun route53(): Any? = unwrap(this).getRoute53()

    public fun securityPolicy(): String? = unwrap(this).getSecurityPolicy()

    public interface Builder {
      public fun basePath(basePath: String) {
      }

      public fun certificateArn(certificateArn: String) {
      }

      public fun domainName(domainName: String) {
      }

      public fun endpointConfiguration(endpointConfiguration: String) {
      }

      public fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable) {
      }

      public fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ebbd369bbb40ad9e4f1179ca1cc8feae7276cbb795324b2f8da2fccf02b0b79")
      public
          fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty.Builder.() -> Unit) {
      }

      public fun route53(route53: IResolvable) {
      }

      public fun route53(route53: Route53ConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b6331a04a6ef8ba36f6b2651865c2f144da7d8b7b382edf672071be6f227a254")
      public fun route53(route53: Route53ConfigurationProperty.Builder.() -> Unit) {
      }

      public fun securityPolicy(securityPolicy: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiDomainConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiDomainConfigurationProperty.builder()

      public override fun basePath(basePath: String) {
        cdkBuilder.basePath(basePath)
      }

      public override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      public override fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
      }

      public override fun endpointConfiguration(endpointConfiguration: String) {
        cdkBuilder.endpointConfiguration(endpointConfiguration)
      }

      public override fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable) {
        cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication.let(IResolvable::unwrap))
      }

      public override
          fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty) {
        cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication.let(MutualTlsAuthenticationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ebbd369bbb40ad9e4f1179ca1cc8feae7276cbb795324b2f8da2fccf02b0b79")
      public override
          fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty.Builder.() -> Unit):
          Unit = mutualTlsAuthentication(MutualTlsAuthenticationProperty(mutualTlsAuthentication))

      public override fun route53(route53: IResolvable) {
        cdkBuilder.route53(route53.let(IResolvable::unwrap))
      }

      public override fun route53(route53: Route53ConfigurationProperty) {
        cdkBuilder.route53(route53.let(Route53ConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b6331a04a6ef8ba36f6b2651865c2f144da7d8b7b382edf672071be6f227a254")
      public override fun route53(route53: Route53ConfigurationProperty.Builder.() -> Unit): Unit =
          route53(Route53ConfigurationProperty(route53))

      public override fun securityPolicy(securityPolicy: String) {
        cdkBuilder.securityPolicy(securityPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiDomainConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiDomainConfigurationProperty,
    ) : HttpApiDomainConfigurationProperty {
      public override fun basePath(): String? = unwrap(this).getBasePath()

      public override fun certificateArn(): String = unwrap(this).getCertificateArn()

      public override fun domainName(): String = unwrap(this).getDomainName()

      public override fun endpointConfiguration(): String? = unwrap(this).getEndpointConfiguration()

      public override fun mutualTlsAuthentication(): Any? =
          unwrap(this).getMutualTlsAuthentication()

      public override fun route53(): Any? = unwrap(this).getRoute53()

      public override fun securityPolicy(): String? = unwrap(this).getSecurityPolicy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          HttpApiDomainConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiDomainConfigurationProperty):
          HttpApiDomainConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpApiDomainConfigurationProperty):
          software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiDomainConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MutualTlsAuthenticationProperty {
    public fun truststoreUri(): String? = unwrap(this).getTruststoreUri()

    public fun truststoreVersion(): Any? = unwrap(this).getTruststoreVersion()

    public interface Builder {
      public fun truststoreUri(truststoreUri: String) {
      }

      public fun truststoreVersion(truststoreVersion: Boolean) {
      }

      public fun truststoreVersion(truststoreVersion: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnHttpApi.MutualTlsAuthenticationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnHttpApi.MutualTlsAuthenticationProperty.builder()

      public override fun truststoreUri(truststoreUri: String) {
        cdkBuilder.truststoreUri(truststoreUri)
      }

      public override fun truststoreVersion(truststoreVersion: Boolean) {
        cdkBuilder.truststoreVersion(truststoreVersion)
      }

      public override fun truststoreVersion(truststoreVersion: IResolvable) {
        cdkBuilder.truststoreVersion(truststoreVersion.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnHttpApi.MutualTlsAuthenticationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnHttpApi.MutualTlsAuthenticationProperty,
    ) : MutualTlsAuthenticationProperty {
      public override fun truststoreUri(): String? = unwrap(this).getTruststoreUri()

      public override fun truststoreVersion(): Any? = unwrap(this).getTruststoreVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MutualTlsAuthenticationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi.MutualTlsAuthenticationProperty):
          MutualTlsAuthenticationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MutualTlsAuthenticationProperty):
          software.amazon.awscdk.services.sam.CfnHttpApi.MutualTlsAuthenticationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
