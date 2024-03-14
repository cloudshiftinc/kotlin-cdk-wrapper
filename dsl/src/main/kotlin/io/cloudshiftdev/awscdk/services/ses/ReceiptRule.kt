package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.Resource
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ReceiptRule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ses.ReceiptRule,
) : Resource(cdkObject), IReceiptRule {
  public open fun addAction(action: IReceiptRuleAction) {
    unwrap(this).addAction(action.let(IReceiptRuleAction::unwrap))
  }

  public override fun receiptRuleName(): String = unwrap(this).getReceiptRuleName()

  public interface Builder {
    public fun actions(actions: List<IReceiptRuleAction>)

    public fun after(after: IReceiptRule)

    public fun enabled(enabled: Boolean)

    public fun receiptRuleName(receiptRuleName: String)

    public fun recipients(recipients: List<String>)

    public fun ruleSet(ruleSet: IReceiptRuleSet)

    public fun scanEnabled(scanEnabled: Boolean)

    public fun tlsPolicy(tlsPolicy: TlsPolicy)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.ReceiptRule.Builder =
        software.amazon.awscdk.services.ses.ReceiptRule.Builder.create(scope, id)

    override fun actions(actions: List<IReceiptRuleAction>) {
      cdkBuilder.actions(actions.map(IReceiptRuleAction::unwrap))
    }

    override fun after(after: IReceiptRule) {
      cdkBuilder.after(after.let(IReceiptRule::unwrap))
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun receiptRuleName(receiptRuleName: String) {
      cdkBuilder.receiptRuleName(receiptRuleName)
    }

    override fun recipients(recipients: List<String>) {
      cdkBuilder.recipients(recipients)
    }

    override fun ruleSet(ruleSet: IReceiptRuleSet) {
      cdkBuilder.ruleSet(ruleSet.let(IReceiptRuleSet::unwrap))
    }

    override fun scanEnabled(scanEnabled: Boolean) {
      cdkBuilder.scanEnabled(scanEnabled)
    }

    override fun tlsPolicy(tlsPolicy: TlsPolicy) {
      cdkBuilder.tlsPolicy(tlsPolicy.let(TlsPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.ReceiptRule = cdkBuilder.build()
  }

  public companion object {
    public open fun fromReceiptRuleName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      receiptRuleName: String,
    ): IReceiptRule =
        software.amazon.awscdk.services.ses.ReceiptRule.fromReceiptRuleName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, receiptRuleName).let(IReceiptRule::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ReceiptRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ReceiptRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.ReceiptRule): ReceiptRule =
        ReceiptRule(cdkObject)

    internal fun unwrap(wrapped: ReceiptRule): software.amazon.awscdk.services.ses.ReceiptRule =
        wrapped.cdkObject
  }
}
