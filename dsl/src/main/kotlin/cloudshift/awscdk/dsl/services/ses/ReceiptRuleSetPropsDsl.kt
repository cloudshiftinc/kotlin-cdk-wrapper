@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ses.ReceiptRuleOptions
import software.amazon.awscdk.services.ses.ReceiptRuleSetProps

@CdkDslMarker
public class ReceiptRuleSetPropsDsl {
  private val cdkBuilder: ReceiptRuleSetProps.Builder = ReceiptRuleSetProps.builder()

  private val _rules: MutableList<ReceiptRuleOptions> = mutableListOf()

  /**
   * @param dropSpam Whether to add a first rule to stop processing messages that have at least one
   * spam indicator.
   */
  public fun dropSpam(dropSpam: Boolean) {
    cdkBuilder.dropSpam(dropSpam)
  }

  /**
   * @param receiptRuleSetName The name for the receipt rule set.
   */
  public fun receiptRuleSetName(receiptRuleSetName: String) {
    cdkBuilder.receiptRuleSetName(receiptRuleSetName)
  }

  /**
   * @param rules The list of rules to add to this rule set.
   * Rules are added in the same
   * order as they appear in the list.
   */
  public fun rules(rules: ReceiptRuleOptionsDsl.() -> Unit) {
    _rules.add(ReceiptRuleOptionsDsl().apply(rules).build())
  }

  /**
   * @param rules The list of rules to add to this rule set.
   * Rules are added in the same
   * order as they appear in the list.
   */
  public fun rules(rules: Collection<ReceiptRuleOptions>) {
    _rules.addAll(rules)
  }

  public fun build(): ReceiptRuleSetProps {
    if(_rules.isNotEmpty()) cdkBuilder.rules(_rules)
    return cdkBuilder.build()
  }
}
