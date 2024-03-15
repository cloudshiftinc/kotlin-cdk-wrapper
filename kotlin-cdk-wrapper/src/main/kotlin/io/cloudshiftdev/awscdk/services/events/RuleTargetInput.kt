@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String

public abstract class RuleTargetInput internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.RuleTargetInput,
) : CdkObject(cdkObject) {
  public open fun bind(arg0: IRule): RuleTargetInputProperties =
      unwrap(this).bind(arg0.let(IRule::unwrap)).let(RuleTargetInputProperties::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.RuleTargetInput,
  ) : RuleTargetInput(cdkObject)

  public companion object {
    public fun fromEventPath(path: String): RuleTargetInput =
        software.amazon.awscdk.services.events.RuleTargetInput.fromEventPath(path).let(RuleTargetInput::wrap)

    public fun fromMultilineText(text: String): RuleTargetInput =
        software.amazon.awscdk.services.events.RuleTargetInput.fromMultilineText(text).let(RuleTargetInput::wrap)

    public fun fromObject(obj: Any): RuleTargetInput =
        software.amazon.awscdk.services.events.RuleTargetInput.fromObject(obj).let(RuleTargetInput::wrap)

    public fun fromText(text: String): RuleTargetInput =
        software.amazon.awscdk.services.events.RuleTargetInput.fromText(text).let(RuleTargetInput::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.RuleTargetInput):
        RuleTargetInput = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RuleTargetInput):
        software.amazon.awscdk.services.events.RuleTargetInput = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.events.RuleTargetInput
  }
}
