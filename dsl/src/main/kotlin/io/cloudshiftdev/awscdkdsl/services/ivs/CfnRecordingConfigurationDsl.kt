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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ivs.CfnRecordingConfiguration
import software.constructs.Construct

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
 * .renditionConfiguration(RenditionConfigurationProperty.builder()
 * .renditions(List.of("renditions"))
 * .renditionSelection("renditionSelection")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .thumbnailConfiguration(ThumbnailConfigurationProperty.builder()
 * .recordingMode("recordingMode")
 * .resolution("resolution")
 * .storage(List.of("storage"))
 * .targetIntervalSeconds(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html)
 */
@CdkDslMarker
public class CfnRecordingConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRecordingConfiguration.Builder =
        CfnRecordingConfiguration.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A destination configuration contains information about where recorded video will be stored.
     *
     * See the DestinationConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-destinationconfiguration)
     *
     * @param destinationConfiguration A destination configuration contains information about where
     *   recorded video will be stored.
     */
    public fun destinationConfiguration(destinationConfiguration: IResolvable) {
        cdkBuilder.destinationConfiguration(destinationConfiguration)
    }

    /**
     * A destination configuration contains information about where recorded video will be stored.
     *
     * See the DestinationConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-destinationconfiguration)
     *
     * @param destinationConfiguration A destination configuration contains information about where
     *   recorded video will be stored.
     */
    public fun destinationConfiguration(
        destinationConfiguration: CfnRecordingConfiguration.DestinationConfigurationProperty
    ) {
        cdkBuilder.destinationConfiguration(destinationConfiguration)
    }

    /**
     * Recording-configuration name.
     *
     * The value does not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-name)
     *
     * @param name Recording-configuration name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * If a broadcast disconnects and then reconnects within the specified interval, the multiple
     * streams will be considered a single broadcast and merged together.
     *
     * *Default* : `0`
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-recordingreconnectwindowseconds)
     *
     * @param recordingReconnectWindowSeconds If a broadcast disconnects and then reconnects within
     *   the specified interval, the multiple streams will be considered a single broadcast and
     *   merged together.
     */
    public fun recordingReconnectWindowSeconds(recordingReconnectWindowSeconds: Number) {
        cdkBuilder.recordingReconnectWindowSeconds(recordingReconnectWindowSeconds)
    }

    /**
     * A rendition configuration describes which renditions should be recorded for a stream.
     *
     * See the RenditionConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-renditionconfiguration)
     *
     * @param renditionConfiguration A rendition configuration describes which renditions should be
     *   recorded for a stream.
     */
    public fun renditionConfiguration(renditionConfiguration: IResolvable) {
        cdkBuilder.renditionConfiguration(renditionConfiguration)
    }

    /**
     * A rendition configuration describes which renditions should be recorded for a stream.
     *
     * See the RenditionConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-renditionconfiguration)
     *
     * @param renditionConfiguration A rendition configuration describes which renditions should be
     *   recorded for a stream.
     */
    public fun renditionConfiguration(
        renditionConfiguration: CfnRecordingConfiguration.RenditionConfigurationProperty
    ) {
        cdkBuilder.renditionConfiguration(renditionConfiguration)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * A thumbnail configuration enables/disables the recording of thumbnails for a live session and
     * controls the interval at which thumbnails are generated for the live session.
     *
     * See the ThumbnailConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration)
     *
     * @param thumbnailConfiguration A thumbnail configuration enables/disables the recording of
     *   thumbnails for a live session and controls the interval at which thumbnails are generated
     *   for the live session.
     */
    public fun thumbnailConfiguration(thumbnailConfiguration: IResolvable) {
        cdkBuilder.thumbnailConfiguration(thumbnailConfiguration)
    }

    /**
     * A thumbnail configuration enables/disables the recording of thumbnails for a live session and
     * controls the interval at which thumbnails are generated for the live session.
     *
     * See the ThumbnailConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration)
     *
     * @param thumbnailConfiguration A thumbnail configuration enables/disables the recording of
     *   thumbnails for a live session and controls the interval at which thumbnails are generated
     *   for the live session.
     */
    public fun thumbnailConfiguration(
        thumbnailConfiguration: CfnRecordingConfiguration.ThumbnailConfigurationProperty
    ) {
        cdkBuilder.thumbnailConfiguration(thumbnailConfiguration)
    }

    public fun build(): CfnRecordingConfiguration {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
