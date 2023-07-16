@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.groundstation.CfnConfig
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup
import software.amazon.awscdk.services.groundstation.CfnMissionProfile

public inline fun CfnConfig.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnConfig.setConfigData(block: CfnConfigConfigDataPropertyDsl.() -> Unit = {}) {
  val builder = CfnConfigConfigDataPropertyDsl()
  builder.apply(block)
  return setConfigData(builder.build())
}

public inline fun CfnDataflowEndpointGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnMissionProfile.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnMissionProfile.setStreamsKmsKey(block: CfnMissionProfileStreamsKmsKeyPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnMissionProfileStreamsKmsKeyPropertyDsl()
  builder.apply(block)
  return setStreamsKmsKey(builder.build())
}
