@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamInputFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.InputFormatConfigurationProperty.Builder =
      CfnDeliveryStream.InputFormatConfigurationProperty.builder()

  public fun deserializer(deserializer: IResolvable) {
    cdkBuilder.deserializer(deserializer)
  }

  public fun deserializer(deserializer: CfnDeliveryStream.DeserializerProperty) {
    cdkBuilder.deserializer(deserializer)
  }

  public fun build(): CfnDeliveryStream.InputFormatConfigurationProperty = cdkBuilder.build()
}
