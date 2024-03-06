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
import kotlin.collections.MutableList
import software.amazon.awscdk.services.backup.CfnRestoreTestingPlan

/**
 * Required: Algorithm;
 *
 * Required: Recovery point types; IncludeVaults(one or more). Optional: SelectionWindowDays ('30'
 * if not specified);ExcludeVaults (list of selectors), defaults to empty list if not listed.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * RestoreTestingRecoveryPointSelectionProperty restoreTestingRecoveryPointSelectionProperty =
 * RestoreTestingRecoveryPointSelectionProperty.builder()
 * .algorithm("algorithm")
 * .includeVaults(List.of("includeVaults"))
 * .recoveryPointTypes(List.of("recoveryPointTypes"))
 * // the properties below are optional
 * .excludeVaults(List.of("excludeVaults"))
 * .selectionWindowDays(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-restoretestingplan-restoretestingrecoverypointselection.html)
 */
@CdkDslMarker
public class CfnRestoreTestingPlanRestoreTestingRecoveryPointSelectionPropertyDsl {
    private val cdkBuilder:
        CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty.Builder =
        CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty.builder()

    private val _excludeVaults: MutableList<String> = mutableListOf()

    private val _includeVaults: MutableList<String> = mutableListOf()

    private val _recoveryPointTypes: MutableList<String> = mutableListOf()

    /**
     * @param algorithm Acceptable values include "LATEST_WITHIN_WINDOW" or "RANDOM_WITHIN_WINDOW".
     */
    public fun algorithm(algorithm: String) {
        cdkBuilder.algorithm(algorithm)
    }

    /**
     * @param excludeVaults Accepted values include specific ARNs or list of selectors. Defaults to
     *   empty list if not listed.
     */
    public fun excludeVaults(vararg excludeVaults: String) {
        _excludeVaults.addAll(listOf(*excludeVaults))
    }

    /**
     * @param excludeVaults Accepted values include specific ARNs or list of selectors. Defaults to
     *   empty list if not listed.
     */
    public fun excludeVaults(excludeVaults: Collection<String>) {
        _excludeVaults.addAll(excludeVaults)
    }

    /**
     * @param includeVaults Accepted values include wildcard ["*"] or by specific ARNs or ARN
     *   wilcard replacement ["arn:aws:backup:us-west-2:123456789012:backup-vault:asdf", ...]
     *   ["arn:aws:backup:*:*:backup-vault:asdf-*", ...].
     */
    public fun includeVaults(vararg includeVaults: String) {
        _includeVaults.addAll(listOf(*includeVaults))
    }

    /**
     * @param includeVaults Accepted values include wildcard ["*"] or by specific ARNs or ARN
     *   wilcard replacement ["arn:aws:backup:us-west-2:123456789012:backup-vault:asdf", ...]
     *   ["arn:aws:backup:*:*:backup-vault:asdf-*", ...].
     */
    public fun includeVaults(includeVaults: Collection<String>) {
        _includeVaults.addAll(includeVaults)
    }

    /** @param recoveryPointTypes These are the types of recovery points. */
    public fun recoveryPointTypes(vararg recoveryPointTypes: String) {
        _recoveryPointTypes.addAll(listOf(*recoveryPointTypes))
    }

    /** @param recoveryPointTypes These are the types of recovery points. */
    public fun recoveryPointTypes(recoveryPointTypes: Collection<String>) {
        _recoveryPointTypes.addAll(recoveryPointTypes)
    }

    /** @param selectionWindowDays Accepted values are integers from 1 to 365. */
    public fun selectionWindowDays(selectionWindowDays: Number) {
        cdkBuilder.selectionWindowDays(selectionWindowDays)
    }

    public fun build(): CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty {
        if (_excludeVaults.isNotEmpty()) cdkBuilder.excludeVaults(_excludeVaults)
        if (_includeVaults.isNotEmpty()) cdkBuilder.includeVaults(_includeVaults)
        if (_recoveryPointTypes.isNotEmpty()) cdkBuilder.recoveryPointTypes(_recoveryPointTypes)
        return cdkBuilder.build()
    }
}
