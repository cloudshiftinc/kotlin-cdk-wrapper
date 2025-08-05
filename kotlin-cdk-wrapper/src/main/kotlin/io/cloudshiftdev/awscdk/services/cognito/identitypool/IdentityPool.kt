@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito.identitypool

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cognito.CfnIdentityPoolRoleAttachment
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a Cognito Identity Pool.
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
public open class IdentityPool(
  cdkObject: software.amazon.awscdk.services.cognito.identitypool.IdentityPool,
) : Resource(cdkObject),
    IIdentityPool {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.cognito.identitypool.IdentityPool(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: IdentityPoolProps,
  ) :
      this(software.amazon.awscdk.services.cognito.identitypool.IdentityPool(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(IdentityPoolProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: IdentityPoolProps.Builder.() -> Unit,
  ) : this(scope, id, IdentityPoolProps(props)
  )

  /**
   * Add a User Pool to the Identity Pool and configure the User Pool client to handle identities.
   *
   * @param userPool 
   */
  public open fun addUserPoolAuthentication(userPool: IUserPoolAuthenticationProvider) {
    unwrap(this).addUserPoolAuthentication(userPool.let(IUserPoolAuthenticationProvider.Companion::unwrap))
  }

  /**
   * Default Role for authenticated users.
   */
  public open fun authenticatedRole(): IRole = unwrap(this).getAuthenticatedRole().let(IRole::wrap)

  /**
   * The ARN of the Identity Pool.
   */
  public override fun identityPoolArn(): String = unwrap(this).getIdentityPoolArn()

  /**
   * The ID of the Identity Pool in the format REGION:GUID.
   */
  public override fun identityPoolId(): String = unwrap(this).getIdentityPoolId()

  /**
   * The name of the Identity Pool.
   */
  public override fun identityPoolName(): String = unwrap(this).getIdentityPoolName()

  /**
   * Role Provider for the default Role for authenticated users.
   */
  public open fun roleAttachment(): CfnIdentityPoolRoleAttachment =
      unwrap(this).getRoleAttachment().let(CfnIdentityPoolRoleAttachment::wrap)

  /**
   * Default Role for unauthenticated users.
   */
  public open fun unauthenticatedRole(): IRole =
      unwrap(this).getUnauthenticatedRole().let(IRole::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.identitypool.IdentityPool].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Enables the Basic (Classic) authentication flow.
     *
     * Default: - Classic Flow not allowed
     *
     * @param allowClassicFlow Enables the Basic (Classic) authentication flow. 
     */
    public fun allowClassicFlow(allowClassicFlow: Boolean)

    /**
     * Whether the Identity Pool supports unauthenticated logins.
     *
     * Default: - false
     *
     * @param allowUnauthenticatedIdentities Whether the Identity Pool supports unauthenticated
     * logins. 
     */
    public fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: Boolean)

    /**
     * The default Role to be assumed by authenticated users.
     *
     * Default: - A default authenticated Role will be added
     *
     * @param authenticatedRole The default Role to be assumed by authenticated users. 
     */
    public fun authenticatedRole(authenticatedRole: IRole)

    /**
     * Authentication Providers for using in Identity Pool.
     *
     * Default: - No Authentication Providers passed directly to Identity Pool
     *
     * @param authenticationProviders Authentication Providers for using in Identity Pool. 
     */
    public fun authenticationProviders(authenticationProviders: IdentityPoolAuthenticationProviders)

    /**
     * Authentication Providers for using in Identity Pool.
     *
     * Default: - No Authentication Providers passed directly to Identity Pool
     *
     * @param authenticationProviders Authentication Providers for using in Identity Pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e83279d693259dc3b158f5ffd5eed98afb58922d8a1c8aaaa10769be1938fbfd")
    public
        fun authenticationProviders(authenticationProviders: IdentityPoolAuthenticationProviders.Builder.() -> Unit)

    /**
     * The name of the Identity Pool.
     *
     * Default: - Automatically generated name by CloudFormation at deploy time
     *
     * @param identityPoolName The name of the Identity Pool. 
     */
    public fun identityPoolName(identityPoolName: String)

    /**
     * Rules for mapping roles to users.
     *
     * Default: - no role mappings
     *
     * @param roleMappings Rules for mapping roles to users. 
     */
    public fun roleMappings(roleMappings: List<IdentityPoolRoleMapping>)

    /**
     * Rules for mapping roles to users.
     *
     * Default: - no role mappings
     *
     * @param roleMappings Rules for mapping roles to users. 
     */
    public fun roleMappings(vararg roleMappings: IdentityPoolRoleMapping)

    /**
     * The default Role to be assumed by unauthenticated users.
     *
     * Default: - A default unauthenticated Role will be added
     *
     * @param unauthenticatedRole The default Role to be assumed by unauthenticated users. 
     */
    public fun unauthenticatedRole(unauthenticatedRole: IRole)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.identitypool.IdentityPool.Builder =
        software.amazon.awscdk.services.cognito.identitypool.IdentityPool.Builder.create(scope, id)

    /**
     * Enables the Basic (Classic) authentication flow.
     *
     * Default: - Classic Flow not allowed
     *
     * @param allowClassicFlow Enables the Basic (Classic) authentication flow. 
     */
    override fun allowClassicFlow(allowClassicFlow: Boolean) {
      cdkBuilder.allowClassicFlow(allowClassicFlow)
    }

    /**
     * Whether the Identity Pool supports unauthenticated logins.
     *
     * Default: - false
     *
     * @param allowUnauthenticatedIdentities Whether the Identity Pool supports unauthenticated
     * logins. 
     */
    override fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: Boolean) {
      cdkBuilder.allowUnauthenticatedIdentities(allowUnauthenticatedIdentities)
    }

    /**
     * The default Role to be assumed by authenticated users.
     *
     * Default: - A default authenticated Role will be added
     *
     * @param authenticatedRole The default Role to be assumed by authenticated users. 
     */
    override fun authenticatedRole(authenticatedRole: IRole) {
      cdkBuilder.authenticatedRole(authenticatedRole.let(IRole.Companion::unwrap))
    }

    /**
     * Authentication Providers for using in Identity Pool.
     *
     * Default: - No Authentication Providers passed directly to Identity Pool
     *
     * @param authenticationProviders Authentication Providers for using in Identity Pool. 
     */
    override
        fun authenticationProviders(authenticationProviders: IdentityPoolAuthenticationProviders) {
      cdkBuilder.authenticationProviders(authenticationProviders.let(IdentityPoolAuthenticationProviders.Companion::unwrap))
    }

    /**
     * Authentication Providers for using in Identity Pool.
     *
     * Default: - No Authentication Providers passed directly to Identity Pool
     *
     * @param authenticationProviders Authentication Providers for using in Identity Pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e83279d693259dc3b158f5ffd5eed98afb58922d8a1c8aaaa10769be1938fbfd")
    override
        fun authenticationProviders(authenticationProviders: IdentityPoolAuthenticationProviders.Builder.() -> Unit):
        Unit = authenticationProviders(IdentityPoolAuthenticationProviders(authenticationProviders))

    /**
     * The name of the Identity Pool.
     *
     * Default: - Automatically generated name by CloudFormation at deploy time
     *
     * @param identityPoolName The name of the Identity Pool. 
     */
    override fun identityPoolName(identityPoolName: String) {
      cdkBuilder.identityPoolName(identityPoolName)
    }

    /**
     * Rules for mapping roles to users.
     *
     * Default: - no role mappings
     *
     * @param roleMappings Rules for mapping roles to users. 
     */
    override fun roleMappings(roleMappings: List<IdentityPoolRoleMapping>) {
      cdkBuilder.roleMappings(roleMappings.map(IdentityPoolRoleMapping.Companion::unwrap))
    }

    /**
     * Rules for mapping roles to users.
     *
     * Default: - no role mappings
     *
     * @param roleMappings Rules for mapping roles to users. 
     */
    override fun roleMappings(vararg roleMappings: IdentityPoolRoleMapping): Unit =
        roleMappings(roleMappings.toList())

    /**
     * The default Role to be assumed by unauthenticated users.
     *
     * Default: - A default unauthenticated Role will be added
     *
     * @param unauthenticatedRole The default Role to be assumed by unauthenticated users. 
     */
    override fun unauthenticatedRole(unauthenticatedRole: IRole) {
      cdkBuilder.unauthenticatedRole(unauthenticatedRole.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.identitypool.IdentityPool =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.cognito.identitypool.IdentityPool.PROPERTY_INJECTION_ID

    public fun fromIdentityPoolArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      identityPoolArn: String,
    ): IIdentityPool =
        software.amazon.awscdk.services.cognito.identitypool.IdentityPool.fromIdentityPoolArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, identityPoolArn).let(IIdentityPool::wrap)

    public fun fromIdentityPoolId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      identityPoolId: String,
    ): IIdentityPool =
        software.amazon.awscdk.services.cognito.identitypool.IdentityPool.fromIdentityPoolId(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, identityPoolId).let(IIdentityPool::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): IdentityPool {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return IdentityPool(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.identitypool.IdentityPool):
        IdentityPool = IdentityPool(cdkObject)

    internal fun unwrap(wrapped: IdentityPool):
        software.amazon.awscdk.services.cognito.identitypool.IdentityPool = wrapped.cdkObject as
        software.amazon.awscdk.services.cognito.identitypool.IdentityPool
  }
}
