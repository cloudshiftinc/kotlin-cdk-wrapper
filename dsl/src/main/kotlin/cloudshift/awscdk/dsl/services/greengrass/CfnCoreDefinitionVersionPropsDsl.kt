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

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersionProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnCoreDefinitionVersionPropsDsl {
    private val cdkBuilder: CfnCoreDefinitionVersionProps.Builder =
        CfnCoreDefinitionVersionProps.builder()

    private val _cores: MutableList<Any> = mutableListOf()

    public fun coreDefinitionId(coreDefinitionId: String) {
        cdkBuilder.coreDefinitionId(coreDefinitionId)
    }

    public fun cores(vararg cores: Any) {
        _cores.addAll(listOf(*cores))
    }

    public fun cores(cores: Collection<Any>) {
        _cores.addAll(cores)
    }

    public fun cores(cores: IResolvable) {
        cdkBuilder.cores(cores)
    }

    public fun build(): CfnCoreDefinitionVersionProps {
        if (_cores.isNotEmpty()) cdkBuilder.cores(_cores)
        return cdkBuilder.build()
    }
}
