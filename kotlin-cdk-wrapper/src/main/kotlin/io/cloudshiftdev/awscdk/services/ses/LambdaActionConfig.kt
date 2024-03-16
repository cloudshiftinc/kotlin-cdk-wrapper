@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * LambdaAction configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * LambdaActionConfig lambdaActionConfig = LambdaActionConfig.builder()
 * .functionArn("functionArn")
 * // the properties below are optional
 * .invocationType("invocationType")
 * .topicArn("topicArn")
 * .build();
 * ```
 */
public interface LambdaActionConfig {
  /**
   * The Amazon Resource Name (ARN) of the AWS Lambda function.
   */
  public fun functionArn(): String

  /**
   * The invocation type of the AWS Lambda function.
   *
   * Default: 'Event'
   */
  public fun invocationType(): String? = unwrap(this).getInvocationType()

  /**
   * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the Lambda action is
   * executed.
   *
   * Default: - No notification is sent to SNS.
   */
  public fun topicArn(): String? = unwrap(this).getTopicArn()

  /**
   * A builder for [LambdaActionConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param functionArn The Amazon Resource Name (ARN) of the AWS Lambda function. 
     */
    public fun functionArn(functionArn: String)

    /**
     * @param invocationType The invocation type of the AWS Lambda function.
     */
    public fun invocationType(invocationType: String)

    /**
     * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
     * Lambda action is executed.
     */
    public fun topicArn(topicArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.LambdaActionConfig.Builder =
        software.amazon.awscdk.services.ses.LambdaActionConfig.builder()

    /**
     * @param functionArn The Amazon Resource Name (ARN) of the AWS Lambda function. 
     */
    override fun functionArn(functionArn: String) {
      cdkBuilder.functionArn(functionArn)
    }

    /**
     * @param invocationType The invocation type of the AWS Lambda function.
     */
    override fun invocationType(invocationType: String) {
      cdkBuilder.invocationType(invocationType)
    }

    /**
     * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
     * Lambda action is executed.
     */
    override fun topicArn(topicArn: String) {
      cdkBuilder.topicArn(topicArn)
    }

    public fun build(): software.amazon.awscdk.services.ses.LambdaActionConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.LambdaActionConfig,
  ) : CdkObject(cdkObject), LambdaActionConfig {
    /**
     * The Amazon Resource Name (ARN) of the AWS Lambda function.
     */
    override fun functionArn(): String = unwrap(this).getFunctionArn()

    /**
     * The invocation type of the AWS Lambda function.
     *
     * Default: 'Event'
     */
    override fun invocationType(): String? = unwrap(this).getInvocationType()

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the Lambda action is
     * executed.
     *
     * Default: - No notification is sent to SNS.
     */
    override fun topicArn(): String? = unwrap(this).getTopicArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaActionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.LambdaActionConfig):
        LambdaActionConfig = CdkObjectWrappers.wrap(cdkObject) as LambdaActionConfig

    internal fun unwrap(wrapped: LambdaActionConfig):
        software.amazon.awscdk.services.ses.LambdaActionConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.LambdaActionConfig
  }
}
