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

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersion
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnModuleDefaultVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnModuleDefaultVersion.Builder =
        CfnModuleDefaultVersion.Builder.create(scope, id)

    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun moduleName(moduleName: String) {
        cdkBuilder.moduleName(moduleName)
    }

    public fun versionId(versionId: String) {
        cdkBuilder.versionId(versionId)
    }

    public fun build(): CfnModuleDefaultVersion = cdkBuilder.build()
}
