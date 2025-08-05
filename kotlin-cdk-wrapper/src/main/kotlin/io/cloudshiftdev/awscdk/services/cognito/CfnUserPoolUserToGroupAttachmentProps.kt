@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnUserPoolUserToGroupAttachment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * CfnUserPoolUserToGroupAttachmentProps cfnUserPoolUserToGroupAttachmentProps =
 * CfnUserPoolUserToGroupAttachmentProps.builder()
 * .groupName("groupName")
 * .username("username")
 * .userPoolId("userPoolId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html)
 */
public interface CfnUserPoolUserToGroupAttachmentProps {
  /**
   * The name of the group that you want to add your user to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html#cfn-cognito-userpoolusertogroupattachment-groupname)
   */
  public fun groupName(): String

  /**
   * The ID of the user pool that contains the group that you want to add the user to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html#cfn-cognito-userpoolusertogroupattachment-userpoolid)
   */
  public fun userPoolId(): String

  /**
   * The user's username.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html#cfn-cognito-userpoolusertogroupattachment-username)
   */
  public fun username(): String

  /**
   * A builder for [CfnUserPoolUserToGroupAttachmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param groupName The name of the group that you want to add your user to. 
     */
    public fun groupName(groupName: String)

    /**
     * @param userPoolId The ID of the user pool that contains the group that you want to add the
     * user to. 
     */
    public fun userPoolId(userPoolId: String)

    /**
     * @param username The user's username. 
     */
    public fun username(username: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps.builder()

    /**
     * @param groupName The name of the group that you want to add your user to. 
     */
    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    /**
     * @param userPoolId The ID of the user pool that contains the group that you want to add the
     * user to. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    /**
     * @param username The user's username. 
     */
    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build():
        software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps,
  ) : CdkObject(cdkObject),
      CfnUserPoolUserToGroupAttachmentProps {
    /**
     * The name of the group that you want to add your user to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html#cfn-cognito-userpoolusertogroupattachment-groupname)
     */
    override fun groupName(): String = unwrap(this).getGroupName()

    /**
     * The ID of the user pool that contains the group that you want to add the user to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html#cfn-cognito-userpoolusertogroupattachment-userpoolid)
     */
    override fun userPoolId(): String = unwrap(this).getUserPoolId()

    /**
     * The user's username.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html#cfn-cognito-userpoolusertogroupattachment-username)
     */
    override fun username(): String = unwrap(this).getUsername()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnUserPoolUserToGroupAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps):
        CfnUserPoolUserToGroupAttachmentProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnUserPoolUserToGroupAttachmentProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolUserToGroupAttachmentProps):
        software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps
  }
}
