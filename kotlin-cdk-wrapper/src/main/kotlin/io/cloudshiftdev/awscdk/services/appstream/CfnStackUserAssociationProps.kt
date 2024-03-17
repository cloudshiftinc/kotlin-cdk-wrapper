@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnStackUserAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appstream.*;
 * CfnStackUserAssociationProps cfnStackUserAssociationProps =
 * CfnStackUserAssociationProps.builder()
 * .authenticationType("authenticationType")
 * .stackName("stackName")
 * .userName("userName")
 * // the properties below are optional
 * .sendEmailNotification(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html)
 */
public interface CfnStackUserAssociationProps {
  /**
   * The authentication type for the user who is associated with the stack.
   *
   * You must specify USERPOOL.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-authenticationtype)
   */
  public fun authenticationType(): String

  /**
   * Specifies whether a welcome email is sent to a user after the user is created in the user pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-sendemailnotification)
   */
  public fun sendEmailNotification(): Any? = unwrap(this).getSendEmailNotification()

  /**
   * The name of the stack that is associated with the user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-stackname)
   */
  public fun stackName(): String

  /**
   * The email address of the user who is associated with the stack.
   *
   *
   * Users' email addresses are case-sensitive.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-username)
   */
  public fun userName(): String

  /**
   * A builder for [CfnStackUserAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authenticationType The authentication type for the user who is associated with the
     * stack. 
     * You must specify USERPOOL.
     */
    public fun authenticationType(authenticationType: String)

    /**
     * @param sendEmailNotification Specifies whether a welcome email is sent to a user after the
     * user is created in the user pool.
     */
    public fun sendEmailNotification(sendEmailNotification: Boolean)

    /**
     * @param sendEmailNotification Specifies whether a welcome email is sent to a user after the
     * user is created in the user pool.
     */
    public fun sendEmailNotification(sendEmailNotification: IResolvable)

    /**
     * @param stackName The name of the stack that is associated with the user. 
     */
    public fun stackName(stackName: String)

    /**
     * @param userName The email address of the user who is associated with the stack. 
     *
     * Users' email addresses are case-sensitive.
     */
    public fun userName(userName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps.Builder =
        software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps.builder()

    /**
     * @param authenticationType The authentication type for the user who is associated with the
     * stack. 
     * You must specify USERPOOL.
     */
    override fun authenticationType(authenticationType: String) {
      cdkBuilder.authenticationType(authenticationType)
    }

    /**
     * @param sendEmailNotification Specifies whether a welcome email is sent to a user after the
     * user is created in the user pool.
     */
    override fun sendEmailNotification(sendEmailNotification: Boolean) {
      cdkBuilder.sendEmailNotification(sendEmailNotification)
    }

    /**
     * @param sendEmailNotification Specifies whether a welcome email is sent to a user after the
     * user is created in the user pool.
     */
    override fun sendEmailNotification(sendEmailNotification: IResolvable) {
      cdkBuilder.sendEmailNotification(sendEmailNotification.let(IResolvable::unwrap))
    }

    /**
     * @param stackName The name of the stack that is associated with the user. 
     */
    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    /**
     * @param userName The email address of the user who is associated with the stack. 
     *
     * Users' email addresses are case-sensitive.
     */
    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps,
  ) : CdkObject(cdkObject), CfnStackUserAssociationProps {
    /**
     * The authentication type for the user who is associated with the stack.
     *
     * You must specify USERPOOL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-authenticationtype)
     */
    override fun authenticationType(): String = unwrap(this).getAuthenticationType()

    /**
     * Specifies whether a welcome email is sent to a user after the user is created in the user
     * pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-sendemailnotification)
     */
    override fun sendEmailNotification(): Any? = unwrap(this).getSendEmailNotification()

    /**
     * The name of the stack that is associated with the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-stackname)
     */
    override fun stackName(): String = unwrap(this).getStackName()

    /**
     * The email address of the user who is associated with the stack.
     *
     *
     * Users' email addresses are case-sensitive.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-username)
     */
    override fun userName(): String = unwrap(this).getUserName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStackUserAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps):
        CfnStackUserAssociationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnStackUserAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStackUserAssociationProps):
        software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps
  }
}
