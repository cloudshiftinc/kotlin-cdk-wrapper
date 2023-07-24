@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.oam

import software.amazon.awscdk.services.oam.CfnLink
import software.amazon.awscdk.services.oam.CfnLinkProps
import software.amazon.awscdk.services.oam.CfnSink
import software.amazon.awscdk.services.oam.CfnSinkProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object oam {
    /**
     * Creates a link between a source account and a sink that you have created in a monitoring
     * account.
     *
     * Before you create a link, you must create a sink in the monitoring account. The sink must have
     * a sink policy that permits the source account to link to it. You can grant permission to source
     * accounts by granting permission to an entire organization, an organizational unit, or to
     * individual accounts.
     *
     * For more information, see
     * [CreateSink](https://docs.aws.amazon.com/OAM/latest/APIReference/API_CreateSink.html) and
     * [PutSinkPolicy](https://docs.aws.amazon.com/OAM/latest/APIReference/API_PutSinkPolicy.html) .
     *
     * Each monitoring account can be linked to as many as 100,000 source accounts.
     *
     * Each source account can be linked to as many as five monitoring accounts.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.oam.*;
     * CfnLink cfnLink = CfnLink.Builder.create(this, "MyCfnLink")
     * .resourceTypes(List.of("resourceTypes"))
     * .sinkIdentifier("sinkIdentifier")
     * // the properties below are optional
     * .labelTemplate("labelTemplate")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html)
     */
    public inline fun cfnLink(
        scope: Construct,
        id: String,
        block: CfnLinkDsl.() -> Unit = {}
    ): CfnLink {
        val builder = CfnLinkDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLink`.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.oam.*;
     * CfnLinkProps cfnLinkProps = CfnLinkProps.builder()
     * .resourceTypes(List.of("resourceTypes"))
     * .sinkIdentifier("sinkIdentifier")
     * // the properties below are optional
     * .labelTemplate("labelTemplate")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html)
     */
    public inline fun cfnLinkProps(block: CfnLinkPropsDsl.() -> Unit = {}): CfnLinkProps {
        val builder = CfnLinkPropsDsl()
        builder.apply(block)
        return builder.build()
    }

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
     *
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
    public inline fun cfnSink(
        scope: Construct,
        id: String,
        block: CfnSinkDsl.() -> Unit = {}
    ): CfnSink {
        val builder = CfnSinkDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSink`.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.oam.*;
     * Object policy;
     * CfnSinkProps cfnSinkProps = CfnSinkProps.builder()
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
    public inline fun cfnSinkProps(block: CfnSinkPropsDsl.() -> Unit = {}): CfnSinkProps {
        val builder = CfnSinkPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
