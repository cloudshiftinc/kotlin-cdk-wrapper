@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface BatchJobDependency {
  public fun jobId(): String? = unwrap(this).getJobId()

  public fun type(): String? = unwrap(this).getType()

  @CdkDslMarker
  public interface Builder {
    public fun jobId(jobId: String)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency.builder()

    override fun jobId(jobId: String) {
      cdkBuilder.jobId(jobId)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency,
  ) : CdkObject(cdkObject), BatchJobDependency {
    override fun jobId(): String? = unwrap(this).getJobId()

    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BatchJobDependency {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency):
        BatchJobDependency = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BatchJobDependency):
        software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency
  }
}
