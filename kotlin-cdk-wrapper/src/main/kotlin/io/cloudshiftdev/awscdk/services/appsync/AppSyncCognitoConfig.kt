@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cognito.IUserPool
import kotlin.String
import kotlin.Unit

/**
 * Configuration for Cognito user-pools in AppSync for Api.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * UserPool userPool;
 * AppSyncCognitoConfig appSyncCognitoConfig = AppSyncCognitoConfig.builder()
 * .userPool(userPool)
 * // the properties below are optional
 * .appIdClientRegex("appIdClientRegex")
 * .build();
 * ```
 */
public interface AppSyncCognitoConfig {
  /**
   * the optional app id regex.
   *
   * Default: -  None
   */
  public fun appIdClientRegex(): String? = unwrap(this).getAppIdClientRegex()

  /**
   * The Cognito user pool to use as identity source.
   */
  public fun userPool(): IUserPool

  /**
   * A builder for [AppSyncCognitoConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param appIdClientRegex the optional app id regex.
     */
    public fun appIdClientRegex(appIdClientRegex: String)

    /**
     * @param userPool The Cognito user pool to use as identity source. 
     */
    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.AppSyncCognitoConfig.Builder =
        software.amazon.awscdk.services.appsync.AppSyncCognitoConfig.builder()

    /**
     * @param appIdClientRegex the optional app id regex.
     */
    override fun appIdClientRegex(appIdClientRegex: String) {
      cdkBuilder.appIdClientRegex(appIdClientRegex)
    }

    /**
     * @param userPool The Cognito user pool to use as identity source. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.AppSyncCognitoConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.AppSyncCognitoConfig,
  ) : CdkObject(cdkObject),
      AppSyncCognitoConfig {
    /**
     * the optional app id regex.
     *
     * Default: -  None
     */
    override fun appIdClientRegex(): String? = unwrap(this).getAppIdClientRegex()

    /**
     * The Cognito user pool to use as identity source.
     */
    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AppSyncCognitoConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppSyncCognitoConfig):
        AppSyncCognitoConfig = CdkObjectWrappers.wrap(cdkObject) as? AppSyncCognitoConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AppSyncCognitoConfig):
        software.amazon.awscdk.services.appsync.AppSyncCognitoConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.AppSyncCognitoConfig
  }
}
