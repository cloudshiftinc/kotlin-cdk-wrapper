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

package io.cloudshiftdev.awscdkdsl.services.ivs

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ivs.CfnChannel
import software.amazon.awscdk.services.ivs.CfnChannelProps
import software.amazon.awscdk.services.ivs.CfnPlaybackKeyPair
import software.amazon.awscdk.services.ivs.CfnPlaybackKeyPairProps
import software.amazon.awscdk.services.ivs.CfnRecordingConfiguration
import software.amazon.awscdk.services.ivs.CfnRecordingConfigurationProps
import software.amazon.awscdk.services.ivs.CfnStreamKey
import software.amazon.awscdk.services.ivs.CfnStreamKeyProps
import software.constructs.Construct

public object ivs {
    /**
     * The `AWS::IVS::Channel` resource specifies an channel.
     *
     * A channel stores configuration information related to your live stream. For more information,
     * see
     * [CreateChannel](https://docs.aws.amazon.com/ivs/latest/APIReference/API_CreateChannel.html)
     * in the *Amazon Interactive Video Service API Reference* .
     *
     * By default, the IVS API CreateChannel endpoint creates a stream key in addition to a channel.
     * The Channel resource *does not* create a stream key; to create a stream key, use the
     * StreamKey resource instead.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ivs.*;
     * CfnChannel cfnChannel = CfnChannel.Builder.create(this, "MyCfnChannel")
     * .authorized(false)
     * .insecureIngest(false)
     * .latencyMode("latencyMode")
     * .name("name")
     * .preset("preset")
     * .recordingConfigurationArn("recordingConfigurationArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html)
     */
    public inline fun cfnChannel(
        scope: Construct,
        id: String,
        block: CfnChannelDsl.() -> Unit = {},
    ): CfnChannel {
        val builder = CfnChannelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnChannel`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ivs.*;
     * CfnChannelProps cfnChannelProps = CfnChannelProps.builder()
     * .authorized(false)
     * .insecureIngest(false)
     * .latencyMode("latencyMode")
     * .name("name")
     * .preset("preset")
     * .recordingConfigurationArn("recordingConfigurationArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html)
     */
    public inline fun cfnChannelProps(block: CfnChannelPropsDsl.() -> Unit = {}): CfnChannelProps {
        val builder = CfnChannelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::IVS::PlaybackKeyPair` resource specifies an playback key pair.
     *
     * uses a public playback key to validate playback tokens that have been signed with the
     * corresponding private key. For more information, see
     * [Setting Up Private Channels](https://docs.aws.amazon.com/ivs/latest/userguide/private-channels.html)
     * in the *Amazon Interactive Video Service User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ivs.*;
     * CfnPlaybackKeyPair cfnPlaybackKeyPair = CfnPlaybackKeyPair.Builder.create(this,
     * "MyCfnPlaybackKeyPair")
     * .name("name")
     * .publicKeyMaterial("publicKeyMaterial")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackkeypair.html)
     */
    public inline fun cfnPlaybackKeyPair(
        scope: Construct,
        id: String,
        block: CfnPlaybackKeyPairDsl.() -> Unit = {},
    ): CfnPlaybackKeyPair {
        val builder = CfnPlaybackKeyPairDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPlaybackKeyPair`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ivs.*;
     * CfnPlaybackKeyPairProps cfnPlaybackKeyPairProps = CfnPlaybackKeyPairProps.builder()
     * .name("name")
     * .publicKeyMaterial("publicKeyMaterial")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackkeypair.html)
     */
    public inline fun cfnPlaybackKeyPairProps(
        block: CfnPlaybackKeyPairPropsDsl.() -> Unit = {}
    ): CfnPlaybackKeyPairProps {
        val builder = CfnPlaybackKeyPairPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::IVS::RecordingConfiguration` resource specifies an recording configuration.
     *
     * A recording configuration enables the recording of a channel’s live streams to a data store.
     * Multiple channels can reference the same recording configuration. For more information, see
     * [RecordingConfiguration](https://docs.aws.amazon.com/ivs/latest/APIReference/API_RecordingConfiguration.html)
     * in the *Amazon Interactive Video Service API Reference* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ivs.*;
     * CfnRecordingConfiguration cfnRecordingConfiguration =
     * CfnRecordingConfiguration.Builder.create(this, "MyCfnRecordingConfiguration")
     * .destinationConfiguration(DestinationConfigurationProperty.builder()
     * .s3(S3DestinationConfigurationProperty.builder()
     * .bucketName("bucketName")
     * .build())
     * .build())
     * // the properties below are optional
     * .name("name")
     * .recordingReconnectWindowSeconds(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .thumbnailConfiguration(ThumbnailConfigurationProperty.builder()
     * .recordingMode("recordingMode")
     * // the properties below are optional
     * .targetIntervalSeconds(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html)
     */
    public inline fun cfnRecordingConfiguration(
        scope: Construct,
        id: String,
        block: CfnRecordingConfigurationDsl.() -> Unit = {},
    ): CfnRecordingConfiguration {
        val builder = CfnRecordingConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The DestinationConfiguration property type describes the location where recorded videos will
     * be stored.
     *
     * Each member represents a type of destination configuration. For recording, you define one and
     * only one type of destination configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ivs.*;
     * DestinationConfigurationProperty destinationConfigurationProperty =
     * DestinationConfigurationProperty.builder()
     * .s3(S3DestinationConfigurationProperty.builder()
     * .bucketName("bucketName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-destinationconfiguration.html)
     */
    public inline fun cfnRecordingConfigurationDestinationConfigurationProperty(
        block: CfnRecordingConfigurationDestinationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnRecordingConfiguration.DestinationConfigurationProperty {
        val builder = CfnRecordingConfigurationDestinationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRecordingConfiguration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ivs.*;
     * CfnRecordingConfigurationProps cfnRecordingConfigurationProps =
     * CfnRecordingConfigurationProps.builder()
     * .destinationConfiguration(DestinationConfigurationProperty.builder()
     * .s3(S3DestinationConfigurationProperty.builder()
     * .bucketName("bucketName")
     * .build())
     * .build())
     * // the properties below are optional
     * .name("name")
     * .recordingReconnectWindowSeconds(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .thumbnailConfiguration(ThumbnailConfigurationProperty.builder()
     * .recordingMode("recordingMode")
     * // the properties below are optional
     * .targetIntervalSeconds(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html)
     */
    public inline fun cfnRecordingConfigurationProps(
        block: CfnRecordingConfigurationPropsDsl.() -> Unit = {}
    ): CfnRecordingConfigurationProps {
        val builder = CfnRecordingConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The S3DestinationConfiguration property type describes an S3 location where recorded videos
     * will be stored.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ivs.*;
     * S3DestinationConfigurationProperty s3DestinationConfigurationProperty =
     * S3DestinationConfigurationProperty.builder()
     * .bucketName("bucketName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-s3destinationconfiguration.html)
     */
    public inline fun cfnRecordingConfigurationS3DestinationConfigurationProperty(
        block: CfnRecordingConfigurationS3DestinationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnRecordingConfiguration.S3DestinationConfigurationProperty {
        val builder = CfnRecordingConfigurationS3DestinationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The ThumbnailConfiguration property type describes a configuration of thumbnails for recorded
     * video.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ivs.*;
     * ThumbnailConfigurationProperty thumbnailConfigurationProperty =
     * ThumbnailConfigurationProperty.builder()
     * .recordingMode("recordingMode")
     * // the properties below are optional
     * .targetIntervalSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thumbnailconfiguration.html)
     */
    public inline fun cfnRecordingConfigurationThumbnailConfigurationProperty(
        block: CfnRecordingConfigurationThumbnailConfigurationPropertyDsl.() -> Unit = {}
    ): CfnRecordingConfiguration.ThumbnailConfigurationProperty {
        val builder = CfnRecordingConfigurationThumbnailConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::IVS::StreamKey` resource specifies an stream key associated with the referenced
     * channel.
     *
     * Use a stream key to initiate a live stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ivs.*;
     * CfnStreamKey cfnStreamKey = CfnStreamKey.Builder.create(this, "MyCfnStreamKey")
     * .channelArn("channelArn")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-streamkey.html)
     */
    public inline fun cfnStreamKey(
        scope: Construct,
        id: String,
        block: CfnStreamKeyDsl.() -> Unit = {},
    ): CfnStreamKey {
        val builder = CfnStreamKeyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStreamKey`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ivs.*;
     * CfnStreamKeyProps cfnStreamKeyProps = CfnStreamKeyProps.builder()
     * .channelArn("channelArn")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-streamkey.html)
     */
    public inline fun cfnStreamKeyProps(
        block: CfnStreamKeyPropsDsl.() -> Unit = {}
    ): CfnStreamKeyProps {
        val builder = CfnStreamKeyPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
