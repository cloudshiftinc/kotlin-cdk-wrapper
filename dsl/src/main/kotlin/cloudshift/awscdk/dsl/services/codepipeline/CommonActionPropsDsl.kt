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

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codepipeline.CommonActionProps
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CommonActionPropsDsl {
    private val cdkBuilder: CommonActionProps.Builder = CommonActionProps.builder()

    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): CommonActionProps = cdkBuilder.build()
}
