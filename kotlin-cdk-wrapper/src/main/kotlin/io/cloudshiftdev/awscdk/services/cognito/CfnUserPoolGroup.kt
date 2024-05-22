@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A user pool group that you can add a user to.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * CfnUserPoolGroup cfnUserPoolGroup = CfnUserPoolGroup.Builder.create(this, "MyCfnUserPoolGroup")
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
public open class CfnUserPoolGroup(
  cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolGroup,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserPoolGroupProps,
  ) :
      this(software.amazon.awscdk.services.cognito.CfnUserPoolGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnUserPoolGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserPoolGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnUserPoolGroupProps(props)
  )

  /**
   * A string containing the description of the group.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A string containing the description of the group.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The name of the group.
   */
  public open fun groupName(): String? = unwrap(this).getGroupName()

  /**
   * The name of the group.
   */
  public open fun groupName(`value`: String) {
    unwrap(this).setGroupName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A non-negative integer value that specifies the precedence of this group relative to the other
   * groups that a user can belong to in the user pool.
   */
  public open fun precedence(): Number? = unwrap(this).getPrecedence()

  /**
   * A non-negative integer value that specifies the precedence of this group relative to the other
   * groups that a user can belong to in the user pool.
   */
  public open fun precedence(`value`: Number) {
    unwrap(this).setPrecedence(`value`)
  }

  /**
   * The role Amazon Resource Name (ARN) for the group.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The role Amazon Resource Name (ARN) for the group.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * The user pool ID for the user pool.
   */
  public open fun userPoolId(): String = unwrap(this).getUserPoolId()

  /**
   * The user pool ID for the user pool.
   */
  public open fun userPoolId(`value`: String) {
    unwrap(this).setUserPoolId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.CfnUserPoolGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A string containing the description of the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-description)
     * @param description A string containing the description of the group. 
     */
    public fun description(description: String)

    /**
     * The name of the group.
     *
     * Must be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-groupname)
     * @param groupName The name of the group. 
     */
    public fun groupName(groupName: String)

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
     * @param precedence A non-negative integer value that specifies the precedence of this group
     * relative to the other groups that a user can belong to in the user pool. 
     */
    public fun precedence(precedence: Number)

    /**
     * The role Amazon Resource Name (ARN) for the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-rolearn)
     * @param roleArn The role Amazon Resource Name (ARN) for the group. 
     */
    public fun roleArn(roleArn: String)

    /**
     * The user pool ID for the user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-userpoolid)
     * @param userPoolId The user pool ID for the user pool. 
     */
    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnUserPoolGroup.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolGroup.Builder.create(scope, id)

    /**
     * A string containing the description of the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-description)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-groupname)
     * @param groupName The name of the group. 
     */
    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

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
     * @param precedence A non-negative integer value that specifies the precedence of this group
     * relative to the other groups that a user can belong to in the user pool. 
     */
    override fun precedence(precedence: Number) {
      cdkBuilder.precedence(precedence)
    }

    /**
     * The role Amazon Resource Name (ARN) for the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-rolearn)
     * @param roleArn The role Amazon Resource Name (ARN) for the group. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * The user pool ID for the user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-userpoolid)
     * @param userPoolId The user pool ID for the user pool. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cognito.CfnUserPoolGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserPoolGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserPoolGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolGroup):
        CfnUserPoolGroup = CfnUserPoolGroup(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolGroup):
        software.amazon.awscdk.services.cognito.CfnUserPoolGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.cognito.CfnUserPoolGroup
  }
}
