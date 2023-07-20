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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sagemaker.CfnDomain
import kotlin.String

@CdkDslMarker
public class CfnDomainRStudioServerProAppSettingsPropertyDsl {
    private val cdkBuilder: CfnDomain.RStudioServerProAppSettingsProperty.Builder =
        CfnDomain.RStudioServerProAppSettingsProperty.builder()

    public fun accessStatus(accessStatus: String) {
        cdkBuilder.accessStatus(accessStatus)
    }

    public fun userGroup(userGroup: String) {
        cdkBuilder.userGroup(userGroup)
    }

    public fun build(): CfnDomain.RStudioServerProAppSettingsProperty = cdkBuilder.build()
}
