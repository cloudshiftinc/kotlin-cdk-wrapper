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

package io.cloudshiftdev.awscdkdsl.services.fsx

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnVolume

/**
 * Specifies the SnapLock configuration for an FSx for ONTAP SnapLock volume.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fsx.*;
 * SnaplockConfigurationProperty snaplockConfigurationProperty =
 * SnaplockConfigurationProperty.builder()
 * .snaplockType("snaplockType")
 * // the properties below are optional
 * .auditLogVolume("auditLogVolume")
 * .autocommitPeriod(AutocommitPeriodProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .value(123)
 * .build())
 * .privilegedDelete("privilegedDelete")
 * .retentionPeriod(SnaplockRetentionPeriodProperty.builder()
 * .defaultRetention(RetentionPeriodProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .value(123)
 * .build())
 * .maximumRetention(RetentionPeriodProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .value(123)
 * .build())
 * .minimumRetention(RetentionPeriodProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .value(123)
 * .build())
 * .build())
 * .volumeAppendModeEnabled("volumeAppendModeEnabled")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-snaplockconfiguration.html)
 */
@CdkDslMarker
public class CfnVolumeSnaplockConfigurationPropertyDsl {
    private val cdkBuilder: CfnVolume.SnaplockConfigurationProperty.Builder =
        CfnVolume.SnaplockConfigurationProperty.builder()

    /**
     * @param auditLogVolume Enables or disables the audit log volume for an FSx for ONTAP SnapLock
     *   volume. The default value is `false` . If you set `AuditLogVolume` to `true` , the SnapLock
     *   volume is created as an audit log volume. The minimum retention period for an audit log
     *   volume is six months.
     *
     * For more information, see
     * [SnapLock audit log volumes](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/how-snaplock-works.html#snaplock-audit-log-volume)
     * .
     */
    public fun auditLogVolume(auditLogVolume: String) {
        cdkBuilder.auditLogVolume(auditLogVolume)
    }

    /**
     * @param autocommitPeriod The configuration object for setting the autocommit period of files
     *   in an FSx for ONTAP SnapLock volume.
     */
    public fun autocommitPeriod(autocommitPeriod: IResolvable) {
        cdkBuilder.autocommitPeriod(autocommitPeriod)
    }

    /**
     * @param autocommitPeriod The configuration object for setting the autocommit period of files
     *   in an FSx for ONTAP SnapLock volume.
     */
    public fun autocommitPeriod(autocommitPeriod: CfnVolume.AutocommitPeriodProperty) {
        cdkBuilder.autocommitPeriod(autocommitPeriod)
    }

    /**
     * @param privilegedDelete Enables, disables, or permanently disables privileged delete on an
     *   FSx for ONTAP SnapLock Enterprise volume. Enabling privileged delete allows SnapLock
     *   administrators to delete write once, read many (WORM) files even if they have active
     *   retention periods. `PERMANENTLY_DISABLED` is a terminal state. If privileged delete is
     *   permanently disabled on a SnapLock volume, you can't re-enable it. The default value is
     *   `DISABLED` .
     *
     * For more information, see
     * [Privileged delete](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html#privileged-delete)
     * .
     */
    public fun privilegedDelete(privilegedDelete: String) {
        cdkBuilder.privilegedDelete(privilegedDelete)
    }

    /**
     * @param retentionPeriod Specifies the retention period of an FSx for ONTAP SnapLock volume.
     */
    public fun retentionPeriod(retentionPeriod: IResolvable) {
        cdkBuilder.retentionPeriod(retentionPeriod)
    }

    /**
     * @param retentionPeriod Specifies the retention period of an FSx for ONTAP SnapLock volume.
     */
    public fun retentionPeriod(retentionPeriod: CfnVolume.SnaplockRetentionPeriodProperty) {
        cdkBuilder.retentionPeriod(retentionPeriod)
    }

    /**
     * @param snaplockType Specifies the retention mode of an FSx for ONTAP SnapLock volume. After
     *   it is set, it can't be changed. You can choose one of the following retention modes:
     * * `COMPLIANCE` : Files transitioned to write once, read many (WORM) on a Compliance volume
     *   can't be deleted until their retention periods expire. This retention mode is used to
     *   address government or industry-specific mandates or to protect against ransomware attacks.
     *   For more information, see
     *   [SnapLock Compliance](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-compliance.html)
     *   .
     * * `ENTERPRISE` : Files transitioned to WORM on an Enterprise volume can be deleted by
     *   authorized users before their retention periods expire using privileged delete. This
     *   retention mode is used to advance an organization's data integrity and internal compliance
     *   or to test retention settings before using SnapLock Compliance. For more information, see
     *   [SnapLock Enterprise](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html)
     *   .
     */
    public fun snaplockType(snaplockType: String) {
        cdkBuilder.snaplockType(snaplockType)
    }

    /**
     * @param volumeAppendModeEnabled Enables or disables volume-append mode on an FSx for ONTAP
     *   SnapLock volume. Volume-append mode allows you to create WORM-appendable files and write
     *   data to them incrementally. The default value is `false` .
     *
     * For more information, see
     * [Volume-append mode](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/worm-state.html#worm-state-append)
     * .
     */
    public fun volumeAppendModeEnabled(volumeAppendModeEnabled: String) {
        cdkBuilder.volumeAppendModeEnabled(volumeAppendModeEnabled)
    }

    public fun build(): CfnVolume.SnaplockConfigurationProperty = cdkBuilder.build()
}
