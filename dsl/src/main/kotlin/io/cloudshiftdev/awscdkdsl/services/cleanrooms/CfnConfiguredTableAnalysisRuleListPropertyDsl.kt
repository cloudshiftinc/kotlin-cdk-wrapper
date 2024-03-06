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

package io.cloudshiftdev.awscdkdsl.services.cleanrooms

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable

/**
 * A type of analysis rule that enables row-level analysis.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * AnalysisRuleListProperty analysisRuleListProperty = AnalysisRuleListProperty.builder()
 * .joinColumns(List.of("joinColumns"))
 * .listColumns(List.of("listColumns"))
 * // the properties below are optional
 * .allowedJoinOperators(List.of("allowedJoinOperators"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisrulelist.html)
 */
@CdkDslMarker
public class CfnConfiguredTableAnalysisRuleListPropertyDsl {
    private val cdkBuilder: CfnConfiguredTable.AnalysisRuleListProperty.Builder =
        CfnConfiguredTable.AnalysisRuleListProperty.builder()

    private val _allowedJoinOperators: MutableList<String> = mutableListOf()

    private val _joinColumns: MutableList<String> = mutableListOf()

    private val _listColumns: MutableList<String> = mutableListOf()

    /**
     * @param allowedJoinOperators The logical operators (if any) that are to be used in an INNER
     *   JOIN match condition. Default is `AND` .
     */
    public fun allowedJoinOperators(vararg allowedJoinOperators: String) {
        _allowedJoinOperators.addAll(listOf(*allowedJoinOperators))
    }

    /**
     * @param allowedJoinOperators The logical operators (if any) that are to be used in an INNER
     *   JOIN match condition. Default is `AND` .
     */
    public fun allowedJoinOperators(allowedJoinOperators: Collection<String>) {
        _allowedJoinOperators.addAll(allowedJoinOperators)
    }

    /**
     * @param joinColumns Columns that can be used to join a configured table with the table of the
     *   member who can query and other members' configured tables.
     */
    public fun joinColumns(vararg joinColumns: String) {
        _joinColumns.addAll(listOf(*joinColumns))
    }

    /**
     * @param joinColumns Columns that can be used to join a configured table with the table of the
     *   member who can query and other members' configured tables.
     */
    public fun joinColumns(joinColumns: Collection<String>) {
        _joinColumns.addAll(joinColumns)
    }

    /** @param listColumns Columns that can be listed in the output. */
    public fun listColumns(vararg listColumns: String) {
        _listColumns.addAll(listOf(*listColumns))
    }

    /** @param listColumns Columns that can be listed in the output. */
    public fun listColumns(listColumns: Collection<String>) {
        _listColumns.addAll(listColumns)
    }

    public fun build(): CfnConfiguredTable.AnalysisRuleListProperty {
        if (_allowedJoinOperators.isNotEmpty())
            cdkBuilder.allowedJoinOperators(_allowedJoinOperators)
        if (_joinColumns.isNotEmpty()) cdkBuilder.joinColumns(_joinColumns)
        if (_listColumns.isNotEmpty()) cdkBuilder.listColumns(_listColumns)
        return cdkBuilder.build()
    }
}
