@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.invoicing

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An invoice unit is a set of mutually exclusive accounts that correspond to your business entity.
 *
 * Invoice units allow you to separate AWS account costs and configures your invoice for each
 * business entity.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.invoicing.*;
 * CfnInvoiceUnit cfnInvoiceUnit = CfnInvoiceUnit.Builder.create(this, "MyCfnInvoiceUnit")
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
public open class CfnInvoiceUnit(
  cdkObject: software.amazon.awscdk.services.invoicing.CfnInvoiceUnit,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInvoiceUnitProps,
  ) :
      this(software.amazon.awscdk.services.invoicing.CfnInvoiceUnit(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnInvoiceUnitProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInvoiceUnitProps.Builder.() -> Unit,
  ) : this(scope, id, CfnInvoiceUnitProps(props)
  )

  /**
   *
   */
  public open fun attrInvoiceUnitArn(): String = unwrap(this).getAttrInvoiceUnitArn()

  /**
   *
   */
  public open fun attrLastModified(): IResolvable =
      unwrap(this).getAttrLastModified().let(IResolvable::wrap)

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   *
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   *
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
   *
   */
  public open fun invoiceReceiver(): String = unwrap(this).getInvoiceReceiver()

  /**
   *
   */
  public open fun invoiceReceiver(`value`: String) {
    unwrap(this).setInvoiceReceiver(`value`)
  }

  /**
   *
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   *
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   *
   */
  public open fun resourceTags(): List<ResourceTagProperty> =
      unwrap(this).getResourceTags()?.map(ResourceTagProperty::wrap) ?: emptyList()

  /**
   *
   */
  public open fun resourceTags(`value`: List<ResourceTagProperty>) {
    unwrap(this).setResourceTags(`value`.map(ResourceTagProperty.Companion::unwrap))
  }

  /**
   *
   */
  public open fun resourceTags(vararg `value`: ResourceTagProperty): Unit =
      resourceTags(`value`.toList())

  /**
   *
   */
  public open fun rule(): Any = unwrap(this).getRule()

  /**
   *
   */
  public open fun rule(`value`: IResolvable) {
    unwrap(this).setRule(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun rule(`value`: RuleProperty) {
    unwrap(this).setRule(`value`.let(RuleProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("61a0c84553162241ddcc0ea09054e214431700d0a0cd740e84f96115960fd5b7")
  public open fun rule(`value`: RuleProperty.Builder.() -> Unit): Unit = rule(RuleProperty(`value`))

  /**
   *
   */
  public open fun taxInheritanceDisabled(): Any? = unwrap(this).getTaxInheritanceDisabled()

  /**
   *
   */
  public open fun taxInheritanceDisabled(`value`: Boolean) {
    unwrap(this).setTaxInheritanceDisabled(`value`)
  }

  /**
   *
   */
  public open fun taxInheritanceDisabled(`value`: IResolvable) {
    unwrap(this).setTaxInheritanceDisabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.invoicing.CfnInvoiceUnit].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-description)
     * @param description 
     */
    public fun description(description: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-invoicereceiver)
     * @param invoiceReceiver 
     */
    public fun invoiceReceiver(invoiceReceiver: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-name)
     * @param name 
     */
    public fun name(name: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-resourcetags)
     * @param resourceTags 
     */
    public fun resourceTags(resourceTags: List<ResourceTagProperty>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-resourcetags)
     * @param resourceTags 
     */
    public fun resourceTags(vararg resourceTags: ResourceTagProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-rule)
     * @param rule 
     */
    public fun rule(rule: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-rule)
     * @param rule 
     */
    public fun rule(rule: RuleProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-rule)
     * @param rule 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9746dea2aa395ecf2e2f6527aad93fd2837dac46b4c28905dc8bec28b305cb6")
    public fun rule(rule: RuleProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-taxinheritancedisabled)
     * @param taxInheritanceDisabled 
     */
    public fun taxInheritanceDisabled(taxInheritanceDisabled: Boolean)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-taxinheritancedisabled)
     * @param taxInheritanceDisabled 
     */
    public fun taxInheritanceDisabled(taxInheritanceDisabled: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.invoicing.CfnInvoiceUnit.Builder =
        software.amazon.awscdk.services.invoicing.CfnInvoiceUnit.Builder.create(scope, id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-description)
     * @param description 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-invoicereceiver)
     * @param invoiceReceiver 
     */
    override fun invoiceReceiver(invoiceReceiver: String) {
      cdkBuilder.invoiceReceiver(invoiceReceiver)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-name)
     * @param name 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-resourcetags)
     * @param resourceTags 
     */
    override fun resourceTags(resourceTags: List<ResourceTagProperty>) {
      cdkBuilder.resourceTags(resourceTags.map(ResourceTagProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-resourcetags)
     * @param resourceTags 
     */
    override fun resourceTags(vararg resourceTags: ResourceTagProperty): Unit =
        resourceTags(resourceTags.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-rule)
     * @param rule 
     */
    override fun rule(rule: IResolvable) {
      cdkBuilder.rule(rule.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-rule)
     * @param rule 
     */
    override fun rule(rule: RuleProperty) {
      cdkBuilder.rule(rule.let(RuleProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-rule)
     * @param rule 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9746dea2aa395ecf2e2f6527aad93fd2837dac46b4c28905dc8bec28b305cb6")
    override fun rule(rule: RuleProperty.Builder.() -> Unit): Unit = rule(RuleProperty(rule))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-taxinheritancedisabled)
     * @param taxInheritanceDisabled 
     */
    override fun taxInheritanceDisabled(taxInheritanceDisabled: Boolean) {
      cdkBuilder.taxInheritanceDisabled(taxInheritanceDisabled)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-invoicing-invoiceunit.html#cfn-invoicing-invoiceunit-taxinheritancedisabled)
     * @param taxInheritanceDisabled 
     */
    override fun taxInheritanceDisabled(taxInheritanceDisabled: IResolvable) {
      cdkBuilder.taxInheritanceDisabled(taxInheritanceDisabled.let(IResolvable.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.invoicing.CfnInvoiceUnit =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.invoicing.CfnInvoiceUnit.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInvoiceUnit {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInvoiceUnit(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.invoicing.CfnInvoiceUnit):
        CfnInvoiceUnit = CfnInvoiceUnit(cdkObject)

    internal fun unwrap(wrapped: CfnInvoiceUnit):
        software.amazon.awscdk.services.invoicing.CfnInvoiceUnit = wrapped.cdkObject as
        software.amazon.awscdk.services.invoicing.CfnInvoiceUnit
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.invoicing.*;
   * ResourceTagProperty resourceTagProperty = ResourceTagProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-invoicing-invoiceunit-resourcetag.html)
   */
  public interface ResourceTagProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-invoicing-invoiceunit-resourcetag.html#cfn-invoicing-invoiceunit-resourcetag-key)
     */
    public fun key(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-invoicing-invoiceunit-resourcetag.html#cfn-invoicing-invoiceunit-resourcetag-value)
     */
    public fun `value`(): String

    /**
     * A builder for [ResourceTagProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key the value to be set. 
       */
      public fun key(key: String)

      /**
       * @param value the value to be set. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.invoicing.CfnInvoiceUnit.ResourceTagProperty.Builder =
          software.amazon.awscdk.services.invoicing.CfnInvoiceUnit.ResourceTagProperty.builder()

      /**
       * @param key the value to be set. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value the value to be set. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.invoicing.CfnInvoiceUnit.ResourceTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.invoicing.CfnInvoiceUnit.ResourceTagProperty,
    ) : CdkObject(cdkObject),
        ResourceTagProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-invoicing-invoiceunit-resourcetag.html#cfn-invoicing-invoiceunit-resourcetag-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-invoicing-invoiceunit-resourcetag.html#cfn-invoicing-invoiceunit-resourcetag-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.invoicing.CfnInvoiceUnit.ResourceTagProperty):
          ResourceTagProperty = CdkObjectWrappers.wrap(cdkObject) as? ResourceTagProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceTagProperty):
          software.amazon.awscdk.services.invoicing.CfnInvoiceUnit.ResourceTagProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.invoicing.CfnInvoiceUnit.ResourceTagProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.invoicing.*;
   * RuleProperty ruleProperty = RuleProperty.builder()
   * .linkedAccounts(List.of("linkedAccounts"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-invoicing-invoiceunit-rule.html)
   */
  public interface RuleProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-invoicing-invoiceunit-rule.html#cfn-invoicing-invoiceunit-rule-linkedaccounts)
     */
    public fun linkedAccounts(): List<String>

    /**
     * A builder for [RuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param linkedAccounts the value to be set. 
       */
      public fun linkedAccounts(linkedAccounts: List<String>)

      /**
       * @param linkedAccounts the value to be set. 
       */
      public fun linkedAccounts(vararg linkedAccounts: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.invoicing.CfnInvoiceUnit.RuleProperty.Builder =
          software.amazon.awscdk.services.invoicing.CfnInvoiceUnit.RuleProperty.builder()

      /**
       * @param linkedAccounts the value to be set. 
       */
      override fun linkedAccounts(linkedAccounts: List<String>) {
        cdkBuilder.linkedAccounts(linkedAccounts)
      }

      /**
       * @param linkedAccounts the value to be set. 
       */
      override fun linkedAccounts(vararg linkedAccounts: String): Unit =
          linkedAccounts(linkedAccounts.toList())

      public fun build(): software.amazon.awscdk.services.invoicing.CfnInvoiceUnit.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.invoicing.CfnInvoiceUnit.RuleProperty,
    ) : CdkObject(cdkObject),
        RuleProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-invoicing-invoiceunit-rule.html#cfn-invoicing-invoiceunit-rule-linkedaccounts)
       */
      override fun linkedAccounts(): List<String> = unwrap(this).getLinkedAccounts()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.invoicing.CfnInvoiceUnit.RuleProperty):
          RuleProperty = CdkObjectWrappers.wrap(cdkObject) as? RuleProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.invoicing.CfnInvoiceUnit.RuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.invoicing.CfnInvoiceUnit.RuleProperty
    }
  }
}
