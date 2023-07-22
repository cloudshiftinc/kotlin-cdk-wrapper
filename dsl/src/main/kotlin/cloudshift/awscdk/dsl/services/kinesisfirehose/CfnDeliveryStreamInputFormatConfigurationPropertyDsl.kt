@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamInputFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.InputFormatConfigurationProperty.Builder =
      CfnDeliveryStream.InputFormatConfigurationProperty.builder()

  /**
   * @param deserializer Specifies which deserializer to use.
   * You can choose either the Apache Hive JSON SerDe or the OpenX JSON SerDe. If both are non-null,
   * the server rejects the request.
   */
  public fun deserializer(deserializer: IResolvable) {
    cdkBuilder.deserializer(deserializer)
  }

  /**
   * @param deserializer Specifies which deserializer to use.
   * You can choose either the Apache Hive JSON SerDe or the OpenX JSON SerDe. If both are non-null,
   * the server rejects the request.
   */
  public fun deserializer(deserializer: CfnDeliveryStream.DeserializerProperty) {
    cdkBuilder.deserializer(deserializer)
  }

  public fun build(): CfnDeliveryStream.InputFormatConfigurationProperty = cdkBuilder.build()
}
