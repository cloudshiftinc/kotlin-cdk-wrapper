@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnUserPoolUser`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * CfnUserPoolUserProps cfnUserPoolUserProps = CfnUserPoolUserProps.builder()
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
public interface CfnUserPoolUserProps {
  /**
   * A map of custom key-value pairs that you can provide as input for any custom workflows that
   * this action triggers.
   *
   * You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you
   * use the AdminCreateUser API action, Amazon Cognito invokes the function that is assigned to the
   * *pre sign-up* trigger. When Amazon Cognito invokes this function, it passes a JSON payload, which
   * the function receives as input. This payload contains a `clientMetadata` attribute, which provides
   * the data that you assigned to the ClientMetadata parameter in your AdminCreateUser request. In
   * your function code in AWS Lambda , you can process the `clientMetadata` value to enhance your
   * workflow for your specific needs.
   *
   * For more information, see [Customizing user pool Workflows with Lambda
   * Triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html)
   * in the *Amazon Cognito Developer Guide* .
   *
   *
   * When you use the ClientMetadata parameter, remember that Amazon Cognito won't do the following:
   *
   * * Store the ClientMetadata value. This data is available only to AWS Lambda triggers that are
   * assigned to a user pool to support custom workflows. If your user pool configuration doesn't
   * include triggers, the ClientMetadata parameter serves no purpose.
   * * Validate the ClientMetadata value.
   * * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide sensitive information.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-clientmetadata)
   */
  public fun clientMetadata(): Any? = unwrap(this).getClientMetadata()

  /**
   * Specify `"EMAIL"` if email will be used to send the welcome message.
   *
   * Specify `"SMS"` if the phone number will be used. The default value is `"SMS"` . You can
   * specify more than one value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-desireddeliverymediums)
   */
  public fun desiredDeliveryMediums(): List<String> = unwrap(this).getDesiredDeliveryMediums() ?:
      emptyList()

  /**
   * This parameter is used only if the `phone_number_verified` or `email_verified` attribute is set
   * to `True` .
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
   */
  public fun forceAliasCreation(): Any? = unwrap(this).getForceAliasCreation()

  /**
   * Set to `RESEND` to resend the invitation message to a user that already exists and reset the
   * expiration limit on the user's account.
   *
   * Set to `SUPPRESS` to suppress sending the message. You can specify only one value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-messageaction)
   */
  public fun messageAction(): String? = unwrap(this).getMessageAction()

  /**
   * An array of name-value pairs that contain user attributes and attribute values.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userattributes)
   */
  public fun userAttributes(): Any? = unwrap(this).getUserAttributes()

  /**
   * The user pool ID for the user pool where the user will be created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userpoolid)
   */
  public fun userPoolId(): String

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
   */
  public fun username(): String? = unwrap(this).getUsername()

  /**
   * Temporary user attributes that contribute to the outcomes of your pre sign-up Lambda trigger.
   *
   * This set of key-value pairs are for custom validation of information that you collect from your
   * users but don't need to retain.
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
   */
  public fun validationData(): Any? = unwrap(this).getValidationData()

  /**
   * A builder for [CfnUserPoolUserProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clientMetadata A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers.
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
     */
    public fun clientMetadata(clientMetadata: IResolvable)

    /**
     * @param clientMetadata A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers.
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
     */
    public fun clientMetadata(clientMetadata: Map<String, String>)

    /**
     * @param desiredDeliveryMediums Specify `"EMAIL"` if email will be used to send the welcome
     * message.
     * Specify `"SMS"` if the phone number will be used. The default value is `"SMS"` . You can
     * specify more than one value.
     */
    public fun desiredDeliveryMediums(desiredDeliveryMediums: List<String>)

    /**
     * @param desiredDeliveryMediums Specify `"EMAIL"` if email will be used to send the welcome
     * message.
     * Specify `"SMS"` if the phone number will be used. The default value is `"SMS"` . You can
     * specify more than one value.
     */
    public fun desiredDeliveryMediums(vararg desiredDeliveryMediums: String)

    /**
     * @param forceAliasCreation This parameter is used only if the `phone_number_verified` or
     * `email_verified` attribute is set to `True` .
     * Otherwise, it is ignored.
     *
     * If this parameter is set to `True` and the phone number or email address specified in the
     * UserAttributes parameter already exists as an alias with a different user, the API call will
     * migrate the alias from the previous user to the newly created user. The previous user will no
     * longer be able to log in using that alias.
     *
     * If this parameter is set to `False` , the API throws an `AliasExistsException` error if the
     * alias already exists. The default value is `False` .
     */
    public fun forceAliasCreation(forceAliasCreation: Boolean)

    /**
     * @param forceAliasCreation This parameter is used only if the `phone_number_verified` or
     * `email_verified` attribute is set to `True` .
     * Otherwise, it is ignored.
     *
     * If this parameter is set to `True` and the phone number or email address specified in the
     * UserAttributes parameter already exists as an alias with a different user, the API call will
     * migrate the alias from the previous user to the newly created user. The previous user will no
     * longer be able to log in using that alias.
     *
     * If this parameter is set to `False` , the API throws an `AliasExistsException` error if the
     * alias already exists. The default value is `False` .
     */
    public fun forceAliasCreation(forceAliasCreation: IResolvable)

    /**
     * @param messageAction Set to `RESEND` to resend the invitation message to a user that already
     * exists and reset the expiration limit on the user's account.
     * Set to `SUPPRESS` to suppress sending the message. You can specify only one value.
     */
    public fun messageAction(messageAction: String)

    /**
     * @param userAttributes An array of name-value pairs that contain user attributes and attribute
     * values.
     */
    public fun userAttributes(userAttributes: IResolvable)

    /**
     * @param userAttributes An array of name-value pairs that contain user attributes and attribute
     * values.
     */
    public fun userAttributes(userAttributes: List<Any>)

    /**
     * @param userAttributes An array of name-value pairs that contain user attributes and attribute
     * values.
     */
    public fun userAttributes(vararg userAttributes: Any)

    /**
     * @param userPoolId The user pool ID for the user pool where the user will be created. 
     */
    public fun userPoolId(userPoolId: String)

    /**
     * @param username The value that you want to set as the username sign-in attribute.
     * The following conditions apply to the username parameter.
     *
     * * The username can't be a duplicate of another username in the same user pool.
     * * You can't change the value of a username after you create it.
     * * You can only provide a value if usernames are a valid sign-in attribute for your user pool.
     * If your user pool only supports phone numbers or email addresses as sign-in attributes, Amazon
     * Cognito automatically generates a username value. For more information, see [Customizing sign-in
     * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#user-pool-settings-aliases)
     * .
     */
    public fun username(username: String)

    /**
     * @param validationData Temporary user attributes that contribute to the outcomes of your pre
     * sign-up Lambda trigger.
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
     */
    public fun validationData(validationData: IResolvable)

    /**
     * @param validationData Temporary user attributes that contribute to the outcomes of your pre
     * sign-up Lambda trigger.
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
     */
    public fun validationData(validationData: List<Any>)

    /**
     * @param validationData Temporary user attributes that contribute to the outcomes of your pre
     * sign-up Lambda trigger.
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
     */
    public fun validationData(vararg validationData: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnUserPoolUserProps.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolUserProps.builder()

    /**
     * @param clientMetadata A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers.
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
     */
    override fun clientMetadata(clientMetadata: IResolvable) {
      cdkBuilder.clientMetadata(clientMetadata.let(IResolvable::unwrap))
    }

    /**
     * @param clientMetadata A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers.
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
     */
    override fun clientMetadata(clientMetadata: Map<String, String>) {
      cdkBuilder.clientMetadata(clientMetadata)
    }

    /**
     * @param desiredDeliveryMediums Specify `"EMAIL"` if email will be used to send the welcome
     * message.
     * Specify `"SMS"` if the phone number will be used. The default value is `"SMS"` . You can
     * specify more than one value.
     */
    override fun desiredDeliveryMediums(desiredDeliveryMediums: List<String>) {
      cdkBuilder.desiredDeliveryMediums(desiredDeliveryMediums)
    }

    /**
     * @param desiredDeliveryMediums Specify `"EMAIL"` if email will be used to send the welcome
     * message.
     * Specify `"SMS"` if the phone number will be used. The default value is `"SMS"` . You can
     * specify more than one value.
     */
    override fun desiredDeliveryMediums(vararg desiredDeliveryMediums: String): Unit =
        desiredDeliveryMediums(desiredDeliveryMediums.toList())

    /**
     * @param forceAliasCreation This parameter is used only if the `phone_number_verified` or
     * `email_verified` attribute is set to `True` .
     * Otherwise, it is ignored.
     *
     * If this parameter is set to `True` and the phone number or email address specified in the
     * UserAttributes parameter already exists as an alias with a different user, the API call will
     * migrate the alias from the previous user to the newly created user. The previous user will no
     * longer be able to log in using that alias.
     *
     * If this parameter is set to `False` , the API throws an `AliasExistsException` error if the
     * alias already exists. The default value is `False` .
     */
    override fun forceAliasCreation(forceAliasCreation: Boolean) {
      cdkBuilder.forceAliasCreation(forceAliasCreation)
    }

    /**
     * @param forceAliasCreation This parameter is used only if the `phone_number_verified` or
     * `email_verified` attribute is set to `True` .
     * Otherwise, it is ignored.
     *
     * If this parameter is set to `True` and the phone number or email address specified in the
     * UserAttributes parameter already exists as an alias with a different user, the API call will
     * migrate the alias from the previous user to the newly created user. The previous user will no
     * longer be able to log in using that alias.
     *
     * If this parameter is set to `False` , the API throws an `AliasExistsException` error if the
     * alias already exists. The default value is `False` .
     */
    override fun forceAliasCreation(forceAliasCreation: IResolvable) {
      cdkBuilder.forceAliasCreation(forceAliasCreation.let(IResolvable::unwrap))
    }

    /**
     * @param messageAction Set to `RESEND` to resend the invitation message to a user that already
     * exists and reset the expiration limit on the user's account.
     * Set to `SUPPRESS` to suppress sending the message. You can specify only one value.
     */
    override fun messageAction(messageAction: String) {
      cdkBuilder.messageAction(messageAction)
    }

    /**
     * @param userAttributes An array of name-value pairs that contain user attributes and attribute
     * values.
     */
    override fun userAttributes(userAttributes: IResolvable) {
      cdkBuilder.userAttributes(userAttributes.let(IResolvable::unwrap))
    }

    /**
     * @param userAttributes An array of name-value pairs that contain user attributes and attribute
     * values.
     */
    override fun userAttributes(userAttributes: List<Any>) {
      cdkBuilder.userAttributes(userAttributes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param userAttributes An array of name-value pairs that contain user attributes and attribute
     * values.
     */
    override fun userAttributes(vararg userAttributes: Any): Unit =
        userAttributes(userAttributes.toList())

    /**
     * @param userPoolId The user pool ID for the user pool where the user will be created. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    /**
     * @param username The value that you want to set as the username sign-in attribute.
     * The following conditions apply to the username parameter.
     *
     * * The username can't be a duplicate of another username in the same user pool.
     * * You can't change the value of a username after you create it.
     * * You can only provide a value if usernames are a valid sign-in attribute for your user pool.
     * If your user pool only supports phone numbers or email addresses as sign-in attributes, Amazon
     * Cognito automatically generates a username value. For more information, see [Customizing sign-in
     * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#user-pool-settings-aliases)
     * .
     */
    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    /**
     * @param validationData Temporary user attributes that contribute to the outcomes of your pre
     * sign-up Lambda trigger.
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
     */
    override fun validationData(validationData: IResolvable) {
      cdkBuilder.validationData(validationData.let(IResolvable::unwrap))
    }

    /**
     * @param validationData Temporary user attributes that contribute to the outcomes of your pre
     * sign-up Lambda trigger.
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
     */
    override fun validationData(validationData: List<Any>) {
      cdkBuilder.validationData(validationData.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param validationData Temporary user attributes that contribute to the outcomes of your pre
     * sign-up Lambda trigger.
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
     */
    override fun validationData(vararg validationData: Any): Unit =
        validationData(validationData.toList())

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolUserProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolUserProps,
  ) : CdkObject(cdkObject), CfnUserPoolUserProps {
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
     */
    override fun clientMetadata(): Any? = unwrap(this).getClientMetadata()

    /**
     * Specify `"EMAIL"` if email will be used to send the welcome message.
     *
     * Specify `"SMS"` if the phone number will be used. The default value is `"SMS"` . You can
     * specify more than one value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-desireddeliverymediums)
     */
    override fun desiredDeliveryMediums(): List<String> = unwrap(this).getDesiredDeliveryMediums()
        ?: emptyList()

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
     */
    override fun forceAliasCreation(): Any? = unwrap(this).getForceAliasCreation()

    /**
     * Set to `RESEND` to resend the invitation message to a user that already exists and reset the
     * expiration limit on the user's account.
     *
     * Set to `SUPPRESS` to suppress sending the message. You can specify only one value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-messageaction)
     */
    override fun messageAction(): String? = unwrap(this).getMessageAction()

    /**
     * An array of name-value pairs that contain user attributes and attribute values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userattributes)
     */
    override fun userAttributes(): Any? = unwrap(this).getUserAttributes()

    /**
     * The user pool ID for the user pool where the user will be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userpoolid)
     */
    override fun userPoolId(): String = unwrap(this).getUserPoolId()

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
     */
    override fun username(): String? = unwrap(this).getUsername()

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
     */
    override fun validationData(): Any? = unwrap(this).getValidationData()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserPoolUserProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolUserProps):
        CfnUserPoolUserProps = CdkObjectWrappers.wrap(cdkObject) as? CfnUserPoolUserProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolUserProps):
        software.amazon.awscdk.services.cognito.CfnUserPoolUserProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.CfnUserPoolUserProps
  }
}
