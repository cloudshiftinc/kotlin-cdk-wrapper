@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupGeoMatchStatementPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.GeoMatchStatementProperty.Builder =
      CfnRuleGroup.GeoMatchStatementProperty.builder()

  private val _countryCodes: MutableList<String> = mutableListOf()

  public fun countryCodes(vararg countryCodes: String) {
    _countryCodes.addAll(listOf(*countryCodes))
  }

  public fun countryCodes(countryCodes: Collection<String>) {
    _countryCodes.addAll(countryCodes)
  }

  public fun forwardedIpConfig(forwardedIpConfig: IResolvable) {
    cdkBuilder.forwardedIpConfig(forwardedIpConfig)
  }

  public fun forwardedIpConfig(forwardedIpConfig: CfnRuleGroup.ForwardedIPConfigurationProperty) {
    cdkBuilder.forwardedIpConfig(forwardedIpConfig)
  }

  public fun build(): CfnRuleGroup.GeoMatchStatementProperty {
    if(_countryCodes.isNotEmpty()) cdkBuilder.countryCodes(_countryCodes)
    return cdkBuilder.build()
  }
}
