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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * Information about a dataset that contains permissions for row-level security (RLS).
 *
 * The permissions dataset maps fields to users or groups. For more information, see
 * [Using Row-Level Security (RLS) to Restrict Access to a Dataset](https://docs.aws.amazon.com/quicksight/latest/user/restrict-access-to-a-data-set-using-row-level-security.html)
 * in the *Amazon QuickSight User Guide* .
 *
 * The option to deny permissions by setting `PermissionPolicy` to `DENY_ACCESS` is not supported
 * for new RLS datasets.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * RowLevelPermissionDataSetProperty rowLevelPermissionDataSetProperty =
 * RowLevelPermissionDataSetProperty.builder()
 * .arn("arn")
 * .permissionPolicy("permissionPolicy")
 * // the properties below are optional
 * .formatVersion("formatVersion")
 * .namespace("namespace")
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiondataset.html)
 */
@CdkDslMarker
public class CfnDataSetRowLevelPermissionDataSetPropertyDsl {
    private val cdkBuilder: CfnDataSet.RowLevelPermissionDataSetProperty.Builder =
        CfnDataSet.RowLevelPermissionDataSetProperty.builder()

    /**
     * @param arn The Amazon Resource Name (ARN) of the dataset that contains permissions for RLS.
     */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    /**
     * @param formatVersion The user or group rules associated with the dataset that contains
     *   permissions for RLS. By default, `FormatVersion` is `VERSION_1` . When `FormatVersion` is
     *   `VERSION_1` , `UserName` and `GroupName` are required. When `FormatVersion` is `VERSION_2`
     *   , `UserARN` and `GroupARN` are required, and `Namespace` must not exist.
     */
    public fun formatVersion(formatVersion: String) {
        cdkBuilder.formatVersion(formatVersion)
    }

    /**
     * @param namespace The namespace associated with the dataset that contains permissions for RLS.
     */
    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    /**
     * @param permissionPolicy The type of permissions to use when interpreting the permissions for
     *   RLS. `DENY_ACCESS` is included for backward compatibility only.
     */
    public fun permissionPolicy(permissionPolicy: String) {
        cdkBuilder.permissionPolicy(permissionPolicy)
    }

    /**
     * @param status The status of the row-level security permission dataset. If enabled, the status
     *   is `ENABLED` . If disabled, the status is `DISABLED` .
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnDataSet.RowLevelPermissionDataSetProperty = cdkBuilder.build()
}
