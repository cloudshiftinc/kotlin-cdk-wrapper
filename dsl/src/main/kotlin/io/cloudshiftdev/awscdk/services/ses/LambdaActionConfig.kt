package io.cloudshiftdev.awscdk.services.ses

import kotlin.String
import kotlin.Unit

public interface LambdaActionConfig {
  public fun functionArn(): String

  public fun invocationType(): String? = unwrap(this).getInvocationType()

  public fun topicArn(): String? = unwrap(this).getTopicArn()

  public interface Builder {
    public fun functionArn(functionArn: String)

    public fun invocationType(invocationType: String)

    public fun topicArn(topicArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.LambdaActionConfig.Builder =
        software.amazon.awscdk.services.ses.LambdaActionConfig.builder()

    override fun functionArn(functionArn: String) {
      cdkBuilder.functionArn(functionArn)
    }

    override fun invocationType(invocationType: String) {
      cdkBuilder.invocationType(invocationType)
    }

    override fun topicArn(topicArn: String) {
      cdkBuilder.topicArn(topicArn)
    }

    public fun build(): software.amazon.awscdk.services.ses.LambdaActionConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ses.LambdaActionConfig,
  ) : LambdaActionConfig {
    override fun functionArn(): String = unwrap(this).getFunctionArn()

    override fun invocationType(): String? = unwrap(this).getInvocationType()

    override fun topicArn(): String? = unwrap(this).getTopicArn()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaActionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.LambdaActionConfig):
        LambdaActionConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaActionConfig):
        software.amazon.awscdk.services.ses.LambdaActionConfig = (wrapped as Wrapper).cdkObject
  }
}
