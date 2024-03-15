@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface SNSActionConfig {
  public fun encoding(): String? = unwrap(this).getEncoding()

  public fun topicArn(): String? = unwrap(this).getTopicArn()

  @CdkDslMarker
  public interface Builder {
    public fun encoding(encoding: String)

    public fun topicArn(topicArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.SNSActionConfig.Builder =
        software.amazon.awscdk.services.ses.SNSActionConfig.builder()

    override fun encoding(encoding: String) {
      cdkBuilder.encoding(encoding)
    }

    override fun topicArn(topicArn: String) {
      cdkBuilder.topicArn(topicArn)
    }

    public fun build(): software.amazon.awscdk.services.ses.SNSActionConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.SNSActionConfig,
  ) : CdkObject(cdkObject), SNSActionConfig {
    override fun encoding(): String? = unwrap(this).getEncoding()

    override fun topicArn(): String? = unwrap(this).getTopicArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SNSActionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.SNSActionConfig):
        SNSActionConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SNSActionConfig):
        software.amazon.awscdk.services.ses.SNSActionConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.SNSActionConfig
  }
}
