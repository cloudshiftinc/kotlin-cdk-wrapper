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
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
import kotlin.Boolean

@CdkDslMarker
public class CfnApplicationV2FlinkRunConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.FlinkRunConfigurationProperty.Builder =
        CfnApplicationV2.FlinkRunConfigurationProperty.builder()

    public fun allowNonRestoredState(allowNonRestoredState: Boolean) {
        cdkBuilder.allowNonRestoredState(allowNonRestoredState)
    }

    public fun allowNonRestoredState(allowNonRestoredState: IResolvable) {
        cdkBuilder.allowNonRestoredState(allowNonRestoredState)
    }

    public fun build(): CfnApplicationV2.FlinkRunConfigurationProperty = cdkBuilder.build()
}
