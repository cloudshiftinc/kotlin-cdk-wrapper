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
import software.amazon.awscdk.services.waf.regional.CfnRule
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnRulePredicatePropertyDsl {
    private val cdkBuilder: CfnRule.PredicateProperty.Builder = CfnRule.PredicateProperty.builder()

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

    public fun build(): CfnRule.PredicateProperty = cdkBuilder.build()
}
