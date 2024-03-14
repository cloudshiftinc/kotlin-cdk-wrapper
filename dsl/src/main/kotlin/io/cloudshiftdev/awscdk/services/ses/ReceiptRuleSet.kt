package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.Resource
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ReceiptRuleSet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ses.ReceiptRuleSet,
) : Resource(cdkObject), IReceiptRuleSet {
  public override fun addRule(id: String): ReceiptRule =
      unwrap(this).addRule(id).let(ReceiptRule::wrap)

  public override fun addRule(id: String, options: ReceiptRuleOptions): ReceiptRule =
      unwrap(this).addRule(id, options.let(ReceiptRuleOptions::unwrap)).let(ReceiptRule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b9870cb7a366bfe448970b02b093ce946df61e1278e1b984e00908c5e1e1d5df")
  public override fun addRule(id: String, options: ReceiptRuleOptions.Builder.() -> Unit):
      ReceiptRule = addRule(id, ReceiptRuleOptions(options))

  public override fun receiptRuleSetName(): String = unwrap(this).getReceiptRuleSetName()

  public interface Builder {
    public fun dropSpam(dropSpam: Boolean)

    public fun receiptRuleSetName(receiptRuleSetName: String)

    public fun rules(rules: List<ReceiptRuleOptions>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.ReceiptRuleSet.Builder =
        software.amazon.awscdk.services.ses.ReceiptRuleSet.Builder.create(scope, id)

    override fun dropSpam(dropSpam: Boolean) {
      cdkBuilder.dropSpam(dropSpam)
    }

    override fun receiptRuleSetName(receiptRuleSetName: String) {
      cdkBuilder.receiptRuleSetName(receiptRuleSetName)
    }

    override fun rules(rules: List<ReceiptRuleOptions>) {
      cdkBuilder.rules(rules.map(ReceiptRuleOptions::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.ReceiptRuleSet = cdkBuilder.build()
  }

  public companion object {
    public open fun fromReceiptRuleSetName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      receiptRuleSetName: String,
    ): IReceiptRuleSet =
        software.amazon.awscdk.services.ses.ReceiptRuleSet.fromReceiptRuleSetName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, receiptRuleSetName).let(IReceiptRuleSet::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ReceiptRuleSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ReceiptRuleSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.ReceiptRuleSet): ReceiptRuleSet
        = ReceiptRuleSet(cdkObject)

    internal fun unwrap(wrapped: ReceiptRuleSet): software.amazon.awscdk.services.ses.ReceiptRuleSet
        = wrapped.cdkObject
  }
}
