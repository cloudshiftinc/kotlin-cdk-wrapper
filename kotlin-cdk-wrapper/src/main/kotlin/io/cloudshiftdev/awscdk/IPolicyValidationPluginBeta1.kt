@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

public interface IPolicyValidationPluginBeta1 {
  public fun name(): String

  public fun ruleIds(): List<String> = unwrap(this).getRuleIds() ?: emptyList()

  public fun validate(arg0: IPolicyValidationContextBeta1): PolicyValidationPluginReportBeta1

  public fun version(): String? = unwrap(this).getVersion()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IPolicyValidationPluginBeta1,
  ) : CdkObject(cdkObject), IPolicyValidationPluginBeta1 {
    override fun name(): String = unwrap(this).getName()

    override fun ruleIds(): List<String> = unwrap(this).getRuleIds() ?: emptyList()

    override fun validate(arg0: IPolicyValidationContextBeta1): PolicyValidationPluginReportBeta1 =
        unwrap(this).validate(arg0.let(IPolicyValidationContextBeta1::unwrap)).let(PolicyValidationPluginReportBeta1::wrap)

    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IPolicyValidationPluginBeta1):
        IPolicyValidationPluginBeta1 = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPolicyValidationPluginBeta1):
        software.amazon.awscdk.IPolicyValidationPluginBeta1 = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.IPolicyValidationPluginBeta1
  }
}
