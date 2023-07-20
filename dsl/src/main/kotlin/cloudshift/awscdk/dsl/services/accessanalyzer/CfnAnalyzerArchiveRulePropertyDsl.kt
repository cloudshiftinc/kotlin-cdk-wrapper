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

package cloudshift.awscdk.dsl.services.accessanalyzer

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAnalyzerArchiveRulePropertyDsl {
    private val cdkBuilder: CfnAnalyzer.ArchiveRuleProperty.Builder =
        CfnAnalyzer.ArchiveRuleProperty.builder()

    private val _filter: MutableList<Any> = mutableListOf()

    public fun filter(vararg filter: Any) {
        _filter.addAll(listOf(*filter))
    }

    public fun filter(filter: Collection<Any>) {
        _filter.addAll(filter)
    }

    public fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter)
    }

    public fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
    }

    public fun build(): CfnAnalyzer.ArchiveRuleProperty {
        if (_filter.isNotEmpty()) cdkBuilder.filter(_filter)
        return cdkBuilder.build()
    }
}
