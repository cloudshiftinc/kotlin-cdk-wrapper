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

package io.cloudshiftdev.awscdkdsl.services.codepipeline

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codepipeline.CommonAwsActionProps
import software.amazon.awscdk.services.iam.IRole

/**
 * Common properties shared by all Actions whose `ActionProperties.owner` field is 'AWS' (or unset,
 * as 'AWS' is the default).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * import software.amazon.awscdk.services.iam.*;
 * Role role;
 * CommonAwsActionProps commonAwsActionProps = CommonAwsActionProps.builder()
 * .actionName("actionName")
 * // the properties below are optional
 * .role(role)
 * .runOrder(123)
 * .variablesNamespace("variablesNamespace")
 * .build();
 * ```
 */
@CdkDslMarker
public class CommonAwsActionPropsDsl {
    private val cdkBuilder: CommonAwsActionProps.Builder = CommonAwsActionProps.builder()

    /**
     * @param actionName The physical, human-readable name of the Action. Note that Action names
     *   must be unique within a single Stage.
     */
    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    /**
     * @param role The Role in which context's this Action will be executing in. The Pipeline's Role
     *   will assume this Role (the required permissions for that will be granted automatically)
     *   right before executing this Action. This Action will be passed into your `IAction.bind`
     *   method in the `ActionBindOptions.role` property.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * @param runOrder The runOrder property for this Action. RunOrder determines the relative order
     *   in which multiple Actions in the same Stage execute.
     */
    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     *   action.
     */
    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): CommonAwsActionProps = cdkBuilder.build()
}
