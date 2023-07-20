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

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent
import kotlin.String

@CdkDslMarker
public class CfnComponentMutationActionSetStateParameterPropertyDsl {
    private val cdkBuilder: CfnComponent.MutationActionSetStateParameterProperty.Builder =
        CfnComponent.MutationActionSetStateParameterProperty.builder()

    public fun componentName(componentName: String) {
        cdkBuilder.componentName(componentName)
    }

    public fun `property`(`property`: String) {
        cdkBuilder.`property`(`property`)
    }

    public fun `set`(`set`: IResolvable) {
        cdkBuilder.`set`(`set`)
    }

    public fun `set`(`set`: CfnComponent.ComponentPropertyProperty) {
        cdkBuilder.`set`(`set`)
    }

    public fun build(): CfnComponent.MutationActionSetStateParameterProperty = cdkBuilder.build()
}
