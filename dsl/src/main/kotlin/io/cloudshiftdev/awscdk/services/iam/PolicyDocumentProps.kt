package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List

public interface PolicyDocumentProps {
  /**
   * Automatically assign Statement Ids to all statements.
   *
   * Default: false
   */
  public fun assignSids(): Boolean? = unwrap(this).getAssignSids()

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
   */
  public fun minimize(): Boolean? = unwrap(this).getMinimize()

  /**
   * Initial statements to add to the policy document.
   *
   * Default: - No statements
   */
  public fun statements(): List<PolicyStatement> =
      unwrap(this).getStatements()?.map(PolicyStatement::wrap) ?: emptyList()

  /**
   * A builder for [PolicyDocumentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assignSids Automatically assign Statement Ids to all statements.
     */
    public fun assignSids(assignSids: Boolean)

    /**
     * @param minimize Try to minimize the policy by merging statements.
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
     */
    public fun minimize(minimize: Boolean)

    /**
     * @param statements Initial statements to add to the policy document.
     */
    public fun statements(statements: List<PolicyStatement>)

    /**
     * @param statements Initial statements to add to the policy document.
     */
    public fun statements(vararg statements: PolicyStatement)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.PolicyDocumentProps.Builder =
        software.amazon.awscdk.services.iam.PolicyDocumentProps.builder()

    /**
     * @param assignSids Automatically assign Statement Ids to all statements.
     */
    override fun assignSids(assignSids: Boolean) {
      cdkBuilder.assignSids(assignSids)
    }

    /**
     * @param minimize Try to minimize the policy by merging statements.
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
     */
    override fun minimize(minimize: Boolean) {
      cdkBuilder.minimize(minimize)
    }

    /**
     * @param statements Initial statements to add to the policy document.
     */
    override fun statements(statements: List<PolicyStatement>) {
      cdkBuilder.statements(statements.map(PolicyStatement::unwrap))
    }

    /**
     * @param statements Initial statements to add to the policy document.
     */
    override fun statements(vararg statements: PolicyStatement): Unit =
        statements(statements.toList())

    public fun build(): software.amazon.awscdk.services.iam.PolicyDocumentProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.PolicyDocumentProps,
  ) : CdkObject(cdkObject), PolicyDocumentProps {
    /**
     * Automatically assign Statement Ids to all statements.
     *
     * Default: false
     */
    override fun assignSids(): Boolean? = unwrap(this).getAssignSids()

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
     */
    override fun minimize(): Boolean? = unwrap(this).getMinimize()

    /**
     * Initial statements to add to the policy document.
     *
     * Default: - No statements
     */
    override fun statements(): List<PolicyStatement> =
        unwrap(this).getStatements()?.map(PolicyStatement::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PolicyDocumentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.PolicyDocumentProps):
        PolicyDocumentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PolicyDocumentProps):
        software.amazon.awscdk.services.iam.PolicyDocumentProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.PolicyDocumentProps
  }
}
