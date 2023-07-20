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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnFunction
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnFunctionEnvironmentPropertyDsl {
    private val cdkBuilder: CfnFunction.EnvironmentProperty.Builder =
        CfnFunction.EnvironmentProperty.builder()

    public fun variables(variables: Map<String, String>) {
        cdkBuilder.variables(variables)
    }

    public fun variables(variables: IResolvable) {
        cdkBuilder.variables(variables)
    }

    public fun build(): CfnFunction.EnvironmentProperty = cdkBuilder.build()
}
