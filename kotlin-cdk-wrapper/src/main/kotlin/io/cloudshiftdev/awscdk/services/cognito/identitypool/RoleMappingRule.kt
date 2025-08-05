@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito.identitypool

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

/**
 * Represents an Identity Pool Role Attachment role mapping rule.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.identitypool.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Role role;
 * RoleMappingRule roleMappingRule = RoleMappingRule.builder()
 * .claim("claim")
 * .claimValue("claimValue")
 * .mappedRole(role)
 * // the properties below are optional
 * .matchType(RoleMappingMatchType.EQUALS)
 * .build();
 * ```
 */
public interface RoleMappingRule {
  /**
   * The key sent in the token by the federated Identity Provider.
   */
  public fun claim(): String

  /**
   * The value of the claim that must be matched.
   */
  public fun claimValue(): String

  /**
   * The role to be assumed when the claim value is matched.
   */
  public fun mappedRole(): IRole

  /**
   * How to match with the claim value.
   *
   * Default: RoleMappingMatchType.EQUALS
   */
  public fun matchType(): RoleMappingMatchType? =
      unwrap(this).getMatchType()?.let(RoleMappingMatchType::wrap)

  /**
   * A builder for [RoleMappingRule]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param claim The key sent in the token by the federated Identity Provider. 
     */
    public fun claim(claim: String)

    /**
     * @param claimValue The value of the claim that must be matched. 
     */
    public fun claimValue(claimValue: String)

    /**
     * @param mappedRole The role to be assumed when the claim value is matched. 
     */
    public fun mappedRole(mappedRole: IRole)

    /**
     * @param matchType How to match with the claim value.
     */
    public fun matchType(matchType: RoleMappingMatchType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.identitypool.RoleMappingRule.Builder =
        software.amazon.awscdk.services.cognito.identitypool.RoleMappingRule.builder()

    /**
     * @param claim The key sent in the token by the federated Identity Provider. 
     */
    override fun claim(claim: String) {
      cdkBuilder.claim(claim)
    }

    /**
     * @param claimValue The value of the claim that must be matched. 
     */
    override fun claimValue(claimValue: String) {
      cdkBuilder.claimValue(claimValue)
    }

    /**
     * @param mappedRole The role to be assumed when the claim value is matched. 
     */
    override fun mappedRole(mappedRole: IRole) {
      cdkBuilder.mappedRole(mappedRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param matchType How to match with the claim value.
     */
    override fun matchType(matchType: RoleMappingMatchType) {
      cdkBuilder.matchType(matchType.let(RoleMappingMatchType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.identitypool.RoleMappingRule =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.identitypool.RoleMappingRule,
  ) : CdkObject(cdkObject),
      RoleMappingRule {
    /**
     * The key sent in the token by the federated Identity Provider.
     */
    override fun claim(): String = unwrap(this).getClaim()

    /**
     * The value of the claim that must be matched.
     */
    override fun claimValue(): String = unwrap(this).getClaimValue()

    /**
     * The role to be assumed when the claim value is matched.
     */
    override fun mappedRole(): IRole = unwrap(this).getMappedRole().let(IRole::wrap)

    /**
     * How to match with the claim value.
     *
     * Default: RoleMappingMatchType.EQUALS
     */
    override fun matchType(): RoleMappingMatchType? =
        unwrap(this).getMatchType()?.let(RoleMappingMatchType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RoleMappingRule {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.identitypool.RoleMappingRule):
        RoleMappingRule = CdkObjectWrappers.wrap(cdkObject) as? RoleMappingRule ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RoleMappingRule):
        software.amazon.awscdk.services.cognito.identitypool.RoleMappingRule = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.identitypool.RoleMappingRule
  }
}
