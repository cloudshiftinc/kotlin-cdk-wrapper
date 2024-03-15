@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface TopicPolicyProps {
  public fun enforceSsl(): Boolean? = unwrap(this).getEnforceSSL()

  public fun policyDocument(): PolicyDocument? =
      unwrap(this).getPolicyDocument()?.let(PolicyDocument::wrap)

  public fun topics(): List<ITopic>

  @CdkDslMarker
  public interface Builder {
    public fun enforceSsl(enforceSsl: Boolean)

    public fun policyDocument(policyDocument: PolicyDocument)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fa7b0294cf33c4673a9b37b79da1b62da1d37ace226f8683bd32ea2f16dd6a6")
    public fun policyDocument(policyDocument: PolicyDocument.Builder.() -> Unit)

    public fun topics(topics: List<ITopic>)

    public fun topics(vararg topics: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.TopicPolicyProps.Builder =
        software.amazon.awscdk.services.sns.TopicPolicyProps.builder()

    override fun enforceSsl(enforceSsl: Boolean) {
      cdkBuilder.enforceSsl(enforceSsl)
    }

    override fun policyDocument(policyDocument: PolicyDocument) {
      cdkBuilder.policyDocument(policyDocument.let(PolicyDocument::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fa7b0294cf33c4673a9b37b79da1b62da1d37ace226f8683bd32ea2f16dd6a6")
    override fun policyDocument(policyDocument: PolicyDocument.Builder.() -> Unit): Unit =
        policyDocument(PolicyDocument(policyDocument))

    override fun topics(topics: List<ITopic>) {
      cdkBuilder.topics(topics.map(ITopic::unwrap))
    }

    override fun topics(vararg topics: ITopic): Unit = topics(topics.toList())

    public fun build(): software.amazon.awscdk.services.sns.TopicPolicyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sns.TopicPolicyProps,
  ) : CdkObject(cdkObject), TopicPolicyProps {
    override fun enforceSsl(): Boolean? = unwrap(this).getEnforceSSL()

    override fun policyDocument(): PolicyDocument? =
        unwrap(this).getPolicyDocument()?.let(PolicyDocument::wrap)

    override fun topics(): List<ITopic> = unwrap(this).getTopics().map(ITopic::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TopicPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.TopicPolicyProps):
        TopicPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TopicPolicyProps):
        software.amazon.awscdk.services.sns.TopicPolicyProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sns.TopicPolicyProps
  }
}
