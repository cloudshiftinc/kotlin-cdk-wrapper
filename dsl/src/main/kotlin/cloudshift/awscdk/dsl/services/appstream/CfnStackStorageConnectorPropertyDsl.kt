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

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appstream.CfnStack
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnStackStorageConnectorPropertyDsl {
    private val cdkBuilder: CfnStack.StorageConnectorProperty.Builder =
        CfnStack.StorageConnectorProperty.builder()

    private val _domains: MutableList<String> = mutableListOf()

    public fun connectorType(connectorType: String) {
        cdkBuilder.connectorType(connectorType)
    }

    public fun domains(vararg domains: String) {
        _domains.addAll(listOf(*domains))
    }

    public fun domains(domains: Collection<String>) {
        _domains.addAll(domains)
    }

    public fun resourceIdentifier(resourceIdentifier: String) {
        cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    public fun build(): CfnStack.StorageConnectorProperty {
        if (_domains.isNotEmpty()) cdkBuilder.domains(_domains)
        return cdkBuilder.build()
    }
}
