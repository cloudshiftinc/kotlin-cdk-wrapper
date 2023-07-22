@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotfleetwise.CfnCampaign

@CdkDslMarker
public class CfnCampaignS3ConfigPropertyDsl {
  private val cdkBuilder: CfnCampaign.S3ConfigProperty.Builder =
      CfnCampaign.S3ConfigProperty.builder()

  /**
   * @param bucketArn The Amazon Resource Name (ARN) of the Amazon S3 bucket. 
   */
  public fun bucketArn(bucketArn: String) {
    cdkBuilder.bucketArn(bucketArn)
  }

  /**
   * @param dataFormat (Optional) Specify the format that files are saved in the Amazon S3 bucket.
   * You can save files in an Apache Parquet or JSON format.
   *
   * * Parquet - Store data in a columnar storage file format. Parquet is optimal for fast data
   * retrieval and can reduce costs. This option is selected by default.
   * * JSON - Store data in a standard text-based JSON file format.
   */
  public fun dataFormat(dataFormat: String) {
    cdkBuilder.dataFormat(dataFormat)
  }

  /**
   * @param prefix (Optional) Enter an S3 bucket prefix.
   * The prefix is the string of characters after the bucket name and before the object name. You
   * can use the prefix to organize data stored in Amazon S3 buckets. For more information, see
   * [Organizing objects using
   * prefixes](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html) in the
   * *Amazon Simple Storage Service User Guide* .
   *
   * By default, AWS IoT FleetWise sets the prefix
   * `processed-data/year=YY/month=MM/date=DD/hour=HH/` (in UTC) to data it delivers to Amazon S3 . You
   * can enter a prefix to append it to this default prefix. For example, if you enter the prefix
   * `vehicles` , the prefix will be `vehicles/processed-data/year=YY/month=MM/date=DD/hour=HH/` .
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  /**
   * @param storageCompressionFormat (Optional) By default, stored data is compressed as a .gzip
   * file. Compressed files have a reduced file size, which can optimize the cost of data storage.
   */
  public fun storageCompressionFormat(storageCompressionFormat: String) {
    cdkBuilder.storageCompressionFormat(storageCompressionFormat)
  }

  public fun build(): CfnCampaign.S3ConfigProperty = cdkBuilder.build()
}
