package io.cloudshiftdev.awscdk.services.ses

import kotlin.String
import kotlin.Unit

public interface StopActionConfig {
  public fun scope(): String

  public fun topicArn(): String? = unwrap(this).getTopicArn()

  public interface Builder {
    public fun scope(scope: String) {
    }

    public fun topicArn(topicArn: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.StopActionConfig.Builder =
        software.amazon.awscdk.services.ses.StopActionConfig.builder()

    public override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    public override fun topicArn(topicArn: String) {
      cdkBuilder.topicArn(topicArn)
    }

    public fun build(): software.amazon.awscdk.services.ses.StopActionConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ses.StopActionConfig,
  ) : StopActionConfig {
    public override fun scope(): String = unwrap(this).getScope()

    public override fun topicArn(): String? = unwrap(this).getTopicArn()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): StopActionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.StopActionConfig):
        StopActionConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StopActionConfig):
        software.amazon.awscdk.services.ses.StopActionConfig = (wrapped as Wrapper).cdkObject
  }
}
