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

package io.cloudshiftdev.awscdkdsl.services.greengrassv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

/**
 * Contains information about a component to deploy.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrassv2.*;
 * ComponentDeploymentSpecificationProperty componentDeploymentSpecificationProperty =
 * ComponentDeploymentSpecificationProperty.builder()
 * .componentVersion("componentVersion")
 * .configurationUpdate(ComponentConfigurationUpdateProperty.builder()
 * .merge("merge")
 * .reset(List.of("reset"))
 * .build())
 * .runWith(ComponentRunWithProperty.builder()
 * .posixUser("posixUser")
 * .systemResourceLimits(SystemResourceLimitsProperty.builder()
 * .cpus(123)
 * .memory(123)
 * .build())
 * .windowsUser("windowsUser")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-componentdeploymentspecification.html)
 */
@CdkDslMarker
public class CfnDeploymentComponentDeploymentSpecificationPropertyDsl {
    private val cdkBuilder: CfnDeployment.ComponentDeploymentSpecificationProperty.Builder =
        CfnDeployment.ComponentDeploymentSpecificationProperty.builder()

    /** @param componentVersion The version of the component. */
    public fun componentVersion(componentVersion: String) {
        cdkBuilder.componentVersion(componentVersion)
    }

    /**
     * @param configurationUpdate The configuration updates to deploy for the component. You can
     *   define reset updates and merge updates. A reset updates the keys that you specify to the
     *   default configuration for the component. A merge updates the core device's component
     *   configuration with the keys and values that you specify. The AWS IoT Greengrass Core
     *   software applies reset updates before it applies merge updates. For more information, see
     *   [Update component configuration](https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html)
     *   .
     */
    public fun configurationUpdate(configurationUpdate: IResolvable) {
        cdkBuilder.configurationUpdate(configurationUpdate)
    }

    /**
     * @param configurationUpdate The configuration updates to deploy for the component. You can
     *   define reset updates and merge updates. A reset updates the keys that you specify to the
     *   default configuration for the component. A merge updates the core device's component
     *   configuration with the keys and values that you specify. The AWS IoT Greengrass Core
     *   software applies reset updates before it applies merge updates. For more information, see
     *   [Update component configuration](https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html)
     *   .
     */
    public fun configurationUpdate(
        configurationUpdate: CfnDeployment.ComponentConfigurationUpdateProperty
    ) {
        cdkBuilder.configurationUpdate(configurationUpdate)
    }

    /**
     * @param runWith The system user and group that the software uses to run component processes on
     *   the core device. If you omit this parameter, the software uses the system user and group
     *   that you configure for the core device. For more information, see
     *   [Configure the user and group that run components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user)
     *   in the *AWS IoT Greengrass V2 Developer Guide* .
     */
    public fun runWith(runWith: IResolvable) {
        cdkBuilder.runWith(runWith)
    }

    /**
     * @param runWith The system user and group that the software uses to run component processes on
     *   the core device. If you omit this parameter, the software uses the system user and group
     *   that you configure for the core device. For more information, see
     *   [Configure the user and group that run components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user)
     *   in the *AWS IoT Greengrass V2 Developer Guide* .
     */
    public fun runWith(runWith: CfnDeployment.ComponentRunWithProperty) {
        cdkBuilder.runWith(runWith)
    }

    public fun build(): CfnDeployment.ComponentDeploymentSpecificationProperty = cdkBuilder.build()
}
