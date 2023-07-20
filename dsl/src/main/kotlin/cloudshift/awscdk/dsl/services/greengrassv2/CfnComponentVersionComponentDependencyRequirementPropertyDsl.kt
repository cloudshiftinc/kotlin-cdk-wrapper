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

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion
import kotlin.String

@CdkDslMarker
public class CfnComponentVersionComponentDependencyRequirementPropertyDsl {
    private val cdkBuilder: CfnComponentVersion.ComponentDependencyRequirementProperty.Builder =
        CfnComponentVersion.ComponentDependencyRequirementProperty.builder()

    public fun dependencyType(dependencyType: String) {
        cdkBuilder.dependencyType(dependencyType)
    }

    public fun versionRequirement(versionRequirement: String) {
        cdkBuilder.versionRequirement(versionRequirement)
    }

    public fun build(): CfnComponentVersion.ComponentDependencyRequirementProperty =
        cdkBuilder.build()
}
