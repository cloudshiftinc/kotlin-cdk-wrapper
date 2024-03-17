@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * An object representing an AWS Batch job dependency.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * BatchJobDependency batchJobDependency = BatchJobDependency.builder()
 * .jobId("jobId")
 * .type("type")
 * .build();
 * ```
 */
public interface BatchJobDependency {
  /**
   * The job ID of the AWS Batch job associated with this dependency.
   *
   * Default: - No jobId
   */
  public fun jobId(): String? = unwrap(this).getJobId()

  /**
   * The type of the job dependency.
   *
   * Default: - No type
   */
  public fun type(): String? = unwrap(this).getType()

  /**
   * A builder for [BatchJobDependency]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param jobId The job ID of the AWS Batch job associated with this dependency.
     */
    public fun jobId(jobId: String)

    /**
     * @param type The type of the job dependency.
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency.builder()

    /**
     * @param jobId The job ID of the AWS Batch job associated with this dependency.
     */
    override fun jobId(jobId: String) {
      cdkBuilder.jobId(jobId)
    }

    /**
     * @param type The type of the job dependency.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency,
  ) : CdkObject(cdkObject), BatchJobDependency {
    /**
     * The job ID of the AWS Batch job associated with this dependency.
     *
     * Default: - No jobId
     */
    override fun jobId(): String? = unwrap(this).getJobId()

    /**
     * The type of the job dependency.
     *
     * Default: - No type
     */
    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BatchJobDependency {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency):
        BatchJobDependency = CdkObjectWrappers.wrap(cdkObject) as? BatchJobDependency ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BatchJobDependency):
        software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency
  }
}
