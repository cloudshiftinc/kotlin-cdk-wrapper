@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.backup.LockConfiguration

@CdkDslMarker
public class LockConfigurationDsl {
  private val cdkBuilder: LockConfiguration.Builder = LockConfiguration.builder()

  /**
   * @param changeableFor The duration before the lock date.
   * AWS Backup enforces a 72-hour cooling-off period before Vault Lock takes
   * effect and becomes immutable.
   *
   * Before the lock date, you can delete Vault Lock from the vault or change
   * the Vault Lock configuration. On and after the lock date, the Vault Lock
   * becomes immutable and cannot be changed or deleted.
   */
  public fun changeableFor(changeableFor: Duration) {
    cdkBuilder.changeableFor(changeableFor)
  }

  /**
   * @param maxRetention The maximum retention period that the vault retains its recovery points.
   * If this parameter is specified, any backup or copy job to the vault must
   * have a lifecycle policy with a retention period equal to or shorter than
   * the maximum retention period. If the job's retention period is longer than
   * that maximum retention period, then the vault fails the backup or copy job,
   * and you should either modify your lifecycle settings or use a different
   * vault. Recovery points already saved in the vault prior to Vault Lock are
   * not affected.
   */
  public fun maxRetention(maxRetention: Duration) {
    cdkBuilder.maxRetention(maxRetention)
  }

  /**
   * @param minRetention The minimum retention period that the vault retains its recovery points. 
   * If this parameter is specified, any backup or copy job to the vault must
   * have a lifecycle policy with a retention period equal to or longer than
   * the minimum retention period. If the job's retention period is shorter than
   * that minimum retention period, then the vault fails that backup or copy job,
   * and you should either modify your lifecycle settings or use a different
   * vault. Recovery points already saved in the vault prior to Vault Lock are
   * not affected.
   */
  public fun minRetention(minRetention: Duration) {
    cdkBuilder.minRetention(minRetention)
  }

  public fun build(): LockConfiguration = cdkBuilder.build()
}
