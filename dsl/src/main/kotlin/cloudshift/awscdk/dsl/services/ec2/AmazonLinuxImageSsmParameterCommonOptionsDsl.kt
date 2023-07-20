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
import software.amazon.awscdk.services.ec2.AmazonLinuxCpuType
import software.amazon.awscdk.services.ec2.AmazonLinuxEdition
import software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterCommonOptions
import software.amazon.awscdk.services.ec2.UserData
import kotlin.Boolean

@CdkDslMarker
public class AmazonLinuxImageSsmParameterCommonOptionsDsl {
    private val cdkBuilder: AmazonLinuxImageSsmParameterCommonOptions.Builder =
        AmazonLinuxImageSsmParameterCommonOptions.builder()

    public fun cachedInContext(cachedInContext: Boolean) {
        cdkBuilder.cachedInContext(cachedInContext)
    }

    public fun cpuType(cpuType: AmazonLinuxCpuType) {
        cdkBuilder.cpuType(cpuType)
    }

    public fun edition(edition: AmazonLinuxEdition) {
        cdkBuilder.edition(edition)
    }

    public fun userData(userData: UserData) {
        cdkBuilder.userData(userData)
    }

    public fun build(): AmazonLinuxImageSsmParameterCommonOptions = cdkBuilder.build()
}
