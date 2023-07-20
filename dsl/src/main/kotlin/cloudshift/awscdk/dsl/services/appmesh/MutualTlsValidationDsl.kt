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
import software.amazon.awscdk.services.appmesh.MutualTlsValidation
import software.amazon.awscdk.services.appmesh.MutualTlsValidationTrust
import software.amazon.awscdk.services.appmesh.SubjectAlternativeNames

@CdkDslMarker
public class MutualTlsValidationDsl {
    private val cdkBuilder: MutualTlsValidation.Builder = MutualTlsValidation.builder()

    public fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNames) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
    }

    public fun trust(trust: MutualTlsValidationTrust) {
        cdkBuilder.trust(trust)
    }

    public fun build(): MutualTlsValidation = cdkBuilder.build()
}
