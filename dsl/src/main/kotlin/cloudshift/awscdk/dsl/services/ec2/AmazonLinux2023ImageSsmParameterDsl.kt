@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameter
import software.amazon.awscdk.services.ec2.AmazonLinux2023Kernel
import software.amazon.awscdk.services.ec2.AmazonLinuxCpuType
import software.amazon.awscdk.services.ec2.AmazonLinuxEdition
import software.amazon.awscdk.services.ec2.UserData

@CdkDslMarker
public class AmazonLinux2023ImageSsmParameterDsl {
  private val cdkBuilder: AmazonLinux2023ImageSsmParameter.Builder =
      AmazonLinux2023ImageSsmParameter.Builder.create()

  /**
   * Whether the AMI ID is cached to be stable between deployments.
   *
   * By default, the newest image is used on each deployment. This will cause
   * instances to be replaced whenever a new version is released, and may cause
   * downtime if there aren't enough running instances in the AutoScalingGroup
   * to reschedule the tasks on.
   *
   * If set to true, the AMI ID will be cached in `cdk.context.json` and the
   * same value will be used on future runs. Your instances will not be replaced
   * but your AMI version will grow old over time. To refresh the AMI lookup,
   * you will have to evict the value from the cache using the `cdk context`
   * command. See https://docs.aws.amazon.com/cdk/latest/guide/context.html for
   * more information.
   *
   * Can not be set to `true` in environment-agnostic stacks.
   *
   * Default: false
   *
   * @param cachedInContext Whether the AMI ID is cached to be stable between deployments. 
   */
  public fun cachedInContext(cachedInContext: Boolean) {
    cdkBuilder.cachedInContext(cachedInContext)
  }

  /**
   * CPU Type.
   *
   * Default: AmazonLinuxCpuType.X86_64
   *
   * @param cpuType CPU Type. 
   */
  public fun cpuType(cpuType: AmazonLinuxCpuType) {
    cdkBuilder.cpuType(cpuType)
  }

  /**
   * What edition of Amazon Linux to use.
   *
   * Default: AmazonLinuxEdition.Standard
   *
   * @param edition What edition of Amazon Linux to use. 
   */
  public fun edition(edition: AmazonLinuxEdition) {
    cdkBuilder.edition(edition)
  }

  /**
   * What kernel version of Amazon Linux to use.
   *
   * Default: AmazonLinux2023Kernel.DEFAULT
   *
   * @param kernel What kernel version of Amazon Linux to use. 
   */
  public fun kernel(kernel: AmazonLinux2023Kernel) {
    cdkBuilder.kernel(kernel)
  }

  /**
   * Initial user data.
   *
   * Default: - Empty UserData for Linux machines
   *
   * @param userData Initial user data. 
   */
  public fun userData(userData: UserData) {
    cdkBuilder.userData(userData)
  }

  public fun build(): AmazonLinux2023ImageSsmParameter = cdkBuilder.build()
}
