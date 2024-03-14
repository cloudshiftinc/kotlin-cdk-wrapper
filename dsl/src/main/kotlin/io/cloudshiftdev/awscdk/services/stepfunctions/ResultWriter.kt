package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class ResultWriter internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.ResultWriter,
) {
  public open fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

  public open fun prefix(): String? = unwrap(this).getPrefix()

  public open fun providePolicyStatements(): List<PolicyStatement> =
      unwrap(this).providePolicyStatements().map(PolicyStatement::wrap)

  public open fun render(): Any = unwrap(this).render()

  public interface Builder {
    public fun bucket(bucket: IBucket) {
    }

    public fun prefix(prefix: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.ResultWriter.Builder =
        software.amazon.awscdk.services.stepfunctions.ResultWriter.Builder.create()

    public override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    public override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.ResultWriter =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ResultWriter {
      val builderImpl = BuilderImpl()
      return ResultWriter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ResultWriter):
        ResultWriter = ResultWriter(cdkObject)

    internal fun unwrap(wrapped: ResultWriter):
        software.amazon.awscdk.services.stepfunctions.ResultWriter = wrapped.cdkObject
  }
}
