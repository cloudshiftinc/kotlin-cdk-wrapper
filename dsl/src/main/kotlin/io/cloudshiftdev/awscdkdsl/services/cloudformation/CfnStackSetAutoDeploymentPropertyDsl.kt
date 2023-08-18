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

package io.cloudshiftdev.awscdkdsl.services.cloudformation

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudformation.CfnStackSet

/**
 * [ `Service-managed` permissions] Describes whether StackSets automatically deploys to AWS
 * Organizations accounts that are added to a target organizational unit (OU).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudformation.*;
 * AutoDeploymentProperty autoDeploymentProperty = AutoDeploymentProperty.builder()
 * .enabled(false)
 * .retainStacksOnAccountRemoval(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-autodeployment.html)
 */
@CdkDslMarker
public class CfnStackSetAutoDeploymentPropertyDsl {
    private val cdkBuilder: CfnStackSet.AutoDeploymentProperty.Builder =
        CfnStackSet.AutoDeploymentProperty.builder()

    /**
     * @param enabled If set to `true` , StackSets automatically deploys additional stack instances
     *   to AWS Organizations accounts that are added to a target organization or organizational
     *   unit (OU) in the specified Regions. If an account is removed from a target organization or
     *   OU, StackSets deletes stack instances from the account in the specified Regions.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled If set to `true` , StackSets automatically deploys additional stack instances
     *   to AWS Organizations accounts that are added to a target organization or organizational
     *   unit (OU) in the specified Regions. If an account is removed from a target organization or
     *   OU, StackSets deletes stack instances from the account in the specified Regions.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param retainStacksOnAccountRemoval If set to `true` , stack resources are retained when an
     *   account is removed from a target organization or OU. If set to `false` , stack resources
     *   are deleted. Specify only if `Enabled` is set to `True` .
     */
    public fun retainStacksOnAccountRemoval(retainStacksOnAccountRemoval: Boolean) {
        cdkBuilder.retainStacksOnAccountRemoval(retainStacksOnAccountRemoval)
    }

    /**
     * @param retainStacksOnAccountRemoval If set to `true` , stack resources are retained when an
     *   account is removed from a target organization or OU. If set to `false` , stack resources
     *   are deleted. Specify only if `Enabled` is set to `True` .
     */
    public fun retainStacksOnAccountRemoval(retainStacksOnAccountRemoval: IResolvable) {
        cdkBuilder.retainStacksOnAccountRemoval(retainStacksOnAccountRemoval)
    }

    public fun build(): CfnStackSet.AutoDeploymentProperty = cdkBuilder.build()
}
