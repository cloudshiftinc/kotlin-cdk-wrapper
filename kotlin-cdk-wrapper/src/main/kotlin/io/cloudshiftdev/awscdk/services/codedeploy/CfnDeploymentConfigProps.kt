@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDeploymentConfig`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codedeploy.*;
 * CfnDeploymentConfigProps cfnDeploymentConfigProps = CfnDeploymentConfigProps.builder()
 * .computePlatform("computePlatform")
 * .deploymentConfigName("deploymentConfigName")
 * .minimumHealthyHosts(MinimumHealthyHostsProperty.builder()
 * .type("type")
 * .value(123)
 * .build())
 * .trafficRoutingConfig(TrafficRoutingConfigProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .timeBasedCanary(TimeBasedCanaryProperty.builder()
 * .canaryInterval(123)
 * .canaryPercentage(123)
 * .build())
 * .timeBasedLinear(TimeBasedLinearProperty.builder()
 * .linearInterval(123)
 * .linearPercentage(123)
 * .build())
 * .build())
 * .zonalConfig(ZonalConfigProperty.builder()
 * .firstZoneMonitorDurationInSeconds(123)
 * .minimumHealthyHostsPerZone(MinimumHealthyHostsPerZoneProperty.builder()
 * .type("type")
 * .value(123)
 * .build())
 * .monitorDurationInSeconds(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html)
 */
public interface CfnDeploymentConfigProps {
  /**
   * The destination platform type for the deployment ( `Lambda` , `Server` , or `ECS` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-computeplatform)
   */
  public fun computePlatform(): String? = unwrap(this).getComputePlatform()

  /**
   * A name for the deployment configuration.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
   * for the deployment configuration name. For more information, see [Name
   * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   *
   * If you specify a name, you cannot perform updates that require replacement of this resource.
   * You can perform updates that require no or some interruption. If you must replace the resource,
   * specify a new name.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-deploymentconfigname)
   */
  public fun deploymentConfigName(): String? = unwrap(this).getDeploymentConfigName()

  /**
   * The minimum number of healthy instances that should be available at any time during the
   * deployment.
   *
   * There are two parameters expected in the input: type and value.
   *
   * The type parameter takes either of the following values:
   *
   * * HOST_COUNT: The value parameter represents the minimum number of healthy instances as an
   * absolute value.
   * * FLEET_PERCENT: The value parameter represents the minimum number of healthy instances as a
   * percentage of the total number of instances in the deployment. If you specify FLEET_PERCENT, at
   * the start of the deployment, AWS CodeDeploy converts the percentage to the equivalent number of
   * instance and rounds up fractional instances.
   *
   * The value parameter takes an integer.
   *
   * For example, to set a minimum of 95% healthy instance, specify a type of FLEET_PERCENT and a
   * value of 95.
   *
   * For more information about instance health, see [CodeDeploy Instance
   * Health](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html) in the AWS
   * CodeDeploy User Guide.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-minimumhealthyhosts)
   */
  public fun minimumHealthyHosts(): Any? = unwrap(this).getMinimumHealthyHosts()

  /**
   * The configuration that specifies how the deployment traffic is routed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-trafficroutingconfig)
   */
  public fun trafficRoutingConfig(): Any? = unwrap(this).getTrafficRoutingConfig()

  /**
   * Configure the `ZonalConfig` object if you want AWS CodeDeploy to deploy your application to one
   * [Availability
   * Zone](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-availability-zones)
   * at a time, within an AWS Region.
   *
   * For more information about the zonal configuration feature, see [zonal
   * configuration](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
   * in the *CodeDeploy User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-zonalconfig)
   */
  public fun zonalConfig(): Any? = unwrap(this).getZonalConfig()

  /**
   * A builder for [CfnDeploymentConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param computePlatform The destination platform type for the deployment ( `Lambda` , `Server`
     * , or `ECS` ).
     */
    public fun computePlatform(computePlatform: String)

    /**
     * @param deploymentConfigName A name for the deployment configuration.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the deployment configuration name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    public fun deploymentConfigName(deploymentConfigName: String)

    /**
     * @param minimumHealthyHosts The minimum number of healthy instances that should be available
     * at any time during the deployment.
     * There are two parameters expected in the input: type and value.
     *
     * The type parameter takes either of the following values:
     *
     * * HOST_COUNT: The value parameter represents the minimum number of healthy instances as an
     * absolute value.
     * * FLEET_PERCENT: The value parameter represents the minimum number of healthy instances as a
     * percentage of the total number of instances in the deployment. If you specify FLEET_PERCENT, at
     * the start of the deployment, AWS CodeDeploy converts the percentage to the equivalent number of
     * instance and rounds up fractional instances.
     *
     * The value parameter takes an integer.
     *
     * For example, to set a minimum of 95% healthy instance, specify a type of FLEET_PERCENT and a
     * value of 95.
     *
     * For more information about instance health, see [CodeDeploy Instance
     * Health](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html) in the
     * AWS CodeDeploy User Guide.
     */
    public fun minimumHealthyHosts(minimumHealthyHosts: IResolvable)

    /**
     * @param minimumHealthyHosts The minimum number of healthy instances that should be available
     * at any time during the deployment.
     * There are two parameters expected in the input: type and value.
     *
     * The type parameter takes either of the following values:
     *
     * * HOST_COUNT: The value parameter represents the minimum number of healthy instances as an
     * absolute value.
     * * FLEET_PERCENT: The value parameter represents the minimum number of healthy instances as a
     * percentage of the total number of instances in the deployment. If you specify FLEET_PERCENT, at
     * the start of the deployment, AWS CodeDeploy converts the percentage to the equivalent number of
     * instance and rounds up fractional instances.
     *
     * The value parameter takes an integer.
     *
     * For example, to set a minimum of 95% healthy instance, specify a type of FLEET_PERCENT and a
     * value of 95.
     *
     * For more information about instance health, see [CodeDeploy Instance
     * Health](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html) in the
     * AWS CodeDeploy User Guide.
     */
    public
        fun minimumHealthyHosts(minimumHealthyHosts: CfnDeploymentConfig.MinimumHealthyHostsProperty)

    /**
     * @param minimumHealthyHosts The minimum number of healthy instances that should be available
     * at any time during the deployment.
     * There are two parameters expected in the input: type and value.
     *
     * The type parameter takes either of the following values:
     *
     * * HOST_COUNT: The value parameter represents the minimum number of healthy instances as an
     * absolute value.
     * * FLEET_PERCENT: The value parameter represents the minimum number of healthy instances as a
     * percentage of the total number of instances in the deployment. If you specify FLEET_PERCENT, at
     * the start of the deployment, AWS CodeDeploy converts the percentage to the equivalent number of
     * instance and rounds up fractional instances.
     *
     * The value parameter takes an integer.
     *
     * For example, to set a minimum of 95% healthy instance, specify a type of FLEET_PERCENT and a
     * value of 95.
     *
     * For more information about instance health, see [CodeDeploy Instance
     * Health](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html) in the
     * AWS CodeDeploy User Guide.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4bd2d0c6f61760750f67c6a09d59f26ec21be5c67d2b488887cf9f1be4a541d2")
    public
        fun minimumHealthyHosts(minimumHealthyHosts: CfnDeploymentConfig.MinimumHealthyHostsProperty.Builder.() -> Unit)

    /**
     * @param trafficRoutingConfig The configuration that specifies how the deployment traffic is
     * routed.
     */
    public fun trafficRoutingConfig(trafficRoutingConfig: IResolvable)

    /**
     * @param trafficRoutingConfig The configuration that specifies how the deployment traffic is
     * routed.
     */
    public
        fun trafficRoutingConfig(trafficRoutingConfig: CfnDeploymentConfig.TrafficRoutingConfigProperty)

    /**
     * @param trafficRoutingConfig The configuration that specifies how the deployment traffic is
     * routed.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2f540bda541f9556b42f990f846027057ab53a40d885d9e34fa875d77d2a929")
    public
        fun trafficRoutingConfig(trafficRoutingConfig: CfnDeploymentConfig.TrafficRoutingConfigProperty.Builder.() -> Unit)

    /**
     * @param zonalConfig Configure the `ZonalConfig` object if you want AWS CodeDeploy to deploy
     * your application to one [Availability
     * Zone](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-availability-zones)
     * at a time, within an AWS Region.
     * For more information about the zonal configuration feature, see [zonal
     * configuration](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
     * in the *CodeDeploy User Guide* .
     */
    public fun zonalConfig(zonalConfig: IResolvable)

    /**
     * @param zonalConfig Configure the `ZonalConfig` object if you want AWS CodeDeploy to deploy
     * your application to one [Availability
     * Zone](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-availability-zones)
     * at a time, within an AWS Region.
     * For more information about the zonal configuration feature, see [zonal
     * configuration](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
     * in the *CodeDeploy User Guide* .
     */
    public fun zonalConfig(zonalConfig: CfnDeploymentConfig.ZonalConfigProperty)

    /**
     * @param zonalConfig Configure the `ZonalConfig` object if you want AWS CodeDeploy to deploy
     * your application to one [Availability
     * Zone](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-availability-zones)
     * at a time, within an AWS Region.
     * For more information about the zonal configuration feature, see [zonal
     * configuration](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
     * in the *CodeDeploy User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3954c5ee4971a5c5e1acf03f8fff975fc3b6da01bf7341aa47d754011b754c40")
    public fun zonalConfig(zonalConfig: CfnDeploymentConfig.ZonalConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.CfnDeploymentConfigProps.Builder =
        software.amazon.awscdk.services.codedeploy.CfnDeploymentConfigProps.builder()

    /**
     * @param computePlatform The destination platform type for the deployment ( `Lambda` , `Server`
     * , or `ECS` ).
     */
    override fun computePlatform(computePlatform: String) {
      cdkBuilder.computePlatform(computePlatform)
    }

    /**
     * @param deploymentConfigName A name for the deployment configuration.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the deployment configuration name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    override fun deploymentConfigName(deploymentConfigName: String) {
      cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    /**
     * @param minimumHealthyHosts The minimum number of healthy instances that should be available
     * at any time during the deployment.
     * There are two parameters expected in the input: type and value.
     *
     * The type parameter takes either of the following values:
     *
     * * HOST_COUNT: The value parameter represents the minimum number of healthy instances as an
     * absolute value.
     * * FLEET_PERCENT: The value parameter represents the minimum number of healthy instances as a
     * percentage of the total number of instances in the deployment. If you specify FLEET_PERCENT, at
     * the start of the deployment, AWS CodeDeploy converts the percentage to the equivalent number of
     * instance and rounds up fractional instances.
     *
     * The value parameter takes an integer.
     *
     * For example, to set a minimum of 95% healthy instance, specify a type of FLEET_PERCENT and a
     * value of 95.
     *
     * For more information about instance health, see [CodeDeploy Instance
     * Health](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html) in the
     * AWS CodeDeploy User Guide.
     */
    override fun minimumHealthyHosts(minimumHealthyHosts: IResolvable) {
      cdkBuilder.minimumHealthyHosts(minimumHealthyHosts.let(IResolvable::unwrap))
    }

    /**
     * @param minimumHealthyHosts The minimum number of healthy instances that should be available
     * at any time during the deployment.
     * There are two parameters expected in the input: type and value.
     *
     * The type parameter takes either of the following values:
     *
     * * HOST_COUNT: The value parameter represents the minimum number of healthy instances as an
     * absolute value.
     * * FLEET_PERCENT: The value parameter represents the minimum number of healthy instances as a
     * percentage of the total number of instances in the deployment. If you specify FLEET_PERCENT, at
     * the start of the deployment, AWS CodeDeploy converts the percentage to the equivalent number of
     * instance and rounds up fractional instances.
     *
     * The value parameter takes an integer.
     *
     * For example, to set a minimum of 95% healthy instance, specify a type of FLEET_PERCENT and a
     * value of 95.
     *
     * For more information about instance health, see [CodeDeploy Instance
     * Health](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html) in the
     * AWS CodeDeploy User Guide.
     */
    override
        fun minimumHealthyHosts(minimumHealthyHosts: CfnDeploymentConfig.MinimumHealthyHostsProperty) {
      cdkBuilder.minimumHealthyHosts(minimumHealthyHosts.let(CfnDeploymentConfig.MinimumHealthyHostsProperty::unwrap))
    }

    /**
     * @param minimumHealthyHosts The minimum number of healthy instances that should be available
     * at any time during the deployment.
     * There are two parameters expected in the input: type and value.
     *
     * The type parameter takes either of the following values:
     *
     * * HOST_COUNT: The value parameter represents the minimum number of healthy instances as an
     * absolute value.
     * * FLEET_PERCENT: The value parameter represents the minimum number of healthy instances as a
     * percentage of the total number of instances in the deployment. If you specify FLEET_PERCENT, at
     * the start of the deployment, AWS CodeDeploy converts the percentage to the equivalent number of
     * instance and rounds up fractional instances.
     *
     * The value parameter takes an integer.
     *
     * For example, to set a minimum of 95% healthy instance, specify a type of FLEET_PERCENT and a
     * value of 95.
     *
     * For more information about instance health, see [CodeDeploy Instance
     * Health](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html) in the
     * AWS CodeDeploy User Guide.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4bd2d0c6f61760750f67c6a09d59f26ec21be5c67d2b488887cf9f1be4a541d2")
    override
        fun minimumHealthyHosts(minimumHealthyHosts: CfnDeploymentConfig.MinimumHealthyHostsProperty.Builder.() -> Unit):
        Unit =
        minimumHealthyHosts(CfnDeploymentConfig.MinimumHealthyHostsProperty(minimumHealthyHosts))

    /**
     * @param trafficRoutingConfig The configuration that specifies how the deployment traffic is
     * routed.
     */
    override fun trafficRoutingConfig(trafficRoutingConfig: IResolvable) {
      cdkBuilder.trafficRoutingConfig(trafficRoutingConfig.let(IResolvable::unwrap))
    }

    /**
     * @param trafficRoutingConfig The configuration that specifies how the deployment traffic is
     * routed.
     */
    override
        fun trafficRoutingConfig(trafficRoutingConfig: CfnDeploymentConfig.TrafficRoutingConfigProperty) {
      cdkBuilder.trafficRoutingConfig(trafficRoutingConfig.let(CfnDeploymentConfig.TrafficRoutingConfigProperty::unwrap))
    }

    /**
     * @param trafficRoutingConfig The configuration that specifies how the deployment traffic is
     * routed.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2f540bda541f9556b42f990f846027057ab53a40d885d9e34fa875d77d2a929")
    override
        fun trafficRoutingConfig(trafficRoutingConfig: CfnDeploymentConfig.TrafficRoutingConfigProperty.Builder.() -> Unit):
        Unit =
        trafficRoutingConfig(CfnDeploymentConfig.TrafficRoutingConfigProperty(trafficRoutingConfig))

    /**
     * @param zonalConfig Configure the `ZonalConfig` object if you want AWS CodeDeploy to deploy
     * your application to one [Availability
     * Zone](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-availability-zones)
     * at a time, within an AWS Region.
     * For more information about the zonal configuration feature, see [zonal
     * configuration](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
     * in the *CodeDeploy User Guide* .
     */
    override fun zonalConfig(zonalConfig: IResolvable) {
      cdkBuilder.zonalConfig(zonalConfig.let(IResolvable::unwrap))
    }

    /**
     * @param zonalConfig Configure the `ZonalConfig` object if you want AWS CodeDeploy to deploy
     * your application to one [Availability
     * Zone](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-availability-zones)
     * at a time, within an AWS Region.
     * For more information about the zonal configuration feature, see [zonal
     * configuration](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
     * in the *CodeDeploy User Guide* .
     */
    override fun zonalConfig(zonalConfig: CfnDeploymentConfig.ZonalConfigProperty) {
      cdkBuilder.zonalConfig(zonalConfig.let(CfnDeploymentConfig.ZonalConfigProperty::unwrap))
    }

    /**
     * @param zonalConfig Configure the `ZonalConfig` object if you want AWS CodeDeploy to deploy
     * your application to one [Availability
     * Zone](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-availability-zones)
     * at a time, within an AWS Region.
     * For more information about the zonal configuration feature, see [zonal
     * configuration](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
     * in the *CodeDeploy User Guide* .
     */
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
    /**
     * The destination platform type for the deployment ( `Lambda` , `Server` , or `ECS` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-computeplatform)
     */
    override fun computePlatform(): String? = unwrap(this).getComputePlatform()

    /**
     * A name for the deployment configuration.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the deployment configuration name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-deploymentconfigname)
     */
    override fun deploymentConfigName(): String? = unwrap(this).getDeploymentConfigName()

    /**
     * The minimum number of healthy instances that should be available at any time during the
     * deployment.
     *
     * There are two parameters expected in the input: type and value.
     *
     * The type parameter takes either of the following values:
     *
     * * HOST_COUNT: The value parameter represents the minimum number of healthy instances as an
     * absolute value.
     * * FLEET_PERCENT: The value parameter represents the minimum number of healthy instances as a
     * percentage of the total number of instances in the deployment. If you specify FLEET_PERCENT, at
     * the start of the deployment, AWS CodeDeploy converts the percentage to the equivalent number of
     * instance and rounds up fractional instances.
     *
     * The value parameter takes an integer.
     *
     * For example, to set a minimum of 95% healthy instance, specify a type of FLEET_PERCENT and a
     * value of 95.
     *
     * For more information about instance health, see [CodeDeploy Instance
     * Health](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html) in the
     * AWS CodeDeploy User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-minimumhealthyhosts)
     */
    override fun minimumHealthyHosts(): Any? = unwrap(this).getMinimumHealthyHosts()

    /**
     * The configuration that specifies how the deployment traffic is routed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-trafficroutingconfig)
     */
    override fun trafficRoutingConfig(): Any? = unwrap(this).getTrafficRoutingConfig()

    /**
     * Configure the `ZonalConfig` object if you want AWS CodeDeploy to deploy your application to
     * one [Availability
     * Zone](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-availability-zones)
     * at a time, within an AWS Region.
     *
     * For more information about the zonal configuration feature, see [zonal
     * configuration](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
     * in the *CodeDeploy User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-zonalconfig)
     */
    override fun zonalConfig(): Any? = unwrap(this).getZonalConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeploymentConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfigProps):
        CfnDeploymentConfigProps = CdkObjectWrappers.wrap(cdkObject) as CfnDeploymentConfigProps

    internal fun unwrap(wrapped: CfnDeploymentConfigProps):
        software.amazon.awscdk.services.codedeploy.CfnDeploymentConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.CfnDeploymentConfigProps
  }
}
