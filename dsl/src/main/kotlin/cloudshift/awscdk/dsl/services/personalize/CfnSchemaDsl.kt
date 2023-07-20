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

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.personalize.CfnSchema
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnSchemaDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSchema.Builder = CfnSchema.Builder.create(scope, id)

    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun schema(schema: String) {
        cdkBuilder.schema(schema)
    }

    public fun build(): CfnSchema = cdkBuilder.build()
}
