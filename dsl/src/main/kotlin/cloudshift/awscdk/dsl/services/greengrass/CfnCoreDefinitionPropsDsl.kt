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

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnCoreDefinition
import software.amazon.awscdk.services.greengrass.CfnCoreDefinitionProps

/**
 * Properties for defining a `CfnCoreDefinition`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * Object tags;
 * CfnCoreDefinitionProps cfnCoreDefinitionProps = CfnCoreDefinitionProps.builder()
 * .name("name")
 * // the properties below are optional
 * .initialVersion(CoreDefinitionVersionProperty.builder()
 * .cores(List.of(CoreProperty.builder()
 * .certificateArn("certificateArn")
 * .id("id")
 * .thingArn("thingArn")
 * // the properties below are optional
 * .syncShadow(false)
 * .build()))
 * .build())
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinition.html)
 */
@CdkDslMarker
public class CfnCoreDefinitionPropsDsl {
    private val cdkBuilder: CfnCoreDefinitionProps.Builder = CfnCoreDefinitionProps.builder()

    /**
     * @param initialVersion The core definition version to include when the core definition is
     *   created. Currently, a core definition version can contain only one
     *   [`core`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html)
     *   .
     *
     * To associate a core definition version after the core definition is created, create an
     * [`AWS::Greengrass::CoreDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html)
     * resource and specify the ID of this core definition.
     */
    public fun initialVersion(initialVersion: IResolvable) {
        cdkBuilder.initialVersion(initialVersion)
    }

    /**
     * @param initialVersion The core definition version to include when the core definition is
     *   created. Currently, a core definition version can contain only one
     *   [`core`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html)
     *   .
     *
     * To associate a core definition version after the core definition is created, create an
     * [`AWS::Greengrass::CoreDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html)
     * resource and specify the ID of this core definition.
     */
    public fun initialVersion(initialVersion: CfnCoreDefinition.CoreDefinitionVersionProperty) {
        cdkBuilder.initialVersion(initialVersion)
    }

    /** @param name The name of the core definition. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags Application-specific metadata to attach to the core definition. You can use tags
     *   in IAM policies to control access to AWS IoT Greengrass resources. You can also use tags to
     *   categorize your resources. For more information, see
     *   [Tagging Your AWS IoT Greengrass Resources](https://docs.aws.amazon.com/greengrass/latest/developerguide/tagging.html)
     *   in the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /**
     * @param tags Application-specific metadata to attach to the core definition. You can use tags
     *   in IAM policies to control access to AWS IoT Greengrass resources. You can also use tags to
     *   categorize your resources. For more information, see
     *   [Tagging Your AWS IoT Greengrass Resources](https://docs.aws.amazon.com/greengrass/latest/developerguide/tagging.html)
     *   in the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnCoreDefinitionProps = cdkBuilder.build()
}
