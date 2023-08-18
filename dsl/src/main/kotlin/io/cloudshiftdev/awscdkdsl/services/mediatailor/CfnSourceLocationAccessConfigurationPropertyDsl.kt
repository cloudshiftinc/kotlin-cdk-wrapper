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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediatailor.CfnSourceLocation

/**
 * Access configuration parameters.</p>.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * AccessConfigurationProperty accessConfigurationProperty = AccessConfigurationProperty.builder()
 * .accessType("accessType")
 * .secretsManagerAccessTokenConfiguration(SecretsManagerAccessTokenConfigurationProperty.builder()
 * .headerName("headerName")
 * .secretArn("secretArn")
 * .secretStringKey("secretStringKey")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-accessconfiguration.html)
 */
@CdkDslMarker
public class CfnSourceLocationAccessConfigurationPropertyDsl {
    private val cdkBuilder: CfnSourceLocation.AccessConfigurationProperty.Builder =
        CfnSourceLocation.AccessConfigurationProperty.builder()

    /** @param accessType the value to be set. */
    public fun accessType(accessType: String) {
        cdkBuilder.accessType(accessType)
    }

    /**
     * @param secretsManagerAccessTokenConfiguration AWS Secrets Manager access token configuration
     *   parameters. For information about Secrets Manager access token authentication, see
     *   [Working with AWS Secrets Manager access token authentication](https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-access-configuration-access-token.html).</p>
     */
    public fun secretsManagerAccessTokenConfiguration(
        secretsManagerAccessTokenConfiguration: IResolvable
    ) {
        cdkBuilder.secretsManagerAccessTokenConfiguration(secretsManagerAccessTokenConfiguration)
    }

    /**
     * @param secretsManagerAccessTokenConfiguration AWS Secrets Manager access token configuration
     *   parameters. For information about Secrets Manager access token authentication, see
     *   [Working with AWS Secrets Manager access token authentication](https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-access-configuration-access-token.html).</p>
     */
    public fun secretsManagerAccessTokenConfiguration(
        secretsManagerAccessTokenConfiguration:
            CfnSourceLocation.SecretsManagerAccessTokenConfigurationProperty
    ) {
        cdkBuilder.secretsManagerAccessTokenConfiguration(secretsManagerAccessTokenConfiguration)
    }

    public fun build(): CfnSourceLocation.AccessConfigurationProperty = cdkBuilder.build()
}
