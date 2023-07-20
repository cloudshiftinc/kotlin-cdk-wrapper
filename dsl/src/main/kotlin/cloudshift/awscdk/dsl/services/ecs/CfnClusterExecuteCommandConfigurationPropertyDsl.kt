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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnCluster
import kotlin.String

@CdkDslMarker
public class CfnClusterExecuteCommandConfigurationPropertyDsl {
    private val cdkBuilder: CfnCluster.ExecuteCommandConfigurationProperty.Builder =
        CfnCluster.ExecuteCommandConfigurationProperty.builder()

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun logConfiguration(logConfiguration: IResolvable) {
        cdkBuilder.logConfiguration(logConfiguration)
    }

    public fun logConfiguration(logConfiguration: CfnCluster.ExecuteCommandLogConfigurationProperty) {
        cdkBuilder.logConfiguration(logConfiguration)
    }

    public fun logging(logging: String) {
        cdkBuilder.logging(logging)
    }

    public fun build(): CfnCluster.ExecuteCommandConfigurationProperty = cdkBuilder.build()
}
