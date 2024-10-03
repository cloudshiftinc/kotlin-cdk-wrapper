@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.verifiedpermissions

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a policy template.
 *
 * A template can use placeholders for the principal and resource. A template must be instantiated
 * into a policy by associating it with specific principals and resources to use for the placeholders.
 * That instantiated policy can then be considered in authorization decisions. The instantiated policy
 * works identically to any other policy, except that it is dynamically linked to the template. If the
 * template changes, then any policies that are linked to that template are immediately updated as
 * well.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.verifiedpermissions.*;
 * CfnPolicyTemplate cfnPolicyTemplate = CfnPolicyTemplate.Builder.create(this,
 * "MyCfnPolicyTemplate")
 * .policyStoreId("policyStoreId")
 * .statement("statement")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policytemplate.html)
 */
public open class CfnPolicyTemplate(
  cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplate,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPolicyTemplateProps,
  ) :
      this(software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPolicyTemplateProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPolicyTemplateProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPolicyTemplateProps(props)
  )

  /**
   * The unique identifier of the new or modified policy template.
   */
  public open fun attrPolicyTemplateId(): String = unwrap(this).getAttrPolicyTemplateId()

  /**
   * The description to attach to the new or updated policy template.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description to attach to the new or updated policy template.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The unique identifier of the policy store that contains the template.
   */
  public open fun policyStoreId(): String = unwrap(this).getPolicyStoreId()

  /**
   * The unique identifier of the policy store that contains the template.
   */
  public open fun policyStoreId(`value`: String) {
    unwrap(this).setPolicyStoreId(`value`)
  }

  /**
   * Specifies the content that you want to use for the new policy template, written in the Cedar
   * policy language.
   */
  public open fun statement(): String = unwrap(this).getStatement()

  /**
   * Specifies the content that you want to use for the new policy template, written in the Cedar
   * policy language.
   */
  public open fun statement(`value`: String) {
    unwrap(this).setStatement(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.verifiedpermissions.CfnPolicyTemplate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description to attach to the new or updated policy template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policytemplate.html#cfn-verifiedpermissions-policytemplate-description)
     * @param description The description to attach to the new or updated policy template. 
     */
    public fun description(description: String)

    /**
     * The unique identifier of the policy store that contains the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policytemplate.html#cfn-verifiedpermissions-policytemplate-policystoreid)
     * @param policyStoreId The unique identifier of the policy store that contains the template. 
     */
    public fun policyStoreId(policyStoreId: String)

    /**
     * Specifies the content that you want to use for the new policy template, written in the Cedar
     * policy language.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policytemplate.html#cfn-verifiedpermissions-policytemplate-statement)
     * @param statement Specifies the content that you want to use for the new policy template,
     * written in the Cedar policy language. 
     */
    public fun statement(statement: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplate.Builder =
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplate.Builder.create(scope,
        id)

    /**
     * The description to attach to the new or updated policy template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policytemplate.html#cfn-verifiedpermissions-policytemplate-description)
     * @param description The description to attach to the new or updated policy template. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The unique identifier of the policy store that contains the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policytemplate.html#cfn-verifiedpermissions-policytemplate-policystoreid)
     * @param policyStoreId The unique identifier of the policy store that contains the template. 
     */
    override fun policyStoreId(policyStoreId: String) {
      cdkBuilder.policyStoreId(policyStoreId)
    }

    /**
     * Specifies the content that you want to use for the new policy template, written in the Cedar
     * policy language.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policytemplate.html#cfn-verifiedpermissions-policytemplate-statement)
     * @param statement Specifies the content that you want to use for the new policy template,
     * written in the Cedar policy language. 
     */
    override fun statement(statement: String) {
      cdkBuilder.statement(statement)
    }

    public fun build(): software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPolicyTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPolicyTemplate(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplate):
        CfnPolicyTemplate = CfnPolicyTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnPolicyTemplate):
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplate = wrapped.cdkObject as
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplate
  }
}
