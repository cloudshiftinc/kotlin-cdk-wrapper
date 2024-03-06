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

package io.cloudshiftdev.awscdkdsl.services.datasync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnTask

/**
 * Customizes the reporting level for aspects of your task report.
 *
 * For example, your report might generally only include errors, but you could specify that you want
 * a list of successes and errors just for the files that DataSync attempted to delete in your
 * destination location.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * OverridesProperty overridesProperty = OverridesProperty.builder()
 * .deleted(DeletedProperty.builder()
 * .reportLevel("reportLevel")
 * .build())
 * .skipped(SkippedProperty.builder()
 * .reportLevel("reportLevel")
 * .build())
 * .transferred(TransferredProperty.builder()
 * .reportLevel("reportLevel")
 * .build())
 * .verified(VerifiedProperty.builder()
 * .reportLevel("reportLevel")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-overrides.html)
 */
@CdkDslMarker
public class CfnTaskOverridesPropertyDsl {
    private val cdkBuilder: CfnTask.OverridesProperty.Builder = CfnTask.OverridesProperty.builder()

    /**
     * @param deleted Specifies the level of reporting for the files, objects, and directories that
     *   DataSync attempted to delete in your destination location. This only applies if you
     *   [configure your task](https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html)
     *   to delete data in the destination that isn't in the source.
     */
    public fun deleted(deleted: IResolvable) {
        cdkBuilder.deleted(deleted)
    }

    /**
     * @param deleted Specifies the level of reporting for the files, objects, and directories that
     *   DataSync attempted to delete in your destination location. This only applies if you
     *   [configure your task](https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html)
     *   to delete data in the destination that isn't in the source.
     */
    public fun deleted(deleted: CfnTask.DeletedProperty) {
        cdkBuilder.deleted(deleted)
    }

    /**
     * @param skipped Specifies the level of reporting for the files, objects, and directories that
     *   DataSync attempted to skip during your transfer.
     */
    public fun skipped(skipped: IResolvable) {
        cdkBuilder.skipped(skipped)
    }

    /**
     * @param skipped Specifies the level of reporting for the files, objects, and directories that
     *   DataSync attempted to skip during your transfer.
     */
    public fun skipped(skipped: CfnTask.SkippedProperty) {
        cdkBuilder.skipped(skipped)
    }

    /**
     * @param transferred Specifies the level of reporting for the files, objects, and directories
     *   that DataSync attempted to transfer.
     */
    public fun transferred(transferred: IResolvable) {
        cdkBuilder.transferred(transferred)
    }

    /**
     * @param transferred Specifies the level of reporting for the files, objects, and directories
     *   that DataSync attempted to transfer.
     */
    public fun transferred(transferred: CfnTask.TransferredProperty) {
        cdkBuilder.transferred(transferred)
    }

    /**
     * @param verified Specifies the level of reporting for the files, objects, and directories that
     *   DataSync attempted to verify during your transfer.
     */
    public fun verified(verified: IResolvable) {
        cdkBuilder.verified(verified)
    }

    /**
     * @param verified Specifies the level of reporting for the files, objects, and directories that
     *   DataSync attempted to verify during your transfer.
     */
    public fun verified(verified: CfnTask.VerifiedProperty) {
        cdkBuilder.verified(verified)
    }

    public fun build(): CfnTask.OverridesProperty = cdkBuilder.build()
}
