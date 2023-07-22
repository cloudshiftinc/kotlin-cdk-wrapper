@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamDynamicPartitioningConfigurationPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.DynamicPartitioningConfigurationProperty.Builder =
      CfnDeliveryStream.DynamicPartitioningConfigurationProperty.builder()

  /**
   * @param enabled Specifies whether dynamic partitioning is enabled for this Kinesis Data Firehose
   * delivery stream.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Specifies whether dynamic partitioning is enabled for this Kinesis Data Firehose
   * delivery stream.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param retryOptions Specifies the retry behavior in case Kinesis Data Firehose is unable to
   * deliver data to an Amazon S3 prefix.
   */
  public fun retryOptions(retryOptions: IResolvable) {
    cdkBuilder.retryOptions(retryOptions)
  }

  /**
   * @param retryOptions Specifies the retry behavior in case Kinesis Data Firehose is unable to
   * deliver data to an Amazon S3 prefix.
   */
  public fun retryOptions(retryOptions: CfnDeliveryStream.RetryOptionsProperty) {
    cdkBuilder.retryOptions(retryOptions)
  }

  public fun build(): CfnDeliveryStream.DynamicPartitioningConfigurationProperty =
      cdkBuilder.build()
}
