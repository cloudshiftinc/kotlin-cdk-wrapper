@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionTimeoutPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.TimeoutProperty.Builder =
      CfnJobDefinition.TimeoutProperty.builder()

  public fun attemptDurationSeconds(attemptDurationSeconds: Number) {
    cdkBuilder.attemptDurationSeconds(attemptDurationSeconds)
  }

  public fun build(): CfnJobDefinition.TimeoutProperty = cdkBuilder.build()
}
