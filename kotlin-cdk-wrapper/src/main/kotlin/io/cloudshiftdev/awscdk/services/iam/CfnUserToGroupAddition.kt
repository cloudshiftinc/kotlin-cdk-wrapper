@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Adds the specified user to the specified group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * CfnUserToGroupAddition cfnUserToGroupAddition = CfnUserToGroupAddition.Builder.create(this,
 * "MyCfnUserToGroupAddition")
 * .groupName("groupName")
 * .users(List.of("users"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-usertogroupaddition.html)
 */
public open class CfnUserToGroupAddition(
  cdkObject: software.amazon.awscdk.services.iam.CfnUserToGroupAddition,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserToGroupAdditionProps,
  ) :
      this(software.amazon.awscdk.services.iam.CfnUserToGroupAddition(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnUserToGroupAdditionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserToGroupAdditionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnUserToGroupAdditionProps(props)
  )

  /**
   * The stable and unique string identifying the group.
   *
   * For more information about IDs, see [IAM
   * identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the *IAM
   * User Guide* .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the group to update.
   */
  public open fun groupName(): String = unwrap(this).getGroupName()

  /**
   * The name of the group to update.
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
   * A list of the names of the users that you want to add to the group.
   */
  public open fun users(): List<String> = unwrap(this).getUsers()

  /**
   * A list of the names of the users that you want to add to the group.
   */
  public open fun users(`value`: List<String>) {
    unwrap(this).setUsers(`value`)
  }

  /**
   * A list of the names of the users that you want to add to the group.
   */
  public open fun users(vararg `value`: String): Unit = users(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iam.CfnUserToGroupAddition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the group to update.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-usertogroupaddition.html#cfn-iam-usertogroupaddition-groupname)
     * @param groupName The name of the group to update. 
     */
    public fun groupName(groupName: String)

    /**
     * A list of the names of the users that you want to add to the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-usertogroupaddition.html#cfn-iam-usertogroupaddition-users)
     * @param users A list of the names of the users that you want to add to the group. 
     */
    public fun users(users: List<String>)

    /**
     * A list of the names of the users that you want to add to the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-usertogroupaddition.html#cfn-iam-usertogroupaddition-users)
     * @param users A list of the names of the users that you want to add to the group. 
     */
    public fun users(vararg users: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnUserToGroupAddition.Builder =
        software.amazon.awscdk.services.iam.CfnUserToGroupAddition.Builder.create(scope, id)

    /**
     * The name of the group to update.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-usertogroupaddition.html#cfn-iam-usertogroupaddition-groupname)
     * @param groupName The name of the group to update. 
     */
    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    /**
     * A list of the names of the users that you want to add to the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-usertogroupaddition.html#cfn-iam-usertogroupaddition-users)
     * @param users A list of the names of the users that you want to add to the group. 
     */
    override fun users(users: List<String>) {
      cdkBuilder.users(users)
    }

    /**
     * A list of the names of the users that you want to add to the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-usertogroupaddition.html#cfn-iam-usertogroupaddition-users)
     * @param users A list of the names of the users that you want to add to the group. 
     */
    override fun users(vararg users: String): Unit = users(users.toList())

    public fun build(): software.amazon.awscdk.services.iam.CfnUserToGroupAddition =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iam.CfnUserToGroupAddition.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserToGroupAddition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserToGroupAddition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnUserToGroupAddition):
        CfnUserToGroupAddition = CfnUserToGroupAddition(cdkObject)

    internal fun unwrap(wrapped: CfnUserToGroupAddition):
        software.amazon.awscdk.services.iam.CfnUserToGroupAddition = wrapped.cdkObject as
        software.amazon.awscdk.services.iam.CfnUserToGroupAddition
  }
}
