@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnConfigurationSet

@CdkDslMarker
public class CfnConfigurationSetGuardianOptionsPropertyDsl {
  private val cdkBuilder: CfnConfigurationSet.GuardianOptionsProperty.Builder =
      CfnConfigurationSet.GuardianOptionsProperty.builder()

  public fun optimizedSharedDelivery(optimizedSharedDelivery: String) {
    cdkBuilder.optimizedSharedDelivery(optimizedSharedDelivery)
  }

  public fun build(): CfnConfigurationSet.GuardianOptionsProperty = cdkBuilder.build()
}
