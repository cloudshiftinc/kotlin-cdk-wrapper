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

package io.cloudshiftdev.awscdkdsl.services.amazonmq

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amazonmq.CfnBroker

/**
 * The list of information about logs to be enabled for the specified broker.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amazonmq.*;
 * LogListProperty logListProperty = LogListProperty.builder()
 * .audit(false)
 * .general(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html)
 */
@CdkDslMarker
public class CfnBrokerLogListPropertyDsl {
    private val cdkBuilder: CfnBroker.LogListProperty.Builder = CfnBroker.LogListProperty.builder()

    /**
     * @param audit Enables audit logging. Every user management action made using JMX or the
     *   ActiveMQ Web Console is logged. Does not apply to RabbitMQ brokers.
     */
    public fun audit(audit: Boolean) {
        cdkBuilder.audit(audit)
    }

    /**
     * @param audit Enables audit logging. Every user management action made using JMX or the
     *   ActiveMQ Web Console is logged. Does not apply to RabbitMQ brokers.
     */
    public fun audit(audit: IResolvable) {
        cdkBuilder.audit(audit)
    }

    /** @param general Enables general logging. */
    public fun general(general: Boolean) {
        cdkBuilder.general(general)
    }

    /** @param general Enables general logging. */
    public fun general(general: IResolvable) {
        cdkBuilder.general(general)
    }

    public fun build(): CfnBroker.LogListProperty = cdkBuilder.build()
}
