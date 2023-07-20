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

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.regional.CfnRateBasedRule
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnRateBasedRulePredicatePropertyDsl {
    private val cdkBuilder: CfnRateBasedRule.PredicateProperty.Builder =
        CfnRateBasedRule.PredicateProperty.builder()

    public fun dataId(dataId: String) {
        cdkBuilder.dataId(dataId)
    }

    public fun negated(negated: Boolean) {
        cdkBuilder.negated(negated)
    }

    public fun negated(negated: IResolvable) {
        cdkBuilder.negated(negated)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnRateBasedRule.PredicateProperty = cdkBuilder.build()
}
