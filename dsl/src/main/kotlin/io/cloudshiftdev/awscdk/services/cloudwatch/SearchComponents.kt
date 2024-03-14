package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface SearchComponents {
  /**
   * The list of dimensions to be used in the search expression.
   */
  public fun dimensions(): List<String>

  /**
   * The metric name to be used in the search expression.
   */
  public fun metricName(): String

  /**
   * The namespace to be used in the search expression.
   */
  public fun namespace(): String

  /**
   * The dimension name, that the search expression retrieves, whose values will be used to populate
   * the values to choose from.
   */
  public fun populateFrom(): String

  /**
   * A builder for [SearchComponents]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dimensions The list of dimensions to be used in the search expression. 
     */
    public fun dimensions(dimensions: List<String>)

    /**
     * @param dimensions The list of dimensions to be used in the search expression. 
     */
    public fun dimensions(vararg dimensions: String)

    /**
     * @param metricName The metric name to be used in the search expression. 
     */
    public fun metricName(metricName: String)

    /**
     * @param namespace The namespace to be used in the search expression. 
     */
    public fun namespace(namespace: String)

    /**
     * @param populateFrom The dimension name, that the search expression retrieves, whose values
     * will be used to populate the values to choose from. 
     */
    public fun populateFrom(populateFrom: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.SearchComponents.Builder =
        software.amazon.awscdk.services.cloudwatch.SearchComponents.builder()

    /**
     * @param dimensions The list of dimensions to be used in the search expression. 
     */
    override fun dimensions(dimensions: List<String>) {
      cdkBuilder.dimensions(dimensions)
    }

    /**
     * @param dimensions The list of dimensions to be used in the search expression. 
     */
    override fun dimensions(vararg dimensions: String): Unit = dimensions(dimensions.toList())

    /**
     * @param metricName The metric name to be used in the search expression. 
     */
    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    /**
     * @param namespace The namespace to be used in the search expression. 
     */
    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    /**
     * @param populateFrom The dimension name, that the search expression retrieves, whose values
     * will be used to populate the values to choose from. 
     */
    override fun populateFrom(populateFrom: String) {
      cdkBuilder.populateFrom(populateFrom)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.SearchComponents =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.SearchComponents,
  ) : CdkObject(cdkObject), SearchComponents {
    /**
     * The list of dimensions to be used in the search expression.
     */
    override fun dimensions(): List<String> = unwrap(this).getDimensions()

    /**
     * The metric name to be used in the search expression.
     */
    override fun metricName(): String = unwrap(this).getMetricName()

    /**
     * The namespace to be used in the search expression.
     */
    override fun namespace(): String = unwrap(this).getNamespace()

    /**
     * The dimension name, that the search expression retrieves, whose values will be used to
     * populate the values to choose from.
     */
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
