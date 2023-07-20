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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnRule
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnRuleInputTransformerPropertyDsl {
    private val cdkBuilder: CfnRule.InputTransformerProperty.Builder =
        CfnRule.InputTransformerProperty.builder()

    public fun inputPathsMap(inputPathsMap: Map<String, String>) {
        cdkBuilder.inputPathsMap(inputPathsMap)
    }

    public fun inputPathsMap(inputPathsMap: IResolvable) {
        cdkBuilder.inputPathsMap(inputPathsMap)
    }

    public fun inputTemplate(inputTemplate: String) {
        cdkBuilder.inputTemplate(inputTemplate)
    }

    public fun build(): CfnRule.InputTransformerProperty = cdkBuilder.build()
}
