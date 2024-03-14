package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

public interface LogSubscriptionDestinationConfig {
  public fun arn(): String

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public interface Builder {
    public fun arn(arn: String)

    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.logs.LogSubscriptionDestinationConfig.Builder =
        software.amazon.awscdk.services.logs.LogSubscriptionDestinationConfig.builder()

    override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.LogSubscriptionDestinationConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.logs.LogSubscriptionDestinationConfig,
  ) : LogSubscriptionDestinationConfig {
    override fun arn(): String = unwrap(this).getArn()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LogSubscriptionDestinationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.logs.LogSubscriptionDestinationConfig):
        LogSubscriptionDestinationConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogSubscriptionDestinationConfig):
        software.amazon.awscdk.services.logs.LogSubscriptionDestinationConfig = (wrapped as
        Wrapper).cdkObject
  }
}
