package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.collections.List

public interface IPolicyValidationPluginBeta1 {
  public fun name(): String

  public fun ruleIds(): List<String> = unwrap(this).getRuleIds() ?: emptyList()

  public fun validate(arg0: IPolicyValidationContextBeta1): PolicyValidationPluginReportBeta1

  public fun version(): String? = unwrap(this).getVersion()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.IPolicyValidationPluginBeta1,
  ) : IPolicyValidationPluginBeta1 {
    public override fun name(): String = unwrap(this).getName()

    public override fun ruleIds(): List<String> = unwrap(this).getRuleIds() ?: emptyList()

    public override fun validate(arg0: IPolicyValidationContextBeta1):
        PolicyValidationPluginReportBeta1 =
        unwrap(this).validate(arg0.let(IPolicyValidationContextBeta1::unwrap)).let(PolicyValidationPluginReportBeta1::wrap)

    public override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.IPolicyValidationPluginBeta1):
        IPolicyValidationPluginBeta1 = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPolicyValidationPluginBeta1):
        software.amazon.awscdk.IPolicyValidationPluginBeta1 = (wrapped as Wrapper).cdkObject
  }
}
