@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPool

@CdkDslMarker
public class CfnUserPoolSchemaAttributePropertyDsl {
  private val cdkBuilder: CfnUserPool.SchemaAttributeProperty.Builder =
      CfnUserPool.SchemaAttributeProperty.builder()

  /**
   * @param attributeDataType The attribute data type.
   */
  public fun attributeDataType(attributeDataType: String) {
    cdkBuilder.attributeDataType(attributeDataType)
  }

  /**
   * @param developerOnlyAttribute We recommend that you use
   * [WriteAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserPoolClientType.html#CognitoUserPools-Type-UserPoolClientType-WriteAttributes)
   * in the user pool client to control how attributes can be mutated for new use cases instead of
   * using `DeveloperOnlyAttribute` .
   * Specifies whether the attribute type is developer only. This attribute can only be modified by
   * an administrator. Users will not be able to modify this attribute using their access token.
   */
  public fun developerOnlyAttribute(developerOnlyAttribute: Boolean) {
    cdkBuilder.developerOnlyAttribute(developerOnlyAttribute)
  }

  /**
   * @param developerOnlyAttribute We recommend that you use
   * [WriteAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserPoolClientType.html#CognitoUserPools-Type-UserPoolClientType-WriteAttributes)
   * in the user pool client to control how attributes can be mutated for new use cases instead of
   * using `DeveloperOnlyAttribute` .
   * Specifies whether the attribute type is developer only. This attribute can only be modified by
   * an administrator. Users will not be able to modify this attribute using their access token.
   */
  public fun developerOnlyAttribute(developerOnlyAttribute: IResolvable) {
    cdkBuilder.developerOnlyAttribute(developerOnlyAttribute)
  }

  /**
   * @param mutable Specifies whether the value of the attribute can be changed.
   * For any user pool attribute that is mapped to an IdP attribute, you must set this parameter to
   * `true` . Amazon Cognito updates mapped attributes when users sign in to your application through
   * an IdP. If an attribute is immutable, Amazon Cognito throws an error when it attempts to update
   * the attribute. For more information, see [Specifying Identity Provider Attribute Mappings for Your
   * User
   * Pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html)
   * .
   */
  public fun mutable(mutable: Boolean) {
    cdkBuilder.mutable(mutable)
  }

  /**
   * @param mutable Specifies whether the value of the attribute can be changed.
   * For any user pool attribute that is mapped to an IdP attribute, you must set this parameter to
   * `true` . Amazon Cognito updates mapped attributes when users sign in to your application through
   * an IdP. If an attribute is immutable, Amazon Cognito throws an error when it attempts to update
   * the attribute. For more information, see [Specifying Identity Provider Attribute Mappings for Your
   * User
   * Pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html)
   * .
   */
  public fun mutable(mutable: IResolvable) {
    cdkBuilder.mutable(mutable)
  }

  /**
   * @param name A schema attribute of the name type.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param numberAttributeConstraints Specifies the constraints for an attribute of the number
   * type.
   */
  public fun numberAttributeConstraints(numberAttributeConstraints: IResolvable) {
    cdkBuilder.numberAttributeConstraints(numberAttributeConstraints)
  }

  /**
   * @param numberAttributeConstraints Specifies the constraints for an attribute of the number
   * type.
   */
  public
      fun numberAttributeConstraints(numberAttributeConstraints: CfnUserPool.NumberAttributeConstraintsProperty) {
    cdkBuilder.numberAttributeConstraints(numberAttributeConstraints)
  }

  /**
   * @param required Specifies whether a user pool attribute is required.
   * If the attribute is required and the user doesn't provide a value, registration or sign-in will
   * fail.
   */
  public fun required(required: Boolean) {
    cdkBuilder.required(required)
  }

  /**
   * @param required Specifies whether a user pool attribute is required.
   * If the attribute is required and the user doesn't provide a value, registration or sign-in will
   * fail.
   */
  public fun required(required: IResolvable) {
    cdkBuilder.required(required)
  }

  /**
   * @param stringAttributeConstraints Specifies the constraints for an attribute of the string
   * type.
   */
  public fun stringAttributeConstraints(stringAttributeConstraints: IResolvable) {
    cdkBuilder.stringAttributeConstraints(stringAttributeConstraints)
  }

  /**
   * @param stringAttributeConstraints Specifies the constraints for an attribute of the string
   * type.
   */
  public
      fun stringAttributeConstraints(stringAttributeConstraints: CfnUserPool.StringAttributeConstraintsProperty) {
    cdkBuilder.stringAttributeConstraints(stringAttributeConstraints)
  }

  public fun build(): CfnUserPool.SchemaAttributeProperty = cdkBuilder.build()
}
