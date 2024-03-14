package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.List

public interface IItemReader {
  public fun bucket(): IBucket

  public fun maxItems(): Number? = unwrap(this).getMaxItems()

  public fun providePolicyStatements(): List<PolicyStatement>

  public fun render(): Any

  public fun resource(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.IItemReader,
  ) : IItemReader {
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    override fun maxItems(): Number? = unwrap(this).getMaxItems()

    override fun providePolicyStatements(): List<PolicyStatement> =
        unwrap(this).providePolicyStatements().map(PolicyStatement::wrap)

    override fun render(): Any = unwrap(this).render()

    override fun resource(): String = unwrap(this).getResource()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.IItemReader):
        IItemReader = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IItemReader):
        software.amazon.awscdk.services.stepfunctions.IItemReader = (wrapped as Wrapper).cdkObject
  }
}
