package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.services.cognito.IUserPool
import kotlin.String
import kotlin.Unit

public interface UserPoolConfig {
  public fun appIdClientRegex(): String? = unwrap(this).getAppIdClientRegex()

  public fun defaultAction(): UserPoolDefaultAction? =
      unwrap(this).getDefaultAction()?.let(UserPoolDefaultAction::wrap)

  public fun userPool(): IUserPool

  public interface Builder {
    public fun appIdClientRegex(appIdClientRegex: String) {
    }

    public fun defaultAction(defaultAction: UserPoolDefaultAction) {
    }

    public fun userPool(userPool: IUserPool) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.UserPoolConfig.Builder =
        software.amazon.awscdk.services.appsync.UserPoolConfig.builder()

    public override fun appIdClientRegex(appIdClientRegex: String) {
      cdkBuilder.appIdClientRegex(appIdClientRegex)
    }

    public override fun defaultAction(defaultAction: UserPoolDefaultAction) {
      cdkBuilder.defaultAction(defaultAction.let(UserPoolDefaultAction::unwrap))
    }

    public override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.UserPoolConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.UserPoolConfig,
  ) : UserPoolConfig {
    public override fun appIdClientRegex(): String? = unwrap(this).getAppIdClientRegex()

    public override fun defaultAction(): UserPoolDefaultAction? =
        unwrap(this).getDefaultAction()?.let(UserPoolDefaultAction::wrap)

    public override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.UserPoolConfig):
        UserPoolConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolConfig):
        software.amazon.awscdk.services.appsync.UserPoolConfig = (wrapped as Wrapper).cdkObject
  }
}
