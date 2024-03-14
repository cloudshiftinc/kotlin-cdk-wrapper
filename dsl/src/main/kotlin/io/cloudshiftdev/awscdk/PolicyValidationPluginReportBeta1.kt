package io.cloudshiftdev.awscdk

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface PolicyValidationPluginReportBeta1 {
  public fun metadata(): Map<String, String> = unwrap(this).getMetadata() ?: emptyMap()

  public fun pluginVersion(): String? = unwrap(this).getPluginVersion()

  public fun success(): Boolean

  public fun violations(): List<PolicyViolationBeta1>

  public interface Builder {
    public fun metadata(metadata: Map<String, String>) {
    }

    public fun pluginVersion(pluginVersion: String) {
    }

    public fun success(success: Boolean) {
    }

    public fun violations(violations: List<PolicyViolationBeta1>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.PolicyValidationPluginReportBeta1.Builder =
        software.amazon.awscdk.PolicyValidationPluginReportBeta1.builder()

    public override fun metadata(metadata: Map<String, String>) {
      cdkBuilder.metadata(metadata)
    }

    public override fun pluginVersion(pluginVersion: String) {
      cdkBuilder.pluginVersion(pluginVersion)
    }

    public override fun success(success: Boolean) {
      cdkBuilder.success(success)
    }

    public override fun violations(violations: List<PolicyViolationBeta1>) {
      cdkBuilder.violations(violations.map(PolicyViolationBeta1::unwrap))
    }

    public fun build(): software.amazon.awscdk.PolicyValidationPluginReportBeta1 =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.PolicyValidationPluginReportBeta1,
  ) : PolicyValidationPluginReportBeta1 {
    public override fun metadata(): Map<String, String> = unwrap(this).getMetadata() ?: emptyMap()

    public override fun pluginVersion(): String? = unwrap(this).getPluginVersion()

    public override fun success(): Boolean = unwrap(this).getSuccess()

    public override fun violations(): List<PolicyViolationBeta1> =
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
