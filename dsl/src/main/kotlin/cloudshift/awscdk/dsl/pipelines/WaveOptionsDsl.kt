@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.pipelines.Step
import software.amazon.awscdk.pipelines.WaveOptions
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class WaveOptionsDsl {
    private val cdkBuilder: WaveOptions.Builder = WaveOptions.builder()

    private val _post: MutableList<Step> = mutableListOf()

    private val _pre: MutableList<Step> = mutableListOf()

    public fun post(vararg post: Step) {
        _post.addAll(listOf(*post))
    }

    public fun post(post: Collection<Step>) {
        _post.addAll(post)
    }

    public fun pre(vararg pre: Step) {
        _pre.addAll(listOf(*pre))
    }

    public fun pre(pre: Collection<Step>) {
        _pre.addAll(pre)
    }

    public fun build(): WaveOptions {
        if (_post.isNotEmpty()) cdkBuilder.post(_post)
        if (_pre.isNotEmpty()) cdkBuilder.pre(_pre)
        return cdkBuilder.build()
    }
}
