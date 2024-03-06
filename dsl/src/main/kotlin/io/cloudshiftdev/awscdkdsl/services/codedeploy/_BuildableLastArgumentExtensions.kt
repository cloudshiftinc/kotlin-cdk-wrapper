@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.codedeploy

import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

/**
 * The minimum number of healthy instances that should be available at any time during the
 * deployment.
 */
public inline fun CfnDeploymentConfig.setMinimumHealthyHosts(
    block: CfnDeploymentConfigMinimumHealthyHostsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDeploymentConfigMinimumHealthyHostsPropertyDsl()
    builder.apply(block)
    return setMinimumHealthyHosts(builder.build())
}

/** The configuration that specifies how the deployment traffic is routed. */
public inline fun CfnDeploymentConfig.setTrafficRoutingConfig(
    block: CfnDeploymentConfigTrafficRoutingConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDeploymentConfigTrafficRoutingConfigPropertyDsl()
    builder.apply(block)
    return setTrafficRoutingConfig(builder.build())
}

/**
 * Configure the `ZonalConfig` object if you want AWS CodeDeploy to deploy your application to one
 * [Availability Zone](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-availability-zones)
 * at a time, within an AWS Region.
 */
public inline fun CfnDeploymentConfig.setZonalConfig(
    block: CfnDeploymentConfigZonalConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDeploymentConfigZonalConfigPropertyDsl()
    builder.apply(block)
    return setZonalConfig(builder.build())
}

/** Information about the Amazon CloudWatch alarms that are associated with the deployment group. */
public inline fun CfnDeploymentGroup.setAlarmConfiguration(
    block: CfnDeploymentGroupAlarmConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDeploymentGroupAlarmConfigurationPropertyDsl()
    builder.apply(block)
    return setAlarmConfiguration(builder.build())
}

/**
 * Information about the automatic rollback configuration that is associated with the deployment
 * group.
 */
public inline fun CfnDeploymentGroup.setAutoRollbackConfiguration(
    block: CfnDeploymentGroupAutoRollbackConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDeploymentGroupAutoRollbackConfigurationPropertyDsl()
    builder.apply(block)
    return setAutoRollbackConfiguration(builder.build())
}

/** Information about blue/green deployment options for a deployment group. */
public inline fun CfnDeploymentGroup.setBlueGreenDeploymentConfiguration(
    block: CfnDeploymentGroupBlueGreenDeploymentConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDeploymentGroupBlueGreenDeploymentConfigurationPropertyDsl()
    builder.apply(block)
    return setBlueGreenDeploymentConfiguration(builder.build())
}

/** The application revision to deploy to this deployment group. */
public inline fun CfnDeploymentGroup.setDeployment(
    block: CfnDeploymentGroupDeploymentPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDeploymentGroupDeploymentPropertyDsl()
    builder.apply(block)
    return setDeployment(builder.build())
}

/**
 * Attributes that determine the type of deployment to run and whether to route deployment traffic
 * behind a load balancer.
 */
public inline fun CfnDeploymentGroup.setDeploymentStyle(
    block: CfnDeploymentGroupDeploymentStylePropertyDsl.() -> Unit = {}
) {
    val builder = CfnDeploymentGroupDeploymentStylePropertyDsl()
    builder.apply(block)
    return setDeploymentStyle(builder.build())
}

/** Information about groups of tags applied to Amazon EC2 instances. */
public inline fun CfnDeploymentGroup.setEc2TagSet(
    block: CfnDeploymentGroupEC2TagSetPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDeploymentGroupEC2TagSetPropertyDsl()
    builder.apply(block)
    return setEc2TagSet(builder.build())
}

/** Information about the load balancer to use in a deployment. */
public inline fun CfnDeploymentGroup.setLoadBalancerInfo(
    block: CfnDeploymentGroupLoadBalancerInfoPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDeploymentGroupLoadBalancerInfoPropertyDsl()
    builder.apply(block)
    return setLoadBalancerInfo(builder.build())
}

/** Information about groups of tags applied to on-premises instances. */
public inline fun CfnDeploymentGroup.setOnPremisesTagSet(
    block: CfnDeploymentGroupOnPremisesTagSetPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDeploymentGroupOnPremisesTagSetPropertyDsl()
    builder.apply(block)
    return setOnPremisesTagSet(builder.build())
}
