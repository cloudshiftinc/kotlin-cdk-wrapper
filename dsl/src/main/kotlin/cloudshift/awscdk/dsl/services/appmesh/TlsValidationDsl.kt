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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appmesh.SubjectAlternativeNames
import software.amazon.awscdk.services.appmesh.TlsValidation
import software.amazon.awscdk.services.appmesh.TlsValidationTrust

@CdkDslMarker
public class TlsValidationDsl {
    private val cdkBuilder: TlsValidation.Builder = TlsValidation.builder()

    public fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNames) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
    }

    public fun trust(trust: TlsValidationTrust) {
        cdkBuilder.trust(trust)
    }

    public fun build(): TlsValidation = cdkBuilder.build()
}
