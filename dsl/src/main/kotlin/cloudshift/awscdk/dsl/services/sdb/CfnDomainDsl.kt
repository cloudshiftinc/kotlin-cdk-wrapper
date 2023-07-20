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

package cloudshift.awscdk.dsl.services.sdb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sdb.CfnDomain
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnDomainDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDomain.Builder = CfnDomain.Builder.create(scope, id)

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun build(): CfnDomain = cdkBuilder.build()
}
