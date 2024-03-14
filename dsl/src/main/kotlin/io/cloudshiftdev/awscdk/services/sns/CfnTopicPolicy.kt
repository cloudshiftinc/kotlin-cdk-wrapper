package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTopicPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sns.CfnTopicPolicy,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun policyDocument(): Any = unwrap(this).getPolicyDocument()

  public open fun policyDocument(`value`: Any) {
    unwrap(this).setPolicyDocument(`value`)
  }

  public open fun topics(): List<String> = unwrap(this).getTopics() ?: emptyList()

  public open fun topics(`value`: List<String>) {
    unwrap(this).setTopics(`value`)
  }

  public interface Builder {
    public fun policyDocument(policyDocument: Any)

    public fun topics(topics: List<String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.CfnTopicPolicy.Builder =
        software.amazon.awscdk.services.sns.CfnTopicPolicy.Builder.create(scope, id)

    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    override fun topics(topics: List<String>) {
      cdkBuilder.topics(topics)
    }

    public fun build(): software.amazon.awscdk.services.sns.CfnTopicPolicy = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTopicPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTopicPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.CfnTopicPolicy): CfnTopicPolicy
        = CfnTopicPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnTopicPolicy): software.amazon.awscdk.services.sns.CfnTopicPolicy
        = wrapped.cdkObject
  }
}
