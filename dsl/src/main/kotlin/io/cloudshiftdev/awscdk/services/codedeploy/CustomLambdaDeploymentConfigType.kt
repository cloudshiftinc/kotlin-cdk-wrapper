package io.cloudshiftdev.awscdk.services.codedeploy

public enum class CustomLambdaDeploymentConfigType(
    private val cdkObject:
        software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigType,
) {
    CANARY(software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigType.CANARY),
    LINEAR(software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigType.LINEAR),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigType
        ): CustomLambdaDeploymentConfigType =
            when (cdkObject) {
                software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigType
                    .CANARY -> CustomLambdaDeploymentConfigType.CANARY
                software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigType
                    .LINEAR -> CustomLambdaDeploymentConfigType.LINEAR
            }

        internal fun unwrap(
            wrapped: CustomLambdaDeploymentConfigType
        ): software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigType =
            wrapped.cdkObject
    }
}
