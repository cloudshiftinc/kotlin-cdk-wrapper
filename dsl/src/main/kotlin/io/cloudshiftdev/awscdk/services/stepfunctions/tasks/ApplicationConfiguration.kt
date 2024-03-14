package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface ApplicationConfiguration {
  public fun classification(): Classification

  public fun nestedConfig(): List<ApplicationConfiguration> =
      unwrap(this).getNestedConfig()?.map(ApplicationConfiguration::wrap) ?: emptyList()

  public fun properties(): Map<String, String> = unwrap(this).getProperties() ?: emptyMap()

  public interface Builder {
    public fun classification(classification: Classification) {
    }

    public fun nestedConfig(nestedConfig: List<ApplicationConfiguration>) {
    }

    public fun properties(properties: Map<String, String>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration.builder()

    public override fun classification(classification: Classification) {
      cdkBuilder.classification(classification.let(Classification::unwrap))
    }

    public override fun nestedConfig(nestedConfig: List<ApplicationConfiguration>) {
      cdkBuilder.nestedConfig(nestedConfig.map(ApplicationConfiguration::unwrap))
    }

    public override fun properties(properties: Map<String, String>) {
      cdkBuilder.properties(properties)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration,
  ) : ApplicationConfiguration {
    public override fun classification(): Classification =
        unwrap(this).getClassification().let(Classification::wrap)

    public override fun nestedConfig(): List<ApplicationConfiguration> =
        unwrap(this).getNestedConfig()?.map(ApplicationConfiguration::wrap) ?: emptyList()

    public override fun properties(): Map<String, String> = unwrap(this).getProperties() ?:
        emptyMap()
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
