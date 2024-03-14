package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import kotlin.String
import kotlin.Unit

public interface SparkSubmitJobDriver {
  /**
   * The entry point of job application.
   *
   * Length Constraints: Minimum length of 1. Maximum length of 256.
   */
  public fun entryPoint(): TaskInput

  /**
   * The arguments for a job application in a task input object containing an array of strings.
   *
   * Length Constraints: Minimum length of 1. Maximum length of 10280.
   *
   * Default: - No arguments defined
   */
  public fun entryPointArguments(): TaskInput? =
      unwrap(this).getEntryPointArguments()?.let(TaskInput::wrap)

  /**
   * The Spark submit parameters that are used for job runs.
   *
   * Length Constraints: Minimum length of 1. Maximum length of 102400.
   *
   * Default: - No spark submit parameters
   */
  public fun sparkSubmitParameters(): String? = unwrap(this).getSparkSubmitParameters()

  /**
   * A builder for [SparkSubmitJobDriver]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param entryPoint The entry point of job application. 
     * Length Constraints: Minimum length of 1. Maximum length of 256.
     */
    public fun entryPoint(entryPoint: TaskInput)

    /**
     * @param entryPointArguments The arguments for a job application in a task input object
     * containing an array of strings.
     * Length Constraints: Minimum length of 1. Maximum length of 10280.
     */
    public fun entryPointArguments(entryPointArguments: TaskInput)

    /**
     * @param sparkSubmitParameters The Spark submit parameters that are used for job runs.
     * Length Constraints: Minimum length of 1. Maximum length of 102400.
     */
    public fun sparkSubmitParameters(sparkSubmitParameters: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver.builder()

    /**
     * @param entryPoint The entry point of job application. 
     * Length Constraints: Minimum length of 1. Maximum length of 256.
     */
    override fun entryPoint(entryPoint: TaskInput) {
      cdkBuilder.entryPoint(entryPoint.let(TaskInput::unwrap))
    }

    /**
     * @param entryPointArguments The arguments for a job application in a task input object
     * containing an array of strings.
     * Length Constraints: Minimum length of 1. Maximum length of 10280.
     */
    override fun entryPointArguments(entryPointArguments: TaskInput) {
      cdkBuilder.entryPointArguments(entryPointArguments.let(TaskInput::unwrap))
    }

    /**
     * @param sparkSubmitParameters The Spark submit parameters that are used for job runs.
     * Length Constraints: Minimum length of 1. Maximum length of 102400.
     */
    override fun sparkSubmitParameters(sparkSubmitParameters: String) {
      cdkBuilder.sparkSubmitParameters(sparkSubmitParameters)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver,
  ) : CdkObject(cdkObject), SparkSubmitJobDriver {
    /**
     * The entry point of job application.
     *
     * Length Constraints: Minimum length of 1. Maximum length of 256.
     */
    override fun entryPoint(): TaskInput = unwrap(this).getEntryPoint().let(TaskInput::wrap)

    /**
     * The arguments for a job application in a task input object containing an array of strings.
     *
     * Length Constraints: Minimum length of 1. Maximum length of 10280.
     *
     * Default: - No arguments defined
     */
    override fun entryPointArguments(): TaskInput? =
        unwrap(this).getEntryPointArguments()?.let(TaskInput::wrap)

    /**
     * The Spark submit parameters that are used for job runs.
     *
     * Length Constraints: Minimum length of 1. Maximum length of 102400.
     *
     * Default: - No spark submit parameters
     */
    override fun sparkSubmitParameters(): String? = unwrap(this).getSparkSubmitParameters()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SparkSubmitJobDriver {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver):
        SparkSubmitJobDriver = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SparkSubmitJobDriver):
        software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver
  }
}
