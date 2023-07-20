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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudformation.CfnStackSet
import kotlin.Boolean

@CdkDslMarker
public class CfnStackSetManagedExecutionPropertyDsl {
    private val cdkBuilder: CfnStackSet.ManagedExecutionProperty.Builder =
        CfnStackSet.ManagedExecutionProperty.builder()

    public fun active(active: Boolean) {
        cdkBuilder.active(active)
    }

    public fun active(active: IResolvable) {
        cdkBuilder.active(active)
    }

    public fun build(): CfnStackSet.ManagedExecutionProperty = cdkBuilder.build()
}
