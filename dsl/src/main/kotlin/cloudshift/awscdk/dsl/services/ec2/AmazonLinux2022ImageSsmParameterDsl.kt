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
import software.amazon.awscdk.services.ec2.AmazonLinux2022ImageSsmParameter
import software.amazon.awscdk.services.ec2.AmazonLinux2022Kernel
import software.amazon.awscdk.services.ec2.AmazonLinuxCpuType
import software.amazon.awscdk.services.ec2.AmazonLinuxEdition
import software.amazon.awscdk.services.ec2.UserData
import kotlin.Boolean

@CdkDslMarker
public class AmazonLinux2022ImageSsmParameterDsl {
    private val cdkBuilder: AmazonLinux2022ImageSsmParameter.Builder =
        AmazonLinux2022ImageSsmParameter.Builder.create()

    public fun cachedInContext(cachedInContext: Boolean) {
        cdkBuilder.cachedInContext(cachedInContext)
    }

    public fun cpuType(cpuType: AmazonLinuxCpuType) {
        cdkBuilder.cpuType(cpuType)
    }

    public fun edition(edition: AmazonLinuxEdition) {
        cdkBuilder.edition(edition)
    }

    public fun kernel(kernel: AmazonLinux2022Kernel) {
        cdkBuilder.kernel(kernel)
    }

    public fun userData(userData: UserData) {
        cdkBuilder.userData(userData)
    }

    public fun build(): AmazonLinux2022ImageSsmParameter = cdkBuilder.build()
}
