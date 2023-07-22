@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnEventBusPolicy

@CdkDslMarker
public class CfnEventBusPolicyConditionPropertyDsl {
  private val cdkBuilder: CfnEventBusPolicy.ConditionProperty.Builder =
      CfnEventBusPolicy.ConditionProperty.builder()

  /**
   * @param key Specifies the key for the condition.
   * Currently the only supported key is `aws:PrincipalOrgID` .
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param type Specifies the type of condition.
   * Currently the only supported value is `StringEquals` .
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param value Specifies the value for the key.
   * Currently, this must be the ID of the organization.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnEventBusPolicy.ConditionProperty = cdkBuilder.build()
}
