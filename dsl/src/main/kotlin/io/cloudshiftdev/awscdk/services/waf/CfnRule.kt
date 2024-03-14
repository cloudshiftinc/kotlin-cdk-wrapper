package io.cloudshiftdev.awscdk.services.waf

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRule
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.waf.CfnRule,
) : CfnResource(cdkObject), IInspectable {
    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The name of the metrics for this `Rule` . */
    public open fun metricName(): String = unwrap(this).getMetricName()

    /** The name of the metrics for this `Rule` . */
    public open fun metricName(`value`: String) {
        unwrap(this).setMetricName(`value`)
    }

    /** The friendly name or description for the `Rule` . */
    public open fun name(): String = unwrap(this).getName()

    /** The friendly name or description for the `Rule` . */
    public open fun name(`value`: String) {
        unwrap(this).setName(`value`)
    }

    /**
     * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` ,
     * or `SqlInjectionMatchSet` object that you want to include in a `Rule` .
     */
    public open fun predicates(): Any? = unwrap(this).getPredicates()

    /**
     * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` ,
     * or `SqlInjectionMatchSet` object that you want to include in a `Rule` .
     */
    public open fun predicates(`value`: IResolvable) {
        unwrap(this).setPredicates(`value`.let(IResolvable::unwrap))
    }

    /**
     * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` ,
     * or `SqlInjectionMatchSet` object that you want to include in a `Rule` .
     */
    public open fun predicates(__idx_ac66f0: List<Any>) {
        unwrap(this).setPredicates(__idx_ac66f0)
    }

    /**
     * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` ,
     * or `SqlInjectionMatchSet` object that you want to include in a `Rule` .
     */
    public open fun predicates(vararg __idx_ac66f0: Any): Unit = predicates(__idx_ac66f0.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.waf.CfnRule]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The name of the metrics for this `Rule` .
         *
         * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length
         * 128 and minimum length one. It can't contain whitespace or metric names reserved for AWS
         * WAF , including "All" and "Default_Action." You can't change `MetricName` after you
         * create the `Rule` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-metricname)
         *
         * @param metricName The name of the metrics for this `Rule` .
         */
        public fun metricName(metricName: String)

        /**
         * The friendly name or description for the `Rule` .
         *
         * You can't change the name of a `Rule` after you create it.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-name)
         *
         * @param name The friendly name or description for the `Rule` .
         */
        public fun name(name: String)

        /**
         * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` ,
         * `IPSet` , or `SqlInjectionMatchSet` object that you want to include in a `Rule` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-predicates)
         *
         * @param predicates The `Predicates` object contains one `Predicate` element for each
         *   `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet` object that you want to include in
         *   a `Rule` .
         */
        public fun predicates(predicates: IResolvable)

        /**
         * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` ,
         * `IPSet` , or `SqlInjectionMatchSet` object that you want to include in a `Rule` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-predicates)
         *
         * @param predicates The `Predicates` object contains one `Predicate` element for each
         *   `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet` object that you want to include in
         *   a `Rule` .
         */
        public fun predicates(predicates: List<Any>)

        /**
         * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` ,
         * `IPSet` , or `SqlInjectionMatchSet` object that you want to include in a `Rule` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-predicates)
         *
         * @param predicates The `Predicates` object contains one `Predicate` element for each
         *   `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet` object that you want to include in
         *   a `Rule` .
         */
        public fun predicates(vararg predicates: Any)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.waf.CfnRule.Builder =
            software.amazon.awscdk.services.waf.CfnRule.Builder.create(scope, id)

        /**
         * The name of the metrics for this `Rule` .
         *
         * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length
         * 128 and minimum length one. It can't contain whitespace or metric names reserved for AWS
         * WAF , including "All" and "Default_Action." You can't change `MetricName` after you
         * create the `Rule` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-metricname)
         *
         * @param metricName The name of the metrics for this `Rule` .
         */
        override fun metricName(metricName: String) {
            cdkBuilder.metricName(metricName)
        }

        /**
         * The friendly name or description for the `Rule` .
         *
         * You can't change the name of a `Rule` after you create it.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-name)
         *
         * @param name The friendly name or description for the `Rule` .
         */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        /**
         * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` ,
         * `IPSet` , or `SqlInjectionMatchSet` object that you want to include in a `Rule` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-predicates)
         *
         * @param predicates The `Predicates` object contains one `Predicate` element for each
         *   `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet` object that you want to include in
         *   a `Rule` .
         */
        override fun predicates(predicates: IResolvable) {
            cdkBuilder.predicates(predicates.let(IResolvable::unwrap))
        }

        /**
         * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` ,
         * `IPSet` , or `SqlInjectionMatchSet` object that you want to include in a `Rule` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-predicates)
         *
         * @param predicates The `Predicates` object contains one `Predicate` element for each
         *   `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet` object that you want to include in
         *   a `Rule` .
         */
        override fun predicates(predicates: List<Any>) {
            cdkBuilder.predicates(predicates)
        }

        /**
         * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` ,
         * `IPSet` , or `SqlInjectionMatchSet` object that you want to include in a `Rule` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-predicates)
         *
         * @param predicates The `Predicates` object contains one `Predicate` element for each
         *   `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet` object that you want to include in
         *   a `Rule` .
         */
        override fun predicates(vararg predicates: Any): Unit = predicates(predicates.toList())

        public fun build(): software.amazon.awscdk.services.waf.CfnRule = cdkBuilder.build()
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

        internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnRule): CfnRule =
            CfnRule(cdkObject)

        internal fun unwrap(wrapped: CfnRule): software.amazon.awscdk.services.waf.CfnRule =
            wrapped.cdkObject
    }

    public interface PredicateProperty {
        /**
         * A unique identifier for a predicate in a `Rule` , such as `ByteMatchSetId` or `IPSetId` .
         *
         * The ID is returned by the corresponding `Create` or `List` command.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-rule-predicate.html#cfn-waf-rule-predicate-dataid)
         */
        public fun dataId(): String

        /**
         * Set `Negated` to `False` if you want AWS WAF to allow, block, or count requests based on
         * the settings in the specified `ByteMatchSet` , `IPSet` , `SqlInjectionMatchSet` ,
         * `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` .
         *
         * For example, if an `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow or
         * block requests based on that IP address.
         *
         * Set `Negated` to `True` if you want AWS WAF to allow or block a request based on the
         * negation of the settings in the `ByteMatchSet` , `IPSet` , `SqlInjectionMatchSet` ,
         * `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` . For example,
         * if an `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow, block, or count
         * requests based on all IP addresses *except* `192.0.2.44` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-rule-predicate.html#cfn-waf-rule-predicate-negated)
         */
        public fun negated(): Any

        /**
         * The type of predicate in a `Rule` , such as `ByteMatch` or `IPSet` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-rule-predicate.html#cfn-waf-rule-predicate-type)
         */
        public fun type(): String

        /** A builder for [PredicateProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param dataId A unique identifier for a predicate in a `Rule` , such as
             *   `ByteMatchSetId` or `IPSetId` . The ID is returned by the corresponding `Create` or
             *   `List` command.
             */
            public fun dataId(dataId: String)

            /**
             * @param negated Set `Negated` to `False` if you want AWS WAF to allow, block, or count
             *   requests based on the settings in the specified `ByteMatchSet` , `IPSet` ,
             *   `SqlInjectionMatchSet` , `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or
             *   `SizeConstraintSet` . For example, if an `IPSet` includes the IP address
             *   `192.0.2.44` , AWS WAF will allow or block requests based on that IP address.
             *
             * Set `Negated` to `True` if you want AWS WAF to allow or block a request based on the
             * negation of the settings in the `ByteMatchSet` , `IPSet` , `SqlInjectionMatchSet` ,
             * `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` . For
             * example, if an `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow,
             * block, or count requests based on all IP addresses *except* `192.0.2.44` .
             */
            public fun negated(negated: Boolean)

            /**
             * @param negated Set `Negated` to `False` if you want AWS WAF to allow, block, or count
             *   requests based on the settings in the specified `ByteMatchSet` , `IPSet` ,
             *   `SqlInjectionMatchSet` , `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or
             *   `SizeConstraintSet` . For example, if an `IPSet` includes the IP address
             *   `192.0.2.44` , AWS WAF will allow or block requests based on that IP address.
             *
             * Set `Negated` to `True` if you want AWS WAF to allow or block a request based on the
             * negation of the settings in the `ByteMatchSet` , `IPSet` , `SqlInjectionMatchSet` ,
             * `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` . For
             * example, if an `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow,
             * block, or count requests based on all IP addresses *except* `192.0.2.44` .
             */
            public fun negated(negated: IResolvable)

            /** @param type The type of predicate in a `Rule` , such as `ByteMatch` or `IPSet` . */
            public fun type(type: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.waf.CfnRule.PredicateProperty.Builder =
                software.amazon.awscdk.services.waf.CfnRule.PredicateProperty.builder()

            /**
             * @param dataId A unique identifier for a predicate in a `Rule` , such as
             *   `ByteMatchSetId` or `IPSetId` . The ID is returned by the corresponding `Create` or
             *   `List` command.
             */
            override fun dataId(dataId: String) {
                cdkBuilder.dataId(dataId)
            }

            /**
             * @param negated Set `Negated` to `False` if you want AWS WAF to allow, block, or count
             *   requests based on the settings in the specified `ByteMatchSet` , `IPSet` ,
             *   `SqlInjectionMatchSet` , `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or
             *   `SizeConstraintSet` . For example, if an `IPSet` includes the IP address
             *   `192.0.2.44` , AWS WAF will allow or block requests based on that IP address.
             *
             * Set `Negated` to `True` if you want AWS WAF to allow or block a request based on the
             * negation of the settings in the `ByteMatchSet` , `IPSet` , `SqlInjectionMatchSet` ,
             * `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` . For
             * example, if an `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow,
             * block, or count requests based on all IP addresses *except* `192.0.2.44` .
             */
            override fun negated(negated: Boolean) {
                cdkBuilder.negated(negated)
            }

            /**
             * @param negated Set `Negated` to `False` if you want AWS WAF to allow, block, or count
             *   requests based on the settings in the specified `ByteMatchSet` , `IPSet` ,
             *   `SqlInjectionMatchSet` , `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or
             *   `SizeConstraintSet` . For example, if an `IPSet` includes the IP address
             *   `192.0.2.44` , AWS WAF will allow or block requests based on that IP address.
             *
             * Set `Negated` to `True` if you want AWS WAF to allow or block a request based on the
             * negation of the settings in the `ByteMatchSet` , `IPSet` , `SqlInjectionMatchSet` ,
             * `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` . For
             * example, if an `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow,
             * block, or count requests based on all IP addresses *except* `192.0.2.44` .
             */
            override fun negated(negated: IResolvable) {
                cdkBuilder.negated(negated.let(IResolvable::unwrap))
            }

            /** @param type The type of predicate in a `Rule` , such as `ByteMatch` or `IPSet` . */
            override fun type(type: String) {
                cdkBuilder.type(type)
            }

            public fun build(): software.amazon.awscdk.services.waf.CfnRule.PredicateProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject: software.amazon.awscdk.services.waf.CfnRule.PredicateProperty,
        ) : PredicateProperty {
            /**
             * A unique identifier for a predicate in a `Rule` , such as `ByteMatchSetId` or
             * `IPSetId` .
             *
             * The ID is returned by the corresponding `Create` or `List` command.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-rule-predicate.html#cfn-waf-rule-predicate-dataid)
             */
            override fun dataId(): String = unwrap(this).getDataId()

            /**
             * Set `Negated` to `False` if you want AWS WAF to allow, block, or count requests based
             * on the settings in the specified `ByteMatchSet` , `IPSet` , `SqlInjectionMatchSet` ,
             * `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` .
             *
             * For example, if an `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow
             * or block requests based on that IP address.
             *
             * Set `Negated` to `True` if you want AWS WAF to allow or block a request based on the
             * negation of the settings in the `ByteMatchSet` , `IPSet` , `SqlInjectionMatchSet` ,
             * `XssMatchSet` , `RegexMatchSet` , `GeoMatchSet` , or `SizeConstraintSet` . For
             * example, if an `IPSet` includes the IP address `192.0.2.44` , AWS WAF will allow,
             * block, or count requests based on all IP addresses *except* `192.0.2.44` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-rule-predicate.html#cfn-waf-rule-predicate-negated)
             */
            override fun negated(): Any = unwrap(this).getNegated()

            /**
             * The type of predicate in a `Rule` , such as `ByteMatch` or `IPSet` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-rule-predicate.html#cfn-waf-rule-predicate-type)
             */
            override fun type(): String = unwrap(this).getType()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): PredicateProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.waf.CfnRule.PredicateProperty
            ): PredicateProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: PredicateProperty
            ): software.amazon.awscdk.services.waf.CfnRule.PredicateProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
