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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.osis.CfnPipeline
import software.amazon.awscdk.services.osis.CfnPipelineProps
import software.constructs.Construct

public object osis {
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
    public inline fun cfnPipeline(
        scope: Construct,
        id: String,
        block: CfnPipelineDsl.() -> Unit = {},
    ): CfnPipeline {
        val builder = CfnPipelineDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options that specify the configuration of a persistent buffer.
     *
     * To configure how OpenSearch Ingestion encrypts this data, set the `EncryptionAtRestOptions` .
     * For more information, see
     * [Persistent buffering](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/osis-features-overview.html#persistent-buffering)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.osis.*;
     * BufferOptionsProperty bufferOptionsProperty = BufferOptionsProperty.builder()
     * .persistentBufferEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-bufferoptions.html)
     */
    public inline fun cfnPipelineBufferOptionsProperty(
        block: CfnPipelineBufferOptionsPropertyDsl.() -> Unit = {}
    ): CfnPipeline.BufferOptionsProperty {
        val builder = CfnPipelineBufferOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The destination for OpenSearch Ingestion logs sent to Amazon CloudWatch.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.osis.*;
     * CloudWatchLogDestinationProperty cloudWatchLogDestinationProperty =
     * CloudWatchLogDestinationProperty.builder()
     * .logGroup("logGroup")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-cloudwatchlogdestination.html)
     */
    public inline fun cfnPipelineCloudWatchLogDestinationProperty(
        block: CfnPipelineCloudWatchLogDestinationPropertyDsl.() -> Unit = {}
    ): CfnPipeline.CloudWatchLogDestinationProperty {
        val builder = CfnPipelineCloudWatchLogDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to control how OpenSearch encrypts buffer data.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.osis.*;
     * EncryptionAtRestOptionsProperty encryptionAtRestOptionsProperty =
     * EncryptionAtRestOptionsProperty.builder()
     * .kmsKeyArn("kmsKeyArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-encryptionatrestoptions.html)
     */
    public inline fun cfnPipelineEncryptionAtRestOptionsProperty(
        block: CfnPipelineEncryptionAtRestOptionsPropertyDsl.() -> Unit = {}
    ): CfnPipeline.EncryptionAtRestOptionsProperty {
        val builder = CfnPipelineEncryptionAtRestOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Container for the values required to configure logging for the pipeline.
     *
     * If you don't specify these values, OpenSearch Ingestion will not publish logs from your
     * application to CloudWatch Logs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.osis.*;
     * LogPublishingOptionsProperty logPublishingOptionsProperty =
     * LogPublishingOptionsProperty.builder()
     * .cloudWatchLogDestination(CloudWatchLogDestinationProperty.builder()
     * .logGroup("logGroup")
     * .build())
     * .isLoggingEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-logpublishingoptions.html)
     */
    public inline fun cfnPipelineLogPublishingOptionsProperty(
        block: CfnPipelineLogPublishingOptionsPropertyDsl.() -> Unit = {}
    ): CfnPipeline.LogPublishingOptionsProperty {
        val builder = CfnPipelineLogPublishingOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnPipelineProps(
        block: CfnPipelinePropsDsl.() -> Unit = {}
    ): CfnPipelineProps {
        val builder = CfnPipelinePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An OpenSearch Ingestion-managed VPC endpoint that will access one or more pipelines.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.osis.*;
     * VpcEndpointProperty vpcEndpointProperty = VpcEndpointProperty.builder()
     * .vpcEndpointId("vpcEndpointId")
     * .vpcId("vpcId")
     * .vpcOptions(VpcOptionsProperty.builder()
     * .subnetIds(List.of("subnetIds"))
     * // the properties below are optional
     * .securityGroupIds(List.of("securityGroupIds"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-vpcendpoint.html)
     */
    public inline fun cfnPipelineVpcEndpointProperty(
        block: CfnPipelineVpcEndpointPropertyDsl.() -> Unit = {}
    ): CfnPipeline.VpcEndpointProperty {
        val builder = CfnPipelineVpcEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options that specify the subnets and security groups for an OpenSearch Ingestion VPC
     * endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.osis.*;
     * VpcOptionsProperty vpcOptionsProperty = VpcOptionsProperty.builder()
     * .subnetIds(List.of("subnetIds"))
     * // the properties below are optional
     * .securityGroupIds(List.of("securityGroupIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-vpcoptions.html)
     */
    public inline fun cfnPipelineVpcOptionsProperty(
        block: CfnPipelineVpcOptionsPropertyDsl.() -> Unit = {}
    ): CfnPipeline.VpcOptionsProperty {
        val builder = CfnPipelineVpcOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
