@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::AppStream::User` resource creates a new user in the AppStream 2.0 user pool.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appstream.*;
 * CfnUser cfnUser = CfnUser.Builder.create(this, "MyCfnUser")
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
public open class CfnUser internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appstream.CfnUser,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserProps,
  ) :
      this(software.amazon.awscdk.services.appstream.CfnUser(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnUserProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserProps.Builder.() -> Unit,
  ) : this(scope, id, CfnUserProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The authentication type for the user.
   */
  public open fun authenticationType(): String = unwrap(this).getAuthenticationType()

  /**
   * The authentication type for the user.
   */
  public open fun authenticationType(`value`: String) {
    unwrap(this).setAuthenticationType(`value`)
  }

  /**
   * The first name, or given name, of the user.
   */
  public open fun firstName(): String? = unwrap(this).getFirstName()

  /**
   * The first name, or given name, of the user.
   */
  public open fun firstName(`value`: String) {
    unwrap(this).setFirstName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The last name, or surname, of the user.
   */
  public open fun lastName(): String? = unwrap(this).getLastName()

  /**
   * The last name, or surname, of the user.
   */
  public open fun lastName(`value`: String) {
    unwrap(this).setLastName(`value`)
  }

  /**
   * The action to take for the welcome email that is sent to a user after the user is created in
   * the user pool.
   */
  public open fun messageAction(): String? = unwrap(this).getMessageAction()

  /**
   * The action to take for the welcome email that is sent to a user after the user is created in
   * the user pool.
   */
  public open fun messageAction(`value`: String) {
    unwrap(this).setMessageAction(`value`)
  }

  /**
   * The email address of the user.
   */
  public open fun userName(): String = unwrap(this).getUserName()

  /**
   * The email address of the user.
   */
  public open fun userName(`value`: String) {
    unwrap(this).setUserName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appstream.CfnUser].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The authentication type for the user.
     *
     * You must specify USERPOOL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html#cfn-appstream-user-authenticationtype)
     * @param authenticationType The authentication type for the user. 
     */
    public fun authenticationType(authenticationType: String)

    /**
     * The first name, or given name, of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html#cfn-appstream-user-firstname)
     * @param firstName The first name, or given name, of the user. 
     */
    public fun firstName(firstName: String)

    /**
     * The last name, or surname, of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html#cfn-appstream-user-lastname)
     * @param lastName The last name, or surname, of the user. 
     */
    public fun lastName(lastName: String)

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
     * @param messageAction The action to take for the welcome email that is sent to a user after
     * the user is created in the user pool. 
     */
    public fun messageAction(messageAction: String)

    /**
     * The email address of the user.
     *
     * Users' email addresses are case-sensitive. During login, if they specify an email address
     * that doesn't use the same capitalization as the email address specified when their user pool
     * account was created, a "user does not exist" error message displays.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html#cfn-appstream-user-username)
     * @param userName The email address of the user. 
     */
    public fun userName(userName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnUser.Builder =
        software.amazon.awscdk.services.appstream.CfnUser.Builder.create(scope, id)

    /**
     * The authentication type for the user.
     *
     * You must specify USERPOOL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html#cfn-appstream-user-authenticationtype)
     * @param authenticationType The authentication type for the user. 
     */
    override fun authenticationType(authenticationType: String) {
      cdkBuilder.authenticationType(authenticationType)
    }

    /**
     * The first name, or given name, of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html#cfn-appstream-user-firstname)
     * @param firstName The first name, or given name, of the user. 
     */
    override fun firstName(firstName: String) {
      cdkBuilder.firstName(firstName)
    }

    /**
     * The last name, or surname, of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html#cfn-appstream-user-lastname)
     * @param lastName The last name, or surname, of the user. 
     */
    override fun lastName(lastName: String) {
      cdkBuilder.lastName(lastName)
    }

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
     * @param messageAction The action to take for the welcome email that is sent to a user after
     * the user is created in the user pool. 
     */
    override fun messageAction(messageAction: String) {
      cdkBuilder.messageAction(messageAction)
    }

    /**
     * The email address of the user.
     *
     * Users' email addresses are case-sensitive. During login, if they specify an email address
     * that doesn't use the same capitalization as the email address specified when their user pool
     * account was created, a "user does not exist" error message displays.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html#cfn-appstream-user-username)
     * @param userName The email address of the user. 
     */
    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.appstream.CfnUser = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appstream.CfnUser.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUser {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUser(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnUser): CfnUser =
        CfnUser(cdkObject)

    internal fun unwrap(wrapped: CfnUser): software.amazon.awscdk.services.appstream.CfnUser =
        wrapped.cdkObject
  }
}
