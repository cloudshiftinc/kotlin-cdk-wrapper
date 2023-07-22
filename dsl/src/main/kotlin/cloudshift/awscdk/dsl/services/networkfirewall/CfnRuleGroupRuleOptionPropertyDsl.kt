@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupRuleOptionPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.RuleOptionProperty.Builder =
      CfnRuleGroup.RuleOptionProperty.builder()

  private val _settings: MutableList<String> = mutableListOf()

  /**
   * @param keyword The Suricata rule option keywords. 
   * For Network Firewall , the keyword signature ID (sid) is required in the format `sid: 112233` .
   * The sid must be unique within the rule group. For information about Suricata rule option keywords,
   * see [Rule
   * options](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html#rule-options)
   * .
   */
  public fun keyword(keyword: String) {
    cdkBuilder.keyword(keyword)
  }

  /**
   * @param settings The Suricata rule option settings.
   * Settings have zero or more values, and the number of possible settings and required settings
   * depends on the keyword. The format for Settings is `number` . For information about Suricata rule
   * option settings, see [Rule
   * options](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html#rule-options)
   * .
   */
  public fun settings(vararg settings: String) {
    _settings.addAll(listOf(*settings))
  }

  /**
   * @param settings The Suricata rule option settings.
   * Settings have zero or more values, and the number of possible settings and required settings
   * depends on the keyword. The format for Settings is `number` . For information about Suricata rule
   * option settings, see [Rule
   * options](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html#rule-options)
   * .
   */
  public fun settings(settings: Collection<String>) {
    _settings.addAll(settings)
  }

  public fun build(): CfnRuleGroup.RuleOptionProperty {
    if(_settings.isNotEmpty()) cdkBuilder.settings(_settings)
    return cdkBuilder.build()
  }
}
