@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.ses.IReceiptRule
import io.cloudshiftdev.awscdk.services.ses.IReceiptRuleAction
import io.cloudshiftdev.awscdk.services.ses.ReceiptRuleActionConfig
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.String
import kotlin.Unit

/**
 * Saves the received message to an Amazon S3 bucket and, optionally, publishes a notification to
 * Amazon SNS.
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
public open class S3(
  cdkObject: software.amazon.awscdk.services.ses.actions.S3,
) : CdkObject(cdkObject), IReceiptRuleAction {
  public constructor(props: S3Props) :
      this(software.amazon.awscdk.services.ses.actions.S3(props.let(S3Props.Companion::unwrap))
  )

  public constructor(props: S3Props.Builder.() -> Unit) : this(S3Props(props)
  )

  /**
   * Returns the receipt rule action specification.
   *
   * @param rule 
   */
  public override fun bind(rule: IReceiptRule): ReceiptRuleActionConfig =
      unwrap(this).bind(rule.let(IReceiptRule.Companion::unwrap)).let(ReceiptRuleActionConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.actions.S3].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The S3 bucket that incoming email will be saved to.
     *
     * @param bucket The S3 bucket that incoming email will be saved to. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * The master key that SES should use to encrypt your emails before saving them to the S3
     * bucket.
     *
     * Default: no encryption
     *
     * @param kmsKey The master key that SES should use to encrypt your emails before saving them to
     * the S3 bucket. 
     */
    public fun kmsKey(kmsKey: IKey)

    /**
     * The key prefix of the S3 bucket.
     *
     * Default: no prefix
     *
     * @param objectKeyPrefix The key prefix of the S3 bucket. 
     */
    public fun objectKeyPrefix(objectKeyPrefix: String)

    /**
     * The SNS topic to notify when the S3 action is taken.
     *
     * Default: no notification
     *
     * @param topic The SNS topic to notify when the S3 action is taken. 
     */
    public fun topic(topic: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.S3.Builder =
        software.amazon.awscdk.services.ses.actions.S3.Builder.create()

    /**
     * The S3 bucket that incoming email will be saved to.
     *
     * @param bucket The S3 bucket that incoming email will be saved to. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket.Companion::unwrap))
    }

    /**
     * The master key that SES should use to encrypt your emails before saving them to the S3
     * bucket.
     *
     * Default: no encryption
     *
     * @param kmsKey The master key that SES should use to encrypt your emails before saving them to
     * the S3 bucket. 
     */
    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey.Companion::unwrap))
    }

    /**
     * The key prefix of the S3 bucket.
     *
     * Default: no prefix
     *
     * @param objectKeyPrefix The key prefix of the S3 bucket. 
     */
    override fun objectKeyPrefix(objectKeyPrefix: String) {
      cdkBuilder.objectKeyPrefix(objectKeyPrefix)
    }

    /**
     * The SNS topic to notify when the S3 action is taken.
     *
     * Default: no notification
     *
     * @param topic The SNS topic to notify when the S3 action is taken. 
     */
    override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.actions.S3 = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3 {
      val builderImpl = BuilderImpl()
      return S3(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.actions.S3): S3 = S3(cdkObject)

    internal fun unwrap(wrapped: S3): software.amazon.awscdk.services.ses.actions.S3 =
        wrapped.cdkObject as software.amazon.awscdk.services.ses.actions.S3
  }
}
