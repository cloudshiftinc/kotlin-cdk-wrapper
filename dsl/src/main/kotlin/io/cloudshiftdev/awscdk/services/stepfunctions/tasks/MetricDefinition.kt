package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface MetricDefinition {
  /**
   * Name of the metric.
   */
  public fun name(): String

  /**
   * Regular expression that searches the output of a training job and gets the value of the metric.
   */
  public fun regex(): String

  /**
   * A builder for [MetricDefinition]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name Name of the metric. 
     */
    public fun name(name: String)

    /**
     * @param regex Regular expression that searches the output of a training job and gets the value
     * of the metric. 
     */
    public fun regex(regex: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.MetricDefinition.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.MetricDefinition.builder()

    /**
     * @param name Name of the metric. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param regex Regular expression that searches the output of a training job and gets the value
     * of the metric. 
     */
    override fun regex(regex: String) {
      cdkBuilder.regex(regex)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.MetricDefinition =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.MetricDefinition,
  ) : MetricDefinition {
    /**
     * Name of the metric.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Regular expression that searches the output of a training job and gets the value of the
     * metric.
     */
    override fun regex(): String = unwrap(this).getRegex()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): MetricDefinition {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.MetricDefinition):
        MetricDefinition = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MetricDefinition):
        software.amazon.awscdk.services.stepfunctions.tasks.MetricDefinition = (wrapped as
        Wrapper).cdkObject
  }
}
