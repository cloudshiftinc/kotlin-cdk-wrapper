@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * A serializer to use for converting data to the Parquet format before storing it in Amazon S3.
 *
 * For more information, see [Apache
 * Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/documentation/latest/) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * ParquetSerDeProperty parquetSerDeProperty = ParquetSerDeProperty.builder()
 * .blockSizeBytes(123)
 * .compression("compression")
 * .enableDictionaryCompression(false)
 * .maxPaddingBytes(123)
 * .pageSizeBytes(123)
 * .writerVersion("writerVersion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-parquetserde.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamParquetSerDePropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.ParquetSerDeProperty.Builder =
      CfnDeliveryStream.ParquetSerDeProperty.builder()

  /**
   * @param blockSizeBytes The Hadoop Distributed File System (HDFS) block size.
   * This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The
   * default is 256 MiB and the minimum is 64 MiB. Kinesis Data Firehose uses this value for padding
   * calculations.
   */
  public fun blockSizeBytes(blockSizeBytes: Number) {
    cdkBuilder.blockSizeBytes(blockSizeBytes)
  }

  /**
   * @param compression The compression code to use over data blocks.
   * The possible values are `UNCOMPRESSED` , `SNAPPY` , and `GZIP` , with the default being
   * `SNAPPY` . Use `SNAPPY` for higher decompression speed. Use `GZIP` if the compression ratio is
   * more important than speed.
   */
  public fun compression(compression: String) {
    cdkBuilder.compression(compression)
  }

  /**
   * @param enableDictionaryCompression Indicates whether to enable dictionary compression.
   */
  public fun enableDictionaryCompression(enableDictionaryCompression: Boolean) {
    cdkBuilder.enableDictionaryCompression(enableDictionaryCompression)
  }

  /**
   * @param enableDictionaryCompression Indicates whether to enable dictionary compression.
   */
  public fun enableDictionaryCompression(enableDictionaryCompression: IResolvable) {
    cdkBuilder.enableDictionaryCompression(enableDictionaryCompression)
  }

  /**
   * @param maxPaddingBytes The maximum amount of padding to apply.
   * This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The
   * default is 0.
   */
  public fun maxPaddingBytes(maxPaddingBytes: Number) {
    cdkBuilder.maxPaddingBytes(maxPaddingBytes)
  }

  /**
   * @param pageSizeBytes The Parquet page size.
   * Column chunks are divided into pages. A page is conceptually an indivisible unit (in terms of
   * compression and encoding). The minimum value is 64 KiB and the default is 1 MiB.
   */
  public fun pageSizeBytes(pageSizeBytes: Number) {
    cdkBuilder.pageSizeBytes(pageSizeBytes)
  }

  /**
   * @param writerVersion Indicates the version of row format to output.
   * The possible values are `V1` and `V2` . The default is `V1` .
   */
  public fun writerVersion(writerVersion: String) {
    cdkBuilder.writerVersion(writerVersion)
  }

  public fun build(): CfnDeliveryStream.ParquetSerDeProperty = cdkBuilder.build()
}
