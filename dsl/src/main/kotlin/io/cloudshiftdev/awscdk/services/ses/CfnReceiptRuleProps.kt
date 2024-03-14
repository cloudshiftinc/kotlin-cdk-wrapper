package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnReceiptRuleProps {
  /**
   * The name of an existing rule after which the new rule is placed.
   *
   * If this parameter is null, the new rule is inserted at the beginning of the rule list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-after)
   */
  public fun after(): String? = unwrap(this).getAfter()

  /**
   * A data structure that contains the specified rule's name, actions, recipients, domains, enabled
   * status, scan status, and TLS policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rule)
   */
  public fun rule(): Any

  /**
   * The name of the rule set where the receipt rule is added.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rulesetname)
   */
  public fun ruleSetName(): String

  /**
   * A builder for [CfnReceiptRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param after The name of an existing rule after which the new rule is placed.
     * If this parameter is null, the new rule is inserted at the beginning of the rule list.
     */
    public fun after(after: String)

    /**
     * @param rule A data structure that contains the specified rule's name, actions, recipients,
     * domains, enabled status, scan status, and TLS policy. 
     */
    public fun rule(rule: IResolvable)

    /**
     * @param rule A data structure that contains the specified rule's name, actions, recipients,
     * domains, enabled status, scan status, and TLS policy. 
     */
    public fun rule(rule: CfnReceiptRule.RuleProperty)

    /**
     * @param rule A data structure that contains the specified rule's name, actions, recipients,
     * domains, enabled status, scan status, and TLS policy. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43b79e058f75c65090982e241bf65ba0c22cddcde58be98434297073f836f864")
    public fun rule(rule: CfnReceiptRule.RuleProperty.Builder.() -> Unit)

    /**
     * @param ruleSetName The name of the rule set where the receipt rule is added. 
     */
    public fun ruleSetName(ruleSetName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnReceiptRuleProps.Builder =
        software.amazon.awscdk.services.ses.CfnReceiptRuleProps.builder()

    /**
     * @param after The name of an existing rule after which the new rule is placed.
     * If this parameter is null, the new rule is inserted at the beginning of the rule list.
     */
    override fun after(after: String) {
      cdkBuilder.after(after)
    }

    /**
     * @param rule A data structure that contains the specified rule's name, actions, recipients,
     * domains, enabled status, scan status, and TLS policy. 
     */
    override fun rule(rule: IResolvable) {
      cdkBuilder.rule(rule.let(IResolvable::unwrap))
    }

    /**
     * @param rule A data structure that contains the specified rule's name, actions, recipients,
     * domains, enabled status, scan status, and TLS policy. 
     */
    override fun rule(rule: CfnReceiptRule.RuleProperty) {
      cdkBuilder.rule(rule.let(CfnReceiptRule.RuleProperty::unwrap))
    }

    /**
     * @param rule A data structure that contains the specified rule's name, actions, recipients,
     * domains, enabled status, scan status, and TLS policy. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43b79e058f75c65090982e241bf65ba0c22cddcde58be98434297073f836f864")
    override fun rule(rule: CfnReceiptRule.RuleProperty.Builder.() -> Unit): Unit =
        rule(CfnReceiptRule.RuleProperty(rule))

    /**
     * @param ruleSetName The name of the rule set where the receipt rule is added. 
     */
    override fun ruleSetName(ruleSetName: String) {
      cdkBuilder.ruleSetName(ruleSetName)
    }

    public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRuleProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRuleProps,
  ) : CdkObject(cdkObject), CfnReceiptRuleProps {
    /**
     * The name of an existing rule after which the new rule is placed.
     *
     * If this parameter is null, the new rule is inserted at the beginning of the rule list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-after)
     */
    override fun after(): String? = unwrap(this).getAfter()

    /**
     * A data structure that contains the specified rule's name, actions, recipients, domains,
     * enabled status, scan status, and TLS policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rule)
     */
    override fun rule(): Any = unwrap(this).getRule()

    /**
     * The name of the rule set where the receipt rule is added.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rulesetname)
     */
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
