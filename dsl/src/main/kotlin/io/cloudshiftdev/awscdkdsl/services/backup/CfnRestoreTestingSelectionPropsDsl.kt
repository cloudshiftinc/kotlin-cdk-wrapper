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
import software.amazon.awscdk.services.backup.CfnRestoreTestingSelectionProps

/**
 * Properties for defining a `CfnRestoreTestingSelection`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * CfnRestoreTestingSelectionProps cfnRestoreTestingSelectionProps =
 * CfnRestoreTestingSelectionProps.builder()
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
public class CfnRestoreTestingSelectionPropsDsl {
    private val cdkBuilder: CfnRestoreTestingSelectionProps.Builder =
        CfnRestoreTestingSelectionProps.builder()

    private val _protectedResourceArns: MutableList<String> = mutableListOf()

    /**
     * @param iamRoleArn The Amazon Resource Name (ARN) of the IAM role that AWS Backup uses to
     *   create the target resource;. for example: `arn:aws:iam::123456789012:role/S3Access` .
     */
    public fun iamRoleArn(iamRoleArn: String) {
        cdkBuilder.iamRoleArn(iamRoleArn)
    }

    /**
     * @param protectedResourceArns You can include specific ARNs, such as `ProtectedResourceArns:
     *   ["arn:aws:...", "arn:aws:..."]` or you can include a wildcard: `ProtectedResourceArns:
     *   ["*"]` , but not both.
     */
    public fun protectedResourceArns(vararg protectedResourceArns: String) {
        _protectedResourceArns.addAll(listOf(*protectedResourceArns))
    }

    /**
     * @param protectedResourceArns You can include specific ARNs, such as `ProtectedResourceArns:
     *   ["arn:aws:...", "arn:aws:..."]` or you can include a wildcard: `ProtectedResourceArns:
     *   ["*"]` , but not both.
     */
    public fun protectedResourceArns(protectedResourceArns: Collection<String>) {
        _protectedResourceArns.addAll(protectedResourceArns)
    }

    /**
     * @param protectedResourceConditions In a resource testing selection, this parameter filters by
     *   specific conditions such as `StringEquals` or `StringNotEquals` .
     */
    public fun protectedResourceConditions(protectedResourceConditions: IResolvable) {
        cdkBuilder.protectedResourceConditions(protectedResourceConditions)
    }

    /**
     * @param protectedResourceConditions In a resource testing selection, this parameter filters by
     *   specific conditions such as `StringEquals` or `StringNotEquals` .
     */
    public fun protectedResourceConditions(
        protectedResourceConditions: CfnRestoreTestingSelection.ProtectedResourceConditionsProperty
    ) {
        cdkBuilder.protectedResourceConditions(protectedResourceConditions)
    }

    /**
     * @param protectedResourceType The type of AWS resource included in a resource testing
     *   selection;. for example, an Amazon EBS volume or an Amazon RDS database.
     */
    public fun protectedResourceType(protectedResourceType: String) {
        cdkBuilder.protectedResourceType(protectedResourceType)
    }

    /**
     * @param restoreMetadataOverrides You can override certain restore metadata keys by including
     *   the parameter `RestoreMetadataOverrides` in the body of `RestoreTestingSelection` . Key
     *   values are not case sensitive.
     *
     * See the complete list of
     * [restore testing inferred metadata](https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html)
     * .
     */
    public fun restoreMetadataOverrides(restoreMetadataOverrides: Map<String, String>) {
        cdkBuilder.restoreMetadataOverrides(restoreMetadataOverrides)
    }

    /**
     * @param restoreMetadataOverrides You can override certain restore metadata keys by including
     *   the parameter `RestoreMetadataOverrides` in the body of `RestoreTestingSelection` . Key
     *   values are not case sensitive.
     *
     * See the complete list of
     * [restore testing inferred metadata](https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html)
     * .
     */
    public fun restoreMetadataOverrides(restoreMetadataOverrides: IResolvable) {
        cdkBuilder.restoreMetadataOverrides(restoreMetadataOverrides)
    }

    /**
     * @param restoreTestingPlanName The RestoreTestingPlanName is a unique string that is the name
     *   of the restore testing plan.
     */
    public fun restoreTestingPlanName(restoreTestingPlanName: String) {
        cdkBuilder.restoreTestingPlanName(restoreTestingPlanName)
    }

    /**
     * @param restoreTestingSelectionName This is the unique name of the restore testing selection
     *   that belongs to the related restore testing plan.
     */
    public fun restoreTestingSelectionName(restoreTestingSelectionName: String) {
        cdkBuilder.restoreTestingSelectionName(restoreTestingSelectionName)
    }

    /**
     * @param validationWindowHours This is amount of hours (1 to 168) available to run a validation
     *   script on the data. The data will be deleted upon the completion of the validation script
     *   or the end of the specified retention period, whichever comes first.
     */
    public fun validationWindowHours(validationWindowHours: Number) {
        cdkBuilder.validationWindowHours(validationWindowHours)
    }

    public fun build(): CfnRestoreTestingSelectionProps {
        if (_protectedResourceArns.isNotEmpty())
            cdkBuilder.protectedResourceArns(_protectedResourceArns)
        return cdkBuilder.build()
    }
}
