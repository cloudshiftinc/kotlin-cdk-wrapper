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

  public fun cachedInContext(cachedInContext: Boolean) {
    cdkBuilder.cachedInContext(cachedInContext)
  }

  public fun os(os: OperatingSystemType) {
    cdkBuilder.os(os)
  }

  public fun parameterVersion(parameterVersion: String) {
    cdkBuilder.parameterVersion(parameterVersion)
  }

  public fun userData(userData: UserData) {
    cdkBuilder.userData(userData)
  }

  public fun build(): ResolveSsmParameterAtLaunchImage = cdkBuilder.build()
}
