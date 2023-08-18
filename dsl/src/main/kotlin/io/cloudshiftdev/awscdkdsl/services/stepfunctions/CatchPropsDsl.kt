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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.stepfunctions.CatchProps

/**
 * Error handler details.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.*;
 * CatchProps catchProps = CatchProps.builder()
 * .errors(List.of("errors"))
 * .resultPath("resultPath")
 * .build();
 * ```
 */
@CdkDslMarker
public class CatchPropsDsl {
    private val cdkBuilder: CatchProps.Builder = CatchProps.builder()

    private val _errors: MutableList<String> = mutableListOf()

    /**
     * @param errors Errors to recover from by going to the given state. A list of error strings to
     *   retry, which can be either predefined errors (for example Errors.NoChoiceMatched) or a
     *   self-defined error.
     */
    public fun errors(vararg errors: String) {
        _errors.addAll(listOf(*errors))
    }

    /**
     * @param errors Errors to recover from by going to the given state. A list of error strings to
     *   retry, which can be either predefined errors (for example Errors.NoChoiceMatched) or a
     *   self-defined error.
     */
    public fun errors(errors: Collection<String>) {
        _errors.addAll(errors)
    }

    /**
     * @param resultPath JSONPath expression to indicate where to inject the error data. May also be
     *   the special value DISCARD, which will cause the error data to be discarded.
     */
    public fun resultPath(resultPath: String) {
        cdkBuilder.resultPath(resultPath)
    }

    public fun build(): CatchProps {
        if (_errors.isNotEmpty()) cdkBuilder.errors(_errors)
        return cdkBuilder.build()
    }
}
