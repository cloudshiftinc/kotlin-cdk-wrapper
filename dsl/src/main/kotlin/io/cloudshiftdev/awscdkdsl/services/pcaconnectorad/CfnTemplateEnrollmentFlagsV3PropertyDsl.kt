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

package io.cloudshiftdev.awscdkdsl.services.pcaconnectorad

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplate

/**
 * Template configurations for v3 template schema.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * EnrollmentFlagsV3Property enrollmentFlagsV3Property = EnrollmentFlagsV3Property.builder()
 * .enableKeyReuseOnNtTokenKeysetStorageFull(false)
 * .includeSymmetricAlgorithms(false)
 * .noSecurityExtension(false)
 * .removeInvalidCertificateFromPersonalStore(false)
 * .userInteractionRequired(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv3.html)
 */
@CdkDslMarker
public class CfnTemplateEnrollmentFlagsV3PropertyDsl {
    private val cdkBuilder: CfnTemplate.EnrollmentFlagsV3Property.Builder =
        CfnTemplate.EnrollmentFlagsV3Property.builder()

    /** @param enableKeyReuseOnNtTokenKeysetStorageFull Allow renewal using the same key. */
    public fun enableKeyReuseOnNtTokenKeysetStorageFull(
        enableKeyReuseOnNtTokenKeysetStorageFull: Boolean
    ) {
        cdkBuilder.enableKeyReuseOnNtTokenKeysetStorageFull(
            enableKeyReuseOnNtTokenKeysetStorageFull
        )
    }

    /** @param enableKeyReuseOnNtTokenKeysetStorageFull Allow renewal using the same key. */
    public fun enableKeyReuseOnNtTokenKeysetStorageFull(
        enableKeyReuseOnNtTokenKeysetStorageFull: IResolvable
    ) {
        cdkBuilder.enableKeyReuseOnNtTokenKeysetStorageFull(
            enableKeyReuseOnNtTokenKeysetStorageFull
        )
    }

    /** @param includeSymmetricAlgorithms Include symmetric algorithms allowed by the subject. */
    public fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: Boolean) {
        cdkBuilder.includeSymmetricAlgorithms(includeSymmetricAlgorithms)
    }

    /** @param includeSymmetricAlgorithms Include symmetric algorithms allowed by the subject. */
    public fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: IResolvable) {
        cdkBuilder.includeSymmetricAlgorithms(includeSymmetricAlgorithms)
    }

    /**
     * @param noSecurityExtension This flag instructs the CA to not include the security extension
     *   szOID_NTDS_CA_SECURITY_EXT (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections
     *   2.2.2.7.7.4 and 3.2.2.6.2.1.4.5.9, in the issued certificate. This addresses a Windows
     *   Kerberos elevation-of-privilege vulnerability.
     */
    public fun noSecurityExtension(noSecurityExtension: Boolean) {
        cdkBuilder.noSecurityExtension(noSecurityExtension)
    }

    /**
     * @param noSecurityExtension This flag instructs the CA to not include the security extension
     *   szOID_NTDS_CA_SECURITY_EXT (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections
     *   2.2.2.7.7.4 and 3.2.2.6.2.1.4.5.9, in the issued certificate. This addresses a Windows
     *   Kerberos elevation-of-privilege vulnerability.
     */
    public fun noSecurityExtension(noSecurityExtension: IResolvable) {
        cdkBuilder.noSecurityExtension(noSecurityExtension)
    }

    /**
     * @param removeInvalidCertificateFromPersonalStore Delete expired or revoked certificates
     *   instead of archiving them.
     */
    public fun removeInvalidCertificateFromPersonalStore(
        removeInvalidCertificateFromPersonalStore: Boolean
    ) {
        cdkBuilder.removeInvalidCertificateFromPersonalStore(
            removeInvalidCertificateFromPersonalStore
        )
    }

    /**
     * @param removeInvalidCertificateFromPersonalStore Delete expired or revoked certificates
     *   instead of archiving them.
     */
    public fun removeInvalidCertificateFromPersonalStore(
        removeInvalidCertificateFromPersonalStore: IResolvable
    ) {
        cdkBuilder.removeInvalidCertificateFromPersonalStore(
            removeInvalidCertificateFromPersonalStore
        )
    }

    /**
     * @param userInteractionRequired Require user interaction when the subject is enrolled and the
     *   private key associated with the certificate is used.
     */
    public fun userInteractionRequired(userInteractionRequired: Boolean) {
        cdkBuilder.userInteractionRequired(userInteractionRequired)
    }

    /**
     * @param userInteractionRequired Require user interaction when the subject is enrolled and the
     *   private key associated with the certificate is used.
     */
    public fun userInteractionRequired(userInteractionRequired: IResolvable) {
        cdkBuilder.userInteractionRequired(userInteractionRequired)
    }

    public fun build(): CfnTemplate.EnrollmentFlagsV3Property = cdkBuilder.build()
}
