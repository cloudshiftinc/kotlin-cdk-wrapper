@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamDeserializerPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.DeserializerProperty.Builder =
      CfnDeliveryStream.DeserializerProperty.builder()

  /**
   * @param hiveJsonSerDe The native Hive / HCatalog JsonSerDe.
   * Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON
   * format in preparation for serializing it to the Parquet or ORC format. This is one of two
   * deserializers you can choose, depending on which one offers the functionality you need. The other
   * option is the OpenX SerDe.
   */
  public fun hiveJsonSerDe(hiveJsonSerDe: IResolvable) {
    cdkBuilder.hiveJsonSerDe(hiveJsonSerDe)
  }

  /**
   * @param hiveJsonSerDe The native Hive / HCatalog JsonSerDe.
   * Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON
   * format in preparation for serializing it to the Parquet or ORC format. This is one of two
   * deserializers you can choose, depending on which one offers the functionality you need. The other
   * option is the OpenX SerDe.
   */
  public fun hiveJsonSerDe(hiveJsonSerDe: CfnDeliveryStream.HiveJsonSerDeProperty) {
    cdkBuilder.hiveJsonSerDe(hiveJsonSerDe)
  }

  /**
   * @param openXJsonSerDe The OpenX SerDe.
   * Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON
   * format in preparation for serializing it to the Parquet or ORC format. This is one of two
   * deserializers you can choose, depending on which one offers the functionality you need. The other
   * option is the native Hive / HCatalog JsonSerDe.
   */
  public fun openXJsonSerDe(openXJsonSerDe: IResolvable) {
    cdkBuilder.openXJsonSerDe(openXJsonSerDe)
  }

  /**
   * @param openXJsonSerDe The OpenX SerDe.
   * Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON
   * format in preparation for serializing it to the Parquet or ORC format. This is one of two
   * deserializers you can choose, depending on which one offers the functionality you need. The other
   * option is the native Hive / HCatalog JsonSerDe.
   */
  public fun openXJsonSerDe(openXJsonSerDe: CfnDeliveryStream.OpenXJsonSerDeProperty) {
    cdkBuilder.openXJsonSerDe(openXJsonSerDe)
  }

  public fun build(): CfnDeliveryStream.DeserializerProperty = cdkBuilder.build()
}
