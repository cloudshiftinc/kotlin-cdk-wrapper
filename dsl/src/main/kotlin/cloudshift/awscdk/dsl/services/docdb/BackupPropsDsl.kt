@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.docdb.BackupProps

@CdkDslMarker
public class BackupPropsDsl {
  private val cdkBuilder: BackupProps.Builder = BackupProps.builder()

  /**
   * @param preferredWindow A daily time range in 24-hours UTC format in which backups preferably
   * execute.
   * Must be at least 30 minutes long.
   *
   * Example: '01:00-02:00'
   */
  public fun preferredWindow(preferredWindow: String) {
    cdkBuilder.preferredWindow(preferredWindow)
  }

  /**
   * @param retention How many days to retain the backup. 
   */
  public fun retention(retention: Duration) {
    cdkBuilder.retention(retention)
  }

  public fun build(): BackupProps = cdkBuilder.build()
}
