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

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfigurationProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDistributionConfigurationPropsDsl {
    private val cdkBuilder: CfnDistributionConfigurationProps.Builder =
        CfnDistributionConfigurationProps.builder()

    private val _distributions: MutableList<Any> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun distributions(vararg distributions: Any) {
        _distributions.addAll(listOf(*distributions))
    }

    public fun distributions(distributions: Collection<Any>) {
        _distributions.addAll(distributions)
    }

    public fun distributions(distributions: IResolvable) {
        cdkBuilder.distributions(distributions)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnDistributionConfigurationProps {
        if (_distributions.isNotEmpty()) cdkBuilder.distributions(_distributions)
        return cdkBuilder.build()
    }
}
