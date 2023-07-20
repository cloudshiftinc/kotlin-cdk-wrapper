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
import software.amazon.awscdk.services.iottwinmaker.CfnWorkspace
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnWorkspaceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnWorkspace.Builder = CfnWorkspace.Builder.create(scope, id)

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun role(role: String) {
        cdkBuilder.role(role)
    }

    public fun s3Location(s3Location: String) {
        cdkBuilder.s3Location(s3Location)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun workspaceId(workspaceId: String) {
        cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): CfnWorkspace = cdkBuilder.build()
}
