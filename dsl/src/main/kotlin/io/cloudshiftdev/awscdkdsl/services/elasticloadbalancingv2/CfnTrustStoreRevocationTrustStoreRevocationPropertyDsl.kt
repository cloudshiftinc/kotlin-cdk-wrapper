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

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation

/**
 * Information about a revocation file in use by a trust store.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * TrustStoreRevocationProperty trustStoreRevocationProperty =
 * TrustStoreRevocationProperty.builder()
 * .numberOfRevokedEntries(123)
 * .revocationId("revocationId")
 * .revocationType("revocationType")
 * .trustStoreArn("trustStoreArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-truststorerevocation-truststorerevocation.html)
 */
@CdkDslMarker
public class CfnTrustStoreRevocationTrustStoreRevocationPropertyDsl {
    private val cdkBuilder: CfnTrustStoreRevocation.TrustStoreRevocationProperty.Builder =
        CfnTrustStoreRevocation.TrustStoreRevocationProperty.builder()

    /** @param numberOfRevokedEntries The number of revoked certificates. */
    public fun numberOfRevokedEntries(numberOfRevokedEntries: Number) {
        cdkBuilder.numberOfRevokedEntries(numberOfRevokedEntries)
    }

    /** @param revocationId The revocation ID of the revocation file. */
    public fun revocationId(revocationId: String) {
        cdkBuilder.revocationId(revocationId)
    }

    /** @param revocationType The type of revocation file. */
    public fun revocationType(revocationType: String) {
        cdkBuilder.revocationType(revocationType)
    }

    /** @param trustStoreArn The Amazon Resource Name (ARN) of the trust store. */
    public fun trustStoreArn(trustStoreArn: String) {
        cdkBuilder.trustStoreArn(trustStoreArn)
    }

    public fun build(): CfnTrustStoreRevocation.TrustStoreRevocationProperty = cdkBuilder.build()
}
