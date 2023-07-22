@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.Location

@CdkDslMarker
public class LocationDsl {
  private val cdkBuilder: Location.Builder = Location.builder()

  /**
   * @param bucketName The name of the S3 Bucket the object is in. 
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  /**
   * @param objectKey The path inside the Bucket where the object is located at. 
   */
  public fun objectKey(objectKey: String) {
    cdkBuilder.objectKey(objectKey)
  }

  /**
   * @param objectVersion The S3 object version.
   */
  public fun objectVersion(objectVersion: String) {
    cdkBuilder.objectVersion(objectVersion)
  }

  public fun build(): Location = cdkBuilder.build()
}
