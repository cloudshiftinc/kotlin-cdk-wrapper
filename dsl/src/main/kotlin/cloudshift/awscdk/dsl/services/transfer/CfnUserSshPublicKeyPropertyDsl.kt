@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.transfer.CfnUser

@CdkDslMarker
public class CfnUserSshPublicKeyPropertyDsl {
  private val cdkBuilder: CfnUser.SshPublicKeyProperty.Builder =
      CfnUser.SshPublicKeyProperty.builder()

  public fun build(): CfnUser.SshPublicKeyProperty = cdkBuilder.build()
}
