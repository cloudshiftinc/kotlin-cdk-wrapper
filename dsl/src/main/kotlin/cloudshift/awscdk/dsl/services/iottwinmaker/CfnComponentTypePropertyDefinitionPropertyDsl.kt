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

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnComponentTypePropertyDefinitionPropertyDsl {
    private val cdkBuilder: CfnComponentType.PropertyDefinitionProperty.Builder =
        CfnComponentType.PropertyDefinitionProperty.builder()

    public fun configurations(configurations: Map<String, String>) {
        cdkBuilder.configurations(configurations)
    }

    public fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations)
    }

    public fun dataType(dataType: IResolvable) {
        cdkBuilder.dataType(dataType)
    }

    public fun dataType(dataType: CfnComponentType.DataTypeProperty) {
        cdkBuilder.dataType(dataType)
    }

    public fun defaultValue(defaultValue: IResolvable) {
        cdkBuilder.defaultValue(defaultValue)
    }

    public fun defaultValue(defaultValue: CfnComponentType.DataValueProperty) {
        cdkBuilder.defaultValue(defaultValue)
    }

    public fun isExternalId(isExternalId: Boolean) {
        cdkBuilder.isExternalId(isExternalId)
    }

    public fun isExternalId(isExternalId: IResolvable) {
        cdkBuilder.isExternalId(isExternalId)
    }

    public fun isRequiredInEntity(isRequiredInEntity: Boolean) {
        cdkBuilder.isRequiredInEntity(isRequiredInEntity)
    }

    public fun isRequiredInEntity(isRequiredInEntity: IResolvable) {
        cdkBuilder.isRequiredInEntity(isRequiredInEntity)
    }

    public fun isStoredExternally(isStoredExternally: Boolean) {
        cdkBuilder.isStoredExternally(isStoredExternally)
    }

    public fun isStoredExternally(isStoredExternally: IResolvable) {
        cdkBuilder.isStoredExternally(isStoredExternally)
    }

    public fun isTimeSeries(isTimeSeries: Boolean) {
        cdkBuilder.isTimeSeries(isTimeSeries)
    }

    public fun isTimeSeries(isTimeSeries: IResolvable) {
        cdkBuilder.isTimeSeries(isTimeSeries)
    }

    public fun build(): CfnComponentType.PropertyDefinitionProperty = cdkBuilder.build()
}
