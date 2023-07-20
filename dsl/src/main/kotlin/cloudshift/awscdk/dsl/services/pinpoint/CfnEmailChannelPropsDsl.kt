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

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnEmailChannelProps
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnEmailChannelPropsDsl {
    private val cdkBuilder: CfnEmailChannelProps.Builder = CfnEmailChannelProps.builder()

    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    public fun configurationSet(configurationSet: String) {
        cdkBuilder.configurationSet(configurationSet)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun fromAddress(fromAddress: String) {
        cdkBuilder.fromAddress(fromAddress)
    }

    public fun identity(identity: String) {
        cdkBuilder.identity(identity)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnEmailChannelProps = cdkBuilder.build()
}
