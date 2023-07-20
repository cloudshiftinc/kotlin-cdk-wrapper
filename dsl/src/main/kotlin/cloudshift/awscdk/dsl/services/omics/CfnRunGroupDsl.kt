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

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.omics.CfnRunGroup
import software.constructs.Construct
import kotlin.Number
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnRunGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRunGroup.Builder = CfnRunGroup.Builder.create(scope, id)

    public fun maxCpus(maxCpus: Number) {
        cdkBuilder.maxCpus(maxCpus)
    }

    public fun maxDuration(maxDuration: Number) {
        cdkBuilder.maxDuration(maxDuration)
    }

    public fun maxRuns(maxRuns: Number) {
        cdkBuilder.maxRuns(maxRuns)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnRunGroup = cdkBuilder.build()
}
