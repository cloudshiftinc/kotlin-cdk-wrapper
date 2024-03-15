@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface SearchComponents {
  public fun dimensions(): List<String>

  public fun metricName(): String

  public fun namespace(): String

  public fun populateFrom(): String

  @CdkDslMarker
  public interface Builder {
    public fun dimensions(dimensions: List<String>)

    public fun dimensions(vararg dimensions: String)

    public fun metricName(metricName: String)

    public fun namespace(namespace: String)

    public fun populateFrom(populateFrom: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.SearchComponents.Builder =
        software.amazon.awscdk.services.cloudwatch.SearchComponents.builder()

    override fun dimensions(dimensions: List<String>) {
      cdkBuilder.dimensions(dimensions)
    }

    override fun dimensions(vararg dimensions: String): Unit = dimensions(dimensions.toList())

    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    override fun populateFrom(populateFrom: String) {
      cdkBuilder.populateFrom(populateFrom)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.SearchComponents =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.SearchComponents,
  ) : CdkObject(cdkObject), SearchComponents {
    override fun dimensions(): List<String> = unwrap(this).getDimensions()

    override fun metricName(): String = unwrap(this).getMetricName()

    override fun namespace(): String = unwrap(this).getNamespace()

    override fun populateFrom(): String = unwrap(this).getPopulateFrom()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SearchComponents {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.SearchComponents):
        SearchComponents = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SearchComponents):
        software.amazon.awscdk.services.cloudwatch.SearchComponents = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.SearchComponents
  }
}
