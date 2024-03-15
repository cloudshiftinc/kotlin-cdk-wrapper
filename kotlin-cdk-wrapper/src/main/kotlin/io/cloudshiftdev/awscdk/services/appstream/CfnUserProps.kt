@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnUser`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appstream.*;
 * CfnUserProps cfnUserProps = CfnUserProps.builder()
 * .authenticationType("authenticationType")
 * .userName("userName")
 * // the properties below are optional
 * .firstName("firstName")
 * .lastName("lastName")
 * .messageAction("messageAction")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html)
 */
public interface CfnUserProps {
  /**
   * The authentication type for the user.
   *
   * You must specify USERPOOL.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html#cfn-appstream-user-authenticationtype)
   */
  public fun authenticationType(): String

  /**
   * The first name, or given name, of the user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html#cfn-appstream-user-firstname)
   */
  public fun firstName(): String? = unwrap(this).getFirstName()

  /**
   * The last name, or surname, of the user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html#cfn-appstream-user-lastname)
   */
  public fun lastName(): String? = unwrap(this).getLastName()

  /**
   * The action to take for the welcome email that is sent to a user after the user is created in
   * the user pool.
   *
   * If you specify SUPPRESS, no email is sent. If you specify RESEND, do not specify the first name
   * or last name of the user. If the value is null, the email is sent.
   *
   *
   * The temporary password in the welcome email is valid for only 7 days. If users don’t set their
   * passwords within 7 days, you must send them a new welcome email.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html#cfn-appstream-user-messageaction)
   */
  public fun messageAction(): String? = unwrap(this).getMessageAction()

  /**
   * The email address of the user.
   *
   * Users' email addresses are case-sensitive. During login, if they specify an email address that
   * doesn't use the same capitalization as the email address specified when their user pool account
   * was created, a "user does not exist" error message displays.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html#cfn-appstream-user-username)
   */
  public fun userName(): String

  /**
   * A builder for [CfnUserProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authenticationType The authentication type for the user. 
     * You must specify USERPOOL.
     */
    public fun authenticationType(authenticationType: String)

    /**
     * @param firstName The first name, or given name, of the user.
     */
    public fun firstName(firstName: String)

    /**
     * @param lastName The last name, or surname, of the user.
     */
    public fun lastName(lastName: String)

    /**
     * @param messageAction The action to take for the welcome email that is sent to a user after
     * the user is created in the user pool.
     * If you specify SUPPRESS, no email is sent. If you specify RESEND, do not specify the first
     * name or last name of the user. If the value is null, the email is sent.
     *
     *
     * The temporary password in the welcome email is valid for only 7 days. If users don’t set
     * their passwords within 7 days, you must send them a new welcome email.
     */
    public fun messageAction(messageAction: String)

    /**
     * @param userName The email address of the user. 
     * Users' email addresses are case-sensitive. During login, if they specify an email address
     * that doesn't use the same capitalization as the email address specified when their user pool
     * account was created, a "user does not exist" error message displays.
     */
    public fun userName(userName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnUserProps.Builder =
        software.amazon.awscdk.services.appstream.CfnUserProps.builder()

    /**
     * @param authenticationType The authentication type for the user. 
     * You must specify USERPOOL.
     */
    override fun authenticationType(authenticationType: String) {
      cdkBuilder.authenticationType(authenticationType)
    }

    /**
     * @param firstName The first name, or given name, of the user.
     */
    override fun firstName(firstName: String) {
      cdkBuilder.firstName(firstName)
    }

    /**
     * @param lastName The last name, or surname, of the user.
     */
    override fun lastName(lastName: String) {
      cdkBuilder.lastName(lastName)
    }

    /**
     * @param messageAction The action to take for the welcome email that is sent to a user after
     * the user is created in the user pool.
     * If you specify SUPPRESS, no email is sent. If you specify RESEND, do not specify the first
     * name or last name of the user. If the value is null, the email is sent.
     *
     *
     * The temporary password in the welcome email is valid for only 7 days. If users don’t set
     * their passwords within 7 days, you must send them a new welcome email.
     */
    override fun messageAction(messageAction: String) {
      cdkBuilder.messageAction(messageAction)
    }

    /**
     * @param userName The email address of the user. 
     * Users' email addresses are case-sensitive. During login, if they specify an email address
     * that doesn't use the same capitalization as the email address specified when their user pool
     * account was created, a "user does not exist" error message displays.
     */
    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.appstream.CfnUserProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appstream.CfnUserProps,
  ) : CdkObject(cdkObject), CfnUserProps {
    /**
     * The authentication type for the user.
     *
     * You must specify USERPOOL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html#cfn-appstream-user-authenticationtype)
     */
    override fun authenticationType(): String = unwrap(this).getAuthenticationType()

    /**
     * The first name, or given name, of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html#cfn-appstream-user-firstname)
     */
    override fun firstName(): String? = unwrap(this).getFirstName()

    /**
     * The last name, or surname, of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html#cfn-appstream-user-lastname)
     */
    override fun lastName(): String? = unwrap(this).getLastName()

    /**
     * The action to take for the welcome email that is sent to a user after the user is created in
     * the user pool.
     *
     * If you specify SUPPRESS, no email is sent. If you specify RESEND, do not specify the first
     * name or last name of the user. If the value is null, the email is sent.
     *
     *
     * The temporary password in the welcome email is valid for only 7 days. If users don’t set
     * their passwords within 7 days, you must send them a new welcome email.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html#cfn-appstream-user-messageaction)
     */
    override fun messageAction(): String? = unwrap(this).getMessageAction()

    /**
     * The email address of the user.
     *
     * Users' email addresses are case-sensitive. During login, if they specify an email address
     * that doesn't use the same capitalization as the email address specified when their user pool
     * account was created, a "user does not exist" error message displays.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html#cfn-appstream-user-username)
     */
    override fun userName(): String = unwrap(this).getUserName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnUserProps):
        CfnUserProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserProps):
        software.amazon.awscdk.services.appstream.CfnUserProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appstream.CfnUserProps
  }
}
