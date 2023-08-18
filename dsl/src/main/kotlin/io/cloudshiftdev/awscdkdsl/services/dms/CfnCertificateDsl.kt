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

package io.cloudshiftdev.awscdkdsl.services.dms

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.dms.CfnCertificate
import software.constructs.Construct

/**
 * The `AWS::DMS::Certificate` resource creates an Secure Sockets Layer (SSL) certificate that
 * encrypts connections between AWS DMS endpoints and the replication instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * CfnCertificate cfnCertificate = CfnCertificate.Builder.create(this, "MyCfnCertificate")
 * .certificateIdentifier("certificateIdentifier")
 * .certificatePem("certificatePem")
 * .certificateWallet("certificateWallet")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html)
 */
@CdkDslMarker
public class CfnCertificateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCertificate.Builder = CfnCertificate.Builder.create(scope, id)

    /**
     * A customer-assigned name for the certificate.
     *
     * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens. They can't end with a hyphen or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificateidentifier)
     *
     * @param certificateIdentifier A customer-assigned name for the certificate.
     */
    public fun certificateIdentifier(certificateIdentifier: String) {
        cdkBuilder.certificateIdentifier(certificateIdentifier)
    }

    /**
     * The contents of a `.pem` file, which contains an X.509 certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatepem)
     *
     * @param certificatePem The contents of a `.pem` file, which contains an X.509 certificate.
     */
    public fun certificatePem(certificatePem: String) {
        cdkBuilder.certificatePem(certificatePem)
    }

    /**
     * The location of an imported Oracle Wallet certificate for use with SSL.
     *
     * An example is: `filebase64("${path.root}/rds-ca-2019-root.sso")`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatewallet)
     *
     * @param certificateWallet The location of an imported Oracle Wallet certificate for use with
     *   SSL.
     */
    public fun certificateWallet(certificateWallet: String) {
        cdkBuilder.certificateWallet(certificateWallet)
    }

    public fun build(): CfnCertificate = cdkBuilder.build()
}
