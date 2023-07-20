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

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.athena.CfnNamedQuery
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnNamedQueryDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnNamedQuery.Builder = CfnNamedQuery.Builder.create(scope, id)

    public fun database(database: String) {
        cdkBuilder.database(database)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun queryString(queryString: String) {
        cdkBuilder.queryString(queryString)
    }

    public fun workGroup(workGroup: String) {
        cdkBuilder.workGroup(workGroup)
    }

    public fun build(): CfnNamedQuery = cdkBuilder.build()
}
