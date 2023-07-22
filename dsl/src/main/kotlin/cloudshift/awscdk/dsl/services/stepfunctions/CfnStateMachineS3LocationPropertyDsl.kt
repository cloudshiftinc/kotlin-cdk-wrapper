@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine

@CdkDslMarker
public class CfnStateMachineS3LocationPropertyDsl {
  private val cdkBuilder: CfnStateMachine.S3LocationProperty.Builder =
      CfnStateMachine.S3LocationProperty.builder()

  /**
   * @param bucket The name of the S3 bucket where the state machine definition JSON or YAML file is
   * stored. 
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param key The name of the state machine definition file (Amazon S3 object name). 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param version For versioning-enabled buckets, a specific version of the state machine
   * definition.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnStateMachine.S3LocationProperty = cdkBuilder.build()
}
