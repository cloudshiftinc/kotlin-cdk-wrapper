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

package io.cloudshiftdev.awscdkdsl.services.eks

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnAddonProps

/**
 * Properties for defining a `CfnAddon`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * CfnAddonProps cfnAddonProps = CfnAddonProps.builder()
 * .addonName("addonName")
 * .clusterName("clusterName")
 * // the properties below are optional
 * .addonVersion("addonVersion")
 * .configurationValues("configurationValues")
 * .preserveOnDelete(false)
 * .resolveConflicts("resolveConflicts")
 * .serviceAccountRoleArn("serviceAccountRoleArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html)
 */
@CdkDslMarker
public class CfnAddonPropsDsl {
    private val cdkBuilder: CfnAddonProps.Builder = CfnAddonProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param addonName The name of the add-on. */
    public fun addonName(addonName: String) {
        cdkBuilder.addonName(addonName)
    }

    /** @param addonVersion The version of the add-on. */
    public fun addonVersion(addonVersion: String) {
        cdkBuilder.addonVersion(addonVersion)
    }

    /** @param clusterName The name of the cluster. */
    public fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
    }

    /** @param configurationValues The configuration values that you provided. */
    public fun configurationValues(configurationValues: String) {
        cdkBuilder.configurationValues(configurationValues)
    }

    /**
     * @param preserveOnDelete Specifying this option preserves the add-on software on your cluster
     *   but Amazon EKS stops managing any settings for the add-on. If an IAM account is associated
     *   with the add-on, it isn't removed.
     */
    public fun preserveOnDelete(preserveOnDelete: Boolean) {
        cdkBuilder.preserveOnDelete(preserveOnDelete)
    }

    /**
     * @param preserveOnDelete Specifying this option preserves the add-on software on your cluster
     *   but Amazon EKS stops managing any settings for the add-on. If an IAM account is associated
     *   with the add-on, it isn't removed.
     */
    public fun preserveOnDelete(preserveOnDelete: IResolvable) {
        cdkBuilder.preserveOnDelete(preserveOnDelete)
    }

    /**
     * @param resolveConflicts How to resolve field value conflicts for an Amazon EKS add-on.
     *   Conflicts are handled based on the value you choose:
     * * *None* – If the self-managed version of the add-on is installed on your cluster, Amazon EKS
     *   doesn't change the value. Creation of the add-on might fail.
     * * *Overwrite* – If the self-managed version of the add-on is installed on your cluster and
     *   the Amazon EKS default value is different than the existing value, Amazon EKS changes the
     *   value to the Amazon EKS default value.
     * * *Preserve* – This is similar to the NONE option. If the self-managed version of the add-on
     *   is installed on your cluster Amazon EKS doesn't change the add-on resource properties.
     *   Creation of the add-on might fail if conflicts are detected. This option works differently
     *   during the update operation. For more information, see
     *   [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) .
     *
     * If you don't currently have the self-managed version of the add-on installed on your cluster,
     * the Amazon EKS add-on is installed. Amazon EKS sets all values to default values, regardless
     * of the option that you specify.
     */
    public fun resolveConflicts(resolveConflicts: String) {
        cdkBuilder.resolveConflicts(resolveConflicts)
    }

    /**
     * @param serviceAccountRoleArn The Amazon Resource Name (ARN) of an existing IAM role to bind
     *   to the add-on's service account. The role must be assigned the IAM permissions required by
     *   the add-on. If you don't specify an existing IAM role, then the add-on uses the permissions
     *   assigned to the node IAM role. For more information, see
     *   [Amazon EKS node IAM role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html)
     *   in the *Amazon EKS User Guide* .
     *
     * To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC) provider created
     * for your cluster. For more information, see
     * [Enabling IAM roles for service accounts on your cluster](https://docs.aws.amazon.com/eks/latest/userguide/enable-iam-roles-for-service-accounts.html)
     * in the *Amazon EKS User Guide* .
     */
    public fun serviceAccountRoleArn(serviceAccountRoleArn: String) {
        cdkBuilder.serviceAccountRoleArn(serviceAccountRoleArn)
    }

    /**
     * @param tags The metadata that you apply to the add-on to assist with categorization and
     *   organization. Each tag consists of a key and an optional value, both of which you define.
     *   Add-on tags do not propagate to any other resources associated with the cluster.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The metadata that you apply to the add-on to assist with categorization and
     *   organization. Each tag consists of a key and an optional value, both of which you define.
     *   Add-on tags do not propagate to any other resources associated with the cluster.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAddonProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
