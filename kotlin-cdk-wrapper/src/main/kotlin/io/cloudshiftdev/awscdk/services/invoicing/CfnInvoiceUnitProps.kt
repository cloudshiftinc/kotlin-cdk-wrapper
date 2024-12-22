@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.invoicing

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnInvoiceUnit`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.invoicing.*;
 * CfnInvoiceUnitProps cfnInvoiceUnitProps = CfnInvoiceUnitProps.builder()
 * .invoiceReceiver("invoiceReceiver")
 * .name("name")
 * .rule(RuleProperty.builder()
 * .linkedAccounts(List.of("linkedAccounts"))
 * .build())
 * // the properties below are optional
 * .description("description")
 * .resourceTags(List.of(ResourceTagProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .taxInheritanceDisabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html)
 */
public interface CfnInvoiceUnitProps {
  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-invoicereceiver)
   */
  public fun invoiceReceiver(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-name)
   */
  public fun name(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-resourcetags)
   */
  public fun resourceTags(): List<CfnInvoiceUnit.ResourceTagProperty> =
      unwrap(this).getResourceTags()?.map(CfnInvoiceUnit.ResourceTagProperty::wrap) ?: emptyList()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-rule)
   */
  public fun rule(): Any

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-taxinheritancedisabled)
   */
  public fun taxInheritanceDisabled(): Any? = unwrap(this).getTaxInheritanceDisabled()

  /**
   * A builder for [CfnInvoiceUnitProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description the value to be set.
     */
    public fun description(description: String)

    /**
     * @param invoiceReceiver the value to be set. 
     */
    public fun invoiceReceiver(invoiceReceiver: String)

    /**
     * @param name the value to be set. 
     */
    public fun name(name: String)

    /**
     * @param resourceTags the value to be set.
     */
    public fun resourceTags(resourceTags: List<CfnInvoiceUnit.ResourceTagProperty>)

    /**
     * @param resourceTags the value to be set.
     */
    public fun resourceTags(vararg resourceTags: CfnInvoiceUnit.ResourceTagProperty)

    /**
     * @param rule the value to be set. 
     */
    public fun rule(rule: IResolvable)

    /**
     * @param rule the value to be set. 
     */
    public fun rule(rule: CfnInvoiceUnit.RuleProperty)

    /**
     * @param rule the value to be set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ad86452c241eca985c6401862f7d0d9443f470299f04e87cf923faf9f753a61")
    public fun rule(rule: CfnInvoiceUnit.RuleProperty.Builder.() -> Unit)

    /**
     * @param taxInheritanceDisabled the value to be set.
     */
    public fun taxInheritanceDisabled(taxInheritanceDisabled: Boolean)

    /**
     * @param taxInheritanceDisabled the value to be set.
     */
    public fun taxInheritanceDisabled(taxInheritanceDisabled: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.invoicing.CfnInvoiceUnitProps.Builder =
        software.amazon.awscdk.services.invoicing.CfnInvoiceUnitProps.builder()

    /**
     * @param description the value to be set.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param invoiceReceiver the value to be set. 
     */
    override fun invoiceReceiver(invoiceReceiver: String) {
      cdkBuilder.invoiceReceiver(invoiceReceiver)
    }

    /**
     * @param name the value to be set. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param resourceTags the value to be set.
     */
    override fun resourceTags(resourceTags: List<CfnInvoiceUnit.ResourceTagProperty>) {
      cdkBuilder.resourceTags(resourceTags.map(CfnInvoiceUnit.ResourceTagProperty.Companion::unwrap))
    }

    /**
     * @param resourceTags the value to be set.
     */
    override fun resourceTags(vararg resourceTags: CfnInvoiceUnit.ResourceTagProperty): Unit =
        resourceTags(resourceTags.toList())

    /**
     * @param rule the value to be set. 
     */
    override fun rule(rule: IResolvable) {
      cdkBuilder.rule(rule.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param rule the value to be set. 
     */
    override fun rule(rule: CfnInvoiceUnit.RuleProperty) {
      cdkBuilder.rule(rule.let(CfnInvoiceUnit.RuleProperty.Companion::unwrap))
    }

    /**
     * @param rule the value to be set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ad86452c241eca985c6401862f7d0d9443f470299f04e87cf923faf9f753a61")
    override fun rule(rule: CfnInvoiceUnit.RuleProperty.Builder.() -> Unit): Unit =
        rule(CfnInvoiceUnit.RuleProperty(rule))

    /**
     * @param taxInheritanceDisabled the value to be set.
     */
    override fun taxInheritanceDisabled(taxInheritanceDisabled: Boolean) {
      cdkBuilder.taxInheritanceDisabled(taxInheritanceDisabled)
    }

    /**
     * @param taxInheritanceDisabled the value to be set.
     */
    override fun taxInheritanceDisabled(taxInheritanceDisabled: IResolvable) {
      cdkBuilder.taxInheritanceDisabled(taxInheritanceDisabled.let(IResolvable.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.invoicing.CfnInvoiceUnitProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.invoicing.CfnInvoiceUnitProps,
  ) : CdkObject(cdkObject),
      CfnInvoiceUnitProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-invoicereceiver)
     */
    override fun invoiceReceiver(): String = unwrap(this).getInvoiceReceiver()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-resourcetags)
     */
    override fun resourceTags(): List<CfnInvoiceUnit.ResourceTagProperty> =
        unwrap(this).getResourceTags()?.map(CfnInvoiceUnit.ResourceTagProperty::wrap) ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-rule)
     */
    override fun rule(): Any = unwrap(this).getRule()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-taxinheritancedisabled)
     */
    override fun taxInheritanceDisabled(): Any? = unwrap(this).getTaxInheritanceDisabled()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInvoiceUnitProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.invoicing.CfnInvoiceUnitProps):
        CfnInvoiceUnitProps = CdkObjectWrappers.wrap(cdkObject) as? CfnInvoiceUnitProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInvoiceUnitProps):
        software.amazon.awscdk.services.invoicing.CfnInvoiceUnitProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.invoicing.CfnInvoiceUnitProps
  }
}
