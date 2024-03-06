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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource

/**
 * A structure that contains configuration information used when creating or updating a new identity
 * source.
 *
 * At this time, the only valid member of this structure is a Amazon Cognito user pool
 * configuration.
 *
 * You must specify a `userPoolArn` , and optionally, a `ClientId` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.verifiedpermissions.*;
 * IdentitySourceConfigurationProperty identitySourceConfigurationProperty =
 * IdentitySourceConfigurationProperty.builder()
 * .cognitoUserPoolConfiguration(CognitoUserPoolConfigurationProperty.builder()
 * .userPoolArn("userPoolArn")
 * // the properties below are optional
 * .clientIds(List.of("clientIds"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourceconfiguration.html)
 */
@CdkDslMarker
public class CfnIdentitySourceIdentitySourceConfigurationPropertyDsl {
    private val cdkBuilder: CfnIdentitySource.IdentitySourceConfigurationProperty.Builder =
        CfnIdentitySource.IdentitySourceConfigurationProperty.builder()

    /**
     * @param cognitoUserPoolConfiguration A structure that contains configuration information used
     *   when creating or updating an identity source that represents a connection to an Amazon
     *   Cognito user pool used as an identity provider for Verified Permissions .
     */
    public fun cognitoUserPoolConfiguration(cognitoUserPoolConfiguration: IResolvable) {
        cdkBuilder.cognitoUserPoolConfiguration(cognitoUserPoolConfiguration)
    }

    /**
     * @param cognitoUserPoolConfiguration A structure that contains configuration information used
     *   when creating or updating an identity source that represents a connection to an Amazon
     *   Cognito user pool used as an identity provider for Verified Permissions .
     */
    public fun cognitoUserPoolConfiguration(
        cognitoUserPoolConfiguration: CfnIdentitySource.CognitoUserPoolConfigurationProperty
    ) {
        cdkBuilder.cognitoUserPoolConfiguration(cognitoUserPoolConfiguration)
    }

    public fun build(): CfnIdentitySource.IdentitySourceConfigurationProperty = cdkBuilder.build()
}
