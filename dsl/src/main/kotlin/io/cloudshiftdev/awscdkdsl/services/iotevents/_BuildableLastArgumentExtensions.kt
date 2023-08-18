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

package io.cloudshiftdev.awscdkdsl.services.iotevents

import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnAlarmModel
import software.amazon.awscdk.services.iotevents.CfnDetectorModel
import software.amazon.awscdk.services.iotevents.CfnInput

/** Contains the configuration information of alarm state changes. */
public inline fun CfnAlarmModel.setAlarmCapabilities(
    block: CfnAlarmModelAlarmCapabilitiesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAlarmModelAlarmCapabilitiesPropertyDsl()
    builder.apply(block)
    return setAlarmCapabilities(builder.build())
}

/** Contains information about one or more alarm actions. */
public inline fun CfnAlarmModel.setAlarmEventActions(
    block: CfnAlarmModelAlarmEventActionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAlarmModelAlarmEventActionsPropertyDsl()
    builder.apply(block)
    return setAlarmEventActions(builder.build())
}

/** Defines when your alarm is invoked. */
public inline fun CfnAlarmModel.setAlarmRule(
    block: CfnAlarmModelAlarmRulePropertyDsl.() -> Unit = {}
) {
    val builder = CfnAlarmModelAlarmRulePropertyDsl()
    builder.apply(block)
    return setAlarmRule(builder.build())
}

/** Information that defines how a detector operates. */
public inline fun CfnDetectorModel.setDetectorModelDefinition(
    block: CfnDetectorModelDetectorModelDefinitionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDetectorModelDetectorModelDefinitionPropertyDsl()
    builder.apply(block)
    return setDetectorModelDefinition(builder.build())
}

/** The definition of the input. */
public inline fun CfnInput.setInputDefinition(
    block: CfnInputInputDefinitionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnInputInputDefinitionPropertyDsl()
    builder.apply(block)
    return setInputDefinition(builder.build())
}
