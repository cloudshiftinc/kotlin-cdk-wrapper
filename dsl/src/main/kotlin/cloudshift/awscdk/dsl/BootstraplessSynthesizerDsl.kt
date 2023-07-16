@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.BootstraplessSynthesizer

@CdkDslMarker
public class BootstraplessSynthesizerDsl {
  private val cdkBuilder: BootstraplessSynthesizer.Builder =
      BootstraplessSynthesizer.Builder.create()

  public fun cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn: String) {
    cdkBuilder.cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn)
  }

  public fun deployRoleArn(deployRoleArn: String) {
    cdkBuilder.deployRoleArn(deployRoleArn)
  }

  public fun build(): BootstraplessSynthesizer = cdkBuilder.build()
}
