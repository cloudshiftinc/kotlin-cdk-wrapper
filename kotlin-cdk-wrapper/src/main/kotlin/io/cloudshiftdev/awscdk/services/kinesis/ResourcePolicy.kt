@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesis

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The policy for a data stream or registered consumer.
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
 * Stream stream = new Stream(this, "MyStream");
 * // create a custom policy document
 * PolicyDocument policyDocument = PolicyDocument.Builder.create()
 * .assignSids(true)
 * .statements(List.of(
 * PolicyStatement.Builder.create()
 * .actions(List.of("kinesis:GetRecords"))
 * .resources(List.of(stream.getStreamArn()))
 * .principals(List.of(new AnyPrincipal()))
 * .build()))
 * .build();
 * // create a resource policy manually
 * // create a resource policy manually
 * ResourcePolicy.Builder.create(this, "ResourcePolicy")
 * .stream(stream)
 * .policyDocument(policyDocument)
 * .build();
 * ```
 */
public open class ResourcePolicy(
  cdkObject: software.amazon.awscdk.services.kinesis.ResourcePolicy,
) : Resource(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ResourcePolicyProps,
  ) :
      this(software.amazon.awscdk.services.kinesis.ResourcePolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ResourcePolicyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ResourcePolicyProps.Builder.() -> Unit,
  ) : this(scope, id, ResourcePolicyProps(props)
  )

  /**
   * The IAM policy document for this policy.
   */
  public open fun document(): PolicyDocument = unwrap(this).getDocument().let(PolicyDocument::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.kinesis.ResourcePolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * IAM policy document to apply to a data stream.
     *
     * Default: - empty policy document
     *
     * @param policyDocument IAM policy document to apply to a data stream. 
     */
    public fun policyDocument(policyDocument: PolicyDocument)

    /**
     * IAM policy document to apply to a data stream.
     *
     * Default: - empty policy document
     *
     * @param policyDocument IAM policy document to apply to a data stream. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca73099010b9e84298dea607825b72186affa522d82782bc8a4608a413cb148e")
    public fun policyDocument(policyDocument: PolicyDocument.Builder.() -> Unit)

    /**
     * The stream this policy applies to.
     *
     * @param stream The stream this policy applies to. 
     */
    public fun stream(stream: IStream)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesis.ResourcePolicy.Builder =
        software.amazon.awscdk.services.kinesis.ResourcePolicy.Builder.create(scope, id)

    /**
     * IAM policy document to apply to a data stream.
     *
     * Default: - empty policy document
     *
     * @param policyDocument IAM policy document to apply to a data stream. 
     */
    override fun policyDocument(policyDocument: PolicyDocument) {
      cdkBuilder.policyDocument(policyDocument.let(PolicyDocument.Companion::unwrap))
    }

    /**
     * IAM policy document to apply to a data stream.
     *
     * Default: - empty policy document
     *
     * @param policyDocument IAM policy document to apply to a data stream. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca73099010b9e84298dea607825b72186affa522d82782bc8a4608a413cb148e")
    override fun policyDocument(policyDocument: PolicyDocument.Builder.() -> Unit): Unit =
        policyDocument(PolicyDocument(policyDocument))

    /**
     * The stream this policy applies to.
     *
     * @param stream The stream this policy applies to. 
     */
    override fun stream(stream: IStream) {
      cdkBuilder.stream(stream.let(IStream.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.kinesis.ResourcePolicy = cdkBuilder.build()
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.ResourcePolicy):
        ResourcePolicy = ResourcePolicy(cdkObject)

    internal fun unwrap(wrapped: ResourcePolicy):
        software.amazon.awscdk.services.kinesis.ResourcePolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.kinesis.ResourcePolicy
  }
}
