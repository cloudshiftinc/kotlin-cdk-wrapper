@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration

@CdkDslMarker
public class CfnLoggingConfigurationActionConditionPropertyDsl {
  private val cdkBuilder: CfnLoggingConfiguration.ActionConditionProperty.Builder =
      CfnLoggingConfiguration.ActionConditionProperty.builder()

  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  public fun build(): CfnLoggingConfiguration.ActionConditionProperty = cdkBuilder.build()
}
