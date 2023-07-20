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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.EcsOptimizedImageOptions
import kotlin.Boolean

@CdkDslMarker
public class EcsOptimizedImageOptionsDsl {
    private val cdkBuilder: EcsOptimizedImageOptions.Builder = EcsOptimizedImageOptions.builder()

    public fun cachedInContext(cachedInContext: Boolean) {
        cdkBuilder.cachedInContext(cachedInContext)
    }

    public fun build(): EcsOptimizedImageOptions = cdkBuilder.build()
}
