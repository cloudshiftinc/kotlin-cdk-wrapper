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

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnFlow
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnFlowFailoverConfigPropertyDsl {
    private val cdkBuilder: CfnFlow.FailoverConfigProperty.Builder =
        CfnFlow.FailoverConfigProperty.builder()

    public fun failoverMode(failoverMode: String) {
        cdkBuilder.failoverMode(failoverMode)
    }

    public fun recoveryWindow(recoveryWindow: Number) {
        cdkBuilder.recoveryWindow(recoveryWindow)
    }

    public fun sourcePriority(sourcePriority: IResolvable) {
        cdkBuilder.sourcePriority(sourcePriority)
    }

    public fun sourcePriority(sourcePriority: CfnFlow.SourcePriorityProperty) {
        cdkBuilder.sourcePriority(sourcePriority)
    }

    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    public fun build(): CfnFlow.FailoverConfigProperty = cdkBuilder.build()
}
