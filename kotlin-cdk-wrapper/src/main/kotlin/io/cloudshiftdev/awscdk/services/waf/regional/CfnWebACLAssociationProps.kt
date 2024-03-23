@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnWebACLAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.waf.regional.*;
 * CfnWebACLAssociationProps cfnWebACLAssociationProps = CfnWebACLAssociationProps.builder()
 * .resourceArn("resourceArn")
 * .webAclId("webAclId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html)
 */
public interface CfnWebACLAssociationProps {
  /**
   * The Amazon Resource Name (ARN) of the resource to protect with the web ACL.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html#cfn-wafregional-webaclassociation-resourcearn)
   */
  public fun resourceArn(): String

  /**
   * A unique identifier (ID) for the web ACL.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html#cfn-wafregional-webaclassociation-webaclid)
   */
  public fun webAclId(): String

  /**
   * A builder for [CfnWebACLAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param resourceArn The Amazon Resource Name (ARN) of the resource to protect with the web
     * ACL. 
     */
    public fun resourceArn(resourceArn: String)

    /**
     * @param webAclId A unique identifier (ID) for the web ACL. 
     */
    public fun webAclId(webAclId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps.Builder =
        software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps.builder()

    /**
     * @param resourceArn The Amazon Resource Name (ARN) of the resource to protect with the web
     * ACL. 
     */
    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * @param webAclId A unique identifier (ID) for the web ACL. 
     */
    override fun webAclId(webAclId: String) {
      cdkBuilder.webAclId(webAclId)
    }

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps,
  ) : CdkObject(cdkObject), CfnWebACLAssociationProps {
    /**
     * The Amazon Resource Name (ARN) of the resource to protect with the web ACL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html#cfn-wafregional-webaclassociation-resourcearn)
     */
    override fun resourceArn(): String = unwrap(this).getResourceArn()

    /**
     * A unique identifier (ID) for the web ACL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html#cfn-wafregional-webaclassociation-webaclid)
     */
    override fun webAclId(): String = unwrap(this).getWebAclId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWebACLAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps):
        CfnWebACLAssociationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnWebACLAssociationProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWebACLAssociationProps):
        software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps
  }
}
