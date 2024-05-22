@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties to associate SNS topics with a policy.
 *
 * Example:
 *
 * ```
 * Topic topic = new Topic(this, "Topic");
 * PolicyDocument policyDocument = PolicyDocument.Builder.create()
 * .assignSids(true)
 * .statements(List.of(
 * PolicyStatement.Builder.create()
 * .actions(List.of("sns:Subscribe"))
 * .principals(List.of(new AnyPrincipal()))
 * .resources(List.of(topic.getTopicArn()))
 * .build()))
 * .build();
 * TopicPolicy topicPolicy = TopicPolicy.Builder.create(this, "Policy")
 * .topics(List.of(topic))
 * .policyDocument(policyDocument)
 * .build();
 * ```
 */
public interface TopicPolicyProps {
  /**
   * Adds a statement to enforce encryption of data in transit when publishing to the topic.
   *
   * For more information, see
   * https://docs.aws.amazon.com/sns/latest/dg/sns-security-best-practices.html#enforce-encryption-data-in-transit.
   *
   * Default: false
   */
  public fun enforceSSL(): Boolean? = unwrap(this).getEnforceSSL()

  /**
   * IAM policy document to apply to topic(s).
   *
   * Default: empty policy document
   */
  public fun policyDocument(): PolicyDocument? =
      unwrap(this).getPolicyDocument()?.let(PolicyDocument::wrap)

  /**
   * The set of topics this policy applies to.
   */
  public fun topics(): List<ITopic>

  /**
   * A builder for [TopicPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param enforceSsl Adds a statement to enforce encryption of data in transit when publishing
     * to the topic.
     * For more information, see
     * https://docs.aws.amazon.com/sns/latest/dg/sns-security-best-practices.html#enforce-encryption-data-in-transit.
     */
    public fun enforceSsl(enforceSsl: Boolean)

    /**
     * @param policyDocument IAM policy document to apply to topic(s).
     */
    public fun policyDocument(policyDocument: PolicyDocument)

    /**
     * @param policyDocument IAM policy document to apply to topic(s).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fa7b0294cf33c4673a9b37b79da1b62da1d37ace226f8683bd32ea2f16dd6a6")
    public fun policyDocument(policyDocument: PolicyDocument.Builder.() -> Unit)

    /**
     * @param topics The set of topics this policy applies to. 
     */
    public fun topics(topics: List<ITopic>)

    /**
     * @param topics The set of topics this policy applies to. 
     */
    public fun topics(vararg topics: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.TopicPolicyProps.Builder =
        software.amazon.awscdk.services.sns.TopicPolicyProps.builder()

    /**
     * @param enforceSsl Adds a statement to enforce encryption of data in transit when publishing
     * to the topic.
     * For more information, see
     * https://docs.aws.amazon.com/sns/latest/dg/sns-security-best-practices.html#enforce-encryption-data-in-transit.
     */
    override fun enforceSsl(enforceSsl: Boolean) {
      cdkBuilder.enforceSsl(enforceSsl)
    }

    /**
     * @param policyDocument IAM policy document to apply to topic(s).
     */
    override fun policyDocument(policyDocument: PolicyDocument) {
      cdkBuilder.policyDocument(policyDocument.let(PolicyDocument.Companion::unwrap))
    }

    /**
     * @param policyDocument IAM policy document to apply to topic(s).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fa7b0294cf33c4673a9b37b79da1b62da1d37ace226f8683bd32ea2f16dd6a6")
    override fun policyDocument(policyDocument: PolicyDocument.Builder.() -> Unit): Unit =
        policyDocument(PolicyDocument(policyDocument))

    /**
     * @param topics The set of topics this policy applies to. 
     */
    override fun topics(topics: List<ITopic>) {
      cdkBuilder.topics(topics.map(ITopic.Companion::unwrap))
    }

    /**
     * @param topics The set of topics this policy applies to. 
     */
    override fun topics(vararg topics: ITopic): Unit = topics(topics.toList())

    public fun build(): software.amazon.awscdk.services.sns.TopicPolicyProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sns.TopicPolicyProps,
  ) : CdkObject(cdkObject), TopicPolicyProps {
    /**
     * Adds a statement to enforce encryption of data in transit when publishing to the topic.
     *
     * For more information, see
     * https://docs.aws.amazon.com/sns/latest/dg/sns-security-best-practices.html#enforce-encryption-data-in-transit.
     *
     * Default: false
     */
    override fun enforceSSL(): Boolean? = unwrap(this).getEnforceSSL()

    /**
     * IAM policy document to apply to topic(s).
     *
     * Default: empty policy document
     */
    override fun policyDocument(): PolicyDocument? =
        unwrap(this).getPolicyDocument()?.let(PolicyDocument::wrap)

    /**
     * The set of topics this policy applies to.
     */
    override fun topics(): List<ITopic> = unwrap(this).getTopics().map(ITopic::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TopicPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.TopicPolicyProps):
        TopicPolicyProps = CdkObjectWrappers.wrap(cdkObject) as? TopicPolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TopicPolicyProps):
        software.amazon.awscdk.services.sns.TopicPolicyProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sns.TopicPolicyProps
  }
}
