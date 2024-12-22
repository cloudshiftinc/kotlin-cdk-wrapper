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
 * Definition of AWS::QBusiness::DataAccessor Resource Type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.qbusiness.*;
 * AttributeFilterProperty attributeFilterProperty_;
 * CfnDataAccessor cfnDataAccessor = CfnDataAccessor.Builder.create(this, "MyCfnDataAccessor")
 * .actionConfigurations(List.of(ActionConfigurationProperty.builder()
 * .action("action")
 * // the properties below are optional
 * .filterConfiguration(ActionFilterConfigurationProperty.builder()
 * .documentAttributeFilter(AttributeFilterProperty.builder()
 * .andAllFilters(List.of(attributeFilterProperty_))
 * .containsAll(DocumentAttributeProperty.builder()
 * .name("name")
 * .value(DocumentAttributeValueProperty.builder()
 * .dateValue("dateValue")
 * .longValue(123)
 * .stringListValue(List.of("stringListValue"))
 * .stringValue("stringValue")
 * .build())
 * .build())
 * .containsAny(DocumentAttributeProperty.builder()
 * .name("name")
 * .value(DocumentAttributeValueProperty.builder()
 * .dateValue("dateValue")
 * .longValue(123)
 * .stringListValue(List.of("stringListValue"))
 * .stringValue("stringValue")
 * .build())
 * .build())
 * .equalsTo(DocumentAttributeProperty.builder()
 * .name("name")
 * .value(DocumentAttributeValueProperty.builder()
 * .dateValue("dateValue")
 * .longValue(123)
 * .stringListValue(List.of("stringListValue"))
 * .stringValue("stringValue")
 * .build())
 * .build())
 * .greaterThan(DocumentAttributeProperty.builder()
 * .name("name")
 * .value(DocumentAttributeValueProperty.builder()
 * .dateValue("dateValue")
 * .longValue(123)
 * .stringListValue(List.of("stringListValue"))
 * .stringValue("stringValue")
 * .build())
 * .build())
 * .greaterThanOrEquals(DocumentAttributeProperty.builder()
 * .name("name")
 * .value(DocumentAttributeValueProperty.builder()
 * .dateValue("dateValue")
 * .longValue(123)
 * .stringListValue(List.of("stringListValue"))
 * .stringValue("stringValue")
 * .build())
 * .build())
 * .lessThan(DocumentAttributeProperty.builder()
 * .name("name")
 * .value(DocumentAttributeValueProperty.builder()
 * .dateValue("dateValue")
 * .longValue(123)
 * .stringListValue(List.of("stringListValue"))
 * .stringValue("stringValue")
 * .build())
 * .build())
 * .lessThanOrEquals(DocumentAttributeProperty.builder()
 * .name("name")
 * .value(DocumentAttributeValueProperty.builder()
 * .dateValue("dateValue")
 * .longValue(123)
 * .stringListValue(List.of("stringListValue"))
 * .stringValue("stringValue")
 * .build())
 * .build())
 * .notFilter(attributeFilterProperty_)
 * .orAllFilters(List.of(attributeFilterProperty_))
 * .build())
 * .build())
 * .build()))
 * .displayName("displayName")
 * .principal("principal")
 * // the properties below are optional
 * .applicationId("applicationId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html)
 */
public open class CfnDataAccessor(
  cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataAccessor,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataAccessorProps,
  ) :
      this(software.amazon.awscdk.services.qbusiness.CfnDataAccessor(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDataAccessorProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataAccessorProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDataAccessorProps(props)
  )

  /**
   *
   */
  public open fun actionConfigurations(): Any = unwrap(this).getActionConfigurations()

  /**
   *
   */
  public open fun actionConfigurations(`value`: IResolvable) {
    unwrap(this).setActionConfigurations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun actionConfigurations(`value`: List<Any>) {
    unwrap(this).setActionConfigurations(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   *
   */
  public open fun actionConfigurations(vararg `value`: Any): Unit =
      actionConfigurations(`value`.toList())

  /**
   *
   */
  public open fun applicationId(): String? = unwrap(this).getApplicationId()

  /**
   *
   */
  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  /**
   *
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   *
   */
  public open fun attrDataAccessorArn(): String = unwrap(this).getAttrDataAccessorArn()

  /**
   *
   */
  public open fun attrDataAccessorId(): String = unwrap(this).getAttrDataAccessorId()

  /**
   *
   */
  public open fun attrIdcApplicationArn(): String = unwrap(this).getAttrIdcApplicationArn()

  /**
   *
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   *
   */
  public open fun displayName(): String = unwrap(this).getDisplayName()

  /**
   *
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
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
  public open fun principal(): String = unwrap(this).getPrincipal()

  /**
   *
   */
  public open fun principal(`value`: String) {
    unwrap(this).setPrincipal(`value`)
  }

  /**
   *
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   *
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   *
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.qbusiness.CfnDataAccessor].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-actionconfigurations)
     * @param actionConfigurations 
     */
    public fun actionConfigurations(actionConfigurations: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-actionconfigurations)
     * @param actionConfigurations 
     */
    public fun actionConfigurations(actionConfigurations: List<Any>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-actionconfigurations)
     * @param actionConfigurations 
     */
    public fun actionConfigurations(vararg actionConfigurations: Any)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-applicationid)
     * @param applicationId 
     */
    public fun applicationId(applicationId: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-displayname)
     * @param displayName 
     */
    public fun displayName(displayName: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-principal)
     * @param principal 
     */
    public fun principal(principal: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-tags)
     * @param tags 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-tags)
     * @param tags 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.qbusiness.CfnDataAccessor.Builder =
        software.amazon.awscdk.services.qbusiness.CfnDataAccessor.Builder.create(scope, id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-actionconfigurations)
     * @param actionConfigurations 
     */
    override fun actionConfigurations(actionConfigurations: IResolvable) {
      cdkBuilder.actionConfigurations(actionConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-actionconfigurations)
     * @param actionConfigurations 
     */
    override fun actionConfigurations(actionConfigurations: List<Any>) {
      cdkBuilder.actionConfigurations(actionConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-actionconfigurations)
     * @param actionConfigurations 
     */
    override fun actionConfigurations(vararg actionConfigurations: Any): Unit =
        actionConfigurations(actionConfigurations.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-applicationid)
     * @param applicationId 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-displayname)
     * @param displayName 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-principal)
     * @param principal 
     */
    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-tags)
     * @param tags 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-tags)
     * @param tags 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.qbusiness.CfnDataAccessor =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.qbusiness.CfnDataAccessor.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataAccessor {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataAccessor(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataAccessor):
        CfnDataAccessor = CfnDataAccessor(cdkObject)

    internal fun unwrap(wrapped: CfnDataAccessor):
        software.amazon.awscdk.services.qbusiness.CfnDataAccessor = wrapped.cdkObject as
        software.amazon.awscdk.services.qbusiness.CfnDataAccessor
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * AttributeFilterProperty attributeFilterProperty_;
   * ActionConfigurationProperty actionConfigurationProperty = ActionConfigurationProperty.builder()
   * .action("action")
   * // the properties below are optional
   * .filterConfiguration(ActionFilterConfigurationProperty.builder()
   * .documentAttributeFilter(AttributeFilterProperty.builder()
   * .andAllFilters(List.of(attributeFilterProperty_))
   * .containsAll(DocumentAttributeProperty.builder()
   * .name("name")
   * .value(DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build())
   * .build())
   * .containsAny(DocumentAttributeProperty.builder()
   * .name("name")
   * .value(DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build())
   * .build())
   * .equalsTo(DocumentAttributeProperty.builder()
   * .name("name")
   * .value(DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build())
   * .build())
   * .greaterThan(DocumentAttributeProperty.builder()
   * .name("name")
   * .value(DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build())
   * .build())
   * .greaterThanOrEquals(DocumentAttributeProperty.builder()
   * .name("name")
   * .value(DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build())
   * .build())
   * .lessThan(DocumentAttributeProperty.builder()
   * .name("name")
   * .value(DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build())
   * .build())
   * .lessThanOrEquals(DocumentAttributeProperty.builder()
   * .name("name")
   * .value(DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build())
   * .build())
   * .notFilter(attributeFilterProperty_)
   * .orAllFilters(List.of(attributeFilterProperty_))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-actionconfiguration.html)
   */
  public interface ActionConfigurationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-actionconfiguration.html#cfn-qbusiness-dataaccessor-actionconfiguration-action)
     */
    public fun action(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-actionconfiguration.html#cfn-qbusiness-dataaccessor-actionconfiguration-filterconfiguration)
     */
    public fun filterConfiguration(): Any? = unwrap(this).getFilterConfiguration()

    /**
     * A builder for [ActionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action the value to be set. 
       */
      public fun action(action: String)

      /**
       * @param filterConfiguration the value to be set.
       */
      public fun filterConfiguration(filterConfiguration: IResolvable)

      /**
       * @param filterConfiguration the value to be set.
       */
      public fun filterConfiguration(filterConfiguration: ActionFilterConfigurationProperty)

      /**
       * @param filterConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1de36f018193aa57297368528723752d8df748076341a419fdc2c3b28c999e1")
      public
          fun filterConfiguration(filterConfiguration: ActionFilterConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.ActionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.ActionConfigurationProperty.builder()

      /**
       * @param action the value to be set. 
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      /**
       * @param filterConfiguration the value to be set.
       */
      override fun filterConfiguration(filterConfiguration: IResolvable) {
        cdkBuilder.filterConfiguration(filterConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filterConfiguration the value to be set.
       */
      override fun filterConfiguration(filterConfiguration: ActionFilterConfigurationProperty) {
        cdkBuilder.filterConfiguration(filterConfiguration.let(ActionFilterConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param filterConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1de36f018193aa57297368528723752d8df748076341a419fdc2c3b28c999e1")
      override
          fun filterConfiguration(filterConfiguration: ActionFilterConfigurationProperty.Builder.() -> Unit):
          Unit = filterConfiguration(ActionFilterConfigurationProperty(filterConfiguration))

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.ActionConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataAccessor.ActionConfigurationProperty,
    ) : CdkObject(cdkObject),
        ActionConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-actionconfiguration.html#cfn-qbusiness-dataaccessor-actionconfiguration-action)
       */
      override fun action(): String = unwrap(this).getAction()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-actionconfiguration.html#cfn-qbusiness-dataaccessor-actionconfiguration-filterconfiguration)
       */
      override fun filterConfiguration(): Any? = unwrap(this).getFilterConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataAccessor.ActionConfigurationProperty):
          ActionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ActionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.ActionConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.ActionConfigurationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * AttributeFilterProperty attributeFilterProperty_;
   * ActionFilterConfigurationProperty actionFilterConfigurationProperty =
   * ActionFilterConfigurationProperty.builder()
   * .documentAttributeFilter(AttributeFilterProperty.builder()
   * .andAllFilters(List.of(attributeFilterProperty_))
   * .containsAll(DocumentAttributeProperty.builder()
   * .name("name")
   * .value(DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build())
   * .build())
   * .containsAny(DocumentAttributeProperty.builder()
   * .name("name")
   * .value(DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build())
   * .build())
   * .equalsTo(DocumentAttributeProperty.builder()
   * .name("name")
   * .value(DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build())
   * .build())
   * .greaterThan(DocumentAttributeProperty.builder()
   * .name("name")
   * .value(DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build())
   * .build())
   * .greaterThanOrEquals(DocumentAttributeProperty.builder()
   * .name("name")
   * .value(DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build())
   * .build())
   * .lessThan(DocumentAttributeProperty.builder()
   * .name("name")
   * .value(DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build())
   * .build())
   * .lessThanOrEquals(DocumentAttributeProperty.builder()
   * .name("name")
   * .value(DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build())
   * .build())
   * .notFilter(attributeFilterProperty_)
   * .orAllFilters(List.of(attributeFilterProperty_))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-actionfilterconfiguration.html)
   */
  public interface ActionFilterConfigurationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-actionfilterconfiguration.html#cfn-qbusiness-dataaccessor-actionfilterconfiguration-documentattributefilter)
     */
    public fun documentAttributeFilter(): Any

    /**
     * A builder for [ActionFilterConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param documentAttributeFilter the value to be set. 
       */
      public fun documentAttributeFilter(documentAttributeFilter: IResolvable)

      /**
       * @param documentAttributeFilter the value to be set. 
       */
      public fun documentAttributeFilter(documentAttributeFilter: AttributeFilterProperty)

      /**
       * @param documentAttributeFilter the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a87cf628ab48c50547f91d1699efa2f7f60381765c17ef77dd566f7bd9909580")
      public
          fun documentAttributeFilter(documentAttributeFilter: AttributeFilterProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.ActionFilterConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.ActionFilterConfigurationProperty.builder()

      /**
       * @param documentAttributeFilter the value to be set. 
       */
      override fun documentAttributeFilter(documentAttributeFilter: IResolvable) {
        cdkBuilder.documentAttributeFilter(documentAttributeFilter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param documentAttributeFilter the value to be set. 
       */
      override fun documentAttributeFilter(documentAttributeFilter: AttributeFilterProperty) {
        cdkBuilder.documentAttributeFilter(documentAttributeFilter.let(AttributeFilterProperty.Companion::unwrap))
      }

      /**
       * @param documentAttributeFilter the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a87cf628ab48c50547f91d1699efa2f7f60381765c17ef77dd566f7bd9909580")
      override
          fun documentAttributeFilter(documentAttributeFilter: AttributeFilterProperty.Builder.() -> Unit):
          Unit = documentAttributeFilter(AttributeFilterProperty(documentAttributeFilter))

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.ActionFilterConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataAccessor.ActionFilterConfigurationProperty,
    ) : CdkObject(cdkObject),
        ActionFilterConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-actionfilterconfiguration.html#cfn-qbusiness-dataaccessor-actionfilterconfiguration-documentattributefilter)
       */
      override fun documentAttributeFilter(): Any = unwrap(this).getDocumentAttributeFilter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ActionFilterConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataAccessor.ActionFilterConfigurationProperty):
          ActionFilterConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ActionFilterConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionFilterConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.ActionFilterConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.ActionFilterConfigurationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * AttributeFilterProperty attributeFilterProperty_;
   * AttributeFilterProperty attributeFilterProperty = AttributeFilterProperty.builder()
   * .andAllFilters(List.of(attributeFilterProperty_))
   * .containsAll(DocumentAttributeProperty.builder()
   * .name("name")
   * .value(DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build())
   * .build())
   * .containsAny(DocumentAttributeProperty.builder()
   * .name("name")
   * .value(DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build())
   * .build())
   * .equalsTo(DocumentAttributeProperty.builder()
   * .name("name")
   * .value(DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build())
   * .build())
   * .greaterThan(DocumentAttributeProperty.builder()
   * .name("name")
   * .value(DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build())
   * .build())
   * .greaterThanOrEquals(DocumentAttributeProperty.builder()
   * .name("name")
   * .value(DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build())
   * .build())
   * .lessThan(DocumentAttributeProperty.builder()
   * .name("name")
   * .value(DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build())
   * .build())
   * .lessThanOrEquals(DocumentAttributeProperty.builder()
   * .name("name")
   * .value(DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build())
   * .build())
   * .notFilter(attributeFilterProperty_)
   * .orAllFilters(List.of(attributeFilterProperty_))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html)
   */
  public interface AttributeFilterProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-andallfilters)
     */
    public fun andAllFilters(): Any? = unwrap(this).getAndAllFilters()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-containsall)
     */
    public fun containsAll(): Any? = unwrap(this).getContainsAll()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-containsany)
     */
    public fun containsAny(): Any? = unwrap(this).getContainsAny()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-equalsto)
     */
    public fun equalsTo(): Any? = unwrap(this).getEqualsTo()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-greaterthan)
     */
    public fun greaterThan(): Any? = unwrap(this).getGreaterThan()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-greaterthanorequals)
     */
    public fun greaterThanOrEquals(): Any? = unwrap(this).getGreaterThanOrEquals()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-lessthan)
     */
    public fun lessThan(): Any? = unwrap(this).getLessThan()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-lessthanorequals)
     */
    public fun lessThanOrEquals(): Any? = unwrap(this).getLessThanOrEquals()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-notfilter)
     */
    public fun notFilter(): Any? = unwrap(this).getNotFilter()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-orallfilters)
     */
    public fun orAllFilters(): Any? = unwrap(this).getOrAllFilters()

    /**
     * A builder for [AttributeFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param andAllFilters the value to be set.
       */
      public fun andAllFilters(andAllFilters: IResolvable)

      /**
       * @param andAllFilters the value to be set.
       */
      public fun andAllFilters(andAllFilters: List<Any>)

      /**
       * @param andAllFilters the value to be set.
       */
      public fun andAllFilters(vararg andAllFilters: Any)

      /**
       * @param containsAll the value to be set.
       */
      public fun containsAll(containsAll: IResolvable)

      /**
       * @param containsAll the value to be set.
       */
      public fun containsAll(containsAll: DocumentAttributeProperty)

      /**
       * @param containsAll the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d9260be04b54e9036755e9c4b11e43f62f17755ea72ff0f53f6ea96261a7166")
      public fun containsAll(containsAll: DocumentAttributeProperty.Builder.() -> Unit)

      /**
       * @param containsAny the value to be set.
       */
      public fun containsAny(containsAny: IResolvable)

      /**
       * @param containsAny the value to be set.
       */
      public fun containsAny(containsAny: DocumentAttributeProperty)

      /**
       * @param containsAny the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ff754cba76ef68795c4a3cd777f3f62d57bf64d50fdeb83b8139621283be99a")
      public fun containsAny(containsAny: DocumentAttributeProperty.Builder.() -> Unit)

      /**
       * @param equalsTo the value to be set.
       */
      public fun equalsTo(equalsTo: IResolvable)

      /**
       * @param equalsTo the value to be set.
       */
      public fun equalsTo(equalsTo: DocumentAttributeProperty)

      /**
       * @param equalsTo the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("90d28bb68135f82a607f7c795de2778121ad96ef53499c9b92b0b0fc028e60fd")
      public fun equalsTo(equalsTo: DocumentAttributeProperty.Builder.() -> Unit)

      /**
       * @param greaterThan the value to be set.
       */
      public fun greaterThan(greaterThan: IResolvable)

      /**
       * @param greaterThan the value to be set.
       */
      public fun greaterThan(greaterThan: DocumentAttributeProperty)

      /**
       * @param greaterThan the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44fb4963dc9fea6f4f3a727ade3efa57c06ab1255d63a6da69a4d67ee3147751")
      public fun greaterThan(greaterThan: DocumentAttributeProperty.Builder.() -> Unit)

      /**
       * @param greaterThanOrEquals the value to be set.
       */
      public fun greaterThanOrEquals(greaterThanOrEquals: IResolvable)

      /**
       * @param greaterThanOrEquals the value to be set.
       */
      public fun greaterThanOrEquals(greaterThanOrEquals: DocumentAttributeProperty)

      /**
       * @param greaterThanOrEquals the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("36cf464fb9b16f38da4a828583a085cdcf4b152cd19543f2c98489c45256c2fd")
      public
          fun greaterThanOrEquals(greaterThanOrEquals: DocumentAttributeProperty.Builder.() -> Unit)

      /**
       * @param lessThan the value to be set.
       */
      public fun lessThan(lessThan: IResolvable)

      /**
       * @param lessThan the value to be set.
       */
      public fun lessThan(lessThan: DocumentAttributeProperty)

      /**
       * @param lessThan the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("746bfe8af35d9f96cef5ae9aabf0dbffe017e517ca4706ae01709f554181ad42")
      public fun lessThan(lessThan: DocumentAttributeProperty.Builder.() -> Unit)

      /**
       * @param lessThanOrEquals the value to be set.
       */
      public fun lessThanOrEquals(lessThanOrEquals: IResolvable)

      /**
       * @param lessThanOrEquals the value to be set.
       */
      public fun lessThanOrEquals(lessThanOrEquals: DocumentAttributeProperty)

      /**
       * @param lessThanOrEquals the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4688358f9e3f64cd172a6661380405f99780cc0735fabec0f5f9f85a524bf64")
      public fun lessThanOrEquals(lessThanOrEquals: DocumentAttributeProperty.Builder.() -> Unit)

      /**
       * @param notFilter the value to be set.
       */
      public fun notFilter(notFilter: IResolvable)

      /**
       * @param notFilter the value to be set.
       */
      public fun notFilter(notFilter: AttributeFilterProperty)

      /**
       * @param notFilter the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bdd4a4c561a40b55f43909e763644a5e28f941fbec681cf30f7a1f7e90bb69e6")
      public fun notFilter(notFilter: Builder.() -> Unit)

      /**
       * @param orAllFilters the value to be set.
       */
      public fun orAllFilters(orAllFilters: IResolvable)

      /**
       * @param orAllFilters the value to be set.
       */
      public fun orAllFilters(orAllFilters: List<Any>)

      /**
       * @param orAllFilters the value to be set.
       */
      public fun orAllFilters(vararg orAllFilters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.AttributeFilterProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.AttributeFilterProperty.builder()

      /**
       * @param andAllFilters the value to be set.
       */
      override fun andAllFilters(andAllFilters: IResolvable) {
        cdkBuilder.andAllFilters(andAllFilters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param andAllFilters the value to be set.
       */
      override fun andAllFilters(andAllFilters: List<Any>) {
        cdkBuilder.andAllFilters(andAllFilters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param andAllFilters the value to be set.
       */
      override fun andAllFilters(vararg andAllFilters: Any): Unit =
          andAllFilters(andAllFilters.toList())

      /**
       * @param containsAll the value to be set.
       */
      override fun containsAll(containsAll: IResolvable) {
        cdkBuilder.containsAll(containsAll.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param containsAll the value to be set.
       */
      override fun containsAll(containsAll: DocumentAttributeProperty) {
        cdkBuilder.containsAll(containsAll.let(DocumentAttributeProperty.Companion::unwrap))
      }

      /**
       * @param containsAll the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d9260be04b54e9036755e9c4b11e43f62f17755ea72ff0f53f6ea96261a7166")
      override fun containsAll(containsAll: DocumentAttributeProperty.Builder.() -> Unit): Unit =
          containsAll(DocumentAttributeProperty(containsAll))

      /**
       * @param containsAny the value to be set.
       */
      override fun containsAny(containsAny: IResolvable) {
        cdkBuilder.containsAny(containsAny.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param containsAny the value to be set.
       */
      override fun containsAny(containsAny: DocumentAttributeProperty) {
        cdkBuilder.containsAny(containsAny.let(DocumentAttributeProperty.Companion::unwrap))
      }

      /**
       * @param containsAny the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ff754cba76ef68795c4a3cd777f3f62d57bf64d50fdeb83b8139621283be99a")
      override fun containsAny(containsAny: DocumentAttributeProperty.Builder.() -> Unit): Unit =
          containsAny(DocumentAttributeProperty(containsAny))

      /**
       * @param equalsTo the value to be set.
       */
      override fun equalsTo(equalsTo: IResolvable) {
        cdkBuilder.equalsTo(equalsTo.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param equalsTo the value to be set.
       */
      override fun equalsTo(equalsTo: DocumentAttributeProperty) {
        cdkBuilder.equalsTo(equalsTo.let(DocumentAttributeProperty.Companion::unwrap))
      }

      /**
       * @param equalsTo the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("90d28bb68135f82a607f7c795de2778121ad96ef53499c9b92b0b0fc028e60fd")
      override fun equalsTo(equalsTo: DocumentAttributeProperty.Builder.() -> Unit): Unit =
          equalsTo(DocumentAttributeProperty(equalsTo))

      /**
       * @param greaterThan the value to be set.
       */
      override fun greaterThan(greaterThan: IResolvable) {
        cdkBuilder.greaterThan(greaterThan.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param greaterThan the value to be set.
       */
      override fun greaterThan(greaterThan: DocumentAttributeProperty) {
        cdkBuilder.greaterThan(greaterThan.let(DocumentAttributeProperty.Companion::unwrap))
      }

      /**
       * @param greaterThan the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44fb4963dc9fea6f4f3a727ade3efa57c06ab1255d63a6da69a4d67ee3147751")
      override fun greaterThan(greaterThan: DocumentAttributeProperty.Builder.() -> Unit): Unit =
          greaterThan(DocumentAttributeProperty(greaterThan))

      /**
       * @param greaterThanOrEquals the value to be set.
       */
      override fun greaterThanOrEquals(greaterThanOrEquals: IResolvable) {
        cdkBuilder.greaterThanOrEquals(greaterThanOrEquals.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param greaterThanOrEquals the value to be set.
       */
      override fun greaterThanOrEquals(greaterThanOrEquals: DocumentAttributeProperty) {
        cdkBuilder.greaterThanOrEquals(greaterThanOrEquals.let(DocumentAttributeProperty.Companion::unwrap))
      }

      /**
       * @param greaterThanOrEquals the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("36cf464fb9b16f38da4a828583a085cdcf4b152cd19543f2c98489c45256c2fd")
      override
          fun greaterThanOrEquals(greaterThanOrEquals: DocumentAttributeProperty.Builder.() -> Unit):
          Unit = greaterThanOrEquals(DocumentAttributeProperty(greaterThanOrEquals))

      /**
       * @param lessThan the value to be set.
       */
      override fun lessThan(lessThan: IResolvable) {
        cdkBuilder.lessThan(lessThan.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lessThan the value to be set.
       */
      override fun lessThan(lessThan: DocumentAttributeProperty) {
        cdkBuilder.lessThan(lessThan.let(DocumentAttributeProperty.Companion::unwrap))
      }

      /**
       * @param lessThan the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("746bfe8af35d9f96cef5ae9aabf0dbffe017e517ca4706ae01709f554181ad42")
      override fun lessThan(lessThan: DocumentAttributeProperty.Builder.() -> Unit): Unit =
          lessThan(DocumentAttributeProperty(lessThan))

      /**
       * @param lessThanOrEquals the value to be set.
       */
      override fun lessThanOrEquals(lessThanOrEquals: IResolvable) {
        cdkBuilder.lessThanOrEquals(lessThanOrEquals.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lessThanOrEquals the value to be set.
       */
      override fun lessThanOrEquals(lessThanOrEquals: DocumentAttributeProperty) {
        cdkBuilder.lessThanOrEquals(lessThanOrEquals.let(DocumentAttributeProperty.Companion::unwrap))
      }

      /**
       * @param lessThanOrEquals the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4688358f9e3f64cd172a6661380405f99780cc0735fabec0f5f9f85a524bf64")
      override fun lessThanOrEquals(lessThanOrEquals: DocumentAttributeProperty.Builder.() -> Unit):
          Unit = lessThanOrEquals(DocumentAttributeProperty(lessThanOrEquals))

      /**
       * @param notFilter the value to be set.
       */
      override fun notFilter(notFilter: IResolvable) {
        cdkBuilder.notFilter(notFilter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param notFilter the value to be set.
       */
      override fun notFilter(notFilter: AttributeFilterProperty) {
        cdkBuilder.notFilter(notFilter.let(AttributeFilterProperty.Companion::unwrap))
      }

      /**
       * @param notFilter the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bdd4a4c561a40b55f43909e763644a5e28f941fbec681cf30f7a1f7e90bb69e6")
      override fun notFilter(notFilter: Builder.() -> Unit): Unit =
          notFilter(AttributeFilterProperty(notFilter))

      /**
       * @param orAllFilters the value to be set.
       */
      override fun orAllFilters(orAllFilters: IResolvable) {
        cdkBuilder.orAllFilters(orAllFilters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param orAllFilters the value to be set.
       */
      override fun orAllFilters(orAllFilters: List<Any>) {
        cdkBuilder.orAllFilters(orAllFilters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param orAllFilters the value to be set.
       */
      override fun orAllFilters(vararg orAllFilters: Any): Unit =
          orAllFilters(orAllFilters.toList())

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.AttributeFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataAccessor.AttributeFilterProperty,
    ) : CdkObject(cdkObject),
        AttributeFilterProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-andallfilters)
       */
      override fun andAllFilters(): Any? = unwrap(this).getAndAllFilters()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-containsall)
       */
      override fun containsAll(): Any? = unwrap(this).getContainsAll()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-containsany)
       */
      override fun containsAny(): Any? = unwrap(this).getContainsAny()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-equalsto)
       */
      override fun equalsTo(): Any? = unwrap(this).getEqualsTo()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-greaterthan)
       */
      override fun greaterThan(): Any? = unwrap(this).getGreaterThan()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-greaterthanorequals)
       */
      override fun greaterThanOrEquals(): Any? = unwrap(this).getGreaterThanOrEquals()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-lessthan)
       */
      override fun lessThan(): Any? = unwrap(this).getLessThan()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-lessthanorequals)
       */
      override fun lessThanOrEquals(): Any? = unwrap(this).getLessThanOrEquals()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-notfilter)
       */
      override fun notFilter(): Any? = unwrap(this).getNotFilter()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-orallfilters)
       */
      override fun orAllFilters(): Any? = unwrap(this).getOrAllFilters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataAccessor.AttributeFilterProperty):
          AttributeFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? AttributeFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeFilterProperty):
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.AttributeFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.AttributeFilterProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * DocumentAttributeProperty documentAttributeProperty = DocumentAttributeProperty.builder()
   * .name("name")
   * .value(DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-documentattribute.html)
   */
  public interface DocumentAttributeProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-documentattribute.html#cfn-qbusiness-dataaccessor-documentattribute-name)
     */
    public fun name(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-documentattribute.html#cfn-qbusiness-dataaccessor-documentattribute-value)
     */
    public fun `value`(): Any

    /**
     * A builder for [DocumentAttributeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name the value to be set. 
       */
      public fun name(name: String)

      /**
       * @param value the value to be set. 
       */
      public fun `value`(`value`: IResolvable)

      /**
       * @param value the value to be set. 
       */
      public fun `value`(`value`: DocumentAttributeValueProperty)

      /**
       * @param value the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d92813b5a9848d2a8590ea6ee47c50981707e7265e054f0adb7074e243049b60")
      public fun `value`(`value`: DocumentAttributeValueProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DocumentAttributeProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DocumentAttributeProperty.builder()

      /**
       * @param name the value to be set. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value the value to be set. 
       */
      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param value the value to be set. 
       */
      override fun `value`(`value`: DocumentAttributeValueProperty) {
        cdkBuilder.`value`(`value`.let(DocumentAttributeValueProperty.Companion::unwrap))
      }

      /**
       * @param value the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d92813b5a9848d2a8590ea6ee47c50981707e7265e054f0adb7074e243049b60")
      override fun `value`(`value`: DocumentAttributeValueProperty.Builder.() -> Unit): Unit =
          `value`(DocumentAttributeValueProperty(`value`))

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DocumentAttributeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DocumentAttributeProperty,
    ) : CdkObject(cdkObject),
        DocumentAttributeProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-documentattribute.html#cfn-qbusiness-dataaccessor-documentattribute-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-documentattribute.html#cfn-qbusiness-dataaccessor-documentattribute-value)
       */
      override fun `value`(): Any = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DocumentAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DocumentAttributeProperty):
          DocumentAttributeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DocumentAttributeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentAttributeProperty):
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DocumentAttributeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DocumentAttributeProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * DocumentAttributeValueProperty documentAttributeValueProperty =
   * DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-documentattributevalue.html)
   */
  public interface DocumentAttributeValueProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-documentattributevalue.html#cfn-qbusiness-dataaccessor-documentattributevalue-datevalue)
     */
    public fun dateValue(): String? = unwrap(this).getDateValue()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-documentattributevalue.html#cfn-qbusiness-dataaccessor-documentattributevalue-longvalue)
     */
    public fun longValue(): Number? = unwrap(this).getLongValue()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-documentattributevalue.html#cfn-qbusiness-dataaccessor-documentattributevalue-stringlistvalue)
     */
    public fun stringListValue(): List<String> = unwrap(this).getStringListValue() ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-documentattributevalue.html#cfn-qbusiness-dataaccessor-documentattributevalue-stringvalue)
     */
    public fun stringValue(): String? = unwrap(this).getStringValue()

    /**
     * A builder for [DocumentAttributeValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dateValue the value to be set.
       */
      public fun dateValue(dateValue: String)

      /**
       * @param longValue the value to be set.
       */
      public fun longValue(longValue: Number)

      /**
       * @param stringListValue the value to be set.
       */
      public fun stringListValue(stringListValue: List<String>)

      /**
       * @param stringListValue the value to be set.
       */
      public fun stringListValue(vararg stringListValue: String)

      /**
       * @param stringValue the value to be set.
       */
      public fun stringValue(stringValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DocumentAttributeValueProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DocumentAttributeValueProperty.builder()

      /**
       * @param dateValue the value to be set.
       */
      override fun dateValue(dateValue: String) {
        cdkBuilder.dateValue(dateValue)
      }

      /**
       * @param longValue the value to be set.
       */
      override fun longValue(longValue: Number) {
        cdkBuilder.longValue(longValue)
      }

      /**
       * @param stringListValue the value to be set.
       */
      override fun stringListValue(stringListValue: List<String>) {
        cdkBuilder.stringListValue(stringListValue)
      }

      /**
       * @param stringListValue the value to be set.
       */
      override fun stringListValue(vararg stringListValue: String): Unit =
          stringListValue(stringListValue.toList())

      /**
       * @param stringValue the value to be set.
       */
      override fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
      }

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DocumentAttributeValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DocumentAttributeValueProperty,
    ) : CdkObject(cdkObject),
        DocumentAttributeValueProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-documentattributevalue.html#cfn-qbusiness-dataaccessor-documentattributevalue-datevalue)
       */
      override fun dateValue(): String? = unwrap(this).getDateValue()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-documentattributevalue.html#cfn-qbusiness-dataaccessor-documentattributevalue-longvalue)
       */
      override fun longValue(): Number? = unwrap(this).getLongValue()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-documentattributevalue.html#cfn-qbusiness-dataaccessor-documentattributevalue-stringlistvalue)
       */
      override fun stringListValue(): List<String> = unwrap(this).getStringListValue() ?:
          emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-documentattributevalue.html#cfn-qbusiness-dataaccessor-documentattributevalue-stringvalue)
       */
      override fun stringValue(): String? = unwrap(this).getStringValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DocumentAttributeValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DocumentAttributeValueProperty):
          DocumentAttributeValueProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DocumentAttributeValueProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentAttributeValueProperty):
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DocumentAttributeValueProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DocumentAttributeValueProperty
    }
  }
}
