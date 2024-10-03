@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.qbusiness

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an Amazon Q Business index.
 *
 * To determine if index creation has completed, check the `Status` field returned from a call to
 * `DescribeIndex` . The `Status` field is set to `ACTIVE` when the index is ready to use.
 *
 * Once the index is active, you can index your documents using the
 * [`BatchPutDocument`](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_BatchPutDocument.html)
 * API or the
 * [`CreateDataSource`](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_CreateDataSource.html)
 * API.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.qbusiness.*;
 * CfnIndex cfnIndex = CfnIndex.Builder.create(this, "MyCfnIndex")
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
public open class CfnIndex(
  cdkObject: software.amazon.awscdk.services.qbusiness.CfnIndex,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIndexProps,
  ) :
      this(software.amazon.awscdk.services.qbusiness.CfnIndex(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnIndexProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIndexProps.Builder.() -> Unit,
  ) : this(scope, id, CfnIndexProps(props)
  )

  /**
   * The identifier of the Amazon Q Business application using the index.
   */
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  /**
   * The identifier of the Amazon Q Business application using the index.
   */
  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  /**
   * The Unix timestamp when the index was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The Amazon Resource Name (ARN) of an Amazon Q Business index.
   */
  public open fun attrIndexArn(): String = unwrap(this).getAttrIndexArn()

  /**
   * The identifier for the index.
   */
  public open fun attrIndexId(): String = unwrap(this).getAttrIndexId()

  /**
   *
   */
  public open fun attrIndexStatistics(): IResolvable =
      unwrap(this).getAttrIndexStatistics().let(IResolvable::wrap)

  /**
   * The current status of the index.
   *
   * When the status is `ACTIVE` , the index is ready.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The Unix timestamp when the index was last updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * The capacity units you want to provision for your index.
   */
  public open fun capacityConfiguration(): Any? = unwrap(this).getCapacityConfiguration()

  /**
   * The capacity units you want to provision for your index.
   */
  public open fun capacityConfiguration(`value`: IResolvable) {
    unwrap(this).setCapacityConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The capacity units you want to provision for your index.
   */
  public open fun capacityConfiguration(`value`: IndexCapacityConfigurationProperty) {
    unwrap(this).setCapacityConfiguration(`value`.let(IndexCapacityConfigurationProperty.Companion::unwrap))
  }

  /**
   * The capacity units you want to provision for your index.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b27a759c298f46d9ae7743002f29ac64b767f79f34161d9278c19c51fcdf94f1")
  public open
      fun capacityConfiguration(`value`: IndexCapacityConfigurationProperty.Builder.() -> Unit):
      Unit = capacityConfiguration(IndexCapacityConfigurationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A description for the Amazon Q Business index.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description for the Amazon Q Business index.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The name of the index.
   */
  public open fun displayName(): String = unwrap(this).getDisplayName()

  /**
   * The name of the index.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * Configuration information for document attributes.
   */
  public open fun documentAttributeConfigurations(): Any? =
      unwrap(this).getDocumentAttributeConfigurations()

  /**
   * Configuration information for document attributes.
   */
  public open fun documentAttributeConfigurations(`value`: IResolvable) {
    unwrap(this).setDocumentAttributeConfigurations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Configuration information for document attributes.
   */
  public open fun documentAttributeConfigurations(`value`: List<Any>) {
    unwrap(this).setDocumentAttributeConfigurations(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Configuration information for document attributes.
   */
  public open fun documentAttributeConfigurations(vararg `value`: Any): Unit =
      documentAttributeConfigurations(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A list of key-value pairs that identify or categorize the index.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of key-value pairs that identify or categorize the index.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of key-value pairs that identify or categorize the index.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The index type that's suitable for your needs.
   */
  public open fun type(): String? = unwrap(this).getType()

  /**
   * The index type that's suitable for your needs.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.qbusiness.CfnIndex].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifier of the Amazon Q Business application using the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-applicationid)
     * @param applicationId The identifier of the Amazon Q Business application using the index. 
     */
    public fun applicationId(applicationId: String)

    /**
     * The capacity units you want to provision for your index.
     *
     * You can add and remove capacity to fit your usage needs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-capacityconfiguration)
     * @param capacityConfiguration The capacity units you want to provision for your index. 
     */
    public fun capacityConfiguration(capacityConfiguration: IResolvable)

    /**
     * The capacity units you want to provision for your index.
     *
     * You can add and remove capacity to fit your usage needs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-capacityconfiguration)
     * @param capacityConfiguration The capacity units you want to provision for your index. 
     */
    public fun capacityConfiguration(capacityConfiguration: IndexCapacityConfigurationProperty)

    /**
     * The capacity units you want to provision for your index.
     *
     * You can add and remove capacity to fit your usage needs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-capacityconfiguration)
     * @param capacityConfiguration The capacity units you want to provision for your index. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef6b56b84bfa17af96ed62ff2335e1e90376e7f217422b84528b6b122a363a65")
    public
        fun capacityConfiguration(capacityConfiguration: IndexCapacityConfigurationProperty.Builder.() -> Unit)

    /**
     * A description for the Amazon Q Business index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-description)
     * @param description A description for the Amazon Q Business index. 
     */
    public fun description(description: String)

    /**
     * The name of the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-displayname)
     * @param displayName The name of the index. 
     */
    public fun displayName(displayName: String)

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
     * @param documentAttributeConfigurations Configuration information for document attributes. 
     */
    public fun documentAttributeConfigurations(documentAttributeConfigurations: IResolvable)

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
     * @param documentAttributeConfigurations Configuration information for document attributes. 
     */
    public fun documentAttributeConfigurations(documentAttributeConfigurations: List<Any>)

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
     * @param documentAttributeConfigurations Configuration information for document attributes. 
     */
    public fun documentAttributeConfigurations(vararg documentAttributeConfigurations: Any)

    /**
     * A list of key-value pairs that identify or categorize the index.
     *
     * You can also use tags to help control access to the index. Tag keys and values can consist of
     * Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-tags)
     * @param tags A list of key-value pairs that identify or categorize the index. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of key-value pairs that identify or categorize the index.
     *
     * You can also use tags to help control access to the index. Tag keys and values can consist of
     * Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-tags)
     * @param tags A list of key-value pairs that identify or categorize the index. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The index type that's suitable for your needs.
     *
     * For more information on what's included in each type of index, see [Amazon Q Business
     * tiers](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/tiers.html#index-tiers) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-type)
     * @param type The index type that's suitable for your needs. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.qbusiness.CfnIndex.Builder =
        software.amazon.awscdk.services.qbusiness.CfnIndex.Builder.create(scope, id)

    /**
     * The identifier of the Amazon Q Business application using the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-applicationid)
     * @param applicationId The identifier of the Amazon Q Business application using the index. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * The capacity units you want to provision for your index.
     *
     * You can add and remove capacity to fit your usage needs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-capacityconfiguration)
     * @param capacityConfiguration The capacity units you want to provision for your index. 
     */
    override fun capacityConfiguration(capacityConfiguration: IResolvable) {
      cdkBuilder.capacityConfiguration(capacityConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The capacity units you want to provision for your index.
     *
     * You can add and remove capacity to fit your usage needs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-capacityconfiguration)
     * @param capacityConfiguration The capacity units you want to provision for your index. 
     */
    override fun capacityConfiguration(capacityConfiguration: IndexCapacityConfigurationProperty) {
      cdkBuilder.capacityConfiguration(capacityConfiguration.let(IndexCapacityConfigurationProperty.Companion::unwrap))
    }

    /**
     * The capacity units you want to provision for your index.
     *
     * You can add and remove capacity to fit your usage needs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-capacityconfiguration)
     * @param capacityConfiguration The capacity units you want to provision for your index. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef6b56b84bfa17af96ed62ff2335e1e90376e7f217422b84528b6b122a363a65")
    override
        fun capacityConfiguration(capacityConfiguration: IndexCapacityConfigurationProperty.Builder.() -> Unit):
        Unit = capacityConfiguration(IndexCapacityConfigurationProperty(capacityConfiguration))

    /**
     * A description for the Amazon Q Business index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-description)
     * @param description A description for the Amazon Q Business index. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-displayname)
     * @param displayName The name of the index. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

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
     * @param documentAttributeConfigurations Configuration information for document attributes. 
     */
    override fun documentAttributeConfigurations(documentAttributeConfigurations: IResolvable) {
      cdkBuilder.documentAttributeConfigurations(documentAttributeConfigurations.let(IResolvable.Companion::unwrap))
    }

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
     * @param documentAttributeConfigurations Configuration information for document attributes. 
     */
    override fun documentAttributeConfigurations(documentAttributeConfigurations: List<Any>) {
      cdkBuilder.documentAttributeConfigurations(documentAttributeConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

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
     * @param documentAttributeConfigurations Configuration information for document attributes. 
     */
    override fun documentAttributeConfigurations(vararg documentAttributeConfigurations: Any): Unit
        = documentAttributeConfigurations(documentAttributeConfigurations.toList())

    /**
     * A list of key-value pairs that identify or categorize the index.
     *
     * You can also use tags to help control access to the index. Tag keys and values can consist of
     * Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-tags)
     * @param tags A list of key-value pairs that identify or categorize the index. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of key-value pairs that identify or categorize the index.
     *
     * You can also use tags to help control access to the index. Tag keys and values can consist of
     * Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-tags)
     * @param tags A list of key-value pairs that identify or categorize the index. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The index type that's suitable for your needs.
     *
     * For more information on what's included in each type of index, see [Amazon Q Business
     * tiers](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/tiers.html#index-tiers) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-index.html#cfn-qbusiness-index-type)
     * @param type The index type that's suitable for your needs. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.qbusiness.CfnIndex = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.qbusiness.CfnIndex.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIndex {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIndex(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnIndex): CfnIndex =
        CfnIndex(cdkObject)

    internal fun unwrap(wrapped: CfnIndex): software.amazon.awscdk.services.qbusiness.CfnIndex =
        wrapped.cdkObject as software.amazon.awscdk.services.qbusiness.CfnIndex
  }

  /**
   * Configuration information for document attributes.
   *
   * Document attributes are metadata or fields associated with your documents. For example, the
   * company department name associated with each document.
   *
   * For more information, see [Understanding document
   * attributes](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * DocumentAttributeConfigurationProperty documentAttributeConfigurationProperty =
   * DocumentAttributeConfigurationProperty.builder()
   * .name("name")
   * .search("search")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-index-documentattributeconfiguration.html)
   */
  public interface DocumentAttributeConfigurationProperty {
    /**
     * The name of the document attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-index-documentattributeconfiguration.html#cfn-qbusiness-index-documentattributeconfiguration-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * Information about whether the document attribute can be used by an end user to search for
     * information on their web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-index-documentattributeconfiguration.html#cfn-qbusiness-index-documentattributeconfiguration-search)
     */
    public fun search(): String? = unwrap(this).getSearch()

    /**
     * The type of document attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-index-documentattributeconfiguration.html#cfn-qbusiness-index-documentattributeconfiguration-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [DocumentAttributeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the document attribute.
       */
      public fun name(name: String)

      /**
       * @param search Information about whether the document attribute can be used by an end user
       * to search for information on their web experience.
       */
      public fun search(search: String)

      /**
       * @param type The type of document attribute.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnIndex.DocumentAttributeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnIndex.DocumentAttributeConfigurationProperty.builder()

      /**
       * @param name The name of the document attribute.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param search Information about whether the document attribute can be used by an end user
       * to search for information on their web experience.
       */
      override fun search(search: String) {
        cdkBuilder.search(search)
      }

      /**
       * @param type The type of document attribute.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnIndex.DocumentAttributeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnIndex.DocumentAttributeConfigurationProperty,
    ) : CdkObject(cdkObject),
        DocumentAttributeConfigurationProperty {
      /**
       * The name of the document attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-index-documentattributeconfiguration.html#cfn-qbusiness-index-documentattributeconfiguration-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * Information about whether the document attribute can be used by an end user to search for
       * information on their web experience.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-index-documentattributeconfiguration.html#cfn-qbusiness-index-documentattributeconfiguration-search)
       */
      override fun search(): String? = unwrap(this).getSearch()

      /**
       * The type of document attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-index-documentattributeconfiguration.html#cfn-qbusiness-index-documentattributeconfiguration-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DocumentAttributeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnIndex.DocumentAttributeConfigurationProperty):
          DocumentAttributeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DocumentAttributeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentAttributeConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnIndex.DocumentAttributeConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnIndex.DocumentAttributeConfigurationProperty
    }
  }

  /**
   * Provides information about index capacity configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * IndexCapacityConfigurationProperty indexCapacityConfigurationProperty =
   * IndexCapacityConfigurationProperty.builder()
   * .units(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-index-indexcapacityconfiguration.html)
   */
  public interface IndexCapacityConfigurationProperty {
    /**
     * The number of storage units configured for an Amazon Q Business index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-index-indexcapacityconfiguration.html#cfn-qbusiness-index-indexcapacityconfiguration-units)
     */
    public fun units(): Number? = unwrap(this).getUnits()

    /**
     * A builder for [IndexCapacityConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param units The number of storage units configured for an Amazon Q Business index.
       */
      public fun units(units: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnIndex.IndexCapacityConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnIndex.IndexCapacityConfigurationProperty.builder()

      /**
       * @param units The number of storage units configured for an Amazon Q Business index.
       */
      override fun units(units: Number) {
        cdkBuilder.units(units)
      }

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnIndex.IndexCapacityConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnIndex.IndexCapacityConfigurationProperty,
    ) : CdkObject(cdkObject),
        IndexCapacityConfigurationProperty {
      /**
       * The number of storage units configured for an Amazon Q Business index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-index-indexcapacityconfiguration.html#cfn-qbusiness-index-indexcapacityconfiguration-units)
       */
      override fun units(): Number? = unwrap(this).getUnits()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IndexCapacityConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnIndex.IndexCapacityConfigurationProperty):
          IndexCapacityConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IndexCapacityConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IndexCapacityConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnIndex.IndexCapacityConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnIndex.IndexCapacityConfigurationProperty
    }
  }

  /**
   * Provides information about the number of documents in an index.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * IndexStatisticsProperty indexStatisticsProperty = IndexStatisticsProperty.builder()
   * .textDocumentStatistics(TextDocumentStatisticsProperty.builder()
   * .indexedTextBytes(123)
   * .indexedTextDocumentCount(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-index-indexstatistics.html)
   */
  public interface IndexStatisticsProperty {
    /**
     * The number of documents indexed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-index-indexstatistics.html#cfn-qbusiness-index-indexstatistics-textdocumentstatistics)
     */
    public fun textDocumentStatistics(): Any? = unwrap(this).getTextDocumentStatistics()

    /**
     * A builder for [IndexStatisticsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param textDocumentStatistics The number of documents indexed.
       */
      public fun textDocumentStatistics(textDocumentStatistics: IResolvable)

      /**
       * @param textDocumentStatistics The number of documents indexed.
       */
      public fun textDocumentStatistics(textDocumentStatistics: TextDocumentStatisticsProperty)

      /**
       * @param textDocumentStatistics The number of documents indexed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b7e051ee7131e381f77b4eb9168e0908863398d0db51bbc29f67929b6ac47abe")
      public
          fun textDocumentStatistics(textDocumentStatistics: TextDocumentStatisticsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnIndex.IndexStatisticsProperty.Builder =
          software.amazon.awscdk.services.qbusiness.CfnIndex.IndexStatisticsProperty.builder()

      /**
       * @param textDocumentStatistics The number of documents indexed.
       */
      override fun textDocumentStatistics(textDocumentStatistics: IResolvable) {
        cdkBuilder.textDocumentStatistics(textDocumentStatistics.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param textDocumentStatistics The number of documents indexed.
       */
      override fun textDocumentStatistics(textDocumentStatistics: TextDocumentStatisticsProperty) {
        cdkBuilder.textDocumentStatistics(textDocumentStatistics.let(TextDocumentStatisticsProperty.Companion::unwrap))
      }

      /**
       * @param textDocumentStatistics The number of documents indexed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b7e051ee7131e381f77b4eb9168e0908863398d0db51bbc29f67929b6ac47abe")
      override
          fun textDocumentStatistics(textDocumentStatistics: TextDocumentStatisticsProperty.Builder.() -> Unit):
          Unit = textDocumentStatistics(TextDocumentStatisticsProperty(textDocumentStatistics))

      public fun build(): software.amazon.awscdk.services.qbusiness.CfnIndex.IndexStatisticsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnIndex.IndexStatisticsProperty,
    ) : CdkObject(cdkObject),
        IndexStatisticsProperty {
      /**
       * The number of documents indexed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-index-indexstatistics.html#cfn-qbusiness-index-indexstatistics-textdocumentstatistics)
       */
      override fun textDocumentStatistics(): Any? = unwrap(this).getTextDocumentStatistics()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IndexStatisticsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnIndex.IndexStatisticsProperty):
          IndexStatisticsProperty = CdkObjectWrappers.wrap(cdkObject) as? IndexStatisticsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IndexStatisticsProperty):
          software.amazon.awscdk.services.qbusiness.CfnIndex.IndexStatisticsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnIndex.IndexStatisticsProperty
    }
  }

  /**
   * Provides information about text documents in an index.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * TextDocumentStatisticsProperty textDocumentStatisticsProperty =
   * TextDocumentStatisticsProperty.builder()
   * .indexedTextBytes(123)
   * .indexedTextDocumentCount(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-index-textdocumentstatistics.html)
   */
  public interface TextDocumentStatisticsProperty {
    /**
     * The total size, in bytes, of the indexed documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-index-textdocumentstatistics.html#cfn-qbusiness-index-textdocumentstatistics-indexedtextbytes)
     */
    public fun indexedTextBytes(): Number? = unwrap(this).getIndexedTextBytes()

    /**
     * The number of text documents indexed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-index-textdocumentstatistics.html#cfn-qbusiness-index-textdocumentstatistics-indexedtextdocumentcount)
     */
    public fun indexedTextDocumentCount(): Number? = unwrap(this).getIndexedTextDocumentCount()

    /**
     * A builder for [TextDocumentStatisticsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param indexedTextBytes The total size, in bytes, of the indexed documents.
       */
      public fun indexedTextBytes(indexedTextBytes: Number)

      /**
       * @param indexedTextDocumentCount The number of text documents indexed.
       */
      public fun indexedTextDocumentCount(indexedTextDocumentCount: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnIndex.TextDocumentStatisticsProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnIndex.TextDocumentStatisticsProperty.builder()

      /**
       * @param indexedTextBytes The total size, in bytes, of the indexed documents.
       */
      override fun indexedTextBytes(indexedTextBytes: Number) {
        cdkBuilder.indexedTextBytes(indexedTextBytes)
      }

      /**
       * @param indexedTextDocumentCount The number of text documents indexed.
       */
      override fun indexedTextDocumentCount(indexedTextDocumentCount: Number) {
        cdkBuilder.indexedTextDocumentCount(indexedTextDocumentCount)
      }

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnIndex.TextDocumentStatisticsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnIndex.TextDocumentStatisticsProperty,
    ) : CdkObject(cdkObject),
        TextDocumentStatisticsProperty {
      /**
       * The total size, in bytes, of the indexed documents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-index-textdocumentstatistics.html#cfn-qbusiness-index-textdocumentstatistics-indexedtextbytes)
       */
      override fun indexedTextBytes(): Number? = unwrap(this).getIndexedTextBytes()

      /**
       * The number of text documents indexed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-index-textdocumentstatistics.html#cfn-qbusiness-index-textdocumentstatistics-indexedtextdocumentcount)
       */
      override fun indexedTextDocumentCount(): Number? = unwrap(this).getIndexedTextDocumentCount()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TextDocumentStatisticsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnIndex.TextDocumentStatisticsProperty):
          TextDocumentStatisticsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TextDocumentStatisticsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TextDocumentStatisticsProperty):
          software.amazon.awscdk.services.qbusiness.CfnIndex.TextDocumentStatisticsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnIndex.TextDocumentStatisticsProperty
    }
  }
}
