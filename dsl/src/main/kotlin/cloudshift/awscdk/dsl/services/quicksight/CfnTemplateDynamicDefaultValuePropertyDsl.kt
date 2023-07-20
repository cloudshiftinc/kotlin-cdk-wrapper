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
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateDynamicDefaultValuePropertyDsl {
    private val cdkBuilder: CfnTemplate.DynamicDefaultValueProperty.Builder =
        CfnTemplate.DynamicDefaultValueProperty.builder()

    public fun defaultValueColumn(defaultValueColumn: IResolvable) {
        cdkBuilder.defaultValueColumn(defaultValueColumn)
    }

    public fun defaultValueColumn(defaultValueColumn: CfnTemplate.ColumnIdentifierProperty) {
        cdkBuilder.defaultValueColumn(defaultValueColumn)
    }

    public fun groupNameColumn(groupNameColumn: IResolvable) {
        cdkBuilder.groupNameColumn(groupNameColumn)
    }

    public fun groupNameColumn(groupNameColumn: CfnTemplate.ColumnIdentifierProperty) {
        cdkBuilder.groupNameColumn(groupNameColumn)
    }

    public fun userNameColumn(userNameColumn: IResolvable) {
        cdkBuilder.userNameColumn(userNameColumn)
    }

    public fun userNameColumn(userNameColumn: CfnTemplate.ColumnIdentifierProperty) {
        cdkBuilder.userNameColumn(userNameColumn)
    }

    public fun build(): CfnTemplate.DynamicDefaultValueProperty = cdkBuilder.build()
}
