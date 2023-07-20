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
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnAssetModelProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAssetModelPropsDsl {
    private val cdkBuilder: CfnAssetModelProps.Builder = CfnAssetModelProps.builder()

    private val _assetModelCompositeModels: MutableList<Any> = mutableListOf()

    private val _assetModelHierarchies: MutableList<Any> = mutableListOf()

    private val _assetModelProperties: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun assetModelCompositeModels(vararg assetModelCompositeModels: Any) {
        _assetModelCompositeModels.addAll(listOf(*assetModelCompositeModels))
    }

    public fun assetModelCompositeModels(assetModelCompositeModels: Collection<Any>) {
        _assetModelCompositeModels.addAll(assetModelCompositeModels)
    }

    public fun assetModelCompositeModels(assetModelCompositeModels: IResolvable) {
        cdkBuilder.assetModelCompositeModels(assetModelCompositeModels)
    }

    public fun assetModelDescription(assetModelDescription: String) {
        cdkBuilder.assetModelDescription(assetModelDescription)
    }

    public fun assetModelHierarchies(vararg assetModelHierarchies: Any) {
        _assetModelHierarchies.addAll(listOf(*assetModelHierarchies))
    }

    public fun assetModelHierarchies(assetModelHierarchies: Collection<Any>) {
        _assetModelHierarchies.addAll(assetModelHierarchies)
    }

    public fun assetModelHierarchies(assetModelHierarchies: IResolvable) {
        cdkBuilder.assetModelHierarchies(assetModelHierarchies)
    }

    public fun assetModelName(assetModelName: String) {
        cdkBuilder.assetModelName(assetModelName)
    }

    public fun assetModelProperties(vararg assetModelProperties: Any) {
        _assetModelProperties.addAll(listOf(*assetModelProperties))
    }

    public fun assetModelProperties(assetModelProperties: Collection<Any>) {
        _assetModelProperties.addAll(assetModelProperties)
    }

    public fun assetModelProperties(assetModelProperties: IResolvable) {
        cdkBuilder.assetModelProperties(assetModelProperties)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAssetModelProps {
        if (_assetModelCompositeModels.isNotEmpty()) {
            cdkBuilder.assetModelCompositeModels(_assetModelCompositeModels)
        }
        if (_assetModelHierarchies.isNotEmpty()) cdkBuilder.assetModelHierarchies(_assetModelHierarchies)
        if (_assetModelProperties.isNotEmpty()) cdkBuilder.assetModelProperties(_assetModelProperties)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
