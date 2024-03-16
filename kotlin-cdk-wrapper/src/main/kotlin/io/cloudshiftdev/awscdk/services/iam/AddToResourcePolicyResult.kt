@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.IDependable
import kotlin.Boolean
import kotlin.Unit

/**
 * Result of calling addToResourcePolicy.
 *
 * Example:
 *
 * ```
 * IBucket bucket = Bucket.fromBucketName(this, "existingBucket", "bucket-name");
 * // No policy statement will be added to the resource
 * AddToResourcePolicyResult result = bucket.addToResourcePolicy(
 * PolicyStatement.Builder.create()
 * .actions(List.of("s3:GetObject"))
 * .resources(List.of(bucket.arnForObjects("file.txt")))
 * .principals(List.of(new AccountRootPrincipal()))
 * .build());
 * ```
 */
public interface AddToResourcePolicyResult {
  /**
   * Dependable which allows depending on the policy change being applied.
   *
   * Default: - If `statementAdded` is true, the resource object itself.
   * Otherwise, no dependable.
   */
  public fun policyDependable(): IDependable? =
      unwrap(this).getPolicyDependable()?.let(IDependable::wrap)

  /**
   * Whether the statement was added.
   */
  public fun statementAdded(): Boolean

  /**
   * A builder for [AddToResourcePolicyResult]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param policyDependable Dependable which allows depending on the policy change being applied.
     */
    public fun policyDependable(policyDependable: IDependable)

    /**
     * @param statementAdded Whether the statement was added. 
     */
    public fun statementAdded(statementAdded: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.AddToResourcePolicyResult.Builder =
        software.amazon.awscdk.services.iam.AddToResourcePolicyResult.builder()

    /**
     * @param policyDependable Dependable which allows depending on the policy change being applied.
     */
    override fun policyDependable(policyDependable: IDependable) {
      cdkBuilder.policyDependable(policyDependable.let(IDependable::unwrap))
    }

    /**
     * @param statementAdded Whether the statement was added. 
     */
    override fun statementAdded(statementAdded: Boolean) {
      cdkBuilder.statementAdded(statementAdded)
    }

    public fun build(): software.amazon.awscdk.services.iam.AddToResourcePolicyResult =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.AddToResourcePolicyResult,
  ) : CdkObject(cdkObject), AddToResourcePolicyResult {
    /**
     * Dependable which allows depending on the policy change being applied.
     *
     * Default: - If `statementAdded` is true, the resource object itself.
     * Otherwise, no dependable.
     */
    override fun policyDependable(): IDependable? =
        unwrap(this).getPolicyDependable()?.let(IDependable::wrap)

    /**
     * Whether the statement was added.
     */
    override fun statementAdded(): Boolean = unwrap(this).getStatementAdded()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddToResourcePolicyResult {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.AddToResourcePolicyResult):
        AddToResourcePolicyResult = CdkObjectWrappers.wrap(cdkObject) as AddToResourcePolicyResult

    internal fun unwrap(wrapped: AddToResourcePolicyResult):
        software.amazon.awscdk.services.iam.AddToResourcePolicyResult = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.AddToResourcePolicyResult
  }
}
