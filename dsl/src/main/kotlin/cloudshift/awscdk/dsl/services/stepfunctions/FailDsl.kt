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

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.Fail
import software.constructs.Construct

/**
 * Define a Fail state in the state machine.
 *
 * Reaching a Fail state terminates the state execution in failure.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.lambda.*;
 * Function submitLambda;
 * Function getStatusLambda;
 * LambdaInvoke submitJob = LambdaInvoke.Builder.create(this, "Submit Job")
 * .lambdaFunction(submitLambda)
 * // Lambda's result is in the attribute `guid`
 * .outputPath("$.guid")
 * .build();
 * Wait waitX = Wait.Builder.create(this, "Wait X Seconds")
 * .time(WaitTime.secondsPath("$.waitSeconds"))
 * .build();
 * LambdaInvoke getStatus = LambdaInvoke.Builder.create(this, "Get Job Status")
 * .lambdaFunction(getStatusLambda)
 * // Pass just the field named "guid" into the Lambda, put the
 * // Lambda's result in a field called "status" in the response
 * .inputPath("$.guid")
 * .outputPath("$.status")
 * .build();
 * Fail jobFailed = Fail.Builder.create(this, "Job Failed")
 * .cause("AWS Batch Job Failed")
 * .error("DescribeJob returned FAILED")
 * .build();
 * LambdaInvoke finalStatus = LambdaInvoke.Builder.create(this, "Get Final Job Status")
 * .lambdaFunction(getStatusLambda)
 * // Use "guid" field as input
 * .inputPath("$.guid")
 * .outputPath("$.Payload")
 * .build();
 * Chain definition = submitJob.next(waitX).next(getStatus).next(new Choice(this, "Job
 * Complete?").when(Condition.stringEquals("$.status", "FAILED"),
 * jobFailed).when(Condition.stringEquals("$.status", "SUCCEEDED"), finalStatus).otherwise(waitX));
 * StateMachine.Builder.create(this, "StateMachine")
 * .definition(definition)
 * .timeout(Duration.minutes(5))
 * .build();
 * ```
 */
@CdkDslMarker
public class FailDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Fail.Builder = Fail.Builder.create(scope, id)

    /**
     * A description for the cause of the failure.
     *
     * Default: No description
     *
     * @param cause A description for the cause of the failure.
     */
    public fun cause(cause: String) {
        cdkBuilder.cause(cause)
    }

    /**
     * An optional description for this state.
     *
     * Default: No comment
     *
     * @param comment An optional description for this state.
     */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * Error code used to represent this failure.
     *
     * Default: No error code
     *
     * @param error Error code used to represent this failure.
     */
    public fun error(error: String) {
        cdkBuilder.error(error)
    }

    public fun build(): Fail = cdkBuilder.build()
}
