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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPool

/**
 * A list of the user attributes and their properties in your user pool.
 *
 * The attribute schema contains standard attributes, custom attributes with a `custom:` prefix, and
 * developer attributes with a `dev:` prefix. For more information, see
 * [User pool attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html)
 * .
 *
 * Developer-only attributes are a legacy feature of user pools, are read-only to all app clients.
 * You can create and update developer-only attributes only with IAM-authenticated API operations.
 * Use app client read/write permissions instead.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * SchemaAttributeProperty schemaAttributeProperty = SchemaAttributeProperty.builder()
 * .attributeDataType("attributeDataType")
 * .developerOnlyAttribute(false)
 * .mutable(false)
 * .name("name")
 * .numberAttributeConstraints(NumberAttributeConstraintsProperty.builder()
 * .maxValue("maxValue")
 * .minValue("minValue")
 * .build())
 * .required(false)
 * .stringAttributeConstraints(StringAttributeConstraintsProperty.builder()
 * .maxLength("maxLength")
 * .minLength("minLength")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html)
 */
@CdkDslMarker
public class CfnUserPoolSchemaAttributePropertyDsl {
    private val cdkBuilder: CfnUserPool.SchemaAttributeProperty.Builder =
        CfnUserPool.SchemaAttributeProperty.builder()

    /** @param attributeDataType The data format of the values for your attribute. */
    public fun attributeDataType(attributeDataType: String) {
        cdkBuilder.attributeDataType(attributeDataType)
    }

    /**
     * @param developerOnlyAttribute We recommend that you use
     *   [WriteAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserPoolClientType.html#CognitoUserPools-Type-UserPoolClientType-WriteAttributes)
     *   in the user pool client to control how attributes can be mutated for new use cases instead
     *   of using `DeveloperOnlyAttribute` . Specifies whether the attribute type is developer only.
     *   This attribute can only be modified by an administrator. Users will not be able to modify
     *   this attribute using their access token.
     */
    public fun developerOnlyAttribute(developerOnlyAttribute: Boolean) {
        cdkBuilder.developerOnlyAttribute(developerOnlyAttribute)
    }

    /**
     * @param developerOnlyAttribute We recommend that you use
     *   [WriteAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserPoolClientType.html#CognitoUserPools-Type-UserPoolClientType-WriteAttributes)
     *   in the user pool client to control how attributes can be mutated for new use cases instead
     *   of using `DeveloperOnlyAttribute` . Specifies whether the attribute type is developer only.
     *   This attribute can only be modified by an administrator. Users will not be able to modify
     *   this attribute using their access token.
     */
    public fun developerOnlyAttribute(developerOnlyAttribute: IResolvable) {
        cdkBuilder.developerOnlyAttribute(developerOnlyAttribute)
    }

    /**
     * @param mutable Specifies whether the value of the attribute can be changed. Any user pool
     *   attribute whose value you map from an IdP attribute must be mutable, with a parameter value
     *   of `true` . Amazon Cognito updates mapped attributes when users sign in to your application
     *   through an IdP. If an attribute is immutable, Amazon Cognito throws an error when it
     *   attempts to update the attribute. For more information, see
     *   [Specifying Identity Provider Attribute Mappings for Your User Pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html)
     *   .
     */
    public fun mutable(mutable: Boolean) {
        cdkBuilder.mutable(mutable)
    }

    /**
     * @param mutable Specifies whether the value of the attribute can be changed. Any user pool
     *   attribute whose value you map from an IdP attribute must be mutable, with a parameter value
     *   of `true` . Amazon Cognito updates mapped attributes when users sign in to your application
     *   through an IdP. If an attribute is immutable, Amazon Cognito throws an error when it
     *   attempts to update the attribute. For more information, see
     *   [Specifying Identity Provider Attribute Mappings for Your User Pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html)
     *   .
     */
    public fun mutable(mutable: IResolvable) {
        cdkBuilder.mutable(mutable)
    }

    /**
     * @param name The name of your user pool attribute, for example `username` or
     *   `custom:costcenter` .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param numberAttributeConstraints Specifies the constraints for an attribute of the number
     *   type.
     */
    public fun numberAttributeConstraints(numberAttributeConstraints: IResolvable) {
        cdkBuilder.numberAttributeConstraints(numberAttributeConstraints)
    }

    /**
     * @param numberAttributeConstraints Specifies the constraints for an attribute of the number
     *   type.
     */
    public fun numberAttributeConstraints(
        numberAttributeConstraints: CfnUserPool.NumberAttributeConstraintsProperty
    ) {
        cdkBuilder.numberAttributeConstraints(numberAttributeConstraints)
    }

    /**
     * @param required Specifies whether a user pool attribute is required. If the attribute is
     *   required and the user doesn't provide a value, registration or sign-in will fail.
     */
    public fun required(required: Boolean) {
        cdkBuilder.required(required)
    }

    /**
     * @param required Specifies whether a user pool attribute is required. If the attribute is
     *   required and the user doesn't provide a value, registration or sign-in will fail.
     */
    public fun required(required: IResolvable) {
        cdkBuilder.required(required)
    }

    /**
     * @param stringAttributeConstraints Specifies the constraints for an attribute of the string
     *   type.
     */
    public fun stringAttributeConstraints(stringAttributeConstraints: IResolvable) {
        cdkBuilder.stringAttributeConstraints(stringAttributeConstraints)
    }

    /**
     * @param stringAttributeConstraints Specifies the constraints for an attribute of the string
     *   type.
     */
    public fun stringAttributeConstraints(
        stringAttributeConstraints: CfnUserPool.StringAttributeConstraintsProperty
    ) {
        cdkBuilder.stringAttributeConstraints(stringAttributeConstraints)
    }

    public fun build(): CfnUserPool.SchemaAttributeProperty = cdkBuilder.build()
}
