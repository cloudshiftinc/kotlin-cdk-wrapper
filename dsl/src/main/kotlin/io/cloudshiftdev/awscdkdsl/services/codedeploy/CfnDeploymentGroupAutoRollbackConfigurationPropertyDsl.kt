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

package io.cloudshiftdev.awscdkdsl.services.codedeploy

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

/**
 * The `AutoRollbackConfiguration` property type configures automatic rollback for an AWS CodeDeploy
 * deployment group when a deployment is not completed successfully.
 *
 * For more information, see
 * [Automatic Rollbacks](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployments-rollback-and-redeploy.html#deployments-rollback-and-redeploy-automatic-rollbacks)
 * in the *AWS CodeDeploy User Guide* .
 *
 * `AutoRollbackConfiguration` is a property of the
 * [DeploymentGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html)
 * resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * AutoRollbackConfigurationProperty autoRollbackConfigurationProperty =
 * AutoRollbackConfigurationProperty.builder()
 * .enabled(false)
 * .events(List.of("events"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html)
 */
@CdkDslMarker
public class CfnDeploymentGroupAutoRollbackConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeploymentGroup.AutoRollbackConfigurationProperty.Builder =
        CfnDeploymentGroup.AutoRollbackConfigurationProperty.builder()

    private val _events: MutableList<String> = mutableListOf()

    /**
     * @param enabled Indicates whether a defined automatic rollback configuration is currently
     *   enabled.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Indicates whether a defined automatic rollback configuration is currently
     *   enabled.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param events The event type or types that trigger a rollback. Valid values are
     *   `DEPLOYMENT_FAILURE` , `DEPLOYMENT_STOP_ON_ALARM` , or `DEPLOYMENT_STOP_ON_REQUEST` .
     */
    public fun events(vararg events: String) {
        _events.addAll(listOf(*events))
    }

    /**
     * @param events The event type or types that trigger a rollback. Valid values are
     *   `DEPLOYMENT_FAILURE` , `DEPLOYMENT_STOP_ON_ALARM` , or `DEPLOYMENT_STOP_ON_REQUEST` .
     */
    public fun events(events: Collection<String>) {
        _events.addAll(events)
    }

    public fun build(): CfnDeploymentGroup.AutoRollbackConfigurationProperty {
        if (_events.isNotEmpty()) cdkBuilder.events(_events)
        return cdkBuilder.build()
    }
}
