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
import software.amazon.awscdk.services.ecs.Ulimit
import software.amazon.awscdk.services.ecs.UlimitName
import kotlin.Number

@CdkDslMarker
public class UlimitDsl {
    private val cdkBuilder: Ulimit.Builder = Ulimit.builder()

    public fun hardLimit(hardLimit: Number) {
        cdkBuilder.hardLimit(hardLimit)
    }

    public fun name(name: UlimitName) {
        cdkBuilder.name(name)
    }

    public fun softLimit(softLimit: Number) {
        cdkBuilder.softLimit(softLimit)
    }

    public fun build(): Ulimit = cdkBuilder.build()
}
