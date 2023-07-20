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
import software.amazon.awscdk.services.cloudformation.CfnModuleVersion
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnModuleVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnModuleVersion.Builder = CfnModuleVersion.Builder.create(scope, id)

    public fun moduleName(moduleName: String) {
        cdkBuilder.moduleName(moduleName)
    }

    public fun modulePackage(modulePackage: String) {
        cdkBuilder.modulePackage(modulePackage)
    }

    public fun build(): CfnModuleVersion = cdkBuilder.build()
}
