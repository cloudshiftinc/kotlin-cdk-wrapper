@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ReceiptRuleSetProps {
  public fun dropSpam(): Boolean? = unwrap(this).getDropSpam()

  public fun receiptRuleSetName(): String? = unwrap(this).getReceiptRuleSetName()

  public fun rules(): List<ReceiptRuleOptions> =
      unwrap(this).getRules()?.map(ReceiptRuleOptions::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun dropSpam(dropSpam: Boolean)

    public fun receiptRuleSetName(receiptRuleSetName: String)

    public fun rules(rules: List<ReceiptRuleOptions>)

    public fun rules(vararg rules: ReceiptRuleOptions)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.ReceiptRuleSetProps.Builder =
        software.amazon.awscdk.services.ses.ReceiptRuleSetProps.builder()

    override fun dropSpam(dropSpam: Boolean) {
      cdkBuilder.dropSpam(dropSpam)
    }

    override fun receiptRuleSetName(receiptRuleSetName: String) {
      cdkBuilder.receiptRuleSetName(receiptRuleSetName)
    }

    override fun rules(rules: List<ReceiptRuleOptions>) {
      cdkBuilder.rules(rules.map(ReceiptRuleOptions::unwrap))
    }

    override fun rules(vararg rules: ReceiptRuleOptions): Unit = rules(rules.toList())

    public fun build(): software.amazon.awscdk.services.ses.ReceiptRuleSetProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.ReceiptRuleSetProps,
  ) : CdkObject(cdkObject), ReceiptRuleSetProps {
    override fun dropSpam(): Boolean? = unwrap(this).getDropSpam()

    override fun receiptRuleSetName(): String? = unwrap(this).getReceiptRuleSetName()

    override fun rules(): List<ReceiptRuleOptions> =
        unwrap(this).getRules()?.map(ReceiptRuleOptions::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ReceiptRuleSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.ReceiptRuleSetProps):
        ReceiptRuleSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ReceiptRuleSetProps):
        software.amazon.awscdk.services.ses.ReceiptRuleSetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ses.ReceiptRuleSetProps
  }
}
