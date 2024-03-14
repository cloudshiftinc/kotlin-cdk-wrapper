package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.IResolveContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class PolicyDocument internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.PolicyDocument,
) : IResolvable {
  public open fun addStatements(statement: PolicyStatement) {
    unwrap(this).addStatements(statement.let(PolicyStatement::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("98fe20c8550beea0e99a87c49e8839386e2715f38099686c4beb06cab4f71d9d")
  public open fun addStatements(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addStatements(PolicyStatement(statement))

  public override fun creationStack(): List<String> = unwrap(this).getCreationStack()

  public open fun isEmpty(): Boolean = unwrap(this).getIsEmpty()

  public override fun resolve(context: IResolveContext): Any =
      unwrap(this).resolve(context.let(IResolveContext::unwrap))

  public open fun statementCount(): Number = unwrap(this).getStatementCount()

  public open fun toJson(): Any = unwrap(this).toJSON()

  public open fun validateForAnyPolicy(): List<String> = unwrap(this).validateForAnyPolicy()

  public open fun validateForIdentityPolicy(): List<String> =
      unwrap(this).validateForIdentityPolicy()

  public open fun validateForResourcePolicy(): List<String> =
      unwrap(this).validateForResourcePolicy()

  public interface Builder {
    public fun assignSids(assignSids: Boolean)

    public fun minimize(minimize: Boolean)

    public fun statements(statements: List<PolicyStatement>)

    public fun statements(vararg statements: PolicyStatement)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.PolicyDocument.Builder =
        software.amazon.awscdk.services.iam.PolicyDocument.Builder.create()

    override fun assignSids(assignSids: Boolean) {
      cdkBuilder.assignSids(assignSids)
    }

    override fun minimize(minimize: Boolean) {
      cdkBuilder.minimize(minimize)
    }

    override fun statements(statements: List<PolicyStatement>) {
      cdkBuilder.statements(statements.map(PolicyStatement::unwrap))
    }

    override fun statements(vararg statements: PolicyStatement): Unit =
        statements(statements.toList())

    public fun build(): software.amazon.awscdk.services.iam.PolicyDocument = cdkBuilder.build()
  }

  public companion object {
    public open fun fromJson(obj: Any): PolicyDocument =
        software.amazon.awscdk.services.iam.PolicyDocument.fromJson(obj).let(PolicyDocument::wrap)

    public operator fun invoke(block: Builder.() -> Unit = {}): PolicyDocument {
      val builderImpl = BuilderImpl()
      return PolicyDocument(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.PolicyDocument): PolicyDocument
        = PolicyDocument(cdkObject)

    internal fun unwrap(wrapped: PolicyDocument): software.amazon.awscdk.services.iam.PolicyDocument
        = wrapped.cdkObject
  }
}
