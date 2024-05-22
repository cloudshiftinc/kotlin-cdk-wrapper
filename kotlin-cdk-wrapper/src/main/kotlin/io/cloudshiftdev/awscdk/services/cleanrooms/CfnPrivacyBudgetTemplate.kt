@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cleanrooms

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
 * An object that defines the privacy budget template.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
 * CfnPrivacyBudgetTemplate cfnPrivacyBudgetTemplate = CfnPrivacyBudgetTemplate.Builder.create(this,
 * "MyCfnPrivacyBudgetTemplate")
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
public open class CfnPrivacyBudgetTemplate(
  cdkObject: software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplate,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPrivacyBudgetTemplateProps,
  ) :
      this(software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPrivacyBudgetTemplateProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPrivacyBudgetTemplateProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPrivacyBudgetTemplateProps(props)
  )

  /**
   * The ARN of the privacy budget template.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ARN of the collaboration that contains this privacy budget template.
   */
  public open fun attrCollaborationArn(): String = unwrap(this).getAttrCollaborationArn()

  /**
   * The unique ID of the collaboration that contains this privacy budget template.
   */
  public open fun attrCollaborationIdentifier(): String =
      unwrap(this).getAttrCollaborationIdentifier()

  /**
   * The Amazon Resource Name (ARN) of the member who created the privacy budget template.
   */
  public open fun attrMembershipArn(): String = unwrap(this).getAttrMembershipArn()

  /**
   * A unique identifier for one of your memberships for a collaboration.
   *
   * The privacy budget template is created in the collaboration that this membership belongs to.
   * Accepts a membership ID.
   */
  public open fun attrPrivacyBudgetTemplateIdentifier(): String =
      unwrap(this).getAttrPrivacyBudgetTemplateIdentifier()

  /**
   * How often the privacy budget refreshes.
   */
  public open fun autoRefresh(): String = unwrap(this).getAutoRefresh()

  /**
   * How often the privacy budget refreshes.
   */
  public open fun autoRefresh(`value`: String) {
    unwrap(this).setAutoRefresh(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The identifier for a membership resource.
   */
  public open fun membershipIdentifier(): String = unwrap(this).getMembershipIdentifier()

  /**
   * The identifier for a membership resource.
   */
  public open fun membershipIdentifier(`value`: String) {
    unwrap(this).setMembershipIdentifier(`value`)
  }

  /**
   * Specifies the epislon and noise parameters for the privacy budget template.
   */
  public open fun parameters(): Any = unwrap(this).getParameters()

  /**
   * Specifies the epislon and noise parameters for the privacy budget template.
   */
  public open fun parameters(`value`: IResolvable) {
    unwrap(this).setParameters(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies the epislon and noise parameters for the privacy budget template.
   */
  public open fun parameters(`value`: ParametersProperty) {
    unwrap(this).setParameters(`value`.let(ParametersProperty.Companion::unwrap))
  }

  /**
   * Specifies the epislon and noise parameters for the privacy budget template.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("17f1a856e6a243445ca1547fc7b18d136ee5d18d64120adf860743610bba9970")
  public open fun parameters(`value`: ParametersProperty.Builder.() -> Unit): Unit =
      parameters(ParametersProperty(`value`))

  /**
   * Specifies the type of the privacy budget template.
   */
  public open fun privacyBudgetType(): String = unwrap(this).getPrivacyBudgetType()

  /**
   * Specifies the type of the privacy budget template.
   */
  public open fun privacyBudgetType(`value`: String) {
    unwrap(this).setPrivacyBudgetType(`value`)
  }

  /**
   * An arbitrary set of tags (key-value pairs) for this cleanrooms privacy budget template.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An arbitrary set of tags (key-value pairs) for this cleanrooms privacy budget template.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An arbitrary set of tags (key-value pairs) for this cleanrooms privacy budget template.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplate].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param autoRefresh How often the privacy budget refreshes. 
     */
    public fun autoRefresh(autoRefresh: String)

    /**
     * The identifier for a membership resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-privacybudgettemplate.html#cfn-cleanrooms-privacybudgettemplate-membershipidentifier)
     * @param membershipIdentifier The identifier for a membership resource. 
     */
    public fun membershipIdentifier(membershipIdentifier: String)

    /**
     * Specifies the epislon and noise parameters for the privacy budget template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-privacybudgettemplate.html#cfn-cleanrooms-privacybudgettemplate-parameters)
     * @param parameters Specifies the epislon and noise parameters for the privacy budget template.
     * 
     */
    public fun parameters(parameters: IResolvable)

    /**
     * Specifies the epislon and noise parameters for the privacy budget template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-privacybudgettemplate.html#cfn-cleanrooms-privacybudgettemplate-parameters)
     * @param parameters Specifies the epislon and noise parameters for the privacy budget template.
     * 
     */
    public fun parameters(parameters: ParametersProperty)

    /**
     * Specifies the epislon and noise parameters for the privacy budget template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-privacybudgettemplate.html#cfn-cleanrooms-privacybudgettemplate-parameters)
     * @param parameters Specifies the epislon and noise parameters for the privacy budget template.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af41cd37bd4b36eee0a864b98fd9c69bb6791dda6387fc56bd808ab4c95df1df")
    public fun parameters(parameters: ParametersProperty.Builder.() -> Unit)

    /**
     * Specifies the type of the privacy budget template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-privacybudgettemplate.html#cfn-cleanrooms-privacybudgettemplate-privacybudgettype)
     * @param privacyBudgetType Specifies the type of the privacy budget template. 
     */
    public fun privacyBudgetType(privacyBudgetType: String)

    /**
     * An arbitrary set of tags (key-value pairs) for this cleanrooms privacy budget template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-privacybudgettemplate.html#cfn-cleanrooms-privacybudgettemplate-tags)
     * @param tags An arbitrary set of tags (key-value pairs) for this cleanrooms privacy budget
     * template. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An arbitrary set of tags (key-value pairs) for this cleanrooms privacy budget template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-privacybudgettemplate.html#cfn-cleanrooms-privacybudgettemplate-tags)
     * @param tags An arbitrary set of tags (key-value pairs) for this cleanrooms privacy budget
     * template. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplate.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplate.Builder.create(scope,
        id)

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
     * @param autoRefresh How often the privacy budget refreshes. 
     */
    override fun autoRefresh(autoRefresh: String) {
      cdkBuilder.autoRefresh(autoRefresh)
    }

    /**
     * The identifier for a membership resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-privacybudgettemplate.html#cfn-cleanrooms-privacybudgettemplate-membershipidentifier)
     * @param membershipIdentifier The identifier for a membership resource. 
     */
    override fun membershipIdentifier(membershipIdentifier: String) {
      cdkBuilder.membershipIdentifier(membershipIdentifier)
    }

    /**
     * Specifies the epislon and noise parameters for the privacy budget template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-privacybudgettemplate.html#cfn-cleanrooms-privacybudgettemplate-parameters)
     * @param parameters Specifies the epislon and noise parameters for the privacy budget template.
     * 
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies the epislon and noise parameters for the privacy budget template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-privacybudgettemplate.html#cfn-cleanrooms-privacybudgettemplate-parameters)
     * @param parameters Specifies the epislon and noise parameters for the privacy budget template.
     * 
     */
    override fun parameters(parameters: ParametersProperty) {
      cdkBuilder.parameters(parameters.let(ParametersProperty.Companion::unwrap))
    }

    /**
     * Specifies the epislon and noise parameters for the privacy budget template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-privacybudgettemplate.html#cfn-cleanrooms-privacybudgettemplate-parameters)
     * @param parameters Specifies the epislon and noise parameters for the privacy budget template.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af41cd37bd4b36eee0a864b98fd9c69bb6791dda6387fc56bd808ab4c95df1df")
    override fun parameters(parameters: ParametersProperty.Builder.() -> Unit): Unit =
        parameters(ParametersProperty(parameters))

    /**
     * Specifies the type of the privacy budget template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-privacybudgettemplate.html#cfn-cleanrooms-privacybudgettemplate-privacybudgettype)
     * @param privacyBudgetType Specifies the type of the privacy budget template. 
     */
    override fun privacyBudgetType(privacyBudgetType: String) {
      cdkBuilder.privacyBudgetType(privacyBudgetType)
    }

    /**
     * An arbitrary set of tags (key-value pairs) for this cleanrooms privacy budget template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-privacybudgettemplate.html#cfn-cleanrooms-privacybudgettemplate-tags)
     * @param tags An arbitrary set of tags (key-value pairs) for this cleanrooms privacy budget
     * template. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An arbitrary set of tags (key-value pairs) for this cleanrooms privacy budget template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-privacybudgettemplate.html#cfn-cleanrooms-privacybudgettemplate-tags)
     * @param tags An arbitrary set of tags (key-value pairs) for this cleanrooms privacy budget
     * template. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPrivacyBudgetTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPrivacyBudgetTemplate(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplate):
        CfnPrivacyBudgetTemplate = CfnPrivacyBudgetTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnPrivacyBudgetTemplate):
        software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplate = wrapped.cdkObject as
        software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplate
  }

  /**
   * Specifies the epislon and noise parameters for the privacy budget template.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * ParametersProperty parametersProperty = ParametersProperty.builder()
   * .epsilon(123)
   * .usersNoisePerQuery(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-privacybudgettemplate-parameters.html)
   */
  public interface ParametersProperty {
    /**
     * The epsilon value that you want to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-privacybudgettemplate-parameters.html#cfn-cleanrooms-privacybudgettemplate-parameters-epsilon)
     */
    public fun epsilon(): Number

    /**
     * Noise added per query is measured in terms of the number of users whose contributions you
     * want to obscure.
     *
     * This value governs the rate at which the privacy budget is depleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-privacybudgettemplate-parameters.html#cfn-cleanrooms-privacybudgettemplate-parameters-usersnoiseperquery)
     */
    public fun usersNoisePerQuery(): Number

    /**
     * A builder for [ParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param epsilon The epsilon value that you want to use. 
       */
      public fun epsilon(epsilon: Number)

      /**
       * @param usersNoisePerQuery Noise added per query is measured in terms of the number of users
       * whose contributions you want to obscure. 
       * This value governs the rate at which the privacy budget is depleted.
       */
      public fun usersNoisePerQuery(usersNoisePerQuery: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplate.ParametersProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplate.ParametersProperty.builder()

      /**
       * @param epsilon The epsilon value that you want to use. 
       */
      override fun epsilon(epsilon: Number) {
        cdkBuilder.epsilon(epsilon)
      }

      /**
       * @param usersNoisePerQuery Noise added per query is measured in terms of the number of users
       * whose contributions you want to obscure. 
       * This value governs the rate at which the privacy budget is depleted.
       */
      override fun usersNoisePerQuery(usersNoisePerQuery: Number) {
        cdkBuilder.usersNoisePerQuery(usersNoisePerQuery)
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplate.ParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplate.ParametersProperty,
    ) : CdkObject(cdkObject), ParametersProperty {
      /**
       * The epsilon value that you want to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-privacybudgettemplate-parameters.html#cfn-cleanrooms-privacybudgettemplate-parameters-epsilon)
       */
      override fun epsilon(): Number = unwrap(this).getEpsilon()

      /**
       * Noise added per query is measured in terms of the number of users whose contributions you
       * want to obscure.
       *
       * This value governs the rate at which the privacy budget is depleted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-privacybudgettemplate-parameters.html#cfn-cleanrooms-privacybudgettemplate-parameters-usersnoiseperquery)
       */
      override fun usersNoisePerQuery(): Number = unwrap(this).getUsersNoisePerQuery()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplate.ParametersProperty):
          ParametersProperty = CdkObjectWrappers.wrap(cdkObject) as? ParametersProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParametersProperty):
          software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplate.ParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplate.ParametersProperty
    }
  }
}
