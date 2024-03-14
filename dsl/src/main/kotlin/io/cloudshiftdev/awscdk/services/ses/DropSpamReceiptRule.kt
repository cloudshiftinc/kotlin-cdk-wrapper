package io.cloudshiftdev.awscdk.services.ses

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class DropSpamReceiptRule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ses.DropSpamReceiptRule,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public open fun rule(): ReceiptRule = unwrap(this).getRule().let(ReceiptRule::wrap)

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
    private val cdkBuilder: software.amazon.awscdk.services.ses.DropSpamReceiptRule.Builder =
        software.amazon.awscdk.services.ses.DropSpamReceiptRule.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.ses.DropSpamReceiptRule = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DropSpamReceiptRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DropSpamReceiptRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.DropSpamReceiptRule):
        DropSpamReceiptRule = DropSpamReceiptRule(cdkObject)

    internal fun unwrap(wrapped: DropSpamReceiptRule):
        software.amazon.awscdk.services.ses.DropSpamReceiptRule = wrapped.cdkObject
  }
}
