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
import software.amazon.awscdk.services.osis.CfnPipelineProps

/**
 * Properties for defining a `CfnPipeline`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.osis.*;
 * CfnPipelineProps cfnPipelineProps = CfnPipelineProps.builder()
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
public class CfnPipelinePropsDsl {
    private val cdkBuilder: CfnPipelineProps.Builder = CfnPipelineProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param bufferOptions Options that specify the configuration of a persistent buffer. To
     *   configure how OpenSearch Ingestion encrypts this data, set the `EncryptionAtRestOptions` .
     *   For more information, see
     *   [Persistent buffering](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/osis-features-overview.html#persistent-buffering)
     *   .
     */
    public fun bufferOptions(bufferOptions: IResolvable) {
        cdkBuilder.bufferOptions(bufferOptions)
    }

    /**
     * @param bufferOptions Options that specify the configuration of a persistent buffer. To
     *   configure how OpenSearch Ingestion encrypts this data, set the `EncryptionAtRestOptions` .
     *   For more information, see
     *   [Persistent buffering](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/osis-features-overview.html#persistent-buffering)
     *   .
     */
    public fun bufferOptions(bufferOptions: CfnPipeline.BufferOptionsProperty) {
        cdkBuilder.bufferOptions(bufferOptions)
    }

    /** @param encryptionAtRestOptions Options to control how OpenSearch encrypts buffer data. */
    public fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable) {
        cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions)
    }

    /** @param encryptionAtRestOptions Options to control how OpenSearch encrypts buffer data. */
    public fun encryptionAtRestOptions(
        encryptionAtRestOptions: CfnPipeline.EncryptionAtRestOptionsProperty
    ) {
        cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions)
    }

    /** @param logPublishingOptions Key-value pairs that represent log publishing settings. */
    public fun logPublishingOptions(logPublishingOptions: IResolvable) {
        cdkBuilder.logPublishingOptions(logPublishingOptions)
    }

    /** @param logPublishingOptions Key-value pairs that represent log publishing settings. */
    public fun logPublishingOptions(
        logPublishingOptions: CfnPipeline.LogPublishingOptionsProperty
    ) {
        cdkBuilder.logPublishingOptions(logPublishingOptions)
    }

    /** @param maxUnits The maximum pipeline capacity, in Ingestion Compute Units (ICUs). */
    public fun maxUnits(maxUnits: Number) {
        cdkBuilder.maxUnits(maxUnits)
    }

    /** @param minUnits The minimum pipeline capacity, in Ingestion Compute Units (ICUs). */
    public fun minUnits(minUnits: Number) {
        cdkBuilder.minUnits(minUnits)
    }

    /** @param pipelineConfigurationBody The Data Prepper pipeline configuration in YAML format. */
    public fun pipelineConfigurationBody(pipelineConfigurationBody: String) {
        cdkBuilder.pipelineConfigurationBody(pipelineConfigurationBody)
    }

    /** @param pipelineName The name of the pipeline. */
    public fun pipelineName(pipelineName: String) {
        cdkBuilder.pipelineName(pipelineName)
    }

    /** @param tags List of tags to add to the pipeline upon creation. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags List of tags to add to the pipeline upon creation. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param vpcOptions Options that specify the subnets and security groups for an OpenSearch
     *   Ingestion VPC endpoint.
     */
    public fun vpcOptions(vpcOptions: IResolvable) {
        cdkBuilder.vpcOptions(vpcOptions)
    }

    /**
     * @param vpcOptions Options that specify the subnets and security groups for an OpenSearch
     *   Ingestion VPC endpoint.
     */
    public fun vpcOptions(vpcOptions: CfnPipeline.VpcOptionsProperty) {
        cdkBuilder.vpcOptions(vpcOptions)
    }

    public fun build(): CfnPipelineProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
