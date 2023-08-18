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

package io.cloudshiftdev.awscdkdsl.services.greengrass

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinition
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionProps

/**
 * Properties for defining a `CfnLoggerDefinition`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * Object tags;
 * CfnLoggerDefinitionProps cfnLoggerDefinitionProps = CfnLoggerDefinitionProps.builder()
 * .name("name")
 * // the properties below are optional
 * .initialVersion(LoggerDefinitionVersionProperty.builder()
 * .loggers(List.of(LoggerProperty.builder()
 * .component("component")
 * .id("id")
 * .level("level")
 * .type("type")
 * // the properties below are optional
 * .space(123)
 * .build()))
 * .build())
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html)
 */
@CdkDslMarker
public class CfnLoggerDefinitionPropsDsl {
    private val cdkBuilder: CfnLoggerDefinitionProps.Builder = CfnLoggerDefinitionProps.builder()

    /**
     * @param initialVersion The logger definition version to include when the logger definition is
     *   created. A logger definition version contains a list of
     *   [`logger`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html)
     *   property types.
     *
     * To associate a logger definition version after the logger definition is created, create an
     * [`AWS::Greengrass::LoggerDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
     * resource and specify the ID of this logger definition.
     */
    public fun initialVersion(initialVersion: IResolvable) {
        cdkBuilder.initialVersion(initialVersion)
    }

    /**
     * @param initialVersion The logger definition version to include when the logger definition is
     *   created. A logger definition version contains a list of
     *   [`logger`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html)
     *   property types.
     *
     * To associate a logger definition version after the logger definition is created, create an
     * [`AWS::Greengrass::LoggerDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
     * resource and specify the ID of this logger definition.
     */
    public fun initialVersion(initialVersion: CfnLoggerDefinition.LoggerDefinitionVersionProperty) {
        cdkBuilder.initialVersion(initialVersion)
    }

    /** @param name The name of the logger definition. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags Application-specific metadata to attach to the logger definition. You can use
     *   tags in IAM policies to control access to AWS IoT Greengrass resources. You can also use
     *   tags to categorize your resources. For more information, see
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
     * @param tags Application-specific metadata to attach to the logger definition. You can use
     *   tags in IAM policies to control access to AWS IoT Greengrass resources. You can also use
     *   tags to categorize your resources. For more information, see
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

    public fun build(): CfnLoggerDefinitionProps = cdkBuilder.build()
}
