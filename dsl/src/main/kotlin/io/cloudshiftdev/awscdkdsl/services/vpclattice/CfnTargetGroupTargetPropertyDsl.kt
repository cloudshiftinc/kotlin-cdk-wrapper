@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.vpclattice

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.vpclattice.CfnTargetGroup

/**
 * Describes a target.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * TargetProperty targetProperty = TargetProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .port(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-target.html)
 */
@CdkDslMarker
public class CfnTargetGroupTargetPropertyDsl {
    private val cdkBuilder: CfnTargetGroup.TargetProperty.Builder =
        CfnTargetGroup.TargetProperty.builder()

    /**
     * @param id The ID of the target. If the target group type is `INSTANCE` , this is an instance
     *   ID. If the target group type is `IP` , this is an IP address. If the target group type is
     *   `LAMBDA` , this is the ARN of a Lambda function. If the target group type is `ALB` , this
     *   is the ARN of an Application Load Balancer.
     */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /**
     * @param port The port on which the target is listening. For HTTP, the default is 80. For
     *   HTTPS, the default is 443.
     */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnTargetGroup.TargetProperty = cdkBuilder.build()
}
