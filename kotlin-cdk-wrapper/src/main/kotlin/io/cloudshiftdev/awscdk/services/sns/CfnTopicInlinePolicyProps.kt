@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnTopicInlinePolicyProps {
  public fun policyDocument(): Any

  public fun topicArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun policyDocument(policyDocument: Any)

    public fun topicArn(topicArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.CfnTopicInlinePolicyProps.Builder =
        software.amazon.awscdk.services.sns.CfnTopicInlinePolicyProps.builder()

    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    override fun topicArn(topicArn: String) {
      cdkBuilder.topicArn(topicArn)
    }

    public fun build(): software.amazon.awscdk.services.sns.CfnTopicInlinePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sns.CfnTopicInlinePolicyProps,
  ) : CdkObject(cdkObject), CfnTopicInlinePolicyProps {
    override fun policyDocument(): Any = unwrap(this).getPolicyDocument()

    override fun topicArn(): String = unwrap(this).getTopicArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTopicInlinePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.CfnTopicInlinePolicyProps):
        CfnTopicInlinePolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTopicInlinePolicyProps):
        software.amazon.awscdk.services.sns.CfnTopicInlinePolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sns.CfnTopicInlinePolicyProps
  }
}
