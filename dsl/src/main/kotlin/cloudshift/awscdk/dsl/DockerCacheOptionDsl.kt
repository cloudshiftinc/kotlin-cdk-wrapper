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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.DockerCacheOption
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class DockerCacheOptionDsl {
    private val cdkBuilder: DockerCacheOption.Builder = DockerCacheOption.builder()

    public fun params(params: Map<String, String>) {
        cdkBuilder.params(params)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): DockerCacheOption = cdkBuilder.build()
}
