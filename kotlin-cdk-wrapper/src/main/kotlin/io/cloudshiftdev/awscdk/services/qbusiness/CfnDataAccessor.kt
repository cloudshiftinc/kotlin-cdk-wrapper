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
 * Creates a new data accessor for an ISV to access data from a Amazon Q Business application.
 *
 * The data accessor is an entity that represents the ISV's access to the Amazon Q Business
 * application's data. It includes the IAM role ARN for the ISV, a friendly name, and a set of action
 * configurations that define the specific actions the ISV is allowed to perform and any associated
 * data filters. When the data accessor is created, an IAM Identity Center application is also created
 * to manage the ISV's identity and authentication for accessing the Amazon Q Business application.
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
 * .applicationId("applicationId")
 * .displayName("displayName")
 * .principal("principal")
 * // the properties below are optional
 * .authenticationDetail(DataAccessorAuthenticationDetailProperty.builder()
 * .authenticationType("authenticationType")
 * // the properties below are optional
 * .authenticationConfiguration(DataAccessorAuthenticationConfigurationProperty.builder()
 * .idcTrustedTokenIssuerConfiguration(DataAccessorIdcTrustedTokenIssuerConfigurationProperty.builder()
 * .idcTrustedTokenIssuerArn("idcTrustedTokenIssuerArn")
 * .build())
 * .build())
 * .externalIds(List.of("externalIds"))
 * .build())
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
   * A list of action configurations specifying the allowed actions and any associated filters.
   */
  public open fun actionConfigurations(): Any = unwrap(this).getActionConfigurations()

  /**
   * A list of action configurations specifying the allowed actions and any associated filters.
   */
  public open fun actionConfigurations(`value`: IResolvable) {
    unwrap(this).setActionConfigurations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of action configurations specifying the allowed actions and any associated filters.
   */
  public open fun actionConfigurations(`value`: List<Any>) {
    unwrap(this).setActionConfigurations(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of action configurations specifying the allowed actions and any associated filters.
   */
  public open fun actionConfigurations(vararg `value`: Any): Unit =
      actionConfigurations(`value`.toList())

  /**
   * The unique identifier of the Amazon Q Business application.
   */
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  /**
   * The unique identifier of the Amazon Q Business application.
   */
  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  /**
   * The timestamp when the data accessor was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The Amazon Resource Name (ARN) of the data accessor.
   */
  public open fun attrDataAccessorArn(): String = unwrap(this).getAttrDataAccessorArn()

  /**
   * The unique identifier of the data accessor.
   */
  public open fun attrDataAccessorId(): String = unwrap(this).getAttrDataAccessorId()

  /**
   * The Amazon Resource Name (ARN) of the associated IAM Identity Center application.
   */
  public open fun attrIdcApplicationArn(): String = unwrap(this).getAttrIdcApplicationArn()

  /**
   * The timestamp when the data accessor was last updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * The authentication configuration details for the data accessor.
   */
  public open fun authenticationDetail(): Any? = unwrap(this).getAuthenticationDetail()

  /**
   * The authentication configuration details for the data accessor.
   */
  public open fun authenticationDetail(`value`: IResolvable) {
    unwrap(this).setAuthenticationDetail(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The authentication configuration details for the data accessor.
   */
  public open fun authenticationDetail(`value`: DataAccessorAuthenticationDetailProperty) {
    unwrap(this).setAuthenticationDetail(`value`.let(DataAccessorAuthenticationDetailProperty.Companion::unwrap))
  }

  /**
   * The authentication configuration details for the data accessor.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("97b7e1ef64c1dd3aa5afea9fc44c72a8991de88ec2c4939d824303817bca9c8b")
  public open
      fun authenticationDetail(`value`: DataAccessorAuthenticationDetailProperty.Builder.() -> Unit):
      Unit = authenticationDetail(DataAccessorAuthenticationDetailProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The friendly name of the data accessor.
   */
  public open fun displayName(): String = unwrap(this).getDisplayName()

  /**
   * The friendly name of the data accessor.
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
   * The Amazon Resource Name (ARN) of the IAM role for the ISV associated with this data accessor.
   */
  public open fun principal(): String = unwrap(this).getPrincipal()

  /**
   * The Amazon Resource Name (ARN) of the IAM role for the ISV associated with this data accessor.
   */
  public open fun principal(`value`: String) {
    unwrap(this).setPrincipal(`value`)
  }

  /**
   * The tags to associate with the data accessor.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags to associate with the data accessor.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags to associate with the data accessor.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.qbusiness.CfnDataAccessor].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of action configurations specifying the allowed actions and any associated filters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-actionconfigurations)
     * @param actionConfigurations A list of action configurations specifying the allowed actions
     * and any associated filters. 
     */
    public fun actionConfigurations(actionConfigurations: IResolvable)

    /**
     * A list of action configurations specifying the allowed actions and any associated filters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-actionconfigurations)
     * @param actionConfigurations A list of action configurations specifying the allowed actions
     * and any associated filters. 
     */
    public fun actionConfigurations(actionConfigurations: List<Any>)

    /**
     * A list of action configurations specifying the allowed actions and any associated filters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-actionconfigurations)
     * @param actionConfigurations A list of action configurations specifying the allowed actions
     * and any associated filters. 
     */
    public fun actionConfigurations(vararg actionConfigurations: Any)

    /**
     * The unique identifier of the Amazon Q Business application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-applicationid)
     * @param applicationId The unique identifier of the Amazon Q Business application. 
     */
    public fun applicationId(applicationId: String)

    /**
     * The authentication configuration details for the data accessor.
     *
     * This specifies how the ISV authenticates when accessing data through this data accessor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-authenticationdetail)
     * @param authenticationDetail The authentication configuration details for the data accessor. 
     */
    public fun authenticationDetail(authenticationDetail: IResolvable)

    /**
     * The authentication configuration details for the data accessor.
     *
     * This specifies how the ISV authenticates when accessing data through this data accessor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-authenticationdetail)
     * @param authenticationDetail The authentication configuration details for the data accessor. 
     */
    public fun authenticationDetail(authenticationDetail: DataAccessorAuthenticationDetailProperty)

    /**
     * The authentication configuration details for the data accessor.
     *
     * This specifies how the ISV authenticates when accessing data through this data accessor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-authenticationdetail)
     * @param authenticationDetail The authentication configuration details for the data accessor. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dad361698820bf19d4c1be196e0674ff674263bf399e72932056df57f02d95ad")
    public
        fun authenticationDetail(authenticationDetail: DataAccessorAuthenticationDetailProperty.Builder.() -> Unit)

    /**
     * The friendly name of the data accessor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-displayname)
     * @param displayName The friendly name of the data accessor. 
     */
    public fun displayName(displayName: String)

    /**
     * The Amazon Resource Name (ARN) of the IAM role for the ISV associated with this data
     * accessor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-principal)
     * @param principal The Amazon Resource Name (ARN) of the IAM role for the ISV associated with
     * this data accessor. 
     */
    public fun principal(principal: String)

    /**
     * The tags to associate with the data accessor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-tags)
     * @param tags The tags to associate with the data accessor. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to associate with the data accessor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-tags)
     * @param tags The tags to associate with the data accessor. 
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
     * A list of action configurations specifying the allowed actions and any associated filters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-actionconfigurations)
     * @param actionConfigurations A list of action configurations specifying the allowed actions
     * and any associated filters. 
     */
    override fun actionConfigurations(actionConfigurations: IResolvable) {
      cdkBuilder.actionConfigurations(actionConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of action configurations specifying the allowed actions and any associated filters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-actionconfigurations)
     * @param actionConfigurations A list of action configurations specifying the allowed actions
     * and any associated filters. 
     */
    override fun actionConfigurations(actionConfigurations: List<Any>) {
      cdkBuilder.actionConfigurations(actionConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of action configurations specifying the allowed actions and any associated filters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-actionconfigurations)
     * @param actionConfigurations A list of action configurations specifying the allowed actions
     * and any associated filters. 
     */
    override fun actionConfigurations(vararg actionConfigurations: Any): Unit =
        actionConfigurations(actionConfigurations.toList())

    /**
     * The unique identifier of the Amazon Q Business application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-applicationid)
     * @param applicationId The unique identifier of the Amazon Q Business application. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * The authentication configuration details for the data accessor.
     *
     * This specifies how the ISV authenticates when accessing data through this data accessor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-authenticationdetail)
     * @param authenticationDetail The authentication configuration details for the data accessor. 
     */
    override fun authenticationDetail(authenticationDetail: IResolvable) {
      cdkBuilder.authenticationDetail(authenticationDetail.let(IResolvable.Companion::unwrap))
    }

    /**
     * The authentication configuration details for the data accessor.
     *
     * This specifies how the ISV authenticates when accessing data through this data accessor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-authenticationdetail)
     * @param authenticationDetail The authentication configuration details for the data accessor. 
     */
    override
        fun authenticationDetail(authenticationDetail: DataAccessorAuthenticationDetailProperty) {
      cdkBuilder.authenticationDetail(authenticationDetail.let(DataAccessorAuthenticationDetailProperty.Companion::unwrap))
    }

    /**
     * The authentication configuration details for the data accessor.
     *
     * This specifies how the ISV authenticates when accessing data through this data accessor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-authenticationdetail)
     * @param authenticationDetail The authentication configuration details for the data accessor. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dad361698820bf19d4c1be196e0674ff674263bf399e72932056df57f02d95ad")
    override
        fun authenticationDetail(authenticationDetail: DataAccessorAuthenticationDetailProperty.Builder.() -> Unit):
        Unit = authenticationDetail(DataAccessorAuthenticationDetailProperty(authenticationDetail))

    /**
     * The friendly name of the data accessor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-displayname)
     * @param displayName The friendly name of the data accessor. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role for the ISV associated with this data
     * accessor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-principal)
     * @param principal The Amazon Resource Name (ARN) of the IAM role for the ISV associated with
     * this data accessor. 
     */
    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    /**
     * The tags to associate with the data accessor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-tags)
     * @param tags The tags to associate with the data accessor. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags to associate with the data accessor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-tags)
     * @param tags The tags to associate with the data accessor. 
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
   * Specifies an allowed action and its associated filter configuration.
   *
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
     * The Amazon Q Business action that is allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-actionconfiguration.html#cfn-qbusiness-dataaccessor-actionconfiguration-action)
     */
    public fun action(): String

    /**
     * The filter configuration for the action, if any.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-actionconfiguration.html#cfn-qbusiness-dataaccessor-actionconfiguration-filterconfiguration)
     */
    public fun filterConfiguration(): Any? = unwrap(this).getFilterConfiguration()

    /**
     * A builder for [ActionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The Amazon Q Business action that is allowed. 
       */
      public fun action(action: String)

      /**
       * @param filterConfiguration The filter configuration for the action, if any.
       */
      public fun filterConfiguration(filterConfiguration: IResolvable)

      /**
       * @param filterConfiguration The filter configuration for the action, if any.
       */
      public fun filterConfiguration(filterConfiguration: ActionFilterConfigurationProperty)

      /**
       * @param filterConfiguration The filter configuration for the action, if any.
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
       * @param action The Amazon Q Business action that is allowed. 
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      /**
       * @param filterConfiguration The filter configuration for the action, if any.
       */
      override fun filterConfiguration(filterConfiguration: IResolvable) {
        cdkBuilder.filterConfiguration(filterConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filterConfiguration The filter configuration for the action, if any.
       */
      override fun filterConfiguration(filterConfiguration: ActionFilterConfigurationProperty) {
        cdkBuilder.filterConfiguration(filterConfiguration.let(ActionFilterConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param filterConfiguration The filter configuration for the action, if any.
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
       * The Amazon Q Business action that is allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-actionconfiguration.html#cfn-qbusiness-dataaccessor-actionconfiguration-action)
       */
      override fun action(): String = unwrap(this).getAction()

      /**
       * The filter configuration for the action, if any.
       *
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
   * Specifies filters to apply to an allowed action.
   *
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
     * Enables filtering of responses based on document attributes or metadata fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-actionfilterconfiguration.html#cfn-qbusiness-dataaccessor-actionfilterconfiguration-documentattributefilter)
     */
    public fun documentAttributeFilter(): Any

    /**
     * A builder for [ActionFilterConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param documentAttributeFilter Enables filtering of responses based on document attributes
       * or metadata fields. 
       */
      public fun documentAttributeFilter(documentAttributeFilter: IResolvable)

      /**
       * @param documentAttributeFilter Enables filtering of responses based on document attributes
       * or metadata fields. 
       */
      public fun documentAttributeFilter(documentAttributeFilter: AttributeFilterProperty)

      /**
       * @param documentAttributeFilter Enables filtering of responses based on document attributes
       * or metadata fields. 
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
       * @param documentAttributeFilter Enables filtering of responses based on document attributes
       * or metadata fields. 
       */
      override fun documentAttributeFilter(documentAttributeFilter: IResolvable) {
        cdkBuilder.documentAttributeFilter(documentAttributeFilter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param documentAttributeFilter Enables filtering of responses based on document attributes
       * or metadata fields. 
       */
      override fun documentAttributeFilter(documentAttributeFilter: AttributeFilterProperty) {
        cdkBuilder.documentAttributeFilter(documentAttributeFilter.let(AttributeFilterProperty.Companion::unwrap))
      }

      /**
       * @param documentAttributeFilter Enables filtering of responses based on document attributes
       * or metadata fields. 
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
       * Enables filtering of responses based on document attributes or metadata fields.
       *
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
   * Enables filtering of responses based on document attributes or metadata fields.
   *
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
     * Performs a logical `AND` operation on all supplied filters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-andallfilters)
     */
    public fun andAllFilters(): Any? = unwrap(this).getAndAllFilters()

    /**
     * Returns `true` when a document contains all the specified document attributes or metadata
     * fields.
     *
     * Supported for the following [document attribute value
     * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
     * : `stringListValue` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-containsall)
     */
    public fun containsAll(): Any? = unwrap(this).getContainsAll()

    /**
     * Returns `true` when a document contains any of the specified document attributes or metadata
     * fields.
     *
     * Supported for the following [document attribute value
     * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
     * : `stringListValue` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-containsany)
     */
    public fun containsAny(): Any? = unwrap(this).getContainsAny()

    /**
     * Performs an equals operation on two document attributes or metadata fields.
     *
     * Supported for the following [document attribute value
     * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
     * : `dateValue` , `longValue` , `stringListValue` and `stringValue` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-equalsto)
     */
    public fun equalsTo(): Any? = unwrap(this).getEqualsTo()

    /**
     * Performs a greater than operation on two document attributes or metadata fields.
     *
     * Supported for the following [document attribute value
     * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
     * : `dateValue` and `longValue` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-greaterthan)
     */
    public fun greaterThan(): Any? = unwrap(this).getGreaterThan()

    /**
     * Performs a greater or equals than operation on two document attributes or metadata fields.
     *
     * Supported for the following [document attribute value
     * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
     * : `dateValue` and `longValue` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-greaterthanorequals)
     */
    public fun greaterThanOrEquals(): Any? = unwrap(this).getGreaterThanOrEquals()

    /**
     * Performs a less than operation on two document attributes or metadata fields.
     *
     * Supported for the following [document attribute value
     * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
     * : `dateValue` and `longValue` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-lessthan)
     */
    public fun lessThan(): Any? = unwrap(this).getLessThan()

    /**
     * Performs a less than or equals operation on two document attributes or metadata
     * fields.Supported for the following [document attribute value
     * type](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
     * : `dateValue` and `longValue` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-lessthanorequals)
     */
    public fun lessThanOrEquals(): Any? = unwrap(this).getLessThanOrEquals()

    /**
     * Performs a logical `NOT` operation on all supplied filters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-notfilter)
     */
    public fun notFilter(): Any? = unwrap(this).getNotFilter()

    /**
     * Performs a logical `OR` operation on all supplied filters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-orallfilters)
     */
    public fun orAllFilters(): Any? = unwrap(this).getOrAllFilters()

    /**
     * A builder for [AttributeFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param andAllFilters Performs a logical `AND` operation on all supplied filters.
       */
      public fun andAllFilters(andAllFilters: IResolvable)

      /**
       * @param andAllFilters Performs a logical `AND` operation on all supplied filters.
       */
      public fun andAllFilters(andAllFilters: List<Any>)

      /**
       * @param andAllFilters Performs a logical `AND` operation on all supplied filters.
       */
      public fun andAllFilters(vararg andAllFilters: Any)

      /**
       * @param containsAll Returns `true` when a document contains all the specified document
       * attributes or metadata fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `stringListValue` .
       */
      public fun containsAll(containsAll: IResolvable)

      /**
       * @param containsAll Returns `true` when a document contains all the specified document
       * attributes or metadata fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `stringListValue` .
       */
      public fun containsAll(containsAll: DocumentAttributeProperty)

      /**
       * @param containsAll Returns `true` when a document contains all the specified document
       * attributes or metadata fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `stringListValue` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d9260be04b54e9036755e9c4b11e43f62f17755ea72ff0f53f6ea96261a7166")
      public fun containsAll(containsAll: DocumentAttributeProperty.Builder.() -> Unit)

      /**
       * @param containsAny Returns `true` when a document contains any of the specified document
       * attributes or metadata fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `stringListValue` .
       */
      public fun containsAny(containsAny: IResolvable)

      /**
       * @param containsAny Returns `true` when a document contains any of the specified document
       * attributes or metadata fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `stringListValue` .
       */
      public fun containsAny(containsAny: DocumentAttributeProperty)

      /**
       * @param containsAny Returns `true` when a document contains any of the specified document
       * attributes or metadata fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `stringListValue` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ff754cba76ef68795c4a3cd777f3f62d57bf64d50fdeb83b8139621283be99a")
      public fun containsAny(containsAny: DocumentAttributeProperty.Builder.() -> Unit)

      /**
       * @param equalsTo Performs an equals operation on two document attributes or metadata fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` , `longValue` , `stringListValue` and `stringValue` .
       */
      public fun equalsTo(equalsTo: IResolvable)

      /**
       * @param equalsTo Performs an equals operation on two document attributes or metadata fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` , `longValue` , `stringListValue` and `stringValue` .
       */
      public fun equalsTo(equalsTo: DocumentAttributeProperty)

      /**
       * @param equalsTo Performs an equals operation on two document attributes or metadata fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` , `longValue` , `stringListValue` and `stringValue` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("90d28bb68135f82a607f7c795de2778121ad96ef53499c9b92b0b0fc028e60fd")
      public fun equalsTo(equalsTo: DocumentAttributeProperty.Builder.() -> Unit)

      /**
       * @param greaterThan Performs a greater than operation on two document attributes or metadata
       * fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       */
      public fun greaterThan(greaterThan: IResolvable)

      /**
       * @param greaterThan Performs a greater than operation on two document attributes or metadata
       * fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       */
      public fun greaterThan(greaterThan: DocumentAttributeProperty)

      /**
       * @param greaterThan Performs a greater than operation on two document attributes or metadata
       * fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44fb4963dc9fea6f4f3a727ade3efa57c06ab1255d63a6da69a4d67ee3147751")
      public fun greaterThan(greaterThan: DocumentAttributeProperty.Builder.() -> Unit)

      /**
       * @param greaterThanOrEquals Performs a greater or equals than operation on two document
       * attributes or metadata fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       */
      public fun greaterThanOrEquals(greaterThanOrEquals: IResolvable)

      /**
       * @param greaterThanOrEquals Performs a greater or equals than operation on two document
       * attributes or metadata fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       */
      public fun greaterThanOrEquals(greaterThanOrEquals: DocumentAttributeProperty)

      /**
       * @param greaterThanOrEquals Performs a greater or equals than operation on two document
       * attributes or metadata fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("36cf464fb9b16f38da4a828583a085cdcf4b152cd19543f2c98489c45256c2fd")
      public
          fun greaterThanOrEquals(greaterThanOrEquals: DocumentAttributeProperty.Builder.() -> Unit)

      /**
       * @param lessThan Performs a less than operation on two document attributes or metadata
       * fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       */
      public fun lessThan(lessThan: IResolvable)

      /**
       * @param lessThan Performs a less than operation on two document attributes or metadata
       * fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       */
      public fun lessThan(lessThan: DocumentAttributeProperty)

      /**
       * @param lessThan Performs a less than operation on two document attributes or metadata
       * fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("746bfe8af35d9f96cef5ae9aabf0dbffe017e517ca4706ae01709f554181ad42")
      public fun lessThan(lessThan: DocumentAttributeProperty.Builder.() -> Unit)

      /**
       * @param lessThanOrEquals Performs a less than or equals operation on two document attributes
       * or metadata fields.Supported for the following [document attribute value
       * type](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       */
      public fun lessThanOrEquals(lessThanOrEquals: IResolvable)

      /**
       * @param lessThanOrEquals Performs a less than or equals operation on two document attributes
       * or metadata fields.Supported for the following [document attribute value
       * type](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       */
      public fun lessThanOrEquals(lessThanOrEquals: DocumentAttributeProperty)

      /**
       * @param lessThanOrEquals Performs a less than or equals operation on two document attributes
       * or metadata fields.Supported for the following [document attribute value
       * type](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4688358f9e3f64cd172a6661380405f99780cc0735fabec0f5f9f85a524bf64")
      public fun lessThanOrEquals(lessThanOrEquals: DocumentAttributeProperty.Builder.() -> Unit)

      /**
       * @param notFilter Performs a logical `NOT` operation on all supplied filters.
       */
      public fun notFilter(notFilter: IResolvable)

      /**
       * @param notFilter Performs a logical `NOT` operation on all supplied filters.
       */
      public fun notFilter(notFilter: AttributeFilterProperty)

      /**
       * @param notFilter Performs a logical `NOT` operation on all supplied filters.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bdd4a4c561a40b55f43909e763644a5e28f941fbec681cf30f7a1f7e90bb69e6")
      public fun notFilter(notFilter: Builder.() -> Unit)

      /**
       * @param orAllFilters Performs a logical `OR` operation on all supplied filters.
       */
      public fun orAllFilters(orAllFilters: IResolvable)

      /**
       * @param orAllFilters Performs a logical `OR` operation on all supplied filters.
       */
      public fun orAllFilters(orAllFilters: List<Any>)

      /**
       * @param orAllFilters Performs a logical `OR` operation on all supplied filters.
       */
      public fun orAllFilters(vararg orAllFilters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.AttributeFilterProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.AttributeFilterProperty.builder()

      /**
       * @param andAllFilters Performs a logical `AND` operation on all supplied filters.
       */
      override fun andAllFilters(andAllFilters: IResolvable) {
        cdkBuilder.andAllFilters(andAllFilters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param andAllFilters Performs a logical `AND` operation on all supplied filters.
       */
      override fun andAllFilters(andAllFilters: List<Any>) {
        cdkBuilder.andAllFilters(andAllFilters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param andAllFilters Performs a logical `AND` operation on all supplied filters.
       */
      override fun andAllFilters(vararg andAllFilters: Any): Unit =
          andAllFilters(andAllFilters.toList())

      /**
       * @param containsAll Returns `true` when a document contains all the specified document
       * attributes or metadata fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `stringListValue` .
       */
      override fun containsAll(containsAll: IResolvable) {
        cdkBuilder.containsAll(containsAll.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param containsAll Returns `true` when a document contains all the specified document
       * attributes or metadata fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `stringListValue` .
       */
      override fun containsAll(containsAll: DocumentAttributeProperty) {
        cdkBuilder.containsAll(containsAll.let(DocumentAttributeProperty.Companion::unwrap))
      }

      /**
       * @param containsAll Returns `true` when a document contains all the specified document
       * attributes or metadata fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `stringListValue` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d9260be04b54e9036755e9c4b11e43f62f17755ea72ff0f53f6ea96261a7166")
      override fun containsAll(containsAll: DocumentAttributeProperty.Builder.() -> Unit): Unit =
          containsAll(DocumentAttributeProperty(containsAll))

      /**
       * @param containsAny Returns `true` when a document contains any of the specified document
       * attributes or metadata fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `stringListValue` .
       */
      override fun containsAny(containsAny: IResolvable) {
        cdkBuilder.containsAny(containsAny.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param containsAny Returns `true` when a document contains any of the specified document
       * attributes or metadata fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `stringListValue` .
       */
      override fun containsAny(containsAny: DocumentAttributeProperty) {
        cdkBuilder.containsAny(containsAny.let(DocumentAttributeProperty.Companion::unwrap))
      }

      /**
       * @param containsAny Returns `true` when a document contains any of the specified document
       * attributes or metadata fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `stringListValue` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ff754cba76ef68795c4a3cd777f3f62d57bf64d50fdeb83b8139621283be99a")
      override fun containsAny(containsAny: DocumentAttributeProperty.Builder.() -> Unit): Unit =
          containsAny(DocumentAttributeProperty(containsAny))

      /**
       * @param equalsTo Performs an equals operation on two document attributes or metadata fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` , `longValue` , `stringListValue` and `stringValue` .
       */
      override fun equalsTo(equalsTo: IResolvable) {
        cdkBuilder.equalsTo(equalsTo.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param equalsTo Performs an equals operation on two document attributes or metadata fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` , `longValue` , `stringListValue` and `stringValue` .
       */
      override fun equalsTo(equalsTo: DocumentAttributeProperty) {
        cdkBuilder.equalsTo(equalsTo.let(DocumentAttributeProperty.Companion::unwrap))
      }

      /**
       * @param equalsTo Performs an equals operation on two document attributes or metadata fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` , `longValue` , `stringListValue` and `stringValue` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("90d28bb68135f82a607f7c795de2778121ad96ef53499c9b92b0b0fc028e60fd")
      override fun equalsTo(equalsTo: DocumentAttributeProperty.Builder.() -> Unit): Unit =
          equalsTo(DocumentAttributeProperty(equalsTo))

      /**
       * @param greaterThan Performs a greater than operation on two document attributes or metadata
       * fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       */
      override fun greaterThan(greaterThan: IResolvable) {
        cdkBuilder.greaterThan(greaterThan.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param greaterThan Performs a greater than operation on two document attributes or metadata
       * fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       */
      override fun greaterThan(greaterThan: DocumentAttributeProperty) {
        cdkBuilder.greaterThan(greaterThan.let(DocumentAttributeProperty.Companion::unwrap))
      }

      /**
       * @param greaterThan Performs a greater than operation on two document attributes or metadata
       * fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44fb4963dc9fea6f4f3a727ade3efa57c06ab1255d63a6da69a4d67ee3147751")
      override fun greaterThan(greaterThan: DocumentAttributeProperty.Builder.() -> Unit): Unit =
          greaterThan(DocumentAttributeProperty(greaterThan))

      /**
       * @param greaterThanOrEquals Performs a greater or equals than operation on two document
       * attributes or metadata fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       */
      override fun greaterThanOrEquals(greaterThanOrEquals: IResolvable) {
        cdkBuilder.greaterThanOrEquals(greaterThanOrEquals.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param greaterThanOrEquals Performs a greater or equals than operation on two document
       * attributes or metadata fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       */
      override fun greaterThanOrEquals(greaterThanOrEquals: DocumentAttributeProperty) {
        cdkBuilder.greaterThanOrEquals(greaterThanOrEquals.let(DocumentAttributeProperty.Companion::unwrap))
      }

      /**
       * @param greaterThanOrEquals Performs a greater or equals than operation on two document
       * attributes or metadata fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("36cf464fb9b16f38da4a828583a085cdcf4b152cd19543f2c98489c45256c2fd")
      override
          fun greaterThanOrEquals(greaterThanOrEquals: DocumentAttributeProperty.Builder.() -> Unit):
          Unit = greaterThanOrEquals(DocumentAttributeProperty(greaterThanOrEquals))

      /**
       * @param lessThan Performs a less than operation on two document attributes or metadata
       * fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       */
      override fun lessThan(lessThan: IResolvable) {
        cdkBuilder.lessThan(lessThan.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lessThan Performs a less than operation on two document attributes or metadata
       * fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       */
      override fun lessThan(lessThan: DocumentAttributeProperty) {
        cdkBuilder.lessThan(lessThan.let(DocumentAttributeProperty.Companion::unwrap))
      }

      /**
       * @param lessThan Performs a less than operation on two document attributes or metadata
       * fields.
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("746bfe8af35d9f96cef5ae9aabf0dbffe017e517ca4706ae01709f554181ad42")
      override fun lessThan(lessThan: DocumentAttributeProperty.Builder.() -> Unit): Unit =
          lessThan(DocumentAttributeProperty(lessThan))

      /**
       * @param lessThanOrEquals Performs a less than or equals operation on two document attributes
       * or metadata fields.Supported for the following [document attribute value
       * type](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       */
      override fun lessThanOrEquals(lessThanOrEquals: IResolvable) {
        cdkBuilder.lessThanOrEquals(lessThanOrEquals.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lessThanOrEquals Performs a less than or equals operation on two document attributes
       * or metadata fields.Supported for the following [document attribute value
       * type](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       */
      override fun lessThanOrEquals(lessThanOrEquals: DocumentAttributeProperty) {
        cdkBuilder.lessThanOrEquals(lessThanOrEquals.let(DocumentAttributeProperty.Companion::unwrap))
      }

      /**
       * @param lessThanOrEquals Performs a less than or equals operation on two document attributes
       * or metadata fields.Supported for the following [document attribute value
       * type](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4688358f9e3f64cd172a6661380405f99780cc0735fabec0f5f9f85a524bf64")
      override fun lessThanOrEquals(lessThanOrEquals: DocumentAttributeProperty.Builder.() -> Unit):
          Unit = lessThanOrEquals(DocumentAttributeProperty(lessThanOrEquals))

      /**
       * @param notFilter Performs a logical `NOT` operation on all supplied filters.
       */
      override fun notFilter(notFilter: IResolvable) {
        cdkBuilder.notFilter(notFilter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param notFilter Performs a logical `NOT` operation on all supplied filters.
       */
      override fun notFilter(notFilter: AttributeFilterProperty) {
        cdkBuilder.notFilter(notFilter.let(AttributeFilterProperty.Companion::unwrap))
      }

      /**
       * @param notFilter Performs a logical `NOT` operation on all supplied filters.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bdd4a4c561a40b55f43909e763644a5e28f941fbec681cf30f7a1f7e90bb69e6")
      override fun notFilter(notFilter: Builder.() -> Unit): Unit =
          notFilter(AttributeFilterProperty(notFilter))

      /**
       * @param orAllFilters Performs a logical `OR` operation on all supplied filters.
       */
      override fun orAllFilters(orAllFilters: IResolvable) {
        cdkBuilder.orAllFilters(orAllFilters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param orAllFilters Performs a logical `OR` operation on all supplied filters.
       */
      override fun orAllFilters(orAllFilters: List<Any>) {
        cdkBuilder.orAllFilters(orAllFilters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param orAllFilters Performs a logical `OR` operation on all supplied filters.
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
       * Performs a logical `AND` operation on all supplied filters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-andallfilters)
       */
      override fun andAllFilters(): Any? = unwrap(this).getAndAllFilters()

      /**
       * Returns `true` when a document contains all the specified document attributes or metadata
       * fields.
       *
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `stringListValue` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-containsall)
       */
      override fun containsAll(): Any? = unwrap(this).getContainsAll()

      /**
       * Returns `true` when a document contains any of the specified document attributes or
       * metadata fields.
       *
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `stringListValue` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-containsany)
       */
      override fun containsAny(): Any? = unwrap(this).getContainsAny()

      /**
       * Performs an equals operation on two document attributes or metadata fields.
       *
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` , `longValue` , `stringListValue` and `stringValue` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-equalsto)
       */
      override fun equalsTo(): Any? = unwrap(this).getEqualsTo()

      /**
       * Performs a greater than operation on two document attributes or metadata fields.
       *
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-greaterthan)
       */
      override fun greaterThan(): Any? = unwrap(this).getGreaterThan()

      /**
       * Performs a greater or equals than operation on two document attributes or metadata fields.
       *
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-greaterthanorequals)
       */
      override fun greaterThanOrEquals(): Any? = unwrap(this).getGreaterThanOrEquals()

      /**
       * Performs a less than operation on two document attributes or metadata fields.
       *
       * Supported for the following [document attribute value
       * types](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-lessthan)
       */
      override fun lessThan(): Any? = unwrap(this).getLessThan()

      /**
       * Performs a less than or equals operation on two document attributes or metadata
       * fields.Supported for the following [document attribute value
       * type](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeValue.html)
       * : `dateValue` and `longValue` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-lessthanorequals)
       */
      override fun lessThanOrEquals(): Any? = unwrap(this).getLessThanOrEquals()

      /**
       * Performs a logical `NOT` operation on all supplied filters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-attributefilter.html#cfn-qbusiness-dataaccessor-attributefilter-notfilter)
       */
      override fun notFilter(): Any? = unwrap(this).getNotFilter()

      /**
       * Performs a logical `OR` operation on all supplied filters.
       *
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
   * A union type that contains the specific authentication configuration based on the
   * authentication type selected.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * DataAccessorAuthenticationConfigurationProperty dataAccessorAuthenticationConfigurationProperty
   * = DataAccessorAuthenticationConfigurationProperty.builder()
   * .idcTrustedTokenIssuerConfiguration(DataAccessorIdcTrustedTokenIssuerConfigurationProperty.builder()
   * .idcTrustedTokenIssuerArn("idcTrustedTokenIssuerArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-dataaccessorauthenticationconfiguration.html)
   */
  public interface DataAccessorAuthenticationConfigurationProperty {
    /**
     * Configuration for IAM Identity Center Trusted Token Issuer (TTI) authentication used when the
     * authentication type is `AWS_IAM_IDC_TTI` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-dataaccessorauthenticationconfiguration.html#cfn-qbusiness-dataaccessor-dataaccessorauthenticationconfiguration-idctrustedtokenissuerconfiguration)
     */
    public fun idcTrustedTokenIssuerConfiguration(): Any

    /**
     * A builder for [DataAccessorAuthenticationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param idcTrustedTokenIssuerConfiguration Configuration for IAM Identity Center Trusted
       * Token Issuer (TTI) authentication used when the authentication type is `AWS_IAM_IDC_TTI` . 
       */
      public fun idcTrustedTokenIssuerConfiguration(idcTrustedTokenIssuerConfiguration: IResolvable)

      /**
       * @param idcTrustedTokenIssuerConfiguration Configuration for IAM Identity Center Trusted
       * Token Issuer (TTI) authentication used when the authentication type is `AWS_IAM_IDC_TTI` . 
       */
      public
          fun idcTrustedTokenIssuerConfiguration(idcTrustedTokenIssuerConfiguration: DataAccessorIdcTrustedTokenIssuerConfigurationProperty)

      /**
       * @param idcTrustedTokenIssuerConfiguration Configuration for IAM Identity Center Trusted
       * Token Issuer (TTI) authentication used when the authentication type is `AWS_IAM_IDC_TTI` . 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ddaaaa99da89653e493a36800dc37313836acb38c72a0985d182432b8e1ac4bb")
      public
          fun idcTrustedTokenIssuerConfiguration(idcTrustedTokenIssuerConfiguration: DataAccessorIdcTrustedTokenIssuerConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DataAccessorAuthenticationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DataAccessorAuthenticationConfigurationProperty.builder()

      /**
       * @param idcTrustedTokenIssuerConfiguration Configuration for IAM Identity Center Trusted
       * Token Issuer (TTI) authentication used when the authentication type is `AWS_IAM_IDC_TTI` . 
       */
      override
          fun idcTrustedTokenIssuerConfiguration(idcTrustedTokenIssuerConfiguration: IResolvable) {
        cdkBuilder.idcTrustedTokenIssuerConfiguration(idcTrustedTokenIssuerConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param idcTrustedTokenIssuerConfiguration Configuration for IAM Identity Center Trusted
       * Token Issuer (TTI) authentication used when the authentication type is `AWS_IAM_IDC_TTI` . 
       */
      override
          fun idcTrustedTokenIssuerConfiguration(idcTrustedTokenIssuerConfiguration: DataAccessorIdcTrustedTokenIssuerConfigurationProperty) {
        cdkBuilder.idcTrustedTokenIssuerConfiguration(idcTrustedTokenIssuerConfiguration.let(DataAccessorIdcTrustedTokenIssuerConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param idcTrustedTokenIssuerConfiguration Configuration for IAM Identity Center Trusted
       * Token Issuer (TTI) authentication used when the authentication type is `AWS_IAM_IDC_TTI` . 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ddaaaa99da89653e493a36800dc37313836acb38c72a0985d182432b8e1ac4bb")
      override
          fun idcTrustedTokenIssuerConfiguration(idcTrustedTokenIssuerConfiguration: DataAccessorIdcTrustedTokenIssuerConfigurationProperty.Builder.() -> Unit):
          Unit =
          idcTrustedTokenIssuerConfiguration(DataAccessorIdcTrustedTokenIssuerConfigurationProperty(idcTrustedTokenIssuerConfiguration))

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DataAccessorAuthenticationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DataAccessorAuthenticationConfigurationProperty,
    ) : CdkObject(cdkObject),
        DataAccessorAuthenticationConfigurationProperty {
      /**
       * Configuration for IAM Identity Center Trusted Token Issuer (TTI) authentication used when
       * the authentication type is `AWS_IAM_IDC_TTI` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-dataaccessorauthenticationconfiguration.html#cfn-qbusiness-dataaccessor-dataaccessorauthenticationconfiguration-idctrustedtokenissuerconfiguration)
       */
      override fun idcTrustedTokenIssuerConfiguration(): Any =
          unwrap(this).getIdcTrustedTokenIssuerConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DataAccessorAuthenticationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DataAccessorAuthenticationConfigurationProperty):
          DataAccessorAuthenticationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataAccessorAuthenticationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataAccessorAuthenticationConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DataAccessorAuthenticationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DataAccessorAuthenticationConfigurationProperty
    }
  }

  /**
   * Contains the authentication configuration details for a data accessor.
   *
   * This structure defines how the ISV authenticates when accessing data through the data accessor.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * DataAccessorAuthenticationDetailProperty dataAccessorAuthenticationDetailProperty =
   * DataAccessorAuthenticationDetailProperty.builder()
   * .authenticationType("authenticationType")
   * // the properties below are optional
   * .authenticationConfiguration(DataAccessorAuthenticationConfigurationProperty.builder()
   * .idcTrustedTokenIssuerConfiguration(DataAccessorIdcTrustedTokenIssuerConfigurationProperty.builder()
   * .idcTrustedTokenIssuerArn("idcTrustedTokenIssuerArn")
   * .build())
   * .build())
   * .externalIds(List.of("externalIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-dataaccessorauthenticationdetail.html)
   */
  public interface DataAccessorAuthenticationDetailProperty {
    /**
     * The specific authentication configuration based on the authentication type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-dataaccessorauthenticationdetail.html#cfn-qbusiness-dataaccessor-dataaccessorauthenticationdetail-authenticationconfiguration)
     */
    public fun authenticationConfiguration(): Any? = unwrap(this).getAuthenticationConfiguration()

    /**
     * The type of authentication to use for the data accessor.
     *
     * This determines how the ISV authenticates when accessing data. You can use one of two
     * authentication types:
     *
     * * `AWS_IAM_IDC_TTI` - Authentication using IAM Identity Center Trusted Token Issuer (TTI).
     * This authentication type allows the ISV to use a trusted token issuer to generate tokens for
     * accessing the data.
     * * `AWS_IAM_IDC_AUTH_CODE` - Authentication using IAM Identity Center authorization code flow.
     * This authentication type uses the standard OAuth 2.0 authorization code flow for authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-dataaccessorauthenticationdetail.html#cfn-qbusiness-dataaccessor-dataaccessorauthenticationdetail-authenticationtype)
     */
    public fun authenticationType(): String

    /**
     * A list of external identifiers associated with this authentication configuration.
     *
     * These are used to correlate the data accessor with external systems.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-dataaccessorauthenticationdetail.html#cfn-qbusiness-dataaccessor-dataaccessorauthenticationdetail-externalids)
     */
    public fun externalIds(): List<String> = unwrap(this).getExternalIds() ?: emptyList()

    /**
     * A builder for [DataAccessorAuthenticationDetailProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authenticationConfiguration The specific authentication configuration based on the
       * authentication type.
       */
      public fun authenticationConfiguration(authenticationConfiguration: IResolvable)

      /**
       * @param authenticationConfiguration The specific authentication configuration based on the
       * authentication type.
       */
      public
          fun authenticationConfiguration(authenticationConfiguration: DataAccessorAuthenticationConfigurationProperty)

      /**
       * @param authenticationConfiguration The specific authentication configuration based on the
       * authentication type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec6706791cd3c05f67d71b631394383b0f7caafcbcf2e063f2229b62f676ae0a")
      public
          fun authenticationConfiguration(authenticationConfiguration: DataAccessorAuthenticationConfigurationProperty.Builder.() -> Unit)

      /**
       * @param authenticationType The type of authentication to use for the data accessor. 
       * This determines how the ISV authenticates when accessing data. You can use one of two
       * authentication types:
       *
       * * `AWS_IAM_IDC_TTI` - Authentication using IAM Identity Center Trusted Token Issuer (TTI).
       * This authentication type allows the ISV to use a trusted token issuer to generate tokens for
       * accessing the data.
       * * `AWS_IAM_IDC_AUTH_CODE` - Authentication using IAM Identity Center authorization code
       * flow. This authentication type uses the standard OAuth 2.0 authorization code flow for
       * authentication.
       */
      public fun authenticationType(authenticationType: String)

      /**
       * @param externalIds A list of external identifiers associated with this authentication
       * configuration.
       * These are used to correlate the data accessor with external systems.
       */
      public fun externalIds(externalIds: List<String>)

      /**
       * @param externalIds A list of external identifiers associated with this authentication
       * configuration.
       * These are used to correlate the data accessor with external systems.
       */
      public fun externalIds(vararg externalIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DataAccessorAuthenticationDetailProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DataAccessorAuthenticationDetailProperty.builder()

      /**
       * @param authenticationConfiguration The specific authentication configuration based on the
       * authentication type.
       */
      override fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param authenticationConfiguration The specific authentication configuration based on the
       * authentication type.
       */
      override
          fun authenticationConfiguration(authenticationConfiguration: DataAccessorAuthenticationConfigurationProperty) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(DataAccessorAuthenticationConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param authenticationConfiguration The specific authentication configuration based on the
       * authentication type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec6706791cd3c05f67d71b631394383b0f7caafcbcf2e063f2229b62f676ae0a")
      override
          fun authenticationConfiguration(authenticationConfiguration: DataAccessorAuthenticationConfigurationProperty.Builder.() -> Unit):
          Unit =
          authenticationConfiguration(DataAccessorAuthenticationConfigurationProperty(authenticationConfiguration))

      /**
       * @param authenticationType The type of authentication to use for the data accessor. 
       * This determines how the ISV authenticates when accessing data. You can use one of two
       * authentication types:
       *
       * * `AWS_IAM_IDC_TTI` - Authentication using IAM Identity Center Trusted Token Issuer (TTI).
       * This authentication type allows the ISV to use a trusted token issuer to generate tokens for
       * accessing the data.
       * * `AWS_IAM_IDC_AUTH_CODE` - Authentication using IAM Identity Center authorization code
       * flow. This authentication type uses the standard OAuth 2.0 authorization code flow for
       * authentication.
       */
      override fun authenticationType(authenticationType: String) {
        cdkBuilder.authenticationType(authenticationType)
      }

      /**
       * @param externalIds A list of external identifiers associated with this authentication
       * configuration.
       * These are used to correlate the data accessor with external systems.
       */
      override fun externalIds(externalIds: List<String>) {
        cdkBuilder.externalIds(externalIds)
      }

      /**
       * @param externalIds A list of external identifiers associated with this authentication
       * configuration.
       * These are used to correlate the data accessor with external systems.
       */
      override fun externalIds(vararg externalIds: String): Unit = externalIds(externalIds.toList())

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DataAccessorAuthenticationDetailProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DataAccessorAuthenticationDetailProperty,
    ) : CdkObject(cdkObject),
        DataAccessorAuthenticationDetailProperty {
      /**
       * The specific authentication configuration based on the authentication type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-dataaccessorauthenticationdetail.html#cfn-qbusiness-dataaccessor-dataaccessorauthenticationdetail-authenticationconfiguration)
       */
      override fun authenticationConfiguration(): Any? =
          unwrap(this).getAuthenticationConfiguration()

      /**
       * The type of authentication to use for the data accessor.
       *
       * This determines how the ISV authenticates when accessing data. You can use one of two
       * authentication types:
       *
       * * `AWS_IAM_IDC_TTI` - Authentication using IAM Identity Center Trusted Token Issuer (TTI).
       * This authentication type allows the ISV to use a trusted token issuer to generate tokens for
       * accessing the data.
       * * `AWS_IAM_IDC_AUTH_CODE` - Authentication using IAM Identity Center authorization code
       * flow. This authentication type uses the standard OAuth 2.0 authorization code flow for
       * authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-dataaccessorauthenticationdetail.html#cfn-qbusiness-dataaccessor-dataaccessorauthenticationdetail-authenticationtype)
       */
      override fun authenticationType(): String = unwrap(this).getAuthenticationType()

      /**
       * A list of external identifiers associated with this authentication configuration.
       *
       * These are used to correlate the data accessor with external systems.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-dataaccessorauthenticationdetail.html#cfn-qbusiness-dataaccessor-dataaccessorauthenticationdetail-externalids)
       */
      override fun externalIds(): List<String> = unwrap(this).getExternalIds() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DataAccessorAuthenticationDetailProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DataAccessorAuthenticationDetailProperty):
          DataAccessorAuthenticationDetailProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataAccessorAuthenticationDetailProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataAccessorAuthenticationDetailProperty):
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DataAccessorAuthenticationDetailProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DataAccessorAuthenticationDetailProperty
    }
  }

  /**
   * Configuration details for IAM Identity Center Trusted Token Issuer (TTI) authentication.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * DataAccessorIdcTrustedTokenIssuerConfigurationProperty
   * dataAccessorIdcTrustedTokenIssuerConfigurationProperty =
   * DataAccessorIdcTrustedTokenIssuerConfigurationProperty.builder()
   * .idcTrustedTokenIssuerArn("idcTrustedTokenIssuerArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-dataaccessoridctrustedtokenissuerconfiguration.html)
   */
  public interface DataAccessorIdcTrustedTokenIssuerConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the IAM Identity Center Trusted Token Issuer that will be
     * used for authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-dataaccessoridctrustedtokenissuerconfiguration.html#cfn-qbusiness-dataaccessor-dataaccessoridctrustedtokenissuerconfiguration-idctrustedtokenissuerarn)
     */
    public fun idcTrustedTokenIssuerArn(): String

    /**
     * A builder for [DataAccessorIdcTrustedTokenIssuerConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param idcTrustedTokenIssuerArn The Amazon Resource Name (ARN) of the IAM Identity Center
       * Trusted Token Issuer that will be used for authentication. 
       */
      public fun idcTrustedTokenIssuerArn(idcTrustedTokenIssuerArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DataAccessorIdcTrustedTokenIssuerConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DataAccessorIdcTrustedTokenIssuerConfigurationProperty.builder()

      /**
       * @param idcTrustedTokenIssuerArn The Amazon Resource Name (ARN) of the IAM Identity Center
       * Trusted Token Issuer that will be used for authentication. 
       */
      override fun idcTrustedTokenIssuerArn(idcTrustedTokenIssuerArn: String) {
        cdkBuilder.idcTrustedTokenIssuerArn(idcTrustedTokenIssuerArn)
      }

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DataAccessorIdcTrustedTokenIssuerConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DataAccessorIdcTrustedTokenIssuerConfigurationProperty,
    ) : CdkObject(cdkObject),
        DataAccessorIdcTrustedTokenIssuerConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the IAM Identity Center Trusted Token Issuer that will be
       * used for authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-dataaccessoridctrustedtokenissuerconfiguration.html#cfn-qbusiness-dataaccessor-dataaccessoridctrustedtokenissuerconfiguration-idctrustedtokenissuerarn)
       */
      override fun idcTrustedTokenIssuerArn(): String = unwrap(this).getIdcTrustedTokenIssuerArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DataAccessorIdcTrustedTokenIssuerConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DataAccessorIdcTrustedTokenIssuerConfigurationProperty):
          DataAccessorIdcTrustedTokenIssuerConfigurationProperty = CdkObjectWrappers.wrap(cdkObject)
          as? DataAccessorIdcTrustedTokenIssuerConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataAccessorIdcTrustedTokenIssuerConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DataAccessorIdcTrustedTokenIssuerConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DataAccessorIdcTrustedTokenIssuerConfigurationProperty
    }
  }

  /**
   * A document attribute or metadata field.
   *
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
     * The identifier for the attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-documentattribute.html#cfn-qbusiness-dataaccessor-documentattribute-name)
     */
    public fun name(): String

    /**
     * The value of the attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-documentattribute.html#cfn-qbusiness-dataaccessor-documentattribute-value)
     */
    public fun `value`(): Any

    /**
     * A builder for [DocumentAttributeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The identifier for the attribute. 
       */
      public fun name(name: String)

      /**
       * @param value The value of the attribute. 
       */
      public fun `value`(`value`: IResolvable)

      /**
       * @param value The value of the attribute. 
       */
      public fun `value`(`value`: DocumentAttributeValueProperty)

      /**
       * @param value The value of the attribute. 
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
       * @param name The identifier for the attribute. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The value of the attribute. 
       */
      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param value The value of the attribute. 
       */
      override fun `value`(`value`: DocumentAttributeValueProperty) {
        cdkBuilder.`value`(`value`.let(DocumentAttributeValueProperty.Companion::unwrap))
      }

      /**
       * @param value The value of the attribute. 
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
       * The identifier for the attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-documentattribute.html#cfn-qbusiness-dataaccessor-documentattribute-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The value of the attribute.
       *
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
   * The value of a document attribute.
   *
   * You can only provide one value for a document attribute.
   *
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
     * A date expressed as an ISO 8601 string.
     *
     * It's important for the time zone to be included in the ISO 8601 date-time format. For
     * example, 2012-03-25T12:30:10+01:00 is the ISO 8601 date-time format for March 25th 2012 at
     * 12:30PM (plus 10 seconds) in Central European Time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-documentattributevalue.html#cfn-qbusiness-dataaccessor-documentattributevalue-datevalue)
     */
    public fun dateValue(): String? = unwrap(this).getDateValue()

    /**
     * A long integer value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-documentattributevalue.html#cfn-qbusiness-dataaccessor-documentattributevalue-longvalue)
     */
    public fun longValue(): Number? = unwrap(this).getLongValue()

    /**
     * A list of strings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-documentattributevalue.html#cfn-qbusiness-dataaccessor-documentattributevalue-stringlistvalue)
     */
    public fun stringListValue(): List<String> = unwrap(this).getStringListValue() ?: emptyList()

    /**
     * A string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-documentattributevalue.html#cfn-qbusiness-dataaccessor-documentattributevalue-stringvalue)
     */
    public fun stringValue(): String? = unwrap(this).getStringValue()

    /**
     * A builder for [DocumentAttributeValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dateValue A date expressed as an ISO 8601 string.
       * It's important for the time zone to be included in the ISO 8601 date-time format. For
       * example, 2012-03-25T12:30:10+01:00 is the ISO 8601 date-time format for March 25th 2012 at
       * 12:30PM (plus 10 seconds) in Central European Time.
       */
      public fun dateValue(dateValue: String)

      /**
       * @param longValue A long integer value.
       */
      public fun longValue(longValue: Number)

      /**
       * @param stringListValue A list of strings.
       */
      public fun stringListValue(stringListValue: List<String>)

      /**
       * @param stringListValue A list of strings.
       */
      public fun stringListValue(vararg stringListValue: String)

      /**
       * @param stringValue A string.
       */
      public fun stringValue(stringValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DocumentAttributeValueProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnDataAccessor.DocumentAttributeValueProperty.builder()

      /**
       * @param dateValue A date expressed as an ISO 8601 string.
       * It's important for the time zone to be included in the ISO 8601 date-time format. For
       * example, 2012-03-25T12:30:10+01:00 is the ISO 8601 date-time format for March 25th 2012 at
       * 12:30PM (plus 10 seconds) in Central European Time.
       */
      override fun dateValue(dateValue: String) {
        cdkBuilder.dateValue(dateValue)
      }

      /**
       * @param longValue A long integer value.
       */
      override fun longValue(longValue: Number) {
        cdkBuilder.longValue(longValue)
      }

      /**
       * @param stringListValue A list of strings.
       */
      override fun stringListValue(stringListValue: List<String>) {
        cdkBuilder.stringListValue(stringListValue)
      }

      /**
       * @param stringListValue A list of strings.
       */
      override fun stringListValue(vararg stringListValue: String): Unit =
          stringListValue(stringListValue.toList())

      /**
       * @param stringValue A string.
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
       * A date expressed as an ISO 8601 string.
       *
       * It's important for the time zone to be included in the ISO 8601 date-time format. For
       * example, 2012-03-25T12:30:10+01:00 is the ISO 8601 date-time format for March 25th 2012 at
       * 12:30PM (plus 10 seconds) in Central European Time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-documentattributevalue.html#cfn-qbusiness-dataaccessor-documentattributevalue-datevalue)
       */
      override fun dateValue(): String? = unwrap(this).getDateValue()

      /**
       * A long integer value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-documentattributevalue.html#cfn-qbusiness-dataaccessor-documentattributevalue-longvalue)
       */
      override fun longValue(): Number? = unwrap(this).getLongValue()

      /**
       * A list of strings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-dataaccessor-documentattributevalue.html#cfn-qbusiness-dataaccessor-documentattributevalue-stringlistvalue)
       */
      override fun stringListValue(): List<String> = unwrap(this).getStringListValue() ?:
          emptyList()

      /**
       * A string.
       *
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
