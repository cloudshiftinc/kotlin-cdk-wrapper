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

package cloudshift.awscdk.dsl.services.ce

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ce.CfnCostCategory
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnCostCategoryDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCostCategory.Builder = CfnCostCategory.Builder.create(scope, id)

    public fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun ruleVersion(ruleVersion: String) {
        cdkBuilder.ruleVersion(ruleVersion)
    }

    public fun rules(rules: String) {
        cdkBuilder.rules(rules)
    }

    public fun splitChargeRules(splitChargeRules: String) {
        cdkBuilder.splitChargeRules(splitChargeRules)
    }

    public fun build(): CfnCostCategory = cdkBuilder.build()
}
