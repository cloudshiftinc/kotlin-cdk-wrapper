package io.cloudshiftdev.awscdk.services.apigatewayv2

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStage internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnStage,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accessLogSettings(): Any? = unwrap(this).getAccessLogSettings()

  public open fun accessLogSettings(`value`: IResolvable) {
    unwrap(this).setAccessLogSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun accessLogSettings(`value`: AccessLogSettingsProperty) {
    unwrap(this).setAccessLogSettings(`value`.let(AccessLogSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("96b519f37c351b900bbc8d823d89468d6f70799df8d8e0169f1ce73c47fb2cef")
  public open fun accessLogSettings(`value`: AccessLogSettingsProperty.Builder.() -> Unit): Unit =
      accessLogSettings(AccessLogSettingsProperty(`value`))

  public open fun accessPolicyId(): String? = unwrap(this).getAccessPolicyId()

  public open fun accessPolicyId(`value`: String) {
    unwrap(this).setAccessPolicyId(`value`)
  }

  public open fun apiId(): String = unwrap(this).getApiId()

  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun autoDeploy(): Any? = unwrap(this).getAutoDeploy()

  public open fun autoDeploy(`value`: Boolean) {
    unwrap(this).setAutoDeploy(`value`)
  }

  public open fun autoDeploy(`value`: IResolvable) {
    unwrap(this).setAutoDeploy(`value`.let(IResolvable::unwrap))
  }

  public open fun clientCertificateId(): String? = unwrap(this).getClientCertificateId()

  public open fun clientCertificateId(`value`: String) {
    unwrap(this).setClientCertificateId(`value`)
  }

  public open fun defaultRouteSettings(): Any? = unwrap(this).getDefaultRouteSettings()

  public open fun defaultRouteSettings(`value`: IResolvable) {
    unwrap(this).setDefaultRouteSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun defaultRouteSettings(`value`: RouteSettingsProperty) {
    unwrap(this).setDefaultRouteSettings(`value`.let(RouteSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("45d547b059de0befc3f7079840485becb528010646ece812662d2a7458dab8d8")
  public open fun defaultRouteSettings(`value`: RouteSettingsProperty.Builder.() -> Unit): Unit =
      defaultRouteSettings(RouteSettingsProperty(`value`))

  public open fun deploymentId(): String? = unwrap(this).getDeploymentId()

  public open fun deploymentId(`value`: String) {
    unwrap(this).setDeploymentId(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun routeSettings(): Any? = unwrap(this).getRouteSettings()

  public open fun routeSettings(`value`: Any) {
    unwrap(this).setRouteSettings(`value`)
  }

  public open fun stageName(): String = unwrap(this).getStageName()

  public open fun stageName(`value`: String) {
    unwrap(this).setStageName(`value`)
  }

  public open fun stageVariables(): Any? = unwrap(this).getStageVariables()

  public open fun stageVariables(`value`: Any) {
    unwrap(this).setStageVariables(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  public interface Builder {
    public fun accessLogSettings(accessLogSettings: IResolvable) {
    }

    public fun accessLogSettings(accessLogSettings: AccessLogSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a58ef6b84df182458625ad5f5f83d70249107a2184b05370a82781dc33fec2d1")
    public fun accessLogSettings(accessLogSettings: AccessLogSettingsProperty.Builder.() -> Unit) {
    }

    public fun accessPolicyId(accessPolicyId: String) {
    }

    public fun apiId(apiId: String) {
    }

    public fun autoDeploy(autoDeploy: Boolean) {
    }

    public fun autoDeploy(autoDeploy: IResolvable) {
    }

    public fun clientCertificateId(clientCertificateId: String) {
    }

    public fun defaultRouteSettings(defaultRouteSettings: IResolvable) {
    }

    public fun defaultRouteSettings(defaultRouteSettings: RouteSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee5d80c6370f78f22f429a8ee919098e4cc1e9bd6b3678cd5eb41fbaad58f70c")
    public
        fun defaultRouteSettings(defaultRouteSettings: RouteSettingsProperty.Builder.() -> Unit) {
    }

    public fun deploymentId(deploymentId: String) {
    }

    public fun description(description: String) {
    }

    public fun routeSettings(routeSettings: Any) {
    }

    public fun stageName(stageName: String) {
    }

    public fun stageVariables(stageVariables: Any) {
    }

    public fun tags(tags: Any) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnStage.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnStage.Builder.create(scope, id)

    public override fun accessLogSettings(accessLogSettings: IResolvable) {
      cdkBuilder.accessLogSettings(accessLogSettings.let(IResolvable::unwrap))
    }

    public override fun accessLogSettings(accessLogSettings: AccessLogSettingsProperty) {
      cdkBuilder.accessLogSettings(accessLogSettings.let(AccessLogSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a58ef6b84df182458625ad5f5f83d70249107a2184b05370a82781dc33fec2d1")
    public override
        fun accessLogSettings(accessLogSettings: AccessLogSettingsProperty.Builder.() -> Unit): Unit
        = accessLogSettings(AccessLogSettingsProperty(accessLogSettings))

    public override fun accessPolicyId(accessPolicyId: String) {
      cdkBuilder.accessPolicyId(accessPolicyId)
    }

    public override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    public override fun autoDeploy(autoDeploy: Boolean) {
      cdkBuilder.autoDeploy(autoDeploy)
    }

    public override fun autoDeploy(autoDeploy: IResolvable) {
      cdkBuilder.autoDeploy(autoDeploy.let(IResolvable::unwrap))
    }

    public override fun clientCertificateId(clientCertificateId: String) {
      cdkBuilder.clientCertificateId(clientCertificateId)
    }

    public override fun defaultRouteSettings(defaultRouteSettings: IResolvable) {
      cdkBuilder.defaultRouteSettings(defaultRouteSettings.let(IResolvable::unwrap))
    }

    public override fun defaultRouteSettings(defaultRouteSettings: RouteSettingsProperty) {
      cdkBuilder.defaultRouteSettings(defaultRouteSettings.let(RouteSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee5d80c6370f78f22f429a8ee919098e4cc1e9bd6b3678cd5eb41fbaad58f70c")
    public override
        fun defaultRouteSettings(defaultRouteSettings: RouteSettingsProperty.Builder.() -> Unit):
        Unit = defaultRouteSettings(RouteSettingsProperty(defaultRouteSettings))

    public override fun deploymentId(deploymentId: String) {
      cdkBuilder.deploymentId(deploymentId)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun routeSettings(routeSettings: Any) {
      cdkBuilder.routeSettings(routeSettings)
    }

    public override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public override fun stageVariables(stageVariables: Any) {
      cdkBuilder.stageVariables(stageVariables)
    }

    public override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnStage = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStage {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnStage): CfnStage =
        CfnStage(cdkObject)

    internal fun unwrap(wrapped: CfnStage): software.amazon.awscdk.services.apigatewayv2.CfnStage =
        wrapped.cdkObject
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
          software.amazon.awscdk.services.apigatewayv2.CfnStage.RouteSettingsProperty.Builder =
          software.amazon.awscdk.services.apigatewayv2.CfnStage.RouteSettingsProperty.builder()

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

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnStage.RouteSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnStage.RouteSettingsProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnStage.RouteSettingsProperty):
          RouteSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RouteSettingsProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnStage.RouteSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AccessLogSettingsProperty {
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
          software.amazon.awscdk.services.apigatewayv2.CfnStage.AccessLogSettingsProperty.Builder =
          software.amazon.awscdk.services.apigatewayv2.CfnStage.AccessLogSettingsProperty.builder()

      public override fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
      }

      public override fun format(format: String) {
        cdkBuilder.format(format)
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnStage.AccessLogSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnStage.AccessLogSettingsProperty,
    ) : AccessLogSettingsProperty {
      public override fun destinationArn(): String? = unwrap(this).getDestinationArn()

      public override fun format(): String? = unwrap(this).getFormat()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AccessLogSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnStage.AccessLogSettingsProperty):
          AccessLogSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessLogSettingsProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnStage.AccessLogSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
