package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.constructs.IDependable
import kotlin.Boolean
import kotlin.Unit

public interface AddToPrincipalPolicyResult {
  public fun policyDependable(): IDependable? =
      unwrap(this).getPolicyDependable()?.let(IDependable::wrap)

  public fun statementAdded(): Boolean

  public interface Builder {
    public fun policyDependable(policyDependable: IDependable)

    public fun statementAdded(statementAdded: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult.Builder =
        software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult.builder()

    override fun policyDependable(policyDependable: IDependable) {
      cdkBuilder.policyDependable(policyDependable.let(IDependable::unwrap))
    }

    override fun statementAdded(statementAdded: Boolean) {
      cdkBuilder.statementAdded(statementAdded)
    }

    public fun build(): software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult,
  ) : AddToPrincipalPolicyResult {
    override fun policyDependable(): IDependable? =
        unwrap(this).getPolicyDependable()?.let(IDependable::wrap)

    override fun statementAdded(): Boolean = unwrap(this).getStatementAdded()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AddToPrincipalPolicyResult {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult):
        AddToPrincipalPolicyResult = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddToPrincipalPolicyResult):
        software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult = (wrapped as
        Wrapper).cdkObject
  }
}
