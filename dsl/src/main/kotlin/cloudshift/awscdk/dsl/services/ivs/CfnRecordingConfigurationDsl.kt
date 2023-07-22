@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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
import software.constructs.Construct

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
   * See the
   * [DestinationConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-destinationconfiguration.html)
   * property type for more information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-destinationconfiguration)
   * @param destinationConfiguration A destination configuration contains information about where
   * recorded video will be stored. 
   */
  public fun destinationConfiguration(destinationConfiguration: IResolvable) {
    cdkBuilder.destinationConfiguration(destinationConfiguration)
  }

  /**
   * A destination configuration contains information about where recorded video will be stored.
   *
   * See the
   * [DestinationConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-destinationconfiguration.html)
   * property type for more information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-destinationconfiguration)
   * @param destinationConfiguration A destination configuration contains information about where
   * recorded video will be stored. 
   */
  public
      fun destinationConfiguration(destinationConfiguration: CfnRecordingConfiguration.DestinationConfigurationProperty) {
    cdkBuilder.destinationConfiguration(destinationConfiguration)
  }

  /**
   * Recording-configuration name.
   *
   * The value does not need to be unique.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-name)
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
   * @param recordingReconnectWindowSeconds If a broadcast disconnects and then reconnects within
   * the specified interval, the multiple streams will be considered a single broadcast and merged
   * together. 
   */
  public fun recordingReconnectWindowSeconds(recordingReconnectWindowSeconds: Number) {
    cdkBuilder.recordingReconnectWindowSeconds(recordingReconnectWindowSeconds)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-tags)
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
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * A thumbnail configuration enables/disables the recording of thumbnails for a live session and
   * controls the interval at which thumbnails are generated for the live session.
   *
   * See the
   * [ThumbnailConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thunbnailconfiguration.html)
   * property type for more information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration)
   * @param thumbnailConfiguration A thumbnail configuration enables/disables the recording of
   * thumbnails for a live session and controls the interval at which thumbnails are generated for the
   * live session. 
   */
  public fun thumbnailConfiguration(thumbnailConfiguration: IResolvable) {
    cdkBuilder.thumbnailConfiguration(thumbnailConfiguration)
  }

  /**
   * A thumbnail configuration enables/disables the recording of thumbnails for a live session and
   * controls the interval at which thumbnails are generated for the live session.
   *
   * See the
   * [ThumbnailConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thunbnailconfiguration.html)
   * property type for more information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration)
   * @param thumbnailConfiguration A thumbnail configuration enables/disables the recording of
   * thumbnails for a live session and controls the interval at which thumbnails are generated for the
   * live session. 
   */
  public
      fun thumbnailConfiguration(thumbnailConfiguration: CfnRecordingConfiguration.ThumbnailConfigurationProperty) {
    cdkBuilder.thumbnailConfiguration(thumbnailConfiguration)
  }

  public fun build(): CfnRecordingConfiguration {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
