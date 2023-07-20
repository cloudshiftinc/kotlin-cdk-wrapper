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

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificate
import software.amazon.awscdk.services.acmpca.CfnCertificateProps
import kotlin.String

@CdkDslMarker
public class CfnCertificatePropsDsl {
    private val cdkBuilder: CfnCertificateProps.Builder = CfnCertificateProps.builder()

    public fun apiPassthrough(apiPassthrough: IResolvable) {
        cdkBuilder.apiPassthrough(apiPassthrough)
    }

    public fun apiPassthrough(apiPassthrough: CfnCertificate.ApiPassthroughProperty) {
        cdkBuilder.apiPassthrough(apiPassthrough)
    }

    public fun certificateAuthorityArn(certificateAuthorityArn: String) {
        cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    public fun certificateSigningRequest(certificateSigningRequest: String) {
        cdkBuilder.certificateSigningRequest(certificateSigningRequest)
    }

    public fun signingAlgorithm(signingAlgorithm: String) {
        cdkBuilder.signingAlgorithm(signingAlgorithm)
    }

    public fun templateArn(templateArn: String) {
        cdkBuilder.templateArn(templateArn)
    }

    public fun validity(validity: IResolvable) {
        cdkBuilder.validity(validity)
    }

    public fun validity(validity: CfnCertificate.ValidityProperty) {
        cdkBuilder.validity(validity)
    }

    public fun validityNotBefore(validityNotBefore: IResolvable) {
        cdkBuilder.validityNotBefore(validityNotBefore)
    }

    public fun validityNotBefore(validityNotBefore: CfnCertificate.ValidityProperty) {
        cdkBuilder.validityNotBefore(validityNotBefore)
    }

    public fun build(): CfnCertificateProps = cdkBuilder.build()
}
