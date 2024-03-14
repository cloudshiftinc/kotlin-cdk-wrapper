package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import kotlin.String
import kotlin.Unit

public interface BatchJobDependency {
  public fun jobId(): String? = unwrap(this).getJobId()

  public fun type(): String? = unwrap(this).getType()

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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency,
  ) : BatchJobDependency {
    override fun jobId(): String? = unwrap(this).getJobId()

    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BatchJobDependency {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency):
        BatchJobDependency = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BatchJobDependency):
        software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency = (wrapped as
        Wrapper).cdkObject
  }
}
