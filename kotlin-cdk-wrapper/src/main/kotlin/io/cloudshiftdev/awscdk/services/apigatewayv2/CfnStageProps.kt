@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnStageProps {
  public fun accessLogSettings(): Any? = unwrap(this).getAccessLogSettings()

  public fun accessPolicyId(): String? = unwrap(this).getAccessPolicyId()

  public fun apiId(): String

  public fun autoDeploy(): Any? = unwrap(this).getAutoDeploy()

  public fun clientCertificateId(): String? = unwrap(this).getClientCertificateId()

  public fun defaultRouteSettings(): Any? = unwrap(this).getDefaultRouteSettings()

  public fun deploymentId(): String? = unwrap(this).getDeploymentId()

  public fun description(): String? = unwrap(this).getDescription()

  public fun routeSettings(): Any? = unwrap(this).getRouteSettings()

  public fun stageName(): String

  public fun stageVariables(): Any? = unwrap(this).getStageVariables()

  public fun tags(): Any? = unwrap(this).getTags()

  @CdkDslMarker
  public interface Builder {
    public fun accessLogSettings(accessLogSettings: IResolvable)

    public fun accessLogSettings(accessLogSettings: CfnStage.AccessLogSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7416f41264479ac39ac7f9a27eba5cbd7e09dd9ea446a94f39af0b0f6ee067b")
    public
        fun accessLogSettings(accessLogSettings: CfnStage.AccessLogSettingsProperty.Builder.() -> Unit)

    public fun accessPolicyId(accessPolicyId: String)

    public fun apiId(apiId: String)

    public fun autoDeploy(autoDeploy: Boolean)

    public fun autoDeploy(autoDeploy: IResolvable)

    public fun clientCertificateId(clientCertificateId: String)

    public fun defaultRouteSettings(defaultRouteSettings: IResolvable)

    public fun defaultRouteSettings(defaultRouteSettings: CfnStage.RouteSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0f0b1d1c2e6b3737d7856dd33478a6b74d014f1dde0af4d76e393b21d4956847")
    public
        fun defaultRouteSettings(defaultRouteSettings: CfnStage.RouteSettingsProperty.Builder.() -> Unit)

    public fun deploymentId(deploymentId: String)

    public fun description(description: String)

    public fun routeSettings(routeSettings: Any)

    public fun stageName(stageName: String)

    public fun stageVariables(stageVariables: Any)

    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnStageProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnStageProps.builder()

    override fun accessLogSettings(accessLogSettings: IResolvable) {
      cdkBuilder.accessLogSettings(accessLogSettings.let(IResolvable::unwrap))
    }

    override fun accessLogSettings(accessLogSettings: CfnStage.AccessLogSettingsProperty) {
      cdkBuilder.accessLogSettings(accessLogSettings.let(CfnStage.AccessLogSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7416f41264479ac39ac7f9a27eba5cbd7e09dd9ea446a94f39af0b0f6ee067b")
    override
        fun accessLogSettings(accessLogSettings: CfnStage.AccessLogSettingsProperty.Builder.() -> Unit):
        Unit = accessLogSettings(CfnStage.AccessLogSettingsProperty(accessLogSettings))

    override fun accessPolicyId(accessPolicyId: String) {
      cdkBuilder.accessPolicyId(accessPolicyId)
    }

    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    override fun autoDeploy(autoDeploy: Boolean) {
      cdkBuilder.autoDeploy(autoDeploy)
    }

    override fun autoDeploy(autoDeploy: IResolvable) {
      cdkBuilder.autoDeploy(autoDeploy.let(IResolvable::unwrap))
    }

    override fun clientCertificateId(clientCertificateId: String) {
      cdkBuilder.clientCertificateId(clientCertificateId)
    }

    override fun defaultRouteSettings(defaultRouteSettings: IResolvable) {
      cdkBuilder.defaultRouteSettings(defaultRouteSettings.let(IResolvable::unwrap))
    }

    override fun defaultRouteSettings(defaultRouteSettings: CfnStage.RouteSettingsProperty) {
      cdkBuilder.defaultRouteSettings(defaultRouteSettings.let(CfnStage.RouteSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0f0b1d1c2e6b3737d7856dd33478a6b74d014f1dde0af4d76e393b21d4956847")
    override
        fun defaultRouteSettings(defaultRouteSettings: CfnStage.RouteSettingsProperty.Builder.() -> Unit):
        Unit = defaultRouteSettings(CfnStage.RouteSettingsProperty(defaultRouteSettings))

    override fun deploymentId(deploymentId: String) {
      cdkBuilder.deploymentId(deploymentId)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun routeSettings(routeSettings: Any) {
      cdkBuilder.routeSettings(routeSettings)
    }

    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    override fun stageVariables(stageVariables: Any) {
      cdkBuilder.stageVariables(stageVariables)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnStageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnStageProps,
  ) : CdkObject(cdkObject), CfnStageProps {
    override fun accessLogSettings(): Any? = unwrap(this).getAccessLogSettings()

    override fun accessPolicyId(): String? = unwrap(this).getAccessPolicyId()

    override fun apiId(): String = unwrap(this).getApiId()

    override fun autoDeploy(): Any? = unwrap(this).getAutoDeploy()

    override fun clientCertificateId(): String? = unwrap(this).getClientCertificateId()

    override fun defaultRouteSettings(): Any? = unwrap(this).getDefaultRouteSettings()

    override fun deploymentId(): String? = unwrap(this).getDeploymentId()

    override fun description(): String? = unwrap(this).getDescription()

    override fun routeSettings(): Any? = unwrap(this).getRouteSettings()

    override fun stageName(): String = unwrap(this).getStageName()

    override fun stageVariables(): Any? = unwrap(this).getStageVariables()

    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnStageProps):
        CfnStageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStageProps):
        software.amazon.awscdk.services.apigatewayv2.CfnStageProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.CfnStageProps
  }
}
