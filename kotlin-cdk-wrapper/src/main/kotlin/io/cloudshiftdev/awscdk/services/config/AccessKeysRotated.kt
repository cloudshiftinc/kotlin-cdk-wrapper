@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Checks whether the active access keys are rotated within the number of days specified in
 * `maxAge`.
 *
 * Example:
 *
 * ```
 * // compliant if access keys have been rotated within the last 90 days
 * // compliant if access keys have been rotated within the last 90 days
 * new AccessKeysRotated(this, "AccessKeyRotated");
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/config/latest/developerguide/access-keys-rotated.html)
 */
public open class AccessKeysRotated(
  cdkObject: software.amazon.awscdk.services.config.AccessKeysRotated,
) : ManagedRule(cdkObject) {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.config.AccessKeysRotated(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AccessKeysRotatedProps,
  ) :
      this(software.amazon.awscdk.services.config.AccessKeysRotated(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(AccessKeysRotatedProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AccessKeysRotatedProps.Builder.() -> Unit,
  ) : this(scope, id, AccessKeysRotatedProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.config.AccessKeysRotated].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A name for the AWS Config rule.
     *
     * Default: - CloudFormation generated name
     *
     * @param configRuleName A name for the AWS Config rule. 
     */
    public fun configRuleName(configRuleName: String)

    /**
     * A description about this AWS Config rule.
     *
     * Default: - No description
     *
     * @param description A description about this AWS Config rule. 
     */
    public fun description(description: String)

    /**
     * The modes the AWS Config rule can be evaluated in.
     *
     * The valid values are distinct objects.
     *
     * Default: - Detective evaluation mode only
     *
     * @param evaluationModes The modes the AWS Config rule can be evaluated in. 
     */
    public fun evaluationModes(evaluationModes: EvaluationMode)

    /**
     * Input parameter values that are passed to the AWS Config rule.
     *
     * Default: - No input parameters
     *
     * @param inputParameters Input parameter values that are passed to the AWS Config rule. 
     */
    public fun inputParameters(inputParameters: Map<String, Any>)

    /**
     * The maximum number of days within which the access keys must be rotated.
     *
     * Default: Duration.days(90)
     *
     * @param maxAge The maximum number of days within which the access keys must be rotated. 
     */
    public fun maxAge(maxAge: Duration)

    /**
     * The maximum frequency at which the AWS Config rule runs evaluations.
     *
     * Default: MaximumExecutionFrequency.TWENTY_FOUR_HOURS
     *
     * @param maximumExecutionFrequency The maximum frequency at which the AWS Config rule runs
     * evaluations. 
     */
    public fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency)

    /**
     * Defines which resources trigger an evaluation for an AWS Config rule.
     *
     * Default: - evaluations for the rule are triggered when any resource in the recording group
     * changes.
     *
     * @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule. 
     */
    public fun ruleScope(ruleScope: RuleScope)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.AccessKeysRotated.Builder =
        software.amazon.awscdk.services.config.AccessKeysRotated.Builder.create(scope, id)

    /**
     * A name for the AWS Config rule.
     *
     * Default: - CloudFormation generated name
     *
     * @param configRuleName A name for the AWS Config rule. 
     */
    override fun configRuleName(configRuleName: String) {
      cdkBuilder.configRuleName(configRuleName)
    }

    /**
     * A description about this AWS Config rule.
     *
     * Default: - No description
     *
     * @param description A description about this AWS Config rule. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The modes the AWS Config rule can be evaluated in.
     *
     * The valid values are distinct objects.
     *
     * Default: - Detective evaluation mode only
     *
     * @param evaluationModes The modes the AWS Config rule can be evaluated in. 
     */
    override fun evaluationModes(evaluationModes: EvaluationMode) {
      cdkBuilder.evaluationModes(evaluationModes.let(EvaluationMode.Companion::unwrap))
    }

    /**
     * Input parameter values that are passed to the AWS Config rule.
     *
     * Default: - No input parameters
     *
     * @param inputParameters Input parameter values that are passed to the AWS Config rule. 
     */
    override fun inputParameters(inputParameters: Map<String, Any>) {
      cdkBuilder.inputParameters(inputParameters.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * The maximum number of days within which the access keys must be rotated.
     *
     * Default: Duration.days(90)
     *
     * @param maxAge The maximum number of days within which the access keys must be rotated. 
     */
    override fun maxAge(maxAge: Duration) {
      cdkBuilder.maxAge(maxAge.let(Duration.Companion::unwrap))
    }

    /**
     * The maximum frequency at which the AWS Config rule runs evaluations.
     *
     * Default: MaximumExecutionFrequency.TWENTY_FOUR_HOURS
     *
     * @param maximumExecutionFrequency The maximum frequency at which the AWS Config rule runs
     * evaluations. 
     */
    override fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency) {
      cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency.let(MaximumExecutionFrequency.Companion::unwrap))
    }

    /**
     * Defines which resources trigger an evaluation for an AWS Config rule.
     *
     * Default: - evaluations for the rule are triggered when any resource in the recording group
     * changes.
     *
     * @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule. 
     */
    override fun ruleScope(ruleScope: RuleScope) {
      cdkBuilder.ruleScope(ruleScope.let(RuleScope.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.config.AccessKeysRotated =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AccessKeysRotated {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AccessKeysRotated(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.AccessKeysRotated):
        AccessKeysRotated = AccessKeysRotated(cdkObject)

    internal fun unwrap(wrapped: AccessKeysRotated):
        software.amazon.awscdk.services.config.AccessKeysRotated = wrapped.cdkObject as
        software.amazon.awscdk.services.config.AccessKeysRotated
  }
}
