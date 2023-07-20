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

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.apigateway.CfnBasePathMappingProps
import kotlin.String

@CdkDslMarker
public class CfnBasePathMappingPropsDsl {
    private val cdkBuilder: CfnBasePathMappingProps.Builder = CfnBasePathMappingProps.builder()

    public fun basePath(basePath: String) {
        cdkBuilder.basePath(basePath)
    }

    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun restApiId(restApiId: String) {
        cdkBuilder.restApiId(restApiId)
    }

    public fun stage(stage: String) {
        cdkBuilder.stage(stage)
    }

    public fun build(): CfnBasePathMappingProps = cdkBuilder.build()
}
