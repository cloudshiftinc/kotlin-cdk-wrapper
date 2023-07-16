@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.iotevents.CfnAlarmModel
import software.amazon.awscdk.services.iotevents.CfnDetectorModel
import software.amazon.awscdk.services.iotevents.CfnInput

public inline fun CfnAlarmModel.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnAlarmModel.setAlarmCapabilities(block: CfnAlarmModelAlarmCapabilitiesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAlarmModelAlarmCapabilitiesPropertyDsl()
  builder.apply(block)
  return setAlarmCapabilities(builder.build())
}

public inline
    fun CfnAlarmModel.setAlarmEventActions(block: CfnAlarmModelAlarmEventActionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAlarmModelAlarmEventActionsPropertyDsl()
  builder.apply(block)
  return setAlarmEventActions(builder.build())
}

public inline fun CfnAlarmModel.setAlarmRule(block: CfnAlarmModelAlarmRulePropertyDsl.() -> Unit =
    {}) {
  val builder = CfnAlarmModelAlarmRulePropertyDsl()
  builder.apply(block)
  return setAlarmRule(builder.build())
}

public inline fun CfnDetectorModel.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnDetectorModel.setDetectorModelDefinition(block: CfnDetectorModelDetectorModelDefinitionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDetectorModelDetectorModelDefinitionPropertyDsl()
  builder.apply(block)
  return setDetectorModelDefinition(builder.build())
}

public inline fun CfnInput.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnInput.setInputDefinition(block: CfnInputInputDefinitionPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnInputInputDefinitionPropertyDsl()
  builder.apply(block)
  return setInputDefinition(builder.build())
}
