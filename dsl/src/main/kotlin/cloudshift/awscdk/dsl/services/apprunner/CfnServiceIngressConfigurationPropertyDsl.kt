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

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnService
import kotlin.Boolean

@CdkDslMarker
public class CfnServiceIngressConfigurationPropertyDsl {
    private val cdkBuilder: CfnService.IngressConfigurationProperty.Builder =
        CfnService.IngressConfigurationProperty.builder()

    public fun isPubliclyAccessible(isPubliclyAccessible: Boolean) {
        cdkBuilder.isPubliclyAccessible(isPubliclyAccessible)
    }

    public fun isPubliclyAccessible(isPubliclyAccessible: IResolvable) {
        cdkBuilder.isPubliclyAccessible(isPubliclyAccessible)
    }

    public fun build(): CfnService.IngressConfigurationProperty = cdkBuilder.build()
}
