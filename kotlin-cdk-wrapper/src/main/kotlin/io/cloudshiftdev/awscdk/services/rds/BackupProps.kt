@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Backup configuration for RDS databases.
 *
 * Default: - The retention period for automated backups is 1 day.
 * The preferred backup window will be a 30-minute window selected at random
 * from an 8-hour block of time for each AWS Region.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * BackupProps backupProps = BackupProps.builder()
 * .retention(Duration.minutes(30))
 * // the properties below are optional
 * .preferredWindow("preferredWindow")
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow)
 */
public interface BackupProps {
  /**
   * A daily time range in 24-hours UTC format in which backups preferably execute.
   *
   * Must be at least 30 minutes long.
   *
   * Example: '01:00-02:00'
   *
   * Default: - a 30-minute window selected at random from an 8-hour block of
   * time for each AWS Region. To see the time blocks available, see
   * https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow
   */
  public fun preferredWindow(): String? = unwrap(this).getPreferredWindow()

  /**
   * How many days to retain the backup.
   */
  public fun retention(): Duration

  /**
   * A builder for [BackupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param preferredWindow A daily time range in 24-hours UTC format in which backups preferably
     * execute.
     * Must be at least 30 minutes long.
     *
     * Example: '01:00-02:00'
     */
    public fun preferredWindow(preferredWindow: String)

    /**
     * @param retention How many days to retain the backup. 
     */
    public fun retention(retention: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.BackupProps.Builder =
        software.amazon.awscdk.services.rds.BackupProps.builder()

    /**
     * @param preferredWindow A daily time range in 24-hours UTC format in which backups preferably
     * execute.
     * Must be at least 30 minutes long.
     *
     * Example: '01:00-02:00'
     */
    override fun preferredWindow(preferredWindow: String) {
      cdkBuilder.preferredWindow(preferredWindow)
    }

    /**
     * @param retention How many days to retain the backup. 
     */
    override fun retention(retention: Duration) {
      cdkBuilder.retention(retention.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.BackupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.BackupProps,
  ) : CdkObject(cdkObject), BackupProps {
    /**
     * A daily time range in 24-hours UTC format in which backups preferably execute.
     *
     * Must be at least 30 minutes long.
     *
     * Example: '01:00-02:00'
     *
     * Default: - a 30-minute window selected at random from an 8-hour block of
     * time for each AWS Region. To see the time blocks available, see
     * https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow
     */
    override fun preferredWindow(): String? = unwrap(this).getPreferredWindow()

    /**
     * How many days to retain the backup.
     */
    override fun retention(): Duration = unwrap(this).getRetention().let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BackupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.BackupProps): BackupProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BackupProps): software.amazon.awscdk.services.rds.BackupProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.rds.BackupProps
  }
}
