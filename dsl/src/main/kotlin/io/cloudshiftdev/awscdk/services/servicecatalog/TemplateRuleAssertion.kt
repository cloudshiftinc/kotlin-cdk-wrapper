package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.ICfnRuleConditionExpression
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface TemplateRuleAssertion {
    /** The assertion condition. */
    public fun assertValue(): ICfnRuleConditionExpression

    /**
     * The description for the asssertion.
     *
     * Default: - no description provided for the assertion.
     */
    public fun description(): String? = unwrap(this).getDescription()

    /** A builder for [TemplateRuleAssertion] */
    @CdkDslMarker
    public interface Builder {
        /** @param assertValue The assertion condition. */
        public fun assertValue(assertValue: ICfnRuleConditionExpression)

        /** @param description The description for the asssertion. */
        public fun description(description: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.servicecatalog.TemplateRuleAssertion.Builder =
            software.amazon.awscdk.services.servicecatalog.TemplateRuleAssertion.builder()

        /** @param assertValue The assertion condition. */
        override fun assertValue(assertValue: ICfnRuleConditionExpression) {
            cdkBuilder.assertValue(assertValue.let(ICfnRuleConditionExpression::unwrap))
        }

        /** @param description The description for the asssertion. */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        public fun build(): software.amazon.awscdk.services.servicecatalog.TemplateRuleAssertion =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.servicecatalog.TemplateRuleAssertion,
    ) : TemplateRuleAssertion {
        /** The assertion condition. */
        override fun assertValue(): ICfnRuleConditionExpression =
            unwrap(this).getAssertValue().let(ICfnRuleConditionExpression::wrap)

        /**
         * The description for the asssertion.
         *
         * Default: - no description provided for the assertion.
         */
        override fun description(): String? = unwrap(this).getDescription()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): TemplateRuleAssertion {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.servicecatalog.TemplateRuleAssertion
        ): TemplateRuleAssertion = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: TemplateRuleAssertion
        ): software.amazon.awscdk.services.servicecatalog.TemplateRuleAssertion =
            (wrapped as Wrapper).cdkObject
    }
}
