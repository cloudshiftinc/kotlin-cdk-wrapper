@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito.identitypool

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents the concept of a User Pool Authentication Provider.
 *
 * You use user pool authentication providers to configure User Pools
 * and User Pool Clients for use with Identity Pools
 */
public interface IUserPoolAuthenticationProvider {
  /**
   * The method called when a given User Pool Authentication Provider is added (for the first time)
   * to an Identity Pool.
   *
   * @param scope 
   * @param identityPool 
   * @param options
   */
  public fun bind(scope: Construct, identityPool: IIdentityPool):
      UserPoolAuthenticationProviderBindConfig

  /**
   * The method called when a given User Pool Authentication Provider is added (for the first time)
   * to an Identity Pool.
   *
   * @param scope 
   * @param identityPool 
   * @param options
   */
  public fun bind(
    scope: Construct,
    identityPool: IIdentityPool,
    options: UserPoolAuthenticationProviderBindOptions,
  ): UserPoolAuthenticationProviderBindConfig

  /**
   * The method called when a given User Pool Authentication Provider is added (for the first time)
   * to an Identity Pool.
   *
   * @param scope 
   * @param identityPool 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("39c77d714c29a82fba1da6bdeb477258aaca5172774894e77cb30b47ebe1e483")
  public fun bind(
    scope: Construct,
    identityPool: IIdentityPool,
    options: UserPoolAuthenticationProviderBindOptions.Builder.() -> Unit,
  ): UserPoolAuthenticationProviderBindConfig

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.identitypool.IUserPoolAuthenticationProvider,
  ) : CdkObject(cdkObject),
      IUserPoolAuthenticationProvider {
    /**
     * The method called when a given User Pool Authentication Provider is added (for the first
     * time) to an Identity Pool.
     *
     * @param scope 
     * @param identityPool 
     * @param options
     */
    override fun bind(scope: Construct, identityPool: IIdentityPool):
        UserPoolAuthenticationProviderBindConfig =
        unwrap(this).bind(scope.let(Construct.Companion::unwrap),
        identityPool.let(IIdentityPool.Companion::unwrap)).let(UserPoolAuthenticationProviderBindConfig::wrap)

    /**
     * The method called when a given User Pool Authentication Provider is added (for the first
     * time) to an Identity Pool.
     *
     * @param scope 
     * @param identityPool 
     * @param options
     */
    override fun bind(
      scope: Construct,
      identityPool: IIdentityPool,
      options: UserPoolAuthenticationProviderBindOptions,
    ): UserPoolAuthenticationProviderBindConfig =
        unwrap(this).bind(scope.let(Construct.Companion::unwrap),
        identityPool.let(IIdentityPool.Companion::unwrap),
        options.let(UserPoolAuthenticationProviderBindOptions.Companion::unwrap)).let(UserPoolAuthenticationProviderBindConfig::wrap)

    /**
     * The method called when a given User Pool Authentication Provider is added (for the first
     * time) to an Identity Pool.
     *
     * @param scope 
     * @param identityPool 
     * @param options
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39c77d714c29a82fba1da6bdeb477258aaca5172774894e77cb30b47ebe1e483")
    override fun bind(
      scope: Construct,
      identityPool: IIdentityPool,
      options: UserPoolAuthenticationProviderBindOptions.Builder.() -> Unit,
    ): UserPoolAuthenticationProviderBindConfig = bind(scope, identityPool,
        UserPoolAuthenticationProviderBindOptions(options))
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.identitypool.IUserPoolAuthenticationProvider):
        IUserPoolAuthenticationProvider = CdkObjectWrappers.wrap(cdkObject) as?
        IUserPoolAuthenticationProvider ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IUserPoolAuthenticationProvider):
        software.amazon.awscdk.services.cognito.identitypool.IUserPoolAuthenticationProvider =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.identitypool.IUserPoolAuthenticationProvider
  }
}
