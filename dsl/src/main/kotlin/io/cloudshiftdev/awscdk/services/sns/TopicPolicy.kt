package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class TopicPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sns.TopicPolicy,
) : Resource(cdkObject) {
  public open fun document(): PolicyDocument = unwrap(this).getDocument().let(PolicyDocument::wrap)

  public interface Builder {
    public fun enforceSsl(enforceSsl: Boolean)

    public fun policyDocument(policyDocument: PolicyDocument)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9a7c2744698ca24c0ae4ca22505105510f722b2d38f07d907481af1470bf2d2")
    public fun policyDocument(policyDocument: PolicyDocument.Builder.() -> Unit)

    public fun topics(topics: List<ITopic>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.TopicPolicy.Builder =
        software.amazon.awscdk.services.sns.TopicPolicy.Builder.create(scope, id)

    override fun enforceSsl(enforceSsl: Boolean) {
      cdkBuilder.enforceSsl(enforceSsl)
    }

    override fun policyDocument(policyDocument: PolicyDocument) {
      cdkBuilder.policyDocument(policyDocument.let(PolicyDocument::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9a7c2744698ca24c0ae4ca22505105510f722b2d38f07d907481af1470bf2d2")
    override fun policyDocument(policyDocument: PolicyDocument.Builder.() -> Unit): Unit =
        policyDocument(PolicyDocument(policyDocument))

    override fun topics(topics: List<ITopic>) {
      cdkBuilder.topics(topics.map(ITopic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.sns.TopicPolicy = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): TopicPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return TopicPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.TopicPolicy): TopicPolicy =
        TopicPolicy(cdkObject)

    internal fun unwrap(wrapped: TopicPolicy): software.amazon.awscdk.services.sns.TopicPolicy =
        wrapped.cdkObject
  }
}
