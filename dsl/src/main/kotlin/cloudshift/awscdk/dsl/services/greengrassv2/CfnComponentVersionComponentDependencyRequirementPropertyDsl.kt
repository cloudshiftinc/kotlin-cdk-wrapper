@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion

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
   * @param versionRequirement The component version requirement for the component dependency.
   * AWS IoT Greengrass uses semantic version constraints. For more information, see [Semantic
   * Versioning](https://docs.aws.amazon.com/https://semver.org/) .
   */
  public fun versionRequirement(versionRequirement: String) {
    cdkBuilder.versionRequirement(versionRequirement)
  }

  public fun build(): CfnComponentVersion.ComponentDependencyRequirementProperty =
      cdkBuilder.build()
}
