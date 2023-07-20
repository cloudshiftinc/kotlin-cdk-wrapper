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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnRule
import kotlin.String

@CdkDslMarker
public class CfnRuleTargetPropertyDsl {
    private val cdkBuilder: CfnRule.TargetProperty.Builder = CfnRule.TargetProperty.builder()

    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun batchParameters(batchParameters: IResolvable) {
        cdkBuilder.batchParameters(batchParameters)
    }

    public fun batchParameters(batchParameters: CfnRule.BatchParametersProperty) {
        cdkBuilder.batchParameters(batchParameters)
    }

    public fun deadLetterConfig(deadLetterConfig: IResolvable) {
        cdkBuilder.deadLetterConfig(deadLetterConfig)
    }

    public fun deadLetterConfig(deadLetterConfig: CfnRule.DeadLetterConfigProperty) {
        cdkBuilder.deadLetterConfig(deadLetterConfig)
    }

    public fun ecsParameters(ecsParameters: IResolvable) {
        cdkBuilder.ecsParameters(ecsParameters)
    }

    public fun ecsParameters(ecsParameters: CfnRule.EcsParametersProperty) {
        cdkBuilder.ecsParameters(ecsParameters)
    }

    public fun httpParameters(httpParameters: IResolvable) {
        cdkBuilder.httpParameters(httpParameters)
    }

    public fun httpParameters(httpParameters: CfnRule.HttpParametersProperty) {
        cdkBuilder.httpParameters(httpParameters)
    }

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun input(input: String) {
        cdkBuilder.input(input)
    }

    public fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
    }

    public fun inputTransformer(inputTransformer: IResolvable) {
        cdkBuilder.inputTransformer(inputTransformer)
    }

    public fun inputTransformer(inputTransformer: CfnRule.InputTransformerProperty) {
        cdkBuilder.inputTransformer(inputTransformer)
    }

    public fun kinesisParameters(kinesisParameters: IResolvable) {
        cdkBuilder.kinesisParameters(kinesisParameters)
    }

    public fun kinesisParameters(kinesisParameters: CfnRule.KinesisParametersProperty) {
        cdkBuilder.kinesisParameters(kinesisParameters)
    }

    public fun redshiftDataParameters(redshiftDataParameters: IResolvable) {
        cdkBuilder.redshiftDataParameters(redshiftDataParameters)
    }

    public fun redshiftDataParameters(redshiftDataParameters: CfnRule.RedshiftDataParametersProperty) {
        cdkBuilder.redshiftDataParameters(redshiftDataParameters)
    }

    public fun retryPolicy(retryPolicy: IResolvable) {
        cdkBuilder.retryPolicy(retryPolicy)
    }

    public fun retryPolicy(retryPolicy: CfnRule.RetryPolicyProperty) {
        cdkBuilder.retryPolicy(retryPolicy)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun runCommandParameters(runCommandParameters: IResolvable) {
        cdkBuilder.runCommandParameters(runCommandParameters)
    }

    public fun runCommandParameters(runCommandParameters: CfnRule.RunCommandParametersProperty) {
        cdkBuilder.runCommandParameters(runCommandParameters)
    }

    public fun sageMakerPipelineParameters(sageMakerPipelineParameters: IResolvable) {
        cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters)
    }

    public fun sageMakerPipelineParameters(sageMakerPipelineParameters: CfnRule.SageMakerPipelineParametersProperty) {
        cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters)
    }

    public fun sqsParameters(sqsParameters: IResolvable) {
        cdkBuilder.sqsParameters(sqsParameters)
    }

    public fun sqsParameters(sqsParameters: CfnRule.SqsParametersProperty) {
        cdkBuilder.sqsParameters(sqsParameters)
    }

    public fun build(): CfnRule.TargetProperty = cdkBuilder.build()
}
