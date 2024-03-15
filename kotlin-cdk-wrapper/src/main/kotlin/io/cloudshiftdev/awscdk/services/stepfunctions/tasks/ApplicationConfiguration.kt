@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface ApplicationConfiguration {
  public fun classification(): Classification

  public fun nestedConfig(): List<ApplicationConfiguration> =
      unwrap(this).getNestedConfig()?.map(ApplicationConfiguration::wrap) ?: emptyList()

  public fun properties(): Map<String, String> = unwrap(this).getProperties() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun classification(classification: Classification)

    public fun nestedConfig(nestedConfig: List<ApplicationConfiguration>)

    public fun nestedConfig(vararg nestedConfig: ApplicationConfiguration)

    public fun properties(properties: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration.builder()

    override fun classification(classification: Classification) {
      cdkBuilder.classification(classification.let(Classification::unwrap))
    }

    override fun nestedConfig(nestedConfig: List<ApplicationConfiguration>) {
      cdkBuilder.nestedConfig(nestedConfig.map(ApplicationConfiguration::unwrap))
    }

    override fun nestedConfig(vararg nestedConfig: ApplicationConfiguration): Unit =
        nestedConfig(nestedConfig.toList())

    override fun properties(properties: Map<String, String>) {
      cdkBuilder.properties(properties)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration,
  ) : CdkObject(cdkObject), ApplicationConfiguration {
    override fun classification(): Classification =
        unwrap(this).getClassification().let(Classification::wrap)

    override fun nestedConfig(): List<ApplicationConfiguration> =
        unwrap(this).getNestedConfig()?.map(ApplicationConfiguration::wrap) ?: emptyList()

    override fun properties(): Map<String, String> = unwrap(this).getProperties() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration):
        ApplicationConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationConfiguration):
        software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration
  }
}
