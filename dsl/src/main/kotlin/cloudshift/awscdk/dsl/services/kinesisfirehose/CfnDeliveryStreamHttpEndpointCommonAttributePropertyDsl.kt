@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamHttpEndpointCommonAttributePropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.HttpEndpointCommonAttributeProperty.Builder =
      CfnDeliveryStream.HttpEndpointCommonAttributeProperty.builder()

  /**
   * @param attributeName The name of the HTTP endpoint common attribute. 
   */
  public fun attributeName(attributeName: String) {
    cdkBuilder.attributeName(attributeName)
  }

  /**
   * @param attributeValue The value of the HTTP endpoint common attribute. 
   */
  public fun attributeValue(attributeValue: String) {
    cdkBuilder.attributeValue(attributeValue)
  }

  public fun build(): CfnDeliveryStream.HttpEndpointCommonAttributeProperty = cdkBuilder.build()
}
