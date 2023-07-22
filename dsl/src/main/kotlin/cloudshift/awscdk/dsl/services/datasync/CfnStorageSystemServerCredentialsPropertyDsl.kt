@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datasync.CfnStorageSystem

@CdkDslMarker
public class CfnStorageSystemServerCredentialsPropertyDsl {
  private val cdkBuilder: CfnStorageSystem.ServerCredentialsProperty.Builder =
      CfnStorageSystem.ServerCredentialsProperty.builder()

  /**
   * @param password Specifies the password for your storage system's management interface. 
   */
  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  /**
   * @param username Specifies the user name for your storage system's management interface. 
   */
  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnStorageSystem.ServerCredentialsProperty = cdkBuilder.build()
}
