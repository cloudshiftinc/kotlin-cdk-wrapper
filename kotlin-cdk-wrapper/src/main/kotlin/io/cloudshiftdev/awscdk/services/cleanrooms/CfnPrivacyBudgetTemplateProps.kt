@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cleanrooms

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
 * Properties for defining a `CfnPrivacyBudgetTemplate`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
 * CfnPrivacyBudgetTemplateProps cfnPrivacyBudgetTemplateProps =
 * CfnPrivacyBudgetTemplateProps.builder()
 * .autoRefresh("autoRefresh")
 * .membershipIdentifier("membershipIdentifier")
 * .parameters(ParametersProperty.builder()
 * .epsilon(123)
 * .usersNoisePerQuery(123)
 * .build())
 * .privacyBudgetType("privacyBudgetType")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-privacybudgettemplate.html)
 */
public interface CfnPrivacyBudgetTemplateProps {
  /**
   * How often the privacy budget refreshes.
   *
   *
   * If you plan to regularly bring new data into the collaboration, use `CALENDAR_MONTH` to
   * automatically get a new privacy budget for the collaboration every calendar month. Choosing this
   * option allows arbitrary amounts of information to be revealed about rows of the data when
   * repeatedly queried across refreshes. Avoid choosing this if the same rows will be repeatedly
   * queried between privacy budget refreshes.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-privacybudgettemplate.html#cfn-cleanrooms-privacybudgettemplate-autorefresh)
   */
  public fun autoRefresh(): String

  /**
   * The identifier for a membership resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-privacybudgettemplate.html#cfn-cleanrooms-privacybudgettemplate-membershipidentifier)
   */
  public fun membershipIdentifier(): String

  /**
   * Specifies the epislon and noise parameters for the privacy budget template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-privacybudgettemplate.html#cfn-cleanrooms-privacybudgettemplate-parameters)
   */
  public fun parameters(): Any

  /**
   * Specifies the type of the privacy budget template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-privacybudgettemplate.html#cfn-cleanrooms-privacybudgettemplate-privacybudgettype)
   */
  public fun privacyBudgetType(): String

  /**
   * An arbitrary set of tags (key-value pairs) for this cleanrooms privacy budget template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-privacybudgettemplate.html#cfn-cleanrooms-privacybudgettemplate-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnPrivacyBudgetTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoRefresh How often the privacy budget refreshes. 
     *
     * If you plan to regularly bring new data into the collaboration, use `CALENDAR_MONTH` to
     * automatically get a new privacy budget for the collaboration every calendar month. Choosing this
     * option allows arbitrary amounts of information to be revealed about rows of the data when
     * repeatedly queried across refreshes. Avoid choosing this if the same rows will be repeatedly
     * queried between privacy budget refreshes.
     */
    public fun autoRefresh(autoRefresh: String)

    /**
     * @param membershipIdentifier The identifier for a membership resource. 
     */
    public fun membershipIdentifier(membershipIdentifier: String)

    /**
     * @param parameters Specifies the epislon and noise parameters for the privacy budget template.
     * 
     */
    public fun parameters(parameters: IResolvable)

    /**
     * @param parameters Specifies the epislon and noise parameters for the privacy budget template.
     * 
     */
    public fun parameters(parameters: CfnPrivacyBudgetTemplate.ParametersProperty)

    /**
     * @param parameters Specifies the epislon and noise parameters for the privacy budget template.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3939c37a7b4d7d65b82ddc35ec73b3269d743b71a636f074ebbb7054a1612847")
    public
        fun parameters(parameters: CfnPrivacyBudgetTemplate.ParametersProperty.Builder.() -> Unit)

    /**
     * @param privacyBudgetType Specifies the type of the privacy budget template. 
     */
    public fun privacyBudgetType(privacyBudgetType: String)

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for this cleanrooms privacy budget
     * template.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for this cleanrooms privacy budget
     * template.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplateProps.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplateProps.builder()

    /**
     * @param autoRefresh How often the privacy budget refreshes. 
     *
     * If you plan to regularly bring new data into the collaboration, use `CALENDAR_MONTH` to
     * automatically get a new privacy budget for the collaboration every calendar month. Choosing this
     * option allows arbitrary amounts of information to be revealed about rows of the data when
     * repeatedly queried across refreshes. Avoid choosing this if the same rows will be repeatedly
     * queried between privacy budget refreshes.
     */
    override fun autoRefresh(autoRefresh: String) {
      cdkBuilder.autoRefresh(autoRefresh)
    }

    /**
     * @param membershipIdentifier The identifier for a membership resource. 
     */
    override fun membershipIdentifier(membershipIdentifier: String) {
      cdkBuilder.membershipIdentifier(membershipIdentifier)
    }

    /**
     * @param parameters Specifies the epislon and noise parameters for the privacy budget template.
     * 
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

    /**
     * @param parameters Specifies the epislon and noise parameters for the privacy budget template.
     * 
     */
    override fun parameters(parameters: CfnPrivacyBudgetTemplate.ParametersProperty) {
      cdkBuilder.parameters(parameters.let(CfnPrivacyBudgetTemplate.ParametersProperty::unwrap))
    }

    /**
     * @param parameters Specifies the epislon and noise parameters for the privacy budget template.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3939c37a7b4d7d65b82ddc35ec73b3269d743b71a636f074ebbb7054a1612847")
    override
        fun parameters(parameters: CfnPrivacyBudgetTemplate.ParametersProperty.Builder.() -> Unit):
        Unit = parameters(CfnPrivacyBudgetTemplate.ParametersProperty(parameters))

    /**
     * @param privacyBudgetType Specifies the type of the privacy budget template. 
     */
    override fun privacyBudgetType(privacyBudgetType: String) {
      cdkBuilder.privacyBudgetType(privacyBudgetType)
    }

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for this cleanrooms privacy budget
     * template.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for this cleanrooms privacy budget
     * template.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplateProps,
  ) : CdkObject(cdkObject), CfnPrivacyBudgetTemplateProps {
    /**
     * How often the privacy budget refreshes.
     *
     *
     * If you plan to regularly bring new data into the collaboration, use `CALENDAR_MONTH` to
     * automatically get a new privacy budget for the collaboration every calendar month. Choosing this
     * option allows arbitrary amounts of information to be revealed about rows of the data when
     * repeatedly queried across refreshes. Avoid choosing this if the same rows will be repeatedly
     * queried between privacy budget refreshes.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-privacybudgettemplate.html#cfn-cleanrooms-privacybudgettemplate-autorefresh)
     */
    override fun autoRefresh(): String = unwrap(this).getAutoRefresh()

    /**
     * The identifier for a membership resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-privacybudgettemplate.html#cfn-cleanrooms-privacybudgettemplate-membershipidentifier)
     */
    override fun membershipIdentifier(): String = unwrap(this).getMembershipIdentifier()

    /**
     * Specifies the epislon and noise parameters for the privacy budget template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-privacybudgettemplate.html#cfn-cleanrooms-privacybudgettemplate-parameters)
     */
    override fun parameters(): Any = unwrap(this).getParameters()

    /**
     * Specifies the type of the privacy budget template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-privacybudgettemplate.html#cfn-cleanrooms-privacybudgettemplate-privacybudgettype)
     */
    override fun privacyBudgetType(): String = unwrap(this).getPrivacyBudgetType()

    /**
     * An arbitrary set of tags (key-value pairs) for this cleanrooms privacy budget template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-privacybudgettemplate.html#cfn-cleanrooms-privacybudgettemplate-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPrivacyBudgetTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplateProps):
        CfnPrivacyBudgetTemplateProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnPrivacyBudgetTemplateProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPrivacyBudgetTemplateProps):
        software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplateProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplateProps
  }
}
