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
 * Fail fail = Fail.Builder.create(this, "Fail")
 * .errorPath(JsonPath.stringAt("$.someError"))
 * .causePath(JsonPath.stringAt("$.someCause"))
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
     * Default: - No description
     *
     * @param cause A description for the cause of the failure.
     */
    public fun cause(cause: String) {
        cdkBuilder.cause(cause)
    }

    /**
     * JsonPath expression to select part of the state to be the cause to this state.
     *
     * Default: - No cause path
     *
     * @param causePath JsonPath expression to select part of the state to be the cause to this
     *   state.
     */
    public fun causePath(causePath: String) {
        cdkBuilder.causePath(causePath)
    }

    /**
     * An optional description for this state.
     *
     * Default: - No comment
     *
     * @param comment An optional description for this state.
     */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * Error code used to represent this failure.
     *
     * Default: - No error code
     *
     * @param error Error code used to represent this failure.
     */
    public fun error(error: String) {
        cdkBuilder.error(error)
    }

    /**
     * JsonPath expression to select part of the state to be the error to this state.
     *
     * Default: - No error path
     *
     * @param errorPath JsonPath expression to select part of the state to be the error to this
     *   state.
     */
    public fun errorPath(errorPath: String) {
        cdkBuilder.errorPath(errorPath)
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

    public fun build(): Fail = cdkBuilder.build()
}
