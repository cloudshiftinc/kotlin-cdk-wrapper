@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.IRule
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import io.cloudshiftdev.awscdk.services.events.RuleTargetInputProperties
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class LogGroupTargetInput internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.events.targets.LogGroupTargetInput,
) : CdkObject(cdkObject) {
  public open fun bind(arg0: IRule): RuleTargetInputProperties =
      unwrap(this).bind(arg0.let(IRule::unwrap)).let(RuleTargetInputProperties::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.targets.LogGroupTargetInput,
  ) : LogGroupTargetInput(cdkObject)

  public companion object {
    public fun fromObject(): RuleTargetInput =
        software.amazon.awscdk.services.events.targets.LogGroupTargetInput.fromObject().let(RuleTargetInput::wrap)

    public fun fromObject(options: LogGroupTargetInputOptions): RuleTargetInput =
        software.amazon.awscdk.services.events.targets.LogGroupTargetInput.fromObject(options.let(LogGroupTargetInputOptions::unwrap)).let(RuleTargetInput::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("898b6d05b662d8870ea1382acc3991a186e6104ddb70b26df0483ceecd8265c6")
    public fun fromObject(options: LogGroupTargetInputOptions.Builder.() -> Unit): RuleTargetInput =
        fromObject(LogGroupTargetInputOptions(options))

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.LogGroupTargetInput):
        LogGroupTargetInput = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogGroupTargetInput):
        software.amazon.awscdk.services.events.targets.LogGroupTargetInput = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.LogGroupTargetInput
  }
}
