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

package io.cloudshiftdev.awscdkdsl.services.cloudtrail

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.CfnResourcePolicy
import software.constructs.Construct

/**
 * Attaches a resource-based permission policy to a CloudTrail channel that is used for an
 * integration with an event source outside of AWS .
 *
 * For more information about resource-based policies, see
 * [CloudTrail resource-based policy examples](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/security_iam_resource-based-policy-examples.html)
 * in the *CloudTrail User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudtrail.*;
 * Object resourcePolicy;
 * CfnResourcePolicy cfnResourcePolicy = CfnResourcePolicy.Builder.create(this,
 * "MyCfnResourcePolicy")
 * .resourceArn("resourceArn")
 * .resourcePolicy(resourcePolicy)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html)
 */
@CdkDslMarker
public class CfnResourcePolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResourcePolicy.Builder = CfnResourcePolicy.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the CloudTrail channel attached to the resource-based
     * policy.
     *
     * The following is the format of a resource ARN:
     * `arn:aws:cloudtrail:us-east-2:123456789012:channel/MyChannel` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html#cfn-cloudtrail-resourcepolicy-resourcearn)
     *
     * @param resourceArn The Amazon Resource Name (ARN) of the CloudTrail channel attached to the
     *   resource-based policy.
     */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * A JSON-formatted string for an AWS resource-based policy.
     *
     * The following are requirements for the resource policy:
     * * Contains only one action: cloudtrail-data:PutAuditEvents
     * * Contains at least one statement. The policy can have a maximum of 20 statements.
     * * Each statement contains at least one principal. A statement can have a maximum of 50
     *   principals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html#cfn-cloudtrail-resourcepolicy-resourcepolicy)
     *
     * @param resourcePolicy A JSON-formatted string for an AWS resource-based policy.
     */
    public fun resourcePolicy(resourcePolicy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(resourcePolicy)
        cdkBuilder.resourcePolicy(builder.map)
    }

    /**
     * A JSON-formatted string for an AWS resource-based policy.
     *
     * The following are requirements for the resource policy:
     * * Contains only one action: cloudtrail-data:PutAuditEvents
     * * Contains at least one statement. The policy can have a maximum of 20 statements.
     * * Each statement contains at least one principal. A statement can have a maximum of 50
     *   principals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html#cfn-cloudtrail-resourcepolicy-resourcepolicy)
     *
     * @param resourcePolicy A JSON-formatted string for an AWS resource-based policy.
     */
    public fun resourcePolicy(resourcePolicy: Any) {
        cdkBuilder.resourcePolicy(resourcePolicy)
    }

    public fun build(): CfnResourcePolicy = cdkBuilder.build()
}
