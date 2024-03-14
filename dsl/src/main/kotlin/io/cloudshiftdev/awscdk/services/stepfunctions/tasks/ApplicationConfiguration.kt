package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface ApplicationConfiguration {
  /**
   * The classification within a configuration.
   *
   * Length Constraints: Minimum length of 1. Maximum length of 1024.
   */
  public fun classification(): Classification

  /**
   * A list of additional configurations to apply within a configuration object.
   *
   * Array Members: Maximum number of 100 items.
   *
   * Default: - No other configurations
   */
  public fun nestedConfig(): List<ApplicationConfiguration> =
      unwrap(this).getNestedConfig()?.map(ApplicationConfiguration::wrap) ?: emptyList()

  /**
   * A set of properties specified within a configuration classification.
   *
   * Map Entries: Maximum number of 100 items.
   *
   * Default: - No properties
   */
  public fun properties(): Map<String, String> = unwrap(this).getProperties() ?: emptyMap()

  /**
   * A builder for [ApplicationConfiguration]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param classification The classification within a configuration. 
     * Length Constraints: Minimum length of 1. Maximum length of 1024.
     */
    public fun classification(classification: Classification)

    /**
     * @param nestedConfig A list of additional configurations to apply within a configuration
     * object.
     * Array Members: Maximum number of 100 items.
     */
    public fun nestedConfig(nestedConfig: List<ApplicationConfiguration>)

    /**
     * @param nestedConfig A list of additional configurations to apply within a configuration
     * object.
     * Array Members: Maximum number of 100 items.
     */
    public fun nestedConfig(vararg nestedConfig: ApplicationConfiguration)

    /**
     * @param properties A set of properties specified within a configuration classification.
     * Map Entries: Maximum number of 100 items.
     */
    public fun properties(properties: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration.builder()

    /**
     * @param classification The classification within a configuration. 
     * Length Constraints: Minimum length of 1. Maximum length of 1024.
     */
    override fun classification(classification: Classification) {
      cdkBuilder.classification(classification.let(Classification::unwrap))
    }

    /**
     * @param nestedConfig A list of additional configurations to apply within a configuration
     * object.
     * Array Members: Maximum number of 100 items.
     */
    override fun nestedConfig(nestedConfig: List<ApplicationConfiguration>) {
      cdkBuilder.nestedConfig(nestedConfig.map(ApplicationConfiguration::unwrap))
    }

    /**
     * @param nestedConfig A list of additional configurations to apply within a configuration
     * object.
     * Array Members: Maximum number of 100 items.
     */
    override fun nestedConfig(vararg nestedConfig: ApplicationConfiguration): Unit =
        nestedConfig(nestedConfig.toList())

    /**
     * @param properties A set of properties specified within a configuration classification.
     * Map Entries: Maximum number of 100 items.
     */
    override fun properties(properties: Map<String, String>) {
      cdkBuilder.properties(properties)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration,
  ) : ApplicationConfiguration {
    /**
     * The classification within a configuration.
     *
     * Length Constraints: Minimum length of 1. Maximum length of 1024.
     */
    override fun classification(): Classification =
        unwrap(this).getClassification().let(Classification::wrap)

    /**
     * A list of additional configurations to apply within a configuration object.
     *
     * Array Members: Maximum number of 100 items.
     *
     * Default: - No other configurations
     */
    override fun nestedConfig(): List<ApplicationConfiguration> =
        unwrap(this).getNestedConfig()?.map(ApplicationConfiguration::wrap) ?: emptyList()

    /**
     * A set of properties specified within a configuration classification.
     *
     * Map Entries: Maximum number of 100 items.
     *
     * Default: - No properties
     */
    override fun properties(): Map<String, String> = unwrap(this).getProperties() ?: emptyMap()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration):
        ApplicationConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationConfiguration):
        software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration = (wrapped as
        Wrapper).cdkObject
  }
}
