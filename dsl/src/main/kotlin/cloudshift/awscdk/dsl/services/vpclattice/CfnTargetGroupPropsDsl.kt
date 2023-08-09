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

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnTargetGroup
import software.amazon.awscdk.services.vpclattice.CfnTargetGroupProps

/**
 * Properties for defining a `CfnTargetGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * CfnTargetGroupProps cfnTargetGroupProps = CfnTargetGroupProps.builder()
 * .type("type")
 * // the properties below are optional
 * .config(TargetGroupConfigProperty.builder()
 * .port(123)
 * .protocol("protocol")
 * .vpcIdentifier("vpcIdentifier")
 * // the properties below are optional
 * .healthCheck(HealthCheckConfigProperty.builder()
 * .enabled(false)
 * .healthCheckIntervalSeconds(123)
 * .healthCheckTimeoutSeconds(123)
 * .healthyThresholdCount(123)
 * .matcher(MatcherProperty.builder()
 * .httpCode("httpCode")
 * .build())
 * .path("path")
 * .port(123)
 * .protocol("protocol")
 * .protocolVersion("protocolVersion")
 * .unhealthyThresholdCount(123)
 * .build())
 * .ipAddressType("ipAddressType")
 * .protocolVersion("protocolVersion")
 * .build())
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .targets(List.of(TargetProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .port(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html)
 */
@CdkDslMarker
public class CfnTargetGroupPropsDsl {
    private val cdkBuilder: CfnTargetGroupProps.Builder = CfnTargetGroupProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _targets: MutableList<Any> = mutableListOf()

    /**
     * @param config The target group configuration. If the target group type is `LAMBDA` , this
     *   parameter doesn't apply.
     */
    public fun config(config: IResolvable) {
        cdkBuilder.config(config)
    }

    /**
     * @param config The target group configuration. If the target group type is `LAMBDA` , this
     *   parameter doesn't apply.
     */
    public fun config(config: CfnTargetGroup.TargetGroupConfigProperty) {
        cdkBuilder.config(config)
    }

    /**
     * @param name The name of the target group. The name must be unique within the account. The
     *   valid characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last
     *   character, or immediately after another hyphen.
     *
     * If you don't specify a name, CloudFormation generates one. However, if you specify a name,
     * and later want to replace the resource, you must specify a new name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param tags The tags for the target group. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags for the target group. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param targets Describes a target. */
    public fun targets(vararg targets: Any) {
        _targets.addAll(listOf(*targets))
    }

    /** @param targets Describes a target. */
    public fun targets(targets: Collection<Any>) {
        _targets.addAll(targets)
    }

    /** @param targets Describes a target. */
    public fun targets(targets: IResolvable) {
        cdkBuilder.targets(targets)
    }

    /** @param type The type of target group. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnTargetGroupProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_targets.isNotEmpty()) cdkBuilder.targets(_targets)
        return cdkBuilder.build()
    }
}
