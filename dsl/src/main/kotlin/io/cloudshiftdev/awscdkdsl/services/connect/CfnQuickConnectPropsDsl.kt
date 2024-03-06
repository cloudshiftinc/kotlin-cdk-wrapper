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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnQuickConnect
import software.amazon.awscdk.services.connect.CfnQuickConnectProps

/**
 * Properties for defining a `CfnQuickConnect`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CfnQuickConnectProps cfnQuickConnectProps = CfnQuickConnectProps.builder()
 * .instanceArn("instanceArn")
 * .name("name")
 * .quickConnectConfig(QuickConnectConfigProperty.builder()
 * .quickConnectType("quickConnectType")
 * // the properties below are optional
 * .phoneConfig(PhoneNumberQuickConnectConfigProperty.builder()
 * .phoneNumber("phoneNumber")
 * .build())
 * .queueConfig(QueueQuickConnectConfigProperty.builder()
 * .contactFlowArn("contactFlowArn")
 * .queueArn("queueArn")
 * .build())
 * .userConfig(UserQuickConnectConfigProperty.builder()
 * .contactFlowArn("contactFlowArn")
 * .userArn("userArn")
 * .build())
 * .build())
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html)
 */
@CdkDslMarker
public class CfnQuickConnectPropsDsl {
    private val cdkBuilder: CfnQuickConnectProps.Builder = CfnQuickConnectProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description The description of the quick connect. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param instanceArn The Amazon Resource Name (ARN) of the instance. */
    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    /** @param name The name of the quick connect. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param quickConnectConfig Contains information about the quick connect. */
    public fun quickConnectConfig(quickConnectConfig: IResolvable) {
        cdkBuilder.quickConnectConfig(quickConnectConfig)
    }

    /** @param quickConnectConfig Contains information about the quick connect. */
    public fun quickConnectConfig(quickConnectConfig: CfnQuickConnect.QuickConnectConfigProperty) {
        cdkBuilder.quickConnectConfig(quickConnectConfig)
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource. For
     *   example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource. For
     *   example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnQuickConnectProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
