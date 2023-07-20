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
public class CfnAssessmentAWSServicePropertyDsl {
    private val cdkBuilder: CfnAssessment.AWSServiceProperty.Builder =
        CfnAssessment.AWSServiceProperty.builder()

    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    public fun build(): CfnAssessment.AWSServiceProperty = cdkBuilder.build()
}
