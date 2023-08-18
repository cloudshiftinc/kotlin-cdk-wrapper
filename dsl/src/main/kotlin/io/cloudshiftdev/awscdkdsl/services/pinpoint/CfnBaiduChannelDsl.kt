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

package io.cloudshiftdev.awscdkdsl.services.pinpoint

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnBaiduChannel
import software.constructs.Construct

/**
 * A *channel* is a type of platform that you can deliver messages to.
 *
 * You can use the Baidu channel to send notifications to the Baidu Cloud Push notification service.
 * Before you can use Amazon Pinpoint to send notifications to the Baidu Cloud Push service, you
 * have to enable the Baidu channel for an Amazon Pinpoint application.
 *
 * The BaiduChannel resource represents the status and authentication settings of the Baidu channel
 * for an application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * CfnBaiduChannel cfnBaiduChannel = CfnBaiduChannel.Builder.create(this, "MyCfnBaiduChannel")
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
public class CfnBaiduChannelDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnBaiduChannel.Builder = CfnBaiduChannel.Builder.create(scope, id)

    /**
     * The API key that you received from the Baidu Cloud Push service to communicate with the
     * service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-apikey)
     *
     * @param apiKey The API key that you received from the Baidu Cloud Push service to communicate
     *   with the service.
     */
    public fun apiKey(apiKey: String) {
        cdkBuilder.apiKey(apiKey)
    }

    /**
     * The unique identifier for the Amazon Pinpoint application that you're configuring the Baidu
     * channel for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-applicationid)
     *
     * @param applicationId The unique identifier for the Amazon Pinpoint application that you're
     *   configuring the Baidu channel for.
     */
    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    /**
     * Specifies whether to enable the Baidu channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-enabled)
     *
     * @param enabled Specifies whether to enable the Baidu channel for the application.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * Specifies whether to enable the Baidu channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-enabled)
     *
     * @param enabled Specifies whether to enable the Baidu channel for the application.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * The secret key that you received from the Baidu Cloud Push service to communicate with the
     * service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-secretkey)
     *
     * @param secretKey The secret key that you received from the Baidu Cloud Push service to
     *   communicate with the service.
     */
    public fun secretKey(secretKey: String) {
        cdkBuilder.secretKey(secretKey)
    }

    public fun build(): CfnBaiduChannel = cdkBuilder.build()
}
