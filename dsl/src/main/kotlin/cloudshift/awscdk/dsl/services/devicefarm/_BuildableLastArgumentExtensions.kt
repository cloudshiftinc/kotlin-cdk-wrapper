@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.devicefarm

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.devicefarm.CfnDevicePool
import software.amazon.awscdk.services.devicefarm.CfnInstanceProfile
import software.amazon.awscdk.services.devicefarm.CfnNetworkProfile
import software.amazon.awscdk.services.devicefarm.CfnProject
import software.amazon.awscdk.services.devicefarm.CfnTestGridProject
import software.amazon.awscdk.services.devicefarm.CfnVPCEConfiguration

public inline fun CfnDevicePool.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnInstanceProfile.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnNetworkProfile.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnProject.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnProject.setVpcConfig(block: CfnProjectVpcConfigPropertyDsl.() -> Unit = {}) {
  val builder = CfnProjectVpcConfigPropertyDsl()
  builder.apply(block)
  return setVpcConfig(builder.build())
}

public inline fun CfnTestGridProject.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnTestGridProject.setVpcConfig(block: CfnTestGridProjectVpcConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnTestGridProjectVpcConfigPropertyDsl()
  builder.apply(block)
  return setVpcConfig(builder.build())
}

public inline fun CfnVPCEConfiguration.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}
