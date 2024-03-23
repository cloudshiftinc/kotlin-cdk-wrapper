@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnEventInvokeConfig`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * CfnEventInvokeConfigProps cfnEventInvokeConfigProps = CfnEventInvokeConfigProps.builder()
 * .functionName("functionName")
 * .qualifier("qualifier")
 * // the properties below are optional
 * .destinationConfig(DestinationConfigProperty.builder()
 * .onFailure(OnFailureProperty.builder()
 * .destination("destination")
 * .build())
 * .onSuccess(OnSuccessProperty.builder()
 * .destination("destination")
 * .build())
 * .build())
 * .maximumEventAgeInSeconds(123)
 * .maximumRetryAttempts(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html)
 */
public interface CfnEventInvokeConfigProps {
  /**
   * A destination for events after they have been sent to a function for processing.
   *
   * **Destinations** - *Function* - The Amazon Resource Name (ARN) of a Lambda function.
   *
   * * *Queue* - The ARN of a standard SQS queue.
   * * *Topic* - The ARN of a standard SNS topic.
   * * *Event Bus* - The ARN of an Amazon EventBridge event bus.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-destinationconfig)
   */
  public fun destinationConfig(): Any? = unwrap(this).getDestinationConfig()

  /**
   * The name of the Lambda function.
   *
   * *Minimum* : `1`
   *
   * *Maximum* : `64`
   *
   * *Pattern* : `([a-zA-Z0-9-_]+)`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-functionname)
   */
  public fun functionName(): String

  /**
   * The maximum age of a request that Lambda sends to a function for processing.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-maximumeventageinseconds)
   */
  public fun maximumEventAgeInSeconds(): Number? = unwrap(this).getMaximumEventAgeInSeconds()

  /**
   * The maximum number of times to retry when the function returns an error.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-maximumretryattempts)
   */
  public fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

  /**
   * The identifier of a version or alias.
   *
   * * *Version* - A version number.
   * * *Alias* - An alias name.
   * * *Latest* - To specify the unpublished version, use `$LATEST` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-qualifier)
   */
  public fun qualifier(): String

  /**
   * A builder for [CfnEventInvokeConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destinationConfig A destination for events after they have been sent to a function for
     * processing.
     * **Destinations** - *Function* - The Amazon Resource Name (ARN) of a Lambda function.
     *
     * * *Queue* - The ARN of a standard SQS queue.
     * * *Topic* - The ARN of a standard SNS topic.
     * * *Event Bus* - The ARN of an Amazon EventBridge event bus.
     */
    public fun destinationConfig(destinationConfig: IResolvable)

    /**
     * @param destinationConfig A destination for events after they have been sent to a function for
     * processing.
     * **Destinations** - *Function* - The Amazon Resource Name (ARN) of a Lambda function.
     *
     * * *Queue* - The ARN of a standard SQS queue.
     * * *Topic* - The ARN of a standard SNS topic.
     * * *Event Bus* - The ARN of an Amazon EventBridge event bus.
     */
    public fun destinationConfig(destinationConfig: CfnEventInvokeConfig.DestinationConfigProperty)

    /**
     * @param destinationConfig A destination for events after they have been sent to a function for
     * processing.
     * **Destinations** - *Function* - The Amazon Resource Name (ARN) of a Lambda function.
     *
     * * *Queue* - The ARN of a standard SQS queue.
     * * *Topic* - The ARN of a standard SNS topic.
     * * *Event Bus* - The ARN of an Amazon EventBridge event bus.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("64b99df99a06cbb8645d797fcd6c72bf465a89145ba509290b04eb1839175f1a")
    public
        fun destinationConfig(destinationConfig: CfnEventInvokeConfig.DestinationConfigProperty.Builder.() -> Unit)

    /**
     * @param functionName The name of the Lambda function. 
     * *Minimum* : `1`
     *
     * *Maximum* : `64`
     *
     * *Pattern* : `([a-zA-Z0-9-_]+)`
     */
    public fun functionName(functionName: String)

    /**
     * @param maximumEventAgeInSeconds The maximum age of a request that Lambda sends to a function
     * for processing.
     */
    public fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number)

    /**
     * @param maximumRetryAttempts The maximum number of times to retry when the function returns an
     * error.
     */
    public fun maximumRetryAttempts(maximumRetryAttempts: Number)

    /**
     * @param qualifier The identifier of a version or alias. 
     * * *Version* - A version number.
     * * *Alias* - An alias name.
     * * *Latest* - To specify the unpublished version, use `$LATEST` .
     */
    public fun qualifier(qualifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnEventInvokeConfigProps.Builder
        = software.amazon.awscdk.services.lambda.CfnEventInvokeConfigProps.builder()

    /**
     * @param destinationConfig A destination for events after they have been sent to a function for
     * processing.
     * **Destinations** - *Function* - The Amazon Resource Name (ARN) of a Lambda function.
     *
     * * *Queue* - The ARN of a standard SQS queue.
     * * *Topic* - The ARN of a standard SNS topic.
     * * *Event Bus* - The ARN of an Amazon EventBridge event bus.
     */
    override fun destinationConfig(destinationConfig: IResolvable) {
      cdkBuilder.destinationConfig(destinationConfig.let(IResolvable::unwrap))
    }

    /**
     * @param destinationConfig A destination for events after they have been sent to a function for
     * processing.
     * **Destinations** - *Function* - The Amazon Resource Name (ARN) of a Lambda function.
     *
     * * *Queue* - The ARN of a standard SQS queue.
     * * *Topic* - The ARN of a standard SNS topic.
     * * *Event Bus* - The ARN of an Amazon EventBridge event bus.
     */
    override
        fun destinationConfig(destinationConfig: CfnEventInvokeConfig.DestinationConfigProperty) {
      cdkBuilder.destinationConfig(destinationConfig.let(CfnEventInvokeConfig.DestinationConfigProperty::unwrap))
    }

    /**
     * @param destinationConfig A destination for events after they have been sent to a function for
     * processing.
     * **Destinations** - *Function* - The Amazon Resource Name (ARN) of a Lambda function.
     *
     * * *Queue* - The ARN of a standard SQS queue.
     * * *Topic* - The ARN of a standard SNS topic.
     * * *Event Bus* - The ARN of an Amazon EventBridge event bus.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("64b99df99a06cbb8645d797fcd6c72bf465a89145ba509290b04eb1839175f1a")
    override
        fun destinationConfig(destinationConfig: CfnEventInvokeConfig.DestinationConfigProperty.Builder.() -> Unit):
        Unit = destinationConfig(CfnEventInvokeConfig.DestinationConfigProperty(destinationConfig))

    /**
     * @param functionName The name of the Lambda function. 
     * *Minimum* : `1`
     *
     * *Maximum* : `64`
     *
     * *Pattern* : `([a-zA-Z0-9-_]+)`
     */
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    /**
     * @param maximumEventAgeInSeconds The maximum age of a request that Lambda sends to a function
     * for processing.
     */
    override fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number) {
      cdkBuilder.maximumEventAgeInSeconds(maximumEventAgeInSeconds)
    }

    /**
     * @param maximumRetryAttempts The maximum number of times to retry when the function returns an
     * error.
     */
    override fun maximumRetryAttempts(maximumRetryAttempts: Number) {
      cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
    }

    /**
     * @param qualifier The identifier of a version or alias. 
     * * *Version* - A version number.
     * * *Alias* - An alias name.
     * * *Latest* - To specify the unpublished version, use `$LATEST` .
     */
    override fun qualifier(qualifier: String) {
      cdkBuilder.qualifier(qualifier)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnEventInvokeConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.CfnEventInvokeConfigProps,
  ) : CdkObject(cdkObject), CfnEventInvokeConfigProps {
    /**
     * A destination for events after they have been sent to a function for processing.
     *
     * **Destinations** - *Function* - The Amazon Resource Name (ARN) of a Lambda function.
     *
     * * *Queue* - The ARN of a standard SQS queue.
     * * *Topic* - The ARN of a standard SNS topic.
     * * *Event Bus* - The ARN of an Amazon EventBridge event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-destinationconfig)
     */
    override fun destinationConfig(): Any? = unwrap(this).getDestinationConfig()

    /**
     * The name of the Lambda function.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `64`
     *
     * *Pattern* : `([a-zA-Z0-9-_]+)`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-functionname)
     */
    override fun functionName(): String = unwrap(this).getFunctionName()

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-maximumeventageinseconds)
     */
    override fun maximumEventAgeInSeconds(): Number? = unwrap(this).getMaximumEventAgeInSeconds()

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-maximumretryattempts)
     */
    override fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

    /**
     * The identifier of a version or alias.
     *
     * * *Version* - A version number.
     * * *Alias* - An alias name.
     * * *Latest* - To specify the unpublished version, use `$LATEST` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-qualifier)
     */
    override fun qualifier(): String = unwrap(this).getQualifier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventInvokeConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventInvokeConfigProps):
        CfnEventInvokeConfigProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEventInvokeConfigProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventInvokeConfigProps):
        software.amazon.awscdk.services.lambda.CfnEventInvokeConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.CfnEventInvokeConfigProps
  }
}
