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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps
import kotlin.String

@CdkDslMarker
public class CfnApplicationOutputPropsDsl {
    private val cdkBuilder: CfnApplicationOutputProps.Builder = CfnApplicationOutputProps.builder()

    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    public fun output(output: IResolvable) {
        cdkBuilder.output(output)
    }

    public fun output(output: CfnApplicationOutput.OutputProperty) {
        cdkBuilder.output(output)
    }

    public fun build(): CfnApplicationOutputProps = cdkBuilder.build()
}
