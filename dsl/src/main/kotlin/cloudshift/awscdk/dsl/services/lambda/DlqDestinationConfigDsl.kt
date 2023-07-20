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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lambda.DlqDestinationConfig
import kotlin.String

@CdkDslMarker
public class DlqDestinationConfigDsl {
    private val cdkBuilder: DlqDestinationConfig.Builder = DlqDestinationConfig.builder()

    public fun destination(destination: String) {
        cdkBuilder.destination(destination)
    }

    public fun build(): DlqDestinationConfig = cdkBuilder.build()
}
