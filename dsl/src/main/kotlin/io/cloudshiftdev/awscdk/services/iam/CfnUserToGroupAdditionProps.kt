package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnUserToGroupAdditionProps {
  /**
   * The name of the group to update.
   *
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-usertogroupaddition.html#cfn-iam-usertogroupaddition-groupname)
   */
  public fun groupName(): String

  /**
   * A list of the names of the users that you want to add to the group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-usertogroupaddition.html#cfn-iam-usertogroupaddition-users)
   */
  public fun users(): List<String>

  /**
   * A builder for [CfnUserToGroupAdditionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param groupName The name of the group to update. 
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    public fun groupName(groupName: String)

    /**
     * @param users A list of the names of the users that you want to add to the group. 
     */
    public fun users(users: List<String>)

    /**
     * @param users A list of the names of the users that you want to add to the group. 
     */
    public fun users(vararg users: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnUserToGroupAdditionProps.Builder
        = software.amazon.awscdk.services.iam.CfnUserToGroupAdditionProps.builder()

    /**
     * @param groupName The name of the group to update. 
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    /**
     * @param users A list of the names of the users that you want to add to the group. 
     */
    override fun users(users: List<String>) {
      cdkBuilder.users(users)
    }

    /**
     * @param users A list of the names of the users that you want to add to the group. 
     */
    override fun users(vararg users: String): Unit = users(users.toList())

    public fun build(): software.amazon.awscdk.services.iam.CfnUserToGroupAdditionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnUserToGroupAdditionProps,
  ) : CdkObject(cdkObject), CfnUserToGroupAdditionProps {
    /**
     * The name of the group to update.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-usertogroupaddition.html#cfn-iam-usertogroupaddition-groupname)
     */
    override fun groupName(): String = unwrap(this).getGroupName()

    /**
     * A list of the names of the users that you want to add to the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-usertogroupaddition.html#cfn-iam-usertogroupaddition-users)
     */
    override fun users(): List<String> = unwrap(this).getUsers()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserToGroupAdditionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnUserToGroupAdditionProps):
        CfnUserToGroupAdditionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserToGroupAdditionProps):
        software.amazon.awscdk.services.iam.CfnUserToGroupAdditionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.CfnUserToGroupAdditionProps
  }
}
