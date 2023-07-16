@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ses.DropSpamReceiptRule
import software.amazon.awscdk.services.ses.IReceiptRule
import software.amazon.awscdk.services.ses.IReceiptRuleAction
import software.amazon.awscdk.services.ses.IReceiptRuleSet
import software.amazon.awscdk.services.ses.TlsPolicy
import software.constructs.Construct

@CdkDslMarker
public class DropSpamReceiptRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: DropSpamReceiptRule.Builder = DropSpamReceiptRule.Builder.create(scope,
      id)

  private val _actions: MutableList<IReceiptRuleAction> = mutableListOf()

  private val _recipients: MutableList<String> = mutableListOf()

  public fun actions(vararg actions: IReceiptRuleAction) {
    _actions.addAll(listOf(*actions))
  }

  public fun actions(actions: Collection<IReceiptRuleAction>) {
    _actions.addAll(actions)
  }

  public fun after(after: IReceiptRule) {
    cdkBuilder.after(after)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun receiptRuleName(receiptRuleName: String) {
    cdkBuilder.receiptRuleName(receiptRuleName)
  }

  public fun recipients(vararg recipients: String) {
    _recipients.addAll(listOf(*recipients))
  }

  public fun recipients(recipients: Collection<String>) {
    _recipients.addAll(recipients)
  }

  public fun ruleSet(ruleSet: IReceiptRuleSet) {
    cdkBuilder.ruleSet(ruleSet)
  }

  public fun scanEnabled(scanEnabled: Boolean) {
    cdkBuilder.scanEnabled(scanEnabled)
  }

  public fun tlsPolicy(tlsPolicy: TlsPolicy) {
    cdkBuilder.tlsPolicy(tlsPolicy)
  }

  public fun build(): DropSpamReceiptRule {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    if(_recipients.isNotEmpty()) cdkBuilder.recipients(_recipients)
    return cdkBuilder.build()
  }
}
