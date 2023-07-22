@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.timestream.CfnTable

@CdkDslMarker
public class CfnTableMagneticStoreRejectedDataLocationPropertyDsl {
  private val cdkBuilder: CfnTable.MagneticStoreRejectedDataLocationProperty.Builder =
      CfnTable.MagneticStoreRejectedDataLocationProperty.builder()

  /**
   * @param s3Configuration Configuration of an S3 location to write error reports for records
   * rejected, asynchronously, during magnetic store writes.
   */
  public fun s3Configuration(s3Configuration: IResolvable) {
    cdkBuilder.s3Configuration(s3Configuration)
  }

  /**
   * @param s3Configuration Configuration of an S3 location to write error reports for records
   * rejected, asynchronously, during magnetic store writes.
   */
  public fun s3Configuration(s3Configuration: CfnTable.S3ConfigurationProperty) {
    cdkBuilder.s3Configuration(s3Configuration)
  }

  public fun build(): CfnTable.MagneticStoreRejectedDataLocationProperty = cdkBuilder.build()
}
