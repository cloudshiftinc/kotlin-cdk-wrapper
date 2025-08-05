@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito.identitypool

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Map roles to users in the Identity Pool based on claims from the Identity Provider.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.identitypool.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * IdentityPoolProviderUrl identityPoolProviderUrl;
 * Role role;
 * IdentityPoolRoleMapping identityPoolRoleMapping = IdentityPoolRoleMapping.builder()
 * .providerUrl(identityPoolProviderUrl)
 * // the properties below are optional
 * .mappingKey("mappingKey")
 * .resolveAmbiguousRoles(false)
 * .rules(List.of(RoleMappingRule.builder()
 * .claim("claim")
 * .claimValue("claimValue")
 * .mappedRole(role)
 * // the properties below are optional
 * .matchType(RoleMappingMatchType.EQUALS)
 * .build()))
 * .useToken(false)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html)
 */
public interface IdentityPoolRoleMapping {
  /**
   * The key used for the role mapping in the role mapping hash.
   *
   * Required if the providerUrl is a token.
   *
   * Default: - The provided providerUrl
   */
  public fun mappingKey(): String? = unwrap(this).getMappingKey()

  /**
   * The url of the Provider for which the role is mapped.
   */
  public fun providerUrl(): IdentityPoolProviderUrl

  /**
   * Allow for role assumption when results of role mapping are ambiguous.
   *
   * Default: false - Ambiguous role resolutions will lead to requester being denied
   */
  public fun resolveAmbiguousRoles(): Boolean? = unwrap(this).getResolveAmbiguousRoles()

  /**
   * The claim and value that must be matched in order to assume the role.
   *
   * Required if useToken is false
   *
   * Default: - No role mapping rule
   */
  public fun rules(): List<RoleMappingRule> = unwrap(this).getRules()?.map(RoleMappingRule::wrap) ?:
      emptyList()

  /**
   * If true then mapped roles must be passed through the cognito:roles or cognito:preferred_role
   * claims from Identity Provider.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/role-based-access-control.html#using-tokens-to-assign-roles-to-users)
   */
  public fun useToken(): Boolean? = unwrap(this).getUseToken()

  /**
   * A builder for [IdentityPoolRoleMapping]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param mappingKey The key used for the role mapping in the role mapping hash.
     * Required if the providerUrl is a token.
     */
    public fun mappingKey(mappingKey: String)

    /**
     * @param providerUrl The url of the Provider for which the role is mapped. 
     */
    public fun providerUrl(providerUrl: IdentityPoolProviderUrl)

    /**
     * @param resolveAmbiguousRoles Allow for role assumption when results of role mapping are
     * ambiguous.
     */
    public fun resolveAmbiguousRoles(resolveAmbiguousRoles: Boolean)

    /**
     * @param rules The claim and value that must be matched in order to assume the role.
     * Required if useToken is false
     */
    public fun rules(rules: List<RoleMappingRule>)

    /**
     * @param rules The claim and value that must be matched in order to assume the role.
     * Required if useToken is false
     */
    public fun rules(vararg rules: RoleMappingRule)

    /**
     * @param useToken If true then mapped roles must be passed through the cognito:roles or
     * cognito:preferred_role claims from Identity Provider.
     */
    public fun useToken(useToken: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolRoleMapping.Builder =
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolRoleMapping.builder()

    /**
     * @param mappingKey The key used for the role mapping in the role mapping hash.
     * Required if the providerUrl is a token.
     */
    override fun mappingKey(mappingKey: String) {
      cdkBuilder.mappingKey(mappingKey)
    }

    /**
     * @param providerUrl The url of the Provider for which the role is mapped. 
     */
    override fun providerUrl(providerUrl: IdentityPoolProviderUrl) {
      cdkBuilder.providerUrl(providerUrl.let(IdentityPoolProviderUrl.Companion::unwrap))
    }

    /**
     * @param resolveAmbiguousRoles Allow for role assumption when results of role mapping are
     * ambiguous.
     */
    override fun resolveAmbiguousRoles(resolveAmbiguousRoles: Boolean) {
      cdkBuilder.resolveAmbiguousRoles(resolveAmbiguousRoles)
    }

    /**
     * @param rules The claim and value that must be matched in order to assume the role.
     * Required if useToken is false
     */
    override fun rules(rules: List<RoleMappingRule>) {
      cdkBuilder.rules(rules.map(RoleMappingRule.Companion::unwrap))
    }

    /**
     * @param rules The claim and value that must be matched in order to assume the role.
     * Required if useToken is false
     */
    override fun rules(vararg rules: RoleMappingRule): Unit = rules(rules.toList())

    /**
     * @param useToken If true then mapped roles must be passed through the cognito:roles or
     * cognito:preferred_role claims from Identity Provider.
     */
    override fun useToken(useToken: Boolean) {
      cdkBuilder.useToken(useToken)
    }

    public fun build(): software.amazon.awscdk.services.cognito.identitypool.IdentityPoolRoleMapping
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.identitypool.IdentityPoolRoleMapping,
  ) : CdkObject(cdkObject),
      IdentityPoolRoleMapping {
    /**
     * The key used for the role mapping in the role mapping hash.
     *
     * Required if the providerUrl is a token.
     *
     * Default: - The provided providerUrl
     */
    override fun mappingKey(): String? = unwrap(this).getMappingKey()

    /**
     * The url of the Provider for which the role is mapped.
     */
    override fun providerUrl(): IdentityPoolProviderUrl =
        unwrap(this).getProviderUrl().let(IdentityPoolProviderUrl::wrap)

    /**
     * Allow for role assumption when results of role mapping are ambiguous.
     *
     * Default: false - Ambiguous role resolutions will lead to requester being denied
     */
    override fun resolveAmbiguousRoles(): Boolean? = unwrap(this).getResolveAmbiguousRoles()

    /**
     * The claim and value that must be matched in order to assume the role.
     *
     * Required if useToken is false
     *
     * Default: - No role mapping rule
     */
    override fun rules(): List<RoleMappingRule> =
        unwrap(this).getRules()?.map(RoleMappingRule::wrap) ?: emptyList()

    /**
     * If true then mapped roles must be passed through the cognito:roles or cognito:preferred_role
     * claims from Identity Provider.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/role-based-access-control.html#using-tokens-to-assign-roles-to-users)
     */
    override fun useToken(): Boolean? = unwrap(this).getUseToken()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): IdentityPoolRoleMapping {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.identitypool.IdentityPoolRoleMapping):
        IdentityPoolRoleMapping = CdkObjectWrappers.wrap(cdkObject) as? IdentityPoolRoleMapping ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IdentityPoolRoleMapping):
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolRoleMapping = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolRoleMapping
  }
}
