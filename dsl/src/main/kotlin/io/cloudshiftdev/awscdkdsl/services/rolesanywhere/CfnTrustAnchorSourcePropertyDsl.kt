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

package io.cloudshiftdev.awscdkdsl.services.rolesanywhere

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor

/**
 * The trust anchor type and its related certificate data.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rolesanywhere.*;
 * SourceProperty sourceProperty = SourceProperty.builder()
 * .sourceData(SourceDataProperty.builder()
 * .acmPcaArn("acmPcaArn")
 * .x509CertificateData("x509CertificateData")
 * .build())
 * .sourceType("sourceType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-trustanchor-source.html)
 */
@CdkDslMarker
public class CfnTrustAnchorSourcePropertyDsl {
    private val cdkBuilder: CfnTrustAnchor.SourceProperty.Builder =
        CfnTrustAnchor.SourceProperty.builder()

    /** @param sourceData The data field of the trust anchor depending on its type. */
    public fun sourceData(sourceData: IResolvable) {
        cdkBuilder.sourceData(sourceData)
    }

    /** @param sourceData The data field of the trust anchor depending on its type. */
    public fun sourceData(sourceData: CfnTrustAnchor.SourceDataProperty) {
        cdkBuilder.sourceData(sourceData)
    }

    /**
     * @param sourceType The type of the TrustAnchor.
     *
     * `AWS_ACM_PCA` is not an allowed value in your region.
     */
    public fun sourceType(sourceType: String) {
        cdkBuilder.sourceType(sourceType)
    }

    public fun build(): CfnTrustAnchor.SourceProperty = cdkBuilder.build()
}
