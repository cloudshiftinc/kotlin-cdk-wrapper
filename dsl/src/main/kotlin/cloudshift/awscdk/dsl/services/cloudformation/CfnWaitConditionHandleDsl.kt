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

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudformation.CfnWaitConditionHandle
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnWaitConditionHandleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnWaitConditionHandle.Builder =
        CfnWaitConditionHandle.Builder.create(scope, id)

    public fun build(): CfnWaitConditionHandle = cdkBuilder.build()
}
