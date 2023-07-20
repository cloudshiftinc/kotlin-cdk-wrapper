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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionSAMPolicyTemplatePropertyDsl {
    private val cdkBuilder: CfnFunction.SAMPolicyTemplateProperty.Builder =
        CfnFunction.SAMPolicyTemplateProperty.builder()

    public fun amiDescribePolicy(amiDescribePolicy: IResolvable) {
        cdkBuilder.amiDescribePolicy(amiDescribePolicy)
    }

    public fun amiDescribePolicy(amiDescribePolicy: CfnFunction.EmptySAMPTProperty) {
        cdkBuilder.amiDescribePolicy(amiDescribePolicy)
    }

    public fun awsSecretsManagerGetSecretValuePolicy(awsSecretsManagerGetSecretValuePolicy: IResolvable) {
        cdkBuilder.awsSecretsManagerGetSecretValuePolicy(awsSecretsManagerGetSecretValuePolicy)
    }

    public fun awsSecretsManagerGetSecretValuePolicy(awsSecretsManagerGetSecretValuePolicy: CfnFunction.SecretArnSAMPTProperty) {
        cdkBuilder.awsSecretsManagerGetSecretValuePolicy(awsSecretsManagerGetSecretValuePolicy)
    }

    public fun cloudFormationDescribeStacksPolicy(cloudFormationDescribeStacksPolicy: IResolvable) {
        cdkBuilder.cloudFormationDescribeStacksPolicy(cloudFormationDescribeStacksPolicy)
    }

    public fun cloudFormationDescribeStacksPolicy(cloudFormationDescribeStacksPolicy: CfnFunction.EmptySAMPTProperty) {
        cdkBuilder.cloudFormationDescribeStacksPolicy(cloudFormationDescribeStacksPolicy)
    }

    public fun cloudWatchPutMetricPolicy(cloudWatchPutMetricPolicy: IResolvable) {
        cdkBuilder.cloudWatchPutMetricPolicy(cloudWatchPutMetricPolicy)
    }

    public fun cloudWatchPutMetricPolicy(cloudWatchPutMetricPolicy: CfnFunction.EmptySAMPTProperty) {
        cdkBuilder.cloudWatchPutMetricPolicy(cloudWatchPutMetricPolicy)
    }

    public fun dynamoDbCrudPolicy(dynamoDbCrudPolicy: IResolvable) {
        cdkBuilder.dynamoDbCrudPolicy(dynamoDbCrudPolicy)
    }

    public fun dynamoDbCrudPolicy(dynamoDbCrudPolicy: CfnFunction.TableSAMPTProperty) {
        cdkBuilder.dynamoDbCrudPolicy(dynamoDbCrudPolicy)
    }

    public fun dynamoDbReadPolicy(dynamoDbReadPolicy: IResolvable) {
        cdkBuilder.dynamoDbReadPolicy(dynamoDbReadPolicy)
    }

    public fun dynamoDbReadPolicy(dynamoDbReadPolicy: CfnFunction.TableSAMPTProperty) {
        cdkBuilder.dynamoDbReadPolicy(dynamoDbReadPolicy)
    }

    public fun dynamoDbStreamReadPolicy(dynamoDbStreamReadPolicy: IResolvable) {
        cdkBuilder.dynamoDbStreamReadPolicy(dynamoDbStreamReadPolicy)
    }

    public fun dynamoDbStreamReadPolicy(dynamoDbStreamReadPolicy: CfnFunction.TableStreamSAMPTProperty) {
        cdkBuilder.dynamoDbStreamReadPolicy(dynamoDbStreamReadPolicy)
    }

    public fun dynamoDbWritePolicy(dynamoDbWritePolicy: IResolvable) {
        cdkBuilder.dynamoDbWritePolicy(dynamoDbWritePolicy)
    }

    public fun dynamoDbWritePolicy(dynamoDbWritePolicy: CfnFunction.TableSAMPTProperty) {
        cdkBuilder.dynamoDbWritePolicy(dynamoDbWritePolicy)
    }

    public fun ec2DescribePolicy(ec2DescribePolicy: IResolvable) {
        cdkBuilder.ec2DescribePolicy(ec2DescribePolicy)
    }

    public fun ec2DescribePolicy(ec2DescribePolicy: CfnFunction.EmptySAMPTProperty) {
        cdkBuilder.ec2DescribePolicy(ec2DescribePolicy)
    }

    public fun elasticsearchHttpPostPolicy(elasticsearchHttpPostPolicy: IResolvable) {
        cdkBuilder.elasticsearchHttpPostPolicy(elasticsearchHttpPostPolicy)
    }

    public fun elasticsearchHttpPostPolicy(elasticsearchHttpPostPolicy: CfnFunction.DomainSAMPTProperty) {
        cdkBuilder.elasticsearchHttpPostPolicy(elasticsearchHttpPostPolicy)
    }

    public fun filterLogEventsPolicy(filterLogEventsPolicy: IResolvable) {
        cdkBuilder.filterLogEventsPolicy(filterLogEventsPolicy)
    }

    public fun filterLogEventsPolicy(filterLogEventsPolicy: CfnFunction.LogGroupSAMPTProperty) {
        cdkBuilder.filterLogEventsPolicy(filterLogEventsPolicy)
    }

    public fun kinesisCrudPolicy(kinesisCrudPolicy: IResolvable) {
        cdkBuilder.kinesisCrudPolicy(kinesisCrudPolicy)
    }

    public fun kinesisCrudPolicy(kinesisCrudPolicy: CfnFunction.StreamSAMPTProperty) {
        cdkBuilder.kinesisCrudPolicy(kinesisCrudPolicy)
    }

    public fun kinesisStreamReadPolicy(kinesisStreamReadPolicy: IResolvable) {
        cdkBuilder.kinesisStreamReadPolicy(kinesisStreamReadPolicy)
    }

    public fun kinesisStreamReadPolicy(kinesisStreamReadPolicy: CfnFunction.StreamSAMPTProperty) {
        cdkBuilder.kinesisStreamReadPolicy(kinesisStreamReadPolicy)
    }

    public fun kmsDecryptPolicy(kmsDecryptPolicy: IResolvable) {
        cdkBuilder.kmsDecryptPolicy(kmsDecryptPolicy)
    }

    public fun kmsDecryptPolicy(kmsDecryptPolicy: CfnFunction.KeySAMPTProperty) {
        cdkBuilder.kmsDecryptPolicy(kmsDecryptPolicy)
    }

    public fun lambdaInvokePolicy(lambdaInvokePolicy: IResolvable) {
        cdkBuilder.lambdaInvokePolicy(lambdaInvokePolicy)
    }

    public fun lambdaInvokePolicy(lambdaInvokePolicy: CfnFunction.FunctionSAMPTProperty) {
        cdkBuilder.lambdaInvokePolicy(lambdaInvokePolicy)
    }

    public fun rekognitionDetectOnlyPolicy(rekognitionDetectOnlyPolicy: IResolvable) {
        cdkBuilder.rekognitionDetectOnlyPolicy(rekognitionDetectOnlyPolicy)
    }

    public fun rekognitionDetectOnlyPolicy(rekognitionDetectOnlyPolicy: CfnFunction.EmptySAMPTProperty) {
        cdkBuilder.rekognitionDetectOnlyPolicy(rekognitionDetectOnlyPolicy)
    }

    public fun rekognitionLabelsPolicy(rekognitionLabelsPolicy: IResolvable) {
        cdkBuilder.rekognitionLabelsPolicy(rekognitionLabelsPolicy)
    }

    public fun rekognitionLabelsPolicy(rekognitionLabelsPolicy: CfnFunction.EmptySAMPTProperty) {
        cdkBuilder.rekognitionLabelsPolicy(rekognitionLabelsPolicy)
    }

    public fun rekognitionNoDataAccessPolicy(rekognitionNoDataAccessPolicy: IResolvable) {
        cdkBuilder.rekognitionNoDataAccessPolicy(rekognitionNoDataAccessPolicy)
    }

    public fun rekognitionNoDataAccessPolicy(rekognitionNoDataAccessPolicy: CfnFunction.CollectionSAMPTProperty) {
        cdkBuilder.rekognitionNoDataAccessPolicy(rekognitionNoDataAccessPolicy)
    }

    public fun rekognitionReadPolicy(rekognitionReadPolicy: IResolvable) {
        cdkBuilder.rekognitionReadPolicy(rekognitionReadPolicy)
    }

    public fun rekognitionReadPolicy(rekognitionReadPolicy: CfnFunction.CollectionSAMPTProperty) {
        cdkBuilder.rekognitionReadPolicy(rekognitionReadPolicy)
    }

    public fun rekognitionWriteOnlyAccessPolicy(rekognitionWriteOnlyAccessPolicy: IResolvable) {
        cdkBuilder.rekognitionWriteOnlyAccessPolicy(rekognitionWriteOnlyAccessPolicy)
    }

    public fun rekognitionWriteOnlyAccessPolicy(rekognitionWriteOnlyAccessPolicy: CfnFunction.CollectionSAMPTProperty) {
        cdkBuilder.rekognitionWriteOnlyAccessPolicy(rekognitionWriteOnlyAccessPolicy)
    }

    public fun s3CrudPolicy(s3CrudPolicy: IResolvable) {
        cdkBuilder.s3CrudPolicy(s3CrudPolicy)
    }

    public fun s3CrudPolicy(s3CrudPolicy: CfnFunction.BucketSAMPTProperty) {
        cdkBuilder.s3CrudPolicy(s3CrudPolicy)
    }

    public fun s3ReadPolicy(s3ReadPolicy: IResolvable) {
        cdkBuilder.s3ReadPolicy(s3ReadPolicy)
    }

    public fun s3ReadPolicy(s3ReadPolicy: CfnFunction.BucketSAMPTProperty) {
        cdkBuilder.s3ReadPolicy(s3ReadPolicy)
    }

    public fun s3WritePolicy(s3WritePolicy: IResolvable) {
        cdkBuilder.s3WritePolicy(s3WritePolicy)
    }

    public fun s3WritePolicy(s3WritePolicy: CfnFunction.BucketSAMPTProperty) {
        cdkBuilder.s3WritePolicy(s3WritePolicy)
    }

    public fun sesBulkTemplatedCrudPolicy(sesBulkTemplatedCrudPolicy: IResolvable) {
        cdkBuilder.sesBulkTemplatedCrudPolicy(sesBulkTemplatedCrudPolicy)
    }

    public fun sesBulkTemplatedCrudPolicy(sesBulkTemplatedCrudPolicy: CfnFunction.IdentitySAMPTProperty) {
        cdkBuilder.sesBulkTemplatedCrudPolicy(sesBulkTemplatedCrudPolicy)
    }

    public fun sesCrudPolicy(sesCrudPolicy: IResolvable) {
        cdkBuilder.sesCrudPolicy(sesCrudPolicy)
    }

    public fun sesCrudPolicy(sesCrudPolicy: CfnFunction.IdentitySAMPTProperty) {
        cdkBuilder.sesCrudPolicy(sesCrudPolicy)
    }

    public fun sesEmailTemplateCrudPolicy(sesEmailTemplateCrudPolicy: IResolvable) {
        cdkBuilder.sesEmailTemplateCrudPolicy(sesEmailTemplateCrudPolicy)
    }

    public fun sesEmailTemplateCrudPolicy(sesEmailTemplateCrudPolicy: CfnFunction.EmptySAMPTProperty) {
        cdkBuilder.sesEmailTemplateCrudPolicy(sesEmailTemplateCrudPolicy)
    }

    public fun sesSendBouncePolicy(sesSendBouncePolicy: IResolvable) {
        cdkBuilder.sesSendBouncePolicy(sesSendBouncePolicy)
    }

    public fun sesSendBouncePolicy(sesSendBouncePolicy: CfnFunction.IdentitySAMPTProperty) {
        cdkBuilder.sesSendBouncePolicy(sesSendBouncePolicy)
    }

    public fun snsCrudPolicy(snsCrudPolicy: IResolvable) {
        cdkBuilder.snsCrudPolicy(snsCrudPolicy)
    }

    public fun snsCrudPolicy(snsCrudPolicy: CfnFunction.TopicSAMPTProperty) {
        cdkBuilder.snsCrudPolicy(snsCrudPolicy)
    }

    public fun snsPublishMessagePolicy(snsPublishMessagePolicy: IResolvable) {
        cdkBuilder.snsPublishMessagePolicy(snsPublishMessagePolicy)
    }

    public fun snsPublishMessagePolicy(snsPublishMessagePolicy: CfnFunction.TopicSAMPTProperty) {
        cdkBuilder.snsPublishMessagePolicy(snsPublishMessagePolicy)
    }

    public fun sqsPollerPolicy(sqsPollerPolicy: IResolvable) {
        cdkBuilder.sqsPollerPolicy(sqsPollerPolicy)
    }

    public fun sqsPollerPolicy(sqsPollerPolicy: CfnFunction.QueueSAMPTProperty) {
        cdkBuilder.sqsPollerPolicy(sqsPollerPolicy)
    }

    public fun sqsSendMessagePolicy(sqsSendMessagePolicy: IResolvable) {
        cdkBuilder.sqsSendMessagePolicy(sqsSendMessagePolicy)
    }

    public fun sqsSendMessagePolicy(sqsSendMessagePolicy: CfnFunction.QueueSAMPTProperty) {
        cdkBuilder.sqsSendMessagePolicy(sqsSendMessagePolicy)
    }

    public fun ssmParameterReadPolicy(ssmParameterReadPolicy: IResolvable) {
        cdkBuilder.ssmParameterReadPolicy(ssmParameterReadPolicy)
    }

    public fun ssmParameterReadPolicy(ssmParameterReadPolicy: CfnFunction.ParameterNameSAMPTProperty) {
        cdkBuilder.ssmParameterReadPolicy(ssmParameterReadPolicy)
    }

    public fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: IResolvable) {
        cdkBuilder.stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy)
    }

    public fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: CfnFunction.StateMachineSAMPTProperty) {
        cdkBuilder.stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy)
    }

    public fun vpcAccessPolicy(vpcAccessPolicy: IResolvable) {
        cdkBuilder.vpcAccessPolicy(vpcAccessPolicy)
    }

    public fun vpcAccessPolicy(vpcAccessPolicy: CfnFunction.EmptySAMPTProperty) {
        cdkBuilder.vpcAccessPolicy(vpcAccessPolicy)
    }

    public fun build(): CfnFunction.SAMPolicyTemplateProperty = cdkBuilder.build()
}
