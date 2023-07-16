@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.rds.BackupProps

@CdkDslMarker
public class BackupPropsDsl {
  private val cdkBuilder: BackupProps.Builder = BackupProps.builder()

  public fun preferredWindow(preferredWindow: String) {
    cdkBuilder.preferredWindow(preferredWindow)
  }

  public fun retention(retention: Duration) {
    cdkBuilder.retention(retention)
  }

  public fun build(): BackupProps = cdkBuilder.build()
}
