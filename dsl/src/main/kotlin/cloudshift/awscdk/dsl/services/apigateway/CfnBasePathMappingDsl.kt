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
import software.amazon.awscdk.services.apigateway.CfnBasePathMapping
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnBasePathMappingDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnBasePathMapping.Builder = CfnBasePathMapping.Builder.create(scope, id)

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

    public fun build(): CfnBasePathMapping = cdkBuilder.build()
}
