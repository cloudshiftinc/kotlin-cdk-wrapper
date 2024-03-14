package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ses.IReceiptRule
import io.cloudshiftdev.awscdk.services.ses.IReceiptRuleAction
import io.cloudshiftdev.awscdk.services.ses.ReceiptRuleActionConfig
import kotlin.String
import kotlin.Unit

public open class AddHeader internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ses.actions.AddHeader,
) : CdkObject(cdkObject), IReceiptRuleAction {
  /**
   * Returns the receipt rule action specification.
   *
   * @param _rule 
   */
  public override fun bind(_rule: IReceiptRule): ReceiptRuleActionConfig =
      unwrap(this).bind(_rule.let(IReceiptRule::unwrap)).let(ReceiptRuleActionConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.actions.AddHeader].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the header to add.
     *
     * Must be between 1 and 50 characters,
     * inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters
     * and dashes only.
     *
     * @param name The name of the header to add. 
     */
    public fun name(name: String)

    /**
     * The value of the header to add.
     *
     * Must be less than 2048 characters,
     * and must not contain newline characters ("\r" or "\n").
     *
     * @param value The value of the header to add. 
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.AddHeader.Builder =
        software.amazon.awscdk.services.ses.actions.AddHeader.Builder.create()

    /**
     * The name of the header to add.
     *
     * Must be between 1 and 50 characters,
     * inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters
     * and dashes only.
     *
     * @param name The name of the header to add. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The value of the header to add.
     *
     * Must be less than 2048 characters,
     * and must not contain newline characters ("\r" or "\n").
     *
     * @param value The value of the header to add. 
     */
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
