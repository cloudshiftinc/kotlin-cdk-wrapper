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

package cloudshift.awscdk.dsl.services.devicefarm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.devicefarm.CfnProject
import software.amazon.awscdk.services.devicefarm.CfnProjectProps

/**
 * Properties for defining a `CfnProject`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.devicefarm.*;
 * CfnProjectProps cfnProjectProps = CfnProjectProps.builder()
 * .name("name")
 * // the properties below are optional
 * .defaultJobTimeoutMinutes(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcConfig(VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .vpcId("vpcId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html)
 */
@CdkDslMarker
public class CfnProjectPropsDsl {
    private val cdkBuilder: CfnProjectProps.Builder = CfnProjectProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param defaultJobTimeoutMinutes Sets the execution timeout value (in minutes) for a project.
     *   All test runs in this project use the specified execution timeout value unless overridden
     *   when scheduling a run.
     */
    public fun defaultJobTimeoutMinutes(defaultJobTimeoutMinutes: Number) {
        cdkBuilder.defaultJobTimeoutMinutes(defaultJobTimeoutMinutes)
    }

    /** @param name The project's name. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags The tags to add to the resource. A tag is an array of key-value pairs. Tag keys
     *   can have a maximum character length of 128 characters. Tag values can have a maximum length
     *   of 256 characters.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The tags to add to the resource. A tag is an array of key-value pairs. Tag keys
     *   can have a maximum character length of 128 characters. Tag values can have a maximum length
     *   of 256 characters.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param vpcConfig The VPC security groups and subnets that are attached to a project. */
    public fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    /** @param vpcConfig The VPC security groups and subnets that are attached to a project. */
    public fun vpcConfig(vpcConfig: CfnProject.VpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    public fun build(): CfnProjectProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
