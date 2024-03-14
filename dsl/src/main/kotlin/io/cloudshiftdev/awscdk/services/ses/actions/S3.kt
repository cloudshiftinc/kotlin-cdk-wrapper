package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.ses.IReceiptRule
import io.cloudshiftdev.awscdk.services.ses.IReceiptRuleAction
import io.cloudshiftdev.awscdk.services.ses.ReceiptRuleActionConfig
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.String
import kotlin.Unit

public open class S3 internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ses.actions.S3,
) : CdkObject(cdkObject), IReceiptRuleAction {
  /**
   * Returns the receipt rule action specification.
   *
   * @param rule 
   */
  public override fun bind(rule: IReceiptRule): ReceiptRuleActionConfig =
      unwrap(this).bind(rule.let(IReceiptRule::unwrap)).let(ReceiptRuleActionConfig::wrap)

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
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
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
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
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
      cdkBuilder.topic(topic.let(ITopic::unwrap))
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
        wrapped.cdkObject
  }
}
