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
import software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySourceProps

/**
 * Properties for defining a `CfnIdentitySource`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.verifiedpermissions.*;
 * CfnIdentitySourceProps cfnIdentitySourceProps = CfnIdentitySourceProps.builder()
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
public class CfnIdentitySourcePropsDsl {
    private val cdkBuilder: CfnIdentitySourceProps.Builder = CfnIdentitySourceProps.builder()

    /**
     * @param configuration Contains configuration information used when creating a new identity
     *   source.
     *
     * At this time, the only valid member of this structure is a Amazon Cognito user pool
     * configuration.
     *
     * You must specify a `userPoolArn` , and optionally, a `ClientId` .
     *
     * This data type is used as a request parameter for the
     * [CreateIdentitySource](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreateIdentitySource.html)
     * operation.
     */
    public fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * @param configuration Contains configuration information used when creating a new identity
     *   source.
     *
     * At this time, the only valid member of this structure is a Amazon Cognito user pool
     * configuration.
     *
     * You must specify a `userPoolArn` , and optionally, a `ClientId` .
     *
     * This data type is used as a request parameter for the
     * [CreateIdentitySource](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreateIdentitySource.html)
     * operation.
     */
    public fun configuration(configuration: CfnIdentitySource.IdentitySourceConfigurationProperty) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * @param policyStoreId Specifies the ID of the policy store in which you want to store this
     *   identity source. Only policies and requests made using this policy store can reference
     *   identities from the identity provider configured in the new identity source.
     */
    public fun policyStoreId(policyStoreId: String) {
        cdkBuilder.policyStoreId(policyStoreId)
    }

    /**
     * @param principalEntityType Specifies the namespace and data type of the principals generated
     *   for identities authenticated by the new identity source.
     */
    public fun principalEntityType(principalEntityType: String) {
        cdkBuilder.principalEntityType(principalEntityType)
    }

    public fun build(): CfnIdentitySourceProps = cdkBuilder.build()
}
