@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.events.CfnRule
import software.amazon.awscdk.services.events.RuleTargetConfig
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.iam.IRole
import software.constructs.IConstruct
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class RuleTargetConfigDsl {
    private val cdkBuilder: RuleTargetConfig.Builder = RuleTargetConfig.builder()

    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun batchParameters(block: CfnRuleBatchParametersPropertyDsl.() -> Unit = {}) {
        val builder = CfnRuleBatchParametersPropertyDsl()
        builder.apply(block)
        cdkBuilder.batchParameters(builder.build())
    }

    public fun batchParameters(batchParameters: CfnRule.BatchParametersProperty) {
        cdkBuilder.batchParameters(batchParameters)
    }

    public fun deadLetterConfig(block: CfnRuleDeadLetterConfigPropertyDsl.() -> Unit = {}) {
        val builder = CfnRuleDeadLetterConfigPropertyDsl()
        builder.apply(block)
        cdkBuilder.deadLetterConfig(builder.build())
    }

    public fun deadLetterConfig(deadLetterConfig: CfnRule.DeadLetterConfigProperty) {
        cdkBuilder.deadLetterConfig(deadLetterConfig)
    }

    public fun ecsParameters(block: CfnRuleEcsParametersPropertyDsl.() -> Unit = {}) {
        val builder = CfnRuleEcsParametersPropertyDsl()
        builder.apply(block)
        cdkBuilder.ecsParameters(builder.build())
    }

    public fun ecsParameters(ecsParameters: CfnRule.EcsParametersProperty) {
        cdkBuilder.ecsParameters(ecsParameters)
    }

    public fun httpParameters(block: CfnRuleHttpParametersPropertyDsl.() -> Unit = {}) {
        val builder = CfnRuleHttpParametersPropertyDsl()
        builder.apply(block)
        cdkBuilder.httpParameters(builder.build())
    }

    public fun httpParameters(httpParameters: CfnRule.HttpParametersProperty) {
        cdkBuilder.httpParameters(httpParameters)
    }

    public fun input(input: RuleTargetInput) {
        cdkBuilder.input(input)
    }

    public fun kinesisParameters(block: CfnRuleKinesisParametersPropertyDsl.() -> Unit = {}) {
        val builder = CfnRuleKinesisParametersPropertyDsl()
        builder.apply(block)
        cdkBuilder.kinesisParameters(builder.build())
    }

    public fun kinesisParameters(kinesisParameters: CfnRule.KinesisParametersProperty) {
        cdkBuilder.kinesisParameters(kinesisParameters)
    }

    public fun retryPolicy(block: CfnRuleRetryPolicyPropertyDsl.() -> Unit = {}) {
        val builder = CfnRuleRetryPolicyPropertyDsl()
        builder.apply(block)
        cdkBuilder.retryPolicy(builder.build())
    }

    public fun retryPolicy(retryPolicy: CfnRule.RetryPolicyProperty) {
        cdkBuilder.retryPolicy(retryPolicy)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun runCommandParameters(block: CfnRuleRunCommandParametersPropertyDsl.() -> Unit = {}) {
        val builder = CfnRuleRunCommandParametersPropertyDsl()
        builder.apply(block)
        cdkBuilder.runCommandParameters(builder.build())
    }

    public fun runCommandParameters(runCommandParameters: CfnRule.RunCommandParametersProperty) {
        cdkBuilder.runCommandParameters(runCommandParameters)
    }

    public fun sqsParameters(block: CfnRuleSqsParametersPropertyDsl.() -> Unit = {}) {
        val builder = CfnRuleSqsParametersPropertyDsl()
        builder.apply(block)
        cdkBuilder.sqsParameters(builder.build())
    }

    public fun sqsParameters(sqsParameters: CfnRule.SqsParametersProperty) {
        cdkBuilder.sqsParameters(sqsParameters)
    }

    public fun targetResource(targetResource: IConstruct) {
        cdkBuilder.targetResource(targetResource)
    }

    public fun build(): RuleTargetConfig = cdkBuilder.build()
}
