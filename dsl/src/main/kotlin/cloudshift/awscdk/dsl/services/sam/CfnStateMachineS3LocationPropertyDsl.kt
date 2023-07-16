@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.sam.CfnStateMachine

@CdkDslMarker
public class CfnStateMachineS3LocationPropertyDsl {
  private val cdkBuilder: CfnStateMachine.S3LocationProperty.Builder =
      CfnStateMachine.S3LocationProperty.builder()

  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun version(version: Number) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnStateMachine.S3LocationProperty = cdkBuilder.build()
}
