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
import software.amazon.awscdk.services.stepfunctions.FailProps

/**
 * Properties for defining a Fail state.
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
public class FailPropsDsl {
    private val cdkBuilder: FailProps.Builder = FailProps.builder()

    /** @param cause A description for the cause of the failure. */
    public fun cause(cause: String) {
        cdkBuilder.cause(cause)
    }

    /**
     * @param causePath JsonPath expression to select part of the state to be the cause to this
     *   state.
     */
    public fun causePath(causePath: String) {
        cdkBuilder.causePath(causePath)
    }

    /** @param comment An optional description for this state. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /** @param error Error code used to represent this failure. */
    public fun error(error: String) {
        cdkBuilder.error(error)
    }

    /**
     * @param errorPath JsonPath expression to select part of the state to be the error to this
     *   state.
     */
    public fun errorPath(errorPath: String) {
        cdkBuilder.errorPath(errorPath)
    }

    /** @param stateName Optional name for this state. */
    public fun stateName(stateName: String) {
        cdkBuilder.stateName(stateName)
    }

    public fun build(): FailProps = cdkBuilder.build()
}
