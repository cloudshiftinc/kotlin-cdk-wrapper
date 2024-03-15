@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

  @CdkDslMarker
  public interface Builder {
    public fun metadata(metadata: Map<String, String>)

    public fun pluginVersion(pluginVersion: String)

    public fun success(success: Boolean)

    public fun violations(violations: List<PolicyViolationBeta1>)

    public fun violations(vararg violations: PolicyViolationBeta1)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.PolicyValidationPluginReportBeta1.Builder =
        software.amazon.awscdk.PolicyValidationPluginReportBeta1.builder()

    override fun metadata(metadata: Map<String, String>) {
      cdkBuilder.metadata(metadata)
    }

    override fun pluginVersion(pluginVersion: String) {
      cdkBuilder.pluginVersion(pluginVersion)
    }

    override fun success(success: Boolean) {
      cdkBuilder.success(success)
    }

    override fun violations(violations: List<PolicyViolationBeta1>) {
      cdkBuilder.violations(violations.map(PolicyViolationBeta1::unwrap))
    }

    override fun violations(vararg violations: PolicyViolationBeta1): Unit =
        violations(violations.toList())

    public fun build(): software.amazon.awscdk.PolicyValidationPluginReportBeta1 =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.PolicyValidationPluginReportBeta1,
  ) : CdkObject(cdkObject), PolicyValidationPluginReportBeta1 {
    override fun metadata(): Map<String, String> = unwrap(this).getMetadata() ?: emptyMap()

    override fun pluginVersion(): String? = unwrap(this).getPluginVersion()

    override fun success(): Boolean = unwrap(this).getSuccess()

    override fun violations(): List<PolicyViolationBeta1> =
        unwrap(this).getViolations().map(PolicyViolationBeta1::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PolicyValidationPluginReportBeta1 {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.PolicyValidationPluginReportBeta1):
        PolicyValidationPluginReportBeta1 = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PolicyValidationPluginReportBeta1):
        software.amazon.awscdk.PolicyValidationPluginReportBeta1 = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.PolicyValidationPluginReportBeta1
  }
}
