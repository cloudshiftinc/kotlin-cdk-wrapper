package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.String
import kotlin.Unit

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
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    /**
     * @param kmsKey The master key that SES should use to encrypt your emails before saving them to
     * the S3 bucket.
     */
    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
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
      cdkBuilder.topic(topic.let(ITopic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.actions.S3Props = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.actions.S3Props,
  ) : CdkObject(cdkObject), S3Props {
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
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3Props): software.amazon.awscdk.services.ses.actions.S3Props =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ses.actions.S3Props
  }
}
