@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.ec2.GenericLinuxImage
import software.amazon.awscdk.services.ec2.UserData

@CdkDslMarker
public class GenericLinuxImageDsl(
  arg0: Map<String, String>,
) {
  private val cdkBuilder: GenericLinuxImage.Builder = GenericLinuxImage.Builder.create(arg0)

  public fun userData(userData: UserData) {
    cdkBuilder.userData(userData)
  }

  public fun build(): GenericLinuxImage = cdkBuilder.build()
}
