@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.iam.AccessKeyProps
import software.amazon.awscdk.services.iam.AccessKeyStatus
import software.amazon.awscdk.services.iam.IUser

@CdkDslMarker
public class AccessKeyPropsDsl {
  private val cdkBuilder: AccessKeyProps.Builder = AccessKeyProps.builder()

  public fun serial(serial: Number) {
    cdkBuilder.serial(serial)
  }

  public fun status(status: AccessKeyStatus) {
    cdkBuilder.status(status)
  }

  public fun user(user: IUser) {
    cdkBuilder.user(user)
  }

  public fun build(): AccessKeyProps = cdkBuilder.build()
}
