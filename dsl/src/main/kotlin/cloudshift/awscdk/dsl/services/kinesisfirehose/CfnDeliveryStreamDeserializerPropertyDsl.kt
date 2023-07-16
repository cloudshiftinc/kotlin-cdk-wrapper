@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamDeserializerPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.DeserializerProperty.Builder =
      CfnDeliveryStream.DeserializerProperty.builder()

  public fun hiveJsonSerDe(hiveJsonSerDe: IResolvable) {
    cdkBuilder.hiveJsonSerDe(hiveJsonSerDe)
  }

  public fun hiveJsonSerDe(hiveJsonSerDe: CfnDeliveryStream.HiveJsonSerDeProperty) {
    cdkBuilder.hiveJsonSerDe(hiveJsonSerDe)
  }

  public fun openXJsonSerDe(openXJsonSerDe: IResolvable) {
    cdkBuilder.openXJsonSerDe(openXJsonSerDe)
  }

  public fun openXJsonSerDe(openXJsonSerDe: CfnDeliveryStream.OpenXJsonSerDeProperty) {
    cdkBuilder.openXJsonSerDe(openXJsonSerDe)
  }

  public fun build(): CfnDeliveryStream.DeserializerProperty = cdkBuilder.build()
}
