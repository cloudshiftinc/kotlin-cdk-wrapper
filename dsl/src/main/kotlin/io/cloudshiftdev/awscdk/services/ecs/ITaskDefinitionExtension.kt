package io.cloudshiftdev.awscdk.services.ecs

public interface ITaskDefinitionExtension {
    /**
     * Apply the extension to the given TaskDefinition.
     *
     * @param taskDefinition [disable-awslint:ref-via-interface].
     */
    public fun extend(taskDefinition: TaskDefinition)

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ecs.ITaskDefinitionExtension,
    ) : ITaskDefinitionExtension {
        /**
         * Apply the extension to the given TaskDefinition.
         *
         * @param taskDefinition [disable-awslint:ref-via-interface].
         */
        override fun extend(taskDefinition: TaskDefinition) {
            unwrap(this).extend(taskDefinition.let(TaskDefinition::unwrap))
        }
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.ITaskDefinitionExtension
        ): ITaskDefinitionExtension = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ITaskDefinitionExtension
        ): software.amazon.awscdk.services.ecs.ITaskDefinitionExtension =
            (wrapped as Wrapper).cdkObject
    }
}
