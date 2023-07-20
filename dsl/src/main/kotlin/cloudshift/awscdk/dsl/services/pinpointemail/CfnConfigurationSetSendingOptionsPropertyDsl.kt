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

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet
import kotlin.Boolean

@CdkDslMarker
public class CfnConfigurationSetSendingOptionsPropertyDsl {
    private val cdkBuilder: CfnConfigurationSet.SendingOptionsProperty.Builder =
        CfnConfigurationSet.SendingOptionsProperty.builder()

    public fun sendingEnabled(sendingEnabled: Boolean) {
        cdkBuilder.sendingEnabled(sendingEnabled)
    }

    public fun sendingEnabled(sendingEnabled: IResolvable) {
        cdkBuilder.sendingEnabled(sendingEnabled)
    }

    public fun build(): CfnConfigurationSet.SendingOptionsProperty = cdkBuilder.build()
}
