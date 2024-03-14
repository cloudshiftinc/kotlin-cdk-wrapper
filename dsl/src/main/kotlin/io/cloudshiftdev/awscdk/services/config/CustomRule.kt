package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CustomRule
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.config.CustomRule,
) : Resource(cdkObject), IRule {
    /** The arn of the rule. */
    public open fun configRuleArn(): String = unwrap(this).getConfigRuleArn()

    /** The compliance status of the rule. */
    public open fun configRuleComplianceType(): String = unwrap(this).getConfigRuleComplianceType()

    /** The id of the rule. */
    public open fun configRuleId(): String = unwrap(this).getConfigRuleId()

    /** The name of the rule. */
    public override fun configRuleName(): String = unwrap(this).getConfigRuleName()

    /**
     * Defines an EventBridge event rule which triggers for rule compliance events.
     *
     * @param id
     * @param options
     */
    public override fun onComplianceChange(id: String): Rule =
        unwrap(this).onComplianceChange(id).let(Rule::wrap)

    /**
     * Defines an EventBridge event rule which triggers for rule compliance events.
     *
     * @param id
     * @param options
     */
    public override fun onComplianceChange(id: String, options: OnEventOptions): Rule =
        unwrap(this).onComplianceChange(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

    /**
     * Defines an EventBridge event rule which triggers for rule compliance events.
     *
     * @param id
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b98c84ce198054f102b00e655b85da2a1ae47a5638faf86d850c16a3235acfa2")
    public override fun onComplianceChange(
        id: String,
        options: OnEventOptions.Builder.() -> Unit
    ): Rule = onComplianceChange(id, OnEventOptions(options))

    /**
     * Defines an EventBridge event rule which triggers for rule events.
     *
     * Use `rule.addEventPattern(pattern)` to specify a filter.
     *
     * @param id
     * @param options
     */
    public override fun onEvent(id: String): Rule = unwrap(this).onEvent(id).let(Rule::wrap)

    /**
     * Defines an EventBridge event rule which triggers for rule events.
     *
     * Use `rule.addEventPattern(pattern)` to specify a filter.
     *
     * @param id
     * @param options
     */
    public override fun onEvent(id: String, options: OnEventOptions): Rule =
        unwrap(this).onEvent(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

    /**
     * Defines an EventBridge event rule which triggers for rule events.
     *
     * Use `rule.addEventPattern(pattern)` to specify a filter.
     *
     * @param id
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
    public override fun onEvent(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
        onEvent(id, OnEventOptions(options))

    /**
     * Defines an EventBridge event rule which triggers for rule re-evaluation status events.
     *
     * @param id
     * @param options
     */
    public override fun onReEvaluationStatus(id: String): Rule =
        unwrap(this).onReEvaluationStatus(id).let(Rule::wrap)

    /**
     * Defines an EventBridge event rule which triggers for rule re-evaluation status events.
     *
     * @param id
     * @param options
     */
    public override fun onReEvaluationStatus(id: String, options: OnEventOptions): Rule =
        unwrap(this).onReEvaluationStatus(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

    /**
     * Defines an EventBridge event rule which triggers for rule re-evaluation status events.
     *
     * @param id
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f5ea19b211eab8ba672d4a05459c322cc41db04f03b5d429124296804b9cc8c7")
    public override fun onReEvaluationStatus(
        id: String,
        options: OnEventOptions.Builder.() -> Unit
    ): Rule = onReEvaluationStatus(id, OnEventOptions(options))

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.config.CustomRule]. */
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
         * Whether to run the rule on configuration changes.
         *
         * Default: false
         *
         * @param configurationChanges Whether to run the rule on configuration changes.
         */
        public fun configurationChanges(configurationChanges: Boolean)

        /**
         * A description about this AWS Config rule.
         *
         * Default: - No description
         *
         * @param description A description about this AWS Config rule.
         */
        public fun description(description: String)

        /**
         * Input parameter values that are passed to the AWS Config rule.
         *
         * Default: - No input parameters
         *
         * @param inputParameters Input parameter values that are passed to the AWS Config rule.
         */
        public fun inputParameters(inputParameters: Map<String, Any>)

        /**
         * The Lambda function to run.
         *
         * @param lambdaFunction The Lambda function to run.
         */
        public fun lambdaFunction(lambdaFunction: IFunction)

        /**
         * The maximum frequency at which the AWS Config rule runs evaluations.
         *
         * Default: MaximumExecutionFrequency.TWENTY_FOUR_HOURS
         *
         * @param maximumExecutionFrequency The maximum frequency at which the AWS Config rule runs
         *   evaluations.
         */
        public fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency)

        /**
         * Whether to run the rule on a fixed frequency.
         *
         * Default: false
         *
         * @param periodic Whether to run the rule on a fixed frequency.
         */
        public fun periodic(periodic: Boolean)

        /**
         * Defines which resources trigger an evaluation for an AWS Config rule.
         *
         * Default: - evaluations for the rule are triggered when any resource in the recording
         * group changes.
         *
         * @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule.
         */
        public fun ruleScope(ruleScope: RuleScope)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.config.CustomRule.Builder =
            software.amazon.awscdk.services.config.CustomRule.Builder.create(scope, id)

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
         * Whether to run the rule on configuration changes.
         *
         * Default: false
         *
         * @param configurationChanges Whether to run the rule on configuration changes.
         */
        override fun configurationChanges(configurationChanges: Boolean) {
            cdkBuilder.configurationChanges(configurationChanges)
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
         * Input parameter values that are passed to the AWS Config rule.
         *
         * Default: - No input parameters
         *
         * @param inputParameters Input parameter values that are passed to the AWS Config rule.
         */
        override fun inputParameters(inputParameters: Map<String, Any>) {
            cdkBuilder.inputParameters(inputParameters)
        }

        /**
         * The Lambda function to run.
         *
         * @param lambdaFunction The Lambda function to run.
         */
        override fun lambdaFunction(lambdaFunction: IFunction) {
            cdkBuilder.lambdaFunction(lambdaFunction.let(IFunction::unwrap))
        }

        /**
         * The maximum frequency at which the AWS Config rule runs evaluations.
         *
         * Default: MaximumExecutionFrequency.TWENTY_FOUR_HOURS
         *
         * @param maximumExecutionFrequency The maximum frequency at which the AWS Config rule runs
         *   evaluations.
         */
        override fun maximumExecutionFrequency(
            maximumExecutionFrequency: MaximumExecutionFrequency
        ) {
            cdkBuilder.maximumExecutionFrequency(
                maximumExecutionFrequency.let(MaximumExecutionFrequency::unwrap)
            )
        }

        /**
         * Whether to run the rule on a fixed frequency.
         *
         * Default: false
         *
         * @param periodic Whether to run the rule on a fixed frequency.
         */
        override fun periodic(periodic: Boolean) {
            cdkBuilder.periodic(periodic)
        }

        /**
         * Defines which resources trigger an evaluation for an AWS Config rule.
         *
         * Default: - evaluations for the rule are triggered when any resource in the recording
         * group changes.
         *
         * @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule.
         */
        override fun ruleScope(ruleScope: RuleScope) {
            cdkBuilder.ruleScope(ruleScope.let(RuleScope::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.config.CustomRule = cdkBuilder.build()
    }

    public companion object {
        public fun fromConfigRuleName(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            configRuleName: String,
        ): IRule =
            software.amazon.awscdk.services.config.CustomRule.fromConfigRuleName(
                    scope.let(CloudshiftdevConstructsConstruct::unwrap),
                    id,
                    configRuleName
                )
                .let(IRule::wrap)

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CustomRule {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CustomRule(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.config.CustomRule
        ): CustomRule = CustomRule(cdkObject)

        internal fun unwrap(
            wrapped: CustomRule
        ): software.amazon.awscdk.services.config.CustomRule = wrapped.cdkObject
    }
}
