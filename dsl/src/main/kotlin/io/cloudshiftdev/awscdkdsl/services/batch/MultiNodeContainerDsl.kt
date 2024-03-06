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
import kotlin.Number
import software.amazon.awscdk.services.batch.IEcsContainerDefinition
import software.amazon.awscdk.services.batch.MultiNodeContainer

/**
 * Runs the container on nodes [startNode, endNode].
 *
 * Example:
 * ```
 * MultiNodeJobDefinition multiNodeJob = MultiNodeJobDefinition.Builder.create(this,
 * "JobDefinition")
 * .instanceType(InstanceType.of(InstanceClass.R4, InstanceSize.LARGE)) // optional, omit to let
 * Batch choose the type for you
 * .containers(List.of(MultiNodeContainer.builder()
 * .container(EcsEc2ContainerDefinition.Builder.create(this, "mainMPIContainer")
 * .image(ContainerImage.fromRegistry("yourregsitry.com/yourMPIImage:latest"))
 * .cpu(256)
 * .memory(Size.mebibytes(2048))
 * .build())
 * .startNode(0)
 * .endNode(5)
 * .build()))
 * .build();
 * // convenience method
 * multiNodeJob.addContainer(MultiNodeContainer.builder()
 * .startNode(6)
 * .endNode(10)
 * .container(EcsEc2ContainerDefinition.Builder.create(this, "multiContainer")
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .cpu(256)
 * .memory(Size.mebibytes(2048))
 * .build())
 * .build());
 * ```
 */
@CdkDslMarker
public class MultiNodeContainerDsl {
    private val cdkBuilder: MultiNodeContainer.Builder = MultiNodeContainer.builder()

    /** @param container The container that this node range will run. */
    public fun container(container: IEcsContainerDefinition) {
        cdkBuilder.container(container)
    }

    /**
     * @param endNode The index of the last node to run this container. The container is run on all
     *   nodes in the range [startNode, endNode] (inclusive)
     */
    public fun endNode(endNode: Number) {
        cdkBuilder.endNode(endNode)
    }

    /**
     * @param startNode The index of the first node to run this container. The container is run on
     *   all nodes in the range [startNode, endNode] (inclusive)
     */
    public fun startNode(startNode: Number) {
        cdkBuilder.startNode(startNode)
    }

    public fun build(): MultiNodeContainer = cdkBuilder.build()
}
