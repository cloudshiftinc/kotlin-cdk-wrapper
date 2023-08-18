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

package io.cloudshiftdev.awscdkdsl.services.iam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.GroupProps
import software.amazon.awscdk.services.iam.IManagedPolicy

/**
 * Properties for defining an IAM group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * ManagedPolicy managedPolicy;
 * GroupProps groupProps = GroupProps.builder()
 * .groupName("groupName")
 * .managedPolicies(List.of(managedPolicy))
 * .path("path")
 * .build();
 * ```
 */
@CdkDslMarker
public class GroupPropsDsl {
    private val cdkBuilder: GroupProps.Builder = GroupProps.builder()

    private val _managedPolicies: MutableList<IManagedPolicy> = mutableListOf()

    /**
     * @param groupName A name for the IAM group. For valid values, see the GroupName parameter for
     *   the CreateGroup action in the IAM API Reference. If you don't specify a name, AWS
     *   CloudFormation generates a unique physical ID and uses that ID for the group name.
     *
     * If you specify a name, you must specify the CAPABILITY_NAMED_IAM value to acknowledge your
     * template's capabilities. For more information, see Acknowledging IAM Resources in AWS
     * CloudFormation Templates.
     */
    public fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
    }

    /**
     * @param managedPolicies A list of managed policies associated with this role. You can add
     *   managed policies later using
     *   `addManagedPolicy(ManagedPolicy.fromAwsManagedPolicyName(policyName))`.
     */
    public fun managedPolicies(vararg managedPolicies: IManagedPolicy) {
        _managedPolicies.addAll(listOf(*managedPolicies))
    }

    /**
     * @param managedPolicies A list of managed policies associated with this role. You can add
     *   managed policies later using
     *   `addManagedPolicy(ManagedPolicy.fromAwsManagedPolicyName(policyName))`.
     */
    public fun managedPolicies(managedPolicies: Collection<IManagedPolicy>) {
        _managedPolicies.addAll(managedPolicies)
    }

    /**
     * @param path The path to the group. For more information about paths, see <a
     *   href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html">IAM
     *   Identifiers</a> in the IAM User Guide.
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): GroupProps {
        if (_managedPolicies.isNotEmpty()) cdkBuilder.managedPolicies(_managedPolicies)
        return cdkBuilder.build()
    }
}
