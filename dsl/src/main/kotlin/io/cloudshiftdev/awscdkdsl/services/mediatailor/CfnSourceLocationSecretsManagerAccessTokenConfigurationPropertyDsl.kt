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

package io.cloudshiftdev.awscdkdsl.services.mediatailor

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediatailor.CfnSourceLocation

/**
 * AWS Secrets Manager access token configuration parameters.
 *
 * For information about Secrets Manager access token authentication, see
 * [Working with AWS Secrets Manager access token authentication](https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-access-configuration-access-token.html).</p>
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * SecretsManagerAccessTokenConfigurationProperty secretsManagerAccessTokenConfigurationProperty =
 * SecretsManagerAccessTokenConfigurationProperty.builder()
 * .headerName("headerName")
 * .secretArn("secretArn")
 * .secretStringKey("secretStringKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-secretsmanageraccesstokenconfiguration.html)
 */
@CdkDslMarker
public class CfnSourceLocationSecretsManagerAccessTokenConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnSourceLocation.SecretsManagerAccessTokenConfigurationProperty.Builder =
        CfnSourceLocation.SecretsManagerAccessTokenConfigurationProperty.builder()

    /**
     * @param headerName The name of the HTTP header used to supply the access token in requests to
     *   the source location.</p>.
     */
    public fun headerName(headerName: String) {
        cdkBuilder.headerName(headerName)
    }

    /**
     * @param secretArn The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that
     *   contains the access token.</p>.
     */
    public fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
    }

    /**
     * @param secretStringKey The AWS Secrets Manager
     *   [SecretString](https://docs.aws.amazon.com/secretsmanager/latest/apireference/API_CreateSecret.html#SecretsManager-CreateSecret-request-SecretString.html)
     *   key associated with the access token. MediaTailor uses the key to look up SecretString key
     *   and value pair containing the access token.</p>.
     */
    public fun secretStringKey(secretStringKey: String) {
        cdkBuilder.secretStringKey(secretStringKey)
    }

    public fun build(): CfnSourceLocation.SecretsManagerAccessTokenConfigurationProperty =
        cdkBuilder.build()
}
