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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnFunction
import software.amazon.awscdk.services.cloudfront.CfnFunctionProps
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnFunctionPropsDsl {
    private val cdkBuilder: CfnFunctionProps.Builder = CfnFunctionProps.builder()

    public fun autoPublish(autoPublish: Boolean) {
        cdkBuilder.autoPublish(autoPublish)
    }

    public fun autoPublish(autoPublish: IResolvable) {
        cdkBuilder.autoPublish(autoPublish)
    }

    public fun functionCode(functionCode: String) {
        cdkBuilder.functionCode(functionCode)
    }

    public fun functionConfig(functionConfig: IResolvable) {
        cdkBuilder.functionConfig(functionConfig)
    }

    public fun functionConfig(functionConfig: CfnFunction.FunctionConfigProperty) {
        cdkBuilder.functionConfig(functionConfig)
    }

    public fun functionMetadata(functionMetadata: IResolvable) {
        cdkBuilder.functionMetadata(functionMetadata)
    }

    public fun functionMetadata(functionMetadata: CfnFunction.FunctionMetadataProperty) {
        cdkBuilder.functionMetadata(functionMetadata)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnFunctionProps = cdkBuilder.build()
}
