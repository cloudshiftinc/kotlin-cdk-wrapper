@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamHttpEndpointConfigurationPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.HttpEndpointConfigurationProperty.Builder =
      CfnDeliveryStream.HttpEndpointConfigurationProperty.builder()

  /**
   * @param accessKey The access key required for Kinesis Firehose to authenticate with the HTTP
   * endpoint selected as the destination.
   */
  public fun accessKey(accessKey: String) {
    cdkBuilder.accessKey(accessKey)
  }

  /**
   * @param name The name of the HTTP endpoint selected as the destination.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param url The URL of the HTTP endpoint selected as the destination. 
   */
  public fun url(url: String) {
    cdkBuilder.url(url)
  }

  public fun build(): CfnDeliveryStream.HttpEndpointConfigurationProperty = cdkBuilder.build()
}
