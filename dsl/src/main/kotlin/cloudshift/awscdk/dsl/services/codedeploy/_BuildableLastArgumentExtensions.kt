@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.codedeploy.CfnApplication
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

public inline fun CfnApplication.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnDeploymentConfig.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnDeploymentConfig.setMinimumHealthyHosts(block: CfnDeploymentConfigMinimumHealthyHostsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeploymentConfigMinimumHealthyHostsPropertyDsl()
  builder.apply(block)
  return setMinimumHealthyHosts(builder.build())
}

public inline
    fun CfnDeploymentConfig.setTrafficRoutingConfig(block: CfnDeploymentConfigTrafficRoutingConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeploymentConfigTrafficRoutingConfigPropertyDsl()
  builder.apply(block)
  return setTrafficRoutingConfig(builder.build())
}

public inline fun CfnDeploymentGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnDeploymentGroup.setAlarmConfiguration(block: CfnDeploymentGroupAlarmConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeploymentGroupAlarmConfigurationPropertyDsl()
  builder.apply(block)
  return setAlarmConfiguration(builder.build())
}

public inline
    fun CfnDeploymentGroup.setAutoRollbackConfiguration(block: CfnDeploymentGroupAutoRollbackConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeploymentGroupAutoRollbackConfigurationPropertyDsl()
  builder.apply(block)
  return setAutoRollbackConfiguration(builder.build())
}

public inline
    fun CfnDeploymentGroup.setBlueGreenDeploymentConfiguration(block: CfnDeploymentGroupBlueGreenDeploymentConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeploymentGroupBlueGreenDeploymentConfigurationPropertyDsl()
  builder.apply(block)
  return setBlueGreenDeploymentConfiguration(builder.build())
}

public inline
    fun CfnDeploymentGroup.setDeployment(block: CfnDeploymentGroupDeploymentPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnDeploymentGroupDeploymentPropertyDsl()
  builder.apply(block)
  return setDeployment(builder.build())
}

public inline
    fun CfnDeploymentGroup.setDeploymentStyle(block: CfnDeploymentGroupDeploymentStylePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeploymentGroupDeploymentStylePropertyDsl()
  builder.apply(block)
  return setDeploymentStyle(builder.build())
}

public inline
    fun CfnDeploymentGroup.setEc2TagSet(block: CfnDeploymentGroupEC2TagSetPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnDeploymentGroupEC2TagSetPropertyDsl()
  builder.apply(block)
  return setEc2TagSet(builder.build())
}

public inline
    fun CfnDeploymentGroup.setLoadBalancerInfo(block: CfnDeploymentGroupLoadBalancerInfoPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeploymentGroupLoadBalancerInfoPropertyDsl()
  builder.apply(block)
  return setLoadBalancerInfo(builder.build())
}

public inline
    fun CfnDeploymentGroup.setOnPremisesTagSet(block: CfnDeploymentGroupOnPremisesTagSetPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeploymentGroupOnPremisesTagSetPropertyDsl()
  builder.apply(block)
  return setOnPremisesTagSet(builder.build())
}
