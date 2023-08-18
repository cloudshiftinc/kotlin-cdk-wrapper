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

package io.cloudshiftdev.awscdkdsl.services.iam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.iam.ServicePrincipal

/**
 * An IAM principal that represents an AWS service (i.e. `sqs.amazonaws.com`).
 *
 * Example:
 * ```
 * Role lambdaRole = Role.Builder.create(this, "Role")
 * .assumedBy(new ServicePrincipal("lambda.amazonaws.com"))
 * .description("Example role...")
 * .build();
 * Stream stream = Stream.Builder.create(this, "MyEncryptedStream")
 * .encryption(StreamEncryption.KMS)
 * .build();
 * // give lambda permissions to read stream
 * stream.grantRead(lambdaRole);
 * ```
 */
@CdkDslMarker
public class ServicePrincipalDsl(
    service: String,
) {
    private val cdkBuilder: ServicePrincipal.Builder = ServicePrincipal.Builder.create(service)

    /**
     * Additional conditions to add to the Service Principal.
     *
     * Default: - No conditions
     *
     * @param conditions Additional conditions to add to the Service Principal.
     */
    public fun conditions(conditions: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(conditions)
        cdkBuilder.conditions(builder.map)
    }

    /**
     * Additional conditions to add to the Service Principal.
     *
     * Default: - No conditions
     *
     * @param conditions Additional conditions to add to the Service Principal.
     */
    public fun conditions(conditions: Map<String, Any>) {
        cdkBuilder.conditions(conditions)
    }

    /**
     * The region in which you want to reference the service.
     *
     * This is only necessary for *cross-region* references to *opt-in* regions. In those cases, the
     * region name needs to be included to reference the correct service principal. In all other
     * cases, the global service principal name is sufficient.
     *
     * This field behaves differently depending on whether the
     * `&#64;aws-cdk/aws-iam:standardizedServicePrincipals` flag is set or not:
     * * If the flag is set, the input service principal is assumed to be of the form
     *   `SERVICE.amazonaws.com`. That value will always be returned, unless the given region is an
     *   opt-in region and the service principal is rendered in a stack in a different region, in
     *   which case `SERVICE.REGION.amazonaws.com` will be rendered. Under this regime, there is no
     *   downside to always specifying the region property: it will be rendered only if necessary.
     * * If the flag is not set, the service principal will resolve to a single principal whose name
     *   comes from the `&#64;aws-cdk/region-info` package, using the region to override the stack
     *   region. If there is no entry for this service principal in the database,, the input service
     *   name is returned literally. This is legacy behavior and is not recommended.
     *
     * Default: - the resolving Stack's region.
     *
     * @param region The region in which you want to reference the service.
     */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): ServicePrincipal = cdkBuilder.build()
}
