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

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition
import kotlin.String

@CdkDslMarker
public class CfnCalculatedAttributeDefinitionThresholdPropertyDsl {
    private val cdkBuilder: CfnCalculatedAttributeDefinition.ThresholdProperty.Builder =
        CfnCalculatedAttributeDefinition.ThresholdProperty.builder()

    public fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnCalculatedAttributeDefinition.ThresholdProperty = cdkBuilder.build()
}
