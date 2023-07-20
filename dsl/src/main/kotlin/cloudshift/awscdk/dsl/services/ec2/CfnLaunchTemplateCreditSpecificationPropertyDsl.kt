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
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate
import kotlin.String

@CdkDslMarker
public class CfnLaunchTemplateCreditSpecificationPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.CreditSpecificationProperty.Builder =
        CfnLaunchTemplate.CreditSpecificationProperty.builder()

    public fun cpuCredits(cpuCredits: String) {
        cdkBuilder.cpuCredits(cpuCredits)
    }

    public fun build(): CfnLaunchTemplate.CreditSpecificationProperty = cdkBuilder.build()
}
