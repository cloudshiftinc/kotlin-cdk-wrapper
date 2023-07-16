@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.ec2.OperatingSystemType
import software.amazon.awscdk.services.ec2.SsmParameterImageOptions
import software.amazon.awscdk.services.ec2.UserData

@CdkDslMarker
public class SsmParameterImageOptionsDsl {
  private val cdkBuilder: SsmParameterImageOptions.Builder = SsmParameterImageOptions.builder()

  public fun cachedInContext(cachedInContext: Boolean) {
    cdkBuilder.cachedInContext(cachedInContext)
  }

  public fun os(os: OperatingSystemType) {
    cdkBuilder.os(os)
  }

  public fun userData(userData: UserData) {
    cdkBuilder.userData(userData)
  }

  public fun build(): SsmParameterImageOptions = cdkBuilder.build()
}
