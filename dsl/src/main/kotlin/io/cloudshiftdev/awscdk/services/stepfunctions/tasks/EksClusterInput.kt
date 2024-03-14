package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.services.eks.ICluster
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import kotlin.String

public open class EksClusterInput
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EksClusterInput,
) {
    /** The name of the EKS Cluster. */
    public open fun clusterName(): String = unwrap(this).getClusterName()

    public companion object {
        public fun fromCluster(cluster: ICluster): EksClusterInput =
            software.amazon.awscdk.services.stepfunctions.tasks.EksClusterInput.fromCluster(
                    cluster.let(ICluster::unwrap)
                )
                .let(EksClusterInput::wrap)

        public fun fromTaskInput(taskInput: TaskInput): EksClusterInput =
            software.amazon.awscdk.services.stepfunctions.tasks.EksClusterInput.fromTaskInput(
                    taskInput.let(TaskInput::unwrap)
                )
                .let(EksClusterInput::wrap)

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EksClusterInput
        ): EksClusterInput = EksClusterInput(cdkObject)

        internal fun unwrap(
            wrapped: EksClusterInput
        ): software.amazon.awscdk.services.stepfunctions.tasks.EksClusterInput = wrapped.cdkObject
    }
}
