@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ec2.OperatingSystemType
import software.amazon.awscdk.services.ec2.ResolveSsmParameterAtLaunchImage
import software.amazon.awscdk.services.ec2.UserData

@CdkDslMarker
public class ResolveSsmParameterAtLaunchImageDsl(
  parameterName: String,
) {
  private val cdkBuilder: ResolveSsmParameterAtLaunchImage.Builder =
      ResolveSsmParameterAtLaunchImage.Builder.create(parameterName)

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
   * Operating system.
   *
   * Default: OperatingSystemType.LINUX
   *
   * @param os Operating system. 
   */
  public fun os(os: OperatingSystemType) {
    cdkBuilder.os(os)
  }

  /**
   * The version of the SSM parameter.
   *
   * Default: no version specified.
   *
   * @param parameterVersion The version of the SSM parameter. 
   */
  public fun parameterVersion(parameterVersion: String) {
    cdkBuilder.parameterVersion(parameterVersion)
  }

  /**
   * Custom UserData.
   *
   * Default: - UserData appropriate for the OS
   *
   * @param userData Custom UserData. 
   */
  public fun userData(userData: UserData) {
    cdkBuilder.userData(userData)
  }

  public fun build(): ResolveSsmParameterAtLaunchImage = cdkBuilder.build()
}
