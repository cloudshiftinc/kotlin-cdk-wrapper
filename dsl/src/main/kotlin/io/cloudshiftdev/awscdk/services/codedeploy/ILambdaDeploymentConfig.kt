package io.cloudshiftdev.awscdk.services.codedeploy

import kotlin.String

public interface ILambdaDeploymentConfig : IBaseDeploymentConfig {
    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.codedeploy.ILambdaDeploymentConfig,
    ) : ILambdaDeploymentConfig {
        /** The ARN of the Deployment Configuration. */
        override fun deploymentConfigArn(): String = unwrap(this).getDeploymentConfigArn()

        /** The physical, human-readable name of the Deployment Configuration. */
        override fun deploymentConfigName(): String = unwrap(this).getDeploymentConfigName()
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.codedeploy.ILambdaDeploymentConfig
        ): ILambdaDeploymentConfig = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ILambdaDeploymentConfig
        ): software.amazon.awscdk.services.codedeploy.ILambdaDeploymentConfig =
            (wrapped as Wrapper).cdkObject
    }
}
