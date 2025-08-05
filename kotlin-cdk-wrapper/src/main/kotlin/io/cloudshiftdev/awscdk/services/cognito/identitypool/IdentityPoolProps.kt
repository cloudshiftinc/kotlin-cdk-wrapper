@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito.identitypool

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Props for the Identity Pool construct.
 *
 * Example:
 *
 * ```
 * OpenIdConnectProvider openIdConnectProvider;
 * IdentityPool.Builder.create(this, "myidentitypool")
 * .identityPoolName("myidentitypool")
 * .authenticationProviders(IdentityPoolAuthenticationProviders.builder()
 * .google(IdentityPoolGoogleLoginProvider.builder()
 * .clientId("12345678012.apps.googleusercontent.com")
 * .build())
 * .openIdConnectProviders(List.of(openIdConnectProvider))
 * .customProvider("my-custom-provider.example.com")
 * .build())
 * .build();
 * ```
 */
public interface IdentityPoolProps {
  /**
   * Enables the Basic (Classic) authentication flow.
   *
   * Default: - Classic Flow not allowed
   */
  public fun allowClassicFlow(): Boolean? = unwrap(this).getAllowClassicFlow()

  /**
   * Whether the Identity Pool supports unauthenticated logins.
   *
   * Default: - false
   */
  public fun allowUnauthenticatedIdentities(): Boolean? =
      unwrap(this).getAllowUnauthenticatedIdentities()

  /**
   * The default Role to be assumed by authenticated users.
   *
   * Default: - A default authenticated Role will be added
   */
  public fun authenticatedRole(): IRole? = unwrap(this).getAuthenticatedRole()?.let(IRole::wrap)

  /**
   * Authentication Providers for using in Identity Pool.
   *
   * Default: - No Authentication Providers passed directly to Identity Pool
   */
  public fun authenticationProviders(): IdentityPoolAuthenticationProviders? =
      unwrap(this).getAuthenticationProviders()?.let(IdentityPoolAuthenticationProviders::wrap)

  /**
   * The name of the Identity Pool.
   *
   * Default: - Automatically generated name by CloudFormation at deploy time
   */
  public fun identityPoolName(): String? = unwrap(this).getIdentityPoolName()

  /**
   * Rules for mapping roles to users.
   *
   * Default: - no role mappings
   */
  public fun roleMappings(): List<IdentityPoolRoleMapping> =
      unwrap(this).getRoleMappings()?.map(IdentityPoolRoleMapping::wrap) ?: emptyList()

  /**
   * The default Role to be assumed by unauthenticated users.
   *
   * Default: - A default unauthenticated Role will be added
   */
  public fun unauthenticatedRole(): IRole? = unwrap(this).getUnauthenticatedRole()?.let(IRole::wrap)

  /**
   * A builder for [IdentityPoolProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowClassicFlow Enables the Basic (Classic) authentication flow.
     */
    public fun allowClassicFlow(allowClassicFlow: Boolean)

    /**
     * @param allowUnauthenticatedIdentities Whether the Identity Pool supports unauthenticated
     * logins.
     */
    public fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: Boolean)

    /**
     * @param authenticatedRole The default Role to be assumed by authenticated users.
     */
    public fun authenticatedRole(authenticatedRole: IRole)

    /**
     * @param authenticationProviders Authentication Providers for using in Identity Pool.
     */
    public fun authenticationProviders(authenticationProviders: IdentityPoolAuthenticationProviders)

    /**
     * @param authenticationProviders Authentication Providers for using in Identity Pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2ca429a14046ab6a1641bded48a7faf6d048fbdf4582bebab83f99bd58004e3")
    public
        fun authenticationProviders(authenticationProviders: IdentityPoolAuthenticationProviders.Builder.() -> Unit)

    /**
     * @param identityPoolName The name of the Identity Pool.
     */
    public fun identityPoolName(identityPoolName: String)

    /**
     * @param roleMappings Rules for mapping roles to users.
     */
    public fun roleMappings(roleMappings: List<IdentityPoolRoleMapping>)

    /**
     * @param roleMappings Rules for mapping roles to users.
     */
    public fun roleMappings(vararg roleMappings: IdentityPoolRoleMapping)

    /**
     * @param unauthenticatedRole The default Role to be assumed by unauthenticated users.
     */
    public fun unauthenticatedRole(unauthenticatedRole: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProps.Builder =
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProps.builder()

    /**
     * @param allowClassicFlow Enables the Basic (Classic) authentication flow.
     */
    override fun allowClassicFlow(allowClassicFlow: Boolean) {
      cdkBuilder.allowClassicFlow(allowClassicFlow)
    }

    /**
     * @param allowUnauthenticatedIdentities Whether the Identity Pool supports unauthenticated
     * logins.
     */
    override fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: Boolean) {
      cdkBuilder.allowUnauthenticatedIdentities(allowUnauthenticatedIdentities)
    }

    /**
     * @param authenticatedRole The default Role to be assumed by authenticated users.
     */
    override fun authenticatedRole(authenticatedRole: IRole) {
      cdkBuilder.authenticatedRole(authenticatedRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param authenticationProviders Authentication Providers for using in Identity Pool.
     */
    override
        fun authenticationProviders(authenticationProviders: IdentityPoolAuthenticationProviders) {
      cdkBuilder.authenticationProviders(authenticationProviders.let(IdentityPoolAuthenticationProviders.Companion::unwrap))
    }

    /**
     * @param authenticationProviders Authentication Providers for using in Identity Pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2ca429a14046ab6a1641bded48a7faf6d048fbdf4582bebab83f99bd58004e3")
    override
        fun authenticationProviders(authenticationProviders: IdentityPoolAuthenticationProviders.Builder.() -> Unit):
        Unit = authenticationProviders(IdentityPoolAuthenticationProviders(authenticationProviders))

    /**
     * @param identityPoolName The name of the Identity Pool.
     */
    override fun identityPoolName(identityPoolName: String) {
      cdkBuilder.identityPoolName(identityPoolName)
    }

    /**
     * @param roleMappings Rules for mapping roles to users.
     */
    override fun roleMappings(roleMappings: List<IdentityPoolRoleMapping>) {
      cdkBuilder.roleMappings(roleMappings.map(IdentityPoolRoleMapping.Companion::unwrap))
    }

    /**
     * @param roleMappings Rules for mapping roles to users.
     */
    override fun roleMappings(vararg roleMappings: IdentityPoolRoleMapping): Unit =
        roleMappings(roleMappings.toList())

    /**
     * @param unauthenticatedRole The default Role to be assumed by unauthenticated users.
     */
    override fun unauthenticatedRole(unauthenticatedRole: IRole) {
      cdkBuilder.unauthenticatedRole(unauthenticatedRole.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProps,
  ) : CdkObject(cdkObject),
      IdentityPoolProps {
    /**
     * Enables the Basic (Classic) authentication flow.
     *
     * Default: - Classic Flow not allowed
     */
    override fun allowClassicFlow(): Boolean? = unwrap(this).getAllowClassicFlow()

    /**
     * Whether the Identity Pool supports unauthenticated logins.
     *
     * Default: - false
     */
    override fun allowUnauthenticatedIdentities(): Boolean? =
        unwrap(this).getAllowUnauthenticatedIdentities()

    /**
     * The default Role to be assumed by authenticated users.
     *
     * Default: - A default authenticated Role will be added
     */
    override fun authenticatedRole(): IRole? = unwrap(this).getAuthenticatedRole()?.let(IRole::wrap)

    /**
     * Authentication Providers for using in Identity Pool.
     *
     * Default: - No Authentication Providers passed directly to Identity Pool
     */
    override fun authenticationProviders(): IdentityPoolAuthenticationProviders? =
        unwrap(this).getAuthenticationProviders()?.let(IdentityPoolAuthenticationProviders::wrap)

    /**
     * The name of the Identity Pool.
     *
     * Default: - Automatically generated name by CloudFormation at deploy time
     */
    override fun identityPoolName(): String? = unwrap(this).getIdentityPoolName()

    /**
     * Rules for mapping roles to users.
     *
     * Default: - no role mappings
     */
    override fun roleMappings(): List<IdentityPoolRoleMapping> =
        unwrap(this).getRoleMappings()?.map(IdentityPoolRoleMapping::wrap) ?: emptyList()

    /**
     * The default Role to be assumed by unauthenticated users.
     *
     * Default: - A default unauthenticated Role will be added
     */
    override fun unauthenticatedRole(): IRole? =
        unwrap(this).getUnauthenticatedRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): IdentityPoolProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProps):
        IdentityPoolProps = CdkObjectWrappers.wrap(cdkObject) as? IdentityPoolProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IdentityPoolProps):
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProps
  }
}
