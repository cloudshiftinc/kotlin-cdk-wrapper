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
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate
import kotlin.Boolean

@CdkDslMarker
public class CfnLaunchTemplateHibernationOptionsPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.HibernationOptionsProperty.Builder =
        CfnLaunchTemplate.HibernationOptionsProperty.builder()

    public fun configured(configured: Boolean) {
        cdkBuilder.configured(configured)
    }

    public fun configured(configured: IResolvable) {
        cdkBuilder.configured(configured)
    }

    public fun build(): CfnLaunchTemplate.HibernationOptionsProperty = cdkBuilder.build()
}
