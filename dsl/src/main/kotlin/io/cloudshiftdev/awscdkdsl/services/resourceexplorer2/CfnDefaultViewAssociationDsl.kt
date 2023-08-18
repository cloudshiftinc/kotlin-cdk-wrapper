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
import software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociation
import software.constructs.Construct

/**
 * Sets the specified view as the default for the AWS Region in which you call this operation.
 *
 * If a user makes a search query that doesn't explicitly specify the view to use, Resource Explorer
 * chooses this default view automatically for searches performed in this AWS Region .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.resourceexplorer2.*;
 * CfnDefaultViewAssociation cfnDefaultViewAssociation =
 * CfnDefaultViewAssociation.Builder.create(this, "MyCfnDefaultViewAssociation")
 * .viewArn("viewArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-defaultviewassociation.html)
 */
@CdkDslMarker
public class CfnDefaultViewAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDefaultViewAssociation.Builder =
        CfnDefaultViewAssociation.Builder.create(scope, id)

    /**
     * The ARN of the view to set as the default for the AWS Region and AWS account in which you
     * call this operation.
     *
     * The specified view must already exist in the specified Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-defaultviewassociation.html#cfn-resourceexplorer2-defaultviewassociation-viewarn)
     *
     * @param viewArn The ARN of the view to set as the default for the AWS Region and AWS account
     *   in which you call this operation.
     */
    public fun viewArn(viewArn: String) {
        cdkBuilder.viewArn(viewArn)
    }

    public fun build(): CfnDefaultViewAssociation = cdkBuilder.build()
}
