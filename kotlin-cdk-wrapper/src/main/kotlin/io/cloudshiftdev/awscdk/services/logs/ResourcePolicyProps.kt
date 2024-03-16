@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties to define Cloudwatch log group resource policy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * PolicyStatement policyStatement;
 * ResourcePolicyProps resourcePolicyProps = ResourcePolicyProps.builder()
 * .policyStatements(List.of(policyStatement))
 * .resourcePolicyName("resourcePolicyName")
 * .build();
 * ```
 */
public interface ResourcePolicyProps {
  /**
   * Initial statements to add to the resource policy.
   *
   * Default: - No statements
   */
  public fun policyStatements(): List<PolicyStatement> =
      unwrap(this).getPolicyStatements()?.map(PolicyStatement::wrap) ?: emptyList()

  /**
   * Name of the log group resource policy.
   *
   * Default: - Uses a unique id based on the construct path
   */
  public fun resourcePolicyName(): String? = unwrap(this).getResourcePolicyName()

  /**
   * A builder for [ResourcePolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param policyStatements Initial statements to add to the resource policy.
     */
    public fun policyStatements(policyStatements: List<PolicyStatement>)

    /**
     * @param policyStatements Initial statements to add to the resource policy.
     */
    public fun policyStatements(vararg policyStatements: PolicyStatement)

    /**
     * @param resourcePolicyName Name of the log group resource policy.
     */
    public fun resourcePolicyName(resourcePolicyName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.ResourcePolicyProps.Builder =
        software.amazon.awscdk.services.logs.ResourcePolicyProps.builder()

    /**
     * @param policyStatements Initial statements to add to the resource policy.
     */
    override fun policyStatements(policyStatements: List<PolicyStatement>) {
      cdkBuilder.policyStatements(policyStatements.map(PolicyStatement::unwrap))
    }

    /**
     * @param policyStatements Initial statements to add to the resource policy.
     */
    override fun policyStatements(vararg policyStatements: PolicyStatement): Unit =
        policyStatements(policyStatements.toList())

    /**
     * @param resourcePolicyName Name of the log group resource policy.
     */
    override fun resourcePolicyName(resourcePolicyName: String) {
      cdkBuilder.resourcePolicyName(resourcePolicyName)
    }

    public fun build(): software.amazon.awscdk.services.logs.ResourcePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.ResourcePolicyProps,
  ) : CdkObject(cdkObject), ResourcePolicyProps {
    /**
     * Initial statements to add to the resource policy.
     *
     * Default: - No statements
     */
    override fun policyStatements(): List<PolicyStatement> =
        unwrap(this).getPolicyStatements()?.map(PolicyStatement::wrap) ?: emptyList()

    /**
     * Name of the log group resource policy.
     *
     * Default: - Uses a unique id based on the construct path
     */
    override fun resourcePolicyName(): String? = unwrap(this).getResourcePolicyName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResourcePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.ResourcePolicyProps):
        ResourcePolicyProps = CdkObjectWrappers.wrap(cdkObject) as ResourcePolicyProps

    internal fun unwrap(wrapped: ResourcePolicyProps):
        software.amazon.awscdk.services.logs.ResourcePolicyProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.logs.ResourcePolicyProps
  }
}
