@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.ec2.AmazonLinuxCpuType
import software.amazon.awscdk.services.ec2.AmazonLinuxEdition
import software.amazon.awscdk.services.ec2.AmazonLinuxGeneration
import software.amazon.awscdk.services.ec2.AmazonLinuxImageProps
import software.amazon.awscdk.services.ec2.AmazonLinuxKernel
import software.amazon.awscdk.services.ec2.AmazonLinuxStorage
import software.amazon.awscdk.services.ec2.AmazonLinuxVirt
import software.amazon.awscdk.services.ec2.UserData

@CdkDslMarker
public class AmazonLinuxImagePropsDsl {
  private val cdkBuilder: AmazonLinuxImageProps.Builder = AmazonLinuxImageProps.builder()

  public fun cachedInContext(cachedInContext: Boolean) {
    cdkBuilder.cachedInContext(cachedInContext)
  }

  public fun cpuType(cpuType: AmazonLinuxCpuType) {
    cdkBuilder.cpuType(cpuType)
  }

  public fun edition(edition: AmazonLinuxEdition) {
    cdkBuilder.edition(edition)
  }

  public fun generation(generation: AmazonLinuxGeneration) {
    cdkBuilder.generation(generation)
  }

  public fun kernel(kernel: AmazonLinuxKernel) {
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

  public fun build(): AmazonLinuxImageProps = cdkBuilder.build()
}
