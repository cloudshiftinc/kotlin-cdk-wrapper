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
 * The connector-specific credentials required by Datadog.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * DatadogConnectorProfileCredentialsProperty datadogConnectorProfileCredentialsProperty =
 * DatadogConnectorProfileCredentialsProperty.builder()
 * .apiKey("apiKey")
 * .applicationKey("applicationKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-datadogconnectorprofilecredentials.html)
 */
@CdkDslMarker
public class CfnConnectorProfileDatadogConnectorProfileCredentialsPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty.Builder =
        CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty.builder()

    /**
     * @param apiKey A unique alphanumeric identifier used to authenticate a user, developer, or
     *   calling program to your API.
     */
    public fun apiKey(apiKey: String) {
        cdkBuilder.apiKey(apiKey)
    }

    /**
     * @param applicationKey Application keys, in conjunction with your API key, give you full
     *   access to Datadog’s programmatic API. Application keys are associated with the user account
     *   that created them. The application key is used to log all requests made to the API.
     */
    public fun applicationKey(applicationKey: String) {
        cdkBuilder.applicationKey(applicationKey)
    }

    public fun build(): CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty =
        cdkBuilder.build()
}
