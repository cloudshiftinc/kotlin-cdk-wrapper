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
public class CfnAssessmentAssessmentReportsDestinationPropertyDsl {
    private val cdkBuilder: CfnAssessment.AssessmentReportsDestinationProperty.Builder =
        CfnAssessment.AssessmentReportsDestinationProperty.builder()

    public fun destination(destination: String) {
        cdkBuilder.destination(destination)
    }

    public fun destinationType(destinationType: String) {
        cdkBuilder.destinationType(destinationType)
    }

    public fun build(): CfnAssessment.AssessmentReportsDestinationProperty = cdkBuilder.build()
}
