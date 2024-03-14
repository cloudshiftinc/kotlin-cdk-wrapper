package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.constructs.Construct

public abstract class ProxyConfiguration
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ecs.ProxyConfiguration,
) {
    /**
     * Called when the proxy configuration is configured on a task definition.
     *
     * @param _scope
     * @param _taskDefinition
     */
    public open fun bind(
        _scope: Construct,
        _taskDefinition: TaskDefinition
    ): CfnTaskDefinition.ProxyConfigurationProperty =
        unwrap(this)
            .bind(_scope.let(Construct::unwrap), _taskDefinition.let(TaskDefinition::unwrap))
            .let(CfnTaskDefinition.ProxyConfigurationProperty::wrap)

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ecs.ProxyConfiguration,
    ) : ProxyConfiguration(cdkObject)

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.ProxyConfiguration
        ): ProxyConfiguration = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ProxyConfiguration
        ): software.amazon.awscdk.services.ecs.ProxyConfiguration = (wrapped as Wrapper).cdkObject
    }
}
