@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupRateBasedStatementPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.RateBasedStatementProperty.Builder =
      CfnRuleGroup.RateBasedStatementProperty.builder()

  public fun aggregateKeyType(aggregateKeyType: String) {
    cdkBuilder.aggregateKeyType(aggregateKeyType)
  }

  public fun forwardedIpConfig(forwardedIpConfig: IResolvable) {
    cdkBuilder.forwardedIpConfig(forwardedIpConfig)
  }

  public fun forwardedIpConfig(forwardedIpConfig: CfnRuleGroup.ForwardedIPConfigurationProperty) {
    cdkBuilder.forwardedIpConfig(forwardedIpConfig)
  }

  public fun limit(limit: Number) {
    cdkBuilder.limit(limit)
  }

  public fun scopeDownStatement(scopeDownStatement: IResolvable) {
    cdkBuilder.scopeDownStatement(scopeDownStatement)
  }

  public fun scopeDownStatement(scopeDownStatement: CfnRuleGroup.StatementProperty) {
    cdkBuilder.scopeDownStatement(scopeDownStatement)
  }

  public fun build(): CfnRuleGroup.RateBasedStatementProperty = cdkBuilder.build()
}
