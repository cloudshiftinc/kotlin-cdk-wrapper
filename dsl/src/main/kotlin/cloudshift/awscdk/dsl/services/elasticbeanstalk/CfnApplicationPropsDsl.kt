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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplication
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps
import kotlin.String

@CdkDslMarker
public class CfnApplicationPropsDsl {
    private val cdkBuilder: CfnApplicationProps.Builder = CfnApplicationProps.builder()

    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun resourceLifecycleConfig(resourceLifecycleConfig: IResolvable) {
        cdkBuilder.resourceLifecycleConfig(resourceLifecycleConfig)
    }

    public fun resourceLifecycleConfig(resourceLifecycleConfig: CfnApplication.ApplicationResourceLifecycleConfigProperty) {
        cdkBuilder.resourceLifecycleConfig(resourceLifecycleConfig)
    }

    public fun build(): CfnApplicationProps = cdkBuilder.build()
}
