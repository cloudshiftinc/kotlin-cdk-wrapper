package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ReceiptRuleSet
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ses.ReceiptRuleSet,
) : Resource(cdkObject), IReceiptRuleSet {
    /**
     * Adds a new receipt rule in this rule set.
     *
     * The new rule is added after the last added rule unless `after` is specified.
     *
     * @param id
     * @param options
     */
    public override fun addRule(id: String): ReceiptRule =
        unwrap(this).addRule(id).let(ReceiptRule::wrap)

    /**
     * Adds a new receipt rule in this rule set.
     *
     * The new rule is added after the last added rule unless `after` is specified.
     *
     * @param id
     * @param options
     */
    public override fun addRule(id: String, options: ReceiptRuleOptions): ReceiptRule =
        unwrap(this).addRule(id, options.let(ReceiptRuleOptions::unwrap)).let(ReceiptRule::wrap)

    /**
     * Adds a new receipt rule in this rule set.
     *
     * The new rule is added after the last added rule unless `after` is specified.
     *
     * @param id
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9870cb7a366bfe448970b02b093ce946df61e1278e1b984e00908c5e1e1d5df")
    public override fun addRule(
        id: String,
        options: ReceiptRuleOptions.Builder.() -> Unit
    ): ReceiptRule = addRule(id, ReceiptRuleOptions(options))

    /** The receipt rule set name. */
    public override fun receiptRuleSetName(): String = unwrap(this).getReceiptRuleSetName()

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.ses.ReceiptRuleSet]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Whether to add a first rule to stop processing messages that have at least one spam
         * indicator.
         *
         * Default: false
         *
         * @param dropSpam Whether to add a first rule to stop processing messages that have at
         *   least one spam indicator.
         */
        public fun dropSpam(dropSpam: Boolean)

        /**
         * The name for the receipt rule set.
         *
         * Default: - A CloudFormation generated name.
         *
         * @param receiptRuleSetName The name for the receipt rule set.
         */
        public fun receiptRuleSetName(receiptRuleSetName: String)

        /**
         * The list of rules to add to this rule set.
         *
         * Rules are added in the same order as they appear in the list.
         *
         * Default: - No rules are added to the rule set.
         *
         * @param rules The list of rules to add to this rule set.
         */
        public fun rules(rules: List<ReceiptRuleOptions>)

        /**
         * The list of rules to add to this rule set.
         *
         * Rules are added in the same order as they appear in the list.
         *
         * Default: - No rules are added to the rule set.
         *
         * @param rules The list of rules to add to this rule set.
         */
        public fun rules(vararg rules: ReceiptRuleOptions)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ses.ReceiptRuleSet.Builder =
            software.amazon.awscdk.services.ses.ReceiptRuleSet.Builder.create(scope, id)

        /**
         * Whether to add a first rule to stop processing messages that have at least one spam
         * indicator.
         *
         * Default: false
         *
         * @param dropSpam Whether to add a first rule to stop processing messages that have at
         *   least one spam indicator.
         */
        override fun dropSpam(dropSpam: Boolean) {
            cdkBuilder.dropSpam(dropSpam)
        }

        /**
         * The name for the receipt rule set.
         *
         * Default: - A CloudFormation generated name.
         *
         * @param receiptRuleSetName The name for the receipt rule set.
         */
        override fun receiptRuleSetName(receiptRuleSetName: String) {
            cdkBuilder.receiptRuleSetName(receiptRuleSetName)
        }

        /**
         * The list of rules to add to this rule set.
         *
         * Rules are added in the same order as they appear in the list.
         *
         * Default: - No rules are added to the rule set.
         *
         * @param rules The list of rules to add to this rule set.
         */
        override fun rules(rules: List<ReceiptRuleOptions>) {
            cdkBuilder.rules(rules.map(ReceiptRuleOptions::unwrap))
        }

        /**
         * The list of rules to add to this rule set.
         *
         * Rules are added in the same order as they appear in the list.
         *
         * Default: - No rules are added to the rule set.
         *
         * @param rules The list of rules to add to this rule set.
         */
        override fun rules(vararg rules: ReceiptRuleOptions): Unit = rules(rules.toList())

        public fun build(): software.amazon.awscdk.services.ses.ReceiptRuleSet = cdkBuilder.build()
    }

    public companion object {
        public fun fromReceiptRuleSetName(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            receiptRuleSetName: String,
        ): IReceiptRuleSet =
            software.amazon.awscdk.services.ses.ReceiptRuleSet.fromReceiptRuleSetName(
                    scope.let(CloudshiftdevConstructsConstruct::unwrap),
                    id,
                    receiptRuleSetName
                )
                .let(IReceiptRuleSet::wrap)

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): ReceiptRuleSet {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return ReceiptRuleSet(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ses.ReceiptRuleSet
        ): ReceiptRuleSet = ReceiptRuleSet(cdkObject)

        internal fun unwrap(
            wrapped: ReceiptRuleSet
        ): software.amazon.awscdk.services.ses.ReceiptRuleSet = wrapped.cdkObject
    }
}
