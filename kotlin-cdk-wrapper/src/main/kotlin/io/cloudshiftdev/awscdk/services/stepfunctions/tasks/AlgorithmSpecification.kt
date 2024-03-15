@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface AlgorithmSpecification {
  public fun algorithmName(): String? = unwrap(this).getAlgorithmName()

  public fun metricDefinitions(): List<MetricDefinition> =
      unwrap(this).getMetricDefinitions()?.map(MetricDefinition::wrap) ?: emptyList()

  public fun trainingImage(): DockerImage? = unwrap(this).getTrainingImage()?.let(DockerImage::wrap)

  public fun trainingInputMode(): InputMode? =
      unwrap(this).getTrainingInputMode()?.let(InputMode::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun algorithmName(algorithmName: String)

    public fun metricDefinitions(metricDefinitions: List<MetricDefinition>)

    public fun metricDefinitions(vararg metricDefinitions: MetricDefinition)

    public fun trainingImage(trainingImage: DockerImage)

    public fun trainingInputMode(trainingInputMode: InputMode)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.AlgorithmSpecification.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.AlgorithmSpecification.builder()

    override fun algorithmName(algorithmName: String) {
      cdkBuilder.algorithmName(algorithmName)
    }

    override fun metricDefinitions(metricDefinitions: List<MetricDefinition>) {
      cdkBuilder.metricDefinitions(metricDefinitions.map(MetricDefinition::unwrap))
    }

    override fun metricDefinitions(vararg metricDefinitions: MetricDefinition): Unit =
        metricDefinitions(metricDefinitions.toList())

    override fun trainingImage(trainingImage: DockerImage) {
      cdkBuilder.trainingImage(trainingImage.let(DockerImage::unwrap))
    }

    override fun trainingInputMode(trainingInputMode: InputMode) {
      cdkBuilder.trainingInputMode(trainingInputMode.let(InputMode::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.AlgorithmSpecification =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.AlgorithmSpecification,
  ) : CdkObject(cdkObject), AlgorithmSpecification {
    override fun algorithmName(): String? = unwrap(this).getAlgorithmName()

    override fun metricDefinitions(): List<MetricDefinition> =
        unwrap(this).getMetricDefinitions()?.map(MetricDefinition::wrap) ?: emptyList()

    override fun trainingImage(): DockerImage? =
        unwrap(this).getTrainingImage()?.let(DockerImage::wrap)

    override fun trainingInputMode(): InputMode? =
        unwrap(this).getTrainingInputMode()?.let(InputMode::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AlgorithmSpecification {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.AlgorithmSpecification):
        AlgorithmSpecification = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AlgorithmSpecification):
        software.amazon.awscdk.services.stepfunctions.tasks.AlgorithmSpecification = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.AlgorithmSpecification
  }
}
