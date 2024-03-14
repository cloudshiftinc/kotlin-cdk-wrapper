package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWebACLAssociation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the resource to protect with the web ACL.
   */
  public open fun resourceArn(): String = unwrap(this).getResourceArn()

  /**
   * The Amazon Resource Name (ARN) of the resource to protect with the web ACL.
   */
  public open fun resourceArn(`value`: String) {
    unwrap(this).setResourceArn(`value`)
  }

  /**
   * A unique identifier (ID) for the web ACL.
   */
  public open fun webAclId(): String = unwrap(this).getWebAclId()

  /**
   * A unique identifier (ID) for the web ACL.
   */
  public open fun webAclId(`value`: String) {
    unwrap(this).setWebAclId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.waf.regional.CfnWebACLAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the resource to protect with the web ACL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html#cfn-wafregional-webaclassociation-resourcearn)
     * @param resourceArn The Amazon Resource Name (ARN) of the resource to protect with the web
     * ACL. 
     */
    public fun resourceArn(resourceArn: String)

    /**
     * A unique identifier (ID) for the web ACL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html#cfn-wafregional-webaclassociation-webaclid)
     * @param webAclId A unique identifier (ID) for the web ACL. 
     */
    public fun webAclId(webAclId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation.Builder =
        software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the resource to protect with the web ACL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html#cfn-wafregional-webaclassociation-resourcearn)
     * @param resourceArn The Amazon Resource Name (ARN) of the resource to protect with the web
     * ACL. 
     */
    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * A unique identifier (ID) for the web ACL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html#cfn-wafregional-webaclassociation-webaclid)
     * @param webAclId A unique identifier (ID) for the web ACL. 
     */
    override fun webAclId(webAclId: String) {
      cdkBuilder.webAclId(webAclId)
    }

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWebACLAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWebACLAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation):
        CfnWebACLAssociation = CfnWebACLAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnWebACLAssociation):
        software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation = wrapped.cdkObject
  }
}