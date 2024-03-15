@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ses.IReceiptRule
import io.cloudshiftdev.awscdk.services.ses.IReceiptRuleAction
import io.cloudshiftdev.awscdk.services.ses.ReceiptRuleActionConfig
import kotlin.String
import kotlin.Unit

public open class AddHeader internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ses.actions.AddHeader,
) : CdkObject(cdkObject), IReceiptRuleAction {
  public override fun bind(_rule: IReceiptRule): ReceiptRuleActionConfig =
      unwrap(this).bind(_rule.let(IReceiptRule::unwrap)).let(ReceiptRuleActionConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.AddHeader.Builder =
        software.amazon.awscdk.services.ses.actions.AddHeader.Builder.create()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.ses.actions.AddHeader = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddHeader {
      val builderImpl = BuilderImpl()
      return AddHeader(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.actions.AddHeader): AddHeader =
        AddHeader(cdkObject)

    internal fun unwrap(wrapped: AddHeader): software.amazon.awscdk.services.ses.actions.AddHeader =
        wrapped.cdkObject
  }
}
