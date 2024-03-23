@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.IDependable
import kotlin.Boolean
import kotlin.Unit

/**
 * Result of calling `addToPrincipalPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import software.constructs.*;
 * IDependable dependable;
 * AddToPrincipalPolicyResult addToPrincipalPolicyResult = AddToPrincipalPolicyResult.builder()
 * .statementAdded(false)
 * // the properties below are optional
 * .policyDependable(dependable)
 * .build();
 * ```
 */
public interface AddToPrincipalPolicyResult {
  /**
   * Dependable which allows depending on the policy change being applied.
   *
   * Default: - Required if `statementAdded` is true.
   */
  public fun policyDependable(): IDependable? =
      unwrap(this).getPolicyDependable()?.let(IDependable::wrap)

  /**
   * Whether the statement was added to the identity's policies.
   */
  public fun statementAdded(): Boolean

  /**
   * A builder for [AddToPrincipalPolicyResult]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param policyDependable Dependable which allows depending on the policy change being applied.
     */
    public fun policyDependable(policyDependable: IDependable)

    /**
     * @param statementAdded Whether the statement was added to the identity's policies. 
     */
    public fun statementAdded(statementAdded: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult.Builder =
        software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult.builder()

    /**
     * @param policyDependable Dependable which allows depending on the policy change being applied.
     */
    override fun policyDependable(policyDependable: IDependable) {
      cdkBuilder.policyDependable(policyDependable.let(IDependable::unwrap))
    }

    /**
     * @param statementAdded Whether the statement was added to the identity's policies. 
     */
    override fun statementAdded(statementAdded: Boolean) {
      cdkBuilder.statementAdded(statementAdded)
    }

    public fun build(): software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult,
  ) : CdkObject(cdkObject), AddToPrincipalPolicyResult {
    /**
     * Dependable which allows depending on the policy change being applied.
     *
     * Default: - Required if `statementAdded` is true.
     */
    override fun policyDependable(): IDependable? =
        unwrap(this).getPolicyDependable()?.let(IDependable::wrap)

    /**
     * Whether the statement was added to the identity's policies.
     */
    override fun statementAdded(): Boolean = unwrap(this).getStatementAdded()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddToPrincipalPolicyResult {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult):
        AddToPrincipalPolicyResult = CdkObjectWrappers.wrap(cdkObject) as?
        AddToPrincipalPolicyResult ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddToPrincipalPolicyResult):
        software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult
  }
}
