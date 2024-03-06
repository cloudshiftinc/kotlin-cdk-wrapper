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

package io.cloudshiftdev.awscdkdsl.services.verifiedpermissions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource
import software.constructs.Construct

/**
 * Creates or updates a reference to Amazon Cognito as an external identity provider.
 *
 * If you are creating a new identity source, then you must specify a `Configuration` . If you are
 * updating an existing identity source, then you must specify an `UpdateConfiguration` .
 *
 * After you create an identity source, you can use the identities provided by the IdP as proxies
 * for the principal in authorization queries that use the
 * [IsAuthorizedWithToken](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_IsAuthorizedWithToken.html)
 * operation. These identities take the form of tokens that contain claims about the user, such as
 * IDs, attributes and group memberships. Amazon Cognito provides both identity tokens and access
 * tokens, and Verified Permissions can use either or both. Any combination of identity and access
 * tokens results in the same Cedar principal. Verified Permissions automatically translates the
 * information about the identities into the standard Cedar attributes that can be evaluated by your
 * policies. Because the Amazon Cognito identity and access tokens can contain different
 * information, the tokens you choose to use determine the attributes that are available to access
 * in the Cedar principal from your policies.
 *
 * Amazon Cognito Identity is not available in all of the same AWS Regions as Amazon Verified
 * Permissions . Because of this, the `AWS::VerifiedPermissions::IdentitySource` type is not
 * available to create from AWS CloudFormation in Regions where Amazon Cognito Identity is not
 * currently available. Users can still create `AWS::VerifiedPermissions::IdentitySource` in those
 * Regions, but only from the AWS CLI , Amazon Verified Permissions SDK, or from the AWS console.
 *
 * To reference a user from this identity source in your Cedar policies, use the following syntax.
 *
 * *IdentityType::"<CognitoUserPoolIdentifier>|<CognitoClientId>*
 *
 * Where `IdentityType` is the string that you provide to the `PrincipalEntityType` parameter for
 * this operation. The `CognitoUserPoolId` and `CognitoClientId` are defined by the Amazon Cognito
 * user pool.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.verifiedpermissions.*;
 * CfnIdentitySource cfnIdentitySource = CfnIdentitySource.Builder.create(this,
 * "MyCfnIdentitySource")
 * .configuration(IdentitySourceConfigurationProperty.builder()
 * .cognitoUserPoolConfiguration(CognitoUserPoolConfigurationProperty.builder()
 * .userPoolArn("userPoolArn")
 * // the properties below are optional
 * .clientIds(List.of("clientIds"))
 * .build())
 * .build())
 * .policyStoreId("policyStoreId")
 * // the properties below are optional
 * .principalEntityType("principalEntityType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html)
 */
@CdkDslMarker
public class CfnIdentitySourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnIdentitySource.Builder = CfnIdentitySource.Builder.create(scope, id)

    /**
     * Contains configuration information used when creating a new identity source.
     *
     * At this time, the only valid member of this structure is a Amazon Cognito user pool
     * configuration.
     *
     * You must specify a `userPoolArn` , and optionally, a `ClientId` .
     *
     * This data type is used as a request parameter for the
     * [CreateIdentitySource](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreateIdentitySource.html)
     * operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html#cfn-verifiedpermissions-identitysource-configuration)
     *
     * @param configuration Contains configuration information used when creating a new identity
     *   source.
     */
    public fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * Contains configuration information used when creating a new identity source.
     *
     * At this time, the only valid member of this structure is a Amazon Cognito user pool
     * configuration.
     *
     * You must specify a `userPoolArn` , and optionally, a `ClientId` .
     *
     * This data type is used as a request parameter for the
     * [CreateIdentitySource](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreateIdentitySource.html)
     * operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html#cfn-verifiedpermissions-identitysource-configuration)
     *
     * @param configuration Contains configuration information used when creating a new identity
     *   source.
     */
    public fun configuration(configuration: CfnIdentitySource.IdentitySourceConfigurationProperty) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * Specifies the ID of the policy store in which you want to store this identity source.
     *
     * Only policies and requests made using this policy store can reference identities from the
     * identity provider configured in the new identity source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html#cfn-verifiedpermissions-identitysource-policystoreid)
     *
     * @param policyStoreId Specifies the ID of the policy store in which you want to store this
     *   identity source.
     */
    public fun policyStoreId(policyStoreId: String) {
        cdkBuilder.policyStoreId(policyStoreId)
    }

    /**
     * Specifies the namespace and data type of the principals generated for identities
     * authenticated by the new identity source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html#cfn-verifiedpermissions-identitysource-principalentitytype)
     *
     * @param principalEntityType Specifies the namespace and data type of the principals generated
     *   for identities authenticated by the new identity source.
     */
    public fun principalEntityType(principalEntityType: String) {
        cdkBuilder.principalEntityType(principalEntityType)
    }

    public fun build(): CfnIdentitySource = cdkBuilder.build()
}
