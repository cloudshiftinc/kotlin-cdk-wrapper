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

package io.cloudshiftdev.awscdkdsl.services.batch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * The properties for the pod.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * Object labels;
 * Object limits;
 * Object requests;
 * PodPropertiesProperty podPropertiesProperty = PodPropertiesProperty.builder()
 * .containers(List.of(EksContainerProperty.builder()
 * .image("image")
 * // the properties below are optional
 * .args(List.of("args"))
 * .command(List.of("command"))
 * .env(List.of(EksContainerEnvironmentVariableProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .value("value")
 * .build()))
 * .imagePullPolicy("imagePullPolicy")
 * .name("name")
 * .resources(ResourcesProperty.builder()
 * .limits(limits)
 * .requests(requests)
 * .build())
 * .securityContext(SecurityContextProperty.builder()
 * .privileged(false)
 * .readOnlyRootFilesystem(false)
 * .runAsGroup(123)
 * .runAsNonRoot(false)
 * .runAsUser(123)
 * .build())
 * .volumeMounts(List.of(EksContainerVolumeMountProperty.builder()
 * .mountPath("mountPath")
 * .name("name")
 * .readOnly(false)
 * .build()))
 * .build()))
 * .dnsPolicy("dnsPolicy")
 * .hostNetwork(false)
 * .metadata(MetadataProperty.builder()
 * .labels(labels)
 * .build())
 * .serviceAccountName("serviceAccountName")
 * .volumes(List.of(EksVolumeProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .emptyDir(EmptyDirProperty.builder()
 * .medium("medium")
 * .sizeLimit("sizeLimit")
 * .build())
 * .hostPath(HostPathProperty.builder()
 * .path("path")
 * .build())
 * .secret(EksSecretProperty.builder()
 * .secretName("secretName")
 * // the properties below are optional
 * .optional(false)
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-podproperties.html)
 */
@CdkDslMarker
public class CfnJobDefinitionPodPropertiesPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.PodPropertiesProperty.Builder =
        CfnJobDefinition.PodPropertiesProperty.builder()

    private val _containers: MutableList<Any> = mutableListOf()

    private val _volumes: MutableList<Any> = mutableListOf()

    /** @param containers The properties of the container that's used on the Amazon EKS pod. */
    public fun containers(vararg containers: Any) {
        _containers.addAll(listOf(*containers))
    }

    /** @param containers The properties of the container that's used on the Amazon EKS pod. */
    public fun containers(containers: Collection<Any>) {
        _containers.addAll(containers)
    }

    /** @param containers The properties of the container that's used on the Amazon EKS pod. */
    public fun containers(containers: IResolvable) {
        cdkBuilder.containers(containers)
    }

    /**
     * @param dnsPolicy The DNS policy for the pod. The default value is `ClusterFirst` . If the
     *   `hostNetwork` parameter is not specified, the default is `ClusterFirstWithHostNet` .
     *   `ClusterFirst` indicates that any DNS query that does not match the configured cluster
     *   domain suffix is forwarded to the upstream nameserver inherited from the node. For more
     *   information, see
     *   [Pod's DNS policy](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy)
     *   in the *Kubernetes documentation* .
     *
     * Valid values: `Default` | `ClusterFirst` | `ClusterFirstWithHostNet`
     */
    public fun dnsPolicy(dnsPolicy: String) {
        cdkBuilder.dnsPolicy(dnsPolicy)
    }

    /**
     * @param hostNetwork Indicates if the pod uses the hosts' network IP address. The default value
     *   is `true` . Setting this to `false` enables the Kubernetes pod networking model. Most AWS
     *   Batch workloads are egress-only and don't require the overhead of IP allocation for each
     *   pod for incoming connections. For more information, see
     *   [Host namespaces](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/security/pod-security-policy/#host-namespaces)
     *   and
     *   [Pod networking](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/workloads/pods/#pod-networking)
     *   in the *Kubernetes documentation* .
     */
    public fun hostNetwork(hostNetwork: Boolean) {
        cdkBuilder.hostNetwork(hostNetwork)
    }

    /**
     * @param hostNetwork Indicates if the pod uses the hosts' network IP address. The default value
     *   is `true` . Setting this to `false` enables the Kubernetes pod networking model. Most AWS
     *   Batch workloads are egress-only and don't require the overhead of IP allocation for each
     *   pod for incoming connections. For more information, see
     *   [Host namespaces](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/security/pod-security-policy/#host-namespaces)
     *   and
     *   [Pod networking](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/workloads/pods/#pod-networking)
     *   in the *Kubernetes documentation* .
     */
    public fun hostNetwork(hostNetwork: IResolvable) {
        cdkBuilder.hostNetwork(hostNetwork)
    }

    /**
     * @param metadata Metadata about the Kubernetes pod. For more information, see
     *   [Understanding Kubernetes Objects](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/kubernetes-objects/)
     *   in the *Kubernetes documentation* .
     */
    public fun metadata(metadata: IResolvable) {
        cdkBuilder.metadata(metadata)
    }

    /**
     * @param metadata Metadata about the Kubernetes pod. For more information, see
     *   [Understanding Kubernetes Objects](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/kubernetes-objects/)
     *   in the *Kubernetes documentation* .
     */
    public fun metadata(metadata: CfnJobDefinition.MetadataProperty) {
        cdkBuilder.metadata(metadata)
    }

    /**
     * @param serviceAccountName The name of the service account that's used to run the pod. For
     *   more information, see
     *   [Kubernetes service accounts](https://docs.aws.amazon.com/eks/latest/userguide/service-accounts.html)
     *   and
     *   [Configure a Kubernetes service account to assume an IAM role](https://docs.aws.amazon.com/eks/latest/userguide/associate-service-account-role.html)
     *   in the *Amazon EKS User Guide* and
     *   [Configure service accounts for pods](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/)
     *   in the *Kubernetes documentation* .
     */
    public fun serviceAccountName(serviceAccountName: String) {
        cdkBuilder.serviceAccountName(serviceAccountName)
    }

    /** @param volumes Specifies the volumes for a job definition that uses Amazon EKS resources. */
    public fun volumes(vararg volumes: Any) {
        _volumes.addAll(listOf(*volumes))
    }

    /** @param volumes Specifies the volumes for a job definition that uses Amazon EKS resources. */
    public fun volumes(volumes: Collection<Any>) {
        _volumes.addAll(volumes)
    }

    /** @param volumes Specifies the volumes for a job definition that uses Amazon EKS resources. */
    public fun volumes(volumes: IResolvable) {
        cdkBuilder.volumes(volumes)
    }

    public fun build(): CfnJobDefinition.PodPropertiesProperty {
        if (_containers.isNotEmpty()) cdkBuilder.containers(_containers)
        if (_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
        return cdkBuilder.build()
    }
}
