@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.verifiedpermissions

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.verifiedpermissions.*;
 * CfnPolicyProps cfnPolicyProps = CfnPolicyProps.builder()
 * .definition(PolicyDefinitionProperty.builder()
 * .static(StaticPolicyDefinitionProperty.builder()
 * .statement("statement")
 * // the properties below are optional
 * .description("description")
 * .build())
 * .templateLinked(TemplateLinkedPolicyDefinitionProperty.builder()
 * .policyTemplateId("policyTemplateId")
 * // the properties below are optional
 * .principal(EntityIdentifierProperty.builder()
 * .entityId("entityId")
 * .entityType("entityType")
 * .build())
 * .resource(EntityIdentifierProperty.builder()
 * .entityId("entityId")
 * .entityType("entityType")
 * .build())
 * .build())
 * .build())
 * .policyStoreId("policyStoreId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policy.html)
 */
public interface CfnPolicyProps {
  /**
   * Specifies the policy type and content to use for the new or updated policy.
   *
   * The definition structure must include either a `Static` or a `TemplateLinked` element.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policy.html#cfn-verifiedpermissions-policy-definition)
   */
  public fun definition(): Any

  /**
   * Specifies the `PolicyStoreId` of the policy store you want to store the policy in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policy.html#cfn-verifiedpermissions-policy-policystoreid)
   */
  public fun policyStoreId(): String

  /**
   * A builder for [CfnPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param definition Specifies the policy type and content to use for the new or updated policy.
     * 
     * The definition structure must include either a `Static` or a `TemplateLinked` element.
     */
    public fun definition(definition: IResolvable)

    /**
     * @param definition Specifies the policy type and content to use for the new or updated policy.
     * 
     * The definition structure must include either a `Static` or a `TemplateLinked` element.
     */
    public fun definition(definition: CfnPolicy.PolicyDefinitionProperty)

    /**
     * @param definition Specifies the policy type and content to use for the new or updated policy.
     * 
     * The definition structure must include either a `Static` or a `TemplateLinked` element.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d9e51d1cde055787749af96b99f58789b59e4fe6e5b5bb53f52711451a50217")
    public fun definition(definition: CfnPolicy.PolicyDefinitionProperty.Builder.() -> Unit)

    /**
     * @param policyStoreId Specifies the `PolicyStoreId` of the policy store you want to store the
     * policy in. 
     */
    public fun policyStoreId(policyStoreId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyProps.Builder =
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyProps.builder()

    /**
     * @param definition Specifies the policy type and content to use for the new or updated policy.
     * 
     * The definition structure must include either a `Static` or a `TemplateLinked` element.
     */
    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param definition Specifies the policy type and content to use for the new or updated policy.
     * 
     * The definition structure must include either a `Static` or a `TemplateLinked` element.
     */
    override fun definition(definition: CfnPolicy.PolicyDefinitionProperty) {
      cdkBuilder.definition(definition.let(CfnPolicy.PolicyDefinitionProperty.Companion::unwrap))
    }

    /**
     * @param definition Specifies the policy type and content to use for the new or updated policy.
     * 
     * The definition structure must include either a `Static` or a `TemplateLinked` element.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d9e51d1cde055787749af96b99f58789b59e4fe6e5b5bb53f52711451a50217")
    override fun definition(definition: CfnPolicy.PolicyDefinitionProperty.Builder.() -> Unit): Unit
        = definition(CfnPolicy.PolicyDefinitionProperty(definition))

    /**
     * @param policyStoreId Specifies the `PolicyStoreId` of the policy store you want to store the
     * policy in. 
     */
    override fun policyStoreId(policyStoreId: String) {
      cdkBuilder.policyStoreId(policyStoreId)
    }

    public fun build(): software.amazon.awscdk.services.verifiedpermissions.CfnPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnPolicyProps,
  ) : CdkObject(cdkObject), CfnPolicyProps {
    /**
     * Specifies the policy type and content to use for the new or updated policy.
     *
     * The definition structure must include either a `Static` or a `TemplateLinked` element.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policy.html#cfn-verifiedpermissions-policy-definition)
     */
    override fun definition(): Any = unwrap(this).getDefinition()

    /**
     * Specifies the `PolicyStoreId` of the policy store you want to store the policy in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policy.html#cfn-verifiedpermissions-policy-policystoreid)
     */
    override fun policyStoreId(): String = unwrap(this).getPolicyStoreId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnPolicyProps):
        CfnPolicyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPolicyProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPolicyProps):
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.verifiedpermissions.CfnPolicyProps
  }
}
