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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.stepfunctions.Parallel
import software.constructs.Construct

/**
 * Define a Parallel state in the state machine.
 *
 * A Parallel state can be used to run one or more state machines at the same time.
 *
 * The Result of a Parallel state is an array of the results of its substatemachines.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.Stack;
 * import software.constructs.Construct;
 * import software.amazon.awscdk.services.stepfunctions.*;
 * public class MyJobProps {
 * private String jobFlavor;
 * public String getJobFlavor() {
 * return this.jobFlavor;
 * }
 * public MyJobProps jobFlavor(String jobFlavor) {
 * this.jobFlavor = jobFlavor;
 * return this;
 * }
 * }
 * public class MyJob extends StateMachineFragment {
 * public final State startState;
 * public final INextable[] endStates;
 * public MyJob(Construct parent, String id, MyJobProps props) {
 * super(parent, id);
 * Choice choice = new Choice(this, "Choice").when(Condition.stringEquals("$.branch", "left"), new
 * Pass(this, "Left Branch")).when(Condition.stringEquals("$.branch", "right"), new Pass(this, "Right
 * Branch"));
 * // ...
 * this.startState = choice;
 * this.endStates = choice.afterwards().getEndStates();
 * }
 * }
 * public class MyStack extends Stack {
 * public MyStack(Construct scope, String id) {
 * super(scope, id);
 * // Do 3 different variants of MyJob in parallel
 * Parallel parallel = new Parallel(this, "All jobs").branch(new MyJob(this, "Quick", new
 * MyJobProps().jobFlavor("quick")).prefixStates()).branch(new MyJob(this, "Medium", new
 * MyJobProps().jobFlavor("medium")).prefixStates()).branch(new MyJob(this, "Slow", new
 * MyJobProps().jobFlavor("slow")).prefixStates());
 * StateMachine.Builder.create(this, "MyStateMachine")
 * .definitionBody(DefinitionBody.fromChainable(parallel))
 * .build();
 * }
 * }
 * ```
 */
@CdkDslMarker
public class ParallelDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Parallel.Builder = Parallel.Builder.create(scope, id)

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
     * May also be the special value JsonPath.DISCARD, which will cause the effective input to be
     * the empty object {}.
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
     * May also be the special value JsonPath.DISCARD, which will cause the effective output to be
     * the empty object {}.
     *
     * Default: $
     *
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     *   state.
     */
    public fun outputPath(outputPath: String) {
        cdkBuilder.outputPath(outputPath)
    }

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's input to become
     * its output.
     *
     * Default: $
     *
     * @param resultPath JSONPath expression to indicate where to inject the state's output.
     */
    public fun resultPath(resultPath: String) {
        cdkBuilder.resultPath(resultPath)
    }

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static or selected from
     * the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     *
     * @param resultSelector The JSON that will replace the state's raw result and become the
     *   effective result before ResultPath is applied.
     */
    public fun resultSelector(resultSelector: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(resultSelector)
        cdkBuilder.resultSelector(builder.map)
    }

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static or selected from
     * the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     *
     * @param resultSelector The JSON that will replace the state's raw result and become the
     *   effective result before ResultPath is applied.
     */
    public fun resultSelector(resultSelector: Map<String, Any>) {
        cdkBuilder.resultSelector(resultSelector)
    }

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state.
     */
    public fun stateName(stateName: String) {
        cdkBuilder.stateName(stateName)
    }

    public fun build(): Parallel = cdkBuilder.build()
}
