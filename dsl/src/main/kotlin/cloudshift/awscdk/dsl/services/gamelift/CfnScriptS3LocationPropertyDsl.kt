@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnScript

@CdkDslMarker
public class CfnScriptS3LocationPropertyDsl {
  private val cdkBuilder: CfnScript.S3LocationProperty.Builder =
      CfnScript.S3LocationProperty.builder()

  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun objectVersion(objectVersion: String) {
    cdkBuilder.objectVersion(objectVersion)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnScript.S3LocationProperty = cdkBuilder.build()
}
