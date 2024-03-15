@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cognito.IUserPool
import kotlin.String
import kotlin.Unit

public interface UserPoolConfig {
  public fun appIdClientRegex(): String? = unwrap(this).getAppIdClientRegex()

  public fun defaultAction(): UserPoolDefaultAction? =
      unwrap(this).getDefaultAction()?.let(UserPoolDefaultAction::wrap)

  public fun userPool(): IUserPool

  @CdkDslMarker
  public interface Builder {
    public fun appIdClientRegex(appIdClientRegex: String)

    public fun defaultAction(defaultAction: UserPoolDefaultAction)

    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.UserPoolConfig.Builder =
        software.amazon.awscdk.services.appsync.UserPoolConfig.builder()

    override fun appIdClientRegex(appIdClientRegex: String) {
      cdkBuilder.appIdClientRegex(appIdClientRegex)
    }

    override fun defaultAction(defaultAction: UserPoolDefaultAction) {
      cdkBuilder.defaultAction(defaultAction.let(UserPoolDefaultAction::unwrap))
    }

    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.UserPoolConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.UserPoolConfig,
  ) : CdkObject(cdkObject), UserPoolConfig {
    override fun appIdClientRegex(): String? = unwrap(this).getAppIdClientRegex()

    override fun defaultAction(): UserPoolDefaultAction? =
        unwrap(this).getDefaultAction()?.let(UserPoolDefaultAction::wrap)

    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.UserPoolConfig):
        UserPoolConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolConfig):
        software.amazon.awscdk.services.appsync.UserPoolConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appsync.UserPoolConfig
  }
}
