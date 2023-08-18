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

package io.cloudshiftdev.awscdkdsl.services.resourceexplorer2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociationProps

/**
 * Properties for defining a `CfnDefaultViewAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.resourceexplorer2.*;
 * CfnDefaultViewAssociationProps cfnDefaultViewAssociationProps =
 * CfnDefaultViewAssociationProps.builder()
 * .viewArn("viewArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-defaultviewassociation.html)
 */
@CdkDslMarker
public class CfnDefaultViewAssociationPropsDsl {
    private val cdkBuilder: CfnDefaultViewAssociationProps.Builder =
        CfnDefaultViewAssociationProps.builder()

    /**
     * @param viewArn The ARN of the view to set as the default for the AWS Region and AWS account
     *   in which you call this operation. The specified view must already exist in the specified
     *   Region.
     */
    public fun viewArn(viewArn: String) {
        cdkBuilder.viewArn(viewArn)
    }

    public fun build(): CfnDefaultViewAssociationProps = cdkBuilder.build()
}
