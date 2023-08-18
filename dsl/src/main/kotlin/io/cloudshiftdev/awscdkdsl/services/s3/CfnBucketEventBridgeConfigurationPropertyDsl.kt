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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Amazon S3 can send events to Amazon EventBridge whenever certain events happen in your bucket,
 * see [Using EventBridge](https://docs.aws.amazon.com/AmazonS3/latest/userguide/EventBridge.html)
 * in the *Amazon S3 User Guide* .
 *
 * Unlike other destinations, delivery of events to EventBridge can be either enabled or disabled
 * for a bucket. If enabled, all events will be sent to EventBridge and you can use EventBridge
 * rules to route events to additional targets. For more information, see
 * [What Is Amazon EventBridge](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-what-is.html)
 * in the *Amazon EventBridge User Guide*
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * EventBridgeConfigurationProperty eventBridgeConfigurationProperty =
 * EventBridgeConfigurationProperty.builder()
 * .eventBridgeEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-eventbridgeconfiguration.html)
 */
@CdkDslMarker
public class CfnBucketEventBridgeConfigurationPropertyDsl {
    private val cdkBuilder: CfnBucket.EventBridgeConfigurationProperty.Builder =
        CfnBucket.EventBridgeConfigurationProperty.builder()

    /** @param eventBridgeEnabled Enables delivery of events to Amazon EventBridge. */
    public fun eventBridgeEnabled(eventBridgeEnabled: Boolean) {
        cdkBuilder.eventBridgeEnabled(eventBridgeEnabled)
    }

    /** @param eventBridgeEnabled Enables delivery of events to Amazon EventBridge. */
    public fun eventBridgeEnabled(eventBridgeEnabled: IResolvable) {
        cdkBuilder.eventBridgeEnabled(eventBridgeEnabled)
    }

    public fun build(): CfnBucket.EventBridgeConfigurationProperty = cdkBuilder.build()
}
