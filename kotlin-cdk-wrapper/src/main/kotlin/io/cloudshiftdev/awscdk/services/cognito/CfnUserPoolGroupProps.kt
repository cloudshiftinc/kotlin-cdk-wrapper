@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnUserPoolGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * CfnUserPoolGroupProps cfnUserPoolGroupProps = CfnUserPoolGroupProps.builder()
 * .userPoolId("userPoolId")
 * // the properties below are optional
 * .description("description")
 * .groupName("groupName")
 * .precedence(123)
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html)
 */
public interface CfnUserPoolGroupProps {
  /**
   * A string containing the description of the group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the group.
   *
   * Must be unique.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-groupname)
   */
  public fun groupName(): String? = unwrap(this).getGroupName()

  /**
   * A non-negative integer value that specifies the precedence of this group relative to the other
   * groups that a user can belong to in the user pool.
   *
   * Zero is the highest precedence value. Groups with lower `Precedence` values take precedence
   * over groups with higher or null `Precedence` values. If a user belongs to two or more groups, it
   * is the group with the lowest precedence value whose role ARN is given in the user's tokens for the
   * `cognito:roles` and `cognito:preferred_role` claims.
   *
   * Two groups can have the same `Precedence` value. If this happens, neither group takes
   * precedence over the other. If two groups with the same `Precedence` have the same role ARN, that
   * role is used in the `cognito:preferred_role` claim in tokens for users in each group. If the two
   * groups have different role ARNs, the `cognito:preferred_role` claim isn't set in users' tokens.
   *
   * The default `Precedence` value is null. The maximum `Precedence` value is `2^31-1` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-precedence)
   */
  public fun precedence(): Number? = unwrap(this).getPrecedence()

  /**
   * The role Amazon Resource Name (ARN) for the group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The user pool ID for the user pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-userpoolid)
   */
  public fun userPoolId(): String

  /**
   * A builder for [CfnUserPoolGroupProps]
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
     * Zero is the highest precedence value. Groups with lower `Precedence` values take precedence
     * over groups with higher or null `Precedence` values. If a user belongs to two or more groups, it
     * is the group with the lowest precedence value whose role ARN is given in the user's tokens for
     * the `cognito:roles` and `cognito:preferred_role` claims.
     *
     * Two groups can have the same `Precedence` value. If this happens, neither group takes
     * precedence over the other. If two groups with the same `Precedence` have the same role ARN, that
     * role is used in the `cognito:preferred_role` claim in tokens for users in each group. If the two
     * groups have different role ARNs, the `cognito:preferred_role` claim isn't set in users' tokens.
     *
     * The default `Precedence` value is null. The maximum `Precedence` value is `2^31-1` .
     */
    public fun precedence(precedence: Number)

    /**
     * @param roleArn The role Amazon Resource Name (ARN) for the group.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param userPoolId The user pool ID for the user pool. 
     */
    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps.builder()

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
     * Zero is the highest precedence value. Groups with lower `Precedence` values take precedence
     * over groups with higher or null `Precedence` values. If a user belongs to two or more groups, it
     * is the group with the lowest precedence value whose role ARN is given in the user's tokens for
     * the `cognito:roles` and `cognito:preferred_role` claims.
     *
     * Two groups can have the same `Precedence` value. If this happens, neither group takes
     * precedence over the other. If two groups with the same `Precedence` have the same role ARN, that
     * role is used in the `cognito:preferred_role` claim in tokens for users in each group. If the two
     * groups have different role ARNs, the `cognito:preferred_role` claim isn't set in users' tokens.
     *
     * The default `Precedence` value is null. The maximum `Precedence` value is `2^31-1` .
     */
    override fun precedence(precedence: Number) {
      cdkBuilder.precedence(precedence)
    }

    /**
     * @param roleArn The role Amazon Resource Name (ARN) for the group.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param userPoolId The user pool ID for the user pool. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps,
  ) : CdkObject(cdkObject),
      CfnUserPoolGroupProps {
    /**
     * A string containing the description of the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the group.
     *
     * Must be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-groupname)
     */
    override fun groupName(): String? = unwrap(this).getGroupName()

    /**
     * A non-negative integer value that specifies the precedence of this group relative to the
     * other groups that a user can belong to in the user pool.
     *
     * Zero is the highest precedence value. Groups with lower `Precedence` values take precedence
     * over groups with higher or null `Precedence` values. If a user belongs to two or more groups, it
     * is the group with the lowest precedence value whose role ARN is given in the user's tokens for
     * the `cognito:roles` and `cognito:preferred_role` claims.
     *
     * Two groups can have the same `Precedence` value. If this happens, neither group takes
     * precedence over the other. If two groups with the same `Precedence` have the same role ARN, that
     * role is used in the `cognito:preferred_role` claim in tokens for users in each group. If the two
     * groups have different role ARNs, the `cognito:preferred_role` claim isn't set in users' tokens.
     *
     * The default `Precedence` value is null. The maximum `Precedence` value is `2^31-1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-precedence)
     */
    override fun precedence(): Number? = unwrap(this).getPrecedence()

    /**
     * The role Amazon Resource Name (ARN) for the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * The user pool ID for the user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-userpoolid)
     */
    override fun userPoolId(): String = unwrap(this).getUserPoolId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserPoolGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps):
        CfnUserPoolGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnUserPoolGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolGroupProps):
        software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps
  }
}
