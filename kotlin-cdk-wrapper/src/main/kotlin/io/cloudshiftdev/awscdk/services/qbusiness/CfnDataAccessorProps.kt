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
public interface CfnDataAccessorProps {
  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-actionconfigurations)
   */
  public fun actionConfigurations(): Any

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-applicationid)
   */
  public fun applicationId(): String? = unwrap(this).getApplicationId()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-displayname)
   */
  public fun displayName(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-principal)
   */
  public fun principal(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDataAccessorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionConfigurations the value to be set. 
     */
    public fun actionConfigurations(actionConfigurations: IResolvable)

    /**
     * @param actionConfigurations the value to be set. 
     */
    public fun actionConfigurations(actionConfigurations: List<Any>)

    /**
     * @param actionConfigurations the value to be set. 
     */
    public fun actionConfigurations(vararg actionConfigurations: Any)

    /**
     * @param applicationId the value to be set.
     */
    public fun applicationId(applicationId: String)

    /**
     * @param displayName the value to be set. 
     */
    public fun displayName(displayName: String)

    /**
     * @param principal the value to be set. 
     */
    public fun principal(principal: String)

    /**
     * @param tags the value to be set.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags the value to be set.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.qbusiness.CfnDataAccessorProps.Builder =
        software.amazon.awscdk.services.qbusiness.CfnDataAccessorProps.builder()

    /**
     * @param actionConfigurations the value to be set. 
     */
    override fun actionConfigurations(actionConfigurations: IResolvable) {
      cdkBuilder.actionConfigurations(actionConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param actionConfigurations the value to be set. 
     */
    override fun actionConfigurations(actionConfigurations: List<Any>) {
      cdkBuilder.actionConfigurations(actionConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param actionConfigurations the value to be set. 
     */
    override fun actionConfigurations(vararg actionConfigurations: Any): Unit =
        actionConfigurations(actionConfigurations.toList())

    /**
     * @param applicationId the value to be set.
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param displayName the value to be set. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param principal the value to be set. 
     */
    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    /**
     * @param tags the value to be set.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags the value to be set.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-actionconfigurations)
     */
    override fun actionConfigurations(): Any = unwrap(this).getActionConfigurations()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-applicationid)
     */
    override fun applicationId(): String? = unwrap(this).getApplicationId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-displayname)
     */
    override fun displayName(): String = unwrap(this).getDisplayName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-dataaccessor.html#cfn-qbusiness-dataaccessor-principal)
     */
    override fun principal(): String = unwrap(this).getPrincipal()

    /**
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
