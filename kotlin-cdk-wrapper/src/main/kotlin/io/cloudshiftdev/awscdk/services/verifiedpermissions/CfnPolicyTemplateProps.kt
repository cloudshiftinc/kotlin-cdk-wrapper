@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.verifiedpermissions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnPolicyTemplate`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.verifiedpermissions.*;
 * CfnPolicyTemplateProps cfnPolicyTemplateProps = CfnPolicyTemplateProps.builder()
 * .policyStoreId("policyStoreId")
 * .statement("statement")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policytemplate.html)
 */
public interface CfnPolicyTemplateProps {
  /**
   * The description to attach to the new or updated policy template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policytemplate.html#cfn-verifiedpermissions-policytemplate-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The unique identifier of the policy store that contains the template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policytemplate.html#cfn-verifiedpermissions-policytemplate-policystoreid)
   */
  public fun policyStoreId(): String

  /**
   * Specifies the content that you want to use for the new policy template, written in the Cedar
   * policy language.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policytemplate.html#cfn-verifiedpermissions-policytemplate-statement)
   */
  public fun statement(): String

  /**
   * A builder for [CfnPolicyTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description to attach to the new or updated policy template.
     */
    public fun description(description: String)

    /**
     * @param policyStoreId The unique identifier of the policy store that contains the template. 
     */
    public fun policyStoreId(policyStoreId: String)

    /**
     * @param statement Specifies the content that you want to use for the new policy template,
     * written in the Cedar policy language. 
     */
    public fun statement(statement: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplateProps.Builder =
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplateProps.builder()

    /**
     * @param description The description to attach to the new or updated policy template.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param policyStoreId The unique identifier of the policy store that contains the template. 
     */
    override fun policyStoreId(policyStoreId: String) {
      cdkBuilder.policyStoreId(policyStoreId)
    }

    /**
     * @param statement Specifies the content that you want to use for the new policy template,
     * written in the Cedar policy language. 
     */
    override fun statement(statement: String) {
      cdkBuilder.statement(statement)
    }

    public fun build(): software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplateProps,
  ) : CdkObject(cdkObject), CfnPolicyTemplateProps {
    /**
     * The description to attach to the new or updated policy template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policytemplate.html#cfn-verifiedpermissions-policytemplate-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The unique identifier of the policy store that contains the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policytemplate.html#cfn-verifiedpermissions-policytemplate-policystoreid)
     */
    override fun policyStoreId(): String = unwrap(this).getPolicyStoreId()

    /**
     * Specifies the content that you want to use for the new policy template, written in the Cedar
     * policy language.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policytemplate.html#cfn-verifiedpermissions-policytemplate-statement)
     */
    override fun statement(): String = unwrap(this).getStatement()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPolicyTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplateProps):
        CfnPolicyTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPolicyTemplateProps):
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplateProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplateProps
  }
}
