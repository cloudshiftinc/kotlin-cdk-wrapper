@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

/**
 * The mode of evaluation for the rule.
 *
 * Example:
 *
 * ```
 * Function fn;
 * String samplePolicyText;
 * ManagedRule.Builder.create(this, "ManagedRule")
 * .identifier(ManagedRuleIdentifiers.API_GW_XRAY_ENABLED)
 * .evaluationModes(EvaluationMode.DETECTIVE_AND_PROACTIVE)
 * .build();
 * CustomRule.Builder.create(this, "CustomRule")
 * .lambdaFunction(fn)
 * .evaluationModes(EvaluationMode.PROACTIVE)
 * .build();
 * CustomPolicy.Builder.create(this, "CustomPolicy")
 * .policyText(samplePolicyText)
 * .evaluationModes(EvaluationMode.DETECTIVE)
 * .build();
 * ```
 */
public open class EvaluationMode(
  cdkObject: software.amazon.awscdk.services.config.EvaluationMode,
) : CdkObject(cdkObject) {
  /**
   * The modes of evaluation for the rule.
   */
  public open fun modes(): List<String> = unwrap(this).getModes()

  public companion object {
    public val DETECTIVE: EvaluationMode =
        EvaluationMode.wrap(software.amazon.awscdk.services.config.EvaluationMode.DETECTIVE)

    public val DETECTIVE_AND_PROACTIVE: EvaluationMode =
        EvaluationMode.wrap(software.amazon.awscdk.services.config.EvaluationMode.DETECTIVE_AND_PROACTIVE)

    public val PROACTIVE: EvaluationMode =
        EvaluationMode.wrap(software.amazon.awscdk.services.config.EvaluationMode.PROACTIVE)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.EvaluationMode):
        EvaluationMode = EvaluationMode(cdkObject)

    internal fun unwrap(wrapped: EvaluationMode):
        software.amazon.awscdk.services.config.EvaluationMode = wrapped.cdkObject as
        software.amazon.awscdk.services.config.EvaluationMode
  }
}
