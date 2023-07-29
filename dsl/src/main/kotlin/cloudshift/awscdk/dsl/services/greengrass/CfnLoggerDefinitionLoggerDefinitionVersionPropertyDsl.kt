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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinition

/**
 * A logger definition version contains a list of
 * [loggers](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html)
 * .
 *
 * After you create a logger definition version that contains the loggers you want to deploy, you
 * must add it to your group version. For more information, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 * In an AWS CloudFormation template, `LoggerDefinitionVersion` is the property type of the
 * `InitialVersion` property in the
 * [`AWS::Greengrass::LoggerDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html)
 * resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * LoggerDefinitionVersionProperty loggerDefinitionVersionProperty =
 * LoggerDefinitionVersionProperty.builder()
 * .loggers(List.of(LoggerProperty.builder()
 * .component("component")
 * .id("id")
 * .level("level")
 * .type("type")
 * // the properties below are optional
 * .space(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-loggerdefinitionversion.html)
 */
@CdkDslMarker
public class CfnLoggerDefinitionLoggerDefinitionVersionPropertyDsl {
    private val cdkBuilder: CfnLoggerDefinition.LoggerDefinitionVersionProperty.Builder =
        CfnLoggerDefinition.LoggerDefinitionVersionProperty.builder()

    private val _loggers: MutableList<Any> = mutableListOf()

    /** @param loggers The loggers in this version. */
    public fun loggers(vararg loggers: Any) {
        _loggers.addAll(listOf(*loggers))
    }

    /** @param loggers The loggers in this version. */
    public fun loggers(loggers: Collection<Any>) {
        _loggers.addAll(loggers)
    }

    /** @param loggers The loggers in this version. */
    public fun loggers(loggers: IResolvable) {
        cdkBuilder.loggers(loggers)
    }

    public fun build(): CfnLoggerDefinition.LoggerDefinitionVersionProperty {
        if (_loggers.isNotEmpty()) cdkBuilder.loggers(_loggers)
        return cdkBuilder.build()
    }
}
