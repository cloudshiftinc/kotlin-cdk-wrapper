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
import software.amazon.awscdk.services.ecs.GenericLogDriver
import software.amazon.awscdk.services.ecs.Secret
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class GenericLogDriverDsl {
    private val cdkBuilder: GenericLogDriver.Builder = GenericLogDriver.Builder.create()

    public fun logDriver(logDriver: String) {
        cdkBuilder.logDriver(logDriver)
    }

    public fun options(options: Map<String, String>) {
        cdkBuilder.options(options)
    }

    public fun secretOptions(secretOptions: Map<String, Secret>) {
        cdkBuilder.secretOptions(secretOptions)
    }

    public fun build(): GenericLogDriver = cdkBuilder.build()
}
