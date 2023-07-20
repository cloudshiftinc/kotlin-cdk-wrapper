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

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.IEngine
import software.amazon.awscdk.services.rds.ParameterGroup
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class ParameterGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ParameterGroup.Builder = ParameterGroup.Builder.create(scope, id)

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun engine(engine: IEngine) {
        cdkBuilder.engine(engine)
    }

    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    public fun build(): ParameterGroup = cdkBuilder.build()
}
