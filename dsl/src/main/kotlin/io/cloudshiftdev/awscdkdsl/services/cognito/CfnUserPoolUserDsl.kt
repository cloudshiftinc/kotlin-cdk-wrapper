@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.cognito

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPoolUser
import software.constructs.Construct

/**
 * The `AWS::Cognito::UserPoolUser` resource creates an Amazon Cognito user pool user.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
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
@CdkDslMarker
public class CfnUserPoolUserDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnUserPoolUser.Builder = CfnUserPoolUser.Builder.create(scope, id)

    private val _desiredDeliveryMediums: MutableList<String> = mutableListOf()

    private val _userAttributes: MutableList<Any> = mutableListOf()

    private val _validationData: MutableList<Any> = mutableListOf()

    /**
     * A map of custom key-value pairs that you can provide as input for any custom workflows that
     * this action triggers.
     *
     * You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you
     * use the AdminCreateUser API action, Amazon Cognito invokes the function that is assigned to
     * the *pre sign-up* trigger. When Amazon Cognito invokes this function, it passes a JSON
     * payload, which the function receives as input. This payload contains a `clientMetadata`
     * attribute, which provides the data that you assigned to the ClientMetadata parameter in your
     * AdminCreateUser request. In your function code in AWS Lambda , you can process the
     * `clientMetadata` value to enhance your workflow for your specific needs.
     *
     * For more information, see
     * [Customizing user pool Workflows with Lambda Triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html)
     * in the *Amazon Cognito Developer Guide* .
     *
     * When you use the ClientMetadata parameter, remember that Amazon Cognito won't do the
     * following:
     * * Store the ClientMetadata value. This data is available only to AWS Lambda triggers that are
     *   assigned to a user pool to support custom workflows. If your user pool configuration
     *   doesn't include triggers, the ClientMetadata parameter serves no purpose.
     * * Validate the ClientMetadata value.
     * * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide sensitive
     *   information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-clientmetadata)
     *
     * @param clientMetadata A map of custom key-value pairs that you can provide as input for any
     *   custom workflows that this action triggers.
     */
    public fun clientMetadata(clientMetadata: Map<String, String>) {
        cdkBuilder.clientMetadata(clientMetadata)
    }

    /**
     * A map of custom key-value pairs that you can provide as input for any custom workflows that
     * this action triggers.
     *
     * You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you
     * use the AdminCreateUser API action, Amazon Cognito invokes the function that is assigned to
     * the *pre sign-up* trigger. When Amazon Cognito invokes this function, it passes a JSON
     * payload, which the function receives as input. This payload contains a `clientMetadata`
     * attribute, which provides the data that you assigned to the ClientMetadata parameter in your
     * AdminCreateUser request. In your function code in AWS Lambda , you can process the
     * `clientMetadata` value to enhance your workflow for your specific needs.
     *
     * For more information, see
     * [Customizing user pool Workflows with Lambda Triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html)
     * in the *Amazon Cognito Developer Guide* .
     *
     * When you use the ClientMetadata parameter, remember that Amazon Cognito won't do the
     * following:
     * * Store the ClientMetadata value. This data is available only to AWS Lambda triggers that are
     *   assigned to a user pool to support custom workflows. If your user pool configuration
     *   doesn't include triggers, the ClientMetadata parameter serves no purpose.
     * * Validate the ClientMetadata value.
     * * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide sensitive
     *   information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-clientmetadata)
     *
     * @param clientMetadata A map of custom key-value pairs that you can provide as input for any
     *   custom workflows that this action triggers.
     */
    public fun clientMetadata(clientMetadata: IResolvable) {
        cdkBuilder.clientMetadata(clientMetadata)
    }

    /**
     * Specify `"EMAIL"` if email will be used to send the welcome message.
     *
     * Specify `"SMS"` if the phone number will be used. The default value is `"SMS"` . You can
     * specify more than one value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-desireddeliverymediums)
     *
     * @param desiredDeliveryMediums Specify `"EMAIL"` if email will be used to send the welcome
     *   message.
     */
    public fun desiredDeliveryMediums(vararg desiredDeliveryMediums: String) {
        _desiredDeliveryMediums.addAll(listOf(*desiredDeliveryMediums))
    }

    /**
     * Specify `"EMAIL"` if email will be used to send the welcome message.
     *
     * Specify `"SMS"` if the phone number will be used. The default value is `"SMS"` . You can
     * specify more than one value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-desireddeliverymediums)
     *
     * @param desiredDeliveryMediums Specify `"EMAIL"` if email will be used to send the welcome
     *   message.
     */
    public fun desiredDeliveryMediums(desiredDeliveryMediums: Collection<String>) {
        _desiredDeliveryMediums.addAll(desiredDeliveryMediums)
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
     *
     * @param forceAliasCreation This parameter is used only if the `phone_number_verified` or
     *   `email_verified` attribute is set to `True` .
     */
    public fun forceAliasCreation(forceAliasCreation: Boolean) {
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
     *
     * @param forceAliasCreation This parameter is used only if the `phone_number_verified` or
     *   `email_verified` attribute is set to `True` .
     */
    public fun forceAliasCreation(forceAliasCreation: IResolvable) {
        cdkBuilder.forceAliasCreation(forceAliasCreation)
    }

    /**
     * Set to `RESEND` to resend the invitation message to a user that already exists and reset the
     * expiration limit on the user's account.
     *
     * Set to `SUPPRESS` to suppress sending the message. You can specify only one value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-messageaction)
     *
     * @param messageAction Set to `RESEND` to resend the invitation message to a user that already
     *   exists and reset the expiration limit on the user's account.
     */
    public fun messageAction(messageAction: String) {
        cdkBuilder.messageAction(messageAction)
    }

    /**
     * An array of name-value pairs that contain user attributes and attribute values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userattributes)
     *
     * @param userAttributes An array of name-value pairs that contain user attributes and attribute
     *   values.
     */
    public fun userAttributes(vararg userAttributes: Any) {
        _userAttributes.addAll(listOf(*userAttributes))
    }

    /**
     * An array of name-value pairs that contain user attributes and attribute values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userattributes)
     *
     * @param userAttributes An array of name-value pairs that contain user attributes and attribute
     *   values.
     */
    public fun userAttributes(userAttributes: Collection<Any>) {
        _userAttributes.addAll(userAttributes)
    }

    /**
     * An array of name-value pairs that contain user attributes and attribute values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userattributes)
     *
     * @param userAttributes An array of name-value pairs that contain user attributes and attribute
     *   values.
     */
    public fun userAttributes(userAttributes: IResolvable) {
        cdkBuilder.userAttributes(userAttributes)
    }

    /**
     * The user pool ID for the user pool where the user will be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userpoolid)
     *
     * @param userPoolId The user pool ID for the user pool where the user will be created.
     */
    public fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
    }

    /**
     * The value that you want to set as the username sign-in attribute.
     *
     * The following conditions apply to the username parameter.
     * * The username can't be a duplicate of another username in the same user pool.
     * * You can't change the value of a username after you create it.
     * * You can only provide a value if usernames are a valid sign-in attribute for your user pool.
     *   If your user pool only supports phone numbers or email addresses as sign-in attributes,
     *   Amazon Cognito automatically generates a username value. For more information, see
     *   [Customizing sign-in attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#user-pool-settings-aliases)
     *   .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-username)
     *
     * @param username The value that you want to set as the username sign-in attribute.
     */
    public fun username(username: String) {
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
     * Amazon Cognito, like automatically confirming the user if they sign up from within your
     * network.
     *
     * For more information about the pre sign-up Lambda trigger, see
     * [Pre sign-up Lambda trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-sign-up.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-validationdata)
     *
     * @param validationData Temporary user attributes that contribute to the outcomes of your pre
     *   sign-up Lambda trigger.
     */
    public fun validationData(vararg validationData: Any) {
        _validationData.addAll(listOf(*validationData))
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
     * Amazon Cognito, like automatically confirming the user if they sign up from within your
     * network.
     *
     * For more information about the pre sign-up Lambda trigger, see
     * [Pre sign-up Lambda trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-sign-up.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-validationdata)
     *
     * @param validationData Temporary user attributes that contribute to the outcomes of your pre
     *   sign-up Lambda trigger.
     */
    public fun validationData(validationData: Collection<Any>) {
        _validationData.addAll(validationData)
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
     * Amazon Cognito, like automatically confirming the user if they sign up from within your
     * network.
     *
     * For more information about the pre sign-up Lambda trigger, see
     * [Pre sign-up Lambda trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-sign-up.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-validationdata)
     *
     * @param validationData Temporary user attributes that contribute to the outcomes of your pre
     *   sign-up Lambda trigger.
     */
    public fun validationData(validationData: IResolvable) {
        cdkBuilder.validationData(validationData)
    }

    public fun build(): CfnUserPoolUser {
        if (_desiredDeliveryMediums.isNotEmpty())
            cdkBuilder.desiredDeliveryMediums(_desiredDeliveryMediums)
        if (_userAttributes.isNotEmpty()) cdkBuilder.userAttributes(_userAttributes)
        if (_validationData.isNotEmpty()) cdkBuilder.validationData(_validationData)
        return cdkBuilder.build()
    }
}
