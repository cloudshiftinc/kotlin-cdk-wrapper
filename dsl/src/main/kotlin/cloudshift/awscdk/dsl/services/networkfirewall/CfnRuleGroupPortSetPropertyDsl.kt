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

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRuleGroupPortSetPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.PortSetProperty.Builder =
        CfnRuleGroup.PortSetProperty.builder()

    private val _definition: MutableList<String> = mutableListOf()

    public fun definition(vararg definition: String) {
        _definition.addAll(listOf(*definition))
    }

    public fun definition(definition: Collection<String>) {
        _definition.addAll(definition)
    }

    public fun build(): CfnRuleGroup.PortSetProperty {
        if (_definition.isNotEmpty()) cdkBuilder.definition(_definition)
        return cdkBuilder.build()
    }
}
