@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDynamicDefaultValuePropertyDsl {
    private val cdkBuilder: CfnDashboard.DynamicDefaultValueProperty.Builder =
        CfnDashboard.DynamicDefaultValueProperty.builder()

    public fun defaultValueColumn(defaultValueColumn: IResolvable) {
        cdkBuilder.defaultValueColumn(defaultValueColumn)
    }

    public fun defaultValueColumn(defaultValueColumn: CfnDashboard.ColumnIdentifierProperty) {
        cdkBuilder.defaultValueColumn(defaultValueColumn)
    }

    public fun groupNameColumn(groupNameColumn: IResolvable) {
        cdkBuilder.groupNameColumn(groupNameColumn)
    }

    public fun groupNameColumn(groupNameColumn: CfnDashboard.ColumnIdentifierProperty) {
        cdkBuilder.groupNameColumn(groupNameColumn)
    }

    public fun userNameColumn(userNameColumn: IResolvable) {
        cdkBuilder.userNameColumn(userNameColumn)
    }

    public fun userNameColumn(userNameColumn: CfnDashboard.ColumnIdentifierProperty) {
        cdkBuilder.userNameColumn(userNameColumn)
    }

    public fun build(): CfnDashboard.DynamicDefaultValueProperty = cdkBuilder.build()
}
