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
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.eks.CfnPodIdentityAssociationProps

/**
 * Properties for defining a `CfnPodIdentityAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * CfnPodIdentityAssociationProps cfnPodIdentityAssociationProps =
 * CfnPodIdentityAssociationProps.builder()
 * .clusterName("clusterName")
 * .namespace("namespace")
 * .roleArn("roleArn")
 * .serviceAccount("serviceAccount")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html)
 */
@CdkDslMarker
public class CfnPodIdentityAssociationPropsDsl {
    private val cdkBuilder: CfnPodIdentityAssociationProps.Builder =
        CfnPodIdentityAssociationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param clusterName The name of the cluster that the association is in. */
    public fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param namespace The name of the Kubernetes namespace inside the cluster to create the
     *   association in. The service account and the pods that use the service account must be in
     *   this namespace.
     */
    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role to associate with the service
     *   account. The EKS Pod Identity agent manages credentials to assume this role for
     *   applications in the containers in the pods that use this service account.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param serviceAccount The name of the Kubernetes service account inside the cluster to
     *   associate the IAM credentials with.
     */
    public fun serviceAccount(serviceAccount: String) {
        cdkBuilder.serviceAccount(serviceAccount)
    }

    /**
     * @param tags Metadata that assists with categorization and organization. Each tag consists of
     *   a key and an optional value. You define both. Tags don't propagate to any other cluster or
     *   AWS resources.
     *
     * The following basic restrictions apply to tags:
     * * Maximum number of tags per resource – 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length – 128 Unicode characters in UTF-8
     * * Maximum value length – 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     *   services may have restrictions on allowed characters. Generally allowed characters are:
     *   letters, numbers, and spaces representable in UTF-8, and the following characters: + - = .
     *   _ : /
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Metadata that assists with categorization and organization. Each tag consists of
     *   a key and an optional value. You define both. Tags don't propagate to any other cluster or
     *   AWS resources.
     *
     * The following basic restrictions apply to tags:
     * * Maximum number of tags per resource – 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length – 128 Unicode characters in UTF-8
     * * Maximum value length – 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     *   services may have restrictions on allowed characters. Generally allowed characters are:
     *   letters, numbers, and spaces representable in UTF-8, and the following characters: + - = .
     *   _ : /
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPodIdentityAssociationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
