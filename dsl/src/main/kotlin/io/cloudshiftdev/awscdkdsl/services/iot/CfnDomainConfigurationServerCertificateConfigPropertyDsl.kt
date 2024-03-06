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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnDomainConfiguration

/**
 * The server certificate configuration.
 *
 * For more information, see
 * [Configurable endpoints](https://docs.aws.amazon.com//iot/latest/developerguide/iot-custom-endpoints-configurable.html)
 * from the AWS IoT Core Developer Guide.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * ServerCertificateConfigProperty serverCertificateConfigProperty =
 * ServerCertificateConfigProperty.builder()
 * .enableOcspCheck(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-servercertificateconfig.html)
 */
@CdkDslMarker
public class CfnDomainConfigurationServerCertificateConfigPropertyDsl {
    private val cdkBuilder: CfnDomainConfiguration.ServerCertificateConfigProperty.Builder =
        CfnDomainConfiguration.ServerCertificateConfigProperty.builder()

    /**
     * @param enableOcspCheck A Boolean value that indicates whether Online Certificate Status
     *   Protocol (OCSP) server certificate check is enabled or not. For more information, see
     *   [Configurable endpoints](https://docs.aws.amazon.com//iot/latest/developerguide/iot-custom-endpoints-configurable.html)
     *   from the AWS IoT Core Developer Guide.
     */
    public fun enableOcspCheck(enableOcspCheck: Boolean) {
        cdkBuilder.enableOcspCheck(enableOcspCheck)
    }

    /**
     * @param enableOcspCheck A Boolean value that indicates whether Online Certificate Status
     *   Protocol (OCSP) server certificate check is enabled or not. For more information, see
     *   [Configurable endpoints](https://docs.aws.amazon.com//iot/latest/developerguide/iot-custom-endpoints-configurable.html)
     *   from the AWS IoT Core Developer Guide.
     */
    public fun enableOcspCheck(enableOcspCheck: IResolvable) {
        cdkBuilder.enableOcspCheck(enableOcspCheck)
    }

    public fun build(): CfnDomainConfiguration.ServerCertificateConfigProperty = cdkBuilder.build()
}
