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

package cloudshift.awscdk.dsl.assertions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.assertions.MatchFailure
import software.amazon.awscdk.assertions.Matcher

/**
 * Match failure details.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.assertions.*;
 * Matcher matcher;
 * MatchFailure matchFailure = MatchFailure.builder()
 * .matcher(matcher)
 * .message("message")
 * .path(List.of("path"))
 * // the properties below are optional
 * .cost(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class MatchFailureDsl {
    private val cdkBuilder: MatchFailure.Builder = MatchFailure.builder()

    private val _path: MutableList<String> = mutableListOf()

    /** @param cost The cost of this particular mismatch. */
    public fun cost(cost: Number) {
        cdkBuilder.cost(cost)
    }

    /** @param matcher The matcher that had the failure. */
    public fun matcher(matcher: Matcher) {
        cdkBuilder.matcher(matcher)
    }

    /** @param message Failure message. */
    public fun message(message: String) {
        cdkBuilder.message(message)
    }

    /**
     * @param path The relative path in the target where the failure occurred. If the failure
     *   occurred at root of the match tree, set the path to an empty list. If it occurs in the 5th
     *   index of an array nested within the 'foo' key of an object, set the path as `['/foo',
     *   '[5]']`.
     */
    public fun path(vararg path: String) {
        _path.addAll(listOf(*path))
    }

    /**
     * @param path The relative path in the target where the failure occurred. If the failure
     *   occurred at root of the match tree, set the path to an empty list. If it occurs in the 5th
     *   index of an array nested within the 'foo' key of an object, set the path as `['/foo',
     *   '[5]']`.
     */
    public fun path(path: Collection<String>) {
        _path.addAll(path)
    }

    public fun build(): MatchFailure {
        if (_path.isNotEmpty()) cdkBuilder.path(_path)
        return cdkBuilder.build()
    }
}
