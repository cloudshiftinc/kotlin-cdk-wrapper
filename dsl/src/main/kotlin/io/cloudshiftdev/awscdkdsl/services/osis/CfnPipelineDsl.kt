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

package io.cloudshiftdev.awscdkdsl.services.osis

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.osis.CfnPipeline
import software.constructs.Construct

/**
 * The AWS::OSIS::Pipeline resource creates an Amazon OpenSearch Ingestion pipeline.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.osis.*;
 * CfnPipeline cfnPipeline = CfnPipeline.Builder.create(this, "MyCfnPipeline")
 * .maxUnits(123)
 * .minUnits(123)
 * .pipelineConfigurationBody("pipelineConfigurationBody")
 * .pipelineName("pipelineName")
 * // the properties below are optional
 * .bufferOptions(BufferOptionsProperty.builder()
 * .persistentBufferEnabled(false)
 * .build())
 * .encryptionAtRestOptions(EncryptionAtRestOptionsProperty.builder()
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .logPublishingOptions(LogPublishingOptionsProperty.builder()
 * .cloudWatchLogDestination(CloudWatchLogDestinationProperty.builder()
 * .logGroup("logGroup")
 * .build())
 * .isLoggingEnabled(false)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcOptions(VpcOptionsProperty.builder()
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .securityGroupIds(List.of("securityGroupIds"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html)
 */
@CdkDslMarker
public class CfnPipelineDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPipeline.Builder = CfnPipeline.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Options that specify the configuration of a persistent buffer.
     *
     * To configure how OpenSearch Ingestion encrypts this data, set the `EncryptionAtRestOptions` .
     * For more information, see
     * [Persistent buffering](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/osis-features-overview.html#persistent-buffering)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-bufferoptions)
     *
     * @param bufferOptions Options that specify the configuration of a persistent buffer.
     */
    public fun bufferOptions(bufferOptions: IResolvable) {
        cdkBuilder.bufferOptions(bufferOptions)
    }

    /**
     * Options that specify the configuration of a persistent buffer.
     *
     * To configure how OpenSearch Ingestion encrypts this data, set the `EncryptionAtRestOptions` .
     * For more information, see
     * [Persistent buffering](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/osis-features-overview.html#persistent-buffering)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-bufferoptions)
     *
     * @param bufferOptions Options that specify the configuration of a persistent buffer.
     */
    public fun bufferOptions(bufferOptions: CfnPipeline.BufferOptionsProperty) {
        cdkBuilder.bufferOptions(bufferOptions)
    }

    /**
     * Options to control how OpenSearch encrypts buffer data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-encryptionatrestoptions)
     *
     * @param encryptionAtRestOptions Options to control how OpenSearch encrypts buffer data.
     */
    public fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable) {
        cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions)
    }

    /**
     * Options to control how OpenSearch encrypts buffer data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-encryptionatrestoptions)
     *
     * @param encryptionAtRestOptions Options to control how OpenSearch encrypts buffer data.
     */
    public fun encryptionAtRestOptions(
        encryptionAtRestOptions: CfnPipeline.EncryptionAtRestOptionsProperty
    ) {
        cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions)
    }

    /**
     * Key-value pairs that represent log publishing settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-logpublishingoptions)
     *
     * @param logPublishingOptions Key-value pairs that represent log publishing settings.
     */
    public fun logPublishingOptions(logPublishingOptions: IResolvable) {
        cdkBuilder.logPublishingOptions(logPublishingOptions)
    }

    /**
     * Key-value pairs that represent log publishing settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-logpublishingoptions)
     *
     * @param logPublishingOptions Key-value pairs that represent log publishing settings.
     */
    public fun logPublishingOptions(
        logPublishingOptions: CfnPipeline.LogPublishingOptionsProperty
    ) {
        cdkBuilder.logPublishingOptions(logPublishingOptions)
    }

    /**
     * The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-maxunits)
     *
     * @param maxUnits The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     */
    public fun maxUnits(maxUnits: Number) {
        cdkBuilder.maxUnits(maxUnits)
    }

    /**
     * The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-minunits)
     *
     * @param minUnits The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     */
    public fun minUnits(minUnits: Number) {
        cdkBuilder.minUnits(minUnits)
    }

    /**
     * The Data Prepper pipeline configuration in YAML format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-pipelineconfigurationbody)
     *
     * @param pipelineConfigurationBody The Data Prepper pipeline configuration in YAML format.
     */
    public fun pipelineConfigurationBody(pipelineConfigurationBody: String) {
        cdkBuilder.pipelineConfigurationBody(pipelineConfigurationBody)
    }

    /**
     * The name of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-pipelinename)
     *
     * @param pipelineName The name of the pipeline.
     */
    public fun pipelineName(pipelineName: String) {
        cdkBuilder.pipelineName(pipelineName)
    }

    /**
     * List of tags to add to the pipeline upon creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-tags)
     *
     * @param tags List of tags to add to the pipeline upon creation.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * List of tags to add to the pipeline upon creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-tags)
     *
     * @param tags List of tags to add to the pipeline upon creation.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * Options that specify the subnets and security groups for an OpenSearch Ingestion VPC
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-vpcoptions)
     *
     * @param vpcOptions Options that specify the subnets and security groups for an OpenSearch
     *   Ingestion VPC endpoint.
     */
    public fun vpcOptions(vpcOptions: IResolvable) {
        cdkBuilder.vpcOptions(vpcOptions)
    }

    /**
     * Options that specify the subnets and security groups for an OpenSearch Ingestion VPC
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-osis-pipeline.html#cfn-osis-pipeline-vpcoptions)
     *
     * @param vpcOptions Options that specify the subnets and security groups for an OpenSearch
     *   Ingestion VPC endpoint.
     */
    public fun vpcOptions(vpcOptions: CfnPipeline.VpcOptionsProperty) {
        cdkBuilder.vpcOptions(vpcOptions)
    }

    public fun build(): CfnPipeline {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
