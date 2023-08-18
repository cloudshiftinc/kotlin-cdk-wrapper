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

package io.cloudshiftdev.awscdkdsl.services.pipes

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
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
 * SelfManagedKafkaAccessConfigurationCredentialsProperty
 * selfManagedKafkaAccessConfigurationCredentialsProperty =
 * SelfManagedKafkaAccessConfigurationCredentialsProperty.builder()
 * .basicAuth("basicAuth")
 * .clientCertificateTlsAuth("clientCertificateTlsAuth")
 * .saslScram256Auth("saslScram256Auth")
 * .saslScram512Auth("saslScram512Auth")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-selfmanagedkafkaaccessconfigurationcredentials.html)
 */
@CdkDslMarker
public class CfnPipeSelfManagedKafkaAccessConfigurationCredentialsPropertyDsl {
    private val cdkBuilder: CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty.Builder =
        CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty.builder()

    /** @param basicAuth The ARN of the Secrets Manager secret. */
    public fun basicAuth(basicAuth: String) {
        cdkBuilder.basicAuth(basicAuth)
    }

    /** @param clientCertificateTlsAuth The ARN of the Secrets Manager secret. */
    public fun clientCertificateTlsAuth(clientCertificateTlsAuth: String) {
        cdkBuilder.clientCertificateTlsAuth(clientCertificateTlsAuth)
    }

    /** @param saslScram256Auth The ARN of the Secrets Manager secret. */
    public fun saslScram256Auth(saslScram256Auth: String) {
        cdkBuilder.saslScram256Auth(saslScram256Auth)
    }

    /** @param saslScram512Auth The ARN of the Secrets Manager secret. */
    public fun saslScram512Auth(saslScram512Auth: String) {
        cdkBuilder.saslScram512Auth(saslScram512Auth)
    }

    public fun build(): CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty =
        cdkBuilder.build()
}
