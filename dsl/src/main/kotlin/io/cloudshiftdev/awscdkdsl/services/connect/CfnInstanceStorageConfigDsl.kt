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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig
import software.constructs.Construct

/**
 * The storage configuration for the instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CfnInstanceStorageConfig cfnInstanceStorageConfig = CfnInstanceStorageConfig.Builder.create(this,
 * "MyCfnInstanceStorageConfig")
 * .instanceArn("instanceArn")
 * .resourceType("resourceType")
 * .storageType("storageType")
 * // the properties below are optional
 * .kinesisFirehoseConfig(KinesisFirehoseConfigProperty.builder()
 * .firehoseArn("firehoseArn")
 * .build())
 * .kinesisStreamConfig(KinesisStreamConfigProperty.builder()
 * .streamArn("streamArn")
 * .build())
 * .kinesisVideoStreamConfig(KinesisVideoStreamConfigProperty.builder()
 * .encryptionConfig(EncryptionConfigProperty.builder()
 * .encryptionType("encryptionType")
 * .keyId("keyId")
 * .build())
 * .prefix("prefix")
 * .retentionPeriodHours(123)
 * .build())
 * .s3Config(S3ConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * // the properties below are optional
 * .encryptionConfig(EncryptionConfigProperty.builder()
 * .encryptionType("encryptionType")
 * .keyId("keyId")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html)
 */
@CdkDslMarker
public class CfnInstanceStorageConfigDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnInstanceStorageConfig.Builder =
        CfnInstanceStorageConfig.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-instancearn)
     *
     * @param instanceArn The Amazon Resource Name (ARN) of the instance.
     */
    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * The configuration of the Kinesis Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisfirehoseconfig)
     *
     * @param kinesisFirehoseConfig The configuration of the Kinesis Firehose delivery stream.
     */
    public fun kinesisFirehoseConfig(kinesisFirehoseConfig: IResolvable) {
        cdkBuilder.kinesisFirehoseConfig(kinesisFirehoseConfig)
    }

    /**
     * The configuration of the Kinesis Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisfirehoseconfig)
     *
     * @param kinesisFirehoseConfig The configuration of the Kinesis Firehose delivery stream.
     */
    public fun kinesisFirehoseConfig(
        kinesisFirehoseConfig: CfnInstanceStorageConfig.KinesisFirehoseConfigProperty
    ) {
        cdkBuilder.kinesisFirehoseConfig(kinesisFirehoseConfig)
    }

    /**
     * The configuration of the Kinesis data stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisstreamconfig)
     *
     * @param kinesisStreamConfig The configuration of the Kinesis data stream.
     */
    public fun kinesisStreamConfig(kinesisStreamConfig: IResolvable) {
        cdkBuilder.kinesisStreamConfig(kinesisStreamConfig)
    }

    /**
     * The configuration of the Kinesis data stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisstreamconfig)
     *
     * @param kinesisStreamConfig The configuration of the Kinesis data stream.
     */
    public fun kinesisStreamConfig(
        kinesisStreamConfig: CfnInstanceStorageConfig.KinesisStreamConfigProperty
    ) {
        cdkBuilder.kinesisStreamConfig(kinesisStreamConfig)
    }

    /**
     * The configuration of the Kinesis video stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisvideostreamconfig)
     *
     * @param kinesisVideoStreamConfig The configuration of the Kinesis video stream.
     */
    public fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: IResolvable) {
        cdkBuilder.kinesisVideoStreamConfig(kinesisVideoStreamConfig)
    }

    /**
     * The configuration of the Kinesis video stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisvideostreamconfig)
     *
     * @param kinesisVideoStreamConfig The configuration of the Kinesis video stream.
     */
    public fun kinesisVideoStreamConfig(
        kinesisVideoStreamConfig: CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty
    ) {
        cdkBuilder.kinesisVideoStreamConfig(kinesisVideoStreamConfig)
    }

    /**
     * A valid resource type.
     *
     * Following are the valid resource types: `CHAT_TRANSCRIPTS` | `CALL_RECORDINGS` |
     * `SCHEDULED_REPORTS` | `MEDIA_STREAMS` | `CONTACT_TRACE_RECORDS` | `AGENT_EVENTS`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-resourcetype)
     *
     * @param resourceType A valid resource type.
     */
    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    /**
     * The S3 bucket configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-s3config)
     *
     * @param s3Config The S3 bucket configuration.
     */
    public fun s3Config(s3Config: IResolvable) {
        cdkBuilder.s3Config(s3Config)
    }

    /**
     * The S3 bucket configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-s3config)
     *
     * @param s3Config The S3 bucket configuration.
     */
    public fun s3Config(s3Config: CfnInstanceStorageConfig.S3ConfigProperty) {
        cdkBuilder.s3Config(s3Config)
    }

    /**
     * A valid storage type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-storagetype)
     *
     * @param storageType A valid storage type.
     */
    public fun storageType(storageType: String) {
        cdkBuilder.storageType(storageType)
    }

    public fun build(): CfnInstanceStorageConfig = cdkBuilder.build()
}
