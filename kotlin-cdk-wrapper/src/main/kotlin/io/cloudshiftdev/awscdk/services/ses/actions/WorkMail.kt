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

/**
 * Integrates an Amazon WorkMail action into a receipt rule set, and optionally publishes a
 * notification to Amazon SNS.
 *
 * Beware that WorkMail should already set up an active `INBOUND_MAIL` rule set
 * that includes a WorkMail rule action for this exact purpose.
 * This action should be used to customize the behavior of replacement rule set.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.actions.*;
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * Topic topic;
 * WorkMail workMail = WorkMail.Builder.create()
 * .organizationArn("organizationArn")
 * // the properties below are optional
 * .topic(topic)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-action-workmail.html)
 */
public open class WorkMail(
  cdkObject: software.amazon.awscdk.services.ses.actions.WorkMail,
) : CdkObject(cdkObject), IReceiptRuleAction {
  public constructor(props: WorkMailProps) :
      this(software.amazon.awscdk.services.ses.actions.WorkMail(props.let(WorkMailProps.Companion::unwrap))
  )

  public constructor(props: WorkMailProps.Builder.() -> Unit) : this(WorkMailProps(props)
  )

  /**
   * Returns the receipt rule action specification.
   *
   * @param _rule 
   */
  public override fun bind(rule: IReceiptRule): ReceiptRuleActionConfig =
      unwrap(this).bind(rule.let(IReceiptRule.Companion::unwrap)).let(ReceiptRuleActionConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.actions.WorkMail].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The WorkMail organization ARN.
     *
     * Amazon WorkMail organization ARNs are in the form
     * `arn:aws:workmail:region:account_ID:organization/organization_ID`
     *
     * Example:
     *
     * ```
     * "arn:aws:workmail:us-east-1:123456789012:organization/m-68755160c4cb4e29a2b2f8fb58f359d7";
     * ```
     *
     * @param organizationArn The WorkMail organization ARN. 
     */
    public fun organizationArn(organizationArn: String)

    /**
     * The SNS topic to notify when the WorkMail action is taken.
     *
     * Default: - no topic will be attached to the action
     *
     * @param topic The SNS topic to notify when the WorkMail action is taken. 
     */
    public fun topic(topic: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.WorkMail.Builder =
        software.amazon.awscdk.services.ses.actions.WorkMail.Builder.create()

    /**
     * The WorkMail organization ARN.
     *
     * Amazon WorkMail organization ARNs are in the form
     * `arn:aws:workmail:region:account_ID:organization/organization_ID`
     *
     * Example:
     *
     * ```
     * "arn:aws:workmail:us-east-1:123456789012:organization/m-68755160c4cb4e29a2b2f8fb58f359d7";
     * ```
     *
     * @param organizationArn The WorkMail organization ARN. 
     */
    override fun organizationArn(organizationArn: String) {
      cdkBuilder.organizationArn(organizationArn)
    }

    /**
     * The SNS topic to notify when the WorkMail action is taken.
     *
     * Default: - no topic will be attached to the action
     *
     * @param topic The SNS topic to notify when the WorkMail action is taken. 
     */
    override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.actions.WorkMail = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WorkMail {
      val builderImpl = BuilderImpl()
      return WorkMail(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.actions.WorkMail): WorkMail =
        WorkMail(cdkObject)

    internal fun unwrap(wrapped: WorkMail): software.amazon.awscdk.services.ses.actions.WorkMail =
        wrapped.cdkObject as software.amazon.awscdk.services.ses.actions.WorkMail
  }
}
