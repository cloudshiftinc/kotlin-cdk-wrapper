@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.String
import kotlin.Unit

/**
 * Construction properties for a S3 action.
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
public interface S3Props {
  /**
   * The S3 bucket that incoming email will be saved to.
   */
  public fun bucket(): IBucket

  /**
   * The master key that SES should use to encrypt your emails before saving them to the S3 bucket.
   *
   * Default: no encryption
   */
  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  /**
   * The key prefix of the S3 bucket.
   *
   * Default: no prefix
   */
  public fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()

  /**
   * The SNS topic to notify when the S3 action is taken.
   *
   * Default: no notification
   */
  public fun topic(): ITopic? = unwrap(this).getTopic()?.let(ITopic::wrap)

  /**
   * A builder for [S3Props]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket The S3 bucket that incoming email will be saved to. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param kmsKey The master key that SES should use to encrypt your emails before saving them to
     * the S3 bucket.
     */
    public fun kmsKey(kmsKey: IKey)

    /**
     * @param objectKeyPrefix The key prefix of the S3 bucket.
     */
    public fun objectKeyPrefix(objectKeyPrefix: String)

    /**
     * @param topic The SNS topic to notify when the S3 action is taken.
     */
    public fun topic(topic: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.S3Props.Builder =
        software.amazon.awscdk.services.ses.actions.S3Props.builder()

    /**
     * @param bucket The S3 bucket that incoming email will be saved to. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket.Companion::unwrap))
    }

    /**
     * @param kmsKey The master key that SES should use to encrypt your emails before saving them to
     * the S3 bucket.
     */
    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param objectKeyPrefix The key prefix of the S3 bucket.
     */
    override fun objectKeyPrefix(objectKeyPrefix: String) {
      cdkBuilder.objectKeyPrefix(objectKeyPrefix)
    }

    /**
     * @param topic The SNS topic to notify when the S3 action is taken.
     */
    override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.actions.S3Props = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.actions.S3Props,
  ) : CdkObject(cdkObject),
      S3Props {
    /**
     * The S3 bucket that incoming email will be saved to.
     */
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     * The master key that SES should use to encrypt your emails before saving them to the S3
     * bucket.
     *
     * Default: no encryption
     */
    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

    /**
     * The key prefix of the S3 bucket.
     *
     * Default: no prefix
     */
    override fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()

    /**
     * The SNS topic to notify when the S3 action is taken.
     *
     * Default: no notification
     */
    override fun topic(): ITopic? = unwrap(this).getTopic()?.let(ITopic::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3Props {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.actions.S3Props): S3Props =
        CdkObjectWrappers.wrap(cdkObject) as? S3Props ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3Props): software.amazon.awscdk.services.ses.actions.S3Props =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ses.actions.S3Props
  }
}
