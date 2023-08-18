@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnEventInvokeConfig
import software.constructs.Construct

/**
 * The `AWS::Lambda::EventInvokeConfig` resource configures options for
 * [asynchronous invocation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html) on
 * a version or an alias.
 *
 * By default, Lambda retries an asynchronous invocation twice if the function returns an error. It
 * retains events in a queue for up to six hours. When an event fails all processing attempts or
 * stays in the asynchronous invocation queue for too long, Lambda discards it.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * CfnEventInvokeConfig cfnEventInvokeConfig = CfnEventInvokeConfig.Builder.create(this,
 * "MyCfnEventInvokeConfig")
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
@CdkDslMarker
public class CfnEventInvokeConfigDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEventInvokeConfig.Builder =
        CfnEventInvokeConfig.Builder.create(scope, id)

    /**
     * A destination for events after they have been sent to a function for processing.
     *
     * **Destinations** - *Function* - The Amazon Resource Name (ARN) of a Lambda function.
     * * *Queue* - The ARN of a standard SQS queue.
     * * *Topic* - The ARN of a standard SNS topic.
     * * *Event Bus* - The ARN of an Amazon EventBridge event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-destinationconfig)
     *
     * @param destinationConfig A destination for events after they have been sent to a function for
     *   processing.
     */
    public fun destinationConfig(destinationConfig: IResolvable) {
        cdkBuilder.destinationConfig(destinationConfig)
    }

    /**
     * A destination for events after they have been sent to a function for processing.
     *
     * **Destinations** - *Function* - The Amazon Resource Name (ARN) of a Lambda function.
     * * *Queue* - The ARN of a standard SQS queue.
     * * *Topic* - The ARN of a standard SNS topic.
     * * *Event Bus* - The ARN of an Amazon EventBridge event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-destinationconfig)
     *
     * @param destinationConfig A destination for events after they have been sent to a function for
     *   processing.
     */
    public fun destinationConfig(
        destinationConfig: CfnEventInvokeConfig.DestinationConfigProperty
    ) {
        cdkBuilder.destinationConfig(destinationConfig)
    }

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
     *
     * @param functionName The name of the Lambda function.
     */
    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-maximumeventageinseconds)
     *
     * @param maximumEventAgeInSeconds The maximum age of a request that Lambda sends to a function
     *   for processing.
     */
    public fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number) {
        cdkBuilder.maximumEventAgeInSeconds(maximumEventAgeInSeconds)
    }

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-maximumretryattempts)
     *
     * @param maximumRetryAttempts The maximum number of times to retry when the function returns an
     *   error.
     */
    public fun maximumRetryAttempts(maximumRetryAttempts: Number) {
        cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
    }

    /**
     * The identifier of a version or alias.
     * * *Version* - A version number.
     * * *Alias* - An alias name.
     * * *Latest* - To specify the unpublished version, use `$LATEST` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-qualifier)
     *
     * @param qualifier The identifier of a version or alias.
     */
    public fun qualifier(qualifier: String) {
        cdkBuilder.qualifier(qualifier)
    }

    public fun build(): CfnEventInvokeConfig = cdkBuilder.build()
}
