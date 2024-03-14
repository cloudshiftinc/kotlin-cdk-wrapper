package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMetricFilter internal constructor(
  private val cdkObject: software.amazon.awscdk.services.logs.CfnMetricFilter,
) : CfnResource(cdkObject), IInspectable {
  public open fun filterName(): String? = unwrap(this).getFilterName()

  public open fun filterName(`value`: String) {
    unwrap(this).setFilterName(`value`)
  }

  public open fun filterPattern(): String = unwrap(this).getFilterPattern()

  public open fun filterPattern(`value`: String) {
    unwrap(this).setFilterPattern(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun logGroupName(): String = unwrap(this).getLogGroupName()

  public open fun logGroupName(`value`: String) {
    unwrap(this).setLogGroupName(`value`)
  }

  public open fun metricTransformations(): Any = unwrap(this).getMetricTransformations()

  public open fun metricTransformations(`value`: IResolvable) {
    unwrap(this).setMetricTransformations(`value`.let(IResolvable::unwrap))
  }

  public open fun metricTransformations(__idx_ac66f0: List<Any>) {
    unwrap(this).setMetricTransformations(__idx_ac66f0)
  }

  public open fun metricTransformations(vararg __idx_ac66f0: Any): Unit =
      metricTransformations(__idx_ac66f0.toList())

  public interface Builder {
    public fun filterName(filterName: String)

    public fun filterPattern(filterPattern: String)

    public fun logGroupName(logGroupName: String)

    public fun metricTransformations(metricTransformations: IResolvable)

    public fun metricTransformations(metricTransformations: List<Any>)

    public fun metricTransformations(vararg metricTransformations: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnMetricFilter.Builder =
        software.amazon.awscdk.services.logs.CfnMetricFilter.Builder.create(scope, id)

    override fun filterName(filterName: String) {
      cdkBuilder.filterName(filterName)
    }

    override fun filterPattern(filterPattern: String) {
      cdkBuilder.filterPattern(filterPattern)
    }

    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    override fun metricTransformations(metricTransformations: IResolvable) {
      cdkBuilder.metricTransformations(metricTransformations.let(IResolvable::unwrap))
    }

    override fun metricTransformations(metricTransformations: List<Any>) {
      cdkBuilder.metricTransformations(metricTransformations)
    }

    override fun metricTransformations(vararg metricTransformations: Any): Unit =
        metricTransformations(metricTransformations.toList())

    public fun build(): software.amazon.awscdk.services.logs.CfnMetricFilter = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMetricFilter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMetricFilter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnMetricFilter):
        CfnMetricFilter = CfnMetricFilter(cdkObject)

    internal fun unwrap(wrapped: CfnMetricFilter):
        software.amazon.awscdk.services.logs.CfnMetricFilter = wrapped.cdkObject
  }

  public interface DimensionProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnMetricFilter.DimensionProperty.Builder =
          software.amazon.awscdk.services.logs.CfnMetricFilter.DimensionProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.logs.CfnMetricFilter.DimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.logs.CfnMetricFilter.DimensionProperty,
    ) : DimensionProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnMetricFilter.DimensionProperty):
          DimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DimensionProperty):
          software.amazon.awscdk.services.logs.CfnMetricFilter.DimensionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MetricTransformationProperty {
    public fun defaultValue(): Number? = unwrap(this).getDefaultValue()

    public fun dimensions(): Any? = unwrap(this).getDimensions()

    public fun metricName(): String

    public fun metricNamespace(): String

    public fun metricValue(): String

    public fun unit(): String? = unwrap(this).getUnit()

    public interface Builder {
      public fun defaultValue(defaultValue: Number)

      public fun dimensions(dimensions: IResolvable)

      public fun dimensions(dimensions: List<Any>)

      public fun dimensions(vararg dimensions: Any)

      public fun metricName(metricName: String)

      public fun metricNamespace(metricNamespace: String)

      public fun metricValue(metricValue: String)

      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty.Builder
          =
          software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty.builder()

      override fun defaultValue(defaultValue: Number) {
        cdkBuilder.defaultValue(defaultValue)
      }

      override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
      }

      override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions)
      }

      override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      override fun metricNamespace(metricNamespace: String) {
        cdkBuilder.metricNamespace(metricNamespace)
      }

      override fun metricValue(metricValue: String) {
        cdkBuilder.metricValue(metricValue)
      }

      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty,
    ) : MetricTransformationProperty {
      override fun defaultValue(): Number? = unwrap(this).getDefaultValue()

      override fun dimensions(): Any? = unwrap(this).getDimensions()

      override fun metricName(): String = unwrap(this).getMetricName()

      override fun metricNamespace(): String = unwrap(this).getMetricNamespace()

      override fun metricValue(): String = unwrap(this).getMetricValue()

      override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricTransformationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty):
          MetricTransformationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricTransformationProperty):
          software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
