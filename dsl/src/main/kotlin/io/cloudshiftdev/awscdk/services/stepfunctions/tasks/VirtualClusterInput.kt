package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import kotlin.String

public open class VirtualClusterInput
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.VirtualClusterInput,
) {
    /** The VirtualCluster Id. */
    public open fun id(): String = unwrap(this).getId()

    public companion object {
        public fun fromTaskInput(taskInput: TaskInput): VirtualClusterInput =
            software.amazon.awscdk.services.stepfunctions.tasks.VirtualClusterInput.fromTaskInput(
                    taskInput.let(TaskInput::unwrap)
                )
                .let(VirtualClusterInput::wrap)

        public fun fromVirtualClusterId(virtualClusterId: String): VirtualClusterInput =
            software.amazon.awscdk.services.stepfunctions.tasks.VirtualClusterInput
                .fromVirtualClusterId(virtualClusterId)
                .let(VirtualClusterInput::wrap)

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.VirtualClusterInput
        ): VirtualClusterInput = VirtualClusterInput(cdkObject)

        internal fun unwrap(
            wrapped: VirtualClusterInput
        ): software.amazon.awscdk.services.stepfunctions.tasks.VirtualClusterInput =
            wrapped.cdkObject
    }
}
