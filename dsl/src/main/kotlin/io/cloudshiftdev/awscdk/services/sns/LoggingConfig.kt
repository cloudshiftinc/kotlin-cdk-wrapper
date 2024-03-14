package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.Unit

public interface LoggingConfig {
  /**
   * The IAM role to be used when logging failed message deliveries in Amazon CloudWatch.
   *
   * Default: None
   */
  public fun failureFeedbackRole(): IRole? = unwrap(this).getFailureFeedbackRole()?.let(IRole::wrap)

  /**
   * Indicates one of the supported protocols for the SNS topic.
   */
  public fun protocol(): LoggingProtocol

  /**
   * The IAM role to be used when logging successful message deliveries in Amazon CloudWatch.
   *
   * Default: None
   */
  public fun successFeedbackRole(): IRole? = unwrap(this).getSuccessFeedbackRole()?.let(IRole::wrap)

  /**
   * The percentage of successful message deliveries to be logged in Amazon CloudWatch.
   *
   * Valid values are integer between 0-100
   *
   * Default: None
   */
  public fun successFeedbackSampleRate(): Number? = unwrap(this).getSuccessFeedbackSampleRate()

  /**
   * A builder for [LoggingConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param failureFeedbackRole The IAM role to be used when logging failed message deliveries in
     * Amazon CloudWatch.
     */
    public fun failureFeedbackRole(failureFeedbackRole: IRole)

    /**
     * @param protocol Indicates one of the supported protocols for the SNS topic. 
     */
    public fun protocol(protocol: LoggingProtocol)

    /**
     * @param successFeedbackRole The IAM role to be used when logging successful message deliveries
     * in Amazon CloudWatch.
     */
    public fun successFeedbackRole(successFeedbackRole: IRole)

    /**
     * @param successFeedbackSampleRate The percentage of successful message deliveries to be logged
     * in Amazon CloudWatch.
     * Valid values are integer between 0-100
     */
    public fun successFeedbackSampleRate(successFeedbackSampleRate: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.LoggingConfig.Builder =
        software.amazon.awscdk.services.sns.LoggingConfig.builder()

    /**
     * @param failureFeedbackRole The IAM role to be used when logging failed message deliveries in
     * Amazon CloudWatch.
     */
    override fun failureFeedbackRole(failureFeedbackRole: IRole) {
      cdkBuilder.failureFeedbackRole(failureFeedbackRole.let(IRole::unwrap))
    }

    /**
     * @param protocol Indicates one of the supported protocols for the SNS topic. 
     */
    override fun protocol(protocol: LoggingProtocol) {
      cdkBuilder.protocol(protocol.let(LoggingProtocol::unwrap))
    }

    /**
     * @param successFeedbackRole The IAM role to be used when logging successful message deliveries
     * in Amazon CloudWatch.
     */
    override fun successFeedbackRole(successFeedbackRole: IRole) {
      cdkBuilder.successFeedbackRole(successFeedbackRole.let(IRole::unwrap))
    }

    /**
     * @param successFeedbackSampleRate The percentage of successful message deliveries to be logged
     * in Amazon CloudWatch.
     * Valid values are integer between 0-100
     */
    override fun successFeedbackSampleRate(successFeedbackSampleRate: Number) {
      cdkBuilder.successFeedbackSampleRate(successFeedbackSampleRate)
    }

    public fun build(): software.amazon.awscdk.services.sns.LoggingConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sns.LoggingConfig,
  ) : CdkObject(cdkObject), LoggingConfig {
    /**
     * The IAM role to be used when logging failed message deliveries in Amazon CloudWatch.
     *
     * Default: None
     */
    override fun failureFeedbackRole(): IRole? =
        unwrap(this).getFailureFeedbackRole()?.let(IRole::wrap)

    /**
     * Indicates one of the supported protocols for the SNS topic.
     */
    override fun protocol(): LoggingProtocol = unwrap(this).getProtocol().let(LoggingProtocol::wrap)

    /**
     * The IAM role to be used when logging successful message deliveries in Amazon CloudWatch.
     *
     * Default: None
     */
    override fun successFeedbackRole(): IRole? =
        unwrap(this).getSuccessFeedbackRole()?.let(IRole::wrap)

    /**
     * The percentage of successful message deliveries to be logged in Amazon CloudWatch.
     *
     * Valid values are integer between 0-100
     *
     * Default: None
     */
    override fun successFeedbackSampleRate(): Number? = unwrap(this).getSuccessFeedbackSampleRate()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.LoggingConfig): LoggingConfig =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoggingConfig): software.amazon.awscdk.services.sns.LoggingConfig =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sns.LoggingConfig
  }
}
