@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine

/**
 * Defines the S3 bucket location where a state machine definition is stored.
 *
 * The state machine definition must be a JSON or YAML file.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.*;
 * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * // the properties below are optional
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-s3location.html)
 */
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
