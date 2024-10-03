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
 * JobDependency jobDependency = JobDependency.builder()
 * .jobId("jobId")
 * .type("type")
 * .build();
 * ```
 */
public interface JobDependency {
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
   * A builder for [JobDependency]
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
        software.amazon.awscdk.services.stepfunctions.tasks.JobDependency.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.JobDependency.builder()

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

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.JobDependency =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.JobDependency,
  ) : CdkObject(cdkObject),
      JobDependency {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): JobDependency {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.JobDependency):
        JobDependency = CdkObjectWrappers.wrap(cdkObject) as? JobDependency ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: JobDependency):
        software.amazon.awscdk.services.stepfunctions.tasks.JobDependency = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.JobDependency
  }
}
