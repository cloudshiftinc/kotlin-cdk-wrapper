@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ses.IReceiptRule
import io.cloudshiftdev.awscdk.services.ses.IReceiptRuleAction
import io.cloudshiftdev.awscdk.services.ses.ReceiptRuleActionConfig
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Unit

/**
 * Publishes the email content within a notification to Amazon SNS.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * import io.cloudshiftdev.awscdk.services.ses.actions.*;
 * Bucket bucket = new Bucket(this, "Bucket");
 * Topic topic = new Topic(this, "Topic");
 * ReceiptRuleSet.Builder.create(this, "RuleSet")
 * .rules(List.of(ReceiptRuleOptions.builder()
 * .recipients(List.of("hello&#64;aws.com"))
 * .actions(List.of(
 * AddHeader.Builder.create()
 * .name("X-Special-Header")
 * .value("aws")
 * .build(),
 * S3.Builder.create()
 * .bucket(bucket)
 * .objectKeyPrefix("emails/")
 * .topic(topic)
 * .build()))
 * .build(), ReceiptRuleOptions.builder()
 * .recipients(List.of("aws.com"))
 * .actions(List.of(
 * Sns.Builder.create()
 * .topic(topic)
 * .build()))
 * .build()))
 * .build();
 * ```
 */
public open class Sns internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ses.actions.Sns,
) : CdkObject(cdkObject), IReceiptRuleAction {
  /**
   * Returns the receipt rule action specification.
   *
   * @param _rule 
   */
  public override fun bind(rule: IReceiptRule): ReceiptRuleActionConfig =
      unwrap(this).bind(rule.let(IReceiptRule::unwrap)).let(ReceiptRuleActionConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.actions.Sns].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The encoding to use for the email within the Amazon SNS notification.
     *
     * Default: UTF-8
     *
     * @param encoding The encoding to use for the email within the Amazon SNS notification. 
     */
    public fun encoding(encoding: EmailEncoding)

    /**
     * The SNS topic to notify.
     *
     * @param topic The SNS topic to notify. 
     */
    public fun topic(topic: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.Sns.Builder =
        software.amazon.awscdk.services.ses.actions.Sns.Builder.create()

    /**
     * The encoding to use for the email within the Amazon SNS notification.
     *
     * Default: UTF-8
     *
     * @param encoding The encoding to use for the email within the Amazon SNS notification. 
     */
    override fun encoding(encoding: EmailEncoding) {
      cdkBuilder.encoding(encoding.let(EmailEncoding::unwrap))
    }

    /**
     * The SNS topic to notify.
     *
     * @param topic The SNS topic to notify. 
     */
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
