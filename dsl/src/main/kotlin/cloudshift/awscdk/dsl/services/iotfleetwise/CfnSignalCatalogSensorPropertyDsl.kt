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

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnSignalCatalogSensorPropertyDsl {
    private val cdkBuilder: CfnSignalCatalog.SensorProperty.Builder =
        CfnSignalCatalog.SensorProperty.builder()

    private val _allowedValues: MutableList<String> = mutableListOf()

    public fun allowedValues(vararg allowedValues: String) {
        _allowedValues.addAll(listOf(*allowedValues))
    }

    public fun allowedValues(allowedValues: Collection<String>) {
        _allowedValues.addAll(allowedValues)
    }

    public fun dataType(dataType: String) {
        cdkBuilder.dataType(dataType)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun fullyQualifiedName(fullyQualifiedName: String) {
        cdkBuilder.fullyQualifiedName(fullyQualifiedName)
    }

    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    public fun build(): CfnSignalCatalog.SensorProperty {
        if (_allowedValues.isNotEmpty()) cdkBuilder.allowedValues(_allowedValues)
        return cdkBuilder.build()
    }
}
