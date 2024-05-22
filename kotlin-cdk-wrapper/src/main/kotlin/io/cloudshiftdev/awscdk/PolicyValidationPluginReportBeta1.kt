@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * The report emitted by the plugin after evaluation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
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
public interface PolicyValidationPluginReportBeta1 {
  /**
   * Arbitrary information about the report.
   *
   * Default: - no metadata
   */
  public fun metadata(): Map<String, String> = unwrap(this).getMetadata() ?: emptyMap()

  /**
   * The version of the plugin that created the report.
   *
   * Default: - no version
   */
  public fun pluginVersion(): String? = unwrap(this).getPluginVersion()

  /**
   * Whether or not the report was successful.
   */
  public fun success(): Boolean

  /**
   * List of violations in the report.
   */
  public fun violations(): List<PolicyViolationBeta1>

  /**
   * A builder for [PolicyValidationPluginReportBeta1]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param metadata Arbitrary information about the report.
     */
    public fun metadata(metadata: Map<String, String>)

    /**
     * @param pluginVersion The version of the plugin that created the report.
     */
    public fun pluginVersion(pluginVersion: String)

    /**
     * @param success Whether or not the report was successful. 
     */
    public fun success(success: Boolean)

    /**
     * @param violations List of violations in the report. 
     */
    public fun violations(violations: List<PolicyViolationBeta1>)

    /**
     * @param violations List of violations in the report. 
     */
    public fun violations(vararg violations: PolicyViolationBeta1)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.PolicyValidationPluginReportBeta1.Builder =
        software.amazon.awscdk.PolicyValidationPluginReportBeta1.builder()

    /**
     * @param metadata Arbitrary information about the report.
     */
    override fun metadata(metadata: Map<String, String>) {
      cdkBuilder.metadata(metadata)
    }

    /**
     * @param pluginVersion The version of the plugin that created the report.
     */
    override fun pluginVersion(pluginVersion: String) {
      cdkBuilder.pluginVersion(pluginVersion)
    }

    /**
     * @param success Whether or not the report was successful. 
     */
    override fun success(success: Boolean) {
      cdkBuilder.success(success)
    }

    /**
     * @param violations List of violations in the report. 
     */
    override fun violations(violations: List<PolicyViolationBeta1>) {
      cdkBuilder.violations(violations.map(PolicyViolationBeta1.Companion::unwrap))
    }

    /**
     * @param violations List of violations in the report. 
     */
    override fun violations(vararg violations: PolicyViolationBeta1): Unit =
        violations(violations.toList())

    public fun build(): software.amazon.awscdk.PolicyValidationPluginReportBeta1 =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.PolicyValidationPluginReportBeta1,
  ) : CdkObject(cdkObject), PolicyValidationPluginReportBeta1 {
    /**
     * Arbitrary information about the report.
     *
     * Default: - no metadata
     */
    override fun metadata(): Map<String, String> = unwrap(this).getMetadata() ?: emptyMap()

    /**
     * The version of the plugin that created the report.
     *
     * Default: - no version
     */
    override fun pluginVersion(): String? = unwrap(this).getPluginVersion()

    /**
     * Whether or not the report was successful.
     */
    override fun success(): Boolean = unwrap(this).getSuccess()

    /**
     * List of violations in the report.
     */
    override fun violations(): List<PolicyViolationBeta1> =
        unwrap(this).getViolations().map(PolicyViolationBeta1::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PolicyValidationPluginReportBeta1 {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.PolicyValidationPluginReportBeta1):
        PolicyValidationPluginReportBeta1 = CdkObjectWrappers.wrap(cdkObject) as?
        PolicyValidationPluginReportBeta1 ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: PolicyValidationPluginReportBeta1):
        software.amazon.awscdk.PolicyValidationPluginReportBeta1 = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.PolicyValidationPluginReportBeta1
  }
}
