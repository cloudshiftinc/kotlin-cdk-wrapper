@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface AlarmWidgetProps : MetricWidgetProps {
  public fun alarm(): IAlarm

  public fun leftYAxis(): YAxisProps? = unwrap(this).getLeftYAxis()?.let(YAxisProps::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun alarm(alarm: IAlarm)

    public fun height(height: Number)

    public fun leftYAxis(leftYAxis: YAxisProps)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("359cbd81f29574533cf491d58375db2c4dc8e5b3501ac0ad881d5dbe4f435993")
    public fun leftYAxis(leftYAxis: YAxisProps.Builder.() -> Unit)

    public fun region(region: String)

    public fun title(title: String)

    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps.Builder =
        software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps.builder()

    override fun alarm(alarm: IAlarm) {
      cdkBuilder.alarm(alarm.let(IAlarm::unwrap))
    }

    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    override fun leftYAxis(leftYAxis: YAxisProps) {
      cdkBuilder.leftYAxis(leftYAxis.let(YAxisProps::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("359cbd81f29574533cf491d58375db2c4dc8e5b3501ac0ad881d5dbe4f435993")
    override fun leftYAxis(leftYAxis: YAxisProps.Builder.() -> Unit): Unit =
        leftYAxis(YAxisProps(leftYAxis))

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps,
  ) : CdkObject(cdkObject), AlarmWidgetProps {
    override fun alarm(): IAlarm = unwrap(this).getAlarm().let(IAlarm::wrap)

    override fun height(): Number? = unwrap(this).getHeight()

    override fun leftYAxis(): YAxisProps? = unwrap(this).getLeftYAxis()?.let(YAxisProps::wrap)

    override fun region(): String? = unwrap(this).getRegion()

    override fun title(): String? = unwrap(this).getTitle()

    override fun width(): Number? = unwrap(this).getWidth()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AlarmWidgetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps):
        AlarmWidgetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AlarmWidgetProps):
        software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps
  }
}
