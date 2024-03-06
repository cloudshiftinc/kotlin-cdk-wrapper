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
import software.amazon.awscdk.services.pinpoint.CfnGCMChannelProps

/**
 * Properties for defining a `CfnGCMChannel`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * CfnGCMChannelProps cfnGCMChannelProps = CfnGCMChannelProps.builder()
 * .applicationId("applicationId")
 * // the properties below are optional
 * .apiKey("apiKey")
 * .defaultAuthenticationMethod("defaultAuthenticationMethod")
 * .enabled(false)
 * .serviceJson("serviceJson")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html)
 */
@CdkDslMarker
public class CfnGCMChannelPropsDsl {
    private val cdkBuilder: CfnGCMChannelProps.Builder = CfnGCMChannelProps.builder()

    /**
     * @param apiKey The Web API key, also called the *server key* , that you received from Google
     *   to communicate with Google services.
     */
    public fun apiKey(apiKey: String) {
        cdkBuilder.apiKey(apiKey)
    }

    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the GCM
     *   channel applies to.
     */
    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param defaultAuthenticationMethod The default authentication method used for GCM. Values are
     *   either "TOKEN" or "KEY". Defaults to "KEY".
     */
    public fun defaultAuthenticationMethod(defaultAuthenticationMethod: String) {
        cdkBuilder.defaultAuthenticationMethod(defaultAuthenticationMethod)
    }

    /**
     * @param enabled Specifies whether to enable the GCM channel for the Amazon Pinpoint
     *   application.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Specifies whether to enable the GCM channel for the Amazon Pinpoint
     *   application.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param serviceJson The contents of the JSON file provided by Google during registration in
     *   order to generate an access token for authentication. For more information see
     *   [Migrate from legacy FCM APIs to HTTP v1](https://docs.aws.amazon.com/https://firebase.google.com/docs/cloud-messaging/migrate-v1)
     *   .
     */
    public fun serviceJson(serviceJson: String) {
        cdkBuilder.serviceJson(serviceJson)
    }

    public fun build(): CfnGCMChannelProps = cdkBuilder.build()
}
