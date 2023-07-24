@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnBaiduChannelProps
import kotlin.Boolean
import kotlin.String

/**
 * Properties for defining a `CfnBaiduChannel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * CfnBaiduChannelProps cfnBaiduChannelProps = CfnBaiduChannelProps.builder()
 * .apiKey("apiKey")
 * .applicationId("applicationId")
 * .secretKey("secretKey")
 * // the properties below are optional
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html)
 */
@CdkDslMarker
public class CfnBaiduChannelPropsDsl {
    private val cdkBuilder: CfnBaiduChannelProps.Builder = CfnBaiduChannelProps.builder()

    /**
     * @param apiKey The API key that you received from the Baidu Cloud Push service to communicate
     * with the service.
     */
    public fun apiKey(apiKey: String) {
        cdkBuilder.apiKey(apiKey)
    }

    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application that you're
     * configuring the Baidu channel for.
     */
    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param enabled Specifies whether to enable the Baidu channel for the application.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Specifies whether to enable the Baidu channel for the application.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param secretKey The secret key that you received from the Baidu Cloud Push service to
     * communicate with the service.
     */
    public fun secretKey(secretKey: String) {
        cdkBuilder.secretKey(secretKey)
    }

    public fun build(): CfnBaiduChannelProps = cdkBuilder.build()
}
