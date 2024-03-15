@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface StopActionConfig {
  public fun scope(): String

  public fun topicArn(): String? = unwrap(this).getTopicArn()

  @CdkDslMarker
  public interface Builder {
    public fun scope(scope: String)

    public fun topicArn(topicArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.StopActionConfig.Builder =
        software.amazon.awscdk.services.ses.StopActionConfig.builder()

    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    override fun topicArn(topicArn: String) {
      cdkBuilder.topicArn(topicArn)
    }

    public fun build(): software.amazon.awscdk.services.ses.StopActionConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.StopActionConfig,
  ) : CdkObject(cdkObject), StopActionConfig {
    override fun scope(): String = unwrap(this).getScope()

    override fun topicArn(): String? = unwrap(this).getTopicArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StopActionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.StopActionConfig):
        StopActionConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StopActionConfig):
        software.amazon.awscdk.services.ses.StopActionConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.StopActionConfig
  }
}
