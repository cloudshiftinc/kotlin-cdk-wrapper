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

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipe

/**
 * In addition to your infrastructure configuration, these settings provide an extra layer of
 * control over your build instances.
 *
 * You can also specify commands to run on launch for all of your build instances.
 *
 * Image Builder does not automatically install the Systems Manager agent on Windows instances. If
 * your base image includes the Systems Manager agent, then the AMI that you create will also
 * include the agent. For Linux instances, if the base image does not already include the Systems
 * Manager agent, Image Builder installs it. For Linux instances where Image Builder installs the
 * Systems Manager agent, you can choose whether to keep it for the AMI that you create.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * AdditionalInstanceConfigurationProperty additionalInstanceConfigurationProperty =
 * AdditionalInstanceConfigurationProperty.builder()
 * .systemsManagerAgent(SystemsManagerAgentProperty.builder()
 * .uninstallAfterBuild(false)
 * .build())
 * .userDataOverride("userDataOverride")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-additionalinstanceconfiguration.html)
 */
@CdkDslMarker
public class CfnImageRecipeAdditionalInstanceConfigurationPropertyDsl {
    private val cdkBuilder: CfnImageRecipe.AdditionalInstanceConfigurationProperty.Builder =
        CfnImageRecipe.AdditionalInstanceConfigurationProperty.builder()

    /**
     * @param systemsManagerAgent Contains settings for the Systems Manager agent on your build
     *   instance.
     */
    public fun systemsManagerAgent(systemsManagerAgent: IResolvable) {
        cdkBuilder.systemsManagerAgent(systemsManagerAgent)
    }

    /**
     * @param systemsManagerAgent Contains settings for the Systems Manager agent on your build
     *   instance.
     */
    public fun systemsManagerAgent(
        systemsManagerAgent: CfnImageRecipe.SystemsManagerAgentProperty
    ) {
        cdkBuilder.systemsManagerAgent(systemsManagerAgent)
    }

    /**
     * @param userDataOverride Use this property to provide commands or a command script to run when
     *   you launch your build instance. The userDataOverride property replaces any commands that
     *   Image Builder might have added to ensure that Systems Manager is installed on your Linux
     *   build instance. If you override the user data, make sure that you add commands to install
     *   Systems Manager, if it is not pre-installed on your base image.
     *
     * The user data is always base 64 encoded. For example, the following commands are encoded as
     * `IyEvYmluL2Jhc2gKbWtkaXIgLXAgL3Zhci9iYi8KdG91Y2ggL3Zhci$` :
     *
     * *#!/bin/bash*
     *
     * mkdir -p /var/bb/
     *
     * touch /var
     */
    public fun userDataOverride(userDataOverride: String) {
        cdkBuilder.userDataOverride(userDataOverride)
    }

    public fun build(): CfnImageRecipe.AdditionalInstanceConfigurationProperty = cdkBuilder.build()
}
