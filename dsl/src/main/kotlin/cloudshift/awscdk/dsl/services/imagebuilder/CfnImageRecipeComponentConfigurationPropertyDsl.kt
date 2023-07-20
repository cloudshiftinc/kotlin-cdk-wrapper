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

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipe
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnImageRecipeComponentConfigurationPropertyDsl {
    private val cdkBuilder: CfnImageRecipe.ComponentConfigurationProperty.Builder =
        CfnImageRecipe.ComponentConfigurationProperty.builder()

    private val _parameters: MutableList<Any> = mutableListOf()

    public fun componentArn(componentArn: String) {
        cdkBuilder.componentArn(componentArn)
    }

    public fun parameters(vararg parameters: Any) {
        _parameters.addAll(listOf(*parameters))
    }

    public fun parameters(parameters: Collection<Any>) {
        _parameters.addAll(parameters)
    }

    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    public fun build(): CfnImageRecipe.ComponentConfigurationProperty {
        if (_parameters.isNotEmpty()) cdkBuilder.parameters(_parameters)
        return cdkBuilder.build()
    }
}
