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
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.rds.ClusterEngineBindOptions
import software.amazon.awscdk.services.rds.IParameterGroup

@CdkDslMarker
public class ClusterEngineBindOptionsDsl {
    private val cdkBuilder: ClusterEngineBindOptions.Builder = ClusterEngineBindOptions.builder()

    public fun parameterGroup(parameterGroup: IParameterGroup) {
        cdkBuilder.parameterGroup(parameterGroup)
    }

    public fun s3ExportRole(s3ExportRole: IRole) {
        cdkBuilder.s3ExportRole(s3ExportRole)
    }

    public fun s3ImportRole(s3ImportRole: IRole) {
        cdkBuilder.s3ImportRole(s3ImportRole)
    }

    public fun build(): ClusterEngineBindOptions = cdkBuilder.build()
}
