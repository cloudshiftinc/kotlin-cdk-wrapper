@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cloudassembly.schema.FileDestination

@CdkDslMarker
public class FileDestinationDsl {
  private val cdkBuilder: FileDestination.Builder = FileDestination.builder()

  /**
   * @param assumeRoleArn The role that needs to be assumed while publishing this asset.
   */
  public fun assumeRoleArn(assumeRoleArn: String) {
    cdkBuilder.assumeRoleArn(assumeRoleArn)
  }

  /**
   * @param assumeRoleExternalId The ExternalId that needs to be supplied while assuming this role.
   */
  public fun assumeRoleExternalId(assumeRoleExternalId: String) {
    cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
  }

  /**
   * @param bucketName The name of the bucket. 
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  /**
   * @param objectKey The destination object key. 
   */
  public fun objectKey(objectKey: String) {
    cdkBuilder.objectKey(objectKey)
  }

  /**
   * @param region The region where this asset will need to be published.
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun build(): FileDestination = cdkBuilder.build()
}
