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

package cloudshift.awscdk.dsl.services.auditmanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.auditmanager.CfnAssessment
import kotlin.String

@CdkDslMarker
public class CfnAssessmentAWSAccountPropertyDsl {
    private val cdkBuilder: CfnAssessment.AWSAccountProperty.Builder =
        CfnAssessment.AWSAccountProperty.builder()

    public fun emailAddress(emailAddress: String) {
        cdkBuilder.emailAddress(emailAddress)
    }

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnAssessment.AWSAccountProperty = cdkBuilder.build()
}
