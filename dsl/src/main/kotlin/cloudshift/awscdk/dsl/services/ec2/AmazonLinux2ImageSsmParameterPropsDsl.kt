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
import software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameterProps
import software.amazon.awscdk.services.ec2.AmazonLinux2Kernel
import software.amazon.awscdk.services.ec2.AmazonLinuxCpuType
import software.amazon.awscdk.services.ec2.AmazonLinuxEdition
import software.amazon.awscdk.services.ec2.AmazonLinuxStorage
import software.amazon.awscdk.services.ec2.AmazonLinuxVirt
import software.amazon.awscdk.services.ec2.UserData
import kotlin.Boolean

@CdkDslMarker
public class AmazonLinux2ImageSsmParameterPropsDsl {
    private val cdkBuilder: AmazonLinux2ImageSsmParameterProps.Builder =
        AmazonLinux2ImageSsmParameterProps.builder()

    public fun cachedInContext(cachedInContext: Boolean) {
        cdkBuilder.cachedInContext(cachedInContext)
    }

    public fun cpuType(cpuType: AmazonLinuxCpuType) {
        cdkBuilder.cpuType(cpuType)
    }

    public fun edition(edition: AmazonLinuxEdition) {
        cdkBuilder.edition(edition)
    }

    public fun kernel(kernel: AmazonLinux2Kernel) {
        cdkBuilder.kernel(kernel)
    }

    public fun storage(storage: AmazonLinuxStorage) {
        cdkBuilder.storage(storage)
    }

    public fun userData(userData: UserData) {
        cdkBuilder.userData(userData)
    }

    public fun virtualization(virtualization: AmazonLinuxVirt) {
        cdkBuilder.virtualization(virtualization)
    }

    public fun build(): AmazonLinux2ImageSsmParameterProps = cdkBuilder.build()
}
