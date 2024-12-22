@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesis

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties to associate a data stream with a policy.
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
public interface ResourcePolicyProps {
  /**
   * IAM policy document to apply to a data stream.
   *
   * Default: - empty policy document
   */
  public fun policyDocument(): PolicyDocument? =
      unwrap(this).getPolicyDocument()?.let(PolicyDocument::wrap)

  /**
   * The stream this policy applies to.
   */
  public fun stream(): IStream

  /**
   * A builder for [ResourcePolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param policyDocument IAM policy document to apply to a data stream.
     */
    public fun policyDocument(policyDocument: PolicyDocument)

    /**
     * @param policyDocument IAM policy document to apply to a data stream.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("266a86bdc09974d55d96114f487bbf6c00dabe4538e06880687f01a846375f86")
    public fun policyDocument(policyDocument: PolicyDocument.Builder.() -> Unit)

    /**
     * @param stream The stream this policy applies to. 
     */
    public fun stream(stream: IStream)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesis.ResourcePolicyProps.Builder =
        software.amazon.awscdk.services.kinesis.ResourcePolicyProps.builder()

    /**
     * @param policyDocument IAM policy document to apply to a data stream.
     */
    override fun policyDocument(policyDocument: PolicyDocument) {
      cdkBuilder.policyDocument(policyDocument.let(PolicyDocument.Companion::unwrap))
    }

    /**
     * @param policyDocument IAM policy document to apply to a data stream.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("266a86bdc09974d55d96114f487bbf6c00dabe4538e06880687f01a846375f86")
    override fun policyDocument(policyDocument: PolicyDocument.Builder.() -> Unit): Unit =
        policyDocument(PolicyDocument(policyDocument))

    /**
     * @param stream The stream this policy applies to. 
     */
    override fun stream(stream: IStream) {
      cdkBuilder.stream(stream.let(IStream.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.kinesis.ResourcePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesis.ResourcePolicyProps,
  ) : CdkObject(cdkObject),
      ResourcePolicyProps {
    /**
     * IAM policy document to apply to a data stream.
     *
     * Default: - empty policy document
     */
    override fun policyDocument(): PolicyDocument? =
        unwrap(this).getPolicyDocument()?.let(PolicyDocument::wrap)

    /**
     * The stream this policy applies to.
     */
    override fun stream(): IStream = unwrap(this).getStream().let(IStream::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResourcePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.ResourcePolicyProps):
        ResourcePolicyProps = CdkObjectWrappers.wrap(cdkObject) as? ResourcePolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResourcePolicyProps):
        software.amazon.awscdk.services.kinesis.ResourcePolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kinesis.ResourcePolicyProps
  }
}
