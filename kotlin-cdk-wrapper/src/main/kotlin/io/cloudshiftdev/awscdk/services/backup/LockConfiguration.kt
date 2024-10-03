@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Configuration for AWS Backup Vault Lock.
 *
 * Example:
 *
 * ```
 * BackupVault.Builder.create(this, "Vault")
 * .lockConfiguration(LockConfiguration.builder()
 * .minRetention(Duration.days(30))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html)
 */
public interface LockConfiguration {
  /**
   * The duration before the lock date.
   *
   * AWS Backup enforces a 72-hour cooling-off period before Vault Lock takes
   * effect and becomes immutable.
   *
   * Before the lock date, you can delete Vault Lock from the vault or change
   * the Vault Lock configuration. On and after the lock date, the Vault Lock
   * becomes immutable and cannot be changed or deleted.
   *
   * Default: - Vault Lock can be deleted or changed at any time
   */
  public fun changeableFor(): Duration? = unwrap(this).getChangeableFor()?.let(Duration::wrap)

  /**
   * The maximum retention period that the vault retains its recovery points.
   *
   * If this parameter is specified, any backup or copy job to the vault must
   * have a lifecycle policy with a retention period equal to or shorter than
   * the maximum retention period. If the job's retention period is longer than
   * that maximum retention period, then the vault fails the backup or copy job,
   * and you should either modify your lifecycle settings or use a different
   * vault. Recovery points already saved in the vault prior to Vault Lock are
   * not affected.
   *
   * Default: - Vault Lock does not enforce a maximum retention period
   */
  public fun maxRetention(): Duration? = unwrap(this).getMaxRetention()?.let(Duration::wrap)

  /**
   * The minimum retention period that the vault retains its recovery points.
   *
   * If this parameter is specified, any backup or copy job to the vault must
   * have a lifecycle policy with a retention period equal to or longer than
   * the minimum retention period. If the job's retention period is shorter than
   * that minimum retention period, then the vault fails that backup or copy job,
   * and you should either modify your lifecycle settings or use a different
   * vault. Recovery points already saved in the vault prior to Vault Lock are
   * not affected.
   */
  public fun minRetention(): Duration

  /**
   * A builder for [LockConfiguration]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param changeableFor The duration before the lock date.
     * AWS Backup enforces a 72-hour cooling-off period before Vault Lock takes
     * effect and becomes immutable.
     *
     * Before the lock date, you can delete Vault Lock from the vault or change
     * the Vault Lock configuration. On and after the lock date, the Vault Lock
     * becomes immutable and cannot be changed or deleted.
     */
    public fun changeableFor(changeableFor: Duration)

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
    public fun maxRetention(maxRetention: Duration)

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
    public fun minRetention(minRetention: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.LockConfiguration.Builder =
        software.amazon.awscdk.services.backup.LockConfiguration.builder()

    /**
     * @param changeableFor The duration before the lock date.
     * AWS Backup enforces a 72-hour cooling-off period before Vault Lock takes
     * effect and becomes immutable.
     *
     * Before the lock date, you can delete Vault Lock from the vault or change
     * the Vault Lock configuration. On and after the lock date, the Vault Lock
     * becomes immutable and cannot be changed or deleted.
     */
    override fun changeableFor(changeableFor: Duration) {
      cdkBuilder.changeableFor(changeableFor.let(Duration.Companion::unwrap))
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
    override fun maxRetention(maxRetention: Duration) {
      cdkBuilder.maxRetention(maxRetention.let(Duration.Companion::unwrap))
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
    override fun minRetention(minRetention: Duration) {
      cdkBuilder.minRetention(minRetention.let(Duration.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.backup.LockConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.backup.LockConfiguration,
  ) : CdkObject(cdkObject),
      LockConfiguration {
    /**
     * The duration before the lock date.
     *
     * AWS Backup enforces a 72-hour cooling-off period before Vault Lock takes
     * effect and becomes immutable.
     *
     * Before the lock date, you can delete Vault Lock from the vault or change
     * the Vault Lock configuration. On and after the lock date, the Vault Lock
     * becomes immutable and cannot be changed or deleted.
     *
     * Default: - Vault Lock can be deleted or changed at any time
     */
    override fun changeableFor(): Duration? = unwrap(this).getChangeableFor()?.let(Duration::wrap)

    /**
     * The maximum retention period that the vault retains its recovery points.
     *
     * If this parameter is specified, any backup or copy job to the vault must
     * have a lifecycle policy with a retention period equal to or shorter than
     * the maximum retention period. If the job's retention period is longer than
     * that maximum retention period, then the vault fails the backup or copy job,
     * and you should either modify your lifecycle settings or use a different
     * vault. Recovery points already saved in the vault prior to Vault Lock are
     * not affected.
     *
     * Default: - Vault Lock does not enforce a maximum retention period
     */
    override fun maxRetention(): Duration? = unwrap(this).getMaxRetention()?.let(Duration::wrap)

    /**
     * The minimum retention period that the vault retains its recovery points.
     *
     * If this parameter is specified, any backup or copy job to the vault must
     * have a lifecycle policy with a retention period equal to or longer than
     * the minimum retention period. If the job's retention period is shorter than
     * that minimum retention period, then the vault fails that backup or copy job,
     * and you should either modify your lifecycle settings or use a different
     * vault. Recovery points already saved in the vault prior to Vault Lock are
     * not affected.
     */
    override fun minRetention(): Duration = unwrap(this).getMinRetention().let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LockConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.LockConfiguration):
        LockConfiguration = CdkObjectWrappers.wrap(cdkObject) as? LockConfiguration ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LockConfiguration):
        software.amazon.awscdk.services.backup.LockConfiguration = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.backup.LockConfiguration
  }
}
