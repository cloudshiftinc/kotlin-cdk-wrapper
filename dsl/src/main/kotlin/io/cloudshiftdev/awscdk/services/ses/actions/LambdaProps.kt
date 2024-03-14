package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Unit

public interface LambdaProps {
  /**
   * The Lambda function to invoke.
   */
  public fun function(): IFunction

  /**
   * The invocation type of the Lambda function.
   *
   * Default: Event
   */
  public fun invocationType(): LambdaInvocationType? =
      unwrap(this).getInvocationType()?.let(LambdaInvocationType::wrap)

  /**
   * The SNS topic to notify when the Lambda action is taken.
   *
   * Default: no notification
   */
  public fun topic(): ITopic? = unwrap(this).getTopic()?.let(ITopic::wrap)

  /**
   * A builder for [LambdaProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param function The Lambda function to invoke. 
     */
    public fun function(function: IFunction)

    /**
     * @param invocationType The invocation type of the Lambda function.
     */
    public fun invocationType(invocationType: LambdaInvocationType)

    /**
     * @param topic The SNS topic to notify when the Lambda action is taken.
     */
    public fun topic(topic: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.LambdaProps.Builder =
        software.amazon.awscdk.services.ses.actions.LambdaProps.builder()

    /**
     * @param function The Lambda function to invoke. 
     */
    override fun function(function: IFunction) {
      cdkBuilder.function(function.let(IFunction::unwrap))
    }

    /**
     * @param invocationType The invocation type of the Lambda function.
     */
    override fun invocationType(invocationType: LambdaInvocationType) {
      cdkBuilder.invocationType(invocationType.let(LambdaInvocationType::unwrap))
    }

    /**
     * @param topic The SNS topic to notify when the Lambda action is taken.
     */
    override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.actions.LambdaProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.actions.LambdaProps,
  ) : CdkObject(cdkObject), LambdaProps {
    /**
     * The Lambda function to invoke.
     */
    override fun function(): IFunction = unwrap(this).getFunction().let(IFunction::wrap)

    /**
     * The invocation type of the Lambda function.
     *
     * Default: Event
     */
    override fun invocationType(): LambdaInvocationType? =
        unwrap(this).getInvocationType()?.let(LambdaInvocationType::wrap)

    /**
     * The SNS topic to notify when the Lambda action is taken.
     *
     * Default: no notification
     */
    override fun topic(): ITopic? = unwrap(this).getTopic()?.let(ITopic::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.actions.LambdaProps):
        LambdaProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaProps):
        software.amazon.awscdk.services.ses.actions.LambdaProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ses.actions.LambdaProps
  }
}
