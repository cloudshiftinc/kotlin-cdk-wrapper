@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.timestream.CfnTable

@CdkDslMarker
public class CfnTableS3ConfigurationPropertyDsl {
  private val cdkBuilder: CfnTable.S3ConfigurationProperty.Builder =
      CfnTable.S3ConfigurationProperty.builder()

  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  public fun encryptionOption(encryptionOption: String) {
    cdkBuilder.encryptionOption(encryptionOption)
  }

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun objectKeyPrefix(objectKeyPrefix: String) {
    cdkBuilder.objectKeyPrefix(objectKeyPrefix)
  }

  public fun build(): CfnTable.S3ConfigurationProperty = cdkBuilder.build()
}
