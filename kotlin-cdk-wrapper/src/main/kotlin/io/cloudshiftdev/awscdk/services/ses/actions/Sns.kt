@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ses.IReceiptRule
import io.cloudshiftdev.awscdk.services.ses.IReceiptRuleAction
import io.cloudshiftdev.awscdk.services.ses.ReceiptRuleActionConfig
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Unit

public open class Sns internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ses.actions.Sns,
) : CdkObject(cdkObject), IReceiptRuleAction {
  public override fun bind(_rule: IReceiptRule): ReceiptRuleActionConfig =
      unwrap(this).bind(_rule.let(IReceiptRule::unwrap)).let(ReceiptRuleActionConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun encoding(encoding: EmailEncoding)

    public fun topic(topic: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.Sns.Builder =
        software.amazon.awscdk.services.ses.actions.Sns.Builder.create()

    override fun encoding(encoding: EmailEncoding) {
      cdkBuilder.encoding(encoding.let(EmailEncoding::unwrap))
    }

    override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.actions.Sns = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Sns {
      val builderImpl = BuilderImpl()
      return Sns(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.actions.Sns): Sns =
        Sns(cdkObject)

    internal fun unwrap(wrapped: Sns): software.amazon.awscdk.services.ses.actions.Sns =
        wrapped.cdkObject
  }
}
