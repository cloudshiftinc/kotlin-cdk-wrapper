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

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rds.CfnDBInstance

/**
 * Returns the details of the DB instance’s server certificate.
 *
 * For more information, see
 * [Using SSL/TLS to encrypt a connection to a DB instance](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL.html)
 * in the *Amazon RDS User Guide* and
 * [Using SSL/TLS to encrypt a connection to a DB cluster](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL.html)
 * in the *Amazon Aurora User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * CertificateDetailsProperty certificateDetailsProperty = CertificateDetailsProperty.builder()
 * .caIdentifier("caIdentifier")
 * .validTill("validTill")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-certificatedetails.html)
 */
@CdkDslMarker
public class CfnDBInstanceCertificateDetailsPropertyDsl {
    private val cdkBuilder: CfnDBInstance.CertificateDetailsProperty.Builder =
        CfnDBInstance.CertificateDetailsProperty.builder()

    /**
     * @param caIdentifier The CA identifier of the CA certificate used for the DB instance's server
     *   certificate.
     */
    public fun caIdentifier(caIdentifier: String) {
        cdkBuilder.caIdentifier(caIdentifier)
    }

    /** @param validTill The expiration date of the DB instance’s server certificate. */
    public fun validTill(validTill: String) {
        cdkBuilder.validTill(validTill)
    }

    public fun build(): CfnDBInstance.CertificateDetailsProperty = cdkBuilder.build()
}
