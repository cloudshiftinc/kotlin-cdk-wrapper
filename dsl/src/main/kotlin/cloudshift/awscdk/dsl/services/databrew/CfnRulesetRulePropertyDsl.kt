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

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnRuleset
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRulesetRulePropertyDsl {
    private val cdkBuilder: CfnRuleset.RuleProperty.Builder = CfnRuleset.RuleProperty.builder()

    private val _columnSelectors: MutableList<Any> = mutableListOf()

    private val _substitutionMap: MutableList<Any> = mutableListOf()

    public fun checkExpression(checkExpression: String) {
        cdkBuilder.checkExpression(checkExpression)
    }

    public fun columnSelectors(vararg columnSelectors: Any) {
        _columnSelectors.addAll(listOf(*columnSelectors))
    }

    public fun columnSelectors(columnSelectors: Collection<Any>) {
        _columnSelectors.addAll(columnSelectors)
    }

    public fun columnSelectors(columnSelectors: IResolvable) {
        cdkBuilder.columnSelectors(columnSelectors)
    }

    public fun disabled(disabled: Boolean) {
        cdkBuilder.disabled(disabled)
    }

    public fun disabled(disabled: IResolvable) {
        cdkBuilder.disabled(disabled)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun substitutionMap(vararg substitutionMap: Any) {
        _substitutionMap.addAll(listOf(*substitutionMap))
    }

    public fun substitutionMap(substitutionMap: Collection<Any>) {
        _substitutionMap.addAll(substitutionMap)
    }

    public fun substitutionMap(substitutionMap: IResolvable) {
        cdkBuilder.substitutionMap(substitutionMap)
    }

    public fun threshold(threshold: IResolvable) {
        cdkBuilder.threshold(threshold)
    }

    public fun threshold(threshold: CfnRuleset.ThresholdProperty) {
        cdkBuilder.threshold(threshold)
    }

    public fun build(): CfnRuleset.RuleProperty {
        if (_columnSelectors.isNotEmpty()) cdkBuilder.columnSelectors(_columnSelectors)
        if (_substitutionMap.isNotEmpty()) cdkBuilder.substitutionMap(_substitutionMap)
        return cdkBuilder.build()
    }
}
