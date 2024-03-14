package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface S3ActionConfig {
  /**
   * The name of the Amazon S3 bucket that you want to send incoming mail to.
   */
  public fun bucketName(): String

  /**
   * The customer master key that Amazon SES should use to encrypt your emails before saving them to
   * the Amazon S3 bucket.
   *
   * Default: - Emails are not encrypted.
   */
  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * The key prefix of the Amazon S3 bucket.
   *
   * Default: - No prefix.
   */
  public fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()

  /**
   * The ARN of the Amazon SNS topic to notify when the message is saved to the Amazon S3 bucket.
   *
   * Default: - No notification is sent to SNS.
   */
  public fun topicArn(): String? = unwrap(this).getTopicArn()

  /**
   * A builder for [S3ActionConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucketName The name of the Amazon S3 bucket that you want to send incoming mail to. 
     */
    public fun bucketName(bucketName: String)

    /**
     * @param kmsKeyArn The customer master key that Amazon SES should use to encrypt your emails
     * before saving them to the Amazon S3 bucket.
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * @param objectKeyPrefix The key prefix of the Amazon S3 bucket.
     */
    public fun objectKeyPrefix(objectKeyPrefix: String)

    /**
     * @param topicArn The ARN of the Amazon SNS topic to notify when the message is saved to the
     * Amazon S3 bucket.
     */
    public fun topicArn(topicArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.S3ActionConfig.Builder =
        software.amazon.awscdk.services.ses.S3ActionConfig.builder()

    /**
     * @param bucketName The name of the Amazon S3 bucket that you want to send incoming mail to. 
     */
    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param kmsKeyArn The customer master key that Amazon SES should use to encrypt your emails
     * before saving them to the Amazon S3 bucket.
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * @param objectKeyPrefix The key prefix of the Amazon S3 bucket.
     */
    override fun objectKeyPrefix(objectKeyPrefix: String) {
      cdkBuilder.objectKeyPrefix(objectKeyPrefix)
    }

    /**
     * @param topicArn The ARN of the Amazon SNS topic to notify when the message is saved to the
     * Amazon S3 bucket.
     */
    override fun topicArn(topicArn: String) {
      cdkBuilder.topicArn(topicArn)
    }

    public fun build(): software.amazon.awscdk.services.ses.S3ActionConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.S3ActionConfig,
  ) : CdkObject(cdkObject), S3ActionConfig {
    /**
     * The name of the Amazon S3 bucket that you want to send incoming mail to.
     */
    override fun bucketName(): String = unwrap(this).getBucketName()

    /**
     * The customer master key that Amazon SES should use to encrypt your emails before saving them
     * to the Amazon S3 bucket.
     *
     * Default: - Emails are not encrypted.
     */
    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * The key prefix of the Amazon S3 bucket.
     *
     * Default: - No prefix.
     */
    override fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()

    /**
     * The ARN of the Amazon SNS topic to notify when the message is saved to the Amazon S3 bucket.
     *
     * Default: - No notification is sent to SNS.
     */
    override fun topicArn(): String? = unwrap(this).getTopicArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3ActionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.S3ActionConfig): S3ActionConfig
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3ActionConfig): software.amazon.awscdk.services.ses.S3ActionConfig
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ses.S3ActionConfig
  }
}
