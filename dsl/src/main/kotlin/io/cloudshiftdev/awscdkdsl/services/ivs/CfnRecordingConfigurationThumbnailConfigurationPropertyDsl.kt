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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ivs.CfnRecordingConfiguration

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
@CdkDslMarker
public class CfnRecordingConfigurationThumbnailConfigurationPropertyDsl {
    private val cdkBuilder: CfnRecordingConfiguration.ThumbnailConfigurationProperty.Builder =
        CfnRecordingConfiguration.ThumbnailConfigurationProperty.builder()

    /**
     * @param recordingMode Thumbnail recording mode. Valid values:.
     * * `DISABLED` : Use DISABLED to disable the generation of thumbnails for recorded video.
     * * `INTERVAL` : Use INTERVAL to enable the generation of thumbnails for recorded video at a
     *   time interval controlled by the
     *   [TargetIntervalSeconds](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thumbnailconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration-targetintervalseconds)
     *   property.
     *
     * *Default* : `INTERVAL`
     */
    public fun recordingMode(recordingMode: String) {
        cdkBuilder.recordingMode(recordingMode)
    }

    /**
     * @param targetIntervalSeconds The targeted thumbnail-generation interval in seconds. This is
     *   configurable (and required) only if
     *   [RecordingMode](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thumbnailconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration-recordingmode)
     *   is `INTERVAL` .
     *
     * Setting a value for `TargetIntervalSeconds` does not guarantee that thumbnails are generated
     * at the specified interval. For thumbnails to be generated at the `TargetIntervalSeconds`
     * interval, the `IDR/Keyframe` value for the input video must be less than the
     * `TargetIntervalSeconds` value. See
     * [Amazon IVS Streaming Configuration](https://docs.aws.amazon.com/ivs/latest/userguide/streaming-config.html)
     * for information on setting `IDR/Keyframe` to the recommended value in video-encoder settings.
     *
     * *Default* : 60
     *
     * *Valid Range* : Minumum value of 5. Maximum value of 60.
     */
    public fun targetIntervalSeconds(targetIntervalSeconds: Number) {
        cdkBuilder.targetIntervalSeconds(targetIntervalSeconds)
    }

    public fun build(): CfnRecordingConfiguration.ThumbnailConfigurationProperty =
        cdkBuilder.build()
}
