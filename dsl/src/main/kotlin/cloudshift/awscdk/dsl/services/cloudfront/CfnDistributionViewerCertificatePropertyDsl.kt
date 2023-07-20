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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnDistributionViewerCertificatePropertyDsl {
    private val cdkBuilder: CfnDistribution.ViewerCertificateProperty.Builder =
        CfnDistribution.ViewerCertificateProperty.builder()

    public fun acmCertificateArn(acmCertificateArn: String) {
        cdkBuilder.acmCertificateArn(acmCertificateArn)
    }

    public fun cloudFrontDefaultCertificate(cloudFrontDefaultCertificate: Boolean) {
        cdkBuilder.cloudFrontDefaultCertificate(cloudFrontDefaultCertificate)
    }

    public fun cloudFrontDefaultCertificate(cloudFrontDefaultCertificate: IResolvable) {
        cdkBuilder.cloudFrontDefaultCertificate(cloudFrontDefaultCertificate)
    }

    public fun iamCertificateId(iamCertificateId: String) {
        cdkBuilder.iamCertificateId(iamCertificateId)
    }

    public fun minimumProtocolVersion(minimumProtocolVersion: String) {
        cdkBuilder.minimumProtocolVersion(minimumProtocolVersion)
    }

    public fun sslSupportMethod(sslSupportMethod: String) {
        cdkBuilder.sslSupportMethod(sslSupportMethod)
    }

    public fun build(): CfnDistribution.ViewerCertificateProperty = cdkBuilder.build()
}
