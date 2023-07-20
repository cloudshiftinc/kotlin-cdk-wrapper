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

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDataRepositoryAssociationAutoExportPolicyPropertyDsl {
    private val cdkBuilder: CfnDataRepositoryAssociation.AutoExportPolicyProperty.Builder =
        CfnDataRepositoryAssociation.AutoExportPolicyProperty.builder()

    private val _events: MutableList<String> = mutableListOf()

    public fun events(vararg events: String) {
        _events.addAll(listOf(*events))
    }

    public fun events(events: Collection<String>) {
        _events.addAll(events)
    }

    public fun build(): CfnDataRepositoryAssociation.AutoExportPolicyProperty {
        if (_events.isNotEmpty()) cdkBuilder.events(_events)
        return cdkBuilder.build()
    }
}
