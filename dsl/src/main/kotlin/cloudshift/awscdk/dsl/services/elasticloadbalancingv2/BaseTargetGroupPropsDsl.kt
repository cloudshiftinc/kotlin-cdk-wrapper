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

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.elasticloadbalancingv2.BaseTargetGroupProps
import software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck
import software.amazon.awscdk.services.elasticloadbalancingv2.TargetType
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class BaseTargetGroupPropsDsl {
    private val cdkBuilder: BaseTargetGroupProps.Builder = BaseTargetGroupProps.builder()

    public fun deregistrationDelay(deregistrationDelay: Duration) {
        cdkBuilder.deregistrationDelay(deregistrationDelay)
    }

    public fun healthCheck(block: HealthCheckDsl.() -> Unit = {}) {
        val builder = HealthCheckDsl()
        builder.apply(block)
        cdkBuilder.healthCheck(builder.build())
    }

    public fun healthCheck(healthCheck: HealthCheck) {
        cdkBuilder.healthCheck(healthCheck)
    }

    public fun targetGroupName(targetGroupName: String) {
        cdkBuilder.targetGroupName(targetGroupName)
    }

    public fun targetType(targetType: TargetType) {
        cdkBuilder.targetType(targetType)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): BaseTargetGroupProps = cdkBuilder.build()
}
