@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamHttpEndpointConfigurationPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.HttpEndpointConfigurationProperty.Builder =
      CfnDeliveryStream.HttpEndpointConfigurationProperty.builder()

  public fun accessKey(accessKey: String) {
    cdkBuilder.accessKey(accessKey)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun url(url: String) {
    cdkBuilder.url(url)
  }

  public fun build(): CfnDeliveryStream.HttpEndpointConfigurationProperty = cdkBuilder.build()
}
