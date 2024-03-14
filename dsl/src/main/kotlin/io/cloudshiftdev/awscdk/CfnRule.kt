package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRule
internal constructor(
    private val cdkObject: software.amazon.awscdk.CfnRule,
) : CfnRefElement(cdkObject) {
    /**
     * Adds an assertion to the rule.
     *
     * @param condition The expression to evaluation.
     * @param description The description of the assertion.
     */
    public open fun addAssertion(condition: ICfnConditionExpression, description: String) {
        unwrap(this).addAssertion(condition.let(ICfnConditionExpression::unwrap), description)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.CfnRule]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Assertions which define the rule.
         *
         * Default: - No assertions for the rule.
         *
         * @param assertions Assertions which define the rule.
         */
        public fun assertions(assertions: List<CfnRuleAssertion>)

        /**
         * Assertions which define the rule.
         *
         * Default: - No assertions for the rule.
         *
         * @param assertions Assertions which define the rule.
         */
        public fun assertions(vararg assertions: CfnRuleAssertion)

        /**
         * If the rule condition evaluates to false, the rule doesn't take effect.
         *
         * If the function in the rule condition evaluates to true, expressions in each assert are
         * evaluated and applied.
         *
         * Default: - Rule's assertions will always take effect.
         *
         * @param ruleCondition If the rule condition evaluates to false, the rule doesn't take
         *   effect.
         */
        public fun ruleCondition(ruleCondition: ICfnConditionExpression)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.CfnRule.Builder =
            software.amazon.awscdk.CfnRule.Builder.create(scope, id)

        /**
         * Assertions which define the rule.
         *
         * Default: - No assertions for the rule.
         *
         * @param assertions Assertions which define the rule.
         */
        override fun assertions(assertions: List<CfnRuleAssertion>) {
            cdkBuilder.assertions(assertions.map(CfnRuleAssertion::unwrap))
        }

        /**
         * Assertions which define the rule.
         *
         * Default: - No assertions for the rule.
         *
         * @param assertions Assertions which define the rule.
         */
        override fun assertions(vararg assertions: CfnRuleAssertion): Unit =
            assertions(assertions.toList())

        /**
         * If the rule condition evaluates to false, the rule doesn't take effect.
         *
         * If the function in the rule condition evaluates to true, expressions in each assert are
         * evaluated and applied.
         *
         * Default: - Rule's assertions will always take effect.
         *
         * @param ruleCondition If the rule condition evaluates to false, the rule doesn't take
         *   effect.
         */
        override fun ruleCondition(ruleCondition: ICfnConditionExpression) {
            cdkBuilder.ruleCondition(ruleCondition.let(ICfnConditionExpression::unwrap))
        }

        public fun build(): software.amazon.awscdk.CfnRule = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnRule {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnRule(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.CfnRule): CfnRule = CfnRule(cdkObject)

        internal fun unwrap(wrapped: CfnRule): software.amazon.awscdk.CfnRule = wrapped.cdkObject
    }
}
