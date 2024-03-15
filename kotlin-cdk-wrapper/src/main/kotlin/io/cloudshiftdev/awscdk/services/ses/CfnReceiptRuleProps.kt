@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnReceiptRuleProps {
  public fun after(): String? = unwrap(this).getAfter()

  public fun rule(): Any

  public fun ruleSetName(): String

  @CdkDslMarker
  public interface Builder {
    public fun after(after: String)

    public fun rule(rule: IResolvable)

    public fun rule(rule: CfnReceiptRule.RuleProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43b79e058f75c65090982e241bf65ba0c22cddcde58be98434297073f836f864")
    public fun rule(rule: CfnReceiptRule.RuleProperty.Builder.() -> Unit)

    public fun ruleSetName(ruleSetName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnReceiptRuleProps.Builder =
        software.amazon.awscdk.services.ses.CfnReceiptRuleProps.builder()

    override fun after(after: String) {
      cdkBuilder.after(after)
    }

    override fun rule(rule: IResolvable) {
      cdkBuilder.rule(rule.let(IResolvable::unwrap))
    }

    override fun rule(rule: CfnReceiptRule.RuleProperty) {
      cdkBuilder.rule(rule.let(CfnReceiptRule.RuleProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43b79e058f75c65090982e241bf65ba0c22cddcde58be98434297073f836f864")
    override fun rule(rule: CfnReceiptRule.RuleProperty.Builder.() -> Unit): Unit =
        rule(CfnReceiptRule.RuleProperty(rule))

    override fun ruleSetName(ruleSetName: String) {
      cdkBuilder.ruleSetName(ruleSetName)
    }

    public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRuleProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRuleProps,
  ) : CdkObject(cdkObject), CfnReceiptRuleProps {
    override fun after(): String? = unwrap(this).getAfter()

    override fun rule(): Any = unwrap(this).getRule()

    override fun ruleSetName(): String = unwrap(this).getRuleSetName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReceiptRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRuleProps):
        CfnReceiptRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReceiptRuleProps):
        software.amazon.awscdk.services.ses.CfnReceiptRuleProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ses.CfnReceiptRuleProps
  }
}
