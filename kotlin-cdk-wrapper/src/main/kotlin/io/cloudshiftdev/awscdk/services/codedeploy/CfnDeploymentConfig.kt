@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::CodeDeploy::DeploymentConfig` resource creates a set of deployment rules, deployment
 * success conditions, and deployment failure conditions that AWS CodeDeploy uses during a deployment.
 *
 * The deployment configuration specifies the number or percentage of instances that must remain
 * available at any time during a deployment.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codedeploy.*;
 * CfnDeploymentConfig cfnDeploymentConfig = CfnDeploymentConfig.Builder.create(this,
 * "MyCfnDeploymentConfig")
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
public open class CfnDeploymentConfig internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig,
) : CfnResource(cdkObject), IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeploymentConfigProps,
  ) :
      this(software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDeploymentConfigProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeploymentConfigProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDeploymentConfigProps(props)
  )

  /**
   * The destination platform type for the deployment ( `Lambda` , `Server` , or `ECS` ).
   */
  public open fun computePlatform(): String? = unwrap(this).getComputePlatform()

  /**
   * The destination platform type for the deployment ( `Lambda` , `Server` , or `ECS` ).
   */
  public open fun computePlatform(`value`: String) {
    unwrap(this).setComputePlatform(`value`)
  }

  /**
   * A name for the deployment configuration.
   */
  public open fun deploymentConfigName(): String? = unwrap(this).getDeploymentConfigName()

  /**
   * A name for the deployment configuration.
   */
  public open fun deploymentConfigName(`value`: String) {
    unwrap(this).setDeploymentConfigName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The minimum number of healthy instances that should be available at any time during the
   * deployment.
   */
  public open fun minimumHealthyHosts(): Any? = unwrap(this).getMinimumHealthyHosts()

  /**
   * The minimum number of healthy instances that should be available at any time during the
   * deployment.
   */
  public open fun minimumHealthyHosts(`value`: IResolvable) {
    unwrap(this).setMinimumHealthyHosts(`value`.let(IResolvable::unwrap))
  }

  /**
   * The minimum number of healthy instances that should be available at any time during the
   * deployment.
   */
  public open fun minimumHealthyHosts(`value`: MinimumHealthyHostsProperty) {
    unwrap(this).setMinimumHealthyHosts(`value`.let(MinimumHealthyHostsProperty::unwrap))
  }

  /**
   * The minimum number of healthy instances that should be available at any time during the
   * deployment.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c4c2b03df70ac5bf70aa2b05713337e53ec2648c4ac018e353ccf862f86ba8ef")
  public open fun minimumHealthyHosts(`value`: MinimumHealthyHostsProperty.Builder.() -> Unit): Unit
      = minimumHealthyHosts(MinimumHealthyHostsProperty(`value`))

  /**
   * The configuration that specifies how the deployment traffic is routed.
   */
  public open fun trafficRoutingConfig(): Any? = unwrap(this).getTrafficRoutingConfig()

  /**
   * The configuration that specifies how the deployment traffic is routed.
   */
  public open fun trafficRoutingConfig(`value`: IResolvable) {
    unwrap(this).setTrafficRoutingConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration that specifies how the deployment traffic is routed.
   */
  public open fun trafficRoutingConfig(`value`: TrafficRoutingConfigProperty) {
    unwrap(this).setTrafficRoutingConfig(`value`.let(TrafficRoutingConfigProperty::unwrap))
  }

  /**
   * The configuration that specifies how the deployment traffic is routed.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d964922def4bec56fa9cdc91c31b1b3b18c2104796e96ee04cc8ac02b6f4ca62")
  public open fun trafficRoutingConfig(`value`: TrafficRoutingConfigProperty.Builder.() -> Unit):
      Unit = trafficRoutingConfig(TrafficRoutingConfigProperty(`value`))

  /**
   * Configure the `ZonalConfig` object if you want AWS CodeDeploy to deploy your application to one
   * [Availability
   * Zone](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-availability-zones)
   * at a time, within an AWS Region.
   */
  public open fun zonalConfig(): Any? = unwrap(this).getZonalConfig()

  /**
   * Configure the `ZonalConfig` object if you want AWS CodeDeploy to deploy your application to one
   * [Availability
   * Zone](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-availability-zones)
   * at a time, within an AWS Region.
   */
  public open fun zonalConfig(`value`: IResolvable) {
    unwrap(this).setZonalConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configure the `ZonalConfig` object if you want AWS CodeDeploy to deploy your application to one
   * [Availability
   * Zone](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-availability-zones)
   * at a time, within an AWS Region.
   */
  public open fun zonalConfig(`value`: ZonalConfigProperty) {
    unwrap(this).setZonalConfig(`value`.let(ZonalConfigProperty::unwrap))
  }

  /**
   * Configure the `ZonalConfig` object if you want AWS CodeDeploy to deploy your application to one
   * [Availability
   * Zone](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-availability-zones)
   * at a time, within an AWS Region.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a5ab885da9610db1d6963b24bdbfbc7779b060021c581adc938401cd8cd86ec2")
  public open fun zonalConfig(`value`: ZonalConfigProperty.Builder.() -> Unit): Unit =
      zonalConfig(ZonalConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codedeploy.CfnDeploymentConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The destination platform type for the deployment ( `Lambda` , `Server` , or `ECS` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-computeplatform)
     * @param computePlatform The destination platform type for the deployment ( `Lambda` , `Server`
     * , or `ECS` ). 
     */
    public fun computePlatform(computePlatform: String)

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
     * @param deploymentConfigName A name for the deployment configuration. 
     */
    public fun deploymentConfigName(deploymentConfigName: String)

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
     * @param minimumHealthyHosts The minimum number of healthy instances that should be available
     * at any time during the deployment. 
     */
    public fun minimumHealthyHosts(minimumHealthyHosts: IResolvable)

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
     * @param minimumHealthyHosts The minimum number of healthy instances that should be available
     * at any time during the deployment. 
     */
    public fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHostsProperty)

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
     * @param minimumHealthyHosts The minimum number of healthy instances that should be available
     * at any time during the deployment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fbc1c3a565260c5d54a5ad16a4e966843b6eb67b2b603b17bf971baae214889a")
    public
        fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHostsProperty.Builder.() -> Unit)

    /**
     * The configuration that specifies how the deployment traffic is routed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-trafficroutingconfig)
     * @param trafficRoutingConfig The configuration that specifies how the deployment traffic is
     * routed. 
     */
    public fun trafficRoutingConfig(trafficRoutingConfig: IResolvable)

    /**
     * The configuration that specifies how the deployment traffic is routed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-trafficroutingconfig)
     * @param trafficRoutingConfig The configuration that specifies how the deployment traffic is
     * routed. 
     */
    public fun trafficRoutingConfig(trafficRoutingConfig: TrafficRoutingConfigProperty)

    /**
     * The configuration that specifies how the deployment traffic is routed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-trafficroutingconfig)
     * @param trafficRoutingConfig The configuration that specifies how the deployment traffic is
     * routed. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a6a790552c956f9a592a991f15d33e1a0de868fca97a9c3d960b1627e58e3eed")
    public
        fun trafficRoutingConfig(trafficRoutingConfig: TrafficRoutingConfigProperty.Builder.() -> Unit)

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
     * @param zonalConfig Configure the `ZonalConfig` object if you want AWS CodeDeploy to deploy
     * your application to one [Availability
     * Zone](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-availability-zones)
     * at a time, within an AWS Region. 
     */
    public fun zonalConfig(zonalConfig: IResolvable)

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
     * @param zonalConfig Configure the `ZonalConfig` object if you want AWS CodeDeploy to deploy
     * your application to one [Availability
     * Zone](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-availability-zones)
     * at a time, within an AWS Region. 
     */
    public fun zonalConfig(zonalConfig: ZonalConfigProperty)

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
     * @param zonalConfig Configure the `ZonalConfig` object if you want AWS CodeDeploy to deploy
     * your application to one [Availability
     * Zone](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-availability-zones)
     * at a time, within an AWS Region. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82e38925318ba0657ddb028e58cbf24d5850549facc89820c13454720ce7d59a")
    public fun zonalConfig(zonalConfig: ZonalConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.Builder =
        software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.Builder.create(scope, id)

    /**
     * The destination platform type for the deployment ( `Lambda` , `Server` , or `ECS` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-computeplatform)
     * @param computePlatform The destination platform type for the deployment ( `Lambda` , `Server`
     * , or `ECS` ). 
     */
    override fun computePlatform(computePlatform: String) {
      cdkBuilder.computePlatform(computePlatform)
    }

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
     * @param deploymentConfigName A name for the deployment configuration. 
     */
    override fun deploymentConfigName(deploymentConfigName: String) {
      cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

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
     * @param minimumHealthyHosts The minimum number of healthy instances that should be available
     * at any time during the deployment. 
     */
    override fun minimumHealthyHosts(minimumHealthyHosts: IResolvable) {
      cdkBuilder.minimumHealthyHosts(minimumHealthyHosts.let(IResolvable::unwrap))
    }

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
     * @param minimumHealthyHosts The minimum number of healthy instances that should be available
     * at any time during the deployment. 
     */
    override fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHostsProperty) {
      cdkBuilder.minimumHealthyHosts(minimumHealthyHosts.let(MinimumHealthyHostsProperty::unwrap))
    }

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
     * @param minimumHealthyHosts The minimum number of healthy instances that should be available
     * at any time during the deployment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fbc1c3a565260c5d54a5ad16a4e966843b6eb67b2b603b17bf971baae214889a")
    override
        fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHostsProperty.Builder.() -> Unit):
        Unit = minimumHealthyHosts(MinimumHealthyHostsProperty(minimumHealthyHosts))

    /**
     * The configuration that specifies how the deployment traffic is routed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-trafficroutingconfig)
     * @param trafficRoutingConfig The configuration that specifies how the deployment traffic is
     * routed. 
     */
    override fun trafficRoutingConfig(trafficRoutingConfig: IResolvable) {
      cdkBuilder.trafficRoutingConfig(trafficRoutingConfig.let(IResolvable::unwrap))
    }

    /**
     * The configuration that specifies how the deployment traffic is routed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-trafficroutingconfig)
     * @param trafficRoutingConfig The configuration that specifies how the deployment traffic is
     * routed. 
     */
    override fun trafficRoutingConfig(trafficRoutingConfig: TrafficRoutingConfigProperty) {
      cdkBuilder.trafficRoutingConfig(trafficRoutingConfig.let(TrafficRoutingConfigProperty::unwrap))
    }

    /**
     * The configuration that specifies how the deployment traffic is routed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-trafficroutingconfig)
     * @param trafficRoutingConfig The configuration that specifies how the deployment traffic is
     * routed. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a6a790552c956f9a592a991f15d33e1a0de868fca97a9c3d960b1627e58e3eed")
    override
        fun trafficRoutingConfig(trafficRoutingConfig: TrafficRoutingConfigProperty.Builder.() -> Unit):
        Unit = trafficRoutingConfig(TrafficRoutingConfigProperty(trafficRoutingConfig))

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
     * @param zonalConfig Configure the `ZonalConfig` object if you want AWS CodeDeploy to deploy
     * your application to one [Availability
     * Zone](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-availability-zones)
     * at a time, within an AWS Region. 
     */
    override fun zonalConfig(zonalConfig: IResolvable) {
      cdkBuilder.zonalConfig(zonalConfig.let(IResolvable::unwrap))
    }

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
     * @param zonalConfig Configure the `ZonalConfig` object if you want AWS CodeDeploy to deploy
     * your application to one [Availability
     * Zone](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-availability-zones)
     * at a time, within an AWS Region. 
     */
    override fun zonalConfig(zonalConfig: ZonalConfigProperty) {
      cdkBuilder.zonalConfig(zonalConfig.let(ZonalConfigProperty::unwrap))
    }

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
     * @param zonalConfig Configure the `ZonalConfig` object if you want AWS CodeDeploy to deploy
     * your application to one [Availability
     * Zone](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-availability-zones)
     * at a time, within an AWS Region. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82e38925318ba0657ddb028e58cbf24d5850549facc89820c13454720ce7d59a")
    override fun zonalConfig(zonalConfig: ZonalConfigProperty.Builder.() -> Unit): Unit =
        zonalConfig(ZonalConfigProperty(zonalConfig))

    public fun build(): software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeploymentConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeploymentConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig):
        CfnDeploymentConfig = CfnDeploymentConfig(cdkObject)

    internal fun unwrap(wrapped: CfnDeploymentConfig):
        software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig = wrapped.cdkObject
  }

  /**
   * Information about the minimum number of healthy instances per Availability Zone.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
   * MinimumHealthyHostsPerZoneProperty minimumHealthyHostsPerZoneProperty =
   * MinimumHealthyHostsPerZoneProperty.builder()
   * .type("type")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhostsperzone.html)
   */
  public interface MinimumHealthyHostsPerZoneProperty {
    /**
     * The `type` associated with the `MinimumHealthyHostsPerZone` option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhostsperzone.html#cfn-codedeploy-deploymentconfig-minimumhealthyhostsperzone-type)
     */
    public fun type(): String

    /**
     * The `value` associated with the `MinimumHealthyHostsPerZone` option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhostsperzone.html#cfn-codedeploy-deploymentconfig-minimumhealthyhostsperzone-value)
     */
    public fun `value`(): Number

    /**
     * A builder for [MinimumHealthyHostsPerZoneProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The `type` associated with the `MinimumHealthyHostsPerZone` option. 
       */
      public fun type(type: String)

      /**
       * @param value The `value` associated with the `MinimumHealthyHostsPerZone` option. 
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsPerZoneProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsPerZoneProperty.builder()

      /**
       * @param type The `type` associated with the `MinimumHealthyHostsPerZone` option. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value The `value` associated with the `MinimumHealthyHostsPerZone` option. 
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsPerZoneProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsPerZoneProperty,
    ) : CdkObject(cdkObject), MinimumHealthyHostsPerZoneProperty {
      /**
       * The `type` associated with the `MinimumHealthyHostsPerZone` option.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhostsperzone.html#cfn-codedeploy-deploymentconfig-minimumhealthyhostsperzone-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * The `value` associated with the `MinimumHealthyHostsPerZone` option.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhostsperzone.html#cfn-codedeploy-deploymentconfig-minimumhealthyhostsperzone-value)
       */
      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MinimumHealthyHostsPerZoneProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsPerZoneProperty):
          MinimumHealthyHostsPerZoneProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MinimumHealthyHostsPerZoneProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MinimumHealthyHostsPerZoneProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsPerZoneProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsPerZoneProperty
    }
  }

  /**
   * `MinimumHealthyHosts` is a property of the
   * [DeploymentConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html)
   * resource that defines how many instances must remain healthy during an AWS CodeDeploy deployment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
   * MinimumHealthyHostsProperty minimumHealthyHostsProperty = MinimumHealthyHostsProperty.builder()
   * .type("type")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html)
   */
  public interface MinimumHealthyHostsProperty {
    /**
     * The minimum healthy instance type:.
     *
     * * HOST_COUNT: The minimum number of healthy instance as an absolute value.
     * * FLEET_PERCENT: The minimum number of healthy instance as a percentage of the total number
     * of instance in the deployment.
     *
     * In an example of nine instance, if a HOST_COUNT of six is specified, deploy to up to three
     * instances at a time. The deployment is successful if six or more instances are deployed to
     * successfully. Otherwise, the deployment fails. If a FLEET_PERCENT of 40 is specified, deploy to
     * up to five instance at a time. The deployment is successful if four or more instance are
     * deployed to successfully. Otherwise, the deployment fails.
     *
     *
     * In a call to `GetDeploymentConfig` , CodeDeployDefault.OneAtATime returns a minimum healthy
     * instance type of MOST_CONCURRENCY and a value of 1. This means a deployment to only one instance
     * at a time. (You cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or FLEET_PERCENT.)
     * In addition, with CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to ensure that all
     * instances but one are kept in a healthy state during the deployment. Although this allows one
     * instance at a time to be taken offline for a new deployment, it also means that if the
     * deployment to the last instance fails, the overall deployment is still successful.
     *
     *
     * For more information, see [AWS CodeDeploy Instance
     * Health](https://docs.aws.amazon.com//codedeploy/latest/userguide/instances-health.html) in the
     * *AWS CodeDeploy User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html#cfn-codedeploy-deploymentconfig-minimumhealthyhosts-type)
     */
    public fun type(): String

    /**
     * The minimum healthy instance value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html#cfn-codedeploy-deploymentconfig-minimumhealthyhosts-value)
     */
    public fun `value`(): Number

    /**
     * A builder for [MinimumHealthyHostsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The minimum healthy instance type:. 
       * * HOST_COUNT: The minimum number of healthy instance as an absolute value.
       * * FLEET_PERCENT: The minimum number of healthy instance as a percentage of the total number
       * of instance in the deployment.
       *
       * In an example of nine instance, if a HOST_COUNT of six is specified, deploy to up to three
       * instances at a time. The deployment is successful if six or more instances are deployed to
       * successfully. Otherwise, the deployment fails. If a FLEET_PERCENT of 40 is specified, deploy
       * to up to five instance at a time. The deployment is successful if four or more instance are
       * deployed to successfully. Otherwise, the deployment fails.
       *
       *
       * In a call to `GetDeploymentConfig` , CodeDeployDefault.OneAtATime returns a minimum healthy
       * instance type of MOST_CONCURRENCY and a value of 1. This means a deployment to only one
       * instance at a time. (You cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or
       * FLEET_PERCENT.) In addition, with CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to
       * ensure that all instances but one are kept in a healthy state during the deployment. Although
       * this allows one instance at a time to be taken offline for a new deployment, it also means
       * that if the deployment to the last instance fails, the overall deployment is still successful.
       *
       *
       * For more information, see [AWS CodeDeploy Instance
       * Health](https://docs.aws.amazon.com//codedeploy/latest/userguide/instances-health.html) in the
       * *AWS CodeDeploy User Guide* .
       */
      public fun type(type: String)

      /**
       * @param value The minimum healthy instance value. 
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsProperty.builder()

      /**
       * @param type The minimum healthy instance type:. 
       * * HOST_COUNT: The minimum number of healthy instance as an absolute value.
       * * FLEET_PERCENT: The minimum number of healthy instance as a percentage of the total number
       * of instance in the deployment.
       *
       * In an example of nine instance, if a HOST_COUNT of six is specified, deploy to up to three
       * instances at a time. The deployment is successful if six or more instances are deployed to
       * successfully. Otherwise, the deployment fails. If a FLEET_PERCENT of 40 is specified, deploy
       * to up to five instance at a time. The deployment is successful if four or more instance are
       * deployed to successfully. Otherwise, the deployment fails.
       *
       *
       * In a call to `GetDeploymentConfig` , CodeDeployDefault.OneAtATime returns a minimum healthy
       * instance type of MOST_CONCURRENCY and a value of 1. This means a deployment to only one
       * instance at a time. (You cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or
       * FLEET_PERCENT.) In addition, with CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to
       * ensure that all instances but one are kept in a healthy state during the deployment. Although
       * this allows one instance at a time to be taken offline for a new deployment, it also means
       * that if the deployment to the last instance fails, the overall deployment is still successful.
       *
       *
       * For more information, see [AWS CodeDeploy Instance
       * Health](https://docs.aws.amazon.com//codedeploy/latest/userguide/instances-health.html) in the
       * *AWS CodeDeploy User Guide* .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value The minimum healthy instance value. 
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsProperty,
    ) : CdkObject(cdkObject), MinimumHealthyHostsProperty {
      /**
       * The minimum healthy instance type:.
       *
       * * HOST_COUNT: The minimum number of healthy instance as an absolute value.
       * * FLEET_PERCENT: The minimum number of healthy instance as a percentage of the total number
       * of instance in the deployment.
       *
       * In an example of nine instance, if a HOST_COUNT of six is specified, deploy to up to three
       * instances at a time. The deployment is successful if six or more instances are deployed to
       * successfully. Otherwise, the deployment fails. If a FLEET_PERCENT of 40 is specified, deploy
       * to up to five instance at a time. The deployment is successful if four or more instance are
       * deployed to successfully. Otherwise, the deployment fails.
       *
       *
       * In a call to `GetDeploymentConfig` , CodeDeployDefault.OneAtATime returns a minimum healthy
       * instance type of MOST_CONCURRENCY and a value of 1. This means a deployment to only one
       * instance at a time. (You cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or
       * FLEET_PERCENT.) In addition, with CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to
       * ensure that all instances but one are kept in a healthy state during the deployment. Although
       * this allows one instance at a time to be taken offline for a new deployment, it also means
       * that if the deployment to the last instance fails, the overall deployment is still successful.
       *
       *
       * For more information, see [AWS CodeDeploy Instance
       * Health](https://docs.aws.amazon.com//codedeploy/latest/userguide/instances-health.html) in the
       * *AWS CodeDeploy User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html#cfn-codedeploy-deploymentconfig-minimumhealthyhosts-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * The minimum healthy instance value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html#cfn-codedeploy-deploymentconfig-minimumhealthyhosts-value)
       */
      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MinimumHealthyHostsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsProperty):
          MinimumHealthyHostsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MinimumHealthyHostsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MinimumHealthyHostsProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsProperty
    }
  }

  /**
   * A configuration that shifts traffic from one version of a Lambda function or Amazon ECS task
   * set to another in two increments.
   *
   * The original and target Lambda function versions or ECS task sets are specified in the
   * deployment's AppSpec file.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
   * TimeBasedCanaryProperty timeBasedCanaryProperty = TimeBasedCanaryProperty.builder()
   * .canaryInterval(123)
   * .canaryPercentage(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-timebasedcanary.html)
   */
  public interface TimeBasedCanaryProperty {
    /**
     * The number of minutes between the first and second traffic shifts of a `TimeBasedCanary`
     * deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-timebasedcanary.html#cfn-codedeploy-deploymentconfig-timebasedcanary-canaryinterval)
     */
    public fun canaryInterval(): Number

    /**
     * The percentage of traffic to shift in the first increment of a `TimeBasedCanary` deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-timebasedcanary.html#cfn-codedeploy-deploymentconfig-timebasedcanary-canarypercentage)
     */
    public fun canaryPercentage(): Number

    /**
     * A builder for [TimeBasedCanaryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param canaryInterval The number of minutes between the first and second traffic shifts of
       * a `TimeBasedCanary` deployment. 
       */
      public fun canaryInterval(canaryInterval: Number)

      /**
       * @param canaryPercentage The percentage of traffic to shift in the first increment of a
       * `TimeBasedCanary` deployment. 
       */
      public fun canaryPercentage(canaryPercentage: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty.builder()

      /**
       * @param canaryInterval The number of minutes between the first and second traffic shifts of
       * a `TimeBasedCanary` deployment. 
       */
      override fun canaryInterval(canaryInterval: Number) {
        cdkBuilder.canaryInterval(canaryInterval)
      }

      /**
       * @param canaryPercentage The percentage of traffic to shift in the first increment of a
       * `TimeBasedCanary` deployment. 
       */
      override fun canaryPercentage(canaryPercentage: Number) {
        cdkBuilder.canaryPercentage(canaryPercentage)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty,
    ) : CdkObject(cdkObject), TimeBasedCanaryProperty {
      /**
       * The number of minutes between the first and second traffic shifts of a `TimeBasedCanary`
       * deployment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-timebasedcanary.html#cfn-codedeploy-deploymentconfig-timebasedcanary-canaryinterval)
       */
      override fun canaryInterval(): Number = unwrap(this).getCanaryInterval()

      /**
       * The percentage of traffic to shift in the first increment of a `TimeBasedCanary`
       * deployment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-timebasedcanary.html#cfn-codedeploy-deploymentconfig-timebasedcanary-canarypercentage)
       */
      override fun canaryPercentage(): Number = unwrap(this).getCanaryPercentage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimeBasedCanaryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty):
          TimeBasedCanaryProperty = CdkObjectWrappers.wrap(cdkObject) as? TimeBasedCanaryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeBasedCanaryProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty
    }
  }

  /**
   * A configuration that shifts traffic from one version of a Lambda function or ECS task set to
   * another in equal increments, with an equal number of minutes between each increment.
   *
   * The original and target Lambda function versions or ECS task sets are specified in the
   * deployment's AppSpec file.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
   * TimeBasedLinearProperty timeBasedLinearProperty = TimeBasedLinearProperty.builder()
   * .linearInterval(123)
   * .linearPercentage(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-timebasedlinear.html)
   */
  public interface TimeBasedLinearProperty {
    /**
     * The number of minutes between each incremental traffic shift of a `TimeBasedLinear`
     * deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-timebasedlinear.html#cfn-codedeploy-deploymentconfig-timebasedlinear-linearinterval)
     */
    public fun linearInterval(): Number

    /**
     * The percentage of traffic that is shifted at the start of each increment of a
     * `TimeBasedLinear` deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-timebasedlinear.html#cfn-codedeploy-deploymentconfig-timebasedlinear-linearpercentage)
     */
    public fun linearPercentage(): Number

    /**
     * A builder for [TimeBasedLinearProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param linearInterval The number of minutes between each incremental traffic shift of a
       * `TimeBasedLinear` deployment. 
       */
      public fun linearInterval(linearInterval: Number)

      /**
       * @param linearPercentage The percentage of traffic that is shifted at the start of each
       * increment of a `TimeBasedLinear` deployment. 
       */
      public fun linearPercentage(linearPercentage: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty.builder()

      /**
       * @param linearInterval The number of minutes between each incremental traffic shift of a
       * `TimeBasedLinear` deployment. 
       */
      override fun linearInterval(linearInterval: Number) {
        cdkBuilder.linearInterval(linearInterval)
      }

      /**
       * @param linearPercentage The percentage of traffic that is shifted at the start of each
       * increment of a `TimeBasedLinear` deployment. 
       */
      override fun linearPercentage(linearPercentage: Number) {
        cdkBuilder.linearPercentage(linearPercentage)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty,
    ) : CdkObject(cdkObject), TimeBasedLinearProperty {
      /**
       * The number of minutes between each incremental traffic shift of a `TimeBasedLinear`
       * deployment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-timebasedlinear.html#cfn-codedeploy-deploymentconfig-timebasedlinear-linearinterval)
       */
      override fun linearInterval(): Number = unwrap(this).getLinearInterval()

      /**
       * The percentage of traffic that is shifted at the start of each increment of a
       * `TimeBasedLinear` deployment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-timebasedlinear.html#cfn-codedeploy-deploymentconfig-timebasedlinear-linearpercentage)
       */
      override fun linearPercentage(): Number = unwrap(this).getLinearPercentage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimeBasedLinearProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty):
          TimeBasedLinearProperty = CdkObjectWrappers.wrap(cdkObject) as? TimeBasedLinearProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeBasedLinearProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty
    }
  }

  /**
   * The configuration that specifies how traffic is shifted from one version of a Lambda function
   * to another version during an AWS Lambda deployment, or from one Amazon ECS task set to another
   * during an Amazon ECS deployment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
   * TrafficRoutingConfigProperty trafficRoutingConfigProperty =
   * TrafficRoutingConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-trafficroutingconfig.html)
   */
  public interface TrafficRoutingConfigProperty {
    /**
     * A configuration that shifts traffic from one version of a Lambda function or ECS task set to
     * another in two increments.
     *
     * The original and target Lambda function versions or ECS task sets are specified in the
     * deployment's AppSpec file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-trafficroutingconfig.html#cfn-codedeploy-deploymentconfig-trafficroutingconfig-timebasedcanary)
     */
    public fun timeBasedCanary(): Any? = unwrap(this).getTimeBasedCanary()

    /**
     * A configuration that shifts traffic from one version of a Lambda function or Amazon ECS task
     * set to another in equal increments, with an equal number of minutes between each increment.
     *
     * The original and target Lambda function versions or Amazon ECS task sets are specified in the
     * deployment's AppSpec file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-trafficroutingconfig.html#cfn-codedeploy-deploymentconfig-trafficroutingconfig-timebasedlinear)
     */
    public fun timeBasedLinear(): Any? = unwrap(this).getTimeBasedLinear()

    /**
     * The type of traffic shifting ( `TimeBasedCanary` or `TimeBasedLinear` ) used by a deployment
     * configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-trafficroutingconfig.html#cfn-codedeploy-deploymentconfig-trafficroutingconfig-type)
     */
    public fun type(): String

    /**
     * A builder for [TrafficRoutingConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param timeBasedCanary A configuration that shifts traffic from one version of a Lambda
       * function or ECS task set to another in two increments.
       * The original and target Lambda function versions or ECS task sets are specified in the
       * deployment's AppSpec file.
       */
      public fun timeBasedCanary(timeBasedCanary: IResolvable)

      /**
       * @param timeBasedCanary A configuration that shifts traffic from one version of a Lambda
       * function or ECS task set to another in two increments.
       * The original and target Lambda function versions or ECS task sets are specified in the
       * deployment's AppSpec file.
       */
      public fun timeBasedCanary(timeBasedCanary: TimeBasedCanaryProperty)

      /**
       * @param timeBasedCanary A configuration that shifts traffic from one version of a Lambda
       * function or ECS task set to another in two increments.
       * The original and target Lambda function versions or ECS task sets are specified in the
       * deployment's AppSpec file.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32115ce6e20e117c8f464c1a8cda6c2d27b8944c439b7ad12d2637c1b9038c35")
      public fun timeBasedCanary(timeBasedCanary: TimeBasedCanaryProperty.Builder.() -> Unit)

      /**
       * @param timeBasedLinear A configuration that shifts traffic from one version of a Lambda
       * function or Amazon ECS task set to another in equal increments, with an equal number of
       * minutes between each increment.
       * The original and target Lambda function versions or Amazon ECS task sets are specified in
       * the deployment's AppSpec file.
       */
      public fun timeBasedLinear(timeBasedLinear: IResolvable)

      /**
       * @param timeBasedLinear A configuration that shifts traffic from one version of a Lambda
       * function or Amazon ECS task set to another in equal increments, with an equal number of
       * minutes between each increment.
       * The original and target Lambda function versions or Amazon ECS task sets are specified in
       * the deployment's AppSpec file.
       */
      public fun timeBasedLinear(timeBasedLinear: TimeBasedLinearProperty)

      /**
       * @param timeBasedLinear A configuration that shifts traffic from one version of a Lambda
       * function or Amazon ECS task set to another in equal increments, with an equal number of
       * minutes between each increment.
       * The original and target Lambda function versions or Amazon ECS task sets are specified in
       * the deployment's AppSpec file.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ed05caad02b178f12e9a278512f7f6967e67dc19d57dcbdc419a042bcafa27f")
      public fun timeBasedLinear(timeBasedLinear: TimeBasedLinearProperty.Builder.() -> Unit)

      /**
       * @param type The type of traffic shifting ( `TimeBasedCanary` or `TimeBasedLinear` ) used by
       * a deployment configuration. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty.builder()

      /**
       * @param timeBasedCanary A configuration that shifts traffic from one version of a Lambda
       * function or ECS task set to another in two increments.
       * The original and target Lambda function versions or ECS task sets are specified in the
       * deployment's AppSpec file.
       */
      override fun timeBasedCanary(timeBasedCanary: IResolvable) {
        cdkBuilder.timeBasedCanary(timeBasedCanary.let(IResolvable::unwrap))
      }

      /**
       * @param timeBasedCanary A configuration that shifts traffic from one version of a Lambda
       * function or ECS task set to another in two increments.
       * The original and target Lambda function versions or ECS task sets are specified in the
       * deployment's AppSpec file.
       */
      override fun timeBasedCanary(timeBasedCanary: TimeBasedCanaryProperty) {
        cdkBuilder.timeBasedCanary(timeBasedCanary.let(TimeBasedCanaryProperty::unwrap))
      }

      /**
       * @param timeBasedCanary A configuration that shifts traffic from one version of a Lambda
       * function or ECS task set to another in two increments.
       * The original and target Lambda function versions or ECS task sets are specified in the
       * deployment's AppSpec file.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32115ce6e20e117c8f464c1a8cda6c2d27b8944c439b7ad12d2637c1b9038c35")
      override fun timeBasedCanary(timeBasedCanary: TimeBasedCanaryProperty.Builder.() -> Unit):
          Unit = timeBasedCanary(TimeBasedCanaryProperty(timeBasedCanary))

      /**
       * @param timeBasedLinear A configuration that shifts traffic from one version of a Lambda
       * function or Amazon ECS task set to another in equal increments, with an equal number of
       * minutes between each increment.
       * The original and target Lambda function versions or Amazon ECS task sets are specified in
       * the deployment's AppSpec file.
       */
      override fun timeBasedLinear(timeBasedLinear: IResolvable) {
        cdkBuilder.timeBasedLinear(timeBasedLinear.let(IResolvable::unwrap))
      }

      /**
       * @param timeBasedLinear A configuration that shifts traffic from one version of a Lambda
       * function or Amazon ECS task set to another in equal increments, with an equal number of
       * minutes between each increment.
       * The original and target Lambda function versions or Amazon ECS task sets are specified in
       * the deployment's AppSpec file.
       */
      override fun timeBasedLinear(timeBasedLinear: TimeBasedLinearProperty) {
        cdkBuilder.timeBasedLinear(timeBasedLinear.let(TimeBasedLinearProperty::unwrap))
      }

      /**
       * @param timeBasedLinear A configuration that shifts traffic from one version of a Lambda
       * function or Amazon ECS task set to another in equal increments, with an equal number of
       * minutes between each increment.
       * The original and target Lambda function versions or Amazon ECS task sets are specified in
       * the deployment's AppSpec file.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ed05caad02b178f12e9a278512f7f6967e67dc19d57dcbdc419a042bcafa27f")
      override fun timeBasedLinear(timeBasedLinear: TimeBasedLinearProperty.Builder.() -> Unit):
          Unit = timeBasedLinear(TimeBasedLinearProperty(timeBasedLinear))

      /**
       * @param type The type of traffic shifting ( `TimeBasedCanary` or `TimeBasedLinear` ) used by
       * a deployment configuration. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty,
    ) : CdkObject(cdkObject), TrafficRoutingConfigProperty {
      /**
       * A configuration that shifts traffic from one version of a Lambda function or ECS task set
       * to another in two increments.
       *
       * The original and target Lambda function versions or ECS task sets are specified in the
       * deployment's AppSpec file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-trafficroutingconfig.html#cfn-codedeploy-deploymentconfig-trafficroutingconfig-timebasedcanary)
       */
      override fun timeBasedCanary(): Any? = unwrap(this).getTimeBasedCanary()

      /**
       * A configuration that shifts traffic from one version of a Lambda function or Amazon ECS
       * task set to another in equal increments, with an equal number of minutes between each
       * increment.
       *
       * The original and target Lambda function versions or Amazon ECS task sets are specified in
       * the deployment's AppSpec file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-trafficroutingconfig.html#cfn-codedeploy-deploymentconfig-trafficroutingconfig-timebasedlinear)
       */
      override fun timeBasedLinear(): Any? = unwrap(this).getTimeBasedLinear()

      /**
       * The type of traffic shifting ( `TimeBasedCanary` or `TimeBasedLinear` ) used by a
       * deployment configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-trafficroutingconfig.html#cfn-codedeploy-deploymentconfig-trafficroutingconfig-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TrafficRoutingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty):
          TrafficRoutingConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TrafficRoutingConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrafficRoutingConfigProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty
    }
  }

  /**
   * Configure the `ZonalConfig` object if you want AWS CodeDeploy to deploy your application to one
   * [Availability
   * Zone](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-availability-zones)
   * at a time, within an AWS Region. By deploying to one Availability Zone at a time, you can expose
   * your deployment to a progressively larger audience as confidence in the deployment's performance
   * and viability grows. If you don't configure the `ZonalConfig` object, CodeDeploy deploys your
   * application to a random selection of hosts across a Region.
   *
   * For more information about the zonal configuration feature, see [zonal
   * configuration](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
   * in the *CodeDeploy User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codedeploy.*;
   * ZonalConfigProperty zonalConfigProperty = ZonalConfigProperty.builder()
   * .firstZoneMonitorDurationInSeconds(123)
   * .minimumHealthyHostsPerZone(MinimumHealthyHostsPerZoneProperty.builder()
   * .type("type")
   * .value(123)
   * .build())
   * .monitorDurationInSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-zonalconfig.html)
   */
  public interface ZonalConfigProperty {
    /**
     * The period of time, in seconds, that CodeDeploy must wait after completing a deployment to
     * the *first* Availability Zone.
     *
     * CodeDeploy will wait this amount of time before starting a deployment to the second
     * Availability Zone. You might set this option if you want to allow extra bake time for the first
     * Availability Zone. If you don't specify a value for `firstZoneMonitorDurationInSeconds` , then
     * CodeDeploy uses the `monitorDurationInSeconds` value for the first Availability Zone.
     *
     * For more information about the zonal configuration feature, see [zonal
     * configuration](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
     * in the *CodeDeploy User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-zonalconfig.html#cfn-codedeploy-deploymentconfig-zonalconfig-firstzonemonitordurationinseconds)
     */
    public fun firstZoneMonitorDurationInSeconds(): Number? =
        unwrap(this).getFirstZoneMonitorDurationInSeconds()

    /**
     * The number or percentage of instances that must remain available per Availability Zone during
     * a deployment.
     *
     * This option works in conjunction with the `MinimumHealthyHosts` option. For more information,
     * see [About the minimum number of healthy hosts per Availability
     * Zone](https://docs.aws.amazon.com//codedeploy/latest/userguide/instances-health.html#minimum-healthy-hosts-az)
     * in the *CodeDeploy User Guide* .
     *
     * If you don't specify the `minimumHealthyHostsPerZone` option, then CodeDeploy uses a default
     * value of `0` percent.
     *
     * For more information about the zonal configuration feature, see [zonal
     * configuration](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
     * in the *CodeDeploy User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-zonalconfig.html#cfn-codedeploy-deploymentconfig-zonalconfig-minimumhealthyhostsperzone)
     */
    public fun minimumHealthyHostsPerZone(): Any? = unwrap(this).getMinimumHealthyHostsPerZone()

    /**
     * The period of time, in seconds, that CodeDeploy must wait after completing a deployment to an
     * Availability Zone.
     *
     * CodeDeploy will wait this amount of time before starting a deployment to the next
     * Availability Zone. Consider adding a monitor duration to give the deployment some time to prove
     * itself (or 'bake') in one Availability Zone before it is released in the next zone. If you don't
     * specify a `monitorDurationInSeconds` , CodeDeploy starts deploying to the next Availability Zone
     * immediately.
     *
     * For more information about the zonal configuration feature, see [zonal
     * configuration](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
     * in the *CodeDeploy User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-zonalconfig.html#cfn-codedeploy-deploymentconfig-zonalconfig-monitordurationinseconds)
     */
    public fun monitorDurationInSeconds(): Number? = unwrap(this).getMonitorDurationInSeconds()

    /**
     * A builder for [ZonalConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param firstZoneMonitorDurationInSeconds The period of time, in seconds, that CodeDeploy
       * must wait after completing a deployment to the *first* Availability Zone.
       * CodeDeploy will wait this amount of time before starting a deployment to the second
       * Availability Zone. You might set this option if you want to allow extra bake time for the
       * first Availability Zone. If you don't specify a value for `firstZoneMonitorDurationInSeconds`
       * , then CodeDeploy uses the `monitorDurationInSeconds` value for the first Availability Zone.
       *
       * For more information about the zonal configuration feature, see [zonal
       * configuration](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
       * in the *CodeDeploy User Guide* .
       */
      public fun firstZoneMonitorDurationInSeconds(firstZoneMonitorDurationInSeconds: Number)

      /**
       * @param minimumHealthyHostsPerZone The number or percentage of instances that must remain
       * available per Availability Zone during a deployment.
       * This option works in conjunction with the `MinimumHealthyHosts` option. For more
       * information, see [About the minimum number of healthy hosts per Availability
       * Zone](https://docs.aws.amazon.com//codedeploy/latest/userguide/instances-health.html#minimum-healthy-hosts-az)
       * in the *CodeDeploy User Guide* .
       *
       * If you don't specify the `minimumHealthyHostsPerZone` option, then CodeDeploy uses a
       * default value of `0` percent.
       *
       * For more information about the zonal configuration feature, see [zonal
       * configuration](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
       * in the *CodeDeploy User Guide* .
       */
      public fun minimumHealthyHostsPerZone(minimumHealthyHostsPerZone: IResolvable)

      /**
       * @param minimumHealthyHostsPerZone The number or percentage of instances that must remain
       * available per Availability Zone during a deployment.
       * This option works in conjunction with the `MinimumHealthyHosts` option. For more
       * information, see [About the minimum number of healthy hosts per Availability
       * Zone](https://docs.aws.amazon.com//codedeploy/latest/userguide/instances-health.html#minimum-healthy-hosts-az)
       * in the *CodeDeploy User Guide* .
       *
       * If you don't specify the `minimumHealthyHostsPerZone` option, then CodeDeploy uses a
       * default value of `0` percent.
       *
       * For more information about the zonal configuration feature, see [zonal
       * configuration](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
       * in the *CodeDeploy User Guide* .
       */
      public
          fun minimumHealthyHostsPerZone(minimumHealthyHostsPerZone: MinimumHealthyHostsPerZoneProperty)

      /**
       * @param minimumHealthyHostsPerZone The number or percentage of instances that must remain
       * available per Availability Zone during a deployment.
       * This option works in conjunction with the `MinimumHealthyHosts` option. For more
       * information, see [About the minimum number of healthy hosts per Availability
       * Zone](https://docs.aws.amazon.com//codedeploy/latest/userguide/instances-health.html#minimum-healthy-hosts-az)
       * in the *CodeDeploy User Guide* .
       *
       * If you don't specify the `minimumHealthyHostsPerZone` option, then CodeDeploy uses a
       * default value of `0` percent.
       *
       * For more information about the zonal configuration feature, see [zonal
       * configuration](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
       * in the *CodeDeploy User Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87ea626ac55620d1f14ed70d11d4095a689636449fcbd66960aef032eaead7b5")
      public
          fun minimumHealthyHostsPerZone(minimumHealthyHostsPerZone: MinimumHealthyHostsPerZoneProperty.Builder.() -> Unit)

      /**
       * @param monitorDurationInSeconds The period of time, in seconds, that CodeDeploy must wait
       * after completing a deployment to an Availability Zone.
       * CodeDeploy will wait this amount of time before starting a deployment to the next
       * Availability Zone. Consider adding a monitor duration to give the deployment some time to
       * prove itself (or 'bake') in one Availability Zone before it is released in the next zone. If
       * you don't specify a `monitorDurationInSeconds` , CodeDeploy starts deploying to the next
       * Availability Zone immediately.
       *
       * For more information about the zonal configuration feature, see [zonal
       * configuration](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
       * in the *CodeDeploy User Guide* .
       */
      public fun monitorDurationInSeconds(monitorDurationInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.ZonalConfigProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.ZonalConfigProperty.builder()

      /**
       * @param firstZoneMonitorDurationInSeconds The period of time, in seconds, that CodeDeploy
       * must wait after completing a deployment to the *first* Availability Zone.
       * CodeDeploy will wait this amount of time before starting a deployment to the second
       * Availability Zone. You might set this option if you want to allow extra bake time for the
       * first Availability Zone. If you don't specify a value for `firstZoneMonitorDurationInSeconds`
       * , then CodeDeploy uses the `monitorDurationInSeconds` value for the first Availability Zone.
       *
       * For more information about the zonal configuration feature, see [zonal
       * configuration](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
       * in the *CodeDeploy User Guide* .
       */
      override fun firstZoneMonitorDurationInSeconds(firstZoneMonitorDurationInSeconds: Number) {
        cdkBuilder.firstZoneMonitorDurationInSeconds(firstZoneMonitorDurationInSeconds)
      }

      /**
       * @param minimumHealthyHostsPerZone The number or percentage of instances that must remain
       * available per Availability Zone during a deployment.
       * This option works in conjunction with the `MinimumHealthyHosts` option. For more
       * information, see [About the minimum number of healthy hosts per Availability
       * Zone](https://docs.aws.amazon.com//codedeploy/latest/userguide/instances-health.html#minimum-healthy-hosts-az)
       * in the *CodeDeploy User Guide* .
       *
       * If you don't specify the `minimumHealthyHostsPerZone` option, then CodeDeploy uses a
       * default value of `0` percent.
       *
       * For more information about the zonal configuration feature, see [zonal
       * configuration](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
       * in the *CodeDeploy User Guide* .
       */
      override fun minimumHealthyHostsPerZone(minimumHealthyHostsPerZone: IResolvable) {
        cdkBuilder.minimumHealthyHostsPerZone(minimumHealthyHostsPerZone.let(IResolvable::unwrap))
      }

      /**
       * @param minimumHealthyHostsPerZone The number or percentage of instances that must remain
       * available per Availability Zone during a deployment.
       * This option works in conjunction with the `MinimumHealthyHosts` option. For more
       * information, see [About the minimum number of healthy hosts per Availability
       * Zone](https://docs.aws.amazon.com//codedeploy/latest/userguide/instances-health.html#minimum-healthy-hosts-az)
       * in the *CodeDeploy User Guide* .
       *
       * If you don't specify the `minimumHealthyHostsPerZone` option, then CodeDeploy uses a
       * default value of `0` percent.
       *
       * For more information about the zonal configuration feature, see [zonal
       * configuration](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
       * in the *CodeDeploy User Guide* .
       */
      override
          fun minimumHealthyHostsPerZone(minimumHealthyHostsPerZone: MinimumHealthyHostsPerZoneProperty) {
        cdkBuilder.minimumHealthyHostsPerZone(minimumHealthyHostsPerZone.let(MinimumHealthyHostsPerZoneProperty::unwrap))
      }

      /**
       * @param minimumHealthyHostsPerZone The number or percentage of instances that must remain
       * available per Availability Zone during a deployment.
       * This option works in conjunction with the `MinimumHealthyHosts` option. For more
       * information, see [About the minimum number of healthy hosts per Availability
       * Zone](https://docs.aws.amazon.com//codedeploy/latest/userguide/instances-health.html#minimum-healthy-hosts-az)
       * in the *CodeDeploy User Guide* .
       *
       * If you don't specify the `minimumHealthyHostsPerZone` option, then CodeDeploy uses a
       * default value of `0` percent.
       *
       * For more information about the zonal configuration feature, see [zonal
       * configuration](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
       * in the *CodeDeploy User Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87ea626ac55620d1f14ed70d11d4095a689636449fcbd66960aef032eaead7b5")
      override
          fun minimumHealthyHostsPerZone(minimumHealthyHostsPerZone: MinimumHealthyHostsPerZoneProperty.Builder.() -> Unit):
          Unit =
          minimumHealthyHostsPerZone(MinimumHealthyHostsPerZoneProperty(minimumHealthyHostsPerZone))

      /**
       * @param monitorDurationInSeconds The period of time, in seconds, that CodeDeploy must wait
       * after completing a deployment to an Availability Zone.
       * CodeDeploy will wait this amount of time before starting a deployment to the next
       * Availability Zone. Consider adding a monitor duration to give the deployment some time to
       * prove itself (or 'bake') in one Availability Zone before it is released in the next zone. If
       * you don't specify a `monitorDurationInSeconds` , CodeDeploy starts deploying to the next
       * Availability Zone immediately.
       *
       * For more information about the zonal configuration feature, see [zonal
       * configuration](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
       * in the *CodeDeploy User Guide* .
       */
      override fun monitorDurationInSeconds(monitorDurationInSeconds: Number) {
        cdkBuilder.monitorDurationInSeconds(monitorDurationInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.ZonalConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.ZonalConfigProperty,
    ) : CdkObject(cdkObject), ZonalConfigProperty {
      /**
       * The period of time, in seconds, that CodeDeploy must wait after completing a deployment to
       * the *first* Availability Zone.
       *
       * CodeDeploy will wait this amount of time before starting a deployment to the second
       * Availability Zone. You might set this option if you want to allow extra bake time for the
       * first Availability Zone. If you don't specify a value for `firstZoneMonitorDurationInSeconds`
       * , then CodeDeploy uses the `monitorDurationInSeconds` value for the first Availability Zone.
       *
       * For more information about the zonal configuration feature, see [zonal
       * configuration](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
       * in the *CodeDeploy User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-zonalconfig.html#cfn-codedeploy-deploymentconfig-zonalconfig-firstzonemonitordurationinseconds)
       */
      override fun firstZoneMonitorDurationInSeconds(): Number? =
          unwrap(this).getFirstZoneMonitorDurationInSeconds()

      /**
       * The number or percentage of instances that must remain available per Availability Zone
       * during a deployment.
       *
       * This option works in conjunction with the `MinimumHealthyHosts` option. For more
       * information, see [About the minimum number of healthy hosts per Availability
       * Zone](https://docs.aws.amazon.com//codedeploy/latest/userguide/instances-health.html#minimum-healthy-hosts-az)
       * in the *CodeDeploy User Guide* .
       *
       * If you don't specify the `minimumHealthyHostsPerZone` option, then CodeDeploy uses a
       * default value of `0` percent.
       *
       * For more information about the zonal configuration feature, see [zonal
       * configuration](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
       * in the *CodeDeploy User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-zonalconfig.html#cfn-codedeploy-deploymentconfig-zonalconfig-minimumhealthyhostsperzone)
       */
      override fun minimumHealthyHostsPerZone(): Any? = unwrap(this).getMinimumHealthyHostsPerZone()

      /**
       * The period of time, in seconds, that CodeDeploy must wait after completing a deployment to
       * an Availability Zone.
       *
       * CodeDeploy will wait this amount of time before starting a deployment to the next
       * Availability Zone. Consider adding a monitor duration to give the deployment some time to
       * prove itself (or 'bake') in one Availability Zone before it is released in the next zone. If
       * you don't specify a `monitorDurationInSeconds` , CodeDeploy starts deploying to the next
       * Availability Zone immediately.
       *
       * For more information about the zonal configuration feature, see [zonal
       * configuration](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
       * in the *CodeDeploy User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-zonalconfig.html#cfn-codedeploy-deploymentconfig-zonalconfig-monitordurationinseconds)
       */
      override fun monitorDurationInSeconds(): Number? = unwrap(this).getMonitorDurationInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ZonalConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.ZonalConfigProperty):
          ZonalConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? ZonalConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ZonalConfigProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.ZonalConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.ZonalConfigProperty
    }
  }
}
