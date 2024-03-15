@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ses.IReceiptRule
import io.cloudshiftdev.awscdk.services.ses.IReceiptRuleAction
import io.cloudshiftdev.awscdk.services.ses.ReceiptRuleActionConfig
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public open class Bounce internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ses.actions.Bounce,
) : CdkObject(cdkObject), IReceiptRuleAction {
  public override fun bind(_rule: IReceiptRule): ReceiptRuleActionConfig =
      unwrap(this).bind(_rule.let(IReceiptRule::unwrap)).let(ReceiptRuleActionConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun sender(sender: String)

    public fun template(template: BounceTemplate)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01c5c274363373a138b9e6be078a174b21734665aa6da0a46e552d7ebb47c626")
    public fun template(template: BounceTemplate.Builder.() -> Unit)

    public fun topic(topic: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.Bounce.Builder =
        software.amazon.awscdk.services.ses.actions.Bounce.Builder.create()

    override fun sender(sender: String) {
      cdkBuilder.sender(sender)
    }

    override fun template(template: BounceTemplate) {
      cdkBuilder.template(template.let(BounceTemplate::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01c5c274363373a138b9e6be078a174b21734665aa6da0a46e552d7ebb47c626")
    override fun template(template: BounceTemplate.Builder.() -> Unit): Unit =
        template(BounceTemplate(template))

    override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.actions.Bounce = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Bounce {
      val builderImpl = BuilderImpl()
      return Bounce(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.actions.Bounce): Bounce =
        Bounce(cdkObject)

    internal fun unwrap(wrapped: Bounce): software.amazon.awscdk.services.ses.actions.Bounce =
        wrapped.cdkObject
  }
}
