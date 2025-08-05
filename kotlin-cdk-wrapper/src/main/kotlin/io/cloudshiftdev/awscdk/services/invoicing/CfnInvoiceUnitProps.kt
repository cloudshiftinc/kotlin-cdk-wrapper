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
   * The assigned description for an invoice unit.
   *
   * This information can't be modified or deleted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The account that receives invoices related to the invoice unit.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-invoicereceiver)
   */
  public fun invoiceReceiver(): String

  /**
   * A unique name that is distinctive within your AWS .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-name)
   */
  public fun name(): String

  /**
   * The tag structure that contains a tag key and value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-resourcetags)
   */
  public fun resourceTags(): List<CfnInvoiceUnit.ResourceTagProperty> =
      unwrap(this).getResourceTags()?.map(CfnInvoiceUnit.ResourceTagProperty::wrap) ?: emptyList()

  /**
   * An `InvoiceUnitRule` object used the categorize invoice units.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-rule)
   */
  public fun rule(): Any

  /**
   * Whether the invoice unit based tax inheritance is/ should be enabled or disabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-taxinheritancedisabled)
   */
  public fun taxInheritanceDisabled(): Any? = unwrap(this).getTaxInheritanceDisabled()

  /**
   * A builder for [CfnInvoiceUnitProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The assigned description for an invoice unit.
     * This information can't be modified or deleted.
     */
    public fun description(description: String)

    /**
     * @param invoiceReceiver The account that receives invoices related to the invoice unit. 
     */
    public fun invoiceReceiver(invoiceReceiver: String)

    /**
     * @param name A unique name that is distinctive within your AWS . 
     */
    public fun name(name: String)

    /**
     * @param resourceTags The tag structure that contains a tag key and value.
     */
    public fun resourceTags(resourceTags: List<CfnInvoiceUnit.ResourceTagProperty>)

    /**
     * @param resourceTags The tag structure that contains a tag key and value.
     */
    public fun resourceTags(vararg resourceTags: CfnInvoiceUnit.ResourceTagProperty)

    /**
     * @param rule An `InvoiceUnitRule` object used the categorize invoice units. 
     */
    public fun rule(rule: IResolvable)

    /**
     * @param rule An `InvoiceUnitRule` object used the categorize invoice units. 
     */
    public fun rule(rule: CfnInvoiceUnit.RuleProperty)

    /**
     * @param rule An `InvoiceUnitRule` object used the categorize invoice units. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ad86452c241eca985c6401862f7d0d9443f470299f04e87cf923faf9f753a61")
    public fun rule(rule: CfnInvoiceUnit.RuleProperty.Builder.() -> Unit)

    /**
     * @param taxInheritanceDisabled Whether the invoice unit based tax inheritance is/ should be
     * enabled or disabled.
     */
    public fun taxInheritanceDisabled(taxInheritanceDisabled: Boolean)

    /**
     * @param taxInheritanceDisabled Whether the invoice unit based tax inheritance is/ should be
     * enabled or disabled.
     */
    public fun taxInheritanceDisabled(taxInheritanceDisabled: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.invoicing.CfnInvoiceUnitProps.Builder =
        software.amazon.awscdk.services.invoicing.CfnInvoiceUnitProps.builder()

    /**
     * @param description The assigned description for an invoice unit.
     * This information can't be modified or deleted.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param invoiceReceiver The account that receives invoices related to the invoice unit. 
     */
    override fun invoiceReceiver(invoiceReceiver: String) {
      cdkBuilder.invoiceReceiver(invoiceReceiver)
    }

    /**
     * @param name A unique name that is distinctive within your AWS . 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param resourceTags The tag structure that contains a tag key and value.
     */
    override fun resourceTags(resourceTags: List<CfnInvoiceUnit.ResourceTagProperty>) {
      cdkBuilder.resourceTags(resourceTags.map(CfnInvoiceUnit.ResourceTagProperty.Companion::unwrap))
    }

    /**
     * @param resourceTags The tag structure that contains a tag key and value.
     */
    override fun resourceTags(vararg resourceTags: CfnInvoiceUnit.ResourceTagProperty): Unit =
        resourceTags(resourceTags.toList())

    /**
     * @param rule An `InvoiceUnitRule` object used the categorize invoice units. 
     */
    override fun rule(rule: IResolvable) {
      cdkBuilder.rule(rule.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param rule An `InvoiceUnitRule` object used the categorize invoice units. 
     */
    override fun rule(rule: CfnInvoiceUnit.RuleProperty) {
      cdkBuilder.rule(rule.let(CfnInvoiceUnit.RuleProperty.Companion::unwrap))
    }

    /**
     * @param rule An `InvoiceUnitRule` object used the categorize invoice units. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ad86452c241eca985c6401862f7d0d9443f470299f04e87cf923faf9f753a61")
    override fun rule(rule: CfnInvoiceUnit.RuleProperty.Builder.() -> Unit): Unit =
        rule(CfnInvoiceUnit.RuleProperty(rule))

    /**
     * @param taxInheritanceDisabled Whether the invoice unit based tax inheritance is/ should be
     * enabled or disabled.
     */
    override fun taxInheritanceDisabled(taxInheritanceDisabled: Boolean) {
      cdkBuilder.taxInheritanceDisabled(taxInheritanceDisabled)
    }

    /**
     * @param taxInheritanceDisabled Whether the invoice unit based tax inheritance is/ should be
     * enabled or disabled.
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
     * The assigned description for an invoice unit.
     *
     * This information can't be modified or deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The account that receives invoices related to the invoice unit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-invoicereceiver)
     */
    override fun invoiceReceiver(): String = unwrap(this).getInvoiceReceiver()

    /**
     * A unique name that is distinctive within your AWS .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The tag structure that contains a tag key and value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-resourcetags)
     */
    override fun resourceTags(): List<CfnInvoiceUnit.ResourceTagProperty> =
        unwrap(this).getResourceTags()?.map(CfnInvoiceUnit.ResourceTagProperty::wrap) ?: emptyList()

    /**
     * An `InvoiceUnitRule` object used the categorize invoice units.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-rule)
     */
    override fun rule(): Any = unwrap(this).getRule()

    /**
     * Whether the invoice unit based tax inheritance is/ should be enabled or disabled.
     *
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
