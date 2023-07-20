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

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel
import kotlin.String

@CdkDslMarker
public class CfnAssetModelAssetModelPropertyPropertyDsl {
    private val cdkBuilder: CfnAssetModel.AssetModelPropertyProperty.Builder =
        CfnAssetModel.AssetModelPropertyProperty.builder()

    public fun dataType(dataType: String) {
        cdkBuilder.dataType(dataType)
    }

    public fun dataTypeSpec(dataTypeSpec: String) {
        cdkBuilder.dataTypeSpec(dataTypeSpec)
    }

    public fun logicalId(logicalId: String) {
        cdkBuilder.logicalId(logicalId)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun type(type: IResolvable) {
        cdkBuilder.type(type)
    }

    public fun type(type: CfnAssetModel.PropertyTypeProperty) {
        cdkBuilder.type(type)
    }

    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    public fun build(): CfnAssetModel.AssetModelPropertyProperty = cdkBuilder.build()
}
