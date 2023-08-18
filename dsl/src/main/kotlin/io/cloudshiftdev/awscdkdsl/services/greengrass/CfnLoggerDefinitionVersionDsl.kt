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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion
import software.constructs.Construct

/**
 * The `AWS::Greengrass::LoggerDefinitionVersion` resource represents a logger definition version
 * for AWS IoT Greengrass .
 *
 * A logger definition version contains a list of loggers.
 *
 * To create a logger definition version, you must specify the ID of the logger definition that you
 * want to associate with the version. For information about creating a logger definition, see
 * [`AWS::Greengrass::LoggerDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html)
 * .
 *
 * After you create a logger definition version that contains the loggers you want to deploy, you
 * must add it to your group version. For more information, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * CfnLoggerDefinitionVersion cfnLoggerDefinitionVersion =
 * CfnLoggerDefinitionVersion.Builder.create(this, "MyCfnLoggerDefinitionVersion")
 * .loggerDefinitionId("loggerDefinitionId")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
 */
@CdkDslMarker
public class CfnLoggerDefinitionVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLoggerDefinitionVersion.Builder =
        CfnLoggerDefinitionVersion.Builder.create(scope, id)

    private val _loggers: MutableList<Any> = mutableListOf()

    /**
     * The ID of the logger definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggerdefinitionid)
     *
     * @param loggerDefinitionId The ID of the logger definition associated with this version.
     */
    public fun loggerDefinitionId(loggerDefinitionId: String) {
        cdkBuilder.loggerDefinitionId(loggerDefinitionId)
    }

    /**
     * The loggers in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggers)
     *
     * @param loggers The loggers in this version.
     */
    public fun loggers(vararg loggers: Any) {
        _loggers.addAll(listOf(*loggers))
    }

    /**
     * The loggers in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggers)
     *
     * @param loggers The loggers in this version.
     */
    public fun loggers(loggers: Collection<Any>) {
        _loggers.addAll(loggers)
    }

    /**
     * The loggers in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggers)
     *
     * @param loggers The loggers in this version.
     */
    public fun loggers(loggers: IResolvable) {
        cdkBuilder.loggers(loggers)
    }

    public fun build(): CfnLoggerDefinitionVersion {
        if (_loggers.isNotEmpty()) cdkBuilder.loggers(_loggers)
        return cdkBuilder.build()
    }
}
