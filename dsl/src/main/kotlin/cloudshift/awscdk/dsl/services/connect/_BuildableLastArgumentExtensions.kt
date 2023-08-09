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

package cloudshift.awscdk.dsl.services.connect

import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnEvaluationForm
import software.amazon.awscdk.services.connect.CfnInstance
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig
import software.amazon.awscdk.services.connect.CfnQueue
import software.amazon.awscdk.services.connect.CfnQuickConnect
import software.amazon.awscdk.services.connect.CfnRule
import software.amazon.awscdk.services.connect.CfnUser

/** A scoring strategy of the evaluation form. */
public inline fun CfnEvaluationForm.setScoringStrategy(
    block: CfnEvaluationFormScoringStrategyPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEvaluationFormScoringStrategyPropertyDsl()
    builder.apply(block)
    return setScoringStrategy(builder.build())
}

/** A toggle for an individual feature at the instance level. */
public inline fun CfnInstance.setAttributes(
    block: CfnInstanceAttributesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnInstanceAttributesPropertyDsl()
    builder.apply(block)
    return setAttributes(builder.build())
}

/** The configuration of the Kinesis Firehose delivery stream. */
public inline fun CfnInstanceStorageConfig.setKinesisFirehoseConfig(
    block: CfnInstanceStorageConfigKinesisFirehoseConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnInstanceStorageConfigKinesisFirehoseConfigPropertyDsl()
    builder.apply(block)
    return setKinesisFirehoseConfig(builder.build())
}

/** The configuration of the Kinesis data stream. */
public inline fun CfnInstanceStorageConfig.setKinesisStreamConfig(
    block: CfnInstanceStorageConfigKinesisStreamConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnInstanceStorageConfigKinesisStreamConfigPropertyDsl()
    builder.apply(block)
    return setKinesisStreamConfig(builder.build())
}

/** The configuration of the Kinesis video stream. */
public inline fun CfnInstanceStorageConfig.setKinesisVideoStreamConfig(
    block: CfnInstanceStorageConfigKinesisVideoStreamConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnInstanceStorageConfigKinesisVideoStreamConfigPropertyDsl()
    builder.apply(block)
    return setKinesisVideoStreamConfig(builder.build())
}

/** The S3 bucket configuration. */
public inline fun CfnInstanceStorageConfig.setS3Config(
    block: CfnInstanceStorageConfigS3ConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnInstanceStorageConfigS3ConfigPropertyDsl()
    builder.apply(block)
    return setS3Config(builder.build())
}

/** The outbound caller ID name, number, and outbound whisper flow. */
public inline fun CfnQueue.setOutboundCallerConfig(
    block: CfnQueueOutboundCallerConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnQueueOutboundCallerConfigPropertyDsl()
    builder.apply(block)
    return setOutboundCallerConfig(builder.build())
}

/** Contains information about the quick connect. */
public inline fun CfnQuickConnect.setQuickConnectConfig(
    block: CfnQuickConnectQuickConnectConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnQuickConnectQuickConnectConfigPropertyDsl()
    builder.apply(block)
    return setQuickConnectConfig(builder.build())
}

/** A list of actions to be run when the rule is triggered. */
public inline fun CfnRule.setActions(block: CfnRuleActionsPropertyDsl.() -> Unit = {}) {
    val builder = CfnRuleActionsPropertyDsl()
    builder.apply(block)
    return setActions(builder.build())
}

/** The event source to trigger the rule. */
public inline fun CfnRule.setTriggerEventSource(
    block: CfnRuleRuleTriggerEventSourcePropertyDsl.() -> Unit = {}
) {
    val builder = CfnRuleRuleTriggerEventSourcePropertyDsl()
    builder.apply(block)
    return setTriggerEventSource(builder.build())
}

/** Information about the user identity. */
public inline fun CfnUser.setIdentityInfo(
    block: CfnUserUserIdentityInfoPropertyDsl.() -> Unit = {}
) {
    val builder = CfnUserUserIdentityInfoPropertyDsl()
    builder.apply(block)
    return setIdentityInfo(builder.build())
}

/** Information about the phone configuration for the user. */
public inline fun CfnUser.setPhoneConfig(block: CfnUserUserPhoneConfigPropertyDsl.() -> Unit = {}) {
    val builder = CfnUserUserPhoneConfigPropertyDsl()
    builder.apply(block)
    return setPhoneConfig(builder.build())
}
