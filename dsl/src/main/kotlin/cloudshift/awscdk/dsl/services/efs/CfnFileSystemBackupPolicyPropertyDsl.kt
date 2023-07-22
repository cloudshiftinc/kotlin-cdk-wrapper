@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.efs.CfnFileSystem

@CdkDslMarker
public class CfnFileSystemBackupPolicyPropertyDsl {
  private val cdkBuilder: CfnFileSystem.BackupPolicyProperty.Builder =
      CfnFileSystem.BackupPolicyProperty.builder()

  /**
   * @param status Set the backup policy status for the file system. 
   * * *`ENABLED`* - Turns automatic backups on for the file system.
   * * *`DISABLED`* - Turns automatic backups off for the file system.
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnFileSystem.BackupPolicyProperty = cdkBuilder.build()
}
