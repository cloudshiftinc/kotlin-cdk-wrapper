@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamSerializerPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.SerializerProperty.Builder =
      CfnDeliveryStream.SerializerProperty.builder()

  /**
   * @param orcSerDe A serializer to use for converting data to the ORC format before storing it in
   * Amazon S3.
   * For more information, see [Apache
   * ORC](https://docs.aws.amazon.com/https://orc.apache.org/docs/) .
   */
  public fun orcSerDe(orcSerDe: IResolvable) {
    cdkBuilder.orcSerDe(orcSerDe)
  }

  /**
   * @param orcSerDe A serializer to use for converting data to the ORC format before storing it in
   * Amazon S3.
   * For more information, see [Apache
   * ORC](https://docs.aws.amazon.com/https://orc.apache.org/docs/) .
   */
  public fun orcSerDe(orcSerDe: CfnDeliveryStream.OrcSerDeProperty) {
    cdkBuilder.orcSerDe(orcSerDe)
  }

  /**
   * @param parquetSerDe A serializer to use for converting data to the Parquet format before
   * storing it in Amazon S3.
   * For more information, see [Apache
   * Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/documentation/latest/) .
   */
  public fun parquetSerDe(parquetSerDe: IResolvable) {
    cdkBuilder.parquetSerDe(parquetSerDe)
  }

  /**
   * @param parquetSerDe A serializer to use for converting data to the Parquet format before
   * storing it in Amazon S3.
   * For more information, see [Apache
   * Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/documentation/latest/) .
   */
  public fun parquetSerDe(parquetSerDe: CfnDeliveryStream.ParquetSerDeProperty) {
    cdkBuilder.parquetSerDe(parquetSerDe)
  }

  public fun build(): CfnDeliveryStream.SerializerProperty = cdkBuilder.build()
}
