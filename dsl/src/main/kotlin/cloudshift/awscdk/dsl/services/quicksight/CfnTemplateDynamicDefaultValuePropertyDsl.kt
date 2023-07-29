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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * Defines different defaults to the users or groups based on mapping.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DynamicDefaultValueProperty dynamicDefaultValueProperty = DynamicDefaultValueProperty.builder()
 * .defaultValueColumn(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * // the properties below are optional
 * .groupNameColumn(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .userNameColumn(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-dynamicdefaultvalue.html)
 */
@CdkDslMarker
public class CfnTemplateDynamicDefaultValuePropertyDsl {
    private val cdkBuilder: CfnTemplate.DynamicDefaultValueProperty.Builder =
        CfnTemplate.DynamicDefaultValueProperty.builder()

    /**
     * @param defaultValueColumn The column that contains the default value of each user or group.
     */
    public fun defaultValueColumn(defaultValueColumn: IResolvable) {
        cdkBuilder.defaultValueColumn(defaultValueColumn)
    }

    /**
     * @param defaultValueColumn The column that contains the default value of each user or group.
     */
    public fun defaultValueColumn(defaultValueColumn: CfnTemplate.ColumnIdentifierProperty) {
        cdkBuilder.defaultValueColumn(defaultValueColumn)
    }

    /** @param groupNameColumn The column that contains the group name. */
    public fun groupNameColumn(groupNameColumn: IResolvable) {
        cdkBuilder.groupNameColumn(groupNameColumn)
    }

    /** @param groupNameColumn The column that contains the group name. */
    public fun groupNameColumn(groupNameColumn: CfnTemplate.ColumnIdentifierProperty) {
        cdkBuilder.groupNameColumn(groupNameColumn)
    }

    /** @param userNameColumn The column that contains the username. */
    public fun userNameColumn(userNameColumn: IResolvable) {
        cdkBuilder.userNameColumn(userNameColumn)
    }

    /** @param userNameColumn The column that contains the username. */
    public fun userNameColumn(userNameColumn: CfnTemplate.ColumnIdentifierProperty) {
        cdkBuilder.userNameColumn(userNameColumn)
    }

    public fun build(): CfnTemplate.DynamicDefaultValueProperty = cdkBuilder.build()
}
