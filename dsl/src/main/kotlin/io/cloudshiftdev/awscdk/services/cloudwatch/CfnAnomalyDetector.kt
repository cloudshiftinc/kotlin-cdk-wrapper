package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAnomalyDetector
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector,
) : CfnResource(cdkObject), IInspectable {
    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /**
     * Specifies details about how the anomaly detection model is to be trained, including time
     * ranges to exclude when training and updating the model.
     */
    public open fun configuration(): Any? = unwrap(this).getConfiguration()

    /**
     * Specifies details about how the anomaly detection model is to be trained, including time
     * ranges to exclude when training and updating the model.
     */
    public open fun configuration(`value`: IResolvable) {
        unwrap(this).setConfiguration(`value`.let(IResolvable::unwrap))
    }

    /**
     * Specifies details about how the anomaly detection model is to be trained, including time
     * ranges to exclude when training and updating the model.
     */
    public open fun configuration(`value`: ConfigurationProperty) {
        unwrap(this).setConfiguration(`value`.let(ConfigurationProperty::unwrap))
    }

    /**
     * Specifies details about how the anomaly detection model is to be trained, including time
     * ranges to exclude when training and updating the model.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ecde87249982495323c64a43b0ce11c5c49b2874eef0ff27f36796b9571aa65")
    public open fun configuration(`value`: ConfigurationProperty.Builder.() -> Unit): Unit =
        configuration(ConfigurationProperty(`value`))

    /** The dimensions of the metric associated with the anomaly detection band. */
    public open fun dimensions(): Any? = unwrap(this).getDimensions()

    /** The dimensions of the metric associated with the anomaly detection band. */
    public open fun dimensions(`value`: IResolvable) {
        unwrap(this).setDimensions(`value`.let(IResolvable::unwrap))
    }

    /** The dimensions of the metric associated with the anomaly detection band. */
    public open fun dimensions(__idx_ac66f0: List<Any>) {
        unwrap(this).setDimensions(__idx_ac66f0)
    }

    /** The dimensions of the metric associated with the anomaly detection band. */
    public open fun dimensions(vararg __idx_ac66f0: Any): Unit = dimensions(__idx_ac66f0.toList())

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The CloudWatch metric math expression for this anomaly detector. */
    public open fun metricMathAnomalyDetector(): Any? = unwrap(this).getMetricMathAnomalyDetector()

    /** The CloudWatch metric math expression for this anomaly detector. */
    public open fun metricMathAnomalyDetector(`value`: IResolvable) {
        unwrap(this).setMetricMathAnomalyDetector(`value`.let(IResolvable::unwrap))
    }

    /** The CloudWatch metric math expression for this anomaly detector. */
    public open fun metricMathAnomalyDetector(`value`: MetricMathAnomalyDetectorProperty) {
        unwrap(this)
            .setMetricMathAnomalyDetector(`value`.let(MetricMathAnomalyDetectorProperty::unwrap))
    }

    /** The CloudWatch metric math expression for this anomaly detector. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd56d86585f6556e025836972f70b3ca90dc63c4a785f604483a2a80ec8c8ebd")
    public open fun metricMathAnomalyDetector(
        `value`: MetricMathAnomalyDetectorProperty.Builder.() -> Unit
    ): Unit = metricMathAnomalyDetector(MetricMathAnomalyDetectorProperty(`value`))

    /** The name of the metric associated with the anomaly detection band. */
    public open fun metricName(): String? = unwrap(this).getMetricName()

    /** The name of the metric associated with the anomaly detection band. */
    public open fun metricName(`value`: String) {
        unwrap(this).setMetricName(`value`)
    }

    /** The namespace of the metric associated with the anomaly detection band. */
    public open fun namespace(): String? = unwrap(this).getNamespace()

    /** The namespace of the metric associated with the anomaly detection band. */
    public open fun namespace(`value`: String) {
        unwrap(this).setNamespace(`value`)
    }

    /** The CloudWatch metric and statistic for this anomaly detector. */
    public open fun singleMetricAnomalyDetector(): Any? =
        unwrap(this).getSingleMetricAnomalyDetector()

    /** The CloudWatch metric and statistic for this anomaly detector. */
    public open fun singleMetricAnomalyDetector(`value`: IResolvable) {
        unwrap(this).setSingleMetricAnomalyDetector(`value`.let(IResolvable::unwrap))
    }

    /** The CloudWatch metric and statistic for this anomaly detector. */
    public open fun singleMetricAnomalyDetector(`value`: SingleMetricAnomalyDetectorProperty) {
        unwrap(this)
            .setSingleMetricAnomalyDetector(
                `value`.let(SingleMetricAnomalyDetectorProperty::unwrap)
            )
    }

    /** The CloudWatch metric and statistic for this anomaly detector. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db6e36234d42aa5c13397d6e8ae73f4a53df5c236a0e211b002eb47af4a40036")
    public open fun singleMetricAnomalyDetector(
        `value`: SingleMetricAnomalyDetectorProperty.Builder.() -> Unit
    ): Unit = singleMetricAnomalyDetector(SingleMetricAnomalyDetectorProperty(`value`))

    /** The statistic of the metric associated with the anomaly detection band. */
    public open fun stat(): String? = unwrap(this).getStat()

    /** The statistic of the metric associated with the anomaly detection band. */
    public open fun stat(`value`: String) {
        unwrap(this).setStat(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.cloudwatch.CfnAnomalyDetector]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Specifies details about how the anomaly detection model is to be trained, including time
         * ranges to exclude when training and updating the model.
         *
         * The configuration can also include the time zone to use for the metric.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-configuration)
         *
         * @param configuration Specifies details about how the anomaly detection model is to be
         *   trained, including time ranges to exclude when training and updating the model.
         */
        public fun configuration(configuration: IResolvable)

        /**
         * Specifies details about how the anomaly detection model is to be trained, including time
         * ranges to exclude when training and updating the model.
         *
         * The configuration can also include the time zone to use for the metric.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-configuration)
         *
         * @param configuration Specifies details about how the anomaly detection model is to be
         *   trained, including time ranges to exclude when training and updating the model.
         */
        public fun configuration(configuration: ConfigurationProperty)

        /**
         * Specifies details about how the anomaly detection model is to be trained, including time
         * ranges to exclude when training and updating the model.
         *
         * The configuration can also include the time zone to use for the metric.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-configuration)
         *
         * @param configuration Specifies details about how the anomaly detection model is to be
         *   trained, including time ranges to exclude when training and updating the model.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("797cce49dc543cfe5e3f9e833b9c2ad1c909f309227adc72f42b6e6222575c75")
        public fun configuration(configuration: ConfigurationProperty.Builder.() -> Unit)

        /**
         * The dimensions of the metric associated with the anomaly detection band.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-dimensions)
         *
         * @param dimensions The dimensions of the metric associated with the anomaly detection
         *   band.
         */
        public fun dimensions(dimensions: IResolvable)

        /**
         * The dimensions of the metric associated with the anomaly detection band.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-dimensions)
         *
         * @param dimensions The dimensions of the metric associated with the anomaly detection
         *   band.
         */
        public fun dimensions(dimensions: List<Any>)

        /**
         * The dimensions of the metric associated with the anomaly detection band.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-dimensions)
         *
         * @param dimensions The dimensions of the metric associated with the anomaly detection
         *   band.
         */
        public fun dimensions(vararg dimensions: Any)

        /**
         * The CloudWatch metric math expression for this anomaly detector.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-metricmathanomalydetector)
         *
         * @param metricMathAnomalyDetector The CloudWatch metric math expression for this anomaly
         *   detector.
         */
        public fun metricMathAnomalyDetector(metricMathAnomalyDetector: IResolvable)

        /**
         * The CloudWatch metric math expression for this anomaly detector.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-metricmathanomalydetector)
         *
         * @param metricMathAnomalyDetector The CloudWatch metric math expression for this anomaly
         *   detector.
         */
        public fun metricMathAnomalyDetector(
            metricMathAnomalyDetector: MetricMathAnomalyDetectorProperty
        )

        /**
         * The CloudWatch metric math expression for this anomaly detector.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-metricmathanomalydetector)
         *
         * @param metricMathAnomalyDetector The CloudWatch metric math expression for this anomaly
         *   detector.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("cc259d6444ba8391f78b1aa77a7f081024cf6ee5c02ba0fcc16e3f778afaa600")
        public fun metricMathAnomalyDetector(
            metricMathAnomalyDetector: MetricMathAnomalyDetectorProperty.Builder.() -> Unit
        )

        /**
         * The name of the metric associated with the anomaly detection band.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-metricname)
         *
         * @param metricName The name of the metric associated with the anomaly detection band.
         */
        public fun metricName(metricName: String)

        /**
         * The namespace of the metric associated with the anomaly detection band.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-namespace)
         *
         * @param namespace The namespace of the metric associated with the anomaly detection band.
         */
        public fun namespace(namespace: String)

        /**
         * The CloudWatch metric and statistic for this anomaly detector.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-singlemetricanomalydetector)
         *
         * @param singleMetricAnomalyDetector The CloudWatch metric and statistic for this anomaly
         *   detector.
         */
        public fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: IResolvable)

        /**
         * The CloudWatch metric and statistic for this anomaly detector.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-singlemetricanomalydetector)
         *
         * @param singleMetricAnomalyDetector The CloudWatch metric and statistic for this anomaly
         *   detector.
         */
        public fun singleMetricAnomalyDetector(
            singleMetricAnomalyDetector: SingleMetricAnomalyDetectorProperty
        )

        /**
         * The CloudWatch metric and statistic for this anomaly detector.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-singlemetricanomalydetector)
         *
         * @param singleMetricAnomalyDetector The CloudWatch metric and statistic for this anomaly
         *   detector.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("93ae06367673102e5f23ee5bca9b43e8d18819a21025ef41618bb5e3d12d2353")
        public fun singleMetricAnomalyDetector(
            singleMetricAnomalyDetector: SingleMetricAnomalyDetectorProperty.Builder.() -> Unit
        )

        /**
         * The statistic of the metric associated with the anomaly detection band.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-stat)
         *
         * @param stat The statistic of the metric associated with the anomaly detection band.
         */
        public fun stat(stat: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.Builder =
            software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.Builder.create(scope, id)

        /**
         * Specifies details about how the anomaly detection model is to be trained, including time
         * ranges to exclude when training and updating the model.
         *
         * The configuration can also include the time zone to use for the metric.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-configuration)
         *
         * @param configuration Specifies details about how the anomaly detection model is to be
         *   trained, including time ranges to exclude when training and updating the model.
         */
        override fun configuration(configuration: IResolvable) {
            cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
        }

        /**
         * Specifies details about how the anomaly detection model is to be trained, including time
         * ranges to exclude when training and updating the model.
         *
         * The configuration can also include the time zone to use for the metric.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-configuration)
         *
         * @param configuration Specifies details about how the anomaly detection model is to be
         *   trained, including time ranges to exclude when training and updating the model.
         */
        override fun configuration(configuration: ConfigurationProperty) {
            cdkBuilder.configuration(configuration.let(ConfigurationProperty::unwrap))
        }

        /**
         * Specifies details about how the anomaly detection model is to be trained, including time
         * ranges to exclude when training and updating the model.
         *
         * The configuration can also include the time zone to use for the metric.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-configuration)
         *
         * @param configuration Specifies details about how the anomaly detection model is to be
         *   trained, including time ranges to exclude when training and updating the model.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("797cce49dc543cfe5e3f9e833b9c2ad1c909f309227adc72f42b6e6222575c75")
        override fun configuration(configuration: ConfigurationProperty.Builder.() -> Unit): Unit =
            configuration(ConfigurationProperty(configuration))

        /**
         * The dimensions of the metric associated with the anomaly detection band.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-dimensions)
         *
         * @param dimensions The dimensions of the metric associated with the anomaly detection
         *   band.
         */
        override fun dimensions(dimensions: IResolvable) {
            cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
        }

        /**
         * The dimensions of the metric associated with the anomaly detection band.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-dimensions)
         *
         * @param dimensions The dimensions of the metric associated with the anomaly detection
         *   band.
         */
        override fun dimensions(dimensions: List<Any>) {
            cdkBuilder.dimensions(dimensions)
        }

        /**
         * The dimensions of the metric associated with the anomaly detection band.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-dimensions)
         *
         * @param dimensions The dimensions of the metric associated with the anomaly detection
         *   band.
         */
        override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

        /**
         * The CloudWatch metric math expression for this anomaly detector.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-metricmathanomalydetector)
         *
         * @param metricMathAnomalyDetector The CloudWatch metric math expression for this anomaly
         *   detector.
         */
        override fun metricMathAnomalyDetector(metricMathAnomalyDetector: IResolvable) {
            cdkBuilder.metricMathAnomalyDetector(metricMathAnomalyDetector.let(IResolvable::unwrap))
        }

        /**
         * The CloudWatch metric math expression for this anomaly detector.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-metricmathanomalydetector)
         *
         * @param metricMathAnomalyDetector The CloudWatch metric math expression for this anomaly
         *   detector.
         */
        override fun metricMathAnomalyDetector(
            metricMathAnomalyDetector: MetricMathAnomalyDetectorProperty
        ) {
            cdkBuilder.metricMathAnomalyDetector(
                metricMathAnomalyDetector.let(MetricMathAnomalyDetectorProperty::unwrap)
            )
        }

        /**
         * The CloudWatch metric math expression for this anomaly detector.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-metricmathanomalydetector)
         *
         * @param metricMathAnomalyDetector The CloudWatch metric math expression for this anomaly
         *   detector.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("cc259d6444ba8391f78b1aa77a7f081024cf6ee5c02ba0fcc16e3f778afaa600")
        override fun metricMathAnomalyDetector(
            metricMathAnomalyDetector: MetricMathAnomalyDetectorProperty.Builder.() -> Unit
        ): Unit =
            metricMathAnomalyDetector(MetricMathAnomalyDetectorProperty(metricMathAnomalyDetector))

        /**
         * The name of the metric associated with the anomaly detection band.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-metricname)
         *
         * @param metricName The name of the metric associated with the anomaly detection band.
         */
        override fun metricName(metricName: String) {
            cdkBuilder.metricName(metricName)
        }

        /**
         * The namespace of the metric associated with the anomaly detection band.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-namespace)
         *
         * @param namespace The namespace of the metric associated with the anomaly detection band.
         */
        override fun namespace(namespace: String) {
            cdkBuilder.namespace(namespace)
        }

        /**
         * The CloudWatch metric and statistic for this anomaly detector.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-singlemetricanomalydetector)
         *
         * @param singleMetricAnomalyDetector The CloudWatch metric and statistic for this anomaly
         *   detector.
         */
        override fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: IResolvable) {
            cdkBuilder.singleMetricAnomalyDetector(
                singleMetricAnomalyDetector.let(IResolvable::unwrap)
            )
        }

        /**
         * The CloudWatch metric and statistic for this anomaly detector.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-singlemetricanomalydetector)
         *
         * @param singleMetricAnomalyDetector The CloudWatch metric and statistic for this anomaly
         *   detector.
         */
        override fun singleMetricAnomalyDetector(
            singleMetricAnomalyDetector: SingleMetricAnomalyDetectorProperty
        ) {
            cdkBuilder.singleMetricAnomalyDetector(
                singleMetricAnomalyDetector.let(SingleMetricAnomalyDetectorProperty::unwrap)
            )
        }

        /**
         * The CloudWatch metric and statistic for this anomaly detector.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-singlemetricanomalydetector)
         *
         * @param singleMetricAnomalyDetector The CloudWatch metric and statistic for this anomaly
         *   detector.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("93ae06367673102e5f23ee5bca9b43e8d18819a21025ef41618bb5e3d12d2353")
        override fun singleMetricAnomalyDetector(
            singleMetricAnomalyDetector: SingleMetricAnomalyDetectorProperty.Builder.() -> Unit
        ): Unit =
            singleMetricAnomalyDetector(
                SingleMetricAnomalyDetectorProperty(singleMetricAnomalyDetector)
            )

        /**
         * The statistic of the metric associated with the anomaly detection band.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-stat)
         *
         * @param stat The statistic of the metric associated with the anomaly detection band.
         */
        override fun stat(stat: String) {
            cdkBuilder.stat(stat)
        }

        public fun build(): software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnAnomalyDetector {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnAnomalyDetector(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector
        ): CfnAnomalyDetector = CfnAnomalyDetector(cdkObject)

        internal fun unwrap(
            wrapped: CfnAnomalyDetector
        ): software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector = wrapped.cdkObject
    }

    public interface MetricDataQueryProperty {
        /**
         * The ID of the account where the metrics are located.
         *
         * If you are performing a `GetMetricData` operation in a monitoring account, use this to
         * specify which account to retrieve this metric from.
         *
         * If you are performing a `PutMetricAlarm` operation, use this to specify which account
         * contains the metric that the alarm is watching.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricdataquery.html#cfn-cloudwatch-anomalydetector-metricdataquery-accountid)
         */
        public fun accountId(): String? = unwrap(this).getAccountId()

        /**
         * This field can contain either a Metrics Insights query, or a metric math expression to be
         * performed on the returned data.
         *
         * For more information about Metrics Insights queries, see
         * [Metrics Insights query components and syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch-metrics-insights-querylanguage)
         * in the *Amazon CloudWatch User Guide* .
         *
         * A math expression can use the `Id` of the other metrics or queries to refer to those
         * metrics, and can also use the `Id` of other expressions to use the result of those
         * expressions. For more information about metric math expressions, see
         * [Metric Math Syntax and Functions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax)
         * in the *Amazon CloudWatch User Guide* .
         *
         * Within each MetricDataQuery object, you must specify either `Expression` or `MetricStat`
         * but not both.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricdataquery.html#cfn-cloudwatch-anomalydetector-metricdataquery-expression)
         */
        public fun expression(): String? = unwrap(this).getExpression()

        /**
         * A short name used to tie this object to the results in the response.
         *
         * This name must be unique within a single call to `GetMetricData` . If you are performing
         * math expressions on this set of data, this name represents that data and can serve as a
         * variable in the mathematical expression. The valid characters are letters, numbers, and
         * underscore. The first character must be a lowercase letter.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricdataquery.html#cfn-cloudwatch-anomalydetector-metricdataquery-id)
         */
        public fun id(): String

        /**
         * A human-readable label for this metric or expression.
         *
         * This is especially useful if this is an expression, so that you know what the value
         * represents. If the metric or expression is shown in a CloudWatch dashboard widget, the
         * label is shown. If Label is omitted, CloudWatch generates a default.
         *
         * You can put dynamic expressions into a label, so that it is more descriptive. For more
         * information, see
         * [Using Dynamic Labels](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricdataquery.html#cfn-cloudwatch-anomalydetector-metricdataquery-label)
         */
        public fun label(): String? = unwrap(this).getLabel()

        /**
         * The metric to be returned, along with statistics, period, and units.
         *
         * Use this parameter only if this object is retrieving a metric and not performing a math
         * expression on returned data.
         *
         * Within one MetricDataQuery object, you must specify either `Expression` or `MetricStat`
         * but not both.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricdataquery.html#cfn-cloudwatch-anomalydetector-metricdataquery-metricstat)
         */
        public fun metricStat(): Any? = unwrap(this).getMetricStat()

        /**
         * The granularity, in seconds, of the returned data points.
         *
         * For metrics with regular resolution, a period can be as short as one minute (60 seconds)
         * and must be a multiple of 60. For high-resolution metrics that are collected at intervals
         * of less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60.
         * High-resolution metrics are those metrics stored by a `PutMetricData` operation that
         * includes a `StorageResolution of 1 second` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricdataquery.html#cfn-cloudwatch-anomalydetector-metricdataquery-period)
         */
        public fun period(): Number? = unwrap(this).getPeriod()

        /**
         * When used in `GetMetricData` , this option indicates whether to return the timestamps and
         * raw data values of this metric.
         *
         * If you are performing this call just to do math expressions and do not also need the raw
         * data returned, you can specify `false` . If you omit this, the default of `true` is used.
         *
         * When used in `PutMetricAlarm` , specify `true` for the one expression result to use as
         * the alarm. For all other metrics and expressions in the same `PutMetricAlarm` operation,
         * specify `ReturnData` as False.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricdataquery.html#cfn-cloudwatch-anomalydetector-metricdataquery-returndata)
         */
        public fun returnData(): Any? = unwrap(this).getReturnData()

        /** A builder for [MetricDataQueryProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param accountId The ID of the account where the metrics are located. If you are
             *   performing a `GetMetricData` operation in a monitoring account, use this to specify
             *   which account to retrieve this metric from.
             *
             * If you are performing a `PutMetricAlarm` operation, use this to specify which account
             * contains the metric that the alarm is watching.
             */
            public fun accountId(accountId: String)

            /**
             * @param expression This field can contain either a Metrics Insights query, or a metric
             *   math expression to be performed on the returned data. For more information about
             *   Metrics Insights queries, see
             *   [Metrics Insights query components and syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch-metrics-insights-querylanguage)
             *   in the *Amazon CloudWatch User Guide* .
             *
             * A math expression can use the `Id` of the other metrics or queries to refer to those
             * metrics, and can also use the `Id` of other expressions to use the result of those
             * expressions. For more information about metric math expressions, see
             * [Metric Math Syntax and Functions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax)
             * in the *Amazon CloudWatch User Guide* .
             *
             * Within each MetricDataQuery object, you must specify either `Expression` or
             * `MetricStat` but not both.
             */
            public fun expression(expression: String)

            /**
             * @param id A short name used to tie this object to the results in the response. This
             *   name must be unique within a single call to `GetMetricData` . If you are performing
             *   math expressions on this set of data, this name represents that data and can serve
             *   as a variable in the mathematical expression. The valid characters are letters,
             *   numbers, and underscore. The first character must be a lowercase letter.
             */
            public fun id(id: String)

            /**
             * @param label A human-readable label for this metric or expression. This is especially
             *   useful if this is an expression, so that you know what the value represents. If the
             *   metric or expression is shown in a CloudWatch dashboard widget, the label is shown.
             *   If Label is omitted, CloudWatch generates a default.
             *
             * You can put dynamic expressions into a label, so that it is more descriptive. For
             * more information, see
             * [Using Dynamic Labels](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html)
             * .
             */
            public fun label(label: String)

            /**
             * @param metricStat The metric to be returned, along with statistics, period, and
             *   units. Use this parameter only if this object is retrieving a metric and not
             *   performing a math expression on returned data.
             *
             * Within one MetricDataQuery object, you must specify either `Expression` or
             * `MetricStat` but not both.
             */
            public fun metricStat(metricStat: IResolvable)

            /**
             * @param metricStat The metric to be returned, along with statistics, period, and
             *   units. Use this parameter only if this object is retrieving a metric and not
             *   performing a math expression on returned data.
             *
             * Within one MetricDataQuery object, you must specify either `Expression` or
             * `MetricStat` but not both.
             */
            public fun metricStat(metricStat: MetricStatProperty)

            /**
             * @param metricStat The metric to be returned, along with statistics, period, and
             *   units. Use this parameter only if this object is retrieving a metric and not
             *   performing a math expression on returned data.
             *
             * Within one MetricDataQuery object, you must specify either `Expression` or
             * `MetricStat` but not both.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("b15486ff93bfa529642e3e885e2223c2807ed9b7fc6975b10a8e05734cbd12cd")
            public fun metricStat(metricStat: MetricStatProperty.Builder.() -> Unit)

            /**
             * @param period The granularity, in seconds, of the returned data points. For metrics
             *   with regular resolution, a period can be as short as one minute (60 seconds) and
             *   must be a multiple of 60. For high-resolution metrics that are collected at
             *   intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any
             *   multiple of 60. High-resolution metrics are those metrics stored by a
             *   `PutMetricData` operation that includes a `StorageResolution of 1 second` .
             */
            public fun period(period: Number)

            /**
             * @param returnData When used in `GetMetricData` , this option indicates whether to
             *   return the timestamps and raw data values of this metric. If you are performing
             *   this call just to do math expressions and do not also need the raw data returned,
             *   you can specify `false` . If you omit this, the default of `true` is used.
             *
             * When used in `PutMetricAlarm` , specify `true` for the one expression result to use
             * as the alarm. For all other metrics and expressions in the same `PutMetricAlarm`
             * operation, specify `ReturnData` as False.
             */
            public fun returnData(returnData: Boolean)

            /**
             * @param returnData When used in `GetMetricData` , this option indicates whether to
             *   return the timestamps and raw data values of this metric. If you are performing
             *   this call just to do math expressions and do not also need the raw data returned,
             *   you can specify `false` . If you omit this, the default of `true` is used.
             *
             * When used in `PutMetricAlarm` , specify `true` for the one expression result to use
             * as the alarm. For all other metrics and expressions in the same `PutMetricAlarm`
             * operation, specify `ReturnData` as False.
             */
            public fun returnData(returnData: IResolvable)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricDataQueryProperty.Builder =
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector
                    .MetricDataQueryProperty
                    .builder()

            /**
             * @param accountId The ID of the account where the metrics are located. If you are
             *   performing a `GetMetricData` operation in a monitoring account, use this to specify
             *   which account to retrieve this metric from.
             *
             * If you are performing a `PutMetricAlarm` operation, use this to specify which account
             * contains the metric that the alarm is watching.
             */
            override fun accountId(accountId: String) {
                cdkBuilder.accountId(accountId)
            }

            /**
             * @param expression This field can contain either a Metrics Insights query, or a metric
             *   math expression to be performed on the returned data. For more information about
             *   Metrics Insights queries, see
             *   [Metrics Insights query components and syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch-metrics-insights-querylanguage)
             *   in the *Amazon CloudWatch User Guide* .
             *
             * A math expression can use the `Id` of the other metrics or queries to refer to those
             * metrics, and can also use the `Id` of other expressions to use the result of those
             * expressions. For more information about metric math expressions, see
             * [Metric Math Syntax and Functions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax)
             * in the *Amazon CloudWatch User Guide* .
             *
             * Within each MetricDataQuery object, you must specify either `Expression` or
             * `MetricStat` but not both.
             */
            override fun expression(expression: String) {
                cdkBuilder.expression(expression)
            }

            /**
             * @param id A short name used to tie this object to the results in the response. This
             *   name must be unique within a single call to `GetMetricData` . If you are performing
             *   math expressions on this set of data, this name represents that data and can serve
             *   as a variable in the mathematical expression. The valid characters are letters,
             *   numbers, and underscore. The first character must be a lowercase letter.
             */
            override fun id(id: String) {
                cdkBuilder.id(id)
            }

            /**
             * @param label A human-readable label for this metric or expression. This is especially
             *   useful if this is an expression, so that you know what the value represents. If the
             *   metric or expression is shown in a CloudWatch dashboard widget, the label is shown.
             *   If Label is omitted, CloudWatch generates a default.
             *
             * You can put dynamic expressions into a label, so that it is more descriptive. For
             * more information, see
             * [Using Dynamic Labels](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html)
             * .
             */
            override fun label(label: String) {
                cdkBuilder.label(label)
            }

            /**
             * @param metricStat The metric to be returned, along with statistics, period, and
             *   units. Use this parameter only if this object is retrieving a metric and not
             *   performing a math expression on returned data.
             *
             * Within one MetricDataQuery object, you must specify either `Expression` or
             * `MetricStat` but not both.
             */
            override fun metricStat(metricStat: IResolvable) {
                cdkBuilder.metricStat(metricStat.let(IResolvable::unwrap))
            }

            /**
             * @param metricStat The metric to be returned, along with statistics, period, and
             *   units. Use this parameter only if this object is retrieving a metric and not
             *   performing a math expression on returned data.
             *
             * Within one MetricDataQuery object, you must specify either `Expression` or
             * `MetricStat` but not both.
             */
            override fun metricStat(metricStat: MetricStatProperty) {
                cdkBuilder.metricStat(metricStat.let(MetricStatProperty::unwrap))
            }

            /**
             * @param metricStat The metric to be returned, along with statistics, period, and
             *   units. Use this parameter only if this object is retrieving a metric and not
             *   performing a math expression on returned data.
             *
             * Within one MetricDataQuery object, you must specify either `Expression` or
             * `MetricStat` but not both.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("b15486ff93bfa529642e3e885e2223c2807ed9b7fc6975b10a8e05734cbd12cd")
            override fun metricStat(metricStat: MetricStatProperty.Builder.() -> Unit): Unit =
                metricStat(MetricStatProperty(metricStat))

            /**
             * @param period The granularity, in seconds, of the returned data points. For metrics
             *   with regular resolution, a period can be as short as one minute (60 seconds) and
             *   must be a multiple of 60. For high-resolution metrics that are collected at
             *   intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any
             *   multiple of 60. High-resolution metrics are those metrics stored by a
             *   `PutMetricData` operation that includes a `StorageResolution of 1 second` .
             */
            override fun period(period: Number) {
                cdkBuilder.period(period)
            }

            /**
             * @param returnData When used in `GetMetricData` , this option indicates whether to
             *   return the timestamps and raw data values of this metric. If you are performing
             *   this call just to do math expressions and do not also need the raw data returned,
             *   you can specify `false` . If you omit this, the default of `true` is used.
             *
             * When used in `PutMetricAlarm` , specify `true` for the one expression result to use
             * as the alarm. For all other metrics and expressions in the same `PutMetricAlarm`
             * operation, specify `ReturnData` as False.
             */
            override fun returnData(returnData: Boolean) {
                cdkBuilder.returnData(returnData)
            }

            /**
             * @param returnData When used in `GetMetricData` , this option indicates whether to
             *   return the timestamps and raw data values of this metric. If you are performing
             *   this call just to do math expressions and do not also need the raw data returned,
             *   you can specify `false` . If you omit this, the default of `true` is used.
             *
             * When used in `PutMetricAlarm` , specify `true` for the one expression result to use
             * as the alarm. For all other metrics and expressions in the same `PutMetricAlarm`
             * operation, specify `ReturnData` as False.
             */
            override fun returnData(returnData: IResolvable) {
                cdkBuilder.returnData(returnData.let(IResolvable::unwrap))
            }

            public fun build():
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricDataQueryProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricDataQueryProperty,
        ) : MetricDataQueryProperty {
            /**
             * The ID of the account where the metrics are located.
             *
             * If you are performing a `GetMetricData` operation in a monitoring account, use this
             * to specify which account to retrieve this metric from.
             *
             * If you are performing a `PutMetricAlarm` operation, use this to specify which account
             * contains the metric that the alarm is watching.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricdataquery.html#cfn-cloudwatch-anomalydetector-metricdataquery-accountid)
             */
            override fun accountId(): String? = unwrap(this).getAccountId()

            /**
             * This field can contain either a Metrics Insights query, or a metric math expression
             * to be performed on the returned data.
             *
             * For more information about Metrics Insights queries, see
             * [Metrics Insights query components and syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch-metrics-insights-querylanguage)
             * in the *Amazon CloudWatch User Guide* .
             *
             * A math expression can use the `Id` of the other metrics or queries to refer to those
             * metrics, and can also use the `Id` of other expressions to use the result of those
             * expressions. For more information about metric math expressions, see
             * [Metric Math Syntax and Functions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax)
             * in the *Amazon CloudWatch User Guide* .
             *
             * Within each MetricDataQuery object, you must specify either `Expression` or
             * `MetricStat` but not both.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricdataquery.html#cfn-cloudwatch-anomalydetector-metricdataquery-expression)
             */
            override fun expression(): String? = unwrap(this).getExpression()

            /**
             * A short name used to tie this object to the results in the response.
             *
             * This name must be unique within a single call to `GetMetricData` . If you are
             * performing math expressions on this set of data, this name represents that data and
             * can serve as a variable in the mathematical expression. The valid characters are
             * letters, numbers, and underscore. The first character must be a lowercase letter.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricdataquery.html#cfn-cloudwatch-anomalydetector-metricdataquery-id)
             */
            override fun id(): String = unwrap(this).getId()

            /**
             * A human-readable label for this metric or expression.
             *
             * This is especially useful if this is an expression, so that you know what the value
             * represents. If the metric or expression is shown in a CloudWatch dashboard widget,
             * the label is shown. If Label is omitted, CloudWatch generates a default.
             *
             * You can put dynamic expressions into a label, so that it is more descriptive. For
             * more information, see
             * [Using Dynamic Labels](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricdataquery.html#cfn-cloudwatch-anomalydetector-metricdataquery-label)
             */
            override fun label(): String? = unwrap(this).getLabel()

            /**
             * The metric to be returned, along with statistics, period, and units.
             *
             * Use this parameter only if this object is retrieving a metric and not performing a
             * math expression on returned data.
             *
             * Within one MetricDataQuery object, you must specify either `Expression` or
             * `MetricStat` but not both.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricdataquery.html#cfn-cloudwatch-anomalydetector-metricdataquery-metricstat)
             */
            override fun metricStat(): Any? = unwrap(this).getMetricStat()

            /**
             * The granularity, in seconds, of the returned data points.
             *
             * For metrics with regular resolution, a period can be as short as one minute (60
             * seconds) and must be a multiple of 60. For high-resolution metrics that are collected
             * at intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any
             * multiple of 60. High-resolution metrics are those metrics stored by a `PutMetricData`
             * operation that includes a `StorageResolution of 1 second` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricdataquery.html#cfn-cloudwatch-anomalydetector-metricdataquery-period)
             */
            override fun period(): Number? = unwrap(this).getPeriod()

            /**
             * When used in `GetMetricData` , this option indicates whether to return the timestamps
             * and raw data values of this metric.
             *
             * If you are performing this call just to do math expressions and do not also need the
             * raw data returned, you can specify `false` . If you omit this, the default of `true`
             * is used.
             *
             * When used in `PutMetricAlarm` , specify `true` for the one expression result to use
             * as the alarm. For all other metrics and expressions in the same `PutMetricAlarm`
             * operation, specify `ReturnData` as False.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricdataquery.html#cfn-cloudwatch-anomalydetector-metricdataquery-returndata)
             */
            override fun returnData(): Any? = unwrap(this).getReturnData()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): MetricDataQueryProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricDataQueryProperty
            ): MetricDataQueryProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MetricDataQueryProperty
            ): software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricDataQueryProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface SingleMetricAnomalyDetectorProperty {
        /**
         * The metric dimensions to create the anomaly detection model for.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-singlemetricanomalydetector.html#cfn-cloudwatch-anomalydetector-singlemetricanomalydetector-dimensions)
         */
        public fun dimensions(): Any? = unwrap(this).getDimensions()

        /**
         * The name of the metric to create the anomaly detection model for.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-singlemetricanomalydetector.html#cfn-cloudwatch-anomalydetector-singlemetricanomalydetector-metricname)
         */
        public fun metricName(): String? = unwrap(this).getMetricName()

        /**
         * The namespace of the metric to create the anomaly detection model for.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-singlemetricanomalydetector.html#cfn-cloudwatch-anomalydetector-singlemetricanomalydetector-namespace)
         */
        public fun namespace(): String? = unwrap(this).getNamespace()

        /**
         * The statistic to use for the metric and anomaly detection model.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-singlemetricanomalydetector.html#cfn-cloudwatch-anomalydetector-singlemetricanomalydetector-stat)
         */
        public fun stat(): String? = unwrap(this).getStat()

        /** A builder for [SingleMetricAnomalyDetectorProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param dimensions The metric dimensions to create the anomaly detection model for.
             */
            public fun dimensions(dimensions: IResolvable)

            /**
             * @param dimensions The metric dimensions to create the anomaly detection model for.
             */
            public fun dimensions(dimensions: List<Any>)

            /**
             * @param dimensions The metric dimensions to create the anomaly detection model for.
             */
            public fun dimensions(vararg dimensions: Any)

            /**
             * @param metricName The name of the metric to create the anomaly detection model for.
             */
            public fun metricName(metricName: String)

            /**
             * @param namespace The namespace of the metric to create the anomaly detection model
             *   for.
             */
            public fun namespace(namespace: String)

            /** @param stat The statistic to use for the metric and anomaly detection model. */
            public fun stat(stat: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty.Builder =
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector
                    .SingleMetricAnomalyDetectorProperty
                    .builder()

            /**
             * @param dimensions The metric dimensions to create the anomaly detection model for.
             */
            override fun dimensions(dimensions: IResolvable) {
                cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
            }

            /**
             * @param dimensions The metric dimensions to create the anomaly detection model for.
             */
            override fun dimensions(dimensions: List<Any>) {
                cdkBuilder.dimensions(dimensions)
            }

            /**
             * @param dimensions The metric dimensions to create the anomaly detection model for.
             */
            override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

            /**
             * @param metricName The name of the metric to create the anomaly detection model for.
             */
            override fun metricName(metricName: String) {
                cdkBuilder.metricName(metricName)
            }

            /**
             * @param namespace The namespace of the metric to create the anomaly detection model
             *   for.
             */
            override fun namespace(namespace: String) {
                cdkBuilder.namespace(namespace)
            }

            /** @param stat The statistic to use for the metric and anomaly detection model. */
            override fun stat(stat: String) {
                cdkBuilder.stat(stat)
            }

            public fun build():
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty,
        ) : SingleMetricAnomalyDetectorProperty {
            /**
             * The metric dimensions to create the anomaly detection model for.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-singlemetricanomalydetector.html#cfn-cloudwatch-anomalydetector-singlemetricanomalydetector-dimensions)
             */
            override fun dimensions(): Any? = unwrap(this).getDimensions()

            /**
             * The name of the metric to create the anomaly detection model for.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-singlemetricanomalydetector.html#cfn-cloudwatch-anomalydetector-singlemetricanomalydetector-metricname)
             */
            override fun metricName(): String? = unwrap(this).getMetricName()

            /**
             * The namespace of the metric to create the anomaly detection model for.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-singlemetricanomalydetector.html#cfn-cloudwatch-anomalydetector-singlemetricanomalydetector-namespace)
             */
            override fun namespace(): String? = unwrap(this).getNamespace()

            /**
             * The statistic to use for the metric and anomaly detection model.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-singlemetricanomalydetector.html#cfn-cloudwatch-anomalydetector-singlemetricanomalydetector-stat)
             */
            override fun stat(): String? = unwrap(this).getStat()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): SingleMetricAnomalyDetectorProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty
            ): SingleMetricAnomalyDetectorProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: SingleMetricAnomalyDetectorProperty
            ): software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface MetricStatProperty {
        /**
         * The metric to return, including the metric name, namespace, and dimensions.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricstat.html#cfn-cloudwatch-anomalydetector-metricstat-metric)
         */
        public fun metric(): Any

        /**
         * The granularity, in seconds, of the returned data points.
         *
         * For metrics with regular resolution, a period can be as short as one minute (60 seconds)
         * and must be a multiple of 60. For high-resolution metrics that are collected at intervals
         * of less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60.
         * High-resolution metrics are those metrics stored by a `PutMetricData` call that includes
         * a `StorageResolution` of 1 second.
         *
         * If the `StartTime` parameter specifies a time stamp that is greater than 3 hours ago, you
         * must specify the period as follows or no data points in that time range is returned:
         * * Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
         * * Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
         * * Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricstat.html#cfn-cloudwatch-anomalydetector-metricstat-period)
         */
        public fun period(): Number

        /**
         * The statistic to return.
         *
         * It can include any CloudWatch statistic or extended statistic.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricstat.html#cfn-cloudwatch-anomalydetector-metricstat-stat)
         */
        public fun stat(): String

        /**
         * When you are using a `Put` operation, this defines what unit you want to use when storing
         * the metric.
         *
         * In a `Get` operation, if you omit `Unit` then all data that was collected with any unit
         * is returned, along with the corresponding units that were specified when the data was
         * reported to CloudWatch. If you specify a unit, the operation returns only data that was
         * collected with that unit specified. If you specify a unit that does not match the data
         * collected, the results of the operation are null. CloudWatch does not perform unit
         * conversions.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricstat.html#cfn-cloudwatch-anomalydetector-metricstat-unit)
         */
        public fun unit(): String? = unwrap(this).getUnit()

        /** A builder for [MetricStatProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param metric The metric to return, including the metric name, namespace, and
             *   dimensions.
             */
            public fun metric(metric: IResolvable)

            /**
             * @param metric The metric to return, including the metric name, namespace, and
             *   dimensions.
             */
            public fun metric(metric: MetricProperty)

            /**
             * @param metric The metric to return, including the metric name, namespace, and
             *   dimensions.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("081c7eab5b33fe49cd3958a08060052a45aeca231d05a19eb3bbd383cc9628d3")
            public fun metric(metric: MetricProperty.Builder.() -> Unit)

            /**
             * @param period The granularity, in seconds, of the returned data points. For metrics
             *   with regular resolution, a period can be as short as one minute (60 seconds) and
             *   must be a multiple of 60. For high-resolution metrics that are collected at
             *   intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any
             *   multiple of 60. High-resolution metrics are those metrics stored by a
             *   `PutMetricData` call that includes a `StorageResolution` of 1 second.
             *
             * If the `StartTime` parameter specifies a time stamp that is greater than 3 hours ago,
             * you must specify the period as follows or no data points in that time range is
             * returned:
             * * Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1
             *   minute).
             * * Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
             * * Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
             */
            public fun period(period: Number)

            /**
             * @param stat The statistic to return. It can include any CloudWatch statistic or
             *   extended statistic.
             */
            public fun stat(stat: String)

            /**
             * @param unit When you are using a `Put` operation, this defines what unit you want to
             *   use when storing the metric. In a `Get` operation, if you omit `Unit` then all data
             *   that was collected with any unit is returned, along with the corresponding units
             *   that were specified when the data was reported to CloudWatch. If you specify a
             *   unit, the operation returns only data that was collected with that unit specified.
             *   If you specify a unit that does not match the data collected, the results of the
             *   operation are null. CloudWatch does not perform unit conversions.
             */
            public fun unit(unit: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricStatProperty.Builder =
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricStatProperty
                    .builder()

            /**
             * @param metric The metric to return, including the metric name, namespace, and
             *   dimensions.
             */
            override fun metric(metric: IResolvable) {
                cdkBuilder.metric(metric.let(IResolvable::unwrap))
            }

            /**
             * @param metric The metric to return, including the metric name, namespace, and
             *   dimensions.
             */
            override fun metric(metric: MetricProperty) {
                cdkBuilder.metric(metric.let(MetricProperty::unwrap))
            }

            /**
             * @param metric The metric to return, including the metric name, namespace, and
             *   dimensions.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("081c7eab5b33fe49cd3958a08060052a45aeca231d05a19eb3bbd383cc9628d3")
            override fun metric(metric: MetricProperty.Builder.() -> Unit): Unit =
                metric(MetricProperty(metric))

            /**
             * @param period The granularity, in seconds, of the returned data points. For metrics
             *   with regular resolution, a period can be as short as one minute (60 seconds) and
             *   must be a multiple of 60. For high-resolution metrics that are collected at
             *   intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any
             *   multiple of 60. High-resolution metrics are those metrics stored by a
             *   `PutMetricData` call that includes a `StorageResolution` of 1 second.
             *
             * If the `StartTime` parameter specifies a time stamp that is greater than 3 hours ago,
             * you must specify the period as follows or no data points in that time range is
             * returned:
             * * Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1
             *   minute).
             * * Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
             * * Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
             */
            override fun period(period: Number) {
                cdkBuilder.period(period)
            }

            /**
             * @param stat The statistic to return. It can include any CloudWatch statistic or
             *   extended statistic.
             */
            override fun stat(stat: String) {
                cdkBuilder.stat(stat)
            }

            /**
             * @param unit When you are using a `Put` operation, this defines what unit you want to
             *   use when storing the metric. In a `Get` operation, if you omit `Unit` then all data
             *   that was collected with any unit is returned, along with the corresponding units
             *   that were specified when the data was reported to CloudWatch. If you specify a
             *   unit, the operation returns only data that was collected with that unit specified.
             *   If you specify a unit that does not match the data collected, the results of the
             *   operation are null. CloudWatch does not perform unit conversions.
             */
            override fun unit(unit: String) {
                cdkBuilder.unit(unit)
            }

            public fun build():
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricStatProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricStatProperty,
        ) : MetricStatProperty {
            /**
             * The metric to return, including the metric name, namespace, and dimensions.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricstat.html#cfn-cloudwatch-anomalydetector-metricstat-metric)
             */
            override fun metric(): Any = unwrap(this).getMetric()

            /**
             * The granularity, in seconds, of the returned data points.
             *
             * For metrics with regular resolution, a period can be as short as one minute (60
             * seconds) and must be a multiple of 60. For high-resolution metrics that are collected
             * at intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any
             * multiple of 60. High-resolution metrics are those metrics stored by a `PutMetricData`
             * call that includes a `StorageResolution` of 1 second.
             *
             * If the `StartTime` parameter specifies a time stamp that is greater than 3 hours ago,
             * you must specify the period as follows or no data points in that time range is
             * returned:
             * * Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1
             *   minute).
             * * Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
             * * Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricstat.html#cfn-cloudwatch-anomalydetector-metricstat-period)
             */
            override fun period(): Number = unwrap(this).getPeriod()

            /**
             * The statistic to return.
             *
             * It can include any CloudWatch statistic or extended statistic.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricstat.html#cfn-cloudwatch-anomalydetector-metricstat-stat)
             */
            override fun stat(): String = unwrap(this).getStat()

            /**
             * When you are using a `Put` operation, this defines what unit you want to use when
             * storing the metric.
             *
             * In a `Get` operation, if you omit `Unit` then all data that was collected with any
             * unit is returned, along with the corresponding units that were specified when the
             * data was reported to CloudWatch. If you specify a unit, the operation returns only
             * data that was collected with that unit specified. If you specify a unit that does not
             * match the data collected, the results of the operation are null. CloudWatch does not
             * perform unit conversions.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricstat.html#cfn-cloudwatch-anomalydetector-metricstat-unit)
             */
            override fun unit(): String? = unwrap(this).getUnit()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): MetricStatProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricStatProperty
            ): MetricStatProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MetricStatProperty
            ): software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricStatProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface DimensionProperty {
        /**
         * The name of the dimension.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-dimension.html#cfn-cloudwatch-anomalydetector-dimension-name)
         */
        public fun name(): String

        /**
         * The value of the dimension.
         *
         * Dimension values must contain only ASCII characters and must include at least one
         * non-whitespace character. ASCII control characters are not supported as part of dimension
         * values.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-dimension.html#cfn-cloudwatch-anomalydetector-dimension-value)
         */
        public fun `value`(): String

        /** A builder for [DimensionProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param name The name of the dimension. */
            public fun name(name: String)

            /**
             * @param value The value of the dimension. Dimension values must contain only ASCII
             *   characters and must include at least one non-whitespace character. ASCII control
             *   characters are not supported as part of dimension values.
             */
            public fun `value`(`value`: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.DimensionProperty.Builder =
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.DimensionProperty
                    .builder()

            /** @param name The name of the dimension. */
            override fun name(name: String) {
                cdkBuilder.name(name)
            }

            /**
             * @param value The value of the dimension. Dimension values must contain only ASCII
             *   characters and must include at least one non-whitespace character. ASCII control
             *   characters are not supported as part of dimension values.
             */
            override fun `value`(`value`: String) {
                cdkBuilder.`value`(`value`)
            }

            public fun build():
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.DimensionProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.DimensionProperty,
        ) : DimensionProperty {
            /**
             * The name of the dimension.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-dimension.html#cfn-cloudwatch-anomalydetector-dimension-name)
             */
            override fun name(): String = unwrap(this).getName()

            /**
             * The value of the dimension.
             *
             * Dimension values must contain only ASCII characters and must include at least one
             * non-whitespace character. ASCII control characters are not supported as part of
             * dimension values.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-dimension.html#cfn-cloudwatch-anomalydetector-dimension-value)
             */
            override fun `value`(): String = unwrap(this).getValue()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): DimensionProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.DimensionProperty
            ): DimensionProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: DimensionProperty
            ): software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.DimensionProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface MetricMathAnomalyDetectorProperty {
        /**
         * An array of metric data query structures that enables you to create an anomaly detector
         * based on the result of a metric math expression.
         *
         * Each item in `MetricDataQueries` gets a metric or performs a math expression. One item in
         * `MetricDataQueries` is the expression that provides the time series that the anomaly
         * detector uses as input. Designate the expression by setting `ReturnData` to `true` for
         * this object in the array. For all other expressions and metrics, set `ReturnData` to
         * `false` . The designated expression must return a single time series.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricmathanomalydetector.html#cfn-cloudwatch-anomalydetector-metricmathanomalydetector-metricdataqueries)
         */
        public fun metricDataQueries(): Any? = unwrap(this).getMetricDataQueries()

        /** A builder for [MetricMathAnomalyDetectorProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param metricDataQueries An array of metric data query structures that enables you to
             *   create an anomaly detector based on the result of a metric math expression. Each
             *   item in `MetricDataQueries` gets a metric or performs a math expression. One item
             *   in `MetricDataQueries` is the expression that provides the time series that the
             *   anomaly detector uses as input. Designate the expression by setting `ReturnData` to
             *   `true` for this object in the array. For all other expressions and metrics, set
             *   `ReturnData` to `false` . The designated expression must return a single time
             *   series.
             */
            public fun metricDataQueries(metricDataQueries: IResolvable)

            /**
             * @param metricDataQueries An array of metric data query structures that enables you to
             *   create an anomaly detector based on the result of a metric math expression. Each
             *   item in `MetricDataQueries` gets a metric or performs a math expression. One item
             *   in `MetricDataQueries` is the expression that provides the time series that the
             *   anomaly detector uses as input. Designate the expression by setting `ReturnData` to
             *   `true` for this object in the array. For all other expressions and metrics, set
             *   `ReturnData` to `false` . The designated expression must return a single time
             *   series.
             */
            public fun metricDataQueries(metricDataQueries: List<Any>)

            /**
             * @param metricDataQueries An array of metric data query structures that enables you to
             *   create an anomaly detector based on the result of a metric math expression. Each
             *   item in `MetricDataQueries` gets a metric or performs a math expression. One item
             *   in `MetricDataQueries` is the expression that provides the time series that the
             *   anomaly detector uses as input. Designate the expression by setting `ReturnData` to
             *   `true` for this object in the array. For all other expressions and metrics, set
             *   `ReturnData` to `false` . The designated expression must return a single time
             *   series.
             */
            public fun metricDataQueries(vararg metricDataQueries: Any)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricMathAnomalyDetectorProperty.Builder =
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector
                    .MetricMathAnomalyDetectorProperty
                    .builder()

            /**
             * @param metricDataQueries An array of metric data query structures that enables you to
             *   create an anomaly detector based on the result of a metric math expression. Each
             *   item in `MetricDataQueries` gets a metric or performs a math expression. One item
             *   in `MetricDataQueries` is the expression that provides the time series that the
             *   anomaly detector uses as input. Designate the expression by setting `ReturnData` to
             *   `true` for this object in the array. For all other expressions and metrics, set
             *   `ReturnData` to `false` . The designated expression must return a single time
             *   series.
             */
            override fun metricDataQueries(metricDataQueries: IResolvable) {
                cdkBuilder.metricDataQueries(metricDataQueries.let(IResolvable::unwrap))
            }

            /**
             * @param metricDataQueries An array of metric data query structures that enables you to
             *   create an anomaly detector based on the result of a metric math expression. Each
             *   item in `MetricDataQueries` gets a metric or performs a math expression. One item
             *   in `MetricDataQueries` is the expression that provides the time series that the
             *   anomaly detector uses as input. Designate the expression by setting `ReturnData` to
             *   `true` for this object in the array. For all other expressions and metrics, set
             *   `ReturnData` to `false` . The designated expression must return a single time
             *   series.
             */
            override fun metricDataQueries(metricDataQueries: List<Any>) {
                cdkBuilder.metricDataQueries(metricDataQueries)
            }

            /**
             * @param metricDataQueries An array of metric data query structures that enables you to
             *   create an anomaly detector based on the result of a metric math expression. Each
             *   item in `MetricDataQueries` gets a metric or performs a math expression. One item
             *   in `MetricDataQueries` is the expression that provides the time series that the
             *   anomaly detector uses as input. Designate the expression by setting `ReturnData` to
             *   `true` for this object in the array. For all other expressions and metrics, set
             *   `ReturnData` to `false` . The designated expression must return a single time
             *   series.
             */
            override fun metricDataQueries(vararg metricDataQueries: Any): Unit =
                metricDataQueries(metricDataQueries.toList())

            public fun build():
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricMathAnomalyDetectorProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricMathAnomalyDetectorProperty,
        ) : MetricMathAnomalyDetectorProperty {
            /**
             * An array of metric data query structures that enables you to create an anomaly
             * detector based on the result of a metric math expression.
             *
             * Each item in `MetricDataQueries` gets a metric or performs a math expression. One
             * item in `MetricDataQueries` is the expression that provides the time series that the
             * anomaly detector uses as input. Designate the expression by setting `ReturnData` to
             * `true` for this object in the array. For all other expressions and metrics, set
             * `ReturnData` to `false` . The designated expression must return a single time series.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricmathanomalydetector.html#cfn-cloudwatch-anomalydetector-metricmathanomalydetector-metricdataqueries)
             */
            override fun metricDataQueries(): Any? = unwrap(this).getMetricDataQueries()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): MetricMathAnomalyDetectorProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricMathAnomalyDetectorProperty
            ): MetricMathAnomalyDetectorProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MetricMathAnomalyDetectorProperty
            ): software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricMathAnomalyDetectorProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ConfigurationProperty {
        /**
         * Specifies an array of time ranges to exclude from use when the anomaly detection model is
         * trained and updated.
         *
         * Use this to make sure that events that could cause unusual values for the metric, such as
         * deployments, aren't used when CloudWatch creates or updates the model.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-configuration.html#cfn-cloudwatch-anomalydetector-configuration-excludedtimeranges)
         */
        public fun excludedTimeRanges(): Any? = unwrap(this).getExcludedTimeRanges()

        /**
         * The time zone to use for the metric.
         *
         * This is useful to enable the model to automatically account for daylight savings time
         * changes if the metric is sensitive to such time changes.
         *
         * To specify a time zone, use the name of the time zone as specified in the standard tz
         * database. For more information, see
         * [tz database](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Tz_database) .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-configuration.html#cfn-cloudwatch-anomalydetector-configuration-metrictimezone)
         */
        public fun metricTimeZone(): String? = unwrap(this).getMetricTimeZone()

        /** A builder for [ConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param excludedTimeRanges Specifies an array of time ranges to exclude from use when
             *   the anomaly detection model is trained and updated. Use this to make sure that
             *   events that could cause unusual values for the metric, such as deployments, aren't
             *   used when CloudWatch creates or updates the model.
             */
            public fun excludedTimeRanges(excludedTimeRanges: IResolvable)

            /**
             * @param excludedTimeRanges Specifies an array of time ranges to exclude from use when
             *   the anomaly detection model is trained and updated. Use this to make sure that
             *   events that could cause unusual values for the metric, such as deployments, aren't
             *   used when CloudWatch creates or updates the model.
             */
            public fun excludedTimeRanges(excludedTimeRanges: List<Any>)

            /**
             * @param excludedTimeRanges Specifies an array of time ranges to exclude from use when
             *   the anomaly detection model is trained and updated. Use this to make sure that
             *   events that could cause unusual values for the metric, such as deployments, aren't
             *   used when CloudWatch creates or updates the model.
             */
            public fun excludedTimeRanges(vararg excludedTimeRanges: Any)

            /**
             * @param metricTimeZone The time zone to use for the metric. This is useful to enable
             *   the model to automatically account for daylight savings time changes if the metric
             *   is sensitive to such time changes.
             *
             * To specify a time zone, use the name of the time zone as specified in the standard tz
             * database. For more information, see
             * [tz database](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Tz_database)
             * .
             */
            public fun metricTimeZone(metricTimeZone: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.ConfigurationProperty.Builder =
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.ConfigurationProperty
                    .builder()

            /**
             * @param excludedTimeRanges Specifies an array of time ranges to exclude from use when
             *   the anomaly detection model is trained and updated. Use this to make sure that
             *   events that could cause unusual values for the metric, such as deployments, aren't
             *   used when CloudWatch creates or updates the model.
             */
            override fun excludedTimeRanges(excludedTimeRanges: IResolvable) {
                cdkBuilder.excludedTimeRanges(excludedTimeRanges.let(IResolvable::unwrap))
            }

            /**
             * @param excludedTimeRanges Specifies an array of time ranges to exclude from use when
             *   the anomaly detection model is trained and updated. Use this to make sure that
             *   events that could cause unusual values for the metric, such as deployments, aren't
             *   used when CloudWatch creates or updates the model.
             */
            override fun excludedTimeRanges(excludedTimeRanges: List<Any>) {
                cdkBuilder.excludedTimeRanges(excludedTimeRanges)
            }

            /**
             * @param excludedTimeRanges Specifies an array of time ranges to exclude from use when
             *   the anomaly detection model is trained and updated. Use this to make sure that
             *   events that could cause unusual values for the metric, such as deployments, aren't
             *   used when CloudWatch creates or updates the model.
             */
            override fun excludedTimeRanges(vararg excludedTimeRanges: Any): Unit =
                excludedTimeRanges(excludedTimeRanges.toList())

            /**
             * @param metricTimeZone The time zone to use for the metric. This is useful to enable
             *   the model to automatically account for daylight savings time changes if the metric
             *   is sensitive to such time changes.
             *
             * To specify a time zone, use the name of the time zone as specified in the standard tz
             * database. For more information, see
             * [tz database](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Tz_database)
             * .
             */
            override fun metricTimeZone(metricTimeZone: String) {
                cdkBuilder.metricTimeZone(metricTimeZone)
            }

            public fun build():
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.ConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.ConfigurationProperty,
        ) : ConfigurationProperty {
            /**
             * Specifies an array of time ranges to exclude from use when the anomaly detection
             * model is trained and updated.
             *
             * Use this to make sure that events that could cause unusual values for the metric,
             * such as deployments, aren't used when CloudWatch creates or updates the model.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-configuration.html#cfn-cloudwatch-anomalydetector-configuration-excludedtimeranges)
             */
            override fun excludedTimeRanges(): Any? = unwrap(this).getExcludedTimeRanges()

            /**
             * The time zone to use for the metric.
             *
             * This is useful to enable the model to automatically account for daylight savings time
             * changes if the metric is sensitive to such time changes.
             *
             * To specify a time zone, use the name of the time zone as specified in the standard tz
             * database. For more information, see
             * [tz database](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Tz_database)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-configuration.html#cfn-cloudwatch-anomalydetector-configuration-metrictimezone)
             */
            override fun metricTimeZone(): String? = unwrap(this).getMetricTimeZone()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.ConfigurationProperty
            ): ConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ConfigurationProperty
            ): software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.ConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface MetricProperty {
        /**
         * The dimensions for the metric.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metric.html#cfn-cloudwatch-anomalydetector-metric-dimensions)
         */
        public fun dimensions(): Any? = unwrap(this).getDimensions()

        /**
         * The name of the metric.
         *
         * This is a required field.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metric.html#cfn-cloudwatch-anomalydetector-metric-metricname)
         */
        public fun metricName(): String

        /**
         * The namespace of the metric.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metric.html#cfn-cloudwatch-anomalydetector-metric-namespace)
         */
        public fun namespace(): String

        /** A builder for [MetricProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param dimensions The dimensions for the metric. */
            public fun dimensions(dimensions: IResolvable)

            /** @param dimensions The dimensions for the metric. */
            public fun dimensions(dimensions: List<Any>)

            /** @param dimensions The dimensions for the metric. */
            public fun dimensions(vararg dimensions: Any)

            /** @param metricName The name of the metric. This is a required field. */
            public fun metricName(metricName: String)

            /** @param namespace The namespace of the metric. */
            public fun namespace(namespace: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricProperty.Builder =
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricProperty
                    .builder()

            /** @param dimensions The dimensions for the metric. */
            override fun dimensions(dimensions: IResolvable) {
                cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
            }

            /** @param dimensions The dimensions for the metric. */
            override fun dimensions(dimensions: List<Any>) {
                cdkBuilder.dimensions(dimensions)
            }

            /** @param dimensions The dimensions for the metric. */
            override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

            /** @param metricName The name of the metric. This is a required field. */
            override fun metricName(metricName: String) {
                cdkBuilder.metricName(metricName)
            }

            /** @param namespace The namespace of the metric. */
            override fun namespace(namespace: String) {
                cdkBuilder.namespace(namespace)
            }

            public fun build():
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricProperty,
        ) : MetricProperty {
            /**
             * The dimensions for the metric.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metric.html#cfn-cloudwatch-anomalydetector-metric-dimensions)
             */
            override fun dimensions(): Any? = unwrap(this).getDimensions()

            /**
             * The name of the metric.
             *
             * This is a required field.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metric.html#cfn-cloudwatch-anomalydetector-metric-metricname)
             */
            override fun metricName(): String = unwrap(this).getMetricName()

            /**
             * The namespace of the metric.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metric.html#cfn-cloudwatch-anomalydetector-metric-namespace)
             */
            override fun namespace(): String = unwrap(this).getNamespace()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): MetricProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricProperty
            ): MetricProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MetricProperty
            ): software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface RangeProperty {
        /**
         * The end time of the range to exclude.
         *
         * The format is `yyyy-MM-dd'T'HH:mm:ss` . For example, `2019-07-01T23:59:59` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-range.html#cfn-cloudwatch-anomalydetector-range-endtime)
         */
        public fun endTime(): String

        /**
         * The start time of the range to exclude.
         *
         * The format is `yyyy-MM-dd'T'HH:mm:ss` . For example, `2019-07-01T23:59:59` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-range.html#cfn-cloudwatch-anomalydetector-range-starttime)
         */
        public fun startTime(): String

        /** A builder for [RangeProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param endTime The end time of the range to exclude. The format is
             *   `yyyy-MM-dd'T'HH:mm:ss` . For example, `2019-07-01T23:59:59` .
             */
            public fun endTime(endTime: String)

            /**
             * @param startTime The start time of the range to exclude. The format is
             *   `yyyy-MM-dd'T'HH:mm:ss` . For example, `2019-07-01T23:59:59` .
             */
            public fun startTime(startTime: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.RangeProperty.Builder =
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.RangeProperty
                    .builder()

            /**
             * @param endTime The end time of the range to exclude. The format is
             *   `yyyy-MM-dd'T'HH:mm:ss` . For example, `2019-07-01T23:59:59` .
             */
            override fun endTime(endTime: String) {
                cdkBuilder.endTime(endTime)
            }

            /**
             * @param startTime The start time of the range to exclude. The format is
             *   `yyyy-MM-dd'T'HH:mm:ss` . For example, `2019-07-01T23:59:59` .
             */
            override fun startTime(startTime: String) {
                cdkBuilder.startTime(startTime)
            }

            public fun build():
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.RangeProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.RangeProperty,
        ) : RangeProperty {
            /**
             * The end time of the range to exclude.
             *
             * The format is `yyyy-MM-dd'T'HH:mm:ss` . For example, `2019-07-01T23:59:59` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-range.html#cfn-cloudwatch-anomalydetector-range-endtime)
             */
            override fun endTime(): String = unwrap(this).getEndTime()

            /**
             * The start time of the range to exclude.
             *
             * The format is `yyyy-MM-dd'T'HH:mm:ss` . For example, `2019-07-01T23:59:59` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-range.html#cfn-cloudwatch-anomalydetector-range-starttime)
             */
            override fun startTime(): String = unwrap(this).getStartTime()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): RangeProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.RangeProperty
            ): RangeProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: RangeProperty
            ): software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.RangeProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
