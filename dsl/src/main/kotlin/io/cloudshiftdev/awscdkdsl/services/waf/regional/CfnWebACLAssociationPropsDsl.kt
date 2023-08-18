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

package io.cloudshiftdev.awscdkdsl.services.waf.regional

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps

/**
 * Properties for defining a `CfnWebACLAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.regional.*;
 * CfnWebACLAssociationProps cfnWebACLAssociationProps = CfnWebACLAssociationProps.builder()
 * .resourceArn("resourceArn")
 * .webAclId("webAclId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html)
 */
@CdkDslMarker
public class CfnWebACLAssociationPropsDsl {
    private val cdkBuilder: CfnWebACLAssociationProps.Builder = CfnWebACLAssociationProps.builder()

    /**
     * @param resourceArn The Amazon Resource Name (ARN) of the resource to protect with the web
     *   ACL.
     */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    /** @param webAclId A unique identifier (ID) for the web ACL. */
    public fun webAclId(webAclId: String) {
        cdkBuilder.webAclId(webAclId)
    }

    public fun build(): CfnWebACLAssociationProps = cdkBuilder.build()
}
