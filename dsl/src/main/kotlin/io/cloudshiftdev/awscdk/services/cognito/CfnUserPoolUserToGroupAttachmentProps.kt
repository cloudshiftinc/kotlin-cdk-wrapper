package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnUserPoolUserToGroupAttachmentProps {
  /**
   * The name of the group that you want to add your user to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html#cfn-cognito-userpoolusertogroupattachment-groupname)
   */
  public fun groupName(): String

  /**
   * The user pool ID for the user pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html#cfn-cognito-userpoolusertogroupattachment-userpoolid)
   */
  public fun userPoolId(): String

  /**
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
     * @param userPoolId The user pool ID for the user pool. 
     */
    public fun userPoolId(userPoolId: String)

    /**
     * @param username the value to be set. 
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
     * @param userPoolId The user pool ID for the user pool. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    /**
     * @param username the value to be set. 
     */
    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build():
        software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps,
  ) : CdkObject(cdkObject), CfnUserPoolUserToGroupAttachmentProps {
    /**
     * The name of the group that you want to add your user to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html#cfn-cognito-userpoolusertogroupattachment-groupname)
     */
    override fun groupName(): String = unwrap(this).getGroupName()

    /**
     * The user pool ID for the user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html#cfn-cognito-userpoolusertogroupattachment-userpoolid)
     */
    override fun userPoolId(): String = unwrap(this).getUserPoolId()

    /**
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
        CfnUserPoolUserToGroupAttachmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolUserToGroupAttachmentProps):
        software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps
  }
}
