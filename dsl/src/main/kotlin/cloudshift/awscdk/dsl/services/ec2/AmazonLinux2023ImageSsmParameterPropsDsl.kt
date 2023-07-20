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
import software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameterProps
import software.amazon.awscdk.services.ec2.AmazonLinux2023Kernel
import software.amazon.awscdk.services.ec2.AmazonLinuxCpuType
import software.amazon.awscdk.services.ec2.AmazonLinuxEdition
import software.amazon.awscdk.services.ec2.UserData
import kotlin.Boolean

@CdkDslMarker
public class AmazonLinux2023ImageSsmParameterPropsDsl {
    private val cdkBuilder: AmazonLinux2023ImageSsmParameterProps.Builder =
        AmazonLinux2023ImageSsmParameterProps.builder()

    public fun cachedInContext(cachedInContext: Boolean) {
        cdkBuilder.cachedInContext(cachedInContext)
    }

    public fun cpuType(cpuType: AmazonLinuxCpuType) {
        cdkBuilder.cpuType(cpuType)
    }

    public fun edition(edition: AmazonLinuxEdition) {
        cdkBuilder.edition(edition)
    }

    public fun kernel(kernel: AmazonLinux2023Kernel) {
        cdkBuilder.kernel(kernel)
    }

    public fun userData(userData: UserData) {
        cdkBuilder.userData(userData)
    }

    public fun build(): AmazonLinux2023ImageSsmParameterProps = cdkBuilder.build()
}
