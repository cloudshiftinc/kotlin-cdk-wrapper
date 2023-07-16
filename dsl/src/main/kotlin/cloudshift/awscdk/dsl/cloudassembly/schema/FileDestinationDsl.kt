@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cloudassembly.schema.FileDestination

@CdkDslMarker
public class FileDestinationDsl {
  private val cdkBuilder: FileDestination.Builder = FileDestination.builder()

  public fun assumeRoleArn(assumeRoleArn: String) {
    cdkBuilder.assumeRoleArn(assumeRoleArn)
  }

  public fun assumeRoleExternalId(assumeRoleExternalId: String) {
    cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
  }

  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  public fun objectKey(objectKey: String) {
    cdkBuilder.objectKey(objectKey)
  }

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun build(): FileDestination = cdkBuilder.build()
}
