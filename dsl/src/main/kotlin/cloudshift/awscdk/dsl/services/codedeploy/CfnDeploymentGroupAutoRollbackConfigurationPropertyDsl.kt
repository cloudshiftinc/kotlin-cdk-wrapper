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

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDeploymentGroupAutoRollbackConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeploymentGroup.AutoRollbackConfigurationProperty.Builder =
        CfnDeploymentGroup.AutoRollbackConfigurationProperty.builder()

    private val _events: MutableList<String> = mutableListOf()

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun events(vararg events: String) {
        _events.addAll(listOf(*events))
    }

    public fun events(events: Collection<String>) {
        _events.addAll(events)
    }

    public fun build(): CfnDeploymentGroup.AutoRollbackConfigurationProperty {
        if (_events.isNotEmpty()) cdkBuilder.events(_events)
        return cdkBuilder.build()
    }
}
