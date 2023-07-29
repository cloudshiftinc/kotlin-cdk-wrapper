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

package cloudshift.awscdk.dsl.services.oam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.oam.CfnSink
import software.constructs.Construct

/**
 * Creates or updates a *sink* in the current account, so that it can be used as a monitoring
 * account in CloudWatch cross-account observability.
 *
 * A sink is a resource that represents an attachment point in a monitoring account, which source
 * accounts can link to to be able to send observability data.
 *
 * After you create a sink, you must create a sink policy that allows source accounts to attach to
 * it. For more information, see
 * [PutSinkPolicy](https://docs.aws.amazon.com/OAM/latest/APIReference/API_PutSinkPolicy.html) .
 *
 * An account can have one sink.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.oam.*;
 * Object policy;
 * CfnSink cfnSink = CfnSink.Builder.create(this, "MyCfnSink")
 * .name("name")
 * // the properties below are optional
 * .policy(policy)
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-sink.html)
 */
@CdkDslMarker
public class CfnSinkDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSink.Builder = CfnSink.Builder.create(scope, id)

    /**
     * A name for the sink.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-sink.html#cfn-oam-sink-name)
     *
     * @param name A name for the sink.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The IAM policy that grants permissions to source accounts to link to this sink.
     *
     * The policy can grant permission in the following ways:
     * * Include organization IDs or organization paths to permit all accounts in an organization
     * * Include account IDs to permit the specified accounts
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-sink.html#cfn-oam-sink-policy)
     *
     * @param policy The IAM policy that grants permissions to source accounts to link to this sink.
     */
    public fun policy(policy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policy)
        cdkBuilder.policy(builder.map)
    }

    /**
     * The IAM policy that grants permissions to source accounts to link to this sink.
     *
     * The policy can grant permission in the following ways:
     * * Include organization IDs or organization paths to permit all accounts in an organization
     * * Include account IDs to permit the specified accounts
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-sink.html#cfn-oam-sink-policy)
     *
     * @param policy The IAM policy that grants permissions to source accounts to link to this sink.
     */
    public fun policy(policy: Any) {
        cdkBuilder.policy(policy)
    }

    /**
     * An array of key-value pairs to apply to the sink.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-sink.html#cfn-oam-sink-tags)
     *
     * @param tags An array of key-value pairs to apply to the sink.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnSink = cdkBuilder.build()
}
