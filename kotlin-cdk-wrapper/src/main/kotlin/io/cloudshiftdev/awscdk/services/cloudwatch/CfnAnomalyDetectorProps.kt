@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnAnomalyDetectorProps {
  public fun configuration(): Any? = unwrap(this).getConfiguration()

  public fun dimensions(): Any? = unwrap(this).getDimensions()

  public fun metricMathAnomalyDetector(): Any? = unwrap(this).getMetricMathAnomalyDetector()

  public fun metricName(): String? = unwrap(this).getMetricName()

  public fun namespace(): String? = unwrap(this).getNamespace()

  public fun singleMetricAnomalyDetector(): Any? = unwrap(this).getSingleMetricAnomalyDetector()

  public fun stat(): String? = unwrap(this).getStat()

  @CdkDslMarker
  public interface Builder {
    public fun configuration(configuration: IResolvable)

    public fun configuration(configuration: CfnAnomalyDetector.ConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25bd114a6c7a4667628132574afbbca7299c476555f34520512679937557f2bc")
    public
        fun configuration(configuration: CfnAnomalyDetector.ConfigurationProperty.Builder.() -> Unit)

    public fun dimensions(dimensions: IResolvable)

    public fun dimensions(dimensions: List<Any>)

    public fun dimensions(vararg dimensions: Any)

    public fun metricMathAnomalyDetector(metricMathAnomalyDetector: IResolvable)

    public
        fun metricMathAnomalyDetector(metricMathAnomalyDetector: CfnAnomalyDetector.MetricMathAnomalyDetectorProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("615efef0f72ead6c8c61bebef40805d2487f946d1642d75dea42d5839efa1002")
    public
        fun metricMathAnomalyDetector(metricMathAnomalyDetector: CfnAnomalyDetector.MetricMathAnomalyDetectorProperty.Builder.() -> Unit)

    public fun metricName(metricName: String)

    public fun namespace(namespace: String)

    public fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: IResolvable)

    public
        fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f1ed043ff6d65d69068d05a416a85fff02a77d84ac3944ec2e1c58b9a617491a")
    public
        fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty.Builder.() -> Unit)

    public fun stat(stat: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps.Builder =
        software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps.builder()

    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    override fun configuration(configuration: CfnAnomalyDetector.ConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(CfnAnomalyDetector.ConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25bd114a6c7a4667628132574afbbca7299c476555f34520512679937557f2bc")
    override
        fun configuration(configuration: CfnAnomalyDetector.ConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(CfnAnomalyDetector.ConfigurationProperty(configuration))

    override fun dimensions(dimensions: IResolvable) {
      cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
    }

    override fun dimensions(dimensions: List<Any>) {
      cdkBuilder.dimensions(dimensions)
    }

    override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

    override fun metricMathAnomalyDetector(metricMathAnomalyDetector: IResolvable) {
      cdkBuilder.metricMathAnomalyDetector(metricMathAnomalyDetector.let(IResolvable::unwrap))
    }

    override
        fun metricMathAnomalyDetector(metricMathAnomalyDetector: CfnAnomalyDetector.MetricMathAnomalyDetectorProperty) {
      cdkBuilder.metricMathAnomalyDetector(metricMathAnomalyDetector.let(CfnAnomalyDetector.MetricMathAnomalyDetectorProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("615efef0f72ead6c8c61bebef40805d2487f946d1642d75dea42d5839efa1002")
    override
        fun metricMathAnomalyDetector(metricMathAnomalyDetector: CfnAnomalyDetector.MetricMathAnomalyDetectorProperty.Builder.() -> Unit):
        Unit =
        metricMathAnomalyDetector(CfnAnomalyDetector.MetricMathAnomalyDetectorProperty(metricMathAnomalyDetector))

    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    override fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: IResolvable) {
      cdkBuilder.singleMetricAnomalyDetector(singleMetricAnomalyDetector.let(IResolvable::unwrap))
    }

    override
        fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty) {
      cdkBuilder.singleMetricAnomalyDetector(singleMetricAnomalyDetector.let(CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f1ed043ff6d65d69068d05a416a85fff02a77d84ac3944ec2e1c58b9a617491a")
    override
        fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty.Builder.() -> Unit):
        Unit =
        singleMetricAnomalyDetector(CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty(singleMetricAnomalyDetector))

    override fun stat(stat: String) {
      cdkBuilder.stat(stat)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps,
  ) : CdkObject(cdkObject), CfnAnomalyDetectorProps {
    override fun configuration(): Any? = unwrap(this).getConfiguration()

    override fun dimensions(): Any? = unwrap(this).getDimensions()

    override fun metricMathAnomalyDetector(): Any? = unwrap(this).getMetricMathAnomalyDetector()

    override fun metricName(): String? = unwrap(this).getMetricName()

    override fun namespace(): String? = unwrap(this).getNamespace()

    override fun singleMetricAnomalyDetector(): Any? = unwrap(this).getSingleMetricAnomalyDetector()

    override fun stat(): String? = unwrap(this).getStat()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAnomalyDetectorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps):
        CfnAnomalyDetectorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAnomalyDetectorProps):
        software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps
  }
}
