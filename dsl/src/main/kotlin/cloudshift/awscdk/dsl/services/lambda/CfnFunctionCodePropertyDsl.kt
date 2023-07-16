@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnFunction

@CdkDslMarker
public class CfnFunctionCodePropertyDsl {
  private val cdkBuilder: CfnFunction.CodeProperty.Builder = CfnFunction.CodeProperty.builder()

  public fun imageUri(imageUri: String) {
    cdkBuilder.imageUri(imageUri)
  }

  public fun s3Bucket(s3Bucket: String) {
    cdkBuilder.s3Bucket(s3Bucket)
  }

  public fun s3Key(s3Key: String) {
    cdkBuilder.s3Key(s3Key)
  }

  public fun s3ObjectVersion(s3ObjectVersion: String) {
    cdkBuilder.s3ObjectVersion(s3ObjectVersion)
  }

  public fun zipFile(zipFile: String) {
    cdkBuilder.zipFile(zipFile)
  }

  public fun build(): CfnFunction.CodeProperty = cdkBuilder.build()
}
