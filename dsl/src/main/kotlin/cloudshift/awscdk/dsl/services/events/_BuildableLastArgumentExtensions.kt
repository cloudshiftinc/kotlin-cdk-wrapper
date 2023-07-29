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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.Archive
import software.amazon.awscdk.services.events.CfnConnection
import software.amazon.awscdk.services.events.CfnEndpoint
import software.amazon.awscdk.services.events.CfnEventBusPolicy
import software.amazon.awscdk.services.events.EventBus
import software.amazon.awscdk.services.events.IEventBus
import software.amazon.awscdk.services.events.Rule
import software.amazon.awscdk.services.iam.AddToResourcePolicyResult

/** The routing configuration of the endpoint. */
public inline fun CfnEndpoint.setRoutingConfig(
    block: CfnEndpointRoutingConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEndpointRoutingConfigPropertyDsl()
    builder.apply(block)
    return setRoutingConfig(builder.build())
}

/** Whether event replication was enabled or disabled for this endpoint. */
public inline fun CfnEndpoint.setReplicationConfig(
    block: CfnEndpointReplicationConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEndpointReplicationConfigPropertyDsl()
    builder.apply(block)
    return setReplicationConfig(builder.build())
}

/**
 * Adds an event pattern filter to this rule.
 *
 * If a pattern was already specified, these values are merged into the existing pattern.
 *
 * For example, if the rule already contains the pattern:
 *
 * { "resources": [ "r1" ], "detail": { "hello": [ 1 ] } }
 *
 * And `addEventPattern` is called with the pattern:
 *
 * { "resources": [ "r2" ], "detail": { "foo": [ "bar" ] } }
 *
 * The resulting event pattern will be:
 *
 * { "resources": [ "r1", "r2" ], "detail": { "hello": [ 1 ], "foo": [ "bar" ] } }
 *
 * @param eventPattern
 */
public inline fun Rule.addEventPattern(block: EventPatternDsl.() -> Unit = {}) {
    val builder = EventPatternDsl()
    builder.apply(block)
    return addEventPattern(builder.build())
}

/**
 * Create an EventBridge archive to send events to.
 *
 * When you create an archive, incoming events might not immediately start being sent to the
 * archive. Allow a short period of time for changes to take effect.
 *
 * @param id
 * @param props Properties of the archive.
 */
public inline fun IEventBus.archive(
    arg0: String,
    block: BaseArchivePropsDsl.() -> Unit = {}
): Archive {
    val builder = BaseArchivePropsDsl()
    builder.apply(block)
    return archive(arg0, builder.build())
}

/**
 * Adds a statement to the IAM resource policy associated with this event bus.
 *
 * @param statement
 */
public inline fun EventBus.addToResourcePolicy(
    block: PolicyStatementDsl.() -> Unit = {}
): AddToResourcePolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToResourcePolicy(builder.build())
}

/**
 * Create an EventBridge archive to send events to.
 *
 * When you create an archive, incoming events might not immediately start being sent to the
 * archive. Allow a short period of time for changes to take effect.
 *
 * @param id
 * @param props
 */
public inline fun EventBus.archive(
    id: String,
    block: BaseArchivePropsDsl.() -> Unit = {}
): Archive {
    val builder = BaseArchivePropsDsl()
    builder.apply(block)
    return archive(id, builder.build())
}

/**
 * This parameter enables you to limit the permission to accounts that fulfill a certain condition,
 * such as being a member of a certain AWS organization.
 */
public inline fun CfnEventBusPolicy.setCondition(
    block: CfnEventBusPolicyConditionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEventBusPolicyConditionPropertyDsl()
    builder.apply(block)
    return setCondition(builder.build())
}

/**
 * A `CreateConnectionAuthRequestParameters` object that contains the authorization parameters to
 * use to authorize with the endpoint.
 */
public inline fun CfnConnection.setAuthParameters(
    block: CfnConnectionAuthParametersPropertyDsl.() -> Unit = {}
) {
    val builder = CfnConnectionAuthParametersPropertyDsl()
    builder.apply(block)
    return setAuthParameters(builder.build())
}
