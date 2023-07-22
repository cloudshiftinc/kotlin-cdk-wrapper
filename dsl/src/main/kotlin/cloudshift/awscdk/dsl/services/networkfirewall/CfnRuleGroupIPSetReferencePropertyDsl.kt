@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupIPSetReferencePropertyDsl {
  private val cdkBuilder: CfnRuleGroup.IPSetReferenceProperty.Builder =
      CfnRuleGroup.IPSetReferenceProperty.builder()

  /**
   * @param referenceArn The Amazon Resource Name (ARN) of the resource to include in the
   * `RuleGroup.IPSetReference` .
   */
  public fun referenceArn(referenceArn: String) {
    cdkBuilder.referenceArn(referenceArn)
  }

  public fun build(): CfnRuleGroup.IPSetReferenceProperty = cdkBuilder.build()
}
