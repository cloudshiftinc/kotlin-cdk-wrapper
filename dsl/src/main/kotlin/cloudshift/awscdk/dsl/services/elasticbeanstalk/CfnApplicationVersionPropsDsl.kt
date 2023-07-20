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
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps
import kotlin.String

@CdkDslMarker
public class CfnApplicationVersionPropsDsl {
    private val cdkBuilder: CfnApplicationVersionProps.Builder = CfnApplicationVersionProps.builder()

    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun sourceBundle(sourceBundle: IResolvable) {
        cdkBuilder.sourceBundle(sourceBundle)
    }

    public fun sourceBundle(sourceBundle: CfnApplicationVersion.SourceBundleProperty) {
        cdkBuilder.sourceBundle(sourceBundle)
    }

    public fun build(): CfnApplicationVersionProps = cdkBuilder.build()
}
