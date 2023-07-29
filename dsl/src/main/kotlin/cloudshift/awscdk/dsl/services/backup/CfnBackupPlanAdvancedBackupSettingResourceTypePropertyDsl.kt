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

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnBackupPlan

/**
 * Specifies an object containing resource type and backup options.
 *
 * This is only supported for Windows VSS backups.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * Object backupOptions;
 * AdvancedBackupSettingResourceTypeProperty advancedBackupSettingResourceTypeProperty =
 * AdvancedBackupSettingResourceTypeProperty.builder()
 * .backupOptions(backupOptions)
 * .resourceType("resourceType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-advancedbackupsettingresourcetype.html)
 */
@CdkDslMarker
public class CfnBackupPlanAdvancedBackupSettingResourceTypePropertyDsl {
    private val cdkBuilder: CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty.Builder =
        CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty.builder()

    /**
     * @param backupOptions The backup option for the resource. Each option is a key-value pair.
     *   This option is only available for Windows VSS backup jobs.
     *
     * Valid values:
     *
     * Set to `"WindowsVSS":"enabled"` to enable the `WindowsVSS` backup option and create a Windows
     * VSS backup.
     *
     * Set to `"WindowsVSS":"disabled"` to create a regular backup. The `WindowsVSS` option is not
     * enabled by default.
     *
     * If you specify an invalid option, you get an `InvalidParameterValueException` exception.
     *
     * For more information about Windows VSS backups, see
     * [Creating a VSS-Enabled Windows Backup](https://docs.aws.amazon.com/aws-backup/latest/devguide/windows-backups.html)
     * .
     */
    public fun backupOptions(backupOptions: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(backupOptions)
        cdkBuilder.backupOptions(builder.map)
    }

    /**
     * @param backupOptions The backup option for the resource. Each option is a key-value pair.
     *   This option is only available for Windows VSS backup jobs.
     *
     * Valid values:
     *
     * Set to `"WindowsVSS":"enabled"` to enable the `WindowsVSS` backup option and create a Windows
     * VSS backup.
     *
     * Set to `"WindowsVSS":"disabled"` to create a regular backup. The `WindowsVSS` option is not
     * enabled by default.
     *
     * If you specify an invalid option, you get an `InvalidParameterValueException` exception.
     *
     * For more information about Windows VSS backups, see
     * [Creating a VSS-Enabled Windows Backup](https://docs.aws.amazon.com/aws-backup/latest/devguide/windows-backups.html)
     * .
     */
    public fun backupOptions(backupOptions: Any) {
        cdkBuilder.backupOptions(backupOptions)
    }

    /** @param resourceType The name of a resource type. The only supported resource type is EC2. */
    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    public fun build(): CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty = cdkBuilder.build()
}
