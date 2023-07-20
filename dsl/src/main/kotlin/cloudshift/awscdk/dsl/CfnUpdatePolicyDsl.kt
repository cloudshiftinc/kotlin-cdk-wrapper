@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnAutoScalingReplacingUpdate
import software.amazon.awscdk.CfnAutoScalingRollingUpdate
import software.amazon.awscdk.CfnAutoScalingScheduledAction
import software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate
import software.amazon.awscdk.CfnUpdatePolicy
import kotlin.Boolean
import kotlin.Unit

@CdkDslMarker
public class CfnUpdatePolicyDsl {
    private val cdkBuilder: CfnUpdatePolicy.Builder = CfnUpdatePolicy.builder()

    public fun autoScalingReplacingUpdate(block: CfnAutoScalingReplacingUpdateDsl.() -> Unit = {}) {
        val builder = CfnAutoScalingReplacingUpdateDsl()
        builder.apply(block)
        cdkBuilder.autoScalingReplacingUpdate(builder.build())
    }

    public fun autoScalingReplacingUpdate(autoScalingReplacingUpdate: CfnAutoScalingReplacingUpdate) {
        cdkBuilder.autoScalingReplacingUpdate(autoScalingReplacingUpdate)
    }

    public fun autoScalingRollingUpdate(block: CfnAutoScalingRollingUpdateDsl.() -> Unit = {}) {
        val builder = CfnAutoScalingRollingUpdateDsl()
        builder.apply(block)
        cdkBuilder.autoScalingRollingUpdate(builder.build())
    }

    public fun autoScalingRollingUpdate(autoScalingRollingUpdate: CfnAutoScalingRollingUpdate) {
        cdkBuilder.autoScalingRollingUpdate(autoScalingRollingUpdate)
    }

    public fun autoScalingScheduledAction(block: CfnAutoScalingScheduledActionDsl.() -> Unit = {}) {
        val builder = CfnAutoScalingScheduledActionDsl()
        builder.apply(block)
        cdkBuilder.autoScalingScheduledAction(builder.build())
    }

    public fun autoScalingScheduledAction(autoScalingScheduledAction: CfnAutoScalingScheduledAction) {
        cdkBuilder.autoScalingScheduledAction(autoScalingScheduledAction)
    }

    public fun codeDeployLambdaAliasUpdate(block: CfnCodeDeployLambdaAliasUpdateDsl.() -> Unit = {}) {
        val builder = CfnCodeDeployLambdaAliasUpdateDsl()
        builder.apply(block)
        cdkBuilder.codeDeployLambdaAliasUpdate(builder.build())
    }

    public fun codeDeployLambdaAliasUpdate(codeDeployLambdaAliasUpdate: CfnCodeDeployLambdaAliasUpdate) {
        cdkBuilder.codeDeployLambdaAliasUpdate(codeDeployLambdaAliasUpdate)
    }

    public fun enableVersionUpgrade(enableVersionUpgrade: Boolean) {
        cdkBuilder.enableVersionUpgrade(enableVersionUpgrade)
    }

    public fun useOnlineResharding(useOnlineResharding: Boolean) {
        cdkBuilder.useOnlineResharding(useOnlineResharding)
    }

    public fun build(): CfnUpdatePolicy = cdkBuilder.build()
}
