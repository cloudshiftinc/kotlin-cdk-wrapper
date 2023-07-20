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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAssetModelAssetModelCompositeModelPropertyDsl {
    private val cdkBuilder: CfnAssetModel.AssetModelCompositeModelProperty.Builder =
        CfnAssetModel.AssetModelCompositeModelProperty.builder()

    private val _compositeModelProperties: MutableList<Any> = mutableListOf()

    public fun compositeModelProperties(vararg compositeModelProperties: Any) {
        _compositeModelProperties.addAll(listOf(*compositeModelProperties))
    }

    public fun compositeModelProperties(compositeModelProperties: Collection<Any>) {
        _compositeModelProperties.addAll(compositeModelProperties)
    }

    public fun compositeModelProperties(compositeModelProperties: IResolvable) {
        cdkBuilder.compositeModelProperties(compositeModelProperties)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnAssetModel.AssetModelCompositeModelProperty {
        if (_compositeModelProperties.isNotEmpty()) {
            cdkBuilder.compositeModelProperties(_compositeModelProperties)
        }
        return cdkBuilder.build()
    }
}
