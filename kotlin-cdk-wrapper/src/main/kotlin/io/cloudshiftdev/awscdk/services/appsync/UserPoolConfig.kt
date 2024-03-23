@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cognito.IUserPool
import kotlin.String
import kotlin.Unit

/**
 * Configuration for Cognito user-pools in AppSync.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * UserPool userPool;
 * UserPoolConfig userPoolConfig = UserPoolConfig.builder()
 * .userPool(userPool)
 * // the properties below are optional
 * .appIdClientRegex("appIdClientRegex")
 * .defaultAction(UserPoolDefaultAction.ALLOW)
 * .build();
 * ```
 */
public interface UserPoolConfig {
  /**
   * the optional app id regex.
   *
   * Default: -  None
   */
  public fun appIdClientRegex(): String? = unwrap(this).getAppIdClientRegex()

  /**
   * Default auth action.
   *
   * Default: ALLOW
   */
  public fun defaultAction(): UserPoolDefaultAction? =
      unwrap(this).getDefaultAction()?.let(UserPoolDefaultAction::wrap)

  /**
   * The Cognito user pool to use as identity source.
   */
  public fun userPool(): IUserPool

  /**
   * A builder for [UserPoolConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param appIdClientRegex the optional app id regex.
     */
    public fun appIdClientRegex(appIdClientRegex: String)

    /**
     * @param defaultAction Default auth action.
     */
    public fun defaultAction(defaultAction: UserPoolDefaultAction)

    /**
     * @param userPool The Cognito user pool to use as identity source. 
     */
    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.UserPoolConfig.Builder =
        software.amazon.awscdk.services.appsync.UserPoolConfig.builder()

    /**
     * @param appIdClientRegex the optional app id regex.
     */
    override fun appIdClientRegex(appIdClientRegex: String) {
      cdkBuilder.appIdClientRegex(appIdClientRegex)
    }

    /**
     * @param defaultAction Default auth action.
     */
    override fun defaultAction(defaultAction: UserPoolDefaultAction) {
      cdkBuilder.defaultAction(defaultAction.let(UserPoolDefaultAction::unwrap))
    }

    /**
     * @param userPool The Cognito user pool to use as identity source. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.UserPoolConfig = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.UserPoolConfig,
  ) : CdkObject(cdkObject), UserPoolConfig {
    /**
     * the optional app id regex.
     *
     * Default: -  None
     */
    override fun appIdClientRegex(): String? = unwrap(this).getAppIdClientRegex()

    /**
     * Default auth action.
     *
     * Default: ALLOW
     */
    override fun defaultAction(): UserPoolDefaultAction? =
        unwrap(this).getDefaultAction()?.let(UserPoolDefaultAction::wrap)

    /**
     * The Cognito user pool to use as identity source.
     */
    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.UserPoolConfig):
        UserPoolConfig = CdkObjectWrappers.wrap(cdkObject) as? UserPoolConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolConfig):
        software.amazon.awscdk.services.appsync.UserPoolConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appsync.UserPoolConfig
  }
}
