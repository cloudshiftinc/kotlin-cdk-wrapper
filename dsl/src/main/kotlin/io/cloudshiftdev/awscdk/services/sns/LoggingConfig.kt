package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.Unit

public interface LoggingConfig {
  public fun failureFeedbackRole(): IRole? = unwrap(this).getFailureFeedbackRole()?.let(IRole::wrap)

  public fun protocol(): LoggingProtocol

  public fun successFeedbackRole(): IRole? = unwrap(this).getSuccessFeedbackRole()?.let(IRole::wrap)

  public fun successFeedbackSampleRate(): Number? = unwrap(this).getSuccessFeedbackSampleRate()

  public interface Builder {
    public fun failureFeedbackRole(failureFeedbackRole: IRole) {
    }

    public fun protocol(protocol: LoggingProtocol) {
    }

    public fun successFeedbackRole(successFeedbackRole: IRole) {
    }

    public fun successFeedbackSampleRate(successFeedbackSampleRate: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.LoggingConfig.Builder =
        software.amazon.awscdk.services.sns.LoggingConfig.builder()

    public override fun failureFeedbackRole(failureFeedbackRole: IRole) {
      cdkBuilder.failureFeedbackRole(failureFeedbackRole.let(IRole::unwrap))
    }

    public override fun protocol(protocol: LoggingProtocol) {
      cdkBuilder.protocol(protocol.let(LoggingProtocol::unwrap))
    }

    public override fun successFeedbackRole(successFeedbackRole: IRole) {
      cdkBuilder.successFeedbackRole(successFeedbackRole.let(IRole::unwrap))
    }

    public override fun successFeedbackSampleRate(successFeedbackSampleRate: Number) {
      cdkBuilder.successFeedbackSampleRate(successFeedbackSampleRate)
    }

    public fun build(): software.amazon.awscdk.services.sns.LoggingConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.sns.LoggingConfig,
  ) : LoggingConfig {
    public override fun failureFeedbackRole(): IRole? =
        unwrap(this).getFailureFeedbackRole()?.let(IRole::wrap)

    public override fun protocol(): LoggingProtocol =
        unwrap(this).getProtocol().let(LoggingProtocol::wrap)

    public override fun successFeedbackRole(): IRole? =
        unwrap(this).getSuccessFeedbackRole()?.let(IRole::wrap)

    public override fun successFeedbackSampleRate(): Number? =
        unwrap(this).getSuccessFeedbackSampleRate()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.LoggingConfig): LoggingConfig =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoggingConfig): software.amazon.awscdk.services.sns.LoggingConfig =
        (wrapped as Wrapper).cdkObject
  }
}
