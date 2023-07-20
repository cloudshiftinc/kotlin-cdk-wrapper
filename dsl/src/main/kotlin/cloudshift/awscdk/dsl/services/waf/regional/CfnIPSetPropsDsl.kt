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
import software.amazon.awscdk.services.waf.regional.CfnIPSetProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnIPSetPropsDsl {
    private val cdkBuilder: CfnIPSetProps.Builder = CfnIPSetProps.builder()

    private val _ipSetDescriptors: MutableList<Any> = mutableListOf()

    public fun ipSetDescriptors(vararg ipSetDescriptors: Any) {
        _ipSetDescriptors.addAll(listOf(*ipSetDescriptors))
    }

    public fun ipSetDescriptors(ipSetDescriptors: Collection<Any>) {
        _ipSetDescriptors.addAll(ipSetDescriptors)
    }

    public fun ipSetDescriptors(ipSetDescriptors: IResolvable) {
        cdkBuilder.ipSetDescriptors(ipSetDescriptors)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnIPSetProps {
        if (_ipSetDescriptors.isNotEmpty()) cdkBuilder.ipSetDescriptors(_ipSetDescriptors)
        return cdkBuilder.build()
    }
}
