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

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment
import kotlin.String

@CdkDslMarker
public class CfnEnvironmentTierPropertyDsl {
    private val cdkBuilder: CfnEnvironment.TierProperty.Builder =
        CfnEnvironment.TierProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnEnvironment.TierProperty = cdkBuilder.build()
}
