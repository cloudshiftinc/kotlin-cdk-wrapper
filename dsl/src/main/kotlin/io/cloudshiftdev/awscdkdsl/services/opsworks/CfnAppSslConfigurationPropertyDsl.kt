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

package io.cloudshiftdev.awscdkdsl.services.opsworks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opsworks.CfnApp

/**
 * Describes an app's SSL configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
 * SslConfigurationProperty sslConfigurationProperty = SslConfigurationProperty.builder()
 * .certificate("certificate")
 * .chain("chain")
 * .privateKey("privateKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html)
 */
@CdkDslMarker
public class CfnAppSslConfigurationPropertyDsl {
    private val cdkBuilder: CfnApp.SslConfigurationProperty.Builder =
        CfnApp.SslConfigurationProperty.builder()

    /** @param certificate The contents of the certificate's domain.crt file. */
    public fun certificate(certificate: String) {
        cdkBuilder.certificate(certificate)
    }

    /**
     * @param chain Optional. Can be used to specify an intermediate certificate authority key or
     *   client authentication.
     */
    public fun chain(chain: String) {
        cdkBuilder.chain(chain)
    }

    /** @param privateKey The private key;. the contents of the certificate's domain.kex file. */
    public fun privateKey(privateKey: String) {
        cdkBuilder.privateKey(privateKey)
    }

    public fun build(): CfnApp.SslConfigurationProperty = cdkBuilder.build()
}
