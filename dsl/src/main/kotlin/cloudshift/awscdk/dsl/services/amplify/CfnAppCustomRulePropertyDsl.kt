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

package cloudshift.awscdk.dsl.services.amplify

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.amplify.CfnApp
import kotlin.String

@CdkDslMarker
public class CfnAppCustomRulePropertyDsl {
    private val cdkBuilder: CfnApp.CustomRuleProperty.Builder = CfnApp.CustomRuleProperty.builder()

    public fun condition(condition: String) {
        cdkBuilder.condition(condition)
    }

    public fun source(source: String) {
        cdkBuilder.source(source)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun target(target: String) {
        cdkBuilder.target(target)
    }

    public fun build(): CfnApp.CustomRuleProperty = cdkBuilder.build()
}
