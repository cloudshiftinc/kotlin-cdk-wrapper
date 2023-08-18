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

package io.cloudshiftdev.awscdkdsl.services.route53resolver

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53resolver.CfnResolverConfig
import software.constructs.Construct

/**
 * A complex type that contains information about a Resolver configuration for a VPC.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53resolver.*;
 * CfnResolverConfig cfnResolverConfig = CfnResolverConfig.Builder.create(this,
 * "MyCfnResolverConfig")
 * .autodefinedReverseFlag("autodefinedReverseFlag")
 * .resourceId("resourceId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverconfig.html)
 */
@CdkDslMarker
public class CfnResolverConfigDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResolverConfig.Builder = CfnResolverConfig.Builder.create(scope, id)

    /**
     * Represents the desired status of `AutodefinedReverse` .
     *
     * The only supported value on creation is `DISABLE` . Deletion of this resource will return
     * `AutodefinedReverse` to its default value of `ENABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverconfig.html#cfn-route53resolver-resolverconfig-autodefinedreverseflag)
     *
     * @param autodefinedReverseFlag Represents the desired status of `AutodefinedReverse` .
     */
    public fun autodefinedReverseFlag(autodefinedReverseFlag: String) {
        cdkBuilder.autodefinedReverseFlag(autodefinedReverseFlag)
    }

    /**
     * The ID of the Amazon Virtual Private Cloud VPC that you're configuring Resolver for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverconfig.html#cfn-route53resolver-resolverconfig-resourceid)
     *
     * @param resourceId The ID of the Amazon Virtual Private Cloud VPC that you're configuring
     *   Resolver for.
     */
    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    public fun build(): CfnResolverConfig = cdkBuilder.build()
}
