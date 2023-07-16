@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamSerializerPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.SerializerProperty.Builder =
      CfnDeliveryStream.SerializerProperty.builder()

  public fun orcSerDe(orcSerDe: IResolvable) {
    cdkBuilder.orcSerDe(orcSerDe)
  }

  public fun orcSerDe(orcSerDe: CfnDeliveryStream.OrcSerDeProperty) {
    cdkBuilder.orcSerDe(orcSerDe)
  }

  public fun parquetSerDe(parquetSerDe: IResolvable) {
    cdkBuilder.parquetSerDe(parquetSerDe)
  }

  public fun parquetSerDe(parquetSerDe: CfnDeliveryStream.ParquetSerDeProperty) {
    cdkBuilder.parquetSerDe(parquetSerDe)
  }

  public fun build(): CfnDeliveryStream.SerializerProperty = cdkBuilder.build()
}
