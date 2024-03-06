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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource

/**
 * A structure that contains configuration information used when creating or updating an identity
 * source that represents a connection to an Amazon Cognito user pool used as an identity provider
 * for Verified Permissions .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.verifiedpermissions.*;
 * CognitoUserPoolConfigurationProperty cognitoUserPoolConfigurationProperty =
 * CognitoUserPoolConfigurationProperty.builder()
 * .userPoolArn("userPoolArn")
 * // the properties below are optional
 * .clientIds(List.of("clientIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-cognitouserpoolconfiguration.html)
 */
@CdkDslMarker
public class CfnIdentitySourceCognitoUserPoolConfigurationPropertyDsl {
    private val cdkBuilder: CfnIdentitySource.CognitoUserPoolConfigurationProperty.Builder =
        CfnIdentitySource.CognitoUserPoolConfigurationProperty.builder()

    private val _clientIds: MutableList<String> = mutableListOf()

    /**
     * @param clientIds The unique application client IDs that are associated with the specified
     *   Amazon Cognito user pool. Example: `"ClientIds": ["&amp;ExampleCogClientId;"]`
     */
    public fun clientIds(vararg clientIds: String) {
        _clientIds.addAll(listOf(*clientIds))
    }

    /**
     * @param clientIds The unique application client IDs that are associated with the specified
     *   Amazon Cognito user pool. Example: `"ClientIds": ["&amp;ExampleCogClientId;"]`
     */
    public fun clientIds(clientIds: Collection<String>) {
        _clientIds.addAll(clientIds)
    }

    /**
     * @param userPoolArn The
     *   [Amazon Resource Name (ARN)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html)
     *   of the Amazon Cognito user pool that contains the identities to be authorized.
     */
    public fun userPoolArn(userPoolArn: String) {
        cdkBuilder.userPoolArn(userPoolArn)
    }

    public fun build(): CfnIdentitySource.CognitoUserPoolConfigurationProperty {
        if (_clientIds.isNotEmpty()) cdkBuilder.clientIds(_clientIds)
        return cdkBuilder.build()
    }
}
