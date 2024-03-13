package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.constructs.IDependable
import kotlin.Boolean
import kotlin.Unit

public interface AddToResourcePolicyResult {
  public fun policyDependable(): IDependable? =
      unwrap(this).getPolicyDependable()?.let(IDependable::wrap)

  public fun statementAdded(): Boolean

  public interface Builder {
    public fun policyDependable(policyDependable: IDependable) {
    }

    public fun statementAdded(statementAdded: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.AddToResourcePolicyResult.Builder =
        software.amazon.awscdk.services.iam.AddToResourcePolicyResult.builder()

    public override fun policyDependable(policyDependable: IDependable) {
      cdkBuilder.policyDependable(policyDependable.let(IDependable::unwrap))
    }

    public override fun statementAdded(statementAdded: Boolean) {
      cdkBuilder.statementAdded(statementAdded)
    }

    public fun build(): software.amazon.awscdk.services.iam.AddToResourcePolicyResult =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.iam.AddToResourcePolicyResult,
  ) : AddToResourcePolicyResult {
    public override fun policyDependable(): IDependable? =
        unwrap(this).getPolicyDependable()?.let(IDependable::wrap)

    public override fun statementAdded(): Boolean = unwrap(this).getStatementAdded()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AddToResourcePolicyResult {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.AddToResourcePolicyResult):
        AddToResourcePolicyResult = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddToResourcePolicyResult):
        software.amazon.awscdk.services.iam.AddToResourcePolicyResult = (wrapped as
        Wrapper).cdkObject
  }
}
