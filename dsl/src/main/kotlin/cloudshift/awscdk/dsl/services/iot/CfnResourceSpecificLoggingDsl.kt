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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnResourceSpecificLogging
import software.constructs.Construct

/**
 * Configure resource-specific logging.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CfnResourceSpecificLogging cfnResourceSpecificLogging =
 * CfnResourceSpecificLogging.Builder.create(this, "MyCfnResourceSpecificLogging")
 * .logLevel("logLevel")
 * .targetName("targetName")
 * .targetType("targetType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-resourcespecificlogging.html)
 */
@CdkDslMarker
public class CfnResourceSpecificLoggingDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResourceSpecificLogging.Builder =
        CfnResourceSpecificLogging.Builder.create(scope, id)

    /**
     * The default log level.Valid Values: `DEBUG | INFO | ERROR | WARN | DISABLED`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-resourcespecificlogging.html#cfn-iot-resourcespecificlogging-loglevel)
     *
     * @param logLevel The default log level.Valid Values: `DEBUG | INFO | ERROR | WARN | DISABLED`.
     */
    public fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
    }

    /**
     * The target name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-resourcespecificlogging.html#cfn-iot-resourcespecificlogging-targetname)
     *
     * @param targetName The target name.
     */
    public fun targetName(targetName: String) {
        cdkBuilder.targetName(targetName)
    }

    /**
     * The target type.
     *
     * Valid Values: `DEFAULT | THING_GROUP`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-resourcespecificlogging.html#cfn-iot-resourcespecificlogging-targettype)
     *
     * @param targetType The target type.
     */
    public fun targetType(targetType: String) {
        cdkBuilder.targetType(targetType)
    }

    public fun build(): CfnResourceSpecificLogging = cdkBuilder.build()
}
