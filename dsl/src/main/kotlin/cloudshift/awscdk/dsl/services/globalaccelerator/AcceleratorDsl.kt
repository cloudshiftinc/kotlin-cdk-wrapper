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

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.globalaccelerator.Accelerator
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class AcceleratorDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Accelerator.Builder = Accelerator.Builder.create(scope, id)

    public fun acceleratorName(acceleratorName: String) {
        cdkBuilder.acceleratorName(acceleratorName)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): Accelerator = cdkBuilder.build()
}
