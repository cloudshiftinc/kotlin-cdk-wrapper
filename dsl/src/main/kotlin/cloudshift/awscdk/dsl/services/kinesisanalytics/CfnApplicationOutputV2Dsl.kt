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
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnApplicationOutputV2Dsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApplicationOutputV2.Builder =
        CfnApplicationOutputV2.Builder.create(scope, id)

    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    public fun output(output: IResolvable) {
        cdkBuilder.output(output)
    }

    public fun output(output: CfnApplicationOutputV2.OutputProperty) {
        cdkBuilder.output(output)
    }

    public fun build(): CfnApplicationOutputV2 = cdkBuilder.build()
}
