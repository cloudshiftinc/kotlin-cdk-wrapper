@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.evidently.CfnLaunch

@CdkDslMarker
public class CfnLaunchExecutionStatusObjectPropertyDsl {
  private val cdkBuilder: CfnLaunch.ExecutionStatusObjectProperty.Builder =
      CfnLaunch.ExecutionStatusObjectProperty.builder()

  public fun desiredState(desiredState: String) {
    cdkBuilder.desiredState(desiredState)
  }

  public fun reason(reason: String) {
    cdkBuilder.reason(reason)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnLaunch.ExecutionStatusObjectProperty = cdkBuilder.build()
}
