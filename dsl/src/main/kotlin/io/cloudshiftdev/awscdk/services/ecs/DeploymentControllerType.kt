package io.cloudshiftdev.awscdk.services.ecs

public enum class DeploymentControllerType(
    private val cdkObject: software.amazon.awscdk.services.ecs.DeploymentControllerType,
) {
    ECS(software.amazon.awscdk.services.ecs.DeploymentControllerType.ECS),
    CODE_DEPLOY(software.amazon.awscdk.services.ecs.DeploymentControllerType.CODE_DEPLOY),
    EXTERNAL(software.amazon.awscdk.services.ecs.DeploymentControllerType.EXTERNAL),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.DeploymentControllerType
        ): DeploymentControllerType =
            when (cdkObject) {
                software.amazon.awscdk.services.ecs.DeploymentControllerType.ECS ->
                    DeploymentControllerType.ECS
                software.amazon.awscdk.services.ecs.DeploymentControllerType.CODE_DEPLOY ->
                    DeploymentControllerType.CODE_DEPLOY
                software.amazon.awscdk.services.ecs.DeploymentControllerType.EXTERNAL ->
                    DeploymentControllerType.EXTERNAL
            }

        internal fun unwrap(
            wrapped: DeploymentControllerType
        ): software.amazon.awscdk.services.ecs.DeploymentControllerType = wrapped.cdkObject
    }
}
