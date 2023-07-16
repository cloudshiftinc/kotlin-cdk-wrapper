@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnReceiptRule

@CdkDslMarker
public class CfnReceiptRuleRulePropertyDsl {
  private val cdkBuilder: CfnReceiptRule.RuleProperty.Builder =
      CfnReceiptRule.RuleProperty.builder()

  private val _actions: MutableList<Any> = mutableListOf()

  private val _recipients: MutableList<String> = mutableListOf()

  public fun actions(vararg actions: Any) {
    _actions.addAll(listOf(*actions))
  }

  public fun actions(actions: Collection<Any>) {
    _actions.addAll(actions)
  }

  public fun actions(actions: IResolvable) {
    cdkBuilder.actions(actions)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun recipients(vararg recipients: String) {
    _recipients.addAll(listOf(*recipients))
  }

  public fun recipients(recipients: Collection<String>) {
    _recipients.addAll(recipients)
  }

  public fun scanEnabled(scanEnabled: Boolean) {
    cdkBuilder.scanEnabled(scanEnabled)
  }

  public fun scanEnabled(scanEnabled: IResolvable) {
    cdkBuilder.scanEnabled(scanEnabled)
  }

  public fun tlsPolicy(tlsPolicy: String) {
    cdkBuilder.tlsPolicy(tlsPolicy)
  }

  public fun build(): CfnReceiptRule.RuleProperty {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    if(_recipients.isNotEmpty()) cdkBuilder.recipients(_recipients)
    return cdkBuilder.build()
  }
}
