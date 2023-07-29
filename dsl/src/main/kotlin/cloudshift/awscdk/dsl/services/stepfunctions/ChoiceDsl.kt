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
import software.amazon.awscdk.services.stepfunctions.Choice
import software.constructs.Construct

/**
 * Define a Choice in the state machine.
 *
 * A choice state can be used to make decisions based on the execution state.
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
public class ChoiceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Choice.Builder = Choice.Builder.create(scope, id)

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
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value DISCARD, which will cause the effective input to be the empty
     * object {}.
     *
     * Default: $
     *
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     *   state.
     */
    public fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
    }

    /**
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value DISCARD, which will cause the effective output to be the empty
     * object {}.
     *
     * Default: $
     *
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     *   state.
     */
    public fun outputPath(outputPath: String) {
        cdkBuilder.outputPath(outputPath)
    }

    public fun build(): Choice = cdkBuilder.build()
}
