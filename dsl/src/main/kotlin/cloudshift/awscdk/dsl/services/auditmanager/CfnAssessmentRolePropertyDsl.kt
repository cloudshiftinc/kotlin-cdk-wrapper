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
public class CfnAssessmentRolePropertyDsl {
    private val cdkBuilder: CfnAssessment.RoleProperty.Builder = CfnAssessment.RoleProperty.builder()

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun roleType(roleType: String) {
        cdkBuilder.roleType(roleType)
    }

    public fun build(): CfnAssessment.RoleProperty = cdkBuilder.build()
}
