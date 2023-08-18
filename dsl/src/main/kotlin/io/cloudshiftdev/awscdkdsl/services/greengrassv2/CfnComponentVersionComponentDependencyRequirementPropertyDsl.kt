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

package io.cloudshiftdev.awscdkdsl.services.greengrassv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion

/**
 * Contains information about a component dependency for a Lambda function component.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrassv2.*;
 * ComponentDependencyRequirementProperty componentDependencyRequirementProperty =
 * ComponentDependencyRequirementProperty.builder()
 * .dependencyType("dependencyType")
 * .versionRequirement("versionRequirement")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-componentdependencyrequirement.html)
 */
@CdkDslMarker
public class CfnComponentVersionComponentDependencyRequirementPropertyDsl {
    private val cdkBuilder: CfnComponentVersion.ComponentDependencyRequirementProperty.Builder =
        CfnComponentVersion.ComponentDependencyRequirementProperty.builder()

    /**
     * @param dependencyType The type of this dependency. Choose from the following options:.
     * * `SOFT` – The component doesn't restart if the dependency changes state.
     * * `HARD` – The component restarts if the dependency changes state.
     *
     * Default: `HARD`
     */
    public fun dependencyType(dependencyType: String) {
        cdkBuilder.dependencyType(dependencyType)
    }

    /**
     * @param versionRequirement The component version requirement for the component dependency. AWS
     *   IoT Greengrass uses semantic version constraints. For more information, see
     *   [Semantic Versioning](https://docs.aws.amazon.com/https://semver.org/) .
     */
    public fun versionRequirement(versionRequirement: String) {
        cdkBuilder.versionRequirement(versionRequirement)
    }

    public fun build(): CfnComponentVersion.ComponentDependencyRequirementProperty =
        cdkBuilder.build()
}
