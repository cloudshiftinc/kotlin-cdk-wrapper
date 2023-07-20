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

package cloudshift.awscdk.dsl.services.codecommit

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codecommit.CfnRepository
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRepositoryRepositoryTriggerPropertyDsl {
    private val cdkBuilder: CfnRepository.RepositoryTriggerProperty.Builder =
        CfnRepository.RepositoryTriggerProperty.builder()

    private val _branches: MutableList<String> = mutableListOf()

    private val _events: MutableList<String> = mutableListOf()

    public fun branches(vararg branches: String) {
        _branches.addAll(listOf(*branches))
    }

    public fun branches(branches: Collection<String>) {
        _branches.addAll(branches)
    }

    public fun customData(customData: String) {
        cdkBuilder.customData(customData)
    }

    public fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
    }

    public fun events(vararg events: String) {
        _events.addAll(listOf(*events))
    }

    public fun events(events: Collection<String>) {
        _events.addAll(events)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnRepository.RepositoryTriggerProperty {
        if (_branches.isNotEmpty()) cdkBuilder.branches(_branches)
        if (_events.isNotEmpty()) cdkBuilder.events(_events)
        return cdkBuilder.build()
    }
}
