package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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

public open class CfnApiGatewayManagedOverrides internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides,
) : CfnResource(cdkObject), IInspectable {
  public open fun apiId(): String = unwrap(this).getApiId()

  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun integration(): Any? = unwrap(this).getIntegration()

  public open fun integration(`value`: IResolvable) {
    unwrap(this).setIntegration(`value`.let(IResolvable::unwrap))
  }

  public open fun integration(`value`: IntegrationOverridesProperty) {
    unwrap(this).setIntegration(`value`.let(IntegrationOverridesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d227913a4f3e56ca715c309ba6e5e982dfdb88590d0d2e1c89e61cf2459504b5")
  public open fun integration(`value`: IntegrationOverridesProperty.Builder.() -> Unit): Unit =
      integration(IntegrationOverridesProperty(`value`))

  public open fun route(): Any? = unwrap(this).getRoute()

  public open fun route(`value`: IResolvable) {
    unwrap(this).setRoute(`value`.let(IResolvable::unwrap))
  }

  public open fun route(`value`: RouteOverridesProperty) {
    unwrap(this).setRoute(`value`.let(RouteOverridesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ca232602418b963933c78f051960c14f1306082fe35667538d9823f7a2319a4b")
  public open fun route(`value`: RouteOverridesProperty.Builder.() -> Unit): Unit =
      route(RouteOverridesProperty(`value`))

  public open fun stage(): Any? = unwrap(this).getStage()

  public open fun stage(`value`: IResolvable) {
    unwrap(this).setStage(`value`.let(IResolvable::unwrap))
  }

  public open fun stage(`value`: StageOverridesProperty) {
    unwrap(this).setStage(`value`.let(StageOverridesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e3dfce67de4814dc0a36fc02552a6a40b13c7419e2341b74d30ddb987c775a8b")
  public open fun stage(`value`: StageOverridesProperty.Builder.() -> Unit): Unit =
      stage(StageOverridesProperty(`value`))

  public interface Builder {
    public fun apiId(apiId: String) {
    }

    public fun integration(integration: IResolvable) {
    }

    public fun integration(integration: IntegrationOverridesProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1994cd72c74baf9b22c5e968c3a4a843eb3995442f997c9beaacc8c19e88440e")
    public fun integration(integration: IntegrationOverridesProperty.Builder.() -> Unit) {
    }

    public fun route(route: IResolvable) {
    }

    public fun route(route: RouteOverridesProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2d86a5f548e4c32c34baba7510f92a88c7213fad434bb975afebd6c711d6cf8")
    public fun route(route: RouteOverridesProperty.Builder.() -> Unit) {
    }

    public fun stage(stage: IResolvable) {
    }

    public fun stage(stage: StageOverridesProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3e5f5d78a8c8182ecb85c09514d512fa1d6af924c78bcaf0f704ebd2b38b6aa")
    public fun stage(stage: StageOverridesProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.Builder.create(scope,
        id)

    public override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    public override fun integration(integration: IResolvable) {
      cdkBuilder.integration(integration.let(IResolvable::unwrap))
    }

    public override fun integration(integration: IntegrationOverridesProperty) {
      cdkBuilder.integration(integration.let(IntegrationOverridesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1994cd72c74baf9b22c5e968c3a4a843eb3995442f997c9beaacc8c19e88440e")
    public override fun integration(integration: IntegrationOverridesProperty.Builder.() -> Unit):
        Unit = integration(IntegrationOverridesProperty(integration))

    public override fun route(route: IResolvable) {
      cdkBuilder.route(route.let(IResolvable::unwrap))
    }

    public override fun route(route: RouteOverridesProperty) {
      cdkBuilder.route(route.let(RouteOverridesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2d86a5f548e4c32c34baba7510f92a88c7213fad434bb975afebd6c711d6cf8")
    public override fun route(route: RouteOverridesProperty.Builder.() -> Unit): Unit =
        route(RouteOverridesProperty(route))

    public override fun stage(stage: IResolvable) {
      cdkBuilder.stage(stage.let(IResolvable::unwrap))
    }

    public override fun stage(stage: StageOverridesProperty) {
      cdkBuilder.stage(stage.let(StageOverridesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3e5f5d78a8c8182ecb85c09514d512fa1d6af924c78bcaf0f704ebd2b38b6aa")
    public override fun stage(stage: StageOverridesProperty.Builder.() -> Unit): Unit =
        stage(StageOverridesProperty(stage))

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApiGatewayManagedOverrides {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApiGatewayManagedOverrides(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides):
        CfnApiGatewayManagedOverrides = CfnApiGatewayManagedOverrides(cdkObject)

    internal fun unwrap(wrapped: CfnApiGatewayManagedOverrides):
        software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides =
        wrapped.cdkObject
  }

  public interface RouteOverridesProperty {
    public fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
        emptyList()

    public fun authorizationType(): String? = unwrap(this).getAuthorizationType()

    public fun authorizerId(): String? = unwrap(this).getAuthorizerId()

    public fun operationName(): String? = unwrap(this).getOperationName()

    public fun target(): String? = unwrap(this).getTarget()

    public interface Builder {
      public fun authorizationScopes(authorizationScopes: List<String>) {
      }

      public fun authorizationType(authorizationType: String) {
      }

      public fun authorizerId(authorizerId: String) {
      }

      public fun operationName(operationName: String) {
      }

      public fun target(target: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteOverridesProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteOverridesProperty.builder()

      public override fun authorizationScopes(authorizationScopes: List<String>) {
        cdkBuilder.authorizationScopes(authorizationScopes)
      }

      public override fun authorizationType(authorizationType: String) {
        cdkBuilder.authorizationType(authorizationType)
      }

      public override fun authorizerId(authorizerId: String) {
        cdkBuilder.authorizerId(authorizerId)
      }

      public override fun operationName(operationName: String) {
        cdkBuilder.operationName(operationName)
      }

      public override fun target(target: String) {
        cdkBuilder.target(target)
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteOverridesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteOverridesProperty,
    ) : RouteOverridesProperty {
      public override fun authorizationScopes(): List<String> =
          unwrap(this).getAuthorizationScopes() ?: emptyList()

      public override fun authorizationType(): String? = unwrap(this).getAuthorizationType()

      public override fun authorizerId(): String? = unwrap(this).getAuthorizerId()

      public override fun operationName(): String? = unwrap(this).getOperationName()

      public override fun target(): String? = unwrap(this).getTarget()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RouteOverridesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteOverridesProperty):
          RouteOverridesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RouteOverridesProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteOverridesProperty
          = (wrapped as Wrapper).cdkObject
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
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteSettingsProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteSettingsProperty.builder()

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
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteSettingsProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteSettingsProperty):
          RouteSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RouteSettingsProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteSettingsProperty
          = (wrapped as Wrapper).cdkObject
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
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.AccessLogSettingsProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.AccessLogSettingsProperty.builder()

      public override fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
      }

      public override fun format(format: String) {
        cdkBuilder.format(format)
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.AccessLogSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.AccessLogSettingsProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.AccessLogSettingsProperty):
          AccessLogSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessLogSettingsProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.AccessLogSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface IntegrationOverridesProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun integrationMethod(): String? = unwrap(this).getIntegrationMethod()

    public fun payloadFormatVersion(): String? = unwrap(this).getPayloadFormatVersion()

    public fun timeoutInMillis(): Number? = unwrap(this).getTimeoutInMillis()

    public interface Builder {
      public fun description(description: String) {
      }

      public fun integrationMethod(integrationMethod: String) {
      }

      public fun payloadFormatVersion(payloadFormatVersion: String) {
      }

      public fun timeoutInMillis(timeoutInMillis: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.IntegrationOverridesProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.IntegrationOverridesProperty.builder()

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun integrationMethod(integrationMethod: String) {
        cdkBuilder.integrationMethod(integrationMethod)
      }

      public override fun payloadFormatVersion(payloadFormatVersion: String) {
        cdkBuilder.payloadFormatVersion(payloadFormatVersion)
      }

      public override fun timeoutInMillis(timeoutInMillis: Number) {
        cdkBuilder.timeoutInMillis(timeoutInMillis)
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.IntegrationOverridesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.IntegrationOverridesProperty,
    ) : IntegrationOverridesProperty {
      public override fun description(): String? = unwrap(this).getDescription()

      public override fun integrationMethod(): String? = unwrap(this).getIntegrationMethod()

      public override fun payloadFormatVersion(): String? = unwrap(this).getPayloadFormatVersion()

      public override fun timeoutInMillis(): Number? = unwrap(this).getTimeoutInMillis()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IntegrationOverridesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.IntegrationOverridesProperty):
          IntegrationOverridesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntegrationOverridesProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.IntegrationOverridesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface StageOverridesProperty {
    public fun accessLogSettings(): Any? = unwrap(this).getAccessLogSettings()

    public fun autoDeploy(): Any? = unwrap(this).getAutoDeploy()

    public fun defaultRouteSettings(): Any? = unwrap(this).getDefaultRouteSettings()

    public fun description(): String? = unwrap(this).getDescription()

    public fun routeSettings(): Any? = unwrap(this).getRouteSettings()

    public fun stageVariables(): Any? = unwrap(this).getStageVariables()

    public interface Builder {
      public fun accessLogSettings(accessLogSettings: IResolvable) {
      }

      public fun accessLogSettings(accessLogSettings: AccessLogSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2231515a54b96e4144859c2f13013a00add666280ae0fca11ce1fb7b967d1b65")
      public
          fun accessLogSettings(accessLogSettings: AccessLogSettingsProperty.Builder.() -> Unit) {
      }

      public fun autoDeploy(autoDeploy: Boolean) {
      }

      public fun autoDeploy(autoDeploy: IResolvable) {
      }

      public fun defaultRouteSettings(defaultRouteSettings: IResolvable) {
      }

      public fun defaultRouteSettings(defaultRouteSettings: RouteSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("835f35219001fb090ef2ac51dcf9833a07dfdacfd1bec35109297159c68d986a")
      public
          fun defaultRouteSettings(defaultRouteSettings: RouteSettingsProperty.Builder.() -> Unit) {
      }

      public fun description(description: String) {
      }

      public fun routeSettings(routeSettings: Any) {
      }

      public fun stageVariables(stageVariables: Any) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.StageOverridesProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.StageOverridesProperty.builder()

      public override fun accessLogSettings(accessLogSettings: IResolvable) {
        cdkBuilder.accessLogSettings(accessLogSettings.let(IResolvable::unwrap))
      }

      public override fun accessLogSettings(accessLogSettings: AccessLogSettingsProperty) {
        cdkBuilder.accessLogSettings(accessLogSettings.let(AccessLogSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2231515a54b96e4144859c2f13013a00add666280ae0fca11ce1fb7b967d1b65")
      public override
          fun accessLogSettings(accessLogSettings: AccessLogSettingsProperty.Builder.() -> Unit):
          Unit = accessLogSettings(AccessLogSettingsProperty(accessLogSettings))

      public override fun autoDeploy(autoDeploy: Boolean) {
        cdkBuilder.autoDeploy(autoDeploy)
      }

      public override fun autoDeploy(autoDeploy: IResolvable) {
        cdkBuilder.autoDeploy(autoDeploy.let(IResolvable::unwrap))
      }

      public override fun defaultRouteSettings(defaultRouteSettings: IResolvable) {
        cdkBuilder.defaultRouteSettings(defaultRouteSettings.let(IResolvable::unwrap))
      }

      public override fun defaultRouteSettings(defaultRouteSettings: RouteSettingsProperty) {
        cdkBuilder.defaultRouteSettings(defaultRouteSettings.let(RouteSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("835f35219001fb090ef2ac51dcf9833a07dfdacfd1bec35109297159c68d986a")
      public override
          fun defaultRouteSettings(defaultRouteSettings: RouteSettingsProperty.Builder.() -> Unit):
          Unit = defaultRouteSettings(RouteSettingsProperty(defaultRouteSettings))

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun routeSettings(routeSettings: Any) {
        cdkBuilder.routeSettings(routeSettings)
      }

      public override fun stageVariables(stageVariables: Any) {
        cdkBuilder.stageVariables(stageVariables)
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.StageOverridesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.StageOverridesProperty,
    ) : StageOverridesProperty {
      public override fun accessLogSettings(): Any? = unwrap(this).getAccessLogSettings()

      public override fun autoDeploy(): Any? = unwrap(this).getAutoDeploy()

      public override fun defaultRouteSettings(): Any? = unwrap(this).getDefaultRouteSettings()

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun routeSettings(): Any? = unwrap(this).getRouteSettings()

      public override fun stageVariables(): Any? = unwrap(this).getStageVariables()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StageOverridesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.StageOverridesProperty):
          StageOverridesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StageOverridesProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.StageOverridesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
