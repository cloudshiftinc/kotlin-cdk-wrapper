@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datasync.CfnStorageSystem

@CdkDslMarker
public class CfnStorageSystemServerCredentialsPropertyDsl {
  private val cdkBuilder: CfnStorageSystem.ServerCredentialsProperty.Builder =
      CfnStorageSystem.ServerCredentialsProperty.builder()

  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnStorageSystem.ServerCredentialsProperty = cdkBuilder.build()
}
