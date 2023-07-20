@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

@CdkDslMarker
public class CfnScheduledQueryS3ConfigurationPropertyDsl {
  private val cdkBuilder: CfnScheduledQuery.S3ConfigurationProperty.Builder =
      CfnScheduledQuery.S3ConfigurationProperty.builder()

  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  public fun encryptionOption(encryptionOption: String) {
    cdkBuilder.encryptionOption(encryptionOption)
  }

  public fun objectKeyPrefix(objectKeyPrefix: String) {
    cdkBuilder.objectKeyPrefix(objectKeyPrefix)
  }

  public fun build(): CfnScheduledQuery.S3ConfigurationProperty = cdkBuilder.build()
}
