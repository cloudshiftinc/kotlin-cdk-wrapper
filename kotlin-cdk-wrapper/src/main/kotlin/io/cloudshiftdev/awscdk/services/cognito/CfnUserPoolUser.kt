@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Cognito::UserPoolUser` resource creates an Amazon Cognito user pool user.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * CfnUserPoolUser cfnUserPoolUser = CfnUserPoolUser.Builder.create(this, "MyCfnUserPoolUser")
 * .userPoolId("userPoolId")
 * // the properties below are optional
 * .clientMetadata(Map.of(
 * "clientMetadataKey", "clientMetadata"))
 * .desiredDeliveryMediums(List.of("desiredDeliveryMediums"))
 * .forceAliasCreation(false)
 * .messageAction("messageAction")
 * .userAttributes(List.of(AttributeTypeProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .username("username")
 * .validationData(List.of(AttributeTypeProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html)
 */
public open class CfnUserPoolUser(
  cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolUser,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserPoolUserProps,
  ) :
      this(software.amazon.awscdk.services.cognito.CfnUserPoolUser(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnUserPoolUserProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserPoolUserProps.Builder.() -> Unit,
  ) : this(scope, id, CfnUserPoolUserProps(props)
  )

  /**
   * A map of custom key-value pairs that you can provide as input for any custom workflows that
   * this action triggers.
   */
  public open fun clientMetadata(): Any? = unwrap(this).getClientMetadata()

  /**
   * A map of custom key-value pairs that you can provide as input for any custom workflows that
   * this action triggers.
   */
  public open fun clientMetadata(`value`: IResolvable) {
    unwrap(this).setClientMetadata(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A map of custom key-value pairs that you can provide as input for any custom workflows that
   * this action triggers.
   */
  public open fun clientMetadata(`value`: Map<String, String>) {
    unwrap(this).setClientMetadata(`value`)
  }

  /**
   * Specify `"EMAIL"` if email will be used to send the welcome message.
   */
  public open fun desiredDeliveryMediums(): List<String> = unwrap(this).getDesiredDeliveryMediums()
      ?: emptyList()

  /**
   * Specify `"EMAIL"` if email will be used to send the welcome message.
   */
  public open fun desiredDeliveryMediums(`value`: List<String>) {
    unwrap(this).setDesiredDeliveryMediums(`value`)
  }

  /**
   * Specify `"EMAIL"` if email will be used to send the welcome message.
   */
  public open fun desiredDeliveryMediums(vararg `value`: String): Unit =
      desiredDeliveryMediums(`value`.toList())

  /**
   * This parameter is used only if the `phone_number_verified` or `email_verified` attribute is set
   * to `True` .
   */
  public open fun forceAliasCreation(): Any? = unwrap(this).getForceAliasCreation()

  /**
   * This parameter is used only if the `phone_number_verified` or `email_verified` attribute is set
   * to `True` .
   */
  public open fun forceAliasCreation(`value`: Boolean) {
    unwrap(this).setForceAliasCreation(`value`)
  }

  /**
   * This parameter is used only if the `phone_number_verified` or `email_verified` attribute is set
   * to `True` .
   */
  public open fun forceAliasCreation(`value`: IResolvable) {
    unwrap(this).setForceAliasCreation(`value`.let(IResolvable.Companion::unwrap))
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
   * Set to `RESEND` to resend the invitation message to a user that already exists and reset the
   * expiration limit on the user's account.
   */
  public open fun messageAction(): String? = unwrap(this).getMessageAction()

  /**
   * Set to `RESEND` to resend the invitation message to a user that already exists and reset the
   * expiration limit on the user's account.
   */
  public open fun messageAction(`value`: String) {
    unwrap(this).setMessageAction(`value`)
  }

  /**
   * An array of name-value pairs that contain user attributes and attribute values.
   */
  public open fun userAttributes(): Any? = unwrap(this).getUserAttributes()

  /**
   * An array of name-value pairs that contain user attributes and attribute values.
   */
  public open fun userAttributes(`value`: IResolvable) {
    unwrap(this).setUserAttributes(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An array of name-value pairs that contain user attributes and attribute values.
   */
  public open fun userAttributes(`value`: List<Any>) {
    unwrap(this).setUserAttributes(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * An array of name-value pairs that contain user attributes and attribute values.
   */
  public open fun userAttributes(vararg `value`: Any): Unit = userAttributes(`value`.toList())

  /**
   * The user pool ID for the user pool where the user will be created.
   */
  public open fun userPoolId(): String = unwrap(this).getUserPoolId()

  /**
   * The user pool ID for the user pool where the user will be created.
   */
  public open fun userPoolId(`value`: String) {
    unwrap(this).setUserPoolId(`value`)
  }

  /**
   * The value that you want to set as the username sign-in attribute.
   */
  public open fun username(): String? = unwrap(this).getUsername()

  /**
   * The value that you want to set as the username sign-in attribute.
   */
  public open fun username(`value`: String) {
    unwrap(this).setUsername(`value`)
  }

  /**
   * Temporary user attributes that contribute to the outcomes of your pre sign-up Lambda trigger.
   */
  public open fun validationData(): Any? = unwrap(this).getValidationData()

  /**
   * Temporary user attributes that contribute to the outcomes of your pre sign-up Lambda trigger.
   */
  public open fun validationData(`value`: IResolvable) {
    unwrap(this).setValidationData(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Temporary user attributes that contribute to the outcomes of your pre sign-up Lambda trigger.
   */
  public open fun validationData(`value`: List<Any>) {
    unwrap(this).setValidationData(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Temporary user attributes that contribute to the outcomes of your pre sign-up Lambda trigger.
   */
  public open fun validationData(vararg `value`: Any): Unit = validationData(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.CfnUserPoolUser].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A map of custom key-value pairs that you can provide as input for any custom workflows that
     * this action triggers.
     *
     * You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you
     * use the AdminCreateUser API action, Amazon Cognito invokes the function that is assigned to the
     * *pre sign-up* trigger. When Amazon Cognito invokes this function, it passes a JSON payload,
     * which the function receives as input. This payload contains a `clientMetadata` attribute, which
     * provides the data that you assigned to the ClientMetadata parameter in your AdminCreateUser
     * request. In your function code in AWS Lambda , you can process the `clientMetadata` value to
     * enhance your workflow for your specific needs.
     *
     * For more information, see [Customizing user pool Workflows with Lambda
     * Triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html)
     * in the *Amazon Cognito Developer Guide* .
     *
     *
     * When you use the ClientMetadata parameter, remember that Amazon Cognito won't do the
     * following:
     *
     * * Store the ClientMetadata value. This data is available only to AWS Lambda triggers that are
     * assigned to a user pool to support custom workflows. If your user pool configuration doesn't
     * include triggers, the ClientMetadata parameter serves no purpose.
     * * Validate the ClientMetadata value.
     * * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide sensitive
     * information.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-clientmetadata)
     * @param clientMetadata A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers. 
     */
    public fun clientMetadata(clientMetadata: IResolvable)

    /**
     * A map of custom key-value pairs that you can provide as input for any custom workflows that
     * this action triggers.
     *
     * You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you
     * use the AdminCreateUser API action, Amazon Cognito invokes the function that is assigned to the
     * *pre sign-up* trigger. When Amazon Cognito invokes this function, it passes a JSON payload,
     * which the function receives as input. This payload contains a `clientMetadata` attribute, which
     * provides the data that you assigned to the ClientMetadata parameter in your AdminCreateUser
     * request. In your function code in AWS Lambda , you can process the `clientMetadata` value to
     * enhance your workflow for your specific needs.
     *
     * For more information, see [Customizing user pool Workflows with Lambda
     * Triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html)
     * in the *Amazon Cognito Developer Guide* .
     *
     *
     * When you use the ClientMetadata parameter, remember that Amazon Cognito won't do the
     * following:
     *
     * * Store the ClientMetadata value. This data is available only to AWS Lambda triggers that are
     * assigned to a user pool to support custom workflows. If your user pool configuration doesn't
     * include triggers, the ClientMetadata parameter serves no purpose.
     * * Validate the ClientMetadata value.
     * * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide sensitive
     * information.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-clientmetadata)
     * @param clientMetadata A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers. 
     */
    public fun clientMetadata(clientMetadata: Map<String, String>)

    /**
     * Specify `"EMAIL"` if email will be used to send the welcome message.
     *
     * Specify `"SMS"` if the phone number will be used. The default value is `"SMS"` . You can
     * specify more than one value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-desireddeliverymediums)
     * @param desiredDeliveryMediums Specify `"EMAIL"` if email will be used to send the welcome
     * message. 
     */
    public fun desiredDeliveryMediums(desiredDeliveryMediums: List<String>)

    /**
     * Specify `"EMAIL"` if email will be used to send the welcome message.
     *
     * Specify `"SMS"` if the phone number will be used. The default value is `"SMS"` . You can
     * specify more than one value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-desireddeliverymediums)
     * @param desiredDeliveryMediums Specify `"EMAIL"` if email will be used to send the welcome
     * message. 
     */
    public fun desiredDeliveryMediums(vararg desiredDeliveryMediums: String)

    /**
     * This parameter is used only if the `phone_number_verified` or `email_verified` attribute is
     * set to `True` .
     *
     * Otherwise, it is ignored.
     *
     * If this parameter is set to `True` and the phone number or email address specified in the
     * UserAttributes parameter already exists as an alias with a different user, the API call will
     * migrate the alias from the previous user to the newly created user. The previous user will no
     * longer be able to log in using that alias.
     *
     * If this parameter is set to `False` , the API throws an `AliasExistsException` error if the
     * alias already exists. The default value is `False` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-forcealiascreation)
     * @param forceAliasCreation This parameter is used only if the `phone_number_verified` or
     * `email_verified` attribute is set to `True` . 
     */
    public fun forceAliasCreation(forceAliasCreation: Boolean)

    /**
     * This parameter is used only if the `phone_number_verified` or `email_verified` attribute is
     * set to `True` .
     *
     * Otherwise, it is ignored.
     *
     * If this parameter is set to `True` and the phone number or email address specified in the
     * UserAttributes parameter already exists as an alias with a different user, the API call will
     * migrate the alias from the previous user to the newly created user. The previous user will no
     * longer be able to log in using that alias.
     *
     * If this parameter is set to `False` , the API throws an `AliasExistsException` error if the
     * alias already exists. The default value is `False` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-forcealiascreation)
     * @param forceAliasCreation This parameter is used only if the `phone_number_verified` or
     * `email_verified` attribute is set to `True` . 
     */
    public fun forceAliasCreation(forceAliasCreation: IResolvable)

    /**
     * Set to `RESEND` to resend the invitation message to a user that already exists and reset the
     * expiration limit on the user's account.
     *
     * Set to `SUPPRESS` to suppress sending the message. You can specify only one value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-messageaction)
     * @param messageAction Set to `RESEND` to resend the invitation message to a user that already
     * exists and reset the expiration limit on the user's account. 
     */
    public fun messageAction(messageAction: String)

    /**
     * An array of name-value pairs that contain user attributes and attribute values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userattributes)
     * @param userAttributes An array of name-value pairs that contain user attributes and attribute
     * values. 
     */
    public fun userAttributes(userAttributes: IResolvable)

    /**
     * An array of name-value pairs that contain user attributes and attribute values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userattributes)
     * @param userAttributes An array of name-value pairs that contain user attributes and attribute
     * values. 
     */
    public fun userAttributes(userAttributes: List<Any>)

    /**
     * An array of name-value pairs that contain user attributes and attribute values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userattributes)
     * @param userAttributes An array of name-value pairs that contain user attributes and attribute
     * values. 
     */
    public fun userAttributes(vararg userAttributes: Any)

    /**
     * The user pool ID for the user pool where the user will be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userpoolid)
     * @param userPoolId The user pool ID for the user pool where the user will be created. 
     */
    public fun userPoolId(userPoolId: String)

    /**
     * The value that you want to set as the username sign-in attribute.
     *
     * The following conditions apply to the username parameter.
     *
     * * The username can't be a duplicate of another username in the same user pool.
     * * You can't change the value of a username after you create it.
     * * You can only provide a value if usernames are a valid sign-in attribute for your user pool.
     * If your user pool only supports phone numbers or email addresses as sign-in attributes, Amazon
     * Cognito automatically generates a username value. For more information, see [Customizing sign-in
     * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#user-pool-settings-aliases)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-username)
     * @param username The value that you want to set as the username sign-in attribute. 
     */
    public fun username(username: String)

    /**
     * Temporary user attributes that contribute to the outcomes of your pre sign-up Lambda trigger.
     *
     * This set of key-value pairs are for custom validation of information that you collect from
     * your users but don't need to retain.
     *
     * Your Lambda function can analyze this additional data and act on it. Your function might
     * perform external API operations like logging user attributes and validation data to Amazon
     * CloudWatch Logs. Validation data might also affect the response that your function returns to
     * Amazon Cognito, like automatically confirming the user if they sign up from within your network.
     *
     * For more information about the pre sign-up Lambda trigger, see [Pre sign-up Lambda
     * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-sign-up.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-validationdata)
     * @param validationData Temporary user attributes that contribute to the outcomes of your pre
     * sign-up Lambda trigger. 
     */
    public fun validationData(validationData: IResolvable)

    /**
     * Temporary user attributes that contribute to the outcomes of your pre sign-up Lambda trigger.
     *
     * This set of key-value pairs are for custom validation of information that you collect from
     * your users but don't need to retain.
     *
     * Your Lambda function can analyze this additional data and act on it. Your function might
     * perform external API operations like logging user attributes and validation data to Amazon
     * CloudWatch Logs. Validation data might also affect the response that your function returns to
     * Amazon Cognito, like automatically confirming the user if they sign up from within your network.
     *
     * For more information about the pre sign-up Lambda trigger, see [Pre sign-up Lambda
     * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-sign-up.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-validationdata)
     * @param validationData Temporary user attributes that contribute to the outcomes of your pre
     * sign-up Lambda trigger. 
     */
    public fun validationData(validationData: List<Any>)

    /**
     * Temporary user attributes that contribute to the outcomes of your pre sign-up Lambda trigger.
     *
     * This set of key-value pairs are for custom validation of information that you collect from
     * your users but don't need to retain.
     *
     * Your Lambda function can analyze this additional data and act on it. Your function might
     * perform external API operations like logging user attributes and validation data to Amazon
     * CloudWatch Logs. Validation data might also affect the response that your function returns to
     * Amazon Cognito, like automatically confirming the user if they sign up from within your network.
     *
     * For more information about the pre sign-up Lambda trigger, see [Pre sign-up Lambda
     * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-sign-up.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-validationdata)
     * @param validationData Temporary user attributes that contribute to the outcomes of your pre
     * sign-up Lambda trigger. 
     */
    public fun validationData(vararg validationData: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnUserPoolUser.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolUser.Builder.create(scope, id)

    /**
     * A map of custom key-value pairs that you can provide as input for any custom workflows that
     * this action triggers.
     *
     * You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you
     * use the AdminCreateUser API action, Amazon Cognito invokes the function that is assigned to the
     * *pre sign-up* trigger. When Amazon Cognito invokes this function, it passes a JSON payload,
     * which the function receives as input. This payload contains a `clientMetadata` attribute, which
     * provides the data that you assigned to the ClientMetadata parameter in your AdminCreateUser
     * request. In your function code in AWS Lambda , you can process the `clientMetadata` value to
     * enhance your workflow for your specific needs.
     *
     * For more information, see [Customizing user pool Workflows with Lambda
     * Triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html)
     * in the *Amazon Cognito Developer Guide* .
     *
     *
     * When you use the ClientMetadata parameter, remember that Amazon Cognito won't do the
     * following:
     *
     * * Store the ClientMetadata value. This data is available only to AWS Lambda triggers that are
     * assigned to a user pool to support custom workflows. If your user pool configuration doesn't
     * include triggers, the ClientMetadata parameter serves no purpose.
     * * Validate the ClientMetadata value.
     * * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide sensitive
     * information.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-clientmetadata)
     * @param clientMetadata A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers. 
     */
    override fun clientMetadata(clientMetadata: IResolvable) {
      cdkBuilder.clientMetadata(clientMetadata.let(IResolvable.Companion::unwrap))
    }

    /**
     * A map of custom key-value pairs that you can provide as input for any custom workflows that
     * this action triggers.
     *
     * You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you
     * use the AdminCreateUser API action, Amazon Cognito invokes the function that is assigned to the
     * *pre sign-up* trigger. When Amazon Cognito invokes this function, it passes a JSON payload,
     * which the function receives as input. This payload contains a `clientMetadata` attribute, which
     * provides the data that you assigned to the ClientMetadata parameter in your AdminCreateUser
     * request. In your function code in AWS Lambda , you can process the `clientMetadata` value to
     * enhance your workflow for your specific needs.
     *
     * For more information, see [Customizing user pool Workflows with Lambda
     * Triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html)
     * in the *Amazon Cognito Developer Guide* .
     *
     *
     * When you use the ClientMetadata parameter, remember that Amazon Cognito won't do the
     * following:
     *
     * * Store the ClientMetadata value. This data is available only to AWS Lambda triggers that are
     * assigned to a user pool to support custom workflows. If your user pool configuration doesn't
     * include triggers, the ClientMetadata parameter serves no purpose.
     * * Validate the ClientMetadata value.
     * * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide sensitive
     * information.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-clientmetadata)
     * @param clientMetadata A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers. 
     */
    override fun clientMetadata(clientMetadata: Map<String, String>) {
      cdkBuilder.clientMetadata(clientMetadata)
    }

    /**
     * Specify `"EMAIL"` if email will be used to send the welcome message.
     *
     * Specify `"SMS"` if the phone number will be used. The default value is `"SMS"` . You can
     * specify more than one value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-desireddeliverymediums)
     * @param desiredDeliveryMediums Specify `"EMAIL"` if email will be used to send the welcome
     * message. 
     */
    override fun desiredDeliveryMediums(desiredDeliveryMediums: List<String>) {
      cdkBuilder.desiredDeliveryMediums(desiredDeliveryMediums)
    }

    /**
     * Specify `"EMAIL"` if email will be used to send the welcome message.
     *
     * Specify `"SMS"` if the phone number will be used. The default value is `"SMS"` . You can
     * specify more than one value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-desireddeliverymediums)
     * @param desiredDeliveryMediums Specify `"EMAIL"` if email will be used to send the welcome
     * message. 
     */
    override fun desiredDeliveryMediums(vararg desiredDeliveryMediums: String): Unit =
        desiredDeliveryMediums(desiredDeliveryMediums.toList())

    /**
     * This parameter is used only if the `phone_number_verified` or `email_verified` attribute is
     * set to `True` .
     *
     * Otherwise, it is ignored.
     *
     * If this parameter is set to `True` and the phone number or email address specified in the
     * UserAttributes parameter already exists as an alias with a different user, the API call will
     * migrate the alias from the previous user to the newly created user. The previous user will no
     * longer be able to log in using that alias.
     *
     * If this parameter is set to `False` , the API throws an `AliasExistsException` error if the
     * alias already exists. The default value is `False` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-forcealiascreation)
     * @param forceAliasCreation This parameter is used only if the `phone_number_verified` or
     * `email_verified` attribute is set to `True` . 
     */
    override fun forceAliasCreation(forceAliasCreation: Boolean) {
      cdkBuilder.forceAliasCreation(forceAliasCreation)
    }

    /**
     * This parameter is used only if the `phone_number_verified` or `email_verified` attribute is
     * set to `True` .
     *
     * Otherwise, it is ignored.
     *
     * If this parameter is set to `True` and the phone number or email address specified in the
     * UserAttributes parameter already exists as an alias with a different user, the API call will
     * migrate the alias from the previous user to the newly created user. The previous user will no
     * longer be able to log in using that alias.
     *
     * If this parameter is set to `False` , the API throws an `AliasExistsException` error if the
     * alias already exists. The default value is `False` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-forcealiascreation)
     * @param forceAliasCreation This parameter is used only if the `phone_number_verified` or
     * `email_verified` attribute is set to `True` . 
     */
    override fun forceAliasCreation(forceAliasCreation: IResolvable) {
      cdkBuilder.forceAliasCreation(forceAliasCreation.let(IResolvable.Companion::unwrap))
    }

    /**
     * Set to `RESEND` to resend the invitation message to a user that already exists and reset the
     * expiration limit on the user's account.
     *
     * Set to `SUPPRESS` to suppress sending the message. You can specify only one value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-messageaction)
     * @param messageAction Set to `RESEND` to resend the invitation message to a user that already
     * exists and reset the expiration limit on the user's account. 
     */
    override fun messageAction(messageAction: String) {
      cdkBuilder.messageAction(messageAction)
    }

    /**
     * An array of name-value pairs that contain user attributes and attribute values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userattributes)
     * @param userAttributes An array of name-value pairs that contain user attributes and attribute
     * values. 
     */
    override fun userAttributes(userAttributes: IResolvable) {
      cdkBuilder.userAttributes(userAttributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * An array of name-value pairs that contain user attributes and attribute values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userattributes)
     * @param userAttributes An array of name-value pairs that contain user attributes and attribute
     * values. 
     */
    override fun userAttributes(userAttributes: List<Any>) {
      cdkBuilder.userAttributes(userAttributes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * An array of name-value pairs that contain user attributes and attribute values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userattributes)
     * @param userAttributes An array of name-value pairs that contain user attributes and attribute
     * values. 
     */
    override fun userAttributes(vararg userAttributes: Any): Unit =
        userAttributes(userAttributes.toList())

    /**
     * The user pool ID for the user pool where the user will be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userpoolid)
     * @param userPoolId The user pool ID for the user pool where the user will be created. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    /**
     * The value that you want to set as the username sign-in attribute.
     *
     * The following conditions apply to the username parameter.
     *
     * * The username can't be a duplicate of another username in the same user pool.
     * * You can't change the value of a username after you create it.
     * * You can only provide a value if usernames are a valid sign-in attribute for your user pool.
     * If your user pool only supports phone numbers or email addresses as sign-in attributes, Amazon
     * Cognito automatically generates a username value. For more information, see [Customizing sign-in
     * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#user-pool-settings-aliases)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-username)
     * @param username The value that you want to set as the username sign-in attribute. 
     */
    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    /**
     * Temporary user attributes that contribute to the outcomes of your pre sign-up Lambda trigger.
     *
     * This set of key-value pairs are for custom validation of information that you collect from
     * your users but don't need to retain.
     *
     * Your Lambda function can analyze this additional data and act on it. Your function might
     * perform external API operations like logging user attributes and validation data to Amazon
     * CloudWatch Logs. Validation data might also affect the response that your function returns to
     * Amazon Cognito, like automatically confirming the user if they sign up from within your network.
     *
     * For more information about the pre sign-up Lambda trigger, see [Pre sign-up Lambda
     * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-sign-up.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-validationdata)
     * @param validationData Temporary user attributes that contribute to the outcomes of your pre
     * sign-up Lambda trigger. 
     */
    override fun validationData(validationData: IResolvable) {
      cdkBuilder.validationData(validationData.let(IResolvable.Companion::unwrap))
    }

    /**
     * Temporary user attributes that contribute to the outcomes of your pre sign-up Lambda trigger.
     *
     * This set of key-value pairs are for custom validation of information that you collect from
     * your users but don't need to retain.
     *
     * Your Lambda function can analyze this additional data and act on it. Your function might
     * perform external API operations like logging user attributes and validation data to Amazon
     * CloudWatch Logs. Validation data might also affect the response that your function returns to
     * Amazon Cognito, like automatically confirming the user if they sign up from within your network.
     *
     * For more information about the pre sign-up Lambda trigger, see [Pre sign-up Lambda
     * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-sign-up.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-validationdata)
     * @param validationData Temporary user attributes that contribute to the outcomes of your pre
     * sign-up Lambda trigger. 
     */
    override fun validationData(validationData: List<Any>) {
      cdkBuilder.validationData(validationData.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Temporary user attributes that contribute to the outcomes of your pre sign-up Lambda trigger.
     *
     * This set of key-value pairs are for custom validation of information that you collect from
     * your users but don't need to retain.
     *
     * Your Lambda function can analyze this additional data and act on it. Your function might
     * perform external API operations like logging user attributes and validation data to Amazon
     * CloudWatch Logs. Validation data might also affect the response that your function returns to
     * Amazon Cognito, like automatically confirming the user if they sign up from within your network.
     *
     * For more information about the pre sign-up Lambda trigger, see [Pre sign-up Lambda
     * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-sign-up.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-validationdata)
     * @param validationData Temporary user attributes that contribute to the outcomes of your pre
     * sign-up Lambda trigger. 
     */
    override fun validationData(vararg validationData: Any): Unit =
        validationData(validationData.toList())

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolUser = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cognito.CfnUserPoolUser.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserPoolUser {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserPoolUser(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolUser):
        CfnUserPoolUser = CfnUserPoolUser(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolUser):
        software.amazon.awscdk.services.cognito.CfnUserPoolUser = wrapped.cdkObject as
        software.amazon.awscdk.services.cognito.CfnUserPoolUser
  }

  /**
   * The name and value of a user attribute.
   *
   * This data type is a request parameter of
   * [AdminUpdateUserAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html)
   * and
   * [UpdateUserAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateUserAttributes.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * AttributeTypeProperty attributeTypeProperty = AttributeTypeProperty.builder()
   * .name("name")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpooluser-attributetype.html)
   */
  public interface AttributeTypeProperty {
    /**
     * The name of the attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpooluser-attributetype.html#cfn-cognito-userpooluser-attributetype-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The value of the attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpooluser-attributetype.html#cfn-cognito-userpooluser-attributetype-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [AttributeTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the attribute.
       */
      public fun name(name: String)

      /**
       * @param value The value of the attribute.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolUser.AttributeTypeProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnUserPoolUser.AttributeTypeProperty.builder()

      /**
       * @param name The name of the attribute.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The value of the attribute.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolUser.AttributeTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolUser.AttributeTypeProperty,
    ) : CdkObject(cdkObject),
        AttributeTypeProperty {
      /**
       * The name of the attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpooluser-attributetype.html#cfn-cognito-userpooluser-attributetype-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The value of the attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpooluser-attributetype.html#cfn-cognito-userpooluser-attributetype-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolUser.AttributeTypeProperty):
          AttributeTypeProperty = CdkObjectWrappers.wrap(cdkObject) as? AttributeTypeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeTypeProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolUser.AttributeTypeProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPoolUser.AttributeTypeProperty
    }
  }
}
