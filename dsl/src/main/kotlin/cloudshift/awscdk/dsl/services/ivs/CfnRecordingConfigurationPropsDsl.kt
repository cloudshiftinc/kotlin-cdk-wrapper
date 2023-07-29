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

package cloudshift.awscdk.dsl.services.ivs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ivs.CfnRecordingConfiguration
import software.amazon.awscdk.services.ivs.CfnRecordingConfigurationProps

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
@CdkDslMarker
public class CfnRecordingConfigurationPropsDsl {
    private val cdkBuilder: CfnRecordingConfigurationProps.Builder =
        CfnRecordingConfigurationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param destinationConfiguration A destination configuration contains information about where
     *   recorded video will be stored. See the
     *   [DestinationConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-destinationconfiguration.html)
     *   property type for more information.
     */
    public fun destinationConfiguration(destinationConfiguration: IResolvable) {
        cdkBuilder.destinationConfiguration(destinationConfiguration)
    }

    /**
     * @param destinationConfiguration A destination configuration contains information about where
     *   recorded video will be stored. See the
     *   [DestinationConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-destinationconfiguration.html)
     *   property type for more information.
     */
    public fun destinationConfiguration(
        destinationConfiguration: CfnRecordingConfiguration.DestinationConfigurationProperty
    ) {
        cdkBuilder.destinationConfiguration(destinationConfiguration)
    }

    /** @param name Recording-configuration name. The value does not need to be unique. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param recordingReconnectWindowSeconds If a broadcast disconnects and then reconnects within
     *   the specified interval, the multiple streams will be considered a single broadcast and
     *   merged together. *Default* : `0`
     */
    public fun recordingReconnectWindowSeconds(recordingReconnectWindowSeconds: Number) {
        cdkBuilder.recordingReconnectWindowSeconds(recordingReconnectWindowSeconds)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param thumbnailConfiguration A thumbnail configuration enables/disables the recording of
     *   thumbnails for a live session and controls the interval at which thumbnails are generated
     *   for the live session. See the
     *   [ThumbnailConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thunbnailconfiguration.html)
     *   property type for more information.
     */
    public fun thumbnailConfiguration(thumbnailConfiguration: IResolvable) {
        cdkBuilder.thumbnailConfiguration(thumbnailConfiguration)
    }

    /**
     * @param thumbnailConfiguration A thumbnail configuration enables/disables the recording of
     *   thumbnails for a live session and controls the interval at which thumbnails are generated
     *   for the live session. See the
     *   [ThumbnailConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thunbnailconfiguration.html)
     *   property type for more information.
     */
    public fun thumbnailConfiguration(
        thumbnailConfiguration: CfnRecordingConfiguration.ThumbnailConfigurationProperty
    ) {
        cdkBuilder.thumbnailConfiguration(thumbnailConfiguration)
    }

    public fun build(): CfnRecordingConfigurationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
