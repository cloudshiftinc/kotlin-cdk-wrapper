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

package cloudshift.awscdk.dsl.services.mediastore

import software.amazon.awscdk.services.mediastore.CfnContainer
import software.amazon.awscdk.services.mediastore.CfnContainerProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object mediastore {
    public inline fun cfnContainer(
        scope: Construct,
        id: String,
        block: CfnContainerDsl.() -> Unit = {},
    ): CfnContainer {
        val builder = CfnContainerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnContainerCorsRuleProperty(
        block: CfnContainerCorsRulePropertyDsl.() -> Unit =
            {},
    ): CfnContainer.CorsRuleProperty {
        val builder = CfnContainerCorsRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnContainerMetricPolicyProperty(
        block: CfnContainerMetricPolicyPropertyDsl.() -> Unit =
            {},
    ): CfnContainer.MetricPolicyProperty {
        val builder = CfnContainerMetricPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnContainerMetricPolicyRuleProperty(
        block: CfnContainerMetricPolicyRulePropertyDsl.() -> Unit =
            {},
    ): CfnContainer.MetricPolicyRuleProperty {
        val builder = CfnContainerMetricPolicyRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnContainerProps(block: CfnContainerPropsDsl.() -> Unit = {}): CfnContainerProps {
        val builder = CfnContainerPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
