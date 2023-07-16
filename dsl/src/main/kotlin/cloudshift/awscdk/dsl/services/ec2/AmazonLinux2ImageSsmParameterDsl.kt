@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameter
import software.amazon.awscdk.services.ec2.AmazonLinux2Kernel
import software.amazon.awscdk.services.ec2.AmazonLinuxCpuType
import software.amazon.awscdk.services.ec2.AmazonLinuxEdition
import software.amazon.awscdk.services.ec2.AmazonLinuxStorage
import software.amazon.awscdk.services.ec2.AmazonLinuxVirt
import software.amazon.awscdk.services.ec2.UserData

@CdkDslMarker
public class AmazonLinux2ImageSsmParameterDsl {
  private val cdkBuilder: AmazonLinux2ImageSsmParameter.Builder =
      AmazonLinux2ImageSsmParameter.Builder.create()

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

  public fun build(): AmazonLinux2ImageSsmParameter = cdkBuilder.build()
}
