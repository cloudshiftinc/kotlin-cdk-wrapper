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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTemplatePivotTableCellConditionalFormattingPropertyDsl {
    private val cdkBuilder: CfnTemplate.PivotTableCellConditionalFormattingProperty.Builder =
        CfnTemplate.PivotTableCellConditionalFormattingProperty.builder()

    private val _scopes: MutableList<Any> = mutableListOf()

    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    public fun scope(scope: IResolvable) {
        cdkBuilder.scope(scope)
    }

    public fun scope(scope: CfnTemplate.PivotTableConditionalFormattingScopeProperty) {
        cdkBuilder.scope(scope)
    }

    public fun scopes(vararg scopes: Any) {
        _scopes.addAll(listOf(*scopes))
    }

    public fun scopes(scopes: Collection<Any>) {
        _scopes.addAll(scopes)
    }

    public fun scopes(scopes: IResolvable) {
        cdkBuilder.scopes(scopes)
    }

    public fun textFormat(textFormat: IResolvable) {
        cdkBuilder.textFormat(textFormat)
    }

    public fun textFormat(textFormat: CfnTemplate.TextConditionalFormatProperty) {
        cdkBuilder.textFormat(textFormat)
    }

    public fun build(): CfnTemplate.PivotTableCellConditionalFormattingProperty {
        if (_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
        return cdkBuilder.build()
    }
}
