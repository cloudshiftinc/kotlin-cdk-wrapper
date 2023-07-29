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
 * The basic auth credentials required for basic authentication.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * BasicAuthCredentialsProperty basicAuthCredentialsProperty =
 * BasicAuthCredentialsProperty.builder()
 * .password("password")
 * .username("username")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-basicauthcredentials.html)
 */
@CdkDslMarker
public class CfnConnectorProfileBasicAuthCredentialsPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.BasicAuthCredentialsProperty.Builder =
        CfnConnectorProfile.BasicAuthCredentialsProperty.builder()

    /** @param password The password to use to connect to a resource. */
    public fun password(password: String) {
        cdkBuilder.password(password)
    }

    /** @param username The username to use to connect to a resource. */
    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnConnectorProfile.BasicAuthCredentialsProperty = cdkBuilder.build()
}
