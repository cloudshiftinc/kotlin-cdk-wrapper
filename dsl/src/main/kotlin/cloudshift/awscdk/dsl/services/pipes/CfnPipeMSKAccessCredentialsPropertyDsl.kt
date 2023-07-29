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

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * The AWS Secrets Manager secret that stores your stream credentials.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * MSKAccessCredentialsProperty mSKAccessCredentialsProperty =
 * MSKAccessCredentialsProperty.builder()
 * .clientCertificateTlsAuth("clientCertificateTlsAuth")
 * .saslScram512Auth("saslScram512Auth")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-mskaccesscredentials.html)
 */
@CdkDslMarker
public class CfnPipeMSKAccessCredentialsPropertyDsl {
    private val cdkBuilder: CfnPipe.MSKAccessCredentialsProperty.Builder =
        CfnPipe.MSKAccessCredentialsProperty.builder()

    /** @param clientCertificateTlsAuth The ARN of the Secrets Manager secret. */
    public fun clientCertificateTlsAuth(clientCertificateTlsAuth: String) {
        cdkBuilder.clientCertificateTlsAuth(clientCertificateTlsAuth)
    }

    /** @param saslScram512Auth The ARN of the Secrets Manager secret. */
    public fun saslScram512Auth(saslScram512Auth: String) {
        cdkBuilder.saslScram512Auth(saslScram512Auth)
    }

    public fun build(): CfnPipe.MSKAccessCredentialsProperty = cdkBuilder.build()
}
