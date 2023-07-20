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

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnConfigRule
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnConfigRuleSourcePropertyDsl {
    private val cdkBuilder: CfnConfigRule.SourceProperty.Builder =
        CfnConfigRule.SourceProperty.builder()

    private val _sourceDetails: MutableList<Any> = mutableListOf()

    public fun customPolicyDetails(customPolicyDetails: IResolvable) {
        cdkBuilder.customPolicyDetails(customPolicyDetails)
    }

    public fun customPolicyDetails(customPolicyDetails: CfnConfigRule.CustomPolicyDetailsProperty) {
        cdkBuilder.customPolicyDetails(customPolicyDetails)
    }

    public fun owner(owner: String) {
        cdkBuilder.owner(owner)
    }

    public fun sourceDetails(vararg sourceDetails: Any) {
        _sourceDetails.addAll(listOf(*sourceDetails))
    }

    public fun sourceDetails(sourceDetails: Collection<Any>) {
        _sourceDetails.addAll(sourceDetails)
    }

    public fun sourceDetails(sourceDetails: IResolvable) {
        cdkBuilder.sourceDetails(sourceDetails)
    }

    public fun sourceIdentifier(sourceIdentifier: String) {
        cdkBuilder.sourceIdentifier(sourceIdentifier)
    }

    public fun build(): CfnConfigRule.SourceProperty {
        if (_sourceDetails.isNotEmpty()) cdkBuilder.sourceDetails(_sourceDetails)
        return cdkBuilder.build()
    }
}
