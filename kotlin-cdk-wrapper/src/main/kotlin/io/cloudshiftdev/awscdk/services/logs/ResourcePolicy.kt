@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Resource Policy for CloudWatch Log Groups.
 *
 * Policies define the operations that are allowed on this resource.
 *
 * You almost never need to define this construct directly.
 *
 * All AWS resources that support resource policies have a method called
 * `addToResourcePolicy()`, which will automatically create a new resource
 * policy if one doesn't exist yet, otherwise it will add to the existing
 * policy.
 *
 * Prefer to use `addToResourcePolicy()` instead.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * PolicyStatement policyStatement;
 * ResourcePolicy resourcePolicy = ResourcePolicy.Builder.create(this, "MyResourcePolicy")
 * .policyStatements(List.of(policyStatement))
 * .resourcePolicyName("resourcePolicyName")
 * .build();
 * ```
 */
public open class ResourcePolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.logs.ResourcePolicy,
) : Resource(cdkObject) {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.logs.ResourcePolicy(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ResourcePolicyProps,
  ) :
      this(software.amazon.awscdk.services.logs.ResourcePolicy(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(ResourcePolicyProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ResourcePolicyProps.Builder.() -> Unit,
  ) : this(scope, id, ResourcePolicyProps(props)
  )

  /**
   * The IAM policy document for this resource policy.
   */
  public open fun document(): PolicyDocument = unwrap(this).getDocument().let(PolicyDocument::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.ResourcePolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Initial statements to add to the resource policy.
     *
     * Default: - No statements
     *
     * @param policyStatements Initial statements to add to the resource policy. 
     */
    public fun policyStatements(policyStatements: List<PolicyStatement>)

    /**
     * Initial statements to add to the resource policy.
     *
     * Default: - No statements
     *
     * @param policyStatements Initial statements to add to the resource policy. 
     */
    public fun policyStatements(vararg policyStatements: PolicyStatement)

    /**
     * Name of the log group resource policy.
     *
     * Default: - Uses a unique id based on the construct path
     *
     * @param resourcePolicyName Name of the log group resource policy. 
     */
    public fun resourcePolicyName(resourcePolicyName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.ResourcePolicy.Builder =
        software.amazon.awscdk.services.logs.ResourcePolicy.Builder.create(scope, id)

    /**
     * Initial statements to add to the resource policy.
     *
     * Default: - No statements
     *
     * @param policyStatements Initial statements to add to the resource policy. 
     */
    override fun policyStatements(policyStatements: List<PolicyStatement>) {
      cdkBuilder.policyStatements(policyStatements.map(PolicyStatement::unwrap))
    }

    /**
     * Initial statements to add to the resource policy.
     *
     * Default: - No statements
     *
     * @param policyStatements Initial statements to add to the resource policy. 
     */
    override fun policyStatements(vararg policyStatements: PolicyStatement): Unit =
        policyStatements(policyStatements.toList())

    /**
     * Name of the log group resource policy.
     *
     * Default: - Uses a unique id based on the construct path
     *
     * @param resourcePolicyName Name of the log group resource policy. 
     */
    override fun resourcePolicyName(resourcePolicyName: String) {
      cdkBuilder.resourcePolicyName(resourcePolicyName)
    }

    public fun build(): software.amazon.awscdk.services.logs.ResourcePolicy = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ResourcePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ResourcePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.ResourcePolicy):
        ResourcePolicy = ResourcePolicy(cdkObject)

    internal fun unwrap(wrapped: ResourcePolicy):
        software.amazon.awscdk.services.logs.ResourcePolicy = wrapped.cdkObject
  }
}
