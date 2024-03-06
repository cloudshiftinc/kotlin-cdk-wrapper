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

package io.cloudshiftdev.awscdkdsl.services.acmpca

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

/**
 * Contains configuration information for the default behavior of the CRL Distribution Point (CDP)
 * extension in certificates issued by your CA.
 *
 * This extension contains a link to download the CRL, so you can check whether a certificate has
 * been revoked. To choose whether you want this extension omitted or not in certificates issued by
 * your CA, you can set the *OmitExtension* parameter.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.acmpca.*;
 * CrlDistributionPointExtensionConfigurationProperty
 * crlDistributionPointExtensionConfigurationProperty =
 * CrlDistributionPointExtensionConfigurationProperty.builder()
 * .omitExtension(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crldistributionpointextensionconfiguration.html)
 */
@CdkDslMarker
public class CfnCertificateAuthorityCrlDistributionPointExtensionConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnCertificateAuthority.CrlDistributionPointExtensionConfigurationProperty.Builder =
        CfnCertificateAuthority.CrlDistributionPointExtensionConfigurationProperty.builder()

    /**
     * @param omitExtension Configures whether the CRL Distribution Point extension should be
     *   populated with the default URL to the CRL. If set to `true` , then the CDP extension will
     *   not be present in any certificates issued by that CA unless otherwise specified through CSR
     *   or API passthrough.
     *
     * Only set this if you have another way to distribute the CRL Distribution Points for
     * certificates issued by your CA, such as the Matter Distributed Compliance Ledger.
     *
     * This configuration cannot be enabled with a custom CNAME set.
     */
    public fun omitExtension(omitExtension: Boolean) {
        cdkBuilder.omitExtension(omitExtension)
    }

    /**
     * @param omitExtension Configures whether the CRL Distribution Point extension should be
     *   populated with the default URL to the CRL. If set to `true` , then the CDP extension will
     *   not be present in any certificates issued by that CA unless otherwise specified through CSR
     *   or API passthrough.
     *
     * Only set this if you have another way to distribute the CRL Distribution Points for
     * certificates issued by your CA, such as the Matter Distributed Compliance Ledger.
     *
     * This configuration cannot be enabled with a custom CNAME set.
     */
    public fun omitExtension(omitExtension: IResolvable) {
        cdkBuilder.omitExtension(omitExtension)
    }

    public fun build(): CfnCertificateAuthority.CrlDistributionPointExtensionConfigurationProperty =
        cdkBuilder.build()
}
