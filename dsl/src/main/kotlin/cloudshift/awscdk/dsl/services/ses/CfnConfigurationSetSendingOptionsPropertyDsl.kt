@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnConfigurationSet

/**
 * Used to enable or disable email sending for messages that use this configuration set in the
 * current AWS Region.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * SendingOptionsProperty sendingOptionsProperty = SendingOptionsProperty.builder()
 * .sendingEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-sendingoptions.html)
 */
@CdkDslMarker
public class CfnConfigurationSetSendingOptionsPropertyDsl {
    private val cdkBuilder: CfnConfigurationSet.SendingOptionsProperty.Builder =
        CfnConfigurationSet.SendingOptionsProperty.builder()

    /**
     * @param sendingEnabled If `true` , email sending is enabled for the configuration set. If
     *   `false` , email sending is disabled for the configuration set.
     */
    public fun sendingEnabled(sendingEnabled: Boolean) {
        cdkBuilder.sendingEnabled(sendingEnabled)
    }

    /**
     * @param sendingEnabled If `true` , email sending is enabled for the configuration set. If
     *   `false` , email sending is disabled for the configuration set.
     */
    public fun sendingEnabled(sendingEnabled: IResolvable) {
        cdkBuilder.sendingEnabled(sendingEnabled)
    }

    public fun build(): CfnConfigurationSet.SendingOptionsProperty = cdkBuilder.build()
}
