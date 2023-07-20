@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnEventBusPolicy

@CdkDslMarker
public class CfnEventBusPolicyConditionPropertyDsl {
  private val cdkBuilder: CfnEventBusPolicy.ConditionProperty.Builder =
      CfnEventBusPolicy.ConditionProperty.builder()

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnEventBusPolicy.ConditionProperty = cdkBuilder.build()
}
