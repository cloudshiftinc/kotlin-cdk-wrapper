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

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

/**
 * The connector-specific credentials required when using Amplitude.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * AmplitudeConnectorProfileCredentialsProperty amplitudeConnectorProfileCredentialsProperty =
 * AmplitudeConnectorProfileCredentialsProperty.builder()
 * .apiKey("apiKey")
 * .secretKey("secretKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-amplitudeconnectorprofilecredentials.html)
 */
@CdkDslMarker
public class CfnConnectorProfileAmplitudeConnectorProfileCredentialsPropertyDsl {
    private val cdkBuilder:
        CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty.Builder =
        CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty.builder()

    /**
     * @param apiKey A unique alphanumeric identifier used to authenticate a user, developer, or
     *   calling program to your API.
     */
    public fun apiKey(apiKey: String) {
        cdkBuilder.apiKey(apiKey)
    }

    /** @param secretKey The Secret Access Key portion of the credentials. */
    public fun secretKey(secretKey: String) {
        cdkBuilder.secretKey(secretKey)
    }

    public fun build(): CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty =
        cdkBuilder.build()
}
