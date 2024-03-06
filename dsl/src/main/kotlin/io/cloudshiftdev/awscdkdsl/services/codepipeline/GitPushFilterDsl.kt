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

package io.cloudshiftdev.awscdkdsl.services.codepipeline

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codepipeline.GitPushFilter

/**
 * Git push filter for trigger.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * GitPushFilter gitPushFilter = GitPushFilter.builder()
 * .tagsExcludes(List.of("tagsExcludes"))
 * .tagsIncludes(List.of("tagsIncludes"))
 * .build();
 * ```
 */
@CdkDslMarker
public class GitPushFilterDsl {
    private val cdkBuilder: GitPushFilter.Builder = GitPushFilter.builder()

    private val _tagsExcludes: MutableList<String> = mutableListOf()

    private val _tagsIncludes: MutableList<String> = mutableListOf()

    /**
     * @param tagsExcludes The list of patterns of Git tags that, when pushed, are to be excluded
     *   from starting the pipeline. You can filter with glob patterns. The `tagsExcludes` takes
     *   priority over the `tagsIncludes`.
     *
     * Maximum length of this array is 8.
     */
    public fun tagsExcludes(vararg tagsExcludes: String) {
        _tagsExcludes.addAll(listOf(*tagsExcludes))
    }

    /**
     * @param tagsExcludes The list of patterns of Git tags that, when pushed, are to be excluded
     *   from starting the pipeline. You can filter with glob patterns. The `tagsExcludes` takes
     *   priority over the `tagsIncludes`.
     *
     * Maximum length of this array is 8.
     */
    public fun tagsExcludes(tagsExcludes: Collection<String>) {
        _tagsExcludes.addAll(tagsExcludes)
    }

    /**
     * @param tagsIncludes The list of patterns of Git tags that, when pushed, are to be included as
     *   criteria that starts the pipeline. You can filter with glob patterns. The `tagsExcludes`
     *   takes priority over the `tagsIncludes`.
     *
     * Maximum length of this array is 8.
     */
    public fun tagsIncludes(vararg tagsIncludes: String) {
        _tagsIncludes.addAll(listOf(*tagsIncludes))
    }

    /**
     * @param tagsIncludes The list of patterns of Git tags that, when pushed, are to be included as
     *   criteria that starts the pipeline. You can filter with glob patterns. The `tagsExcludes`
     *   takes priority over the `tagsIncludes`.
     *
     * Maximum length of this array is 8.
     */
    public fun tagsIncludes(tagsIncludes: Collection<String>) {
        _tagsIncludes.addAll(tagsIncludes)
    }

    public fun build(): GitPushFilter {
        if (_tagsExcludes.isNotEmpty()) cdkBuilder.tagsExcludes(_tagsExcludes)
        if (_tagsIncludes.isNotEmpty()) cdkBuilder.tagsIncludes(_tagsIncludes)
        return cdkBuilder.build()
    }
}
