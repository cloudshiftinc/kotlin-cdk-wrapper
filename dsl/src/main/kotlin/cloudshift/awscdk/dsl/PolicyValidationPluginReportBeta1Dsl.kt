@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.PolicyValidationPluginReportBeta1
import software.amazon.awscdk.PolicyViolationBeta1

/**
 * The report emitted by the plugin after evaluation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * PolicyValidationPluginReportBeta1 policyValidationPluginReportBeta1 =
 * PolicyValidationPluginReportBeta1.builder()
 * .success(false)
 * .violations(List.of(PolicyViolationBeta1.builder()
 * .description("description")
 * .ruleName("ruleName")
 * .violatingResources(List.of(PolicyViolatingResourceBeta1.builder()
 * .locations(List.of("locations"))
 * .resourceLogicalId("resourceLogicalId")
 * .templatePath("templatePath")
 * .build()))
 * // the properties below are optional
 * .fix("fix")
 * .ruleMetadata(Map.of(
 * "ruleMetadataKey", "ruleMetadata"))
 * .severity("severity")
 * .build()))
 * // the properties below are optional
 * .metadata(Map.of(
 * "metadataKey", "metadata"))
 * .pluginVersion("pluginVersion")
 * .build();
 * ```
 */
@CdkDslMarker
public class PolicyValidationPluginReportBeta1Dsl {
  private val cdkBuilder: PolicyValidationPluginReportBeta1.Builder =
      PolicyValidationPluginReportBeta1.builder()

  private val _violations: MutableList<PolicyViolationBeta1> = mutableListOf()

  /**
   * @param metadata Arbitrary information about the report.
   */
  public fun metadata(metadata: Map<String, String>) {
    cdkBuilder.metadata(metadata)
  }

  /**
   * @param pluginVersion The version of the plugin that created the report.
   */
  public fun pluginVersion(pluginVersion: String) {
    cdkBuilder.pluginVersion(pluginVersion)
  }

  /**
   * @param success Whether or not the report was successful. 
   */
  public fun success(success: Boolean) {
    cdkBuilder.success(success)
  }

  /**
   * @param violations List of violations in the report. 
   */
  public fun violations(violations: PolicyViolationBeta1Dsl.() -> Unit) {
    _violations.add(PolicyViolationBeta1Dsl().apply(violations).build())
  }

  /**
   * @param violations List of violations in the report. 
   */
  public fun violations(violations: Collection<PolicyViolationBeta1>) {
    _violations.addAll(violations)
  }

  public fun build(): PolicyValidationPluginReportBeta1 {
    if(_violations.isNotEmpty()) cdkBuilder.violations(_violations)
    return cdkBuilder.build()
  }
}
