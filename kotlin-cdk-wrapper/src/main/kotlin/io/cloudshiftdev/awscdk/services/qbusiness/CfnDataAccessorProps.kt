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
 * Properties for defining a `CfnDataAccessor`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.qbusiness.*;
 * AttributeFilterProperty attributeFilterProperty_;
 * CfnDataAccessorProps cfnDataAccessorProps = CfnDataAccessorProps.builder()
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
public interface CfnDataAccessorProps {
  /**
   * A list of action configurations specifying the allowed actions and any associated filters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-actionconfigurations)
   */
  public fun actionConfigurations(): Any

  /**
   * The unique identifier of the Amazon Q Business application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-applicationid)
   */
  public fun applicationId(): String

  /**
   * The authentication configuration details for the data accessor.
   *
   * This specifies how the ISV authenticates when accessing data through this data accessor.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-authenticationdetail)
   */
  public fun authenticationDetail(): Any? = unwrap(this).getAuthenticationDetail()

  /**
   * The friendly name of the data accessor.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-displayname)
   */
  public fun displayName(): String

  /**
   * The Amazon Resource Name (ARN) of the IAM role for the ISV associated with this data accessor.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-principal)
   */
  public fun principal(): String

  /**
   * The tags to associate with the data accessor.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDataAccessorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionConfigurations A list of action configurations specifying the allowed actions
     * and any associated filters. 
     */
    public fun actionConfigurations(actionConfigurations: IResolvable)

    /**
     * @param actionConfigurations A list of action configurations specifying the allowed actions
     * and any associated filters. 
     */
    public fun actionConfigurations(actionConfigurations: List<Any>)

    /**
     * @param actionConfigurations A list of action configurations specifying the allowed actions
     * and any associated filters. 
     */
    public fun actionConfigurations(vararg actionConfigurations: Any)

    /**
     * @param applicationId The unique identifier of the Amazon Q Business application. 
     */
    public fun applicationId(applicationId: String)

    /**
     * @param authenticationDetail The authentication configuration details for the data accessor.
     * This specifies how the ISV authenticates when accessing data through this data accessor.
     */
    public fun authenticationDetail(authenticationDetail: IResolvable)

    /**
     * @param authenticationDetail The authentication configuration details for the data accessor.
     * This specifies how the ISV authenticates when accessing data through this data accessor.
     */
    public
        fun authenticationDetail(authenticationDetail: CfnDataAccessor.DataAccessorAuthenticationDetailProperty)

    /**
     * @param authenticationDetail The authentication configuration details for the data accessor.
     * This specifies how the ISV authenticates when accessing data through this data accessor.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f183b7c94a4af26e13639e0938e12cca3cf21bb50dfe66f9cffd6987b0ac2a0")
    public
        fun authenticationDetail(authenticationDetail: CfnDataAccessor.DataAccessorAuthenticationDetailProperty.Builder.() -> Unit)

    /**
     * @param displayName The friendly name of the data accessor. 
     */
    public fun displayName(displayName: String)

    /**
     * @param principal The Amazon Resource Name (ARN) of the IAM role for the ISV associated with
     * this data accessor. 
     */
    public fun principal(principal: String)

    /**
     * @param tags The tags to associate with the data accessor.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to associate with the data accessor.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.qbusiness.CfnDataAccessorProps.Builder =
        software.amazon.awscdk.services.qbusiness.CfnDataAccessorProps.builder()

    /**
     * @param actionConfigurations A list of action configurations specifying the allowed actions
     * and any associated filters. 
     */
    override fun actionConfigurations(actionConfigurations: IResolvable) {
      cdkBuilder.actionConfigurations(actionConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param actionConfigurations A list of action configurations specifying the allowed actions
     * and any associated filters. 
     */
    override fun actionConfigurations(actionConfigurations: List<Any>) {
      cdkBuilder.actionConfigurations(actionConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param actionConfigurations A list of action configurations specifying the allowed actions
     * and any associated filters. 
     */
    override fun actionConfigurations(vararg actionConfigurations: Any): Unit =
        actionConfigurations(actionConfigurations.toList())

    /**
     * @param applicationId The unique identifier of the Amazon Q Business application. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param authenticationDetail The authentication configuration details for the data accessor.
     * This specifies how the ISV authenticates when accessing data through this data accessor.
     */
    override fun authenticationDetail(authenticationDetail: IResolvable) {
      cdkBuilder.authenticationDetail(authenticationDetail.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param authenticationDetail The authentication configuration details for the data accessor.
     * This specifies how the ISV authenticates when accessing data through this data accessor.
     */
    override
        fun authenticationDetail(authenticationDetail: CfnDataAccessor.DataAccessorAuthenticationDetailProperty) {
      cdkBuilder.authenticationDetail(authenticationDetail.let(CfnDataAccessor.DataAccessorAuthenticationDetailProperty.Companion::unwrap))
    }

    /**
     * @param authenticationDetail The authentication configuration details for the data accessor.
     * This specifies how the ISV authenticates when accessing data through this data accessor.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f183b7c94a4af26e13639e0938e12cca3cf21bb50dfe66f9cffd6987b0ac2a0")
    override
        fun authenticationDetail(authenticationDetail: CfnDataAccessor.DataAccessorAuthenticationDetailProperty.Builder.() -> Unit):
        Unit =
        authenticationDetail(CfnDataAccessor.DataAccessorAuthenticationDetailProperty(authenticationDetail))

    /**
     * @param displayName The friendly name of the data accessor. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param principal The Amazon Resource Name (ARN) of the IAM role for the ISV associated with
     * this data accessor. 
     */
    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    /**
     * @param tags The tags to associate with the data accessor.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to associate with the data accessor.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.qbusiness.CfnDataAccessorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataAccessorProps,
  ) : CdkObject(cdkObject),
      CfnDataAccessorProps {
    /**
     * A list of action configurations specifying the allowed actions and any associated filters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-actionconfigurations)
     */
    override fun actionConfigurations(): Any = unwrap(this).getActionConfigurations()

    /**
     * The unique identifier of the Amazon Q Business application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-applicationid)
     */
    override fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * The authentication configuration details for the data accessor.
     *
     * This specifies how the ISV authenticates when accessing data through this data accessor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-authenticationdetail)
     */
    override fun authenticationDetail(): Any? = unwrap(this).getAuthenticationDetail()

    /**
     * The friendly name of the data accessor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-displayname)
     */
    override fun displayName(): String = unwrap(this).getDisplayName()

    /**
     * The Amazon Resource Name (ARN) of the IAM role for the ISV associated with this data
     * accessor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-principal)
     */
    override fun principal(): String = unwrap(this).getPrincipal()

    /**
     * The tags to associate with the data accessor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataAccessorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataAccessorProps):
        CfnDataAccessorProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDataAccessorProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataAccessorProps):
        software.amazon.awscdk.services.qbusiness.CfnDataAccessorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.qbusiness.CfnDataAccessorProps
  }
}
