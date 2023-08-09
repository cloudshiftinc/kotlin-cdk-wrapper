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

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.logs.CrossAccountDestination
import software.constructs.Construct

/**
 * A new CloudWatch Logs Destination for use in cross-account scenarios.
 *
 * CrossAccountDestinations are used to subscribe a Kinesis stream in a different account to a
 * CloudWatch Subscription.
 *
 * Consumers will hardly ever need to use this class. Instead, directly subscribe a Kinesis stream
 * using the integration class in the `aws-cdk-lib/aws-logs-destinations` package; if necessary, a
 * `CrossAccountDestination` will be created automatically.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.logs.*;
 * Role role;
 * CrossAccountDestination crossAccountDestination = CrossAccountDestination.Builder.create(this,
 * "MyCrossAccountDestination")
 * .role(role)
 * .targetArn("targetArn")
 * // the properties below are optional
 * .destinationName("destinationName")
 * .build();
 * ```
 */
@CdkDslMarker
public class CrossAccountDestinationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CrossAccountDestination.Builder =
        CrossAccountDestination.Builder.create(scope, id)

    /**
     * The name of the log destination.
     *
     * Default: Automatically generated
     *
     * @param destinationName The name of the log destination.
     */
    public fun destinationName(destinationName: String) {
        cdkBuilder.destinationName(destinationName)
    }

    /**
     * The role to assume that grants permissions to write to 'target'.
     *
     * The role must be assumable by 'logs.{REGION}.amazonaws.com'.
     *
     * @param role The role to assume that grants permissions to write to 'target'.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * The log destination target's ARN.
     *
     * @param targetArn The log destination target's ARN.
     */
    public fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
    }

    public fun build(): CrossAccountDestination = cdkBuilder.build()
}
