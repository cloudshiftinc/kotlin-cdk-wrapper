@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketServerSideEncryptionByDefaultPropertyDsl {
  private val cdkBuilder: CfnBucket.ServerSideEncryptionByDefaultProperty.Builder =
      CfnBucket.ServerSideEncryptionByDefaultProperty.builder()

  public fun kmsMasterKeyId(kmsMasterKeyId: String) {
    cdkBuilder.kmsMasterKeyId(kmsMasterKeyId)
  }

  public fun sseAlgorithm(sseAlgorithm: String) {
    cdkBuilder.sseAlgorithm(sseAlgorithm)
  }

  public fun build(): CfnBucket.ServerSideEncryptionByDefaultProperty = cdkBuilder.build()
}
