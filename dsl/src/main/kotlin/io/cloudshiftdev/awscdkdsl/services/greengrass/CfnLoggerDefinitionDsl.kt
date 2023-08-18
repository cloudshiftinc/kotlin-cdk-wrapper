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
import software.constructs.Construct

/**
 * The `AWS::Greengrass::LoggerDefinition` resource represents a logger definition for AWS IoT
 * Greengrass .
 *
 * Logger definitions are used to organize your logger definition versions.
 *
 * Logger definitions can reference multiple logger definition versions. All logger definition
 * versions must be associated with a logger definition. Each logger definition version can contain
 * one or more loggers.
 *
 * When you create a logger definition, you can optionally include an initial logger definition
 * version. To associate a logger definition version later, create an
 * [`AWS::Greengrass::LoggerDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
 * resource and specify the ID of this logger definition.
 *
 * After you create the logger definition version that contains the loggers you want to deploy, you
 * must add it to your group version. For more information, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * Object tags;
 * CfnLoggerDefinition cfnLoggerDefinition = CfnLoggerDefinition.Builder.create(this,
 * "MyCfnLoggerDefinition")
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
public class CfnLoggerDefinitionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLoggerDefinition.Builder =
        CfnLoggerDefinition.Builder.create(scope, id)

    /**
     * The logger definition version to include when the logger definition is created.
     *
     * A logger definition version contains a list of
     * [`logger`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html)
     * property types.
     *
     * To associate a logger definition version after the logger definition is created, create an
     * [`AWS::Greengrass::LoggerDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
     * resource and specify the ID of this logger definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html#cfn-greengrass-loggerdefinition-initialversion)
     *
     * @param initialVersion The logger definition version to include when the logger definition is
     *   created.
     */
    public fun initialVersion(initialVersion: IResolvable) {
        cdkBuilder.initialVersion(initialVersion)
    }

    /**
     * The logger definition version to include when the logger definition is created.
     *
     * A logger definition version contains a list of
     * [`logger`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html)
     * property types.
     *
     * To associate a logger definition version after the logger definition is created, create an
     * [`AWS::Greengrass::LoggerDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
     * resource and specify the ID of this logger definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html#cfn-greengrass-loggerdefinition-initialversion)
     *
     * @param initialVersion The logger definition version to include when the logger definition is
     *   created.
     */
    public fun initialVersion(initialVersion: CfnLoggerDefinition.LoggerDefinitionVersionProperty) {
        cdkBuilder.initialVersion(initialVersion)
    }

    /**
     * The name of the logger definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html#cfn-greengrass-loggerdefinition-name)
     *
     * @param name The name of the logger definition.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Application-specific metadata to attach to the logger definition.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see
     * [Tagging Your AWS IoT Greengrass Resources](https://docs.aws.amazon.com/greengrass/latest/developerguide/tagging.html)
     * in the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html#cfn-greengrass-loggerdefinition-tags)
     *
     * @param tags Application-specific metadata to attach to the logger definition.
     */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /**
     * Application-specific metadata to attach to the logger definition.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see
     * [Tagging Your AWS IoT Greengrass Resources](https://docs.aws.amazon.com/greengrass/latest/developerguide/tagging.html)
     * in the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html#cfn-greengrass-loggerdefinition-tags)
     *
     * @param tags Application-specific metadata to attach to the logger definition.
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnLoggerDefinition = cdkBuilder.build()
}
