@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.CfnDBInstance
import kotlin.String

@CdkDslMarker
public class CfnDBInstanceCertificateDetailsPropertyDsl {
    private val cdkBuilder: CfnDBInstance.CertificateDetailsProperty.Builder =
        CfnDBInstance.CertificateDetailsProperty.builder()

    public fun caIdentifier(caIdentifier: String) {
        cdkBuilder.caIdentifier(caIdentifier)
    }

    public fun validTill(validTill: String) {
        cdkBuilder.validTill(validTill)
    }

    public fun build(): CfnDBInstance.CertificateDetailsProperty = cdkBuilder.build()
}
