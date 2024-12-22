@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Props for UserPoolGroup construct.
 *
 * Example:
 *
 * ```
 * UserPool userPool;
 * Role role;
 * UserPoolGroup.Builder.create(this, "UserPoolGroup")
 * .userPool(userPool)
 * .groupName("my-group-name")
 * .precedence(1)
 * .role(role)
 * .build();
 * // You can also add a group by using addGroup method.
 * userPool.addGroup("AnotherUserPoolGroup", UserPoolGroupOptions.builder()
 * .groupName("another-group-name")
 * .build());
 * ```
 */
public interface UserPoolGroupProps : UserPoolGroupOptions {
  /**
   * The user pool to which this group is associated.
   */
  public fun userPool(): IUserPool

  /**
   * A builder for [UserPoolGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A string containing the description of the group.
     */
    public fun description(description: String)

    /**
     * @param groupName The name of the group.
     * Must be unique.
     */
    public fun groupName(groupName: String)

    /**
     * @param precedence A non-negative integer value that specifies the precedence of this group
     * relative to the other groups that a user can belong to in the user pool.
     * Zero is the highest precedence value.
     *
     * Groups with lower Precedence values take precedence over groups with higher or null
     * Precedence values.
     * If a user belongs to two or more groups, it is the group with the lowest precedence value
     * whose role ARN is given in the user's tokens for the cognito:roles and cognito:preferred_role
     * claims.
     *
     * Two groups can have the same Precedence value. If this happens, neither group takes
     * precedence over the other.
     * If two groups with the same Precedence have the same role ARN, that role is used in the
     * cognito:preferred_role
     * claim in tokens for users in each group.
     * If the two groups have different role ARNs, the cognito:preferred_role claim isn't set in
     * users' tokens.
     */
    public fun precedence(precedence: Number)

    /**
     * @param role The role for the group.
     */
    public fun role(role: IRole)

    /**
     * @param userPool The user pool to which this group is associated. 
     */
    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPoolGroupProps.Builder =
        software.amazon.awscdk.services.cognito.UserPoolGroupProps.builder()

    /**
     * @param description A string containing the description of the group.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param groupName The name of the group.
     * Must be unique.
     */
    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    /**
     * @param precedence A non-negative integer value that specifies the precedence of this group
     * relative to the other groups that a user can belong to in the user pool.
     * Zero is the highest precedence value.
     *
     * Groups with lower Precedence values take precedence over groups with higher or null
     * Precedence values.
     * If a user belongs to two or more groups, it is the group with the lowest precedence value
     * whose role ARN is given in the user's tokens for the cognito:roles and cognito:preferred_role
     * claims.
     *
     * Two groups can have the same Precedence value. If this happens, neither group takes
     * precedence over the other.
     * If two groups with the same Precedence have the same role ARN, that role is used in the
     * cognito:preferred_role
     * claim in tokens for users in each group.
     * If the two groups have different role ARNs, the cognito:preferred_role claim isn't set in
     * users' tokens.
     */
    override fun precedence(precedence: Number) {
      cdkBuilder.precedence(precedence)
    }

    /**
     * @param role The role for the group.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * @param userPool The user pool to which this group is associated. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.UserPoolGroupProps,
  ) : CdkObject(cdkObject),
      UserPoolGroupProps {
    /**
     * A string containing the description of the group.
     *
     * Default: - no description
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the group.
     *
     * Must be unique.
     *
     * Default: - auto generate a name
     */
    override fun groupName(): String? = unwrap(this).getGroupName()

    /**
     * A non-negative integer value that specifies the precedence of this group relative to the
     * other groups that a user can belong to in the user pool.
     *
     * Zero is the highest precedence value.
     *
     * Groups with lower Precedence values take precedence over groups with higher or null
     * Precedence values.
     * If a user belongs to two or more groups, it is the group with the lowest precedence value
     * whose role ARN is given in the user's tokens for the cognito:roles and cognito:preferred_role
     * claims.
     *
     * Two groups can have the same Precedence value. If this happens, neither group takes
     * precedence over the other.
     * If two groups with the same Precedence have the same role ARN, that role is used in the
     * cognito:preferred_role
     * claim in tokens for users in each group.
     * If the two groups have different role ARNs, the cognito:preferred_role claim isn't set in
     * users' tokens.
     *
     * Default: - null
     */
    override fun precedence(): Number? = unwrap(this).getPrecedence()

    /**
     * The role for the group.
     *
     * Default: - no description
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The user pool to which this group is associated.
     */
    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolGroupProps):
        UserPoolGroupProps = CdkObjectWrappers.wrap(cdkObject) as? UserPoolGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolGroupProps):
        software.amazon.awscdk.services.cognito.UserPoolGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.UserPoolGroupProps
  }
}
