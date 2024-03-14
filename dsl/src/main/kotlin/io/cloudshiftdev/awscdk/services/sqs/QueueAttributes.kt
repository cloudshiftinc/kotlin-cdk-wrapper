package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface QueueAttributes {
  /**
   * Whether this queue is an Amazon SQS FIFO queue. If false, this is a standard queue.
   *
   * In case of a FIFO queue which is imported from a token, this value has to be explicitly set to
   * true.
   *
   * Default: - if fifo is not specified, the property will be determined based on the queue name
   * (not possible for FIFO queues imported from a token)
   */
  public fun fifo(): Boolean? = unwrap(this).getFifo()

  /**
   * KMS encryption key, if this queue is server-side encrypted by a KMS key.
   *
   * Default: - None
   */
  public fun keyArn(): String? = unwrap(this).getKeyArn()

  /**
   * The ARN of the queue.
   */
  public fun queueArn(): String

  /**
   * The name of the queue.
   *
   * Default: if queue name is not specified, the name will be derived from the queue ARN
   */
  public fun queueName(): String? = unwrap(this).getQueueName()

  /**
   * The URL of the queue.
   *
   * Default: - 'https://sqs.<region-endpoint>/<account-ID>/<queue-name>'
   *
   * [Documentation](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-message-identifiers.html#sqs-general-identifiers)
   */
  public fun queueUrl(): String? = unwrap(this).getQueueUrl()

  /**
   * A builder for [QueueAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param fifo Whether this queue is an Amazon SQS FIFO queue. If false, this is a standard
     * queue.
     * In case of a FIFO queue which is imported from a token, this value has to be explicitly set
     * to true.
     */
    public fun fifo(fifo: Boolean)

    /**
     * @param keyArn KMS encryption key, if this queue is server-side encrypted by a KMS key.
     */
    public fun keyArn(keyArn: String)

    /**
     * @param queueArn The ARN of the queue. 
     */
    public fun queueArn(queueArn: String)

    /**
     * @param queueName The name of the queue.
     */
    public fun queueName(queueName: String)

    /**
     * @param queueUrl The URL of the queue.
     */
    public fun queueUrl(queueUrl: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sqs.QueueAttributes.Builder =
        software.amazon.awscdk.services.sqs.QueueAttributes.builder()

    /**
     * @param fifo Whether this queue is an Amazon SQS FIFO queue. If false, this is a standard
     * queue.
     * In case of a FIFO queue which is imported from a token, this value has to be explicitly set
     * to true.
     */
    override fun fifo(fifo: Boolean) {
      cdkBuilder.fifo(fifo)
    }

    /**
     * @param keyArn KMS encryption key, if this queue is server-side encrypted by a KMS key.
     */
    override fun keyArn(keyArn: String) {
      cdkBuilder.keyArn(keyArn)
    }

    /**
     * @param queueArn The ARN of the queue. 
     */
    override fun queueArn(queueArn: String) {
      cdkBuilder.queueArn(queueArn)
    }

    /**
     * @param queueName The name of the queue.
     */
    override fun queueName(queueName: String) {
      cdkBuilder.queueName(queueName)
    }

    /**
     * @param queueUrl The URL of the queue.
     */
    override fun queueUrl(queueUrl: String) {
      cdkBuilder.queueUrl(queueUrl)
    }

    public fun build(): software.amazon.awscdk.services.sqs.QueueAttributes = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.sqs.QueueAttributes,
  ) : QueueAttributes {
    /**
     * Whether this queue is an Amazon SQS FIFO queue. If false, this is a standard queue.
     *
     * In case of a FIFO queue which is imported from a token, this value has to be explicitly set
     * to true.
     *
     * Default: - if fifo is not specified, the property will be determined based on the queue name
     * (not possible for FIFO queues imported from a token)
     */
    override fun fifo(): Boolean? = unwrap(this).getFifo()

    /**
     * KMS encryption key, if this queue is server-side encrypted by a KMS key.
     *
     * Default: - None
     */
    override fun keyArn(): String? = unwrap(this).getKeyArn()

    /**
     * The ARN of the queue.
     */
    override fun queueArn(): String = unwrap(this).getQueueArn()

    /**
     * The name of the queue.
     *
     * Default: if queue name is not specified, the name will be derived from the queue ARN
     */
    override fun queueName(): String? = unwrap(this).getQueueName()

    /**
     * The URL of the queue.
     *
     * Default: - 'https://sqs.<region-endpoint>/<account-ID>/<queue-name>'
     *
     * [Documentation](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-message-identifiers.html#sqs-general-identifiers)
     */
    override fun queueUrl(): String? = unwrap(this).getQueueUrl()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): QueueAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.QueueAttributes):
        QueueAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: QueueAttributes):
        software.amazon.awscdk.services.sqs.QueueAttributes = (wrapped as Wrapper).cdkObject
  }
}
