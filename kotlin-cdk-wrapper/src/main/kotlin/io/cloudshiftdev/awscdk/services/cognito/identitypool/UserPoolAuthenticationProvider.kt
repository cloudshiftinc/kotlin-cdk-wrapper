@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito.identitypool

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cognito.IUserPool
import io.cloudshiftdev.awscdk.services.cognito.IUserPoolClient
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Defines a User Pool Authentication Provider.
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
public open class UserPoolAuthenticationProvider(
  cdkObject: software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProvider,
) : CdkObject(cdkObject),
    IUserPoolAuthenticationProvider {
  public constructor(props: UserPoolAuthenticationProviderProps) :
      this(software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProvider(props.let(UserPoolAuthenticationProviderProps.Companion::unwrap))
  )

  public constructor(props: UserPoolAuthenticationProviderProps.Builder.() -> Unit) :
      this(UserPoolAuthenticationProviderProps(props)
  )

  /**
   * The method called when a given User Pool Authentication Provider is added (for the first time)
   * to an Identity Pool.
   *
   * @param scope 
   * @param identityPool 
   * @param _options
   */
  public override fun bind(scope: Construct, identityPool: IIdentityPool):
      UserPoolAuthenticationProviderBindConfig =
      unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      identityPool.let(IIdentityPool.Companion::unwrap)).let(UserPoolAuthenticationProviderBindConfig::wrap)

  /**
   * The method called when a given User Pool Authentication Provider is added (for the first time)
   * to an Identity Pool.
   *
   * @param scope 
   * @param identityPool 
   * @param _options
   */
  public override fun bind(
    scope: Construct,
    identityPool: IIdentityPool,
    options: UserPoolAuthenticationProviderBindOptions,
  ): UserPoolAuthenticationProviderBindConfig =
      unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      identityPool.let(IIdentityPool.Companion::unwrap),
      options.let(UserPoolAuthenticationProviderBindOptions.Companion::unwrap)).let(UserPoolAuthenticationProviderBindConfig::wrap)

  /**
   * The method called when a given User Pool Authentication Provider is added (for the first time)
   * to an Identity Pool.
   *
   * @param scope 
   * @param identityPool 
   * @param _options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("39c77d714c29a82fba1da6bdeb477258aaca5172774894e77cb30b47ebe1e483")
  public override fun bind(
    scope: Construct,
    identityPool: IIdentityPool,
    options: UserPoolAuthenticationProviderBindOptions.Builder.() -> Unit,
  ): UserPoolAuthenticationProviderBindConfig = bind(scope, identityPool,
      UserPoolAuthenticationProviderBindOptions(options))

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.cognito.identitypool.UserPoolAuthenticationProvider].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Setting this to true turns off identity pool checks for this user pool to make sure the user
     * has not been globally signed out or deleted before the identity pool provides an OIDC token or
     * AWS credentials for the user.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html)
     * @param disableServerSideTokenCheck Setting this to true turns off identity pool checks for
     * this user pool to make sure the user has not been globally signed out or deleted before the
     * identity pool provides an OIDC token or AWS credentials for the user. 
     */
    public fun disableServerSideTokenCheck(disableServerSideTokenCheck: Boolean)

    /**
     * The User Pool of the Associated Identity Providers.
     *
     * @param userPool The User Pool of the Associated Identity Providers. 
     */
    public fun userPool(userPool: IUserPool)

    /**
     * The User Pool Client for the provided User Pool.
     *
     * Default: - A default user pool client will be added to User Pool
     *
     * @param userPoolClient The User Pool Client for the provided User Pool. 
     */
    public fun userPoolClient(userPoolClient: IUserPoolClient)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProvider.Builder
        =
        software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProvider.Builder.create()

    /**
     * Setting this to true turns off identity pool checks for this user pool to make sure the user
     * has not been globally signed out or deleted before the identity pool provides an OIDC token or
     * AWS credentials for the user.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html)
     * @param disableServerSideTokenCheck Setting this to true turns off identity pool checks for
     * this user pool to make sure the user has not been globally signed out or deleted before the
     * identity pool provides an OIDC token or AWS credentials for the user. 
     */
    override fun disableServerSideTokenCheck(disableServerSideTokenCheck: Boolean) {
      cdkBuilder.disableServerSideTokenCheck(disableServerSideTokenCheck)
    }

    /**
     * The User Pool of the Associated Identity Providers.
     *
     * @param userPool The User Pool of the Associated Identity Providers. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool.Companion::unwrap))
    }

    /**
     * The User Pool Client for the provided User Pool.
     *
     * Default: - A default user pool client will be added to User Pool
     *
     * @param userPoolClient The User Pool Client for the provided User Pool. 
     */
    override fun userPoolClient(userPoolClient: IUserPoolClient) {
      cdkBuilder.userPoolClient(userPoolClient.let(IUserPoolClient.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProvider =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolAuthenticationProvider {
      val builderImpl = BuilderImpl()
      return UserPoolAuthenticationProvider(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProvider):
        UserPoolAuthenticationProvider = UserPoolAuthenticationProvider(cdkObject)

    internal fun unwrap(wrapped: UserPoolAuthenticationProvider):
        software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProvider =
        wrapped.cdkObject as
        software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProvider
  }
}
