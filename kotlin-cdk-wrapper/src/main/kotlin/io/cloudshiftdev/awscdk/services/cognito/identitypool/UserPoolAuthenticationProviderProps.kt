@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito.identitypool

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cognito.IUserPool
import io.cloudshiftdev.awscdk.services.cognito.IUserPoolClient
import kotlin.Boolean
import kotlin.Unit

/**
 * Props for the User Pool Authentication Provider.
 *
 * Example:
 *
 * ```
 * IdentityPool identityPool;
 * UserPool userPool = new UserPool(this, "Pool");
 * identityPool.addUserPoolAuthentication(UserPoolAuthenticationProvider.Builder.create()
 * .userPool(userPool)
 * .disableServerSideTokenCheck(true)
 * .build());
 * ```
 */
public interface UserPoolAuthenticationProviderProps {
  /**
   * Setting this to true turns off identity pool checks for this user pool to make sure the user
   * has not been globally signed out or deleted before the identity pool provides an OIDC token or AWS
   * credentials for the user.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html)
   */
  public fun disableServerSideTokenCheck(): Boolean? = unwrap(this).getDisableServerSideTokenCheck()

  /**
   * The User Pool of the Associated Identity Providers.
   */
  public fun userPool(): IUserPool

  /**
   * The User Pool Client for the provided User Pool.
   *
   * Default: - A default user pool client will be added to User Pool
   */
  public fun userPoolClient(): IUserPoolClient? =
      unwrap(this).getUserPoolClient()?.let(IUserPoolClient::wrap)

  /**
   * A builder for [UserPoolAuthenticationProviderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param disableServerSideTokenCheck Setting this to true turns off identity pool checks for
     * this user pool to make sure the user has not been globally signed out or deleted before the
     * identity pool provides an OIDC token or AWS credentials for the user.
     */
    public fun disableServerSideTokenCheck(disableServerSideTokenCheck: Boolean)

    /**
     * @param userPool The User Pool of the Associated Identity Providers. 
     */
    public fun userPool(userPool: IUserPool)

    /**
     * @param userPoolClient The User Pool Client for the provided User Pool.
     */
    public fun userPoolClient(userPoolClient: IUserPoolClient)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProviderProps.Builder
        =
        software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProviderProps.builder()

    /**
     * @param disableServerSideTokenCheck Setting this to true turns off identity pool checks for
     * this user pool to make sure the user has not been globally signed out or deleted before the
     * identity pool provides an OIDC token or AWS credentials for the user.
     */
    override fun disableServerSideTokenCheck(disableServerSideTokenCheck: Boolean) {
      cdkBuilder.disableServerSideTokenCheck(disableServerSideTokenCheck)
    }

    /**
     * @param userPool The User Pool of the Associated Identity Providers. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool.Companion::unwrap))
    }

    /**
     * @param userPoolClient The User Pool Client for the provided User Pool.
     */
    override fun userPoolClient(userPoolClient: IUserPoolClient) {
      cdkBuilder.userPoolClient(userPoolClient.let(IUserPoolClient.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProviderProps,
  ) : CdkObject(cdkObject),
      UserPoolAuthenticationProviderProps {
    /**
     * Setting this to true turns off identity pool checks for this user pool to make sure the user
     * has not been globally signed out or deleted before the identity pool provides an OIDC token or
     * AWS credentials for the user.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html)
     */
    override fun disableServerSideTokenCheck(): Boolean? =
        unwrap(this).getDisableServerSideTokenCheck()

    /**
     * The User Pool of the Associated Identity Providers.
     */
    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)

    /**
     * The User Pool Client for the provided User Pool.
     *
     * Default: - A default user pool client will be added to User Pool
     */
    override fun userPoolClient(): IUserPoolClient? =
        unwrap(this).getUserPoolClient()?.let(IUserPoolClient::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        UserPoolAuthenticationProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProviderProps):
        UserPoolAuthenticationProviderProps = CdkObjectWrappers.wrap(cdkObject) as?
        UserPoolAuthenticationProviderProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolAuthenticationProviderProps):
        software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProviderProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProviderProps
  }
}
