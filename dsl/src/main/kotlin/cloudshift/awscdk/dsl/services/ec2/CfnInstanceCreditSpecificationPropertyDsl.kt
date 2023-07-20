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
import software.amazon.awscdk.services.ec2.CfnInstance
import kotlin.String

@CdkDslMarker
public class CfnInstanceCreditSpecificationPropertyDsl {
    private val cdkBuilder: CfnInstance.CreditSpecificationProperty.Builder =
        CfnInstance.CreditSpecificationProperty.builder()

    public fun cpuCredits(cpuCredits: String) {
        cdkBuilder.cpuCredits(cpuCredits)
    }

    public fun build(): CfnInstance.CreditSpecificationProperty = cdkBuilder.build()
}
