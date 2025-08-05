@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito.identitypool

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Represents a UserPoolAuthenticationProvider Bind Configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.identitypool.*;
 * UserPoolAuthenticationProviderBindConfig userPoolAuthenticationProviderBindConfig =
 * UserPoolAuthenticationProviderBindConfig.builder()
 * .clientId("clientId")
 * .providerName("providerName")
 * .serverSideTokenCheck(false)
 * .build();
 * ```
 */
public interface UserPoolAuthenticationProviderBindConfig {
  /**
   * Client Id of the Associated User Pool Client.
   */
  public fun clientId(): String

  /**
   * The identity providers associated with the UserPool.
   */
  public fun providerName(): String

  /**
   * Whether to enable the identity pool's server side token check.
   */
  public fun serverSideTokenCheck(): Boolean

  /**
   * A builder for [UserPoolAuthenticationProviderBindConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clientId Client Id of the Associated User Pool Client. 
     */
    public fun clientId(clientId: String)

    /**
     * @param providerName The identity providers associated with the UserPool. 
     */
    public fun providerName(providerName: String)

    /**
     * @param serverSideTokenCheck Whether to enable the identity pool's server side token check. 
     */
    public fun serverSideTokenCheck(serverSideTokenCheck: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProviderBindConfig.Builder
        =
        software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProviderBindConfig.builder()

    /**
     * @param clientId Client Id of the Associated User Pool Client. 
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    /**
     * @param providerName The identity providers associated with the UserPool. 
     */
    override fun providerName(providerName: String) {
      cdkBuilder.providerName(providerName)
    }

    /**
     * @param serverSideTokenCheck Whether to enable the identity pool's server side token check. 
     */
    override fun serverSideTokenCheck(serverSideTokenCheck: Boolean) {
      cdkBuilder.serverSideTokenCheck(serverSideTokenCheck)
    }

    public fun build():
        software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProviderBindConfig
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProviderBindConfig,
  ) : CdkObject(cdkObject),
      UserPoolAuthenticationProviderBindConfig {
    /**
     * Client Id of the Associated User Pool Client.
     */
    override fun clientId(): String = unwrap(this).getClientId()

    /**
     * The identity providers associated with the UserPool.
     */
    override fun providerName(): String = unwrap(this).getProviderName()

    /**
     * Whether to enable the identity pool's server side token check.
     */
    override fun serverSideTokenCheck(): Boolean = unwrap(this).getServerSideTokenCheck()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        UserPoolAuthenticationProviderBindConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProviderBindConfig):
        UserPoolAuthenticationProviderBindConfig = CdkObjectWrappers.wrap(cdkObject) as?
        UserPoolAuthenticationProviderBindConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolAuthenticationProviderBindConfig):
        software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProviderBindConfig
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProviderBindConfig
  }
}
