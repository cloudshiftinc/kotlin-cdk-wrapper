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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnInstance
import kotlin.Boolean

@CdkDslMarker
public class CfnInstanceHibernationOptionsPropertyDsl {
    private val cdkBuilder: CfnInstance.HibernationOptionsProperty.Builder =
        CfnInstance.HibernationOptionsProperty.builder()

    public fun configured(configured: Boolean) {
        cdkBuilder.configured(configured)
    }

    public fun configured(configured: IResolvable) {
        cdkBuilder.configured(configured)
    }

    public fun build(): CfnInstance.HibernationOptionsProperty = cdkBuilder.build()
}
