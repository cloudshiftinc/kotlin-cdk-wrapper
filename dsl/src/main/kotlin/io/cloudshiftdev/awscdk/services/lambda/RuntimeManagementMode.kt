package io.cloudshiftdev.awscdk.services.lambda

import kotlin.String

public open class RuntimeManagementMode
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.lambda.RuntimeManagementMode,
) {
    /**  */
    public open fun arn(): String? = unwrap(this).getArn()

    /**  */
    public open fun mode(): String = unwrap(this).getMode()

    /**
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-runtimemanagementconfig.html.
     */
    public open fun runtimeManagementConfig(): CfnFunction.RuntimeManagementConfigProperty =
        unwrap(this)
            .getRuntimeManagementConfig()
            .let(CfnFunction.RuntimeManagementConfigProperty::wrap)

    public companion object {
        public fun manual(arn: String): RuntimeManagementMode =
            software.amazon.awscdk.services.lambda.RuntimeManagementMode.manual(arn)
                .let(RuntimeManagementMode::wrap)

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.lambda.RuntimeManagementMode
        ): RuntimeManagementMode = RuntimeManagementMode(cdkObject)

        internal fun unwrap(
            wrapped: RuntimeManagementMode
        ): software.amazon.awscdk.services.lambda.RuntimeManagementMode = wrapped.cdkObject
    }
}
