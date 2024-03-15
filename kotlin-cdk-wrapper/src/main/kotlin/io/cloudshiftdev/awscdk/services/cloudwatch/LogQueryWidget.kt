@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class LogQueryWidget internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.LogQueryWidget,
) : ConcreteWidget(cdkObject) {
  public override fun toJson(): List<Any> = unwrap(this).toJson()

  @CdkDslMarker
  public interface Builder {
    public fun height(height: Number)

    public fun logGroupNames(logGroupNames: List<String>)

    public fun logGroupNames(vararg logGroupNames: String)

    public fun queryLines(queryLines: List<String>)

    public fun queryLines(vararg queryLines: String)

    public fun queryString(queryString: String)

    public fun region(region: String)

    public fun title(title: String)

    public fun view(view: LogQueryVisualizationType)

    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.LogQueryWidget.Builder =
        software.amazon.awscdk.services.cloudwatch.LogQueryWidget.Builder.create()

    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    override fun logGroupNames(logGroupNames: List<String>) {
      cdkBuilder.logGroupNames(logGroupNames)
    }

    override fun logGroupNames(vararg logGroupNames: String): Unit =
        logGroupNames(logGroupNames.toList())

    override fun queryLines(queryLines: List<String>) {
      cdkBuilder.queryLines(queryLines)
    }

    override fun queryLines(vararg queryLines: String): Unit = queryLines(queryLines.toList())

    override fun queryString(queryString: String) {
      cdkBuilder.queryString(queryString)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    override fun view(view: LogQueryVisualizationType) {
      cdkBuilder.view(view.let(LogQueryVisualizationType::unwrap))
    }

    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.LogQueryWidget =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LogQueryWidget {
      val builderImpl = BuilderImpl()
      return LogQueryWidget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.LogQueryWidget):
        LogQueryWidget = LogQueryWidget(cdkObject)

    internal fun unwrap(wrapped: LogQueryWidget):
        software.amazon.awscdk.services.cloudwatch.LogQueryWidget = wrapped.cdkObject
  }
}
