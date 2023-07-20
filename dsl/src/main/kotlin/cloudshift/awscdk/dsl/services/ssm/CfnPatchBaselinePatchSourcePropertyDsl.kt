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

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ssm.CfnPatchBaseline
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPatchBaselinePatchSourcePropertyDsl {
    private val cdkBuilder: CfnPatchBaseline.PatchSourceProperty.Builder =
        CfnPatchBaseline.PatchSourceProperty.builder()

    private val _products: MutableList<String> = mutableListOf()

    public fun configuration(configuration: String) {
        cdkBuilder.configuration(configuration)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun products(vararg products: String) {
        _products.addAll(listOf(*products))
    }

    public fun products(products: Collection<String>) {
        _products.addAll(products)
    }

    public fun build(): CfnPatchBaseline.PatchSourceProperty {
        if (_products.isNotEmpty()) cdkBuilder.products(_products)
        return cdkBuilder.build()
    }
}
