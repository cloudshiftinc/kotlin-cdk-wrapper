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

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersionProps
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnComponentVersionPropsDsl {
    private val cdkBuilder: CfnComponentVersionProps.Builder = CfnComponentVersionProps.builder()

    public fun inlineRecipe(inlineRecipe: String) {
        cdkBuilder.inlineRecipe(inlineRecipe)
    }

    public fun lambdaFunction(lambdaFunction: IResolvable) {
        cdkBuilder.lambdaFunction(lambdaFunction)
    }

    public fun lambdaFunction(lambdaFunction: CfnComponentVersion.LambdaFunctionRecipeSourceProperty) {
        cdkBuilder.lambdaFunction(lambdaFunction)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnComponentVersionProps = cdkBuilder.build()
}
