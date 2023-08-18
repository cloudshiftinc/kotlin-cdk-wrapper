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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amazonmq.CfnBroker

/**
 * The list of broker users (persons or applications) who can access queues and topics.
 *
 * For Amazon MQ for RabbitMQ brokers, one and only one administrative user is accepted and created
 * when a broker is first provisioned. All subsequent broker users are created via the RabbitMQ web
 * console or by using the RabbitMQ management API.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amazonmq.*;
 * UserProperty userProperty = UserProperty.builder()
 * .password("password")
 * .username("username")
 * // the properties below are optional
 * .consoleAccess(false)
 * .groups(List.of("groups"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html)
 */
@CdkDslMarker
public class CfnBrokerUserPropertyDsl {
    private val cdkBuilder: CfnBroker.UserProperty.Builder = CfnBroker.UserProperty.builder()

    private val _groups: MutableList<String> = mutableListOf()

    /**
     * @param consoleAccess Enables access to the ActiveMQ web console for the ActiveMQ user. Does
     *   not apply to RabbitMQ brokers.
     */
    public fun consoleAccess(consoleAccess: Boolean) {
        cdkBuilder.consoleAccess(consoleAccess)
    }

    /**
     * @param consoleAccess Enables access to the ActiveMQ web console for the ActiveMQ user. Does
     *   not apply to RabbitMQ brokers.
     */
    public fun consoleAccess(consoleAccess: IResolvable) {
        cdkBuilder.consoleAccess(consoleAccess)
    }

    /**
     * @param groups The list of groups (20 maximum) to which the ActiveMQ user belongs. This value
     *   can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _
     *   ~). This value must be 2-100 characters long. Does not apply to RabbitMQ brokers.
     */
    public fun groups(vararg groups: String) {
        _groups.addAll(listOf(*groups))
    }

    /**
     * @param groups The list of groups (20 maximum) to which the ActiveMQ user belongs. This value
     *   can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _
     *   ~). This value must be 2-100 characters long. Does not apply to RabbitMQ brokers.
     */
    public fun groups(groups: Collection<String>) {
        _groups.addAll(groups)
    }

    /**
     * @param password The password of the user. This value must be at least 12 characters long,
     *   must contain at least 4 unique characters, and must not contain commas, colons, or equal
     *   signs (,:=).
     */
    public fun password(password: String) {
        cdkBuilder.password(password)
    }

    /**
     * @param username The username of the broker user. For Amazon MQ for ActiveMQ brokers, this
     *   value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (-
     *   . _ ~). For Amazon MQ for RabbitMQ brokers, this value can contain only alphanumeric
     *   characters, dashes, periods, underscores (- . _). This value must not contain a tilde (~)
     *   character. Amazon MQ prohibts using guest as a valid usename. This value must be 2-100
     *   characters long.
     *
     * Do not add personally identifiable information (PII) or other confidential or sensitive
     * information in broker usernames. Broker usernames are accessible to other AWS services,
     * including CloudWatch Logs . Broker usernames are not intended to be used for private or
     * sensitive data.
     */
    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnBroker.UserProperty {
        if (_groups.isNotEmpty()) cdkBuilder.groups(_groups)
        return cdkBuilder.build()
    }
}
