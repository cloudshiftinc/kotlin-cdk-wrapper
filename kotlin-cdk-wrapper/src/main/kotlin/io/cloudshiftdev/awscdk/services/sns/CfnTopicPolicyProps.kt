@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnTopicPolicyProps {
  public fun policyDocument(): Any

  public fun topics(): List<String>

  @CdkDslMarker
  public interface Builder {
    public fun policyDocument(policyDocument: Any)

    public fun topics(topics: List<String>)

    public fun topics(vararg topics: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.CfnTopicPolicyProps.Builder =
        software.amazon.awscdk.services.sns.CfnTopicPolicyProps.builder()

    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    override fun topics(topics: List<String>) {
      cdkBuilder.topics(topics)
    }

    override fun topics(vararg topics: String): Unit = topics(topics.toList())

    public fun build(): software.amazon.awscdk.services.sns.CfnTopicPolicyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sns.CfnTopicPolicyProps,
  ) : CdkObject(cdkObject), CfnTopicPolicyProps {
    override fun policyDocument(): Any = unwrap(this).getPolicyDocument()

    override fun topics(): List<String> = unwrap(this).getTopics()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTopicPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.CfnTopicPolicyProps):
        CfnTopicPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTopicPolicyProps):
        software.amazon.awscdk.services.sns.CfnTopicPolicyProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sns.CfnTopicPolicyProps
  }
}
