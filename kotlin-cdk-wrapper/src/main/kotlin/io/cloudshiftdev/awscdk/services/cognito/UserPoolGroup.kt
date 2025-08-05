@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a user pool group.
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
public open class UserPoolGroup(
  cdkObject: software.amazon.awscdk.services.cognito.UserPoolGroup,
) : Resource(cdkObject),
    IUserPoolGroup {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: UserPoolGroupProps,
  ) :
      this(software.amazon.awscdk.services.cognito.UserPoolGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(UserPoolGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: UserPoolGroupProps.Builder.() -> Unit,
  ) : this(scope, id, UserPoolGroupProps(props)
  )

  /**
   * The user group name.
   */
  public override fun groupName(): String = unwrap(this).getGroupName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.UserPoolGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A string containing the description of the group.
     *
     * Default: - no description
     *
     * @param description A string containing the description of the group. 
     */
    public fun description(description: String)

    /**
     * The name of the group.
     *
     * Must be unique.
     *
     * Default: - auto generate a name
     *
     * @param groupName The name of the group. 
     */
    public fun groupName(groupName: String)

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
     *
     * @param precedence A non-negative integer value that specifies the precedence of this group
     * relative to the other groups that a user can belong to in the user pool. 
     */
    public fun precedence(precedence: Number)

    /**
     * The role for the group.
     *
     * Default: - no description
     *
     * @param role The role for the group. 
     */
    public fun role(role: IRole)

    /**
     * The user pool to which this group is associated.
     *
     * @param userPool The user pool to which this group is associated. 
     */
    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPoolGroup.Builder =
        software.amazon.awscdk.services.cognito.UserPoolGroup.Builder.create(scope, id)

    /**
     * A string containing the description of the group.
     *
     * Default: - no description
     *
     * @param description A string containing the description of the group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the group.
     *
     * Must be unique.
     *
     * Default: - auto generate a name
     *
     * @param groupName The name of the group. 
     */
    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

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
     *
     * @param precedence A non-negative integer value that specifies the precedence of this group
     * relative to the other groups that a user can belong to in the user pool. 
     */
    override fun precedence(precedence: Number) {
      cdkBuilder.precedence(precedence)
    }

    /**
     * The role for the group.
     *
     * Default: - no description
     *
     * @param role The role for the group. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * The user pool to which this group is associated.
     *
     * @param userPool The user pool to which this group is associated. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolGroup = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.cognito.UserPoolGroup.PROPERTY_INJECTION_ID

    public fun fromGroupName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      groupName: String,
    ): IUserPoolGroup =
        software.amazon.awscdk.services.cognito.UserPoolGroup.fromGroupName(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, groupName).let(IUserPoolGroup::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): UserPoolGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return UserPoolGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolGroup):
        UserPoolGroup = UserPoolGroup(cdkObject)

    internal fun unwrap(wrapped: UserPoolGroup):
        software.amazon.awscdk.services.cognito.UserPoolGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.cognito.UserPoolGroup
  }
}
