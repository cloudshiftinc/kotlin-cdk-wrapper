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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnWarmPool
import kotlin.Boolean

@CdkDslMarker
public class CfnWarmPoolInstanceReusePolicyPropertyDsl {
    private val cdkBuilder: CfnWarmPool.InstanceReusePolicyProperty.Builder =
        CfnWarmPool.InstanceReusePolicyProperty.builder()

    public fun reuseOnScaleIn(reuseOnScaleIn: Boolean) {
        cdkBuilder.reuseOnScaleIn(reuseOnScaleIn)
    }

    public fun reuseOnScaleIn(reuseOnScaleIn: IResolvable) {
        cdkBuilder.reuseOnScaleIn(reuseOnScaleIn)
    }

    public fun build(): CfnWarmPool.InstanceReusePolicyProperty = cdkBuilder.build()
}
