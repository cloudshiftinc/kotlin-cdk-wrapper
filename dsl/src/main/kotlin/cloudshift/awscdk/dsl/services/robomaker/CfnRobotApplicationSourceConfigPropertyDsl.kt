@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.robomaker.CfnRobotApplication

@CdkDslMarker
public class CfnRobotApplicationSourceConfigPropertyDsl {
  private val cdkBuilder: CfnRobotApplication.SourceConfigProperty.Builder =
      CfnRobotApplication.SourceConfigProperty.builder()

  public fun architecture(architecture: String) {
    cdkBuilder.architecture(architecture)
  }

  public fun s3Bucket(s3Bucket: String) {
    cdkBuilder.s3Bucket(s3Bucket)
  }

  public fun s3Key(s3Key: String) {
    cdkBuilder.s3Key(s3Key)
  }

  public fun build(): CfnRobotApplication.SourceConfigProperty = cdkBuilder.build()
}
