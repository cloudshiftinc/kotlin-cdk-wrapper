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

@CdkDslMarker
public class CfnComponentTypeDataConnectorPropertyDsl {
    private val cdkBuilder: CfnComponentType.DataConnectorProperty.Builder =
        CfnComponentType.DataConnectorProperty.builder()

    public fun isNative(isNative: Boolean) {
        cdkBuilder.isNative(isNative)
    }

    public fun isNative(isNative: IResolvable) {
        cdkBuilder.isNative(isNative)
    }

    public fun lambda(lambda: IResolvable) {
        cdkBuilder.lambda(lambda)
    }

    public fun lambda(lambda: CfnComponentType.LambdaFunctionProperty) {
        cdkBuilder.lambda(lambda)
    }

    public fun build(): CfnComponentType.DataConnectorProperty = cdkBuilder.build()
}
