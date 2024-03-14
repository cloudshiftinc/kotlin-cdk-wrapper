package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.IResolveContext
import io.cloudshiftdev.awscdk.common.CdkDslMarker
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
  /**
   * Adds a statement to the policy document.
   *
   * @param statement the statement to add. 
   */
  public open fun addStatements(statement: PolicyStatement) {
    unwrap(this).addStatements(statement.let(PolicyStatement::unwrap))
  }

  /**
   * Adds a statement to the policy document.
   *
   * @param statement the statement to add. 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("98fe20c8550beea0e99a87c49e8839386e2715f38099686c4beb06cab4f71d9d")
  public open fun addStatements(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addStatements(PolicyStatement(statement))

  /**
   * The creation stack of this resolvable which will be appended to errors thrown during
   * resolution.
   *
   * This may return an array with a single informational element indicating how
   * to get this property populated, if it was skipped for performance reasons.
   */
  public override fun creationStack(): List<String> = unwrap(this).getCreationStack()

  /**
   * Whether the policy document contains any statements.
   */
  public open fun isEmpty(): Boolean = unwrap(this).getIsEmpty()

  /**
   * Produce the Token's value at resolution time.
   *
   * @param context 
   */
  public override fun resolve(context: IResolveContext): Any =
      unwrap(this).resolve(context.let(IResolveContext::unwrap))

  /**
   * The number of statements already added to this policy.
   *
   * Can be used, for example, to generate unique "sid"s within the policy.
   */
  public open fun statementCount(): Number = unwrap(this).getStatementCount()

  /**
   * JSON-ify the document.
   *
   * Used when JSON.stringify() is called
   */
  public open fun toJson(): Any = unwrap(this).toJSON()

  /**
   * Validate that all policy statements in the policy document satisfies the requirements for any
   * policy.
   *
   * @return An array of validation error messages, or an empty array if the document is valid.
   * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policies-json)
   */
  public open fun validateForAnyPolicy(): List<String> = unwrap(this).validateForAnyPolicy()

  /**
   * Validate that all policy statements in the policy document satisfies the requirements for an
   * identity-based policy.
   *
   * @return An array of validation error messages, or an empty array if the document is valid.
   * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policies-json)
   */
  public open fun validateForIdentityPolicy(): List<String> =
      unwrap(this).validateForIdentityPolicy()

  /**
   * Validate that all policy statements in the policy document satisfies the requirements for a
   * resource-based policy.
   *
   * @return An array of validation error messages, or an empty array if the document is valid.
   * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policies-json)
   */
  public open fun validateForResourcePolicy(): List<String> =
      unwrap(this).validateForResourcePolicy()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iam.PolicyDocument].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Automatically assign Statement Ids to all statements.
     *
     * Default: false
     *
     * @param assignSids Automatically assign Statement Ids to all statements. 
     */
    public fun assignSids(assignSids: Boolean)

    /**
     * Try to minimize the policy by merging statements.
     *
     * To avoid overrunning the maximum policy size, combine statements if they produce
     * the same result. Merging happens according to the following rules:
     *
     * * The Effect of both statements is the same
     * * Neither of the statements have a 'Sid'
     * * Combine Principals if the rest of the statement is exactly the same.
     * * Combine Resources if the rest of the statement is exactly the same.
     * * Combine Actions if the rest of the statement is exactly the same.
     * * We will never combine NotPrincipals, NotResources or NotActions, because doing
     * so would change the meaning of the policy document.
     *
     * Default: - false, unless the feature flag `@aws-cdk/aws-iam:minimizePolicies` is set
     *
     * @param minimize Try to minimize the policy by merging statements. 
     */
    public fun minimize(minimize: Boolean)

    /**
     * Initial statements to add to the policy document.
     *
     * Default: - No statements
     *
     * @param statements Initial statements to add to the policy document. 
     */
    public fun statements(statements: List<PolicyStatement>)

    /**
     * Initial statements to add to the policy document.
     *
     * Default: - No statements
     *
     * @param statements Initial statements to add to the policy document. 
     */
    public fun statements(vararg statements: PolicyStatement)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.PolicyDocument.Builder =
        software.amazon.awscdk.services.iam.PolicyDocument.Builder.create()

    /**
     * Automatically assign Statement Ids to all statements.
     *
     * Default: false
     *
     * @param assignSids Automatically assign Statement Ids to all statements. 
     */
    override fun assignSids(assignSids: Boolean) {
      cdkBuilder.assignSids(assignSids)
    }

    /**
     * Try to minimize the policy by merging statements.
     *
     * To avoid overrunning the maximum policy size, combine statements if they produce
     * the same result. Merging happens according to the following rules:
     *
     * * The Effect of both statements is the same
     * * Neither of the statements have a 'Sid'
     * * Combine Principals if the rest of the statement is exactly the same.
     * * Combine Resources if the rest of the statement is exactly the same.
     * * Combine Actions if the rest of the statement is exactly the same.
     * * We will never combine NotPrincipals, NotResources or NotActions, because doing
     * so would change the meaning of the policy document.
     *
     * Default: - false, unless the feature flag `@aws-cdk/aws-iam:minimizePolicies` is set
     *
     * @param minimize Try to minimize the policy by merging statements. 
     */
    override fun minimize(minimize: Boolean) {
      cdkBuilder.minimize(minimize)
    }

    /**
     * Initial statements to add to the policy document.
     *
     * Default: - No statements
     *
     * @param statements Initial statements to add to the policy document. 
     */
    override fun statements(statements: List<PolicyStatement>) {
      cdkBuilder.statements(statements.map(PolicyStatement::unwrap))
    }

    /**
     * Initial statements to add to the policy document.
     *
     * Default: - No statements
     *
     * @param statements Initial statements to add to the policy document. 
     */
    override fun statements(vararg statements: PolicyStatement): Unit =
        statements(statements.toList())

    public fun build(): software.amazon.awscdk.services.iam.PolicyDocument = cdkBuilder.build()
  }

  public companion object {
    public fun fromJson(obj: Any): PolicyDocument =
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
