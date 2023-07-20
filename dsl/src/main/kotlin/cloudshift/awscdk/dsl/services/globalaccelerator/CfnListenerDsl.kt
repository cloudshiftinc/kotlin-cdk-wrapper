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

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.globalaccelerator.CfnListener
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnListenerDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnListener.Builder = CfnListener.Builder.create(scope, id)

    private val _portRanges: MutableList<Any> = mutableListOf()

    public fun acceleratorArn(acceleratorArn: String) {
        cdkBuilder.acceleratorArn(acceleratorArn)
    }

    public fun clientAffinity(clientAffinity: String) {
        cdkBuilder.clientAffinity(clientAffinity)
    }

    public fun portRanges(vararg portRanges: Any) {
        _portRanges.addAll(listOf(*portRanges))
    }

    public fun portRanges(portRanges: Collection<Any>) {
        _portRanges.addAll(portRanges)
    }

    public fun portRanges(portRanges: IResolvable) {
        cdkBuilder.portRanges(portRanges)
    }

    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    public fun build(): CfnListener {
        if (_portRanges.isNotEmpty()) cdkBuilder.portRanges(_portRanges)
        return cdkBuilder.build()
    }
}
