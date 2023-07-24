@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.emrcontainers

import software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster
import software.amazon.awscdk.services.emrcontainers.CfnVirtualClusterProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object emrcontainers {
    /**
     * The `AWS::EMRContainers::VirtualCluster` resource specifies a virtual cluster.
     *
     * A virtual cluster is a managed entity on Amazon EMR on EKS. You can create, describe, list, and
     * delete virtual clusters. They do not consume any additional resources in your system. A single
     * virtual cluster maps to a single Kubernetes namespace. Given this relationship, you can model
     * virtual clusters the same way you model Kubernetes namespaces to meet your requirements.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emrcontainers.*;
     * CfnVirtualCluster cfnVirtualCluster = CfnVirtualCluster.Builder.create(this,
     * "MyCfnVirtualCluster")
     * .containerProvider(ContainerProviderProperty.builder()
     * .id("id")
     * .info(ContainerInfoProperty.builder()
     * .eksInfo(EksInfoProperty.builder()
     * .namespace("namespace")
     * .build())
     * .build())
     * .type("type")
     * .build())
     * .name("name")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrcontainers-virtualcluster.html)
     */
    public inline fun cfnVirtualCluster(
        scope: Construct,
        id: String,
        block: CfnVirtualClusterDsl.() -> Unit = {}
    ): CfnVirtualCluster {
        val builder = CfnVirtualClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The information about the container used for a job run or a managed endpoint.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emrcontainers.*;
     * ContainerInfoProperty containerInfoProperty = ContainerInfoProperty.builder()
     * .eksInfo(EksInfoProperty.builder()
     * .namespace("namespace")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrcontainers-virtualcluster-containerinfo.html)
     */
    public inline fun cfnVirtualClusterContainerInfoProperty(
        block: CfnVirtualClusterContainerInfoPropertyDsl.() -> Unit =
            {}
    ): CfnVirtualCluster.ContainerInfoProperty {
        val builder = CfnVirtualClusterContainerInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The information about the container provider.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emrcontainers.*;
     * ContainerProviderProperty containerProviderProperty = ContainerProviderProperty.builder()
     * .id("id")
     * .info(ContainerInfoProperty.builder()
     * .eksInfo(EksInfoProperty.builder()
     * .namespace("namespace")
     * .build())
     * .build())
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrcontainers-virtualcluster-containerprovider.html)
     */
    public inline fun cfnVirtualClusterContainerProviderProperty(
        block: CfnVirtualClusterContainerProviderPropertyDsl.() -> Unit =
            {}
    ): CfnVirtualCluster.ContainerProviderProperty {
        val builder = CfnVirtualClusterContainerProviderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The information about the Amazon EKS cluster.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emrcontainers.*;
     * EksInfoProperty eksInfoProperty = EksInfoProperty.builder()
     * .namespace("namespace")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrcontainers-virtualcluster-eksinfo.html)
     */
    public inline fun cfnVirtualClusterEksInfoProperty(
        block: CfnVirtualClusterEksInfoPropertyDsl.() -> Unit =
            {}
    ): CfnVirtualCluster.EksInfoProperty {
        val builder = CfnVirtualClusterEksInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVirtualCluster`.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emrcontainers.*;
     * CfnVirtualClusterProps cfnVirtualClusterProps = CfnVirtualClusterProps.builder()
     * .containerProvider(ContainerProviderProperty.builder()
     * .id("id")
     * .info(ContainerInfoProperty.builder()
     * .eksInfo(EksInfoProperty.builder()
     * .namespace("namespace")
     * .build())
     * .build())
     * .type("type")
     * .build())
     * .name("name")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrcontainers-virtualcluster.html)
     */
    public inline fun cfnVirtualClusterProps(block: CfnVirtualClusterPropsDsl.() -> Unit = {}): CfnVirtualClusterProps {
        val builder = CfnVirtualClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
