@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnRule

@CdkDslMarker
public class CfnRuleReferencePropertyDsl {
  private val cdkBuilder: CfnRule.ReferenceProperty.Builder = CfnRule.ReferenceProperty.builder()

  /**
   * @param type The type of the reference. `DATE` must be of type Epoch timestamp. 
   * *Allowed values* : `URL` | `ATTACHMENT` | `NUMBER` | `STRING` | `DATE` | `EMAIL`
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param value A valid value for the reference. 
   * For example, for a URL reference, a formatted URL that is displayed to an agent in the Contact
   * Control Panel (CCP).
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnRule.ReferenceProperty = cdkBuilder.build()
}
