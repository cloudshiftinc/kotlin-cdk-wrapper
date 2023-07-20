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
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDeploymentGroupTriggerConfigPropertyDsl {
    private val cdkBuilder: CfnDeploymentGroup.TriggerConfigProperty.Builder =
        CfnDeploymentGroup.TriggerConfigProperty.builder()

    private val _triggerEvents: MutableList<String> = mutableListOf()

    public fun triggerEvents(vararg triggerEvents: String) {
        _triggerEvents.addAll(listOf(*triggerEvents))
    }

    public fun triggerEvents(triggerEvents: Collection<String>) {
        _triggerEvents.addAll(triggerEvents)
    }

    public fun triggerName(triggerName: String) {
        cdkBuilder.triggerName(triggerName)
    }

    public fun triggerTargetArn(triggerTargetArn: String) {
        cdkBuilder.triggerTargetArn(triggerTargetArn)
    }

    public fun build(): CfnDeploymentGroup.TriggerConfigProperty {
        if (_triggerEvents.isNotEmpty()) cdkBuilder.triggerEvents(_triggerEvents)
        return cdkBuilder.build()
    }
}
