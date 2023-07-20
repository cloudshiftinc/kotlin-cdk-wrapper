@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnRule

@CdkDslMarker
public class CfnRuleEventBridgeActionPropertyDsl {
  private val cdkBuilder: CfnRule.EventBridgeActionProperty.Builder =
      CfnRule.EventBridgeActionProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnRule.EventBridgeActionProperty = cdkBuilder.build()
}
