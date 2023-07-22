@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.robomaker.CfnRobotApplication

@CdkDslMarker
public class CfnRobotApplicationSourceConfigPropertyDsl {
  private val cdkBuilder: CfnRobotApplication.SourceConfigProperty.Builder =
      CfnRobotApplication.SourceConfigProperty.builder()

  /**
   * @param architecture The target processor architecture for the application. 
   */
  public fun architecture(architecture: String) {
    cdkBuilder.architecture(architecture)
  }

  /**
   * @param s3Bucket The Amazon S3 bucket name. 
   */
  public fun s3Bucket(s3Bucket: String) {
    cdkBuilder.s3Bucket(s3Bucket)
  }

  /**
   * @param s3Key The s3 object key. 
   */
  public fun s3Key(s3Key: String) {
    cdkBuilder.s3Key(s3Key)
  }

  public fun build(): CfnRobotApplication.SourceConfigProperty = cdkBuilder.build()
}
