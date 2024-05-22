@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Construction properties for a ReceiptRuleSet.
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
public interface ReceiptRuleSetProps {
  /**
   * Whether to add a first rule to stop processing messages that have at least one spam indicator.
   *
   * Default: false
   */
  public fun dropSpam(): Boolean? = unwrap(this).getDropSpam()

  /**
   * The name for the receipt rule set.
   *
   * Default: - A CloudFormation generated name.
   */
  public fun receiptRuleSetName(): String? = unwrap(this).getReceiptRuleSetName()

  /**
   * The list of rules to add to this rule set.
   *
   * Rules are added in the same
   * order as they appear in the list.
   *
   * Default: - No rules are added to the rule set.
   */
  public fun rules(): List<ReceiptRuleOptions> =
      unwrap(this).getRules()?.map(ReceiptRuleOptions::wrap) ?: emptyList()

  /**
   * A builder for [ReceiptRuleSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dropSpam Whether to add a first rule to stop processing messages that have at least
     * one spam indicator.
     */
    public fun dropSpam(dropSpam: Boolean)

    /**
     * @param receiptRuleSetName The name for the receipt rule set.
     */
    public fun receiptRuleSetName(receiptRuleSetName: String)

    /**
     * @param rules The list of rules to add to this rule set.
     * Rules are added in the same
     * order as they appear in the list.
     */
    public fun rules(rules: List<ReceiptRuleOptions>)

    /**
     * @param rules The list of rules to add to this rule set.
     * Rules are added in the same
     * order as they appear in the list.
     */
    public fun rules(vararg rules: ReceiptRuleOptions)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.ReceiptRuleSetProps.Builder =
        software.amazon.awscdk.services.ses.ReceiptRuleSetProps.builder()

    /**
     * @param dropSpam Whether to add a first rule to stop processing messages that have at least
     * one spam indicator.
     */
    override fun dropSpam(dropSpam: Boolean) {
      cdkBuilder.dropSpam(dropSpam)
    }

    /**
     * @param receiptRuleSetName The name for the receipt rule set.
     */
    override fun receiptRuleSetName(receiptRuleSetName: String) {
      cdkBuilder.receiptRuleSetName(receiptRuleSetName)
    }

    /**
     * @param rules The list of rules to add to this rule set.
     * Rules are added in the same
     * order as they appear in the list.
     */
    override fun rules(rules: List<ReceiptRuleOptions>) {
      cdkBuilder.rules(rules.map(ReceiptRuleOptions.Companion::unwrap))
    }

    /**
     * @param rules The list of rules to add to this rule set.
     * Rules are added in the same
     * order as they appear in the list.
     */
    override fun rules(vararg rules: ReceiptRuleOptions): Unit = rules(rules.toList())

    public fun build(): software.amazon.awscdk.services.ses.ReceiptRuleSetProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.ReceiptRuleSetProps,
  ) : CdkObject(cdkObject), ReceiptRuleSetProps {
    /**
     * Whether to add a first rule to stop processing messages that have at least one spam
     * indicator.
     *
     * Default: false
     */
    override fun dropSpam(): Boolean? = unwrap(this).getDropSpam()

    /**
     * The name for the receipt rule set.
     *
     * Default: - A CloudFormation generated name.
     */
    override fun receiptRuleSetName(): String? = unwrap(this).getReceiptRuleSetName()

    /**
     * The list of rules to add to this rule set.
     *
     * Rules are added in the same
     * order as they appear in the list.
     *
     * Default: - No rules are added to the rule set.
     */
    override fun rules(): List<ReceiptRuleOptions> =
        unwrap(this).getRules()?.map(ReceiptRuleOptions::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ReceiptRuleSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.ReceiptRuleSetProps):
        ReceiptRuleSetProps = CdkObjectWrappers.wrap(cdkObject) as? ReceiptRuleSetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ReceiptRuleSetProps):
        software.amazon.awscdk.services.ses.ReceiptRuleSetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ses.ReceiptRuleSetProps
  }
}
