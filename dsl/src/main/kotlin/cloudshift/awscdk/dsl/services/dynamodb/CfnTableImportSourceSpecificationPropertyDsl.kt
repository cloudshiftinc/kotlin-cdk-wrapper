@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnTable

@CdkDslMarker
public class CfnTableImportSourceSpecificationPropertyDsl {
  private val cdkBuilder: CfnTable.ImportSourceSpecificationProperty.Builder =
      CfnTable.ImportSourceSpecificationProperty.builder()

  /**
   * @param inputCompressionType Type of compression to be used on the input coming from the
   * imported table.
   */
  public fun inputCompressionType(inputCompressionType: String) {
    cdkBuilder.inputCompressionType(inputCompressionType)
  }

  /**
   * @param inputFormat The format of the source data. 
   * Valid values for `ImportFormat` are `CSV` , `DYNAMODB_JSON` or `ION` .
   */
  public fun inputFormat(inputFormat: String) {
    cdkBuilder.inputFormat(inputFormat)
  }

  /**
   * @param inputFormatOptions Additional properties that specify how the input is formatted,.
   */
  public fun inputFormatOptions(inputFormatOptions: IResolvable) {
    cdkBuilder.inputFormatOptions(inputFormatOptions)
  }

  /**
   * @param inputFormatOptions Additional properties that specify how the input is formatted,.
   */
  public fun inputFormatOptions(inputFormatOptions: CfnTable.InputFormatOptionsProperty) {
    cdkBuilder.inputFormatOptions(inputFormatOptions)
  }

  /**
   * @param s3BucketSource The S3 bucket that provides the source for the import. 
   */
  public fun s3BucketSource(s3BucketSource: IResolvable) {
    cdkBuilder.s3BucketSource(s3BucketSource)
  }

  /**
   * @param s3BucketSource The S3 bucket that provides the source for the import. 
   */
  public fun s3BucketSource(s3BucketSource: CfnTable.S3BucketSourceProperty) {
    cdkBuilder.s3BucketSource(s3BucketSource)
  }

  public fun build(): CfnTable.ImportSourceSpecificationProperty = cdkBuilder.build()
}
