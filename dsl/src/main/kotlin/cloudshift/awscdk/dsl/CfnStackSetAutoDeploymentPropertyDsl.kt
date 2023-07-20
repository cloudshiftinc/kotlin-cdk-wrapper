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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnStackSet
import software.amazon.awscdk.IResolvable
import kotlin.Boolean

@CdkDslMarker
public class CfnStackSetAutoDeploymentPropertyDsl {
    private val cdkBuilder: CfnStackSet.AutoDeploymentProperty.Builder =
        CfnStackSet.AutoDeploymentProperty.builder()

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun retainStacksOnAccountRemoval(retainStacksOnAccountRemoval: Boolean) {
        cdkBuilder.retainStacksOnAccountRemoval(retainStacksOnAccountRemoval)
    }

    public fun retainStacksOnAccountRemoval(retainStacksOnAccountRemoval: IResolvable) {
        cdkBuilder.retainStacksOnAccountRemoval(retainStacksOnAccountRemoval)
    }

    public fun build(): CfnStackSet.AutoDeploymentProperty = cdkBuilder.build()
}
