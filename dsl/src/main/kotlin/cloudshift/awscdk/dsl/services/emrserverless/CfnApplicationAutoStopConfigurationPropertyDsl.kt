@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrserverless.CfnApplication

@CdkDslMarker
public class CfnApplicationAutoStopConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplication.AutoStopConfigurationProperty.Builder =
      CfnApplication.AutoStopConfigurationProperty.builder()

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun idleTimeoutMinutes(idleTimeoutMinutes: Number) {
    cdkBuilder.idleTimeoutMinutes(idleTimeoutMinutes)
  }

  public fun build(): CfnApplication.AutoStopConfigurationProperty = cdkBuilder.build()
}
