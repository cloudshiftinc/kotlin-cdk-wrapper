@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupIPSetReferenceStatementPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.IPSetReferenceStatementProperty.Builder =
      CfnRuleGroup.IPSetReferenceStatementProperty.builder()

  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun ipSetForwardedIpConfig(ipSetForwardedIpConfig: IResolvable) {
    cdkBuilder.ipSetForwardedIpConfig(ipSetForwardedIpConfig)
  }

  public
      fun ipSetForwardedIpConfig(ipSetForwardedIpConfig: CfnRuleGroup.IPSetForwardedIPConfigurationProperty) {
    cdkBuilder.ipSetForwardedIpConfig(ipSetForwardedIpConfig)
  }

  public fun build(): CfnRuleGroup.IPSetReferenceStatementProperty = cdkBuilder.build()
}
