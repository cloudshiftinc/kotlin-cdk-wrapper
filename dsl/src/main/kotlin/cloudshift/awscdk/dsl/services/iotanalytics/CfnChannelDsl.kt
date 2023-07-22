@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnChannel
import software.constructs.Construct

/**
 * The AWS::IoTAnalytics::Channel resource collects data from an MQTT topic and archives the raw,
 * unprocessed messages before publishing the data to a pipeline.
 *
 * For more information, see [How to Use AWS IoT
 * Analytics](https://docs.aws.amazon.com/iotanalytics/latest/userguide/welcome.html#aws-iot-analytics-how)
 * in the *AWS IoT Analytics User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * Object serviceManagedS3;
 * CfnChannel cfnChannel = CfnChannel.Builder.create(this, "MyCfnChannel")
 * .channelName("channelName")
 * .channelStorage(ChannelStorageProperty.builder()
 * .customerManagedS3(CustomerManagedS3Property.builder()
 * .bucket("bucket")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .keyPrefix("keyPrefix")
 * .build())
 * .serviceManagedS3(serviceManagedS3)
 * .build())
 * .retentionPeriod(RetentionPeriodProperty.builder()
 * .numberOfDays(123)
 * .unlimited(false)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html)
 */
@CdkDslMarker
public class CfnChannelDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnChannel.Builder = CfnChannel.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The name of the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-channelname)
   * @param channelName The name of the channel. 
   */
  public fun channelName(channelName: String) {
    cdkBuilder.channelName(channelName)
  }

  /**
   * Where channel data is stored.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-channelstorage)
   * @param channelStorage Where channel data is stored. 
   */
  public fun channelStorage(channelStorage: IResolvable) {
    cdkBuilder.channelStorage(channelStorage)
  }

  /**
   * Where channel data is stored.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-channelstorage)
   * @param channelStorage Where channel data is stored. 
   */
  public fun channelStorage(channelStorage: CfnChannel.ChannelStorageProperty) {
    cdkBuilder.channelStorage(channelStorage)
  }

  /**
   * How long, in days, message data is kept for the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-retentionperiod)
   * @param retentionPeriod How long, in days, message data is kept for the channel. 
   */
  public fun retentionPeriod(retentionPeriod: IResolvable) {
    cdkBuilder.retentionPeriod(retentionPeriod)
  }

  /**
   * How long, in days, message data is kept for the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-retentionperiod)
   * @param retentionPeriod How long, in days, message data is kept for the channel. 
   */
  public fun retentionPeriod(retentionPeriod: CfnChannel.RetentionPeriodProperty) {
    cdkBuilder.retentionPeriod(retentionPeriod)
  }

  /**
   * Metadata which can be used to manage the channel.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-tags)
   * @param tags Metadata which can be used to manage the channel. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Metadata which can be used to manage the channel.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html#cfn-iotanalytics-channel-tags)
   * @param tags Metadata which can be used to manage the channel. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnChannel {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
