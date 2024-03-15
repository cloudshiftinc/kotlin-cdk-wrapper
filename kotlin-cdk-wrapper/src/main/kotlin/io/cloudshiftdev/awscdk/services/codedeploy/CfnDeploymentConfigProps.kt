@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnDeploymentConfigProps {
  public fun computePlatform(): String? = unwrap(this).getComputePlatform()

  public fun deploymentConfigName(): String? = unwrap(this).getDeploymentConfigName()

  public fun minimumHealthyHosts(): Any? = unwrap(this).getMinimumHealthyHosts()

  public fun trafficRoutingConfig(): Any? = unwrap(this).getTrafficRoutingConfig()

  public fun zonalConfig(): Any? = unwrap(this).getZonalConfig()

  @CdkDslMarker
  public interface Builder {
    public fun computePlatform(computePlatform: String)

    public fun deploymentConfigName(deploymentConfigName: String)

    public fun minimumHealthyHosts(minimumHealthyHosts: IResolvable)

    public
        fun minimumHealthyHosts(minimumHealthyHosts: CfnDeploymentConfig.MinimumHealthyHostsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4bd2d0c6f61760750f67c6a09d59f26ec21be5c67d2b488887cf9f1be4a541d2")
    public
        fun minimumHealthyHosts(minimumHealthyHosts: CfnDeploymentConfig.MinimumHealthyHostsProperty.Builder.() -> Unit)

    public fun trafficRoutingConfig(trafficRoutingConfig: IResolvable)

    public
        fun trafficRoutingConfig(trafficRoutingConfig: CfnDeploymentConfig.TrafficRoutingConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2f540bda541f9556b42f990f846027057ab53a40d885d9e34fa875d77d2a929")
    public
        fun trafficRoutingConfig(trafficRoutingConfig: CfnDeploymentConfig.TrafficRoutingConfigProperty.Builder.() -> Unit)

    public fun zonalConfig(zonalConfig: IResolvable)

    public fun zonalConfig(zonalConfig: CfnDeploymentConfig.ZonalConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3954c5ee4971a5c5e1acf03f8fff975fc3b6da01bf7341aa47d754011b754c40")
    public fun zonalConfig(zonalConfig: CfnDeploymentConfig.ZonalConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.CfnDeploymentConfigProps.Builder =
        software.amazon.awscdk.services.codedeploy.CfnDeploymentConfigProps.builder()

    override fun computePlatform(computePlatform: String) {
      cdkBuilder.computePlatform(computePlatform)
    }

    override fun deploymentConfigName(deploymentConfigName: String) {
      cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    override fun minimumHealthyHosts(minimumHealthyHosts: IResolvable) {
      cdkBuilder.minimumHealthyHosts(minimumHealthyHosts.let(IResolvable::unwrap))
    }

    override
        fun minimumHealthyHosts(minimumHealthyHosts: CfnDeploymentConfig.MinimumHealthyHostsProperty) {
      cdkBuilder.minimumHealthyHosts(minimumHealthyHosts.let(CfnDeploymentConfig.MinimumHealthyHostsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4bd2d0c6f61760750f67c6a09d59f26ec21be5c67d2b488887cf9f1be4a541d2")
    override
        fun minimumHealthyHosts(minimumHealthyHosts: CfnDeploymentConfig.MinimumHealthyHostsProperty.Builder.() -> Unit):
        Unit =
        minimumHealthyHosts(CfnDeploymentConfig.MinimumHealthyHostsProperty(minimumHealthyHosts))

    override fun trafficRoutingConfig(trafficRoutingConfig: IResolvable) {
      cdkBuilder.trafficRoutingConfig(trafficRoutingConfig.let(IResolvable::unwrap))
    }

    override
        fun trafficRoutingConfig(trafficRoutingConfig: CfnDeploymentConfig.TrafficRoutingConfigProperty) {
      cdkBuilder.trafficRoutingConfig(trafficRoutingConfig.let(CfnDeploymentConfig.TrafficRoutingConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2f540bda541f9556b42f990f846027057ab53a40d885d9e34fa875d77d2a929")
    override
        fun trafficRoutingConfig(trafficRoutingConfig: CfnDeploymentConfig.TrafficRoutingConfigProperty.Builder.() -> Unit):
        Unit =
        trafficRoutingConfig(CfnDeploymentConfig.TrafficRoutingConfigProperty(trafficRoutingConfig))

    override fun zonalConfig(zonalConfig: IResolvable) {
      cdkBuilder.zonalConfig(zonalConfig.let(IResolvable::unwrap))
    }

    override fun zonalConfig(zonalConfig: CfnDeploymentConfig.ZonalConfigProperty) {
      cdkBuilder.zonalConfig(zonalConfig.let(CfnDeploymentConfig.ZonalConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3954c5ee4971a5c5e1acf03f8fff975fc3b6da01bf7341aa47d754011b754c40")
    override
        fun zonalConfig(zonalConfig: CfnDeploymentConfig.ZonalConfigProperty.Builder.() -> Unit):
        Unit = zonalConfig(CfnDeploymentConfig.ZonalConfigProperty(zonalConfig))

    public fun build(): software.amazon.awscdk.services.codedeploy.CfnDeploymentConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfigProps,
  ) : CdkObject(cdkObject), CfnDeploymentConfigProps {
    override fun computePlatform(): String? = unwrap(this).getComputePlatform()

    override fun deploymentConfigName(): String? = unwrap(this).getDeploymentConfigName()

    override fun minimumHealthyHosts(): Any? = unwrap(this).getMinimumHealthyHosts()

    override fun trafficRoutingConfig(): Any? = unwrap(this).getTrafficRoutingConfig()

    override fun zonalConfig(): Any? = unwrap(this).getZonalConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeploymentConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfigProps):
        CfnDeploymentConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeploymentConfigProps):
        software.amazon.awscdk.services.codedeploy.CfnDeploymentConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.CfnDeploymentConfigProps
  }
}
