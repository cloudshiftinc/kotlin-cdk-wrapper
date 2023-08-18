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

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * SAMPolicyTemplateProperty sAMPolicyTemplateProperty = SAMPolicyTemplateProperty.builder()
 * .amiDescribePolicy(EmptySAMPTProperty.builder().build())
 * .awsSecretsManagerGetSecretValuePolicy(SecretArnSAMPTProperty.builder()
 * .secretArn("secretArn")
 * .build())
 * .cloudFormationDescribeStacksPolicy(EmptySAMPTProperty.builder().build())
 * .cloudWatchPutMetricPolicy(EmptySAMPTProperty.builder().build())
 * .dynamoDbCrudPolicy(TableSAMPTProperty.builder()
 * .tableName("tableName")
 * .build())
 * .dynamoDbReadPolicy(TableSAMPTProperty.builder()
 * .tableName("tableName")
 * .build())
 * .dynamoDbStreamReadPolicy(TableStreamSAMPTProperty.builder()
 * .streamName("streamName")
 * .tableName("tableName")
 * .build())
 * .dynamoDbWritePolicy(TableSAMPTProperty.builder()
 * .tableName("tableName")
 * .build())
 * .ec2DescribePolicy(EmptySAMPTProperty.builder().build())
 * .elasticsearchHttpPostPolicy(DomainSAMPTProperty.builder()
 * .domainName("domainName")
 * .build())
 * .filterLogEventsPolicy(LogGroupSAMPTProperty.builder()
 * .logGroupName("logGroupName")
 * .build())
 * .kinesisCrudPolicy(StreamSAMPTProperty.builder()
 * .streamName("streamName")
 * .build())
 * .kinesisStreamReadPolicy(StreamSAMPTProperty.builder()
 * .streamName("streamName")
 * .build())
 * .kmsDecryptPolicy(KeySAMPTProperty.builder()
 * .keyId("keyId")
 * .build())
 * .lambdaInvokePolicy(FunctionSAMPTProperty.builder()
 * .functionName("functionName")
 * .build())
 * .rekognitionDetectOnlyPolicy(EmptySAMPTProperty.builder().build())
 * .rekognitionLabelsPolicy(EmptySAMPTProperty.builder().build())
 * .rekognitionNoDataAccessPolicy(CollectionSAMPTProperty.builder()
 * .collectionId("collectionId")
 * .build())
 * .rekognitionReadPolicy(CollectionSAMPTProperty.builder()
 * .collectionId("collectionId")
 * .build())
 * .rekognitionWriteOnlyAccessPolicy(CollectionSAMPTProperty.builder()
 * .collectionId("collectionId")
 * .build())
 * .s3CrudPolicy(BucketSAMPTProperty.builder()
 * .bucketName("bucketName")
 * .build())
 * .s3ReadPolicy(BucketSAMPTProperty.builder()
 * .bucketName("bucketName")
 * .build())
 * .s3WritePolicy(BucketSAMPTProperty.builder()
 * .bucketName("bucketName")
 * .build())
 * .sesBulkTemplatedCrudPolicy(IdentitySAMPTProperty.builder()
 * .identityName("identityName")
 * .build())
 * .sesCrudPolicy(IdentitySAMPTProperty.builder()
 * .identityName("identityName")
 * .build())
 * .sesEmailTemplateCrudPolicy(EmptySAMPTProperty.builder().build())
 * .sesSendBouncePolicy(IdentitySAMPTProperty.builder()
 * .identityName("identityName")
 * .build())
 * .snsCrudPolicy(TopicSAMPTProperty.builder()
 * .topicName("topicName")
 * .build())
 * .snsPublishMessagePolicy(TopicSAMPTProperty.builder()
 * .topicName("topicName")
 * .build())
 * .sqsPollerPolicy(QueueSAMPTProperty.builder()
 * .queueName("queueName")
 * .build())
 * .sqsSendMessagePolicy(QueueSAMPTProperty.builder()
 * .queueName("queueName")
 * .build())
 * .ssmParameterReadPolicy(ParameterNameSAMPTProperty.builder()
 * .parameterName("parameterName")
 * .build())
 * .stepFunctionsExecutionPolicy(StateMachineSAMPTProperty.builder()
 * .stateMachineName("stateMachineName")
 * .build())
 * .vpcAccessPolicy(EmptySAMPTProperty.builder().build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sampolicytemplate.html)
 */
@CdkDslMarker
public class CfnFunctionSAMPolicyTemplatePropertyDsl {
    private val cdkBuilder: CfnFunction.SAMPolicyTemplateProperty.Builder =
        CfnFunction.SAMPolicyTemplateProperty.builder()

    /** @param amiDescribePolicy the value to be set. */
    public fun amiDescribePolicy(amiDescribePolicy: IResolvable) {
        cdkBuilder.amiDescribePolicy(amiDescribePolicy)
    }

    /** @param amiDescribePolicy the value to be set. */
    public fun amiDescribePolicy(amiDescribePolicy: CfnFunction.EmptySAMPTProperty) {
        cdkBuilder.amiDescribePolicy(amiDescribePolicy)
    }

    /** @param awsSecretsManagerGetSecretValuePolicy the value to be set. */
    public fun awsSecretsManagerGetSecretValuePolicy(
        awsSecretsManagerGetSecretValuePolicy: IResolvable
    ) {
        cdkBuilder.awsSecretsManagerGetSecretValuePolicy(awsSecretsManagerGetSecretValuePolicy)
    }

    /** @param awsSecretsManagerGetSecretValuePolicy the value to be set. */
    public fun awsSecretsManagerGetSecretValuePolicy(
        awsSecretsManagerGetSecretValuePolicy: CfnFunction.SecretArnSAMPTProperty
    ) {
        cdkBuilder.awsSecretsManagerGetSecretValuePolicy(awsSecretsManagerGetSecretValuePolicy)
    }

    /** @param cloudFormationDescribeStacksPolicy the value to be set. */
    public fun cloudFormationDescribeStacksPolicy(cloudFormationDescribeStacksPolicy: IResolvable) {
        cdkBuilder.cloudFormationDescribeStacksPolicy(cloudFormationDescribeStacksPolicy)
    }

    /** @param cloudFormationDescribeStacksPolicy the value to be set. */
    public fun cloudFormationDescribeStacksPolicy(
        cloudFormationDescribeStacksPolicy: CfnFunction.EmptySAMPTProperty
    ) {
        cdkBuilder.cloudFormationDescribeStacksPolicy(cloudFormationDescribeStacksPolicy)
    }

    /** @param cloudWatchPutMetricPolicy the value to be set. */
    public fun cloudWatchPutMetricPolicy(cloudWatchPutMetricPolicy: IResolvable) {
        cdkBuilder.cloudWatchPutMetricPolicy(cloudWatchPutMetricPolicy)
    }

    /** @param cloudWatchPutMetricPolicy the value to be set. */
    public fun cloudWatchPutMetricPolicy(
        cloudWatchPutMetricPolicy: CfnFunction.EmptySAMPTProperty
    ) {
        cdkBuilder.cloudWatchPutMetricPolicy(cloudWatchPutMetricPolicy)
    }

    /** @param dynamoDbCrudPolicy the value to be set. */
    public fun dynamoDbCrudPolicy(dynamoDbCrudPolicy: IResolvable) {
        cdkBuilder.dynamoDbCrudPolicy(dynamoDbCrudPolicy)
    }

    /** @param dynamoDbCrudPolicy the value to be set. */
    public fun dynamoDbCrudPolicy(dynamoDbCrudPolicy: CfnFunction.TableSAMPTProperty) {
        cdkBuilder.dynamoDbCrudPolicy(dynamoDbCrudPolicy)
    }

    /** @param dynamoDbReadPolicy the value to be set. */
    public fun dynamoDbReadPolicy(dynamoDbReadPolicy: IResolvable) {
        cdkBuilder.dynamoDbReadPolicy(dynamoDbReadPolicy)
    }

    /** @param dynamoDbReadPolicy the value to be set. */
    public fun dynamoDbReadPolicy(dynamoDbReadPolicy: CfnFunction.TableSAMPTProperty) {
        cdkBuilder.dynamoDbReadPolicy(dynamoDbReadPolicy)
    }

    /** @param dynamoDbStreamReadPolicy the value to be set. */
    public fun dynamoDbStreamReadPolicy(dynamoDbStreamReadPolicy: IResolvable) {
        cdkBuilder.dynamoDbStreamReadPolicy(dynamoDbStreamReadPolicy)
    }

    /** @param dynamoDbStreamReadPolicy the value to be set. */
    public fun dynamoDbStreamReadPolicy(
        dynamoDbStreamReadPolicy: CfnFunction.TableStreamSAMPTProperty
    ) {
        cdkBuilder.dynamoDbStreamReadPolicy(dynamoDbStreamReadPolicy)
    }

    /** @param dynamoDbWritePolicy the value to be set. */
    public fun dynamoDbWritePolicy(dynamoDbWritePolicy: IResolvable) {
        cdkBuilder.dynamoDbWritePolicy(dynamoDbWritePolicy)
    }

    /** @param dynamoDbWritePolicy the value to be set. */
    public fun dynamoDbWritePolicy(dynamoDbWritePolicy: CfnFunction.TableSAMPTProperty) {
        cdkBuilder.dynamoDbWritePolicy(dynamoDbWritePolicy)
    }

    /** @param ec2DescribePolicy the value to be set. */
    public fun ec2DescribePolicy(ec2DescribePolicy: IResolvable) {
        cdkBuilder.ec2DescribePolicy(ec2DescribePolicy)
    }

    /** @param ec2DescribePolicy the value to be set. */
    public fun ec2DescribePolicy(ec2DescribePolicy: CfnFunction.EmptySAMPTProperty) {
        cdkBuilder.ec2DescribePolicy(ec2DescribePolicy)
    }

    /** @param elasticsearchHttpPostPolicy the value to be set. */
    public fun elasticsearchHttpPostPolicy(elasticsearchHttpPostPolicy: IResolvable) {
        cdkBuilder.elasticsearchHttpPostPolicy(elasticsearchHttpPostPolicy)
    }

    /** @param elasticsearchHttpPostPolicy the value to be set. */
    public fun elasticsearchHttpPostPolicy(
        elasticsearchHttpPostPolicy: CfnFunction.DomainSAMPTProperty
    ) {
        cdkBuilder.elasticsearchHttpPostPolicy(elasticsearchHttpPostPolicy)
    }

    /** @param filterLogEventsPolicy the value to be set. */
    public fun filterLogEventsPolicy(filterLogEventsPolicy: IResolvable) {
        cdkBuilder.filterLogEventsPolicy(filterLogEventsPolicy)
    }

    /** @param filterLogEventsPolicy the value to be set. */
    public fun filterLogEventsPolicy(filterLogEventsPolicy: CfnFunction.LogGroupSAMPTProperty) {
        cdkBuilder.filterLogEventsPolicy(filterLogEventsPolicy)
    }

    /** @param kinesisCrudPolicy the value to be set. */
    public fun kinesisCrudPolicy(kinesisCrudPolicy: IResolvable) {
        cdkBuilder.kinesisCrudPolicy(kinesisCrudPolicy)
    }

    /** @param kinesisCrudPolicy the value to be set. */
    public fun kinesisCrudPolicy(kinesisCrudPolicy: CfnFunction.StreamSAMPTProperty) {
        cdkBuilder.kinesisCrudPolicy(kinesisCrudPolicy)
    }

    /** @param kinesisStreamReadPolicy the value to be set. */
    public fun kinesisStreamReadPolicy(kinesisStreamReadPolicy: IResolvable) {
        cdkBuilder.kinesisStreamReadPolicy(kinesisStreamReadPolicy)
    }

    /** @param kinesisStreamReadPolicy the value to be set. */
    public fun kinesisStreamReadPolicy(kinesisStreamReadPolicy: CfnFunction.StreamSAMPTProperty) {
        cdkBuilder.kinesisStreamReadPolicy(kinesisStreamReadPolicy)
    }

    /** @param kmsDecryptPolicy the value to be set. */
    public fun kmsDecryptPolicy(kmsDecryptPolicy: IResolvable) {
        cdkBuilder.kmsDecryptPolicy(kmsDecryptPolicy)
    }

    /** @param kmsDecryptPolicy the value to be set. */
    public fun kmsDecryptPolicy(kmsDecryptPolicy: CfnFunction.KeySAMPTProperty) {
        cdkBuilder.kmsDecryptPolicy(kmsDecryptPolicy)
    }

    /** @param lambdaInvokePolicy the value to be set. */
    public fun lambdaInvokePolicy(lambdaInvokePolicy: IResolvable) {
        cdkBuilder.lambdaInvokePolicy(lambdaInvokePolicy)
    }

    /** @param lambdaInvokePolicy the value to be set. */
    public fun lambdaInvokePolicy(lambdaInvokePolicy: CfnFunction.FunctionSAMPTProperty) {
        cdkBuilder.lambdaInvokePolicy(lambdaInvokePolicy)
    }

    /** @param rekognitionDetectOnlyPolicy the value to be set. */
    public fun rekognitionDetectOnlyPolicy(rekognitionDetectOnlyPolicy: IResolvable) {
        cdkBuilder.rekognitionDetectOnlyPolicy(rekognitionDetectOnlyPolicy)
    }

    /** @param rekognitionDetectOnlyPolicy the value to be set. */
    public fun rekognitionDetectOnlyPolicy(
        rekognitionDetectOnlyPolicy: CfnFunction.EmptySAMPTProperty
    ) {
        cdkBuilder.rekognitionDetectOnlyPolicy(rekognitionDetectOnlyPolicy)
    }

    /** @param rekognitionLabelsPolicy the value to be set. */
    public fun rekognitionLabelsPolicy(rekognitionLabelsPolicy: IResolvable) {
        cdkBuilder.rekognitionLabelsPolicy(rekognitionLabelsPolicy)
    }

    /** @param rekognitionLabelsPolicy the value to be set. */
    public fun rekognitionLabelsPolicy(rekognitionLabelsPolicy: CfnFunction.EmptySAMPTProperty) {
        cdkBuilder.rekognitionLabelsPolicy(rekognitionLabelsPolicy)
    }

    /** @param rekognitionNoDataAccessPolicy the value to be set. */
    public fun rekognitionNoDataAccessPolicy(rekognitionNoDataAccessPolicy: IResolvable) {
        cdkBuilder.rekognitionNoDataAccessPolicy(rekognitionNoDataAccessPolicy)
    }

    /** @param rekognitionNoDataAccessPolicy the value to be set. */
    public fun rekognitionNoDataAccessPolicy(
        rekognitionNoDataAccessPolicy: CfnFunction.CollectionSAMPTProperty
    ) {
        cdkBuilder.rekognitionNoDataAccessPolicy(rekognitionNoDataAccessPolicy)
    }

    /** @param rekognitionReadPolicy the value to be set. */
    public fun rekognitionReadPolicy(rekognitionReadPolicy: IResolvable) {
        cdkBuilder.rekognitionReadPolicy(rekognitionReadPolicy)
    }

    /** @param rekognitionReadPolicy the value to be set. */
    public fun rekognitionReadPolicy(rekognitionReadPolicy: CfnFunction.CollectionSAMPTProperty) {
        cdkBuilder.rekognitionReadPolicy(rekognitionReadPolicy)
    }

    /** @param rekognitionWriteOnlyAccessPolicy the value to be set. */
    public fun rekognitionWriteOnlyAccessPolicy(rekognitionWriteOnlyAccessPolicy: IResolvable) {
        cdkBuilder.rekognitionWriteOnlyAccessPolicy(rekognitionWriteOnlyAccessPolicy)
    }

    /** @param rekognitionWriteOnlyAccessPolicy the value to be set. */
    public fun rekognitionWriteOnlyAccessPolicy(
        rekognitionWriteOnlyAccessPolicy: CfnFunction.CollectionSAMPTProperty
    ) {
        cdkBuilder.rekognitionWriteOnlyAccessPolicy(rekognitionWriteOnlyAccessPolicy)
    }

    /** @param s3CrudPolicy the value to be set. */
    public fun s3CrudPolicy(s3CrudPolicy: IResolvable) {
        cdkBuilder.s3CrudPolicy(s3CrudPolicy)
    }

    /** @param s3CrudPolicy the value to be set. */
    public fun s3CrudPolicy(s3CrudPolicy: CfnFunction.BucketSAMPTProperty) {
        cdkBuilder.s3CrudPolicy(s3CrudPolicy)
    }

    /** @param s3ReadPolicy the value to be set. */
    public fun s3ReadPolicy(s3ReadPolicy: IResolvable) {
        cdkBuilder.s3ReadPolicy(s3ReadPolicy)
    }

    /** @param s3ReadPolicy the value to be set. */
    public fun s3ReadPolicy(s3ReadPolicy: CfnFunction.BucketSAMPTProperty) {
        cdkBuilder.s3ReadPolicy(s3ReadPolicy)
    }

    /** @param s3WritePolicy the value to be set. */
    public fun s3WritePolicy(s3WritePolicy: IResolvable) {
        cdkBuilder.s3WritePolicy(s3WritePolicy)
    }

    /** @param s3WritePolicy the value to be set. */
    public fun s3WritePolicy(s3WritePolicy: CfnFunction.BucketSAMPTProperty) {
        cdkBuilder.s3WritePolicy(s3WritePolicy)
    }

    /** @param sesBulkTemplatedCrudPolicy the value to be set. */
    public fun sesBulkTemplatedCrudPolicy(sesBulkTemplatedCrudPolicy: IResolvable) {
        cdkBuilder.sesBulkTemplatedCrudPolicy(sesBulkTemplatedCrudPolicy)
    }

    /** @param sesBulkTemplatedCrudPolicy the value to be set. */
    public fun sesBulkTemplatedCrudPolicy(
        sesBulkTemplatedCrudPolicy: CfnFunction.IdentitySAMPTProperty
    ) {
        cdkBuilder.sesBulkTemplatedCrudPolicy(sesBulkTemplatedCrudPolicy)
    }

    /** @param sesCrudPolicy the value to be set. */
    public fun sesCrudPolicy(sesCrudPolicy: IResolvable) {
        cdkBuilder.sesCrudPolicy(sesCrudPolicy)
    }

    /** @param sesCrudPolicy the value to be set. */
    public fun sesCrudPolicy(sesCrudPolicy: CfnFunction.IdentitySAMPTProperty) {
        cdkBuilder.sesCrudPolicy(sesCrudPolicy)
    }

    /** @param sesEmailTemplateCrudPolicy the value to be set. */
    public fun sesEmailTemplateCrudPolicy(sesEmailTemplateCrudPolicy: IResolvable) {
        cdkBuilder.sesEmailTemplateCrudPolicy(sesEmailTemplateCrudPolicy)
    }

    /** @param sesEmailTemplateCrudPolicy the value to be set. */
    public fun sesEmailTemplateCrudPolicy(
        sesEmailTemplateCrudPolicy: CfnFunction.EmptySAMPTProperty
    ) {
        cdkBuilder.sesEmailTemplateCrudPolicy(sesEmailTemplateCrudPolicy)
    }

    /** @param sesSendBouncePolicy the value to be set. */
    public fun sesSendBouncePolicy(sesSendBouncePolicy: IResolvable) {
        cdkBuilder.sesSendBouncePolicy(sesSendBouncePolicy)
    }

    /** @param sesSendBouncePolicy the value to be set. */
    public fun sesSendBouncePolicy(sesSendBouncePolicy: CfnFunction.IdentitySAMPTProperty) {
        cdkBuilder.sesSendBouncePolicy(sesSendBouncePolicy)
    }

    /** @param snsCrudPolicy the value to be set. */
    public fun snsCrudPolicy(snsCrudPolicy: IResolvable) {
        cdkBuilder.snsCrudPolicy(snsCrudPolicy)
    }

    /** @param snsCrudPolicy the value to be set. */
    public fun snsCrudPolicy(snsCrudPolicy: CfnFunction.TopicSAMPTProperty) {
        cdkBuilder.snsCrudPolicy(snsCrudPolicy)
    }

    /** @param snsPublishMessagePolicy the value to be set. */
    public fun snsPublishMessagePolicy(snsPublishMessagePolicy: IResolvable) {
        cdkBuilder.snsPublishMessagePolicy(snsPublishMessagePolicy)
    }

    /** @param snsPublishMessagePolicy the value to be set. */
    public fun snsPublishMessagePolicy(snsPublishMessagePolicy: CfnFunction.TopicSAMPTProperty) {
        cdkBuilder.snsPublishMessagePolicy(snsPublishMessagePolicy)
    }

    /** @param sqsPollerPolicy the value to be set. */
    public fun sqsPollerPolicy(sqsPollerPolicy: IResolvable) {
        cdkBuilder.sqsPollerPolicy(sqsPollerPolicy)
    }

    /** @param sqsPollerPolicy the value to be set. */
    public fun sqsPollerPolicy(sqsPollerPolicy: CfnFunction.QueueSAMPTProperty) {
        cdkBuilder.sqsPollerPolicy(sqsPollerPolicy)
    }

    /** @param sqsSendMessagePolicy the value to be set. */
    public fun sqsSendMessagePolicy(sqsSendMessagePolicy: IResolvable) {
        cdkBuilder.sqsSendMessagePolicy(sqsSendMessagePolicy)
    }

    /** @param sqsSendMessagePolicy the value to be set. */
    public fun sqsSendMessagePolicy(sqsSendMessagePolicy: CfnFunction.QueueSAMPTProperty) {
        cdkBuilder.sqsSendMessagePolicy(sqsSendMessagePolicy)
    }

    /** @param ssmParameterReadPolicy the value to be set. */
    public fun ssmParameterReadPolicy(ssmParameterReadPolicy: IResolvable) {
        cdkBuilder.ssmParameterReadPolicy(ssmParameterReadPolicy)
    }

    /** @param ssmParameterReadPolicy the value to be set. */
    public fun ssmParameterReadPolicy(
        ssmParameterReadPolicy: CfnFunction.ParameterNameSAMPTProperty
    ) {
        cdkBuilder.ssmParameterReadPolicy(ssmParameterReadPolicy)
    }

    /** @param stepFunctionsExecutionPolicy the value to be set. */
    public fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: IResolvable) {
        cdkBuilder.stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy)
    }

    /** @param stepFunctionsExecutionPolicy the value to be set. */
    public fun stepFunctionsExecutionPolicy(
        stepFunctionsExecutionPolicy: CfnFunction.StateMachineSAMPTProperty
    ) {
        cdkBuilder.stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy)
    }

    /** @param vpcAccessPolicy the value to be set. */
    public fun vpcAccessPolicy(vpcAccessPolicy: IResolvable) {
        cdkBuilder.vpcAccessPolicy(vpcAccessPolicy)
    }

    /** @param vpcAccessPolicy the value to be set. */
    public fun vpcAccessPolicy(vpcAccessPolicy: CfnFunction.EmptySAMPTProperty) {
        cdkBuilder.vpcAccessPolicy(vpcAccessPolicy)
    }

    public fun build(): CfnFunction.SAMPolicyTemplateProperty = cdkBuilder.build()
}
