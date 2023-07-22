@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ivs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ivs.CfnRecordingConfiguration

@CdkDslMarker
public class CfnRecordingConfigurationThumbnailConfigurationPropertyDsl {
  private val cdkBuilder: CfnRecordingConfiguration.ThumbnailConfigurationProperty.Builder =
      CfnRecordingConfiguration.ThumbnailConfigurationProperty.builder()

  /**
   * @param recordingMode Thumbnail recording mode. Valid values:. 
   * * `DISABLED` : Use DISABLED to disable the generation of thumbnails for recorded video.
   * * `INTERVAL` : Use INTERVAL to enable the generation of thumbnails for recorded video at a time
   * interval controlled by the
   * [TargetIntervalSeconds](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thumbnailconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration-targetintervalseconds)
   * property.
   *
   * *Default* : `INTERVAL`
   */
  public fun recordingMode(recordingMode: String) {
    cdkBuilder.recordingMode(recordingMode)
  }

  /**
   * @param targetIntervalSeconds The targeted thumbnail-generation interval in seconds. This is
   * configurable (and required) only if
   * [RecordingMode](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thumbnailconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration-recordingmode)
   * is `INTERVAL` .
   *
   * Setting a value for `TargetIntervalSeconds` does not guarantee that thumbnails are generated at
   * the specified interval. For thumbnails to be generated at the `TargetIntervalSeconds` interval,
   * the `IDR/Keyframe` value for the input video must be less than the `TargetIntervalSeconds` value.
   * See [Amazon IVS Streaming
   * Configuration](https://docs.aws.amazon.com/ivs/latest/userguide/streaming-config.html) for
   * information on setting `IDR/Keyframe` to the recommended value in video-encoder settings.
   *
   *
   * *Default* : 60
   *
   * *Valid Range* : Minumum value of 5. Maximum value of 60.
   */
  public fun targetIntervalSeconds(targetIntervalSeconds: Number) {
    cdkBuilder.targetIntervalSeconds(targetIntervalSeconds)
  }

  public fun build(): CfnRecordingConfiguration.ThumbnailConfigurationProperty = cdkBuilder.build()
}
