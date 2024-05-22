@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.qbusiness

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnIndex`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.qbusiness.*;
 * CfnIndexProps cfnIndexProps = CfnIndexProps.builder()
 * .applicationId("applicationId")
 * .displayName("displayName")
 * // the properties below are optional
 * .capacityConfiguration(IndexCapacityConfigurationProperty.builder()
 * .units(123)
 * .build())
 * .description("description")
 * .documentAttributeConfigurations(List.of(DocumentAttributeConfigurationProperty.builder()
 * .name("name")
 * .search("search")
 * .type("type")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html)
 */
public interface CfnIndexProps {
  /**
   * The identifier of the Amazon Q Business application using the index.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-applicationid)
   */
  public fun applicationId(): String

  /**
   * The capacity units you want to provision for your index.
   *
   * You can add and remove capacity to fit your usage needs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-capacityconfiguration)
   */
  public fun capacityConfiguration(): Any? = unwrap(this).getCapacityConfiguration()

  /**
   * A description for the Amazon Q Business index.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the index.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-displayname)
   */
  public fun displayName(): String

  /**
   * Configuration information for document attributes.
   *
   * Document attributes are metadata or fields associated with your documents. For example, the
   * company department name associated with each document.
   *
   * For more information, see [Understanding document
   * attributes](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-documentattributeconfigurations)
   */
  public fun documentAttributeConfigurations(): Any? =
      unwrap(this).getDocumentAttributeConfigurations()

  /**
   * A list of key-value pairs that identify or categorize the index.
   *
   * You can also use tags to help control access to the index. Tag keys and values can consist of
   * Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The index type that's suitable for your needs.
   *
   * For more information on what's included in each type of index, see [Amazon Q Business
   * tiers](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/tiers.html#index-tiers) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-type)
   */
  public fun type(): String? = unwrap(this).getType()

  /**
   * A builder for [CfnIndexProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationId The identifier of the Amazon Q Business application using the index. 
     */
    public fun applicationId(applicationId: String)

    /**
     * @param capacityConfiguration The capacity units you want to provision for your index.
     * You can add and remove capacity to fit your usage needs.
     */
    public fun capacityConfiguration(capacityConfiguration: IResolvable)

    /**
     * @param capacityConfiguration The capacity units you want to provision for your index.
     * You can add and remove capacity to fit your usage needs.
     */
    public
        fun capacityConfiguration(capacityConfiguration: CfnIndex.IndexCapacityConfigurationProperty)

    /**
     * @param capacityConfiguration The capacity units you want to provision for your index.
     * You can add and remove capacity to fit your usage needs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5d63a10f8aa6dd854a390f405b1361fdb3323f83bfe5d6beb233b462b107efe")
    public
        fun capacityConfiguration(capacityConfiguration: CfnIndex.IndexCapacityConfigurationProperty.Builder.() -> Unit)

    /**
     * @param description A description for the Amazon Q Business index.
     */
    public fun description(description: String)

    /**
     * @param displayName The name of the index. 
     */
    public fun displayName(displayName: String)

    /**
     * @param documentAttributeConfigurations Configuration information for document attributes.
     * Document attributes are metadata or fields associated with your documents. For example, the
     * company department name associated with each document.
     *
     * For more information, see [Understanding document
     * attributes](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes.html) .
     */
    public fun documentAttributeConfigurations(documentAttributeConfigurations: IResolvable)

    /**
     * @param documentAttributeConfigurations Configuration information for document attributes.
     * Document attributes are metadata or fields associated with your documents. For example, the
     * company department name associated with each document.
     *
     * For more information, see [Understanding document
     * attributes](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes.html) .
     */
    public fun documentAttributeConfigurations(documentAttributeConfigurations: List<Any>)

    /**
     * @param documentAttributeConfigurations Configuration information for document attributes.
     * Document attributes are metadata or fields associated with your documents. For example, the
     * company department name associated with each document.
     *
     * For more information, see [Understanding document
     * attributes](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes.html) .
     */
    public fun documentAttributeConfigurations(vararg documentAttributeConfigurations: Any)

    /**
     * @param tags A list of key-value pairs that identify or categorize the index.
     * You can also use tags to help control access to the index. Tag keys and values can consist of
     * Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of key-value pairs that identify or categorize the index.
     * You can also use tags to help control access to the index. Tag keys and values can consist of
     * Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The index type that's suitable for your needs.
     * For more information on what's included in each type of index, see [Amazon Q Business
     * tiers](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/tiers.html#index-tiers) .
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.qbusiness.CfnIndexProps.Builder =
        software.amazon.awscdk.services.qbusiness.CfnIndexProps.builder()

    /**
     * @param applicationId The identifier of the Amazon Q Business application using the index. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param capacityConfiguration The capacity units you want to provision for your index.
     * You can add and remove capacity to fit your usage needs.
     */
    override fun capacityConfiguration(capacityConfiguration: IResolvable) {
      cdkBuilder.capacityConfiguration(capacityConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param capacityConfiguration The capacity units you want to provision for your index.
     * You can add and remove capacity to fit your usage needs.
     */
    override
        fun capacityConfiguration(capacityConfiguration: CfnIndex.IndexCapacityConfigurationProperty) {
      cdkBuilder.capacityConfiguration(capacityConfiguration.let(CfnIndex.IndexCapacityConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param capacityConfiguration The capacity units you want to provision for your index.
     * You can add and remove capacity to fit your usage needs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5d63a10f8aa6dd854a390f405b1361fdb3323f83bfe5d6beb233b462b107efe")
    override
        fun capacityConfiguration(capacityConfiguration: CfnIndex.IndexCapacityConfigurationProperty.Builder.() -> Unit):
        Unit =
        capacityConfiguration(CfnIndex.IndexCapacityConfigurationProperty(capacityConfiguration))

    /**
     * @param description A description for the Amazon Q Business index.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param displayName The name of the index. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param documentAttributeConfigurations Configuration information for document attributes.
     * Document attributes are metadata or fields associated with your documents. For example, the
     * company department name associated with each document.
     *
     * For more information, see [Understanding document
     * attributes](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes.html) .
     */
    override fun documentAttributeConfigurations(documentAttributeConfigurations: IResolvable) {
      cdkBuilder.documentAttributeConfigurations(documentAttributeConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param documentAttributeConfigurations Configuration information for document attributes.
     * Document attributes are metadata or fields associated with your documents. For example, the
     * company department name associated with each document.
     *
     * For more information, see [Understanding document
     * attributes](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes.html) .
     */
    override fun documentAttributeConfigurations(documentAttributeConfigurations: List<Any>) {
      cdkBuilder.documentAttributeConfigurations(documentAttributeConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param documentAttributeConfigurations Configuration information for document attributes.
     * Document attributes are metadata or fields associated with your documents. For example, the
     * company department name associated with each document.
     *
     * For more information, see [Understanding document
     * attributes](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes.html) .
     */
    override fun documentAttributeConfigurations(vararg documentAttributeConfigurations: Any): Unit
        = documentAttributeConfigurations(documentAttributeConfigurations.toList())

    /**
     * @param tags A list of key-value pairs that identify or categorize the index.
     * You can also use tags to help control access to the index. Tag keys and values can consist of
     * Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of key-value pairs that identify or categorize the index.
     * You can also use tags to help control access to the index. Tag keys and values can consist of
     * Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The index type that's suitable for your needs.
     * For more information on what's included in each type of index, see [Amazon Q Business
     * tiers](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/tiers.html#index-tiers) .
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.qbusiness.CfnIndexProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.qbusiness.CfnIndexProps,
  ) : CdkObject(cdkObject), CfnIndexProps {
    /**
     * The identifier of the Amazon Q Business application using the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-applicationid)
     */
    override fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * The capacity units you want to provision for your index.
     *
     * You can add and remove capacity to fit your usage needs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-capacityconfiguration)
     */
    override fun capacityConfiguration(): Any? = unwrap(this).getCapacityConfiguration()

    /**
     * A description for the Amazon Q Business index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-displayname)
     */
    override fun displayName(): String = unwrap(this).getDisplayName()

    /**
     * Configuration information for document attributes.
     *
     * Document attributes are metadata or fields associated with your documents. For example, the
     * company department name associated with each document.
     *
     * For more information, see [Understanding document
     * attributes](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-documentattributeconfigurations)
     */
    override fun documentAttributeConfigurations(): Any? =
        unwrap(this).getDocumentAttributeConfigurations()

    /**
     * A list of key-value pairs that identify or categorize the index.
     *
     * You can also use tags to help control access to the index. Tag keys and values can consist of
     * Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The index type that's suitable for your needs.
     *
     * For more information on what's included in each type of index, see [Amazon Q Business
     * tiers](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/tiers.html#index-tiers) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-type)
     */
    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIndexProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnIndexProps):
        CfnIndexProps = CdkObjectWrappers.wrap(cdkObject) as? CfnIndexProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIndexProps):
        software.amazon.awscdk.services.qbusiness.CfnIndexProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.qbusiness.CfnIndexProps
  }
}
