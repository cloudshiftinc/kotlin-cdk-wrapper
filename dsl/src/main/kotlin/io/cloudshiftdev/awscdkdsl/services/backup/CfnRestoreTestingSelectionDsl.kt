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

package io.cloudshiftdev.awscdkdsl.services.backup

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnRestoreTestingSelection
import software.constructs.Construct

/**
 * This request can be sent after CreateRestoreTestingPlan request returns successfully.
 *
 * This is the second part of creating a resource testing plan, and it must be completed
 * sequentially.
 *
 * This consists of `RestoreTestingSelectionName` , `ProtectedResourceType` , and one of the
 * following:
 * * `ProtectedResourceArns`
 * * `ProtectedResourceConditions`
 *
 * Each protected resource type can have one single value.
 *
 * A restore testing selection can include a wildcard value ("*") for `ProtectedResourceArns` along
 * with `ProtectedResourceConditions` . Alternatively, you can include up to 30 specific protected
 * resource ARNs in `ProtectedResourceArns` .
 *
 * Cannot select by both protected resource types AND specific ARNs. Request will fail if both are
 * included.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * CfnRestoreTestingSelection cfnRestoreTestingSelection =
 * CfnRestoreTestingSelection.Builder.create(this, "MyCfnRestoreTestingSelection")
 * .iamRoleArn("iamRoleArn")
 * .protectedResourceType("protectedResourceType")
 * .restoreTestingPlanName("restoreTestingPlanName")
 * .restoreTestingSelectionName("restoreTestingSelectionName")
 * // the properties below are optional
 * .protectedResourceArns(List.of("protectedResourceArns"))
 * .protectedResourceConditions(ProtectedResourceConditionsProperty.builder()
 * .stringEquals(List.of(KeyValueProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .stringNotEquals(List.of(KeyValueProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build())
 * .restoreMetadataOverrides(Map.of(
 * "restoreMetadataOverridesKey", "restoreMetadataOverrides"))
 * .validationWindowHours(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html)
 */
@CdkDslMarker
public class CfnRestoreTestingSelectionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRestoreTestingSelection.Builder =
        CfnRestoreTestingSelection.Builder.create(scope, id)

    private val _protectedResourceArns: MutableList<String> = mutableListOf()

    /**
     * The Amazon Resource Name (ARN) of the IAM role that AWS Backup uses to create the target
     * resource;
     *
     * for example: `arn:aws:iam::123456789012:role/S3Access` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-iamrolearn)
     *
     * @param iamRoleArn The Amazon Resource Name (ARN) of the IAM role that AWS Backup uses to
     *   create the target resource;.
     */
    public fun iamRoleArn(iamRoleArn: String) {
        cdkBuilder.iamRoleArn(iamRoleArn)
    }

    /**
     * You can include specific ARNs, such as `ProtectedResourceArns:
     * ["arn:aws:...", "arn:aws:..."]` or you can include a wildcard: `ProtectedResourceArns: ["*"]`
     * , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-protectedresourcearns)
     *
     * @param protectedResourceArns You can include specific ARNs, such as `ProtectedResourceArns:
     *   ["arn:aws:...", "arn:aws:..."]` or you can include a wildcard: `ProtectedResourceArns:
     *   ["*"]` , but not both.
     */
    public fun protectedResourceArns(vararg protectedResourceArns: String) {
        _protectedResourceArns.addAll(listOf(*protectedResourceArns))
    }

    /**
     * You can include specific ARNs, such as `ProtectedResourceArns:
     * ["arn:aws:...", "arn:aws:..."]` or you can include a wildcard: `ProtectedResourceArns: ["*"]`
     * , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-protectedresourcearns)
     *
     * @param protectedResourceArns You can include specific ARNs, such as `ProtectedResourceArns:
     *   ["arn:aws:...", "arn:aws:..."]` or you can include a wildcard: `ProtectedResourceArns:
     *   ["*"]` , but not both.
     */
    public fun protectedResourceArns(protectedResourceArns: Collection<String>) {
        _protectedResourceArns.addAll(protectedResourceArns)
    }

    /**
     * In a resource testing selection, this parameter filters by specific conditions such as
     * `StringEquals` or `StringNotEquals` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-protectedresourceconditions)
     *
     * @param protectedResourceConditions In a resource testing selection, this parameter filters by
     *   specific conditions such as `StringEquals` or `StringNotEquals` .
     */
    public fun protectedResourceConditions(protectedResourceConditions: IResolvable) {
        cdkBuilder.protectedResourceConditions(protectedResourceConditions)
    }

    /**
     * In a resource testing selection, this parameter filters by specific conditions such as
     * `StringEquals` or `StringNotEquals` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-protectedresourceconditions)
     *
     * @param protectedResourceConditions In a resource testing selection, this parameter filters by
     *   specific conditions such as `StringEquals` or `StringNotEquals` .
     */
    public fun protectedResourceConditions(
        protectedResourceConditions: CfnRestoreTestingSelection.ProtectedResourceConditionsProperty
    ) {
        cdkBuilder.protectedResourceConditions(protectedResourceConditions)
    }

    /**
     * The type of AWS resource included in a resource testing selection;
     *
     * for example, an Amazon EBS volume or an Amazon RDS database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-protectedresourcetype)
     *
     * @param protectedResourceType The type of AWS resource included in a resource testing
     *   selection;.
     */
    public fun protectedResourceType(protectedResourceType: String) {
        cdkBuilder.protectedResourceType(protectedResourceType)
    }

    /**
     * You can override certain restore metadata keys by including the parameter
     * `RestoreMetadataOverrides` in the body of `RestoreTestingSelection` .
     *
     * Key values are not case sensitive.
     *
     * See the complete list of
     * [restore testing inferred metadata](https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-restoremetadataoverrides)
     *
     * @param restoreMetadataOverrides You can override certain restore metadata keys by including
     *   the parameter `RestoreMetadataOverrides` in the body of `RestoreTestingSelection` .
     */
    public fun restoreMetadataOverrides(restoreMetadataOverrides: Map<String, String>) {
        cdkBuilder.restoreMetadataOverrides(restoreMetadataOverrides)
    }

    /**
     * You can override certain restore metadata keys by including the parameter
     * `RestoreMetadataOverrides` in the body of `RestoreTestingSelection` .
     *
     * Key values are not case sensitive.
     *
     * See the complete list of
     * [restore testing inferred metadata](https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-restoremetadataoverrides)
     *
     * @param restoreMetadataOverrides You can override certain restore metadata keys by including
     *   the parameter `RestoreMetadataOverrides` in the body of `RestoreTestingSelection` .
     */
    public fun restoreMetadataOverrides(restoreMetadataOverrides: IResolvable) {
        cdkBuilder.restoreMetadataOverrides(restoreMetadataOverrides)
    }

    /**
     * The RestoreTestingPlanName is a unique string that is the name of the restore testing plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-restoretestingplanname)
     *
     * @param restoreTestingPlanName The RestoreTestingPlanName is a unique string that is the name
     *   of the restore testing plan.
     */
    public fun restoreTestingPlanName(restoreTestingPlanName: String) {
        cdkBuilder.restoreTestingPlanName(restoreTestingPlanName)
    }

    /**
     * This is the unique name of the restore testing selection that belongs to the related restore
     * testing plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-restoretestingselectionname)
     *
     * @param restoreTestingSelectionName This is the unique name of the restore testing selection
     *   that belongs to the related restore testing plan.
     */
    public fun restoreTestingSelectionName(restoreTestingSelectionName: String) {
        cdkBuilder.restoreTestingSelectionName(restoreTestingSelectionName)
    }

    /**
     * This is amount of hours (1 to 168) available to run a validation script on the data.
     *
     * The data will be deleted upon the completion of the validation script or the end of the
     * specified retention period, whichever comes first.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingselection.html#cfn-backup-restoretestingselection-validationwindowhours)
     *
     * @param validationWindowHours This is amount of hours (1 to 168) available to run a validation
     *   script on the data.
     */
    public fun validationWindowHours(validationWindowHours: Number) {
        cdkBuilder.validationWindowHours(validationWindowHours)
    }

    public fun build(): CfnRestoreTestingSelection {
        if (_protectedResourceArns.isNotEmpty())
            cdkBuilder.protectedResourceArns(_protectedResourceArns)
        return cdkBuilder.build()
    }
}
