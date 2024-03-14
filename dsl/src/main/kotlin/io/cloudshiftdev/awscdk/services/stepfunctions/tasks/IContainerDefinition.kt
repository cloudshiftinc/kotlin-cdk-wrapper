package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public interface IContainerDefinition {
    /**
     * Called when the ContainerDefinition is used by a SageMaker task.
     *
     * @param task
     */
    public fun bind(task: ISageMakerTask): ContainerDefinitionConfig

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.stepfunctions.tasks.IContainerDefinition,
    ) : IContainerDefinition {
        /**
         * Called when the ContainerDefinition is used by a SageMaker task.
         *
         * @param task
         */
        override fun bind(task: ISageMakerTask): ContainerDefinitionConfig =
            unwrap(this).bind(task.let(ISageMakerTask::unwrap)).let(ContainerDefinitionConfig::wrap)
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.IContainerDefinition
        ): IContainerDefinition = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: IContainerDefinition
        ): software.amazon.awscdk.services.stepfunctions.tasks.IContainerDefinition =
            (wrapped as Wrapper).cdkObject
    }
}
