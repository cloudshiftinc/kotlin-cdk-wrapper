@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.rds.BackupProps

/**
 * Backup configuration for RDS databases.
 *
 * Default: - The retention period for automated backups is 1 day. The preferred backup window will
 * be a 30-minute window selected at random from an 8-hour block of time for each AWS Region.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.rds.*;
 * BackupProps backupProps = BackupProps.builder()
 * .retention(Duration.minutes(30))
 * // the properties below are optional
 * .preferredWindow("preferredWindow")
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow)
 */
@CdkDslMarker
public class BackupPropsDsl {
    private val cdkBuilder: BackupProps.Builder = BackupProps.builder()

    /**
     * @param preferredWindow A daily time range in 24-hours UTC format in which backups preferably
     *   execute. Must be at least 30 minutes long.
     *
     * Example: '01:00-02:00'
     */
    public fun preferredWindow(preferredWindow: String) {
        cdkBuilder.preferredWindow(preferredWindow)
    }

    /** @param retention How many days to retain the backup. */
    public fun retention(retention: Duration) {
        cdkBuilder.retention(retention)
    }

    public fun build(): BackupProps = cdkBuilder.build()
}
