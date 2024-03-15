@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface LogQueryWidgetProps {
  public fun height(): Number? = unwrap(this).getHeight()

  public fun logGroupNames(): List<String>

  public fun queryLines(): List<String> = unwrap(this).getQueryLines() ?: emptyList()

  public fun queryString(): String? = unwrap(this).getQueryString()

  public fun region(): String? = unwrap(this).getRegion()

  public fun title(): String? = unwrap(this).getTitle()

  public fun view(): LogQueryVisualizationType? =
      unwrap(this).getView()?.let(LogQueryVisualizationType::wrap)

  public fun width(): Number? = unwrap(this).getWidth()

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
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.LogQueryWidgetProps.Builder =
        software.amazon.awscdk.services.cloudwatch.LogQueryWidgetProps.builder()

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

    public fun build(): software.amazon.awscdk.services.cloudwatch.LogQueryWidgetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.LogQueryWidgetProps,
  ) : CdkObject(cdkObject), LogQueryWidgetProps {
    override fun height(): Number? = unwrap(this).getHeight()

    override fun logGroupNames(): List<String> = unwrap(this).getLogGroupNames()

    override fun queryLines(): List<String> = unwrap(this).getQueryLines() ?: emptyList()

    override fun queryString(): String? = unwrap(this).getQueryString()

    override fun region(): String? = unwrap(this).getRegion()

    override fun title(): String? = unwrap(this).getTitle()

    override fun view(): LogQueryVisualizationType? =
        unwrap(this).getView()?.let(LogQueryVisualizationType::wrap)

    override fun width(): Number? = unwrap(this).getWidth()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LogQueryWidgetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.LogQueryWidgetProps):
        LogQueryWidgetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogQueryWidgetProps):
        software.amazon.awscdk.services.cloudwatch.LogQueryWidgetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.LogQueryWidgetProps
  }
}
