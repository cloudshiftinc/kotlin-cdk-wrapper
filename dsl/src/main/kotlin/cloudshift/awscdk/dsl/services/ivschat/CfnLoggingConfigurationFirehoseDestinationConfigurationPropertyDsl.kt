@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ivschat

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration

@CdkDslMarker
public class CfnLoggingConfigurationFirehoseDestinationConfigurationPropertyDsl {
  private val cdkBuilder: CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty.Builder =
      CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty.builder()

  /**
   * @param deliveryStreamName Name of the Amazon Kinesis Firehose delivery stream where chat
   * activity will be logged. 
   */
  public fun deliveryStreamName(deliveryStreamName: String) {
    cdkBuilder.deliveryStreamName(deliveryStreamName)
  }

  public fun build(): CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty =
      cdkBuilder.build()
}
