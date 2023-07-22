@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnChannel

/**
 * Where channel data is stored.
 *
 * You may choose one of `serviceManagedS3` , `customerManagedS3` storage. If not specified, the
 * default is `serviceManagedS3` . This can't be changed after creation of the channel.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * Object serviceManagedS3;
 * ChannelStorageProperty channelStorageProperty = ChannelStorageProperty.builder()
 * .customerManagedS3(CustomerManagedS3Property.builder()
 * .bucket("bucket")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .keyPrefix("keyPrefix")
 * .build())
 * .serviceManagedS3(serviceManagedS3)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-channelstorage.html)
 */
@CdkDslMarker
public class CfnChannelChannelStoragePropertyDsl {
  private val cdkBuilder: CfnChannel.ChannelStorageProperty.Builder =
      CfnChannel.ChannelStorageProperty.builder()

  /**
   * @param customerManagedS3 Used to store channel data in an S3 bucket that you manage.
   * If customer managed storage is selected, the `retentionPeriod` parameter is ignored. You can't
   * change the choice of S3 storage after the data store is created.
   */
  public fun customerManagedS3(customerManagedS3: IResolvable) {
    cdkBuilder.customerManagedS3(customerManagedS3)
  }

  /**
   * @param customerManagedS3 Used to store channel data in an S3 bucket that you manage.
   * If customer managed storage is selected, the `retentionPeriod` parameter is ignored. You can't
   * change the choice of S3 storage after the data store is created.
   */
  public fun customerManagedS3(customerManagedS3: CfnChannel.CustomerManagedS3Property) {
    cdkBuilder.customerManagedS3(customerManagedS3)
  }

  /**
   * @param serviceManagedS3 Used to store channel data in an S3 bucket managed by AWS IoT Analytics
   * .
   * You can't change the choice of S3 storage after the data store is created.
   */
  public fun serviceManagedS3(serviceManagedS3: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(serviceManagedS3)
    cdkBuilder.serviceManagedS3(builder.map)
  }

  /**
   * @param serviceManagedS3 Used to store channel data in an S3 bucket managed by AWS IoT Analytics
   * .
   * You can't change the choice of S3 storage after the data store is created.
   */
  public fun serviceManagedS3(serviceManagedS3: Any) {
    cdkBuilder.serviceManagedS3(serviceManagedS3)
  }

  public fun build(): CfnChannel.ChannelStorageProperty = cdkBuilder.build()
}
