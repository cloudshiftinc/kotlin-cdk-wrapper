@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class AlarmWidget internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmWidget,
) : ConcreteWidget(cdkObject) {
  public override fun toJson(): List<Any> = unwrap(this).toJson()

  @CdkDslMarker
  public interface Builder {
    public fun alarm(alarm: IAlarm)

    public fun height(height: Number)

    public fun leftYAxis(leftYAxis: YAxisProps)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e98dee4b45e28568feace8dfc1b6eb50ad70495704ca102671a28ff9294f9b6")
    public fun leftYAxis(leftYAxis: YAxisProps.Builder.() -> Unit)

    public fun region(region: String)

    public fun title(title: String)

    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.AlarmWidget.Builder =
        software.amazon.awscdk.services.cloudwatch.AlarmWidget.Builder.create()

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
    @JvmName("3e98dee4b45e28568feace8dfc1b6eb50ad70495704ca102671a28ff9294f9b6")
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

    public fun build(): software.amazon.awscdk.services.cloudwatch.AlarmWidget = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AlarmWidget {
      val builderImpl = BuilderImpl()
      return AlarmWidget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmWidget):
        AlarmWidget = AlarmWidget(cdkObject)

    internal fun unwrap(wrapped: AlarmWidget):
        software.amazon.awscdk.services.cloudwatch.AlarmWidget = wrapped.cdkObject
  }
}
