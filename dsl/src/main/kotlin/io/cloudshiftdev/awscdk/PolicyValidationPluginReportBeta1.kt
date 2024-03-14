package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

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
      cdkBuilder.violations(violations.map(PolicyViolationBeta1::unwrap))
    }

    /**
     * @param violations List of violations in the report. 
     */
    override fun violations(vararg violations: PolicyViolationBeta1): Unit =
        violations(violations.toList())

    public fun build(): software.amazon.awscdk.PolicyValidationPluginReportBeta1 =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.PolicyValidationPluginReportBeta1,
  ) : PolicyValidationPluginReportBeta1 {
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
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): PolicyValidationPluginReportBeta1 {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.PolicyValidationPluginReportBeta1):
        PolicyValidationPluginReportBeta1 = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PolicyValidationPluginReportBeta1):
        software.amazon.awscdk.PolicyValidationPluginReportBeta1 = (wrapped as Wrapper).cdkObject
  }
}
