package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

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
   * https://docs.aws.amazon.com/documentdb/latest/developerguide/backup-restore.db-cluster-snapshots.html#backup-restore.backup-window
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
    private val cdkBuilder: software.amazon.awscdk.services.docdb.BackupProps.Builder =
        software.amazon.awscdk.services.docdb.BackupProps.builder()

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

    public fun build(): software.amazon.awscdk.services.docdb.BackupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.docdb.BackupProps,
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
     * https://docs.aws.amazon.com/documentdb/latest/developerguide/backup-restore.db-cluster-snapshots.html#backup-restore.backup-window
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.BackupProps): BackupProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BackupProps): software.amazon.awscdk.services.docdb.BackupProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.docdb.BackupProps
  }
}