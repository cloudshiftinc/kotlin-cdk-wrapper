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

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct
import kotlin.String

@CdkDslMarker
public class CfnCloudFormationProductSourceConnectionPropertyDsl {
    private val cdkBuilder: CfnCloudFormationProduct.SourceConnectionProperty.Builder =
        CfnCloudFormationProduct.SourceConnectionProperty.builder()

    public fun connectionParameters(connectionParameters: IResolvable) {
        cdkBuilder.connectionParameters(connectionParameters)
    }

    public fun connectionParameters(connectionParameters: CfnCloudFormationProduct.ConnectionParametersProperty) {
        cdkBuilder.connectionParameters(connectionParameters)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnCloudFormationProduct.SourceConnectionProperty = cdkBuilder.build()
}
