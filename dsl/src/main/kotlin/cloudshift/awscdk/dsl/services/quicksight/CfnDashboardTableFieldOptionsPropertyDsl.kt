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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDashboardTableFieldOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.TableFieldOptionsProperty.Builder =
        CfnDashboard.TableFieldOptionsProperty.builder()

    private val _order: MutableList<String> = mutableListOf()

    private val _selectedFieldOptions: MutableList<Any> = mutableListOf()

    public fun order(vararg order: String) {
        _order.addAll(listOf(*order))
    }

    public fun order(order: Collection<String>) {
        _order.addAll(order)
    }

    public fun selectedFieldOptions(vararg selectedFieldOptions: Any) {
        _selectedFieldOptions.addAll(listOf(*selectedFieldOptions))
    }

    public fun selectedFieldOptions(selectedFieldOptions: Collection<Any>) {
        _selectedFieldOptions.addAll(selectedFieldOptions)
    }

    public fun selectedFieldOptions(selectedFieldOptions: IResolvable) {
        cdkBuilder.selectedFieldOptions(selectedFieldOptions)
    }

    public fun build(): CfnDashboard.TableFieldOptionsProperty {
        if (_order.isNotEmpty()) cdkBuilder.order(_order)
        if (_selectedFieldOptions.isNotEmpty()) cdkBuilder.selectedFieldOptions(_selectedFieldOptions)
        return cdkBuilder.build()
    }
}
