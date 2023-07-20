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
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.ecs.LinuxParameters
import software.constructs.Construct
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class LinuxParametersDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: LinuxParameters.Builder = LinuxParameters.Builder.create(scope, id)

    public fun initProcessEnabled(initProcessEnabled: Boolean) {
        cdkBuilder.initProcessEnabled(initProcessEnabled)
    }

    public fun maxSwap(maxSwap: Size) {
        cdkBuilder.maxSwap(maxSwap)
    }

    public fun sharedMemorySize(sharedMemorySize: Number) {
        cdkBuilder.sharedMemorySize(sharedMemorySize)
    }

    public fun swappiness(swappiness: Number) {
        cdkBuilder.swappiness(swappiness)
    }

    public fun build(): LinuxParameters = cdkBuilder.build()
}
