@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamParquetSerDePropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.ParquetSerDeProperty.Builder =
      CfnDeliveryStream.ParquetSerDeProperty.builder()

  public fun blockSizeBytes(blockSizeBytes: Number) {
    cdkBuilder.blockSizeBytes(blockSizeBytes)
  }

  public fun compression(compression: String) {
    cdkBuilder.compression(compression)
  }

  public fun enableDictionaryCompression(enableDictionaryCompression: Boolean) {
    cdkBuilder.enableDictionaryCompression(enableDictionaryCompression)
  }

  public fun enableDictionaryCompression(enableDictionaryCompression: IResolvable) {
    cdkBuilder.enableDictionaryCompression(enableDictionaryCompression)
  }

  public fun maxPaddingBytes(maxPaddingBytes: Number) {
    cdkBuilder.maxPaddingBytes(maxPaddingBytes)
  }

  public fun pageSizeBytes(pageSizeBytes: Number) {
    cdkBuilder.pageSizeBytes(pageSizeBytes)
  }

  public fun writerVersion(writerVersion: String) {
    cdkBuilder.writerVersion(writerVersion)
  }

  public fun build(): CfnDeliveryStream.ParquetSerDeProperty = cdkBuilder.build()
}
