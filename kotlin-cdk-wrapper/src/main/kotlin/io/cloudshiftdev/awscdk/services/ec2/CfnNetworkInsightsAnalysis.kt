@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a network insights analysis.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnNetworkInsightsAnalysis cfnNetworkInsightsAnalysis =
 * CfnNetworkInsightsAnalysis.Builder.create(this, "MyCfnNetworkInsightsAnalysis")
 * .networkInsightsPathId("networkInsightsPathId")
 * // the properties below are optional
 * .additionalAccounts(List.of("additionalAccounts"))
 * .filterInArns(List.of("filterInArns"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsanalysis.html)
 */
public open class CfnNetworkInsightsAnalysis(
  cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNetworkInsightsAnalysisProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnNetworkInsightsAnalysisProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNetworkInsightsAnalysisProps.Builder.() -> Unit,
  ) : this(scope, id, CfnNetworkInsightsAnalysisProps(props)
  )

  /**
   * The member accounts that contain resources that the path can traverse.
   */
  public open fun additionalAccounts(): List<String> = unwrap(this).getAdditionalAccounts() ?:
      emptyList()

  /**
   * The member accounts that contain resources that the path can traverse.
   */
  public open fun additionalAccounts(`value`: List<String>) {
    unwrap(this).setAdditionalAccounts(`value`)
  }

  /**
   * The member accounts that contain resources that the path can traverse.
   */
  public open fun additionalAccounts(vararg `value`: String): Unit =
      additionalAccounts(`value`.toList())

  /**
   * Potential intermediate components.
   */
  public open fun attrAlternatePathHints(): IResolvable =
      unwrap(this).getAttrAlternatePathHints().let(IResolvable::wrap)

  /**
   * The explanations.
   *
   * For more information, see [Reachability Analyzer explanation
   * codes](https://docs.aws.amazon.com/vpc/latest/reachability/explanation-codes.html) .
   */
  public open fun attrExplanations(): IResolvable =
      unwrap(this).getAttrExplanations().let(IResolvable::wrap)

  /**
   * The components in the path from source to destination.
   */
  public open fun attrForwardPathComponents(): IResolvable =
      unwrap(this).getAttrForwardPathComponents().let(IResolvable::wrap)

  /**
   * The Amazon Resource Name (ARN) of the network insights analysis.
   */
  public open fun attrNetworkInsightsAnalysisArn(): String =
      unwrap(this).getAttrNetworkInsightsAnalysisArn()

  /**
   * The ID of the network insights analysis.
   */
  public open fun attrNetworkInsightsAnalysisId(): String =
      unwrap(this).getAttrNetworkInsightsAnalysisId()

  /**
   * Indicates whether the destination is reachable from the source.
   */
  public open fun attrNetworkPathFound(): IResolvable =
      unwrap(this).getAttrNetworkPathFound().let(IResolvable::wrap)

  /**
   * The components in the path from destination to source.
   */
  public open fun attrReturnPathComponents(): IResolvable =
      unwrap(this).getAttrReturnPathComponents().let(IResolvable::wrap)

  /**
   * The time the analysis started.
   */
  public open fun attrStartDate(): String = unwrap(this).getAttrStartDate()

  /**
   * The status of the network insights analysis.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The status message, if the status is `failed` .
   */
  public open fun attrStatusMessage(): String = unwrap(this).getAttrStatusMessage()

  /**
   * The IDs of potential intermediate accounts.
   */
  public open fun attrSuggestedAccounts(): List<String> = unwrap(this).getAttrSuggestedAccounts()

  /**
   * The Amazon Resource Names (ARN) of the resources that the path must traverse.
   */
  public open fun filterInArns(): List<String> = unwrap(this).getFilterInArns() ?: emptyList()

  /**
   * The Amazon Resource Names (ARN) of the resources that the path must traverse.
   */
  public open fun filterInArns(`value`: List<String>) {
    unwrap(this).setFilterInArns(`value`)
  }

  /**
   * The Amazon Resource Names (ARN) of the resources that the path must traverse.
   */
  public open fun filterInArns(vararg `value`: String): Unit = filterInArns(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The ID of the path.
   */
  public open fun networkInsightsPathId(): String = unwrap(this).getNetworkInsightsPathId()

  /**
   * The ID of the path.
   */
  public open fun networkInsightsPathId(`value`: String) {
    unwrap(this).setNetworkInsightsPathId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to apply.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to apply.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags to apply.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnNetworkInsightsAnalysis].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The member accounts that contain resources that the path can traverse.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsanalysis.html#cfn-ec2-networkinsightsanalysis-additionalaccounts)
     * @param additionalAccounts The member accounts that contain resources that the path can
     * traverse. 
     */
    public fun additionalAccounts(additionalAccounts: List<String>)

    /**
     * The member accounts that contain resources that the path can traverse.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsanalysis.html#cfn-ec2-networkinsightsanalysis-additionalaccounts)
     * @param additionalAccounts The member accounts that contain resources that the path can
     * traverse. 
     */
    public fun additionalAccounts(vararg additionalAccounts: String)

    /**
     * The Amazon Resource Names (ARN) of the resources that the path must traverse.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsanalysis.html#cfn-ec2-networkinsightsanalysis-filterinarns)
     * @param filterInArns The Amazon Resource Names (ARN) of the resources that the path must
     * traverse. 
     */
    public fun filterInArns(filterInArns: List<String>)

    /**
     * The Amazon Resource Names (ARN) of the resources that the path must traverse.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsanalysis.html#cfn-ec2-networkinsightsanalysis-filterinarns)
     * @param filterInArns The Amazon Resource Names (ARN) of the resources that the path must
     * traverse. 
     */
    public fun filterInArns(vararg filterInArns: String)

    /**
     * The ID of the path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsanalysis.html#cfn-ec2-networkinsightsanalysis-networkinsightspathid)
     * @param networkInsightsPathId The ID of the path. 
     */
    public fun networkInsightsPathId(networkInsightsPathId: String)

    /**
     * The tags to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsanalysis.html#cfn-ec2-networkinsightsanalysis-tags)
     * @param tags The tags to apply. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsanalysis.html#cfn-ec2-networkinsightsanalysis-tags)
     * @param tags The tags to apply. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.Builder.create(scope, id)

    /**
     * The member accounts that contain resources that the path can traverse.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsanalysis.html#cfn-ec2-networkinsightsanalysis-additionalaccounts)
     * @param additionalAccounts The member accounts that contain resources that the path can
     * traverse. 
     */
    override fun additionalAccounts(additionalAccounts: List<String>) {
      cdkBuilder.additionalAccounts(additionalAccounts)
    }

    /**
     * The member accounts that contain resources that the path can traverse.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsanalysis.html#cfn-ec2-networkinsightsanalysis-additionalaccounts)
     * @param additionalAccounts The member accounts that contain resources that the path can
     * traverse. 
     */
    override fun additionalAccounts(vararg additionalAccounts: String): Unit =
        additionalAccounts(additionalAccounts.toList())

    /**
     * The Amazon Resource Names (ARN) of the resources that the path must traverse.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsanalysis.html#cfn-ec2-networkinsightsanalysis-filterinarns)
     * @param filterInArns The Amazon Resource Names (ARN) of the resources that the path must
     * traverse. 
     */
    override fun filterInArns(filterInArns: List<String>) {
      cdkBuilder.filterInArns(filterInArns)
    }

    /**
     * The Amazon Resource Names (ARN) of the resources that the path must traverse.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsanalysis.html#cfn-ec2-networkinsightsanalysis-filterinarns)
     * @param filterInArns The Amazon Resource Names (ARN) of the resources that the path must
     * traverse. 
     */
    override fun filterInArns(vararg filterInArns: String): Unit =
        filterInArns(filterInArns.toList())

    /**
     * The ID of the path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsanalysis.html#cfn-ec2-networkinsightsanalysis-networkinsightspathid)
     * @param networkInsightsPathId The ID of the path. 
     */
    override fun networkInsightsPathId(networkInsightsPathId: String) {
      cdkBuilder.networkInsightsPathId(networkInsightsPathId)
    }

    /**
     * The tags to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsanalysis.html#cfn-ec2-networkinsightsanalysis-tags)
     * @param tags The tags to apply. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsanalysis.html#cfn-ec2-networkinsightsanalysis-tags)
     * @param tags The tags to apply. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNetworkInsightsAnalysis {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNetworkInsightsAnalysis(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis):
        CfnNetworkInsightsAnalysis = CfnNetworkInsightsAnalysis(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkInsightsAnalysis):
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis
  }

  /**
   * Describes an additional detail for a path analysis.
   *
   * For more information, see [Reachability Analyzer additional detail
   * codes](https://docs.aws.amazon.com/vpc/latest/reachability/additional-detail-codes.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * AdditionalDetailProperty additionalDetailProperty = AdditionalDetailProperty.builder()
   * .additionalDetailType("additionalDetailType")
   * .component(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .loadBalancers(List.of(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build()))
   * .serviceName("serviceName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-additionaldetail.html)
   */
  public interface AdditionalDetailProperty {
    /**
     * The additional detail code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-additionaldetail.html#cfn-ec2-networkinsightsanalysis-additionaldetail-additionaldetailtype)
     */
    public fun additionalDetailType(): String? = unwrap(this).getAdditionalDetailType()

    /**
     * The path component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-additionaldetail.html#cfn-ec2-networkinsightsanalysis-additionaldetail-component)
     */
    public fun component(): Any? = unwrap(this).getComponent()

    /**
     * The load balancers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-additionaldetail.html#cfn-ec2-networkinsightsanalysis-additionaldetail-loadbalancers)
     */
    public fun loadBalancers(): Any? = unwrap(this).getLoadBalancers()

    /**
     * The name of the VPC endpoint service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-additionaldetail.html#cfn-ec2-networkinsightsanalysis-additionaldetail-servicename)
     */
    public fun serviceName(): String? = unwrap(this).getServiceName()

    /**
     * A builder for [AdditionalDetailProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param additionalDetailType The additional detail code.
       */
      public fun additionalDetailType(additionalDetailType: String)

      /**
       * @param component The path component.
       */
      public fun component(component: IResolvable)

      /**
       * @param component The path component.
       */
      public fun component(component: AnalysisComponentProperty)

      /**
       * @param component The path component.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f87cbbad2b80f87041b5c71b87006ec83d7455fa611376c460436099063db586")
      public fun component(component: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param loadBalancers The load balancers.
       */
      public fun loadBalancers(loadBalancers: IResolvable)

      /**
       * @param loadBalancers The load balancers.
       */
      public fun loadBalancers(loadBalancers: List<Any>)

      /**
       * @param loadBalancers The load balancers.
       */
      public fun loadBalancers(vararg loadBalancers: Any)

      /**
       * @param serviceName The name of the VPC endpoint service.
       */
      public fun serviceName(serviceName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AdditionalDetailProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AdditionalDetailProperty.builder()

      /**
       * @param additionalDetailType The additional detail code.
       */
      override fun additionalDetailType(additionalDetailType: String) {
        cdkBuilder.additionalDetailType(additionalDetailType)
      }

      /**
       * @param component The path component.
       */
      override fun component(component: IResolvable) {
        cdkBuilder.component(component.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param component The path component.
       */
      override fun component(component: AnalysisComponentProperty) {
        cdkBuilder.component(component.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param component The path component.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f87cbbad2b80f87041b5c71b87006ec83d7455fa611376c460436099063db586")
      override fun component(component: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          component(AnalysisComponentProperty(component))

      /**
       * @param loadBalancers The load balancers.
       */
      override fun loadBalancers(loadBalancers: IResolvable) {
        cdkBuilder.loadBalancers(loadBalancers.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param loadBalancers The load balancers.
       */
      override fun loadBalancers(loadBalancers: List<Any>) {
        cdkBuilder.loadBalancers(loadBalancers.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param loadBalancers The load balancers.
       */
      override fun loadBalancers(vararg loadBalancers: Any): Unit =
          loadBalancers(loadBalancers.toList())

      /**
       * @param serviceName The name of the VPC endpoint service.
       */
      override fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AdditionalDetailProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AdditionalDetailProperty,
    ) : CdkObject(cdkObject), AdditionalDetailProperty {
      /**
       * The additional detail code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-additionaldetail.html#cfn-ec2-networkinsightsanalysis-additionaldetail-additionaldetailtype)
       */
      override fun additionalDetailType(): String? = unwrap(this).getAdditionalDetailType()

      /**
       * The path component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-additionaldetail.html#cfn-ec2-networkinsightsanalysis-additionaldetail-component)
       */
      override fun component(): Any? = unwrap(this).getComponent()

      /**
       * The load balancers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-additionaldetail.html#cfn-ec2-networkinsightsanalysis-additionaldetail-loadbalancers)
       */
      override fun loadBalancers(): Any? = unwrap(this).getLoadBalancers()

      /**
       * The name of the VPC endpoint service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-additionaldetail.html#cfn-ec2-networkinsightsanalysis-additionaldetail-servicename)
       */
      override fun serviceName(): String? = unwrap(this).getServiceName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AdditionalDetailProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AdditionalDetailProperty):
          AdditionalDetailProperty = CdkObjectWrappers.wrap(cdkObject) as? AdditionalDetailProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdditionalDetailProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AdditionalDetailProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AdditionalDetailProperty
    }
  }

  /**
   * Describes an potential intermediate component of a feasible path.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * AlternatePathHintProperty alternatePathHintProperty = AlternatePathHintProperty.builder()
   * .componentArn("componentArn")
   * .componentId("componentId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-alternatepathhint.html)
   */
  public interface AlternatePathHintProperty {
    /**
     * The Amazon Resource Name (ARN) of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-alternatepathhint.html#cfn-ec2-networkinsightsanalysis-alternatepathhint-componentarn)
     */
    public fun componentArn(): String? = unwrap(this).getComponentArn()

    /**
     * The ID of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-alternatepathhint.html#cfn-ec2-networkinsightsanalysis-alternatepathhint-componentid)
     */
    public fun componentId(): String? = unwrap(this).getComponentId()

    /**
     * A builder for [AlternatePathHintProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param componentArn The Amazon Resource Name (ARN) of the component.
       */
      public fun componentArn(componentArn: String)

      /**
       * @param componentId The ID of the component.
       */
      public fun componentId(componentId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AlternatePathHintProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AlternatePathHintProperty.builder()

      /**
       * @param componentArn The Amazon Resource Name (ARN) of the component.
       */
      override fun componentArn(componentArn: String) {
        cdkBuilder.componentArn(componentArn)
      }

      /**
       * @param componentId The ID of the component.
       */
      override fun componentId(componentId: String) {
        cdkBuilder.componentId(componentId)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AlternatePathHintProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AlternatePathHintProperty,
    ) : CdkObject(cdkObject), AlternatePathHintProperty {
      /**
       * The Amazon Resource Name (ARN) of the component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-alternatepathhint.html#cfn-ec2-networkinsightsanalysis-alternatepathhint-componentarn)
       */
      override fun componentArn(): String? = unwrap(this).getComponentArn()

      /**
       * The ID of the component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-alternatepathhint.html#cfn-ec2-networkinsightsanalysis-alternatepathhint-componentid)
       */
      override fun componentId(): String? = unwrap(this).getComponentId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AlternatePathHintProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AlternatePathHintProperty):
          AlternatePathHintProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AlternatePathHintProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlternatePathHintProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AlternatePathHintProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AlternatePathHintProperty
    }
  }

  /**
   * Describes a network access control (ACL) rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * AnalysisAclRuleProperty analysisAclRuleProperty = AnalysisAclRuleProperty.builder()
   * .cidr("cidr")
   * .egress(false)
   * .portRange(PortRangeProperty.builder()
   * .from(123)
   * .to(123)
   * .build())
   * .protocol("protocol")
   * .ruleAction("ruleAction")
   * .ruleNumber(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisaclrule.html)
   */
  public interface AnalysisAclRuleProperty {
    /**
     * The IPv4 address range, in CIDR notation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisaclrule.html#cfn-ec2-networkinsightsanalysis-analysisaclrule-cidr)
     */
    public fun cidr(): String? = unwrap(this).getCidr()

    /**
     * Indicates whether the rule is an outbound rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisaclrule.html#cfn-ec2-networkinsightsanalysis-analysisaclrule-egress)
     */
    public fun egress(): Any? = unwrap(this).getEgress()

    /**
     * The range of ports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisaclrule.html#cfn-ec2-networkinsightsanalysis-analysisaclrule-portrange)
     */
    public fun portRange(): Any? = unwrap(this).getPortRange()

    /**
     * The protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisaclrule.html#cfn-ec2-networkinsightsanalysis-analysisaclrule-protocol)
     */
    public fun protocol(): String? = unwrap(this).getProtocol()

    /**
     * Indicates whether to allow or deny traffic that matches the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisaclrule.html#cfn-ec2-networkinsightsanalysis-analysisaclrule-ruleaction)
     */
    public fun ruleAction(): String? = unwrap(this).getRuleAction()

    /**
     * The rule number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisaclrule.html#cfn-ec2-networkinsightsanalysis-analysisaclrule-rulenumber)
     */
    public fun ruleNumber(): Number? = unwrap(this).getRuleNumber()

    /**
     * A builder for [AnalysisAclRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cidr The IPv4 address range, in CIDR notation.
       */
      public fun cidr(cidr: String)

      /**
       * @param egress Indicates whether the rule is an outbound rule.
       */
      public fun egress(egress: Boolean)

      /**
       * @param egress Indicates whether the rule is an outbound rule.
       */
      public fun egress(egress: IResolvable)

      /**
       * @param portRange The range of ports.
       */
      public fun portRange(portRange: IResolvable)

      /**
       * @param portRange The range of ports.
       */
      public fun portRange(portRange: PortRangeProperty)

      /**
       * @param portRange The range of ports.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a94b034e546168f34c45588194133a56e943d3e9aeabfc5e67024cee93f1186c")
      public fun portRange(portRange: PortRangeProperty.Builder.() -> Unit)

      /**
       * @param protocol The protocol.
       */
      public fun protocol(protocol: String)

      /**
       * @param ruleAction Indicates whether to allow or deny traffic that matches the rule.
       */
      public fun ruleAction(ruleAction: String)

      /**
       * @param ruleNumber The rule number.
       */
      public fun ruleNumber(ruleNumber: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty.builder()

      /**
       * @param cidr The IPv4 address range, in CIDR notation.
       */
      override fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
      }

      /**
       * @param egress Indicates whether the rule is an outbound rule.
       */
      override fun egress(egress: Boolean) {
        cdkBuilder.egress(egress)
      }

      /**
       * @param egress Indicates whether the rule is an outbound rule.
       */
      override fun egress(egress: IResolvable) {
        cdkBuilder.egress(egress.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param portRange The range of ports.
       */
      override fun portRange(portRange: IResolvable) {
        cdkBuilder.portRange(portRange.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param portRange The range of ports.
       */
      override fun portRange(portRange: PortRangeProperty) {
        cdkBuilder.portRange(portRange.let(PortRangeProperty.Companion::unwrap))
      }

      /**
       * @param portRange The range of ports.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a94b034e546168f34c45588194133a56e943d3e9aeabfc5e67024cee93f1186c")
      override fun portRange(portRange: PortRangeProperty.Builder.() -> Unit): Unit =
          portRange(PortRangeProperty(portRange))

      /**
       * @param protocol The protocol.
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      /**
       * @param ruleAction Indicates whether to allow or deny traffic that matches the rule.
       */
      override fun ruleAction(ruleAction: String) {
        cdkBuilder.ruleAction(ruleAction)
      }

      /**
       * @param ruleNumber The rule number.
       */
      override fun ruleNumber(ruleNumber: Number) {
        cdkBuilder.ruleNumber(ruleNumber)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty,
    ) : CdkObject(cdkObject), AnalysisAclRuleProperty {
      /**
       * The IPv4 address range, in CIDR notation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisaclrule.html#cfn-ec2-networkinsightsanalysis-analysisaclrule-cidr)
       */
      override fun cidr(): String? = unwrap(this).getCidr()

      /**
       * Indicates whether the rule is an outbound rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisaclrule.html#cfn-ec2-networkinsightsanalysis-analysisaclrule-egress)
       */
      override fun egress(): Any? = unwrap(this).getEgress()

      /**
       * The range of ports.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisaclrule.html#cfn-ec2-networkinsightsanalysis-analysisaclrule-portrange)
       */
      override fun portRange(): Any? = unwrap(this).getPortRange()

      /**
       * The protocol.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisaclrule.html#cfn-ec2-networkinsightsanalysis-analysisaclrule-protocol)
       */
      override fun protocol(): String? = unwrap(this).getProtocol()

      /**
       * Indicates whether to allow or deny traffic that matches the rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisaclrule.html#cfn-ec2-networkinsightsanalysis-analysisaclrule-ruleaction)
       */
      override fun ruleAction(): String? = unwrap(this).getRuleAction()

      /**
       * The rule number.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisaclrule.html#cfn-ec2-networkinsightsanalysis-analysisaclrule-rulenumber)
       */
      override fun ruleNumber(): Number? = unwrap(this).getRuleNumber()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisAclRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty):
          AnalysisAclRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? AnalysisAclRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisAclRuleProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty
    }
  }

  /**
   * Describes a path component.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * AnalysisComponentProperty analysisComponentProperty = AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysiscomponent.html)
   */
  public interface AnalysisComponentProperty {
    /**
     * The Amazon Resource Name (ARN) of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysiscomponent.html#cfn-ec2-networkinsightsanalysis-analysiscomponent-arn)
     */
    public fun arn(): String? = unwrap(this).getArn()

    /**
     * The ID of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysiscomponent.html#cfn-ec2-networkinsightsanalysis-analysiscomponent-id)
     */
    public fun id(): String? = unwrap(this).getId()

    /**
     * A builder for [AnalysisComponentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The Amazon Resource Name (ARN) of the component.
       */
      public fun arn(arn: String)

      /**
       * @param id The ID of the component.
       */
      public fun id(id: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty.builder()

      /**
       * @param arn The Amazon Resource Name (ARN) of the component.
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      /**
       * @param id The ID of the component.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty,
    ) : CdkObject(cdkObject), AnalysisComponentProperty {
      /**
       * The Amazon Resource Name (ARN) of the component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysiscomponent.html#cfn-ec2-networkinsightsanalysis-analysiscomponent-arn)
       */
      override fun arn(): String? = unwrap(this).getArn()

      /**
       * The ID of the component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysiscomponent.html#cfn-ec2-networkinsightsanalysis-analysiscomponent-id)
       */
      override fun id(): String? = unwrap(this).getId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisComponentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty):
          AnalysisComponentProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AnalysisComponentProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisComponentProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty
    }
  }

  /**
   * Describes a load balancer listener.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * AnalysisLoadBalancerListenerProperty analysisLoadBalancerListenerProperty =
   * AnalysisLoadBalancerListenerProperty.builder()
   * .instancePort(123)
   * .loadBalancerPort(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisloadbalancerlistener.html)
   */
  public interface AnalysisLoadBalancerListenerProperty {
    /**
     * [Classic Load Balancers] The back-end port for the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisloadbalancerlistener.html#cfn-ec2-networkinsightsanalysis-analysisloadbalancerlistener-instanceport)
     */
    public fun instancePort(): Number? = unwrap(this).getInstancePort()

    /**
     * The port on which the load balancer is listening.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisloadbalancerlistener.html#cfn-ec2-networkinsightsanalysis-analysisloadbalancerlistener-loadbalancerport)
     */
    public fun loadBalancerPort(): Number? = unwrap(this).getLoadBalancerPort()

    /**
     * A builder for [AnalysisLoadBalancerListenerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instancePort [Classic Load Balancers] The back-end port for the listener.
       */
      public fun instancePort(instancePort: Number)

      /**
       * @param loadBalancerPort The port on which the load balancer is listening.
       */
      public fun loadBalancerPort(loadBalancerPort: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty.builder()

      /**
       * @param instancePort [Classic Load Balancers] The back-end port for the listener.
       */
      override fun instancePort(instancePort: Number) {
        cdkBuilder.instancePort(instancePort)
      }

      /**
       * @param loadBalancerPort The port on which the load balancer is listening.
       */
      override fun loadBalancerPort(loadBalancerPort: Number) {
        cdkBuilder.loadBalancerPort(loadBalancerPort)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty,
    ) : CdkObject(cdkObject), AnalysisLoadBalancerListenerProperty {
      /**
       * [Classic Load Balancers] The back-end port for the listener.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisloadbalancerlistener.html#cfn-ec2-networkinsightsanalysis-analysisloadbalancerlistener-instanceport)
       */
      override fun instancePort(): Number? = unwrap(this).getInstancePort()

      /**
       * The port on which the load balancer is listening.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisloadbalancerlistener.html#cfn-ec2-networkinsightsanalysis-analysisloadbalancerlistener-loadbalancerport)
       */
      override fun loadBalancerPort(): Number? = unwrap(this).getLoadBalancerPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AnalysisLoadBalancerListenerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty):
          AnalysisLoadBalancerListenerProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AnalysisLoadBalancerListenerProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisLoadBalancerListenerProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty
    }
  }

  /**
   * Describes a load balancer target.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * AnalysisLoadBalancerTargetProperty analysisLoadBalancerTargetProperty =
   * AnalysisLoadBalancerTargetProperty.builder()
   * .address("address")
   * .availabilityZone("availabilityZone")
   * .instance(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisloadbalancertarget.html)
   */
  public interface AnalysisLoadBalancerTargetProperty {
    /**
     * The IP address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisloadbalancertarget.html#cfn-ec2-networkinsightsanalysis-analysisloadbalancertarget-address)
     */
    public fun address(): String? = unwrap(this).getAddress()

    /**
     * The Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisloadbalancertarget.html#cfn-ec2-networkinsightsanalysis-analysisloadbalancertarget-availabilityzone)
     */
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * Information about the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisloadbalancertarget.html#cfn-ec2-networkinsightsanalysis-analysisloadbalancertarget-instance)
     */
    public fun instance(): Any? = unwrap(this).getInstance()

    /**
     * The port on which the target is listening.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisloadbalancertarget.html#cfn-ec2-networkinsightsanalysis-analysisloadbalancertarget-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * A builder for [AnalysisLoadBalancerTargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param address The IP address.
       */
      public fun address(address: String)

      /**
       * @param availabilityZone The Availability Zone.
       */
      public fun availabilityZone(availabilityZone: String)

      /**
       * @param instance Information about the instance.
       */
      public fun instance(instance: IResolvable)

      /**
       * @param instance Information about the instance.
       */
      public fun instance(instance: AnalysisComponentProperty)

      /**
       * @param instance Information about the instance.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99c0121ac134ff4330b632d0cf7673bb9de5076daaf8656dadfc64ce2b0c9d44")
      public fun instance(instance: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param port The port on which the target is listening.
       */
      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty.builder()

      /**
       * @param address The IP address.
       */
      override fun address(address: String) {
        cdkBuilder.address(address)
      }

      /**
       * @param availabilityZone The Availability Zone.
       */
      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      /**
       * @param instance Information about the instance.
       */
      override fun instance(instance: IResolvable) {
        cdkBuilder.instance(instance.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param instance Information about the instance.
       */
      override fun instance(instance: AnalysisComponentProperty) {
        cdkBuilder.instance(instance.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param instance Information about the instance.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99c0121ac134ff4330b632d0cf7673bb9de5076daaf8656dadfc64ce2b0c9d44")
      override fun instance(instance: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          instance(AnalysisComponentProperty(instance))

      /**
       * @param port The port on which the target is listening.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty,
    ) : CdkObject(cdkObject), AnalysisLoadBalancerTargetProperty {
      /**
       * The IP address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisloadbalancertarget.html#cfn-ec2-networkinsightsanalysis-analysisloadbalancertarget-address)
       */
      override fun address(): String? = unwrap(this).getAddress()

      /**
       * The Availability Zone.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisloadbalancertarget.html#cfn-ec2-networkinsightsanalysis-analysisloadbalancertarget-availabilityzone)
       */
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      /**
       * Information about the instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisloadbalancertarget.html#cfn-ec2-networkinsightsanalysis-analysisloadbalancertarget-instance)
       */
      override fun instance(): Any? = unwrap(this).getInstance()

      /**
       * The port on which the target is listening.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisloadbalancertarget.html#cfn-ec2-networkinsightsanalysis-analysisloadbalancertarget-port)
       */
      override fun port(): Number? = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AnalysisLoadBalancerTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty):
          AnalysisLoadBalancerTargetProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AnalysisLoadBalancerTargetProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisLoadBalancerTargetProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty
    }
  }

  /**
   * Describes a header.
   *
   * Reflects any changes made by a component as traffic passes through. The fields of an inbound
   * header are null except for the first component of a path.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * AnalysisPacketHeaderProperty analysisPacketHeaderProperty =
   * AnalysisPacketHeaderProperty.builder()
   * .destinationAddresses(List.of("destinationAddresses"))
   * .destinationPortRanges(List.of(PortRangeProperty.builder()
   * .from(123)
   * .to(123)
   * .build()))
   * .protocol("protocol")
   * .sourceAddresses(List.of("sourceAddresses"))
   * .sourcePortRanges(List.of(PortRangeProperty.builder()
   * .from(123)
   * .to(123)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysispacketheader.html)
   */
  public interface AnalysisPacketHeaderProperty {
    /**
     * The destination addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysispacketheader.html#cfn-ec2-networkinsightsanalysis-analysispacketheader-destinationaddresses)
     */
    public fun destinationAddresses(): List<String> = unwrap(this).getDestinationAddresses() ?:
        emptyList()

    /**
     * The destination port ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysispacketheader.html#cfn-ec2-networkinsightsanalysis-analysispacketheader-destinationportranges)
     */
    public fun destinationPortRanges(): Any? = unwrap(this).getDestinationPortRanges()

    /**
     * The protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysispacketheader.html#cfn-ec2-networkinsightsanalysis-analysispacketheader-protocol)
     */
    public fun protocol(): String? = unwrap(this).getProtocol()

    /**
     * The source addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysispacketheader.html#cfn-ec2-networkinsightsanalysis-analysispacketheader-sourceaddresses)
     */
    public fun sourceAddresses(): List<String> = unwrap(this).getSourceAddresses() ?: emptyList()

    /**
     * The source port ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysispacketheader.html#cfn-ec2-networkinsightsanalysis-analysispacketheader-sourceportranges)
     */
    public fun sourcePortRanges(): Any? = unwrap(this).getSourcePortRanges()

    /**
     * A builder for [AnalysisPacketHeaderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationAddresses The destination addresses.
       */
      public fun destinationAddresses(destinationAddresses: List<String>)

      /**
       * @param destinationAddresses The destination addresses.
       */
      public fun destinationAddresses(vararg destinationAddresses: String)

      /**
       * @param destinationPortRanges The destination port ranges.
       */
      public fun destinationPortRanges(destinationPortRanges: IResolvable)

      /**
       * @param destinationPortRanges The destination port ranges.
       */
      public fun destinationPortRanges(destinationPortRanges: List<Any>)

      /**
       * @param destinationPortRanges The destination port ranges.
       */
      public fun destinationPortRanges(vararg destinationPortRanges: Any)

      /**
       * @param protocol The protocol.
       */
      public fun protocol(protocol: String)

      /**
       * @param sourceAddresses The source addresses.
       */
      public fun sourceAddresses(sourceAddresses: List<String>)

      /**
       * @param sourceAddresses The source addresses.
       */
      public fun sourceAddresses(vararg sourceAddresses: String)

      /**
       * @param sourcePortRanges The source port ranges.
       */
      public fun sourcePortRanges(sourcePortRanges: IResolvable)

      /**
       * @param sourcePortRanges The source port ranges.
       */
      public fun sourcePortRanges(sourcePortRanges: List<Any>)

      /**
       * @param sourcePortRanges The source port ranges.
       */
      public fun sourcePortRanges(vararg sourcePortRanges: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty.builder()

      /**
       * @param destinationAddresses The destination addresses.
       */
      override fun destinationAddresses(destinationAddresses: List<String>) {
        cdkBuilder.destinationAddresses(destinationAddresses)
      }

      /**
       * @param destinationAddresses The destination addresses.
       */
      override fun destinationAddresses(vararg destinationAddresses: String): Unit =
          destinationAddresses(destinationAddresses.toList())

      /**
       * @param destinationPortRanges The destination port ranges.
       */
      override fun destinationPortRanges(destinationPortRanges: IResolvable) {
        cdkBuilder.destinationPortRanges(destinationPortRanges.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param destinationPortRanges The destination port ranges.
       */
      override fun destinationPortRanges(destinationPortRanges: List<Any>) {
        cdkBuilder.destinationPortRanges(destinationPortRanges.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param destinationPortRanges The destination port ranges.
       */
      override fun destinationPortRanges(vararg destinationPortRanges: Any): Unit =
          destinationPortRanges(destinationPortRanges.toList())

      /**
       * @param protocol The protocol.
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      /**
       * @param sourceAddresses The source addresses.
       */
      override fun sourceAddresses(sourceAddresses: List<String>) {
        cdkBuilder.sourceAddresses(sourceAddresses)
      }

      /**
       * @param sourceAddresses The source addresses.
       */
      override fun sourceAddresses(vararg sourceAddresses: String): Unit =
          sourceAddresses(sourceAddresses.toList())

      /**
       * @param sourcePortRanges The source port ranges.
       */
      override fun sourcePortRanges(sourcePortRanges: IResolvable) {
        cdkBuilder.sourcePortRanges(sourcePortRanges.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sourcePortRanges The source port ranges.
       */
      override fun sourcePortRanges(sourcePortRanges: List<Any>) {
        cdkBuilder.sourcePortRanges(sourcePortRanges.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param sourcePortRanges The source port ranges.
       */
      override fun sourcePortRanges(vararg sourcePortRanges: Any): Unit =
          sourcePortRanges(sourcePortRanges.toList())

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty,
    ) : CdkObject(cdkObject), AnalysisPacketHeaderProperty {
      /**
       * The destination addresses.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysispacketheader.html#cfn-ec2-networkinsightsanalysis-analysispacketheader-destinationaddresses)
       */
      override fun destinationAddresses(): List<String> = unwrap(this).getDestinationAddresses() ?:
          emptyList()

      /**
       * The destination port ranges.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysispacketheader.html#cfn-ec2-networkinsightsanalysis-analysispacketheader-destinationportranges)
       */
      override fun destinationPortRanges(): Any? = unwrap(this).getDestinationPortRanges()

      /**
       * The protocol.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysispacketheader.html#cfn-ec2-networkinsightsanalysis-analysispacketheader-protocol)
       */
      override fun protocol(): String? = unwrap(this).getProtocol()

      /**
       * The source addresses.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysispacketheader.html#cfn-ec2-networkinsightsanalysis-analysispacketheader-sourceaddresses)
       */
      override fun sourceAddresses(): List<String> = unwrap(this).getSourceAddresses() ?:
          emptyList()

      /**
       * The source port ranges.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysispacketheader.html#cfn-ec2-networkinsightsanalysis-analysispacketheader-sourceportranges)
       */
      override fun sourcePortRanges(): Any? = unwrap(this).getSourcePortRanges()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisPacketHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty):
          AnalysisPacketHeaderProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AnalysisPacketHeaderProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisPacketHeaderProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty
    }
  }

  /**
   * Describes a route table route.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * AnalysisRouteTableRouteProperty analysisRouteTableRouteProperty =
   * AnalysisRouteTableRouteProperty.builder()
   * .destinationCidr("destinationCidr")
   * .destinationPrefixListId("destinationPrefixListId")
   * .egressOnlyInternetGatewayId("egressOnlyInternetGatewayId")
   * .gatewayId("gatewayId")
   * .instanceId("instanceId")
   * .natGatewayId("natGatewayId")
   * .networkInterfaceId("networkInterfaceId")
   * .origin("origin")
   * .state("state")
   * .transitGatewayId("transitGatewayId")
   * .vpcPeeringConnectionId("vpcPeeringConnectionId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisroutetableroute.html)
   */
  public interface AnalysisRouteTableRouteProperty {
    /**
     * The destination IPv4 address, in CIDR notation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisroutetableroute.html#cfn-ec2-networkinsightsanalysis-analysisroutetableroute-destinationcidr)
     */
    public fun destinationCidr(): String? = unwrap(this).getDestinationCidr()

    /**
     * The prefix of the AWS service .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisroutetableroute.html#cfn-ec2-networkinsightsanalysis-analysisroutetableroute-destinationprefixlistid)
     */
    public fun destinationPrefixListId(): String? = unwrap(this).getDestinationPrefixListId()

    /**
     * The ID of an egress-only internet gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisroutetableroute.html#cfn-ec2-networkinsightsanalysis-analysisroutetableroute-egressonlyinternetgatewayid)
     */
    public fun egressOnlyInternetGatewayId(): String? =
        unwrap(this).getEgressOnlyInternetGatewayId()

    /**
     * The ID of the gateway, such as an internet gateway or virtual private gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisroutetableroute.html#cfn-ec2-networkinsightsanalysis-analysisroutetableroute-gatewayid)
     */
    public fun gatewayId(): String? = unwrap(this).getGatewayId()

    /**
     * The ID of the instance, such as a NAT instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisroutetableroute.html#cfn-ec2-networkinsightsanalysis-analysisroutetableroute-instanceid)
     */
    public fun instanceId(): String? = unwrap(this).getInstanceId()

    /**
     * The ID of a NAT gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisroutetableroute.html#cfn-ec2-networkinsightsanalysis-analysisroutetableroute-natgatewayid)
     */
    public fun natGatewayId(): String? = unwrap(this).getNatGatewayId()

    /**
     * The ID of a network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisroutetableroute.html#cfn-ec2-networkinsightsanalysis-analysisroutetableroute-networkinterfaceid)
     */
    public fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

    /**
     * Describes how the route was created. The following are the possible values:.
     *
     * * CreateRouteTable - The route was automatically created when the route table was created.
     * * CreateRoute - The route was manually added to the route table.
     * * EnableVgwRoutePropagation - The route was propagated by route propagation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisroutetableroute.html#cfn-ec2-networkinsightsanalysis-analysisroutetableroute-origin)
     */
    public fun origin(): String? = unwrap(this).getOrigin()

    /**
     * The state. The following are the possible values:.
     *
     * * active
     * * blackhole
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisroutetableroute.html#cfn-ec2-networkinsightsanalysis-analysisroutetableroute-state)
     */
    public fun state(): String? = unwrap(this).getState()

    /**
     * The ID of a transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisroutetableroute.html#cfn-ec2-networkinsightsanalysis-analysisroutetableroute-transitgatewayid)
     */
    public fun transitGatewayId(): String? = unwrap(this).getTransitGatewayId()

    /**
     * The ID of a VPC peering connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisroutetableroute.html#cfn-ec2-networkinsightsanalysis-analysisroutetableroute-vpcpeeringconnectionid)
     */
    public fun vpcPeeringConnectionId(): String? = unwrap(this).getVpcPeeringConnectionId()

    /**
     * A builder for [AnalysisRouteTableRouteProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationCidr The destination IPv4 address, in CIDR notation.
       */
      public fun destinationCidr(destinationCidr: String)

      /**
       * @param destinationPrefixListId The prefix of the AWS service .
       */
      public fun destinationPrefixListId(destinationPrefixListId: String)

      /**
       * @param egressOnlyInternetGatewayId The ID of an egress-only internet gateway.
       */
      public fun egressOnlyInternetGatewayId(egressOnlyInternetGatewayId: String)

      /**
       * @param gatewayId The ID of the gateway, such as an internet gateway or virtual private
       * gateway.
       */
      public fun gatewayId(gatewayId: String)

      /**
       * @param instanceId The ID of the instance, such as a NAT instance.
       */
      public fun instanceId(instanceId: String)

      /**
       * @param natGatewayId The ID of a NAT gateway.
       */
      public fun natGatewayId(natGatewayId: String)

      /**
       * @param networkInterfaceId The ID of a network interface.
       */
      public fun networkInterfaceId(networkInterfaceId: String)

      /**
       * @param origin Describes how the route was created. The following are the possible values:.
       * * CreateRouteTable - The route was automatically created when the route table was created.
       * * CreateRoute - The route was manually added to the route table.
       * * EnableVgwRoutePropagation - The route was propagated by route propagation.
       */
      public fun origin(origin: String)

      /**
       * @param state The state. The following are the possible values:.
       * * active
       * * blackhole
       */
      public fun state(state: String)

      /**
       * @param transitGatewayId The ID of a transit gateway.
       */
      public fun transitGatewayId(transitGatewayId: String)

      /**
       * @param vpcPeeringConnectionId The ID of a VPC peering connection.
       */
      public fun vpcPeeringConnectionId(vpcPeeringConnectionId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty.builder()

      /**
       * @param destinationCidr The destination IPv4 address, in CIDR notation.
       */
      override fun destinationCidr(destinationCidr: String) {
        cdkBuilder.destinationCidr(destinationCidr)
      }

      /**
       * @param destinationPrefixListId The prefix of the AWS service .
       */
      override fun destinationPrefixListId(destinationPrefixListId: String) {
        cdkBuilder.destinationPrefixListId(destinationPrefixListId)
      }

      /**
       * @param egressOnlyInternetGatewayId The ID of an egress-only internet gateway.
       */
      override fun egressOnlyInternetGatewayId(egressOnlyInternetGatewayId: String) {
        cdkBuilder.egressOnlyInternetGatewayId(egressOnlyInternetGatewayId)
      }

      /**
       * @param gatewayId The ID of the gateway, such as an internet gateway or virtual private
       * gateway.
       */
      override fun gatewayId(gatewayId: String) {
        cdkBuilder.gatewayId(gatewayId)
      }

      /**
       * @param instanceId The ID of the instance, such as a NAT instance.
       */
      override fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
      }

      /**
       * @param natGatewayId The ID of a NAT gateway.
       */
      override fun natGatewayId(natGatewayId: String) {
        cdkBuilder.natGatewayId(natGatewayId)
      }

      /**
       * @param networkInterfaceId The ID of a network interface.
       */
      override fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
      }

      /**
       * @param origin Describes how the route was created. The following are the possible values:.
       * * CreateRouteTable - The route was automatically created when the route table was created.
       * * CreateRoute - The route was manually added to the route table.
       * * EnableVgwRoutePropagation - The route was propagated by route propagation.
       */
      override fun origin(origin: String) {
        cdkBuilder.origin(origin)
      }

      /**
       * @param state The state. The following are the possible values:.
       * * active
       * * blackhole
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      /**
       * @param transitGatewayId The ID of a transit gateway.
       */
      override fun transitGatewayId(transitGatewayId: String) {
        cdkBuilder.transitGatewayId(transitGatewayId)
      }

      /**
       * @param vpcPeeringConnectionId The ID of a VPC peering connection.
       */
      override fun vpcPeeringConnectionId(vpcPeeringConnectionId: String) {
        cdkBuilder.vpcPeeringConnectionId(vpcPeeringConnectionId)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty,
    ) : CdkObject(cdkObject), AnalysisRouteTableRouteProperty {
      /**
       * The destination IPv4 address, in CIDR notation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisroutetableroute.html#cfn-ec2-networkinsightsanalysis-analysisroutetableroute-destinationcidr)
       */
      override fun destinationCidr(): String? = unwrap(this).getDestinationCidr()

      /**
       * The prefix of the AWS service .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisroutetableroute.html#cfn-ec2-networkinsightsanalysis-analysisroutetableroute-destinationprefixlistid)
       */
      override fun destinationPrefixListId(): String? = unwrap(this).getDestinationPrefixListId()

      /**
       * The ID of an egress-only internet gateway.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisroutetableroute.html#cfn-ec2-networkinsightsanalysis-analysisroutetableroute-egressonlyinternetgatewayid)
       */
      override fun egressOnlyInternetGatewayId(): String? =
          unwrap(this).getEgressOnlyInternetGatewayId()

      /**
       * The ID of the gateway, such as an internet gateway or virtual private gateway.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisroutetableroute.html#cfn-ec2-networkinsightsanalysis-analysisroutetableroute-gatewayid)
       */
      override fun gatewayId(): String? = unwrap(this).getGatewayId()

      /**
       * The ID of the instance, such as a NAT instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisroutetableroute.html#cfn-ec2-networkinsightsanalysis-analysisroutetableroute-instanceid)
       */
      override fun instanceId(): String? = unwrap(this).getInstanceId()

      /**
       * The ID of a NAT gateway.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisroutetableroute.html#cfn-ec2-networkinsightsanalysis-analysisroutetableroute-natgatewayid)
       */
      override fun natGatewayId(): String? = unwrap(this).getNatGatewayId()

      /**
       * The ID of a network interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisroutetableroute.html#cfn-ec2-networkinsightsanalysis-analysisroutetableroute-networkinterfaceid)
       */
      override fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

      /**
       * Describes how the route was created. The following are the possible values:.
       *
       * * CreateRouteTable - The route was automatically created when the route table was created.
       * * CreateRoute - The route was manually added to the route table.
       * * EnableVgwRoutePropagation - The route was propagated by route propagation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisroutetableroute.html#cfn-ec2-networkinsightsanalysis-analysisroutetableroute-origin)
       */
      override fun origin(): String? = unwrap(this).getOrigin()

      /**
       * The state. The following are the possible values:.
       *
       * * active
       * * blackhole
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisroutetableroute.html#cfn-ec2-networkinsightsanalysis-analysisroutetableroute-state)
       */
      override fun state(): String? = unwrap(this).getState()

      /**
       * The ID of a transit gateway.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisroutetableroute.html#cfn-ec2-networkinsightsanalysis-analysisroutetableroute-transitgatewayid)
       */
      override fun transitGatewayId(): String? = unwrap(this).getTransitGatewayId()

      /**
       * The ID of a VPC peering connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisroutetableroute.html#cfn-ec2-networkinsightsanalysis-analysisroutetableroute-vpcpeeringconnectionid)
       */
      override fun vpcPeeringConnectionId(): String? = unwrap(this).getVpcPeeringConnectionId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisRouteTableRouteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty):
          AnalysisRouteTableRouteProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AnalysisRouteTableRouteProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisRouteTableRouteProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty
    }
  }

  /**
   * Describes a security group rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * AnalysisSecurityGroupRuleProperty analysisSecurityGroupRuleProperty =
   * AnalysisSecurityGroupRuleProperty.builder()
   * .cidr("cidr")
   * .direction("direction")
   * .portRange(PortRangeProperty.builder()
   * .from(123)
   * .to(123)
   * .build())
   * .prefixListId("prefixListId")
   * .protocol("protocol")
   * .securityGroupId("securityGroupId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysissecuritygrouprule.html)
   */
  public interface AnalysisSecurityGroupRuleProperty {
    /**
     * The IPv4 address range, in CIDR notation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysissecuritygrouprule.html#cfn-ec2-networkinsightsanalysis-analysissecuritygrouprule-cidr)
     */
    public fun cidr(): String? = unwrap(this).getCidr()

    /**
     * The direction. The following are the possible values:.
     *
     * * egress
     * * ingress
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysissecuritygrouprule.html#cfn-ec2-networkinsightsanalysis-analysissecuritygrouprule-direction)
     */
    public fun direction(): String? = unwrap(this).getDirection()

    /**
     * The port range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysissecuritygrouprule.html#cfn-ec2-networkinsightsanalysis-analysissecuritygrouprule-portrange)
     */
    public fun portRange(): Any? = unwrap(this).getPortRange()

    /**
     * The prefix list ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysissecuritygrouprule.html#cfn-ec2-networkinsightsanalysis-analysissecuritygrouprule-prefixlistid)
     */
    public fun prefixListId(): String? = unwrap(this).getPrefixListId()

    /**
     * The protocol name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysissecuritygrouprule.html#cfn-ec2-networkinsightsanalysis-analysissecuritygrouprule-protocol)
     */
    public fun protocol(): String? = unwrap(this).getProtocol()

    /**
     * The security group ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysissecuritygrouprule.html#cfn-ec2-networkinsightsanalysis-analysissecuritygrouprule-securitygroupid)
     */
    public fun securityGroupId(): String? = unwrap(this).getSecurityGroupId()

    /**
     * A builder for [AnalysisSecurityGroupRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cidr The IPv4 address range, in CIDR notation.
       */
      public fun cidr(cidr: String)

      /**
       * @param direction The direction. The following are the possible values:.
       * * egress
       * * ingress
       */
      public fun direction(direction: String)

      /**
       * @param portRange The port range.
       */
      public fun portRange(portRange: IResolvable)

      /**
       * @param portRange The port range.
       */
      public fun portRange(portRange: PortRangeProperty)

      /**
       * @param portRange The port range.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca53e01c09765cffc504e3e8819a897e42887deeeaa81072f360fd666dbfa09d")
      public fun portRange(portRange: PortRangeProperty.Builder.() -> Unit)

      /**
       * @param prefixListId The prefix list ID.
       */
      public fun prefixListId(prefixListId: String)

      /**
       * @param protocol The protocol name.
       */
      public fun protocol(protocol: String)

      /**
       * @param securityGroupId The security group ID.
       */
      public fun securityGroupId(securityGroupId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty.builder()

      /**
       * @param cidr The IPv4 address range, in CIDR notation.
       */
      override fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
      }

      /**
       * @param direction The direction. The following are the possible values:.
       * * egress
       * * ingress
       */
      override fun direction(direction: String) {
        cdkBuilder.direction(direction)
      }

      /**
       * @param portRange The port range.
       */
      override fun portRange(portRange: IResolvable) {
        cdkBuilder.portRange(portRange.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param portRange The port range.
       */
      override fun portRange(portRange: PortRangeProperty) {
        cdkBuilder.portRange(portRange.let(PortRangeProperty.Companion::unwrap))
      }

      /**
       * @param portRange The port range.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca53e01c09765cffc504e3e8819a897e42887deeeaa81072f360fd666dbfa09d")
      override fun portRange(portRange: PortRangeProperty.Builder.() -> Unit): Unit =
          portRange(PortRangeProperty(portRange))

      /**
       * @param prefixListId The prefix list ID.
       */
      override fun prefixListId(prefixListId: String) {
        cdkBuilder.prefixListId(prefixListId)
      }

      /**
       * @param protocol The protocol name.
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      /**
       * @param securityGroupId The security group ID.
       */
      override fun securityGroupId(securityGroupId: String) {
        cdkBuilder.securityGroupId(securityGroupId)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty,
    ) : CdkObject(cdkObject), AnalysisSecurityGroupRuleProperty {
      /**
       * The IPv4 address range, in CIDR notation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysissecuritygrouprule.html#cfn-ec2-networkinsightsanalysis-analysissecuritygrouprule-cidr)
       */
      override fun cidr(): String? = unwrap(this).getCidr()

      /**
       * The direction. The following are the possible values:.
       *
       * * egress
       * * ingress
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysissecuritygrouprule.html#cfn-ec2-networkinsightsanalysis-analysissecuritygrouprule-direction)
       */
      override fun direction(): String? = unwrap(this).getDirection()

      /**
       * The port range.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysissecuritygrouprule.html#cfn-ec2-networkinsightsanalysis-analysissecuritygrouprule-portrange)
       */
      override fun portRange(): Any? = unwrap(this).getPortRange()

      /**
       * The prefix list ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysissecuritygrouprule.html#cfn-ec2-networkinsightsanalysis-analysissecuritygrouprule-prefixlistid)
       */
      override fun prefixListId(): String? = unwrap(this).getPrefixListId()

      /**
       * The protocol name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysissecuritygrouprule.html#cfn-ec2-networkinsightsanalysis-analysissecuritygrouprule-protocol)
       */
      override fun protocol(): String? = unwrap(this).getProtocol()

      /**
       * The security group ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysissecuritygrouprule.html#cfn-ec2-networkinsightsanalysis-analysissecuritygrouprule-securitygroupid)
       */
      override fun securityGroupId(): String? = unwrap(this).getSecurityGroupId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AnalysisSecurityGroupRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty):
          AnalysisSecurityGroupRuleProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AnalysisSecurityGroupRuleProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisSecurityGroupRuleProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty
    }
  }

  /**
   * Describes an explanation code for an unreachable path.
   *
   * For more information, see [Reachability Analyzer explanation
   * codes](https://docs.aws.amazon.com/vpc/latest/reachability/explanation-codes.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * ExplanationProperty explanationProperty = ExplanationProperty.builder()
   * .acl(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .aclRule(AnalysisAclRuleProperty.builder()
   * .cidr("cidr")
   * .egress(false)
   * .portRange(PortRangeProperty.builder()
   * .from(123)
   * .to(123)
   * .build())
   * .protocol("protocol")
   * .ruleAction("ruleAction")
   * .ruleNumber(123)
   * .build())
   * .address("address")
   * .addresses(List.of("addresses"))
   * .attachedTo(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .availabilityZones(List.of("availabilityZones"))
   * .cidrs(List.of("cidrs"))
   * .classicLoadBalancerListener(AnalysisLoadBalancerListenerProperty.builder()
   * .instancePort(123)
   * .loadBalancerPort(123)
   * .build())
   * .component(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .componentAccount("componentAccount")
   * .componentRegion("componentRegion")
   * .customerGateway(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .destination(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .destinationVpc(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .direction("direction")
   * .elasticLoadBalancerListener(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .explanationCode("explanationCode")
   * .ingressRouteTable(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .internetGateway(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .loadBalancerArn("loadBalancerArn")
   * .loadBalancerListenerPort(123)
   * .loadBalancerTarget(AnalysisLoadBalancerTargetProperty.builder()
   * .address("address")
   * .availabilityZone("availabilityZone")
   * .instance(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .port(123)
   * .build())
   * .loadBalancerTargetGroup(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .loadBalancerTargetGroups(List.of(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build()))
   * .loadBalancerTargetPort(123)
   * .missingComponent("missingComponent")
   * .natGateway(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .networkInterface(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .packetField("packetField")
   * .port(123)
   * .portRanges(List.of(PortRangeProperty.builder()
   * .from(123)
   * .to(123)
   * .build()))
   * .prefixList(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .protocols(List.of("protocols"))
   * .routeTable(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .routeTableRoute(AnalysisRouteTableRouteProperty.builder()
   * .destinationCidr("destinationCidr")
   * .destinationPrefixListId("destinationPrefixListId")
   * .egressOnlyInternetGatewayId("egressOnlyInternetGatewayId")
   * .gatewayId("gatewayId")
   * .instanceId("instanceId")
   * .natGatewayId("natGatewayId")
   * .networkInterfaceId("networkInterfaceId")
   * .origin("origin")
   * .state("state")
   * .transitGatewayId("transitGatewayId")
   * .vpcPeeringConnectionId("vpcPeeringConnectionId")
   * .build())
   * .securityGroup(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .securityGroupRule(AnalysisSecurityGroupRuleProperty.builder()
   * .cidr("cidr")
   * .direction("direction")
   * .portRange(PortRangeProperty.builder()
   * .from(123)
   * .to(123)
   * .build())
   * .prefixListId("prefixListId")
   * .protocol("protocol")
   * .securityGroupId("securityGroupId")
   * .build())
   * .securityGroups(List.of(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build()))
   * .sourceVpc(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .state("state")
   * .subnet(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .subnetRouteTable(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .transitGateway(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .transitGatewayAttachment(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .transitGatewayRouteTable(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .transitGatewayRouteTableRoute(TransitGatewayRouteTableRouteProperty.builder()
   * .attachmentId("attachmentId")
   * .destinationCidr("destinationCidr")
   * .prefixListId("prefixListId")
   * .resourceId("resourceId")
   * .resourceType("resourceType")
   * .routeOrigin("routeOrigin")
   * .state("state")
   * .build())
   * .vpc(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .vpcEndpoint(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .vpcPeeringConnection(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .vpnConnection(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .vpnGateway(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html)
   */
  public interface ExplanationProperty {
    /**
     * The network ACL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-acl)
     */
    public fun acl(): Any? = unwrap(this).getAcl()

    /**
     * The network ACL rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-aclrule)
     */
    public fun aclRule(): Any? = unwrap(this).getAclRule()

    /**
     * The IPv4 address, in CIDR notation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-address)
     */
    public fun address(): String? = unwrap(this).getAddress()

    /**
     * The IPv4 addresses, in CIDR notation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-addresses)
     */
    public fun addresses(): List<String> = unwrap(this).getAddresses() ?: emptyList()

    /**
     * The resource to which the component is attached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-attachedto)
     */
    public fun attachedTo(): Any? = unwrap(this).getAttachedTo()

    /**
     * The Availability Zones.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-availabilityzones)
     */
    public fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
        emptyList()

    /**
     * The CIDR ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-cidrs)
     */
    public fun cidrs(): List<String> = unwrap(this).getCidrs() ?: emptyList()

    /**
     * The listener for a Classic Load Balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-classicloadbalancerlistener)
     */
    public fun classicLoadBalancerListener(): Any? = unwrap(this).getClassicLoadBalancerListener()

    /**
     * The component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-component)
     */
    public fun component(): Any? = unwrap(this).getComponent()

    /**
     * The AWS account for the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-componentaccount)
     */
    public fun componentAccount(): String? = unwrap(this).getComponentAccount()

    /**
     * The Region for the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-componentregion)
     */
    public fun componentRegion(): String? = unwrap(this).getComponentRegion()

    /**
     * The customer gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-customergateway)
     */
    public fun customerGateway(): Any? = unwrap(this).getCustomerGateway()

    /**
     * The destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-destination)
     */
    public fun destination(): Any? = unwrap(this).getDestination()

    /**
     * The destination VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-destinationvpc)
     */
    public fun destinationVpc(): Any? = unwrap(this).getDestinationVpc()

    /**
     * The direction. The following are the possible values:.
     *
     * * egress
     * * ingress
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-direction)
     */
    public fun direction(): String? = unwrap(this).getDirection()

    /**
     * The load balancer listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-elasticloadbalancerlistener)
     */
    public fun elasticLoadBalancerListener(): Any? = unwrap(this).getElasticLoadBalancerListener()

    /**
     * The explanation code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-explanationcode)
     */
    public fun explanationCode(): String? = unwrap(this).getExplanationCode()

    /**
     * The route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-ingressroutetable)
     */
    public fun ingressRouteTable(): Any? = unwrap(this).getIngressRouteTable()

    /**
     * The internet gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-internetgateway)
     */
    public fun internetGateway(): Any? = unwrap(this).getInternetGateway()

    /**
     * The Amazon Resource Name (ARN) of the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-loadbalancerarn)
     */
    public fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

    /**
     * The listener port of the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-loadbalancerlistenerport)
     */
    public fun loadBalancerListenerPort(): Number? = unwrap(this).getLoadBalancerListenerPort()

    /**
     * The target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-loadbalancertarget)
     */
    public fun loadBalancerTarget(): Any? = unwrap(this).getLoadBalancerTarget()

    /**
     * The target group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-loadbalancertargetgroup)
     */
    public fun loadBalancerTargetGroup(): Any? = unwrap(this).getLoadBalancerTargetGroup()

    /**
     * The target groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-loadbalancertargetgroups)
     */
    public fun loadBalancerTargetGroups(): Any? = unwrap(this).getLoadBalancerTargetGroups()

    /**
     * The target port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-loadbalancertargetport)
     */
    public fun loadBalancerTargetPort(): Number? = unwrap(this).getLoadBalancerTargetPort()

    /**
     * The missing component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-missingcomponent)
     */
    public fun missingComponent(): String? = unwrap(this).getMissingComponent()

    /**
     * The NAT gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-natgateway)
     */
    public fun natGateway(): Any? = unwrap(this).getNatGateway()

    /**
     * The network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-networkinterface)
     */
    public fun networkInterface(): Any? = unwrap(this).getNetworkInterface()

    /**
     * The packet field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-packetfield)
     */
    public fun packetField(): String? = unwrap(this).getPacketField()

    /**
     * The port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * The port ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-portranges)
     */
    public fun portRanges(): Any? = unwrap(this).getPortRanges()

    /**
     * The prefix list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-prefixlist)
     */
    public fun prefixList(): Any? = unwrap(this).getPrefixList()

    /**
     * The protocols.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-protocols)
     */
    public fun protocols(): List<String> = unwrap(this).getProtocols() ?: emptyList()

    /**
     * The route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-routetable)
     */
    public fun routeTable(): Any? = unwrap(this).getRouteTable()

    /**
     * The route table route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-routetableroute)
     */
    public fun routeTableRoute(): Any? = unwrap(this).getRouteTableRoute()

    /**
     * The security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-securitygroup)
     */
    public fun securityGroup(): Any? = unwrap(this).getSecurityGroup()

    /**
     * The security group rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-securitygrouprule)
     */
    public fun securityGroupRule(): Any? = unwrap(this).getSecurityGroupRule()

    /**
     * The security groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-securitygroups)
     */
    public fun securityGroups(): Any? = unwrap(this).getSecurityGroups()

    /**
     * The source VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-sourcevpc)
     */
    public fun sourceVpc(): Any? = unwrap(this).getSourceVpc()

    /**
     * The state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-state)
     */
    public fun state(): String? = unwrap(this).getState()

    /**
     * The subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-subnet)
     */
    public fun subnet(): Any? = unwrap(this).getSubnet()

    /**
     * The route table for the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-subnetroutetable)
     */
    public fun subnetRouteTable(): Any? = unwrap(this).getSubnetRouteTable()

    /**
     * The transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-transitgateway)
     */
    public fun transitGateway(): Any? = unwrap(this).getTransitGateway()

    /**
     * The transit gateway attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-transitgatewayattachment)
     */
    public fun transitGatewayAttachment(): Any? = unwrap(this).getTransitGatewayAttachment()

    /**
     * The transit gateway route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-transitgatewayroutetable)
     */
    public fun transitGatewayRouteTable(): Any? = unwrap(this).getTransitGatewayRouteTable()

    /**
     * The transit gateway route table route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-transitgatewayroutetableroute)
     */
    public fun transitGatewayRouteTableRoute(): Any? =
        unwrap(this).getTransitGatewayRouteTableRoute()

    /**
     * The component VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-vpc)
     */
    public fun vpc(): Any? = unwrap(this).getVpc()

    /**
     * The VPC endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-vpcendpoint)
     */
    public fun vpcEndpoint(): Any? = unwrap(this).getVpcEndpoint()

    /**
     * The VPC peering connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-vpcpeeringconnection)
     */
    public fun vpcPeeringConnection(): Any? = unwrap(this).getVpcPeeringConnection()

    /**
     * The VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-vpnconnection)
     */
    public fun vpnConnection(): Any? = unwrap(this).getVpnConnection()

    /**
     * The VPN gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-vpngateway)
     */
    public fun vpnGateway(): Any? = unwrap(this).getVpnGateway()

    /**
     * A builder for [ExplanationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param acl The network ACL.
       */
      public fun acl(acl: IResolvable)

      /**
       * @param acl The network ACL.
       */
      public fun acl(acl: AnalysisComponentProperty)

      /**
       * @param acl The network ACL.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d1998d6412063241d81e90c6c0031c5d022f5ff74947e8a227d51c691d9aee28")
      public fun acl(acl: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param aclRule The network ACL rule.
       */
      public fun aclRule(aclRule: IResolvable)

      /**
       * @param aclRule The network ACL rule.
       */
      public fun aclRule(aclRule: AnalysisAclRuleProperty)

      /**
       * @param aclRule The network ACL rule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d19fce45f2a87810c3b586a351e9a18be3ae9e512b24a79482722ce2d9fa2a86")
      public fun aclRule(aclRule: AnalysisAclRuleProperty.Builder.() -> Unit)

      /**
       * @param address The IPv4 address, in CIDR notation.
       */
      public fun address(address: String)

      /**
       * @param addresses The IPv4 addresses, in CIDR notation.
       */
      public fun addresses(addresses: List<String>)

      /**
       * @param addresses The IPv4 addresses, in CIDR notation.
       */
      public fun addresses(vararg addresses: String)

      /**
       * @param attachedTo The resource to which the component is attached.
       */
      public fun attachedTo(attachedTo: IResolvable)

      /**
       * @param attachedTo The resource to which the component is attached.
       */
      public fun attachedTo(attachedTo: AnalysisComponentProperty)

      /**
       * @param attachedTo The resource to which the component is attached.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01150afd5fcce850597a9a8c13865b687d2babebc2e550c94c6861feafe33bc6")
      public fun attachedTo(attachedTo: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param availabilityZones The Availability Zones.
       */
      public fun availabilityZones(availabilityZones: List<String>)

      /**
       * @param availabilityZones The Availability Zones.
       */
      public fun availabilityZones(vararg availabilityZones: String)

      /**
       * @param cidrs The CIDR ranges.
       */
      public fun cidrs(cidrs: List<String>)

      /**
       * @param cidrs The CIDR ranges.
       */
      public fun cidrs(vararg cidrs: String)

      /**
       * @param classicLoadBalancerListener The listener for a Classic Load Balancer.
       */
      public fun classicLoadBalancerListener(classicLoadBalancerListener: IResolvable)

      /**
       * @param classicLoadBalancerListener The listener for a Classic Load Balancer.
       */
      public
          fun classicLoadBalancerListener(classicLoadBalancerListener: AnalysisLoadBalancerListenerProperty)

      /**
       * @param classicLoadBalancerListener The listener for a Classic Load Balancer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9451419d8679443564bc955972142fb9e76cc03f8ba4b83eec108d87c301a6ea")
      public
          fun classicLoadBalancerListener(classicLoadBalancerListener: AnalysisLoadBalancerListenerProperty.Builder.() -> Unit)

      /**
       * @param component The component.
       */
      public fun component(component: IResolvable)

      /**
       * @param component The component.
       */
      public fun component(component: AnalysisComponentProperty)

      /**
       * @param component The component.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1da032909557b7fe260b797a54e345e5f8b7205724950b2330594af4c85e2bc6")
      public fun component(component: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param componentAccount The AWS account for the component.
       */
      public fun componentAccount(componentAccount: String)

      /**
       * @param componentRegion The Region for the component.
       */
      public fun componentRegion(componentRegion: String)

      /**
       * @param customerGateway The customer gateway.
       */
      public fun customerGateway(customerGateway: IResolvable)

      /**
       * @param customerGateway The customer gateway.
       */
      public fun customerGateway(customerGateway: AnalysisComponentProperty)

      /**
       * @param customerGateway The customer gateway.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4d11e5a080e9afebbc359fd3635c20be04c5f664ada5e55f279cc81e8d2cd4a")
      public fun customerGateway(customerGateway: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param destination The destination.
       */
      public fun destination(destination: IResolvable)

      /**
       * @param destination The destination.
       */
      public fun destination(destination: AnalysisComponentProperty)

      /**
       * @param destination The destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a686803273cded7f10780e613aaa8e09a3f9e725007ebd45cc620046de307505")
      public fun destination(destination: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param destinationVpc The destination VPC.
       */
      public fun destinationVpc(destinationVpc: IResolvable)

      /**
       * @param destinationVpc The destination VPC.
       */
      public fun destinationVpc(destinationVpc: AnalysisComponentProperty)

      /**
       * @param destinationVpc The destination VPC.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f51af5adec137b322543aa5b0b0d2b9894b124914af8bb8ad9a0aa98f1c9c2ea")
      public fun destinationVpc(destinationVpc: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param direction The direction. The following are the possible values:.
       * * egress
       * * ingress
       */
      public fun direction(direction: String)

      /**
       * @param elasticLoadBalancerListener The load balancer listener.
       */
      public fun elasticLoadBalancerListener(elasticLoadBalancerListener: IResolvable)

      /**
       * @param elasticLoadBalancerListener The load balancer listener.
       */
      public fun elasticLoadBalancerListener(elasticLoadBalancerListener: AnalysisComponentProperty)

      /**
       * @param elasticLoadBalancerListener The load balancer listener.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a1fdfba6aeeb3261bf38a00eb32725b5dc751dbf2a0606d7e257de9d71ee93b")
      public
          fun elasticLoadBalancerListener(elasticLoadBalancerListener: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param explanationCode The explanation code.
       */
      public fun explanationCode(explanationCode: String)

      /**
       * @param ingressRouteTable The route table.
       */
      public fun ingressRouteTable(ingressRouteTable: IResolvable)

      /**
       * @param ingressRouteTable The route table.
       */
      public fun ingressRouteTable(ingressRouteTable: AnalysisComponentProperty)

      /**
       * @param ingressRouteTable The route table.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("773755699fd1941dfadb46cba6b17aabf027d523e82b5f1d6dcc0d910c59cb58")
      public fun ingressRouteTable(ingressRouteTable: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param internetGateway The internet gateway.
       */
      public fun internetGateway(internetGateway: IResolvable)

      /**
       * @param internetGateway The internet gateway.
       */
      public fun internetGateway(internetGateway: AnalysisComponentProperty)

      /**
       * @param internetGateway The internet gateway.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7610131dafb58869d284817acb538b96dc622ac86180ea6244101ffc8ab185af")
      public fun internetGateway(internetGateway: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param loadBalancerArn The Amazon Resource Name (ARN) of the load balancer.
       */
      public fun loadBalancerArn(loadBalancerArn: String)

      /**
       * @param loadBalancerListenerPort The listener port of the load balancer.
       */
      public fun loadBalancerListenerPort(loadBalancerListenerPort: Number)

      /**
       * @param loadBalancerTarget The target.
       */
      public fun loadBalancerTarget(loadBalancerTarget: IResolvable)

      /**
       * @param loadBalancerTarget The target.
       */
      public fun loadBalancerTarget(loadBalancerTarget: AnalysisLoadBalancerTargetProperty)

      /**
       * @param loadBalancerTarget The target.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("61717c60f169baa5bb513b1dea51b8c8aa9dfd236d5775835d402c8ba86819ea")
      public
          fun loadBalancerTarget(loadBalancerTarget: AnalysisLoadBalancerTargetProperty.Builder.() -> Unit)

      /**
       * @param loadBalancerTargetGroup The target group.
       */
      public fun loadBalancerTargetGroup(loadBalancerTargetGroup: IResolvable)

      /**
       * @param loadBalancerTargetGroup The target group.
       */
      public fun loadBalancerTargetGroup(loadBalancerTargetGroup: AnalysisComponentProperty)

      /**
       * @param loadBalancerTargetGroup The target group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9fce53699efcc97f67cbae9f09981daf56e3e0705f08614d046cf91c1a234404")
      public
          fun loadBalancerTargetGroup(loadBalancerTargetGroup: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param loadBalancerTargetGroups The target groups.
       */
      public fun loadBalancerTargetGroups(loadBalancerTargetGroups: IResolvable)

      /**
       * @param loadBalancerTargetGroups The target groups.
       */
      public fun loadBalancerTargetGroups(loadBalancerTargetGroups: List<Any>)

      /**
       * @param loadBalancerTargetGroups The target groups.
       */
      public fun loadBalancerTargetGroups(vararg loadBalancerTargetGroups: Any)

      /**
       * @param loadBalancerTargetPort The target port.
       */
      public fun loadBalancerTargetPort(loadBalancerTargetPort: Number)

      /**
       * @param missingComponent The missing component.
       */
      public fun missingComponent(missingComponent: String)

      /**
       * @param natGateway The NAT gateway.
       */
      public fun natGateway(natGateway: IResolvable)

      /**
       * @param natGateway The NAT gateway.
       */
      public fun natGateway(natGateway: AnalysisComponentProperty)

      /**
       * @param natGateway The NAT gateway.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fa801e01d40ce33c9b25562393ea028bfe9c43f5ed7d605725a8f56615b919ac")
      public fun natGateway(natGateway: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param networkInterface The network interface.
       */
      public fun networkInterface(networkInterface: IResolvable)

      /**
       * @param networkInterface The network interface.
       */
      public fun networkInterface(networkInterface: AnalysisComponentProperty)

      /**
       * @param networkInterface The network interface.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7450aedbd567f718c75cede2762de6ba2186748203910a6d9a1a34a52354f9e7")
      public fun networkInterface(networkInterface: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param packetField The packet field.
       */
      public fun packetField(packetField: String)

      /**
       * @param port The port.
       */
      public fun port(port: Number)

      /**
       * @param portRanges The port ranges.
       */
      public fun portRanges(portRanges: IResolvable)

      /**
       * @param portRanges The port ranges.
       */
      public fun portRanges(portRanges: List<Any>)

      /**
       * @param portRanges The port ranges.
       */
      public fun portRanges(vararg portRanges: Any)

      /**
       * @param prefixList The prefix list.
       */
      public fun prefixList(prefixList: IResolvable)

      /**
       * @param prefixList The prefix list.
       */
      public fun prefixList(prefixList: AnalysisComponentProperty)

      /**
       * @param prefixList The prefix list.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1da1c72a17748568ee9f55443dff6778305e20c538f7276338708663554a72e6")
      public fun prefixList(prefixList: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param protocols The protocols.
       */
      public fun protocols(protocols: List<String>)

      /**
       * @param protocols The protocols.
       */
      public fun protocols(vararg protocols: String)

      /**
       * @param routeTable The route table.
       */
      public fun routeTable(routeTable: IResolvable)

      /**
       * @param routeTable The route table.
       */
      public fun routeTable(routeTable: AnalysisComponentProperty)

      /**
       * @param routeTable The route table.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("addd8d3e5338b52fe2640bcbabf54aadd69b710bdd658262a9d5d87ca019e953")
      public fun routeTable(routeTable: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param routeTableRoute The route table route.
       */
      public fun routeTableRoute(routeTableRoute: IResolvable)

      /**
       * @param routeTableRoute The route table route.
       */
      public fun routeTableRoute(routeTableRoute: AnalysisRouteTableRouteProperty)

      /**
       * @param routeTableRoute The route table route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("077f21603e1c6ac087e6d67c0b048cc3951551a991fb719bd1d193325f1101ff")
      public
          fun routeTableRoute(routeTableRoute: AnalysisRouteTableRouteProperty.Builder.() -> Unit)

      /**
       * @param securityGroup The security group.
       */
      public fun securityGroup(securityGroup: IResolvable)

      /**
       * @param securityGroup The security group.
       */
      public fun securityGroup(securityGroup: AnalysisComponentProperty)

      /**
       * @param securityGroup The security group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a57eb2f9eb9322cb9ff3b93a37f91e6352d6bd8f90fe4feba0989e1ee56e9cbf")
      public fun securityGroup(securityGroup: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param securityGroupRule The security group rule.
       */
      public fun securityGroupRule(securityGroupRule: IResolvable)

      /**
       * @param securityGroupRule The security group rule.
       */
      public fun securityGroupRule(securityGroupRule: AnalysisSecurityGroupRuleProperty)

      /**
       * @param securityGroupRule The security group rule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e492823be51adb2a2414d80236e38df04a8dc309a590a9df62e986acbdfa6e87")
      public
          fun securityGroupRule(securityGroupRule: AnalysisSecurityGroupRuleProperty.Builder.() -> Unit)

      /**
       * @param securityGroups The security groups.
       */
      public fun securityGroups(securityGroups: IResolvable)

      /**
       * @param securityGroups The security groups.
       */
      public fun securityGroups(securityGroups: List<Any>)

      /**
       * @param securityGroups The security groups.
       */
      public fun securityGroups(vararg securityGroups: Any)

      /**
       * @param sourceVpc The source VPC.
       */
      public fun sourceVpc(sourceVpc: IResolvable)

      /**
       * @param sourceVpc The source VPC.
       */
      public fun sourceVpc(sourceVpc: AnalysisComponentProperty)

      /**
       * @param sourceVpc The source VPC.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27af9107563805c956e34b6cd29236fe3f85d8c6a90cf764db26f60685a9b2e5")
      public fun sourceVpc(sourceVpc: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param state The state.
       */
      public fun state(state: String)

      /**
       * @param subnet The subnet.
       */
      public fun subnet(subnet: IResolvable)

      /**
       * @param subnet The subnet.
       */
      public fun subnet(subnet: AnalysisComponentProperty)

      /**
       * @param subnet The subnet.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3b128827dcace50aa299c80150525f5fec902a4ed3a2546229850bb96682ca78")
      public fun subnet(subnet: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param subnetRouteTable The route table for the subnet.
       */
      public fun subnetRouteTable(subnetRouteTable: IResolvable)

      /**
       * @param subnetRouteTable The route table for the subnet.
       */
      public fun subnetRouteTable(subnetRouteTable: AnalysisComponentProperty)

      /**
       * @param subnetRouteTable The route table for the subnet.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1a40c9d124152a53b14f80b23a58e155706f768bb73eb83d38b6967b3f2ee4d2")
      public fun subnetRouteTable(subnetRouteTable: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param transitGateway The transit gateway.
       */
      public fun transitGateway(transitGateway: IResolvable)

      /**
       * @param transitGateway The transit gateway.
       */
      public fun transitGateway(transitGateway: AnalysisComponentProperty)

      /**
       * @param transitGateway The transit gateway.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("50266278c0845fca742e5d73d33fa93efb0b72c2fb8141dc083edc1228c4409d")
      public fun transitGateway(transitGateway: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param transitGatewayAttachment The transit gateway attachment.
       */
      public fun transitGatewayAttachment(transitGatewayAttachment: IResolvable)

      /**
       * @param transitGatewayAttachment The transit gateway attachment.
       */
      public fun transitGatewayAttachment(transitGatewayAttachment: AnalysisComponentProperty)

      /**
       * @param transitGatewayAttachment The transit gateway attachment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1e6dad8a30a668f3899dccee9584f41c7eaec54585d826bd02217e01d514f914")
      public
          fun transitGatewayAttachment(transitGatewayAttachment: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param transitGatewayRouteTable The transit gateway route table.
       */
      public fun transitGatewayRouteTable(transitGatewayRouteTable: IResolvable)

      /**
       * @param transitGatewayRouteTable The transit gateway route table.
       */
      public fun transitGatewayRouteTable(transitGatewayRouteTable: AnalysisComponentProperty)

      /**
       * @param transitGatewayRouteTable The transit gateway route table.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4a7e4cca421d1ea8cc6c7407dd2ac9e6357d695efff1399351669ca0c03d761e")
      public
          fun transitGatewayRouteTable(transitGatewayRouteTable: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param transitGatewayRouteTableRoute The transit gateway route table route.
       */
      public fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: IResolvable)

      /**
       * @param transitGatewayRouteTableRoute The transit gateway route table route.
       */
      public
          fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: TransitGatewayRouteTableRouteProperty)

      /**
       * @param transitGatewayRouteTableRoute The transit gateway route table route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c4950e82f10db35eb78952cfc65d01e2463d6ff92f05eb0e0f7e1c02df89fcc")
      public
          fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: TransitGatewayRouteTableRouteProperty.Builder.() -> Unit)

      /**
       * @param vpc The component VPC.
       */
      public fun vpc(vpc: IResolvable)

      /**
       * @param vpc The component VPC.
       */
      public fun vpc(vpc: AnalysisComponentProperty)

      /**
       * @param vpc The component VPC.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01b9579f79b35a2679bdc9a34d7b81d4de6f4b4df83097553d8fd0e8f47ac433")
      public fun vpc(vpc: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param vpcEndpoint The VPC endpoint.
       */
      public fun vpcEndpoint(vpcEndpoint: IResolvable)

      /**
       * @param vpcEndpoint The VPC endpoint.
       */
      public fun vpcEndpoint(vpcEndpoint: AnalysisComponentProperty)

      /**
       * @param vpcEndpoint The VPC endpoint.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf6c7e8e6abb4afdf2a4fcec210177d1c2cbc27eb69931f026da17bc8c57f925")
      public fun vpcEndpoint(vpcEndpoint: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param vpcPeeringConnection The VPC peering connection.
       */
      public fun vpcPeeringConnection(vpcPeeringConnection: IResolvable)

      /**
       * @param vpcPeeringConnection The VPC peering connection.
       */
      public fun vpcPeeringConnection(vpcPeeringConnection: AnalysisComponentProperty)

      /**
       * @param vpcPeeringConnection The VPC peering connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2fb68077a808fd6bb36e2bb7582c7b0d6c7a4e55663ab7f4e19ef9207233ef52")
      public
          fun vpcPeeringConnection(vpcPeeringConnection: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param vpnConnection The VPN connection.
       */
      public fun vpnConnection(vpnConnection: IResolvable)

      /**
       * @param vpnConnection The VPN connection.
       */
      public fun vpnConnection(vpnConnection: AnalysisComponentProperty)

      /**
       * @param vpnConnection The VPN connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a06080ec27a8e104f495416404d4065e86ad807d4c24b86ad554ec55bb6704c0")
      public fun vpnConnection(vpnConnection: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param vpnGateway The VPN gateway.
       */
      public fun vpnGateway(vpnGateway: IResolvable)

      /**
       * @param vpnGateway The VPN gateway.
       */
      public fun vpnGateway(vpnGateway: AnalysisComponentProperty)

      /**
       * @param vpnGateway The VPN gateway.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc28fbd01369a3708d7b71693a81ceb38cdc4ba3d0de7d8b77fd55f13281aecb")
      public fun vpnGateway(vpnGateway: AnalysisComponentProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.ExplanationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.ExplanationProperty.builder()

      /**
       * @param acl The network ACL.
       */
      override fun acl(acl: IResolvable) {
        cdkBuilder.acl(acl.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param acl The network ACL.
       */
      override fun acl(acl: AnalysisComponentProperty) {
        cdkBuilder.acl(acl.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param acl The network ACL.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d1998d6412063241d81e90c6c0031c5d022f5ff74947e8a227d51c691d9aee28")
      override fun acl(acl: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          acl(AnalysisComponentProperty(acl))

      /**
       * @param aclRule The network ACL rule.
       */
      override fun aclRule(aclRule: IResolvable) {
        cdkBuilder.aclRule(aclRule.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param aclRule The network ACL rule.
       */
      override fun aclRule(aclRule: AnalysisAclRuleProperty) {
        cdkBuilder.aclRule(aclRule.let(AnalysisAclRuleProperty.Companion::unwrap))
      }

      /**
       * @param aclRule The network ACL rule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d19fce45f2a87810c3b586a351e9a18be3ae9e512b24a79482722ce2d9fa2a86")
      override fun aclRule(aclRule: AnalysisAclRuleProperty.Builder.() -> Unit): Unit =
          aclRule(AnalysisAclRuleProperty(aclRule))

      /**
       * @param address The IPv4 address, in CIDR notation.
       */
      override fun address(address: String) {
        cdkBuilder.address(address)
      }

      /**
       * @param addresses The IPv4 addresses, in CIDR notation.
       */
      override fun addresses(addresses: List<String>) {
        cdkBuilder.addresses(addresses)
      }

      /**
       * @param addresses The IPv4 addresses, in CIDR notation.
       */
      override fun addresses(vararg addresses: String): Unit = addresses(addresses.toList())

      /**
       * @param attachedTo The resource to which the component is attached.
       */
      override fun attachedTo(attachedTo: IResolvable) {
        cdkBuilder.attachedTo(attachedTo.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param attachedTo The resource to which the component is attached.
       */
      override fun attachedTo(attachedTo: AnalysisComponentProperty) {
        cdkBuilder.attachedTo(attachedTo.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param attachedTo The resource to which the component is attached.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01150afd5fcce850597a9a8c13865b687d2babebc2e550c94c6861feafe33bc6")
      override fun attachedTo(attachedTo: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          attachedTo(AnalysisComponentProperty(attachedTo))

      /**
       * @param availabilityZones The Availability Zones.
       */
      override fun availabilityZones(availabilityZones: List<String>) {
        cdkBuilder.availabilityZones(availabilityZones)
      }

      /**
       * @param availabilityZones The Availability Zones.
       */
      override fun availabilityZones(vararg availabilityZones: String): Unit =
          availabilityZones(availabilityZones.toList())

      /**
       * @param cidrs The CIDR ranges.
       */
      override fun cidrs(cidrs: List<String>) {
        cdkBuilder.cidrs(cidrs)
      }

      /**
       * @param cidrs The CIDR ranges.
       */
      override fun cidrs(vararg cidrs: String): Unit = cidrs(cidrs.toList())

      /**
       * @param classicLoadBalancerListener The listener for a Classic Load Balancer.
       */
      override fun classicLoadBalancerListener(classicLoadBalancerListener: IResolvable) {
        cdkBuilder.classicLoadBalancerListener(classicLoadBalancerListener.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param classicLoadBalancerListener The listener for a Classic Load Balancer.
       */
      override
          fun classicLoadBalancerListener(classicLoadBalancerListener: AnalysisLoadBalancerListenerProperty) {
        cdkBuilder.classicLoadBalancerListener(classicLoadBalancerListener.let(AnalysisLoadBalancerListenerProperty.Companion::unwrap))
      }

      /**
       * @param classicLoadBalancerListener The listener for a Classic Load Balancer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9451419d8679443564bc955972142fb9e76cc03f8ba4b83eec108d87c301a6ea")
      override
          fun classicLoadBalancerListener(classicLoadBalancerListener: AnalysisLoadBalancerListenerProperty.Builder.() -> Unit):
          Unit =
          classicLoadBalancerListener(AnalysisLoadBalancerListenerProperty(classicLoadBalancerListener))

      /**
       * @param component The component.
       */
      override fun component(component: IResolvable) {
        cdkBuilder.component(component.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param component The component.
       */
      override fun component(component: AnalysisComponentProperty) {
        cdkBuilder.component(component.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param component The component.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1da032909557b7fe260b797a54e345e5f8b7205724950b2330594af4c85e2bc6")
      override fun component(component: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          component(AnalysisComponentProperty(component))

      /**
       * @param componentAccount The AWS account for the component.
       */
      override fun componentAccount(componentAccount: String) {
        cdkBuilder.componentAccount(componentAccount)
      }

      /**
       * @param componentRegion The Region for the component.
       */
      override fun componentRegion(componentRegion: String) {
        cdkBuilder.componentRegion(componentRegion)
      }

      /**
       * @param customerGateway The customer gateway.
       */
      override fun customerGateway(customerGateway: IResolvable) {
        cdkBuilder.customerGateway(customerGateway.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customerGateway The customer gateway.
       */
      override fun customerGateway(customerGateway: AnalysisComponentProperty) {
        cdkBuilder.customerGateway(customerGateway.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param customerGateway The customer gateway.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4d11e5a080e9afebbc359fd3635c20be04c5f664ada5e55f279cc81e8d2cd4a")
      override fun customerGateway(customerGateway: AnalysisComponentProperty.Builder.() -> Unit):
          Unit = customerGateway(AnalysisComponentProperty(customerGateway))

      /**
       * @param destination The destination.
       */
      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param destination The destination.
       */
      override fun destination(destination: AnalysisComponentProperty) {
        cdkBuilder.destination(destination.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param destination The destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a686803273cded7f10780e613aaa8e09a3f9e725007ebd45cc620046de307505")
      override fun destination(destination: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          destination(AnalysisComponentProperty(destination))

      /**
       * @param destinationVpc The destination VPC.
       */
      override fun destinationVpc(destinationVpc: IResolvable) {
        cdkBuilder.destinationVpc(destinationVpc.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param destinationVpc The destination VPC.
       */
      override fun destinationVpc(destinationVpc: AnalysisComponentProperty) {
        cdkBuilder.destinationVpc(destinationVpc.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param destinationVpc The destination VPC.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f51af5adec137b322543aa5b0b0d2b9894b124914af8bb8ad9a0aa98f1c9c2ea")
      override fun destinationVpc(destinationVpc: AnalysisComponentProperty.Builder.() -> Unit):
          Unit = destinationVpc(AnalysisComponentProperty(destinationVpc))

      /**
       * @param direction The direction. The following are the possible values:.
       * * egress
       * * ingress
       */
      override fun direction(direction: String) {
        cdkBuilder.direction(direction)
      }

      /**
       * @param elasticLoadBalancerListener The load balancer listener.
       */
      override fun elasticLoadBalancerListener(elasticLoadBalancerListener: IResolvable) {
        cdkBuilder.elasticLoadBalancerListener(elasticLoadBalancerListener.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param elasticLoadBalancerListener The load balancer listener.
       */
      override
          fun elasticLoadBalancerListener(elasticLoadBalancerListener: AnalysisComponentProperty) {
        cdkBuilder.elasticLoadBalancerListener(elasticLoadBalancerListener.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param elasticLoadBalancerListener The load balancer listener.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a1fdfba6aeeb3261bf38a00eb32725b5dc751dbf2a0606d7e257de9d71ee93b")
      override
          fun elasticLoadBalancerListener(elasticLoadBalancerListener: AnalysisComponentProperty.Builder.() -> Unit):
          Unit = elasticLoadBalancerListener(AnalysisComponentProperty(elasticLoadBalancerListener))

      /**
       * @param explanationCode The explanation code.
       */
      override fun explanationCode(explanationCode: String) {
        cdkBuilder.explanationCode(explanationCode)
      }

      /**
       * @param ingressRouteTable The route table.
       */
      override fun ingressRouteTable(ingressRouteTable: IResolvable) {
        cdkBuilder.ingressRouteTable(ingressRouteTable.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ingressRouteTable The route table.
       */
      override fun ingressRouteTable(ingressRouteTable: AnalysisComponentProperty) {
        cdkBuilder.ingressRouteTable(ingressRouteTable.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param ingressRouteTable The route table.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("773755699fd1941dfadb46cba6b17aabf027d523e82b5f1d6dcc0d910c59cb58")
      override
          fun ingressRouteTable(ingressRouteTable: AnalysisComponentProperty.Builder.() -> Unit):
          Unit = ingressRouteTable(AnalysisComponentProperty(ingressRouteTable))

      /**
       * @param internetGateway The internet gateway.
       */
      override fun internetGateway(internetGateway: IResolvable) {
        cdkBuilder.internetGateway(internetGateway.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param internetGateway The internet gateway.
       */
      override fun internetGateway(internetGateway: AnalysisComponentProperty) {
        cdkBuilder.internetGateway(internetGateway.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param internetGateway The internet gateway.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7610131dafb58869d284817acb538b96dc622ac86180ea6244101ffc8ab185af")
      override fun internetGateway(internetGateway: AnalysisComponentProperty.Builder.() -> Unit):
          Unit = internetGateway(AnalysisComponentProperty(internetGateway))

      /**
       * @param loadBalancerArn The Amazon Resource Name (ARN) of the load balancer.
       */
      override fun loadBalancerArn(loadBalancerArn: String) {
        cdkBuilder.loadBalancerArn(loadBalancerArn)
      }

      /**
       * @param loadBalancerListenerPort The listener port of the load balancer.
       */
      override fun loadBalancerListenerPort(loadBalancerListenerPort: Number) {
        cdkBuilder.loadBalancerListenerPort(loadBalancerListenerPort)
      }

      /**
       * @param loadBalancerTarget The target.
       */
      override fun loadBalancerTarget(loadBalancerTarget: IResolvable) {
        cdkBuilder.loadBalancerTarget(loadBalancerTarget.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param loadBalancerTarget The target.
       */
      override fun loadBalancerTarget(loadBalancerTarget: AnalysisLoadBalancerTargetProperty) {
        cdkBuilder.loadBalancerTarget(loadBalancerTarget.let(AnalysisLoadBalancerTargetProperty.Companion::unwrap))
      }

      /**
       * @param loadBalancerTarget The target.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("61717c60f169baa5bb513b1dea51b8c8aa9dfd236d5775835d402c8ba86819ea")
      override
          fun loadBalancerTarget(loadBalancerTarget: AnalysisLoadBalancerTargetProperty.Builder.() -> Unit):
          Unit = loadBalancerTarget(AnalysisLoadBalancerTargetProperty(loadBalancerTarget))

      /**
       * @param loadBalancerTargetGroup The target group.
       */
      override fun loadBalancerTargetGroup(loadBalancerTargetGroup: IResolvable) {
        cdkBuilder.loadBalancerTargetGroup(loadBalancerTargetGroup.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param loadBalancerTargetGroup The target group.
       */
      override fun loadBalancerTargetGroup(loadBalancerTargetGroup: AnalysisComponentProperty) {
        cdkBuilder.loadBalancerTargetGroup(loadBalancerTargetGroup.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param loadBalancerTargetGroup The target group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9fce53699efcc97f67cbae9f09981daf56e3e0705f08614d046cf91c1a234404")
      override
          fun loadBalancerTargetGroup(loadBalancerTargetGroup: AnalysisComponentProperty.Builder.() -> Unit):
          Unit = loadBalancerTargetGroup(AnalysisComponentProperty(loadBalancerTargetGroup))

      /**
       * @param loadBalancerTargetGroups The target groups.
       */
      override fun loadBalancerTargetGroups(loadBalancerTargetGroups: IResolvable) {
        cdkBuilder.loadBalancerTargetGroups(loadBalancerTargetGroups.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param loadBalancerTargetGroups The target groups.
       */
      override fun loadBalancerTargetGroups(loadBalancerTargetGroups: List<Any>) {
        cdkBuilder.loadBalancerTargetGroups(loadBalancerTargetGroups.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param loadBalancerTargetGroups The target groups.
       */
      override fun loadBalancerTargetGroups(vararg loadBalancerTargetGroups: Any): Unit =
          loadBalancerTargetGroups(loadBalancerTargetGroups.toList())

      /**
       * @param loadBalancerTargetPort The target port.
       */
      override fun loadBalancerTargetPort(loadBalancerTargetPort: Number) {
        cdkBuilder.loadBalancerTargetPort(loadBalancerTargetPort)
      }

      /**
       * @param missingComponent The missing component.
       */
      override fun missingComponent(missingComponent: String) {
        cdkBuilder.missingComponent(missingComponent)
      }

      /**
       * @param natGateway The NAT gateway.
       */
      override fun natGateway(natGateway: IResolvable) {
        cdkBuilder.natGateway(natGateway.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param natGateway The NAT gateway.
       */
      override fun natGateway(natGateway: AnalysisComponentProperty) {
        cdkBuilder.natGateway(natGateway.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param natGateway The NAT gateway.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fa801e01d40ce33c9b25562393ea028bfe9c43f5ed7d605725a8f56615b919ac")
      override fun natGateway(natGateway: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          natGateway(AnalysisComponentProperty(natGateway))

      /**
       * @param networkInterface The network interface.
       */
      override fun networkInterface(networkInterface: IResolvable) {
        cdkBuilder.networkInterface(networkInterface.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param networkInterface The network interface.
       */
      override fun networkInterface(networkInterface: AnalysisComponentProperty) {
        cdkBuilder.networkInterface(networkInterface.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param networkInterface The network interface.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7450aedbd567f718c75cede2762de6ba2186748203910a6d9a1a34a52354f9e7")
      override fun networkInterface(networkInterface: AnalysisComponentProperty.Builder.() -> Unit):
          Unit = networkInterface(AnalysisComponentProperty(networkInterface))

      /**
       * @param packetField The packet field.
       */
      override fun packetField(packetField: String) {
        cdkBuilder.packetField(packetField)
      }

      /**
       * @param port The port.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param portRanges The port ranges.
       */
      override fun portRanges(portRanges: IResolvable) {
        cdkBuilder.portRanges(portRanges.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param portRanges The port ranges.
       */
      override fun portRanges(portRanges: List<Any>) {
        cdkBuilder.portRanges(portRanges.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param portRanges The port ranges.
       */
      override fun portRanges(vararg portRanges: Any): Unit = portRanges(portRanges.toList())

      /**
       * @param prefixList The prefix list.
       */
      override fun prefixList(prefixList: IResolvable) {
        cdkBuilder.prefixList(prefixList.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param prefixList The prefix list.
       */
      override fun prefixList(prefixList: AnalysisComponentProperty) {
        cdkBuilder.prefixList(prefixList.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param prefixList The prefix list.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1da1c72a17748568ee9f55443dff6778305e20c538f7276338708663554a72e6")
      override fun prefixList(prefixList: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          prefixList(AnalysisComponentProperty(prefixList))

      /**
       * @param protocols The protocols.
       */
      override fun protocols(protocols: List<String>) {
        cdkBuilder.protocols(protocols)
      }

      /**
       * @param protocols The protocols.
       */
      override fun protocols(vararg protocols: String): Unit = protocols(protocols.toList())

      /**
       * @param routeTable The route table.
       */
      override fun routeTable(routeTable: IResolvable) {
        cdkBuilder.routeTable(routeTable.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param routeTable The route table.
       */
      override fun routeTable(routeTable: AnalysisComponentProperty) {
        cdkBuilder.routeTable(routeTable.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param routeTable The route table.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("addd8d3e5338b52fe2640bcbabf54aadd69b710bdd658262a9d5d87ca019e953")
      override fun routeTable(routeTable: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          routeTable(AnalysisComponentProperty(routeTable))

      /**
       * @param routeTableRoute The route table route.
       */
      override fun routeTableRoute(routeTableRoute: IResolvable) {
        cdkBuilder.routeTableRoute(routeTableRoute.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param routeTableRoute The route table route.
       */
      override fun routeTableRoute(routeTableRoute: AnalysisRouteTableRouteProperty) {
        cdkBuilder.routeTableRoute(routeTableRoute.let(AnalysisRouteTableRouteProperty.Companion::unwrap))
      }

      /**
       * @param routeTableRoute The route table route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("077f21603e1c6ac087e6d67c0b048cc3951551a991fb719bd1d193325f1101ff")
      override
          fun routeTableRoute(routeTableRoute: AnalysisRouteTableRouteProperty.Builder.() -> Unit):
          Unit = routeTableRoute(AnalysisRouteTableRouteProperty(routeTableRoute))

      /**
       * @param securityGroup The security group.
       */
      override fun securityGroup(securityGroup: IResolvable) {
        cdkBuilder.securityGroup(securityGroup.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param securityGroup The security group.
       */
      override fun securityGroup(securityGroup: AnalysisComponentProperty) {
        cdkBuilder.securityGroup(securityGroup.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param securityGroup The security group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a57eb2f9eb9322cb9ff3b93a37f91e6352d6bd8f90fe4feba0989e1ee56e9cbf")
      override fun securityGroup(securityGroup: AnalysisComponentProperty.Builder.() -> Unit): Unit
          = securityGroup(AnalysisComponentProperty(securityGroup))

      /**
       * @param securityGroupRule The security group rule.
       */
      override fun securityGroupRule(securityGroupRule: IResolvable) {
        cdkBuilder.securityGroupRule(securityGroupRule.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param securityGroupRule The security group rule.
       */
      override fun securityGroupRule(securityGroupRule: AnalysisSecurityGroupRuleProperty) {
        cdkBuilder.securityGroupRule(securityGroupRule.let(AnalysisSecurityGroupRuleProperty.Companion::unwrap))
      }

      /**
       * @param securityGroupRule The security group rule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e492823be51adb2a2414d80236e38df04a8dc309a590a9df62e986acbdfa6e87")
      override
          fun securityGroupRule(securityGroupRule: AnalysisSecurityGroupRuleProperty.Builder.() -> Unit):
          Unit = securityGroupRule(AnalysisSecurityGroupRuleProperty(securityGroupRule))

      /**
       * @param securityGroups The security groups.
       */
      override fun securityGroups(securityGroups: IResolvable) {
        cdkBuilder.securityGroups(securityGroups.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param securityGroups The security groups.
       */
      override fun securityGroups(securityGroups: List<Any>) {
        cdkBuilder.securityGroups(securityGroups.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param securityGroups The security groups.
       */
      override fun securityGroups(vararg securityGroups: Any): Unit =
          securityGroups(securityGroups.toList())

      /**
       * @param sourceVpc The source VPC.
       */
      override fun sourceVpc(sourceVpc: IResolvable) {
        cdkBuilder.sourceVpc(sourceVpc.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sourceVpc The source VPC.
       */
      override fun sourceVpc(sourceVpc: AnalysisComponentProperty) {
        cdkBuilder.sourceVpc(sourceVpc.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param sourceVpc The source VPC.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27af9107563805c956e34b6cd29236fe3f85d8c6a90cf764db26f60685a9b2e5")
      override fun sourceVpc(sourceVpc: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          sourceVpc(AnalysisComponentProperty(sourceVpc))

      /**
       * @param state The state.
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      /**
       * @param subnet The subnet.
       */
      override fun subnet(subnet: IResolvable) {
        cdkBuilder.subnet(subnet.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param subnet The subnet.
       */
      override fun subnet(subnet: AnalysisComponentProperty) {
        cdkBuilder.subnet(subnet.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param subnet The subnet.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3b128827dcace50aa299c80150525f5fec902a4ed3a2546229850bb96682ca78")
      override fun subnet(subnet: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          subnet(AnalysisComponentProperty(subnet))

      /**
       * @param subnetRouteTable The route table for the subnet.
       */
      override fun subnetRouteTable(subnetRouteTable: IResolvable) {
        cdkBuilder.subnetRouteTable(subnetRouteTable.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param subnetRouteTable The route table for the subnet.
       */
      override fun subnetRouteTable(subnetRouteTable: AnalysisComponentProperty) {
        cdkBuilder.subnetRouteTable(subnetRouteTable.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param subnetRouteTable The route table for the subnet.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1a40c9d124152a53b14f80b23a58e155706f768bb73eb83d38b6967b3f2ee4d2")
      override fun subnetRouteTable(subnetRouteTable: AnalysisComponentProperty.Builder.() -> Unit):
          Unit = subnetRouteTable(AnalysisComponentProperty(subnetRouteTable))

      /**
       * @param transitGateway The transit gateway.
       */
      override fun transitGateway(transitGateway: IResolvable) {
        cdkBuilder.transitGateway(transitGateway.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param transitGateway The transit gateway.
       */
      override fun transitGateway(transitGateway: AnalysisComponentProperty) {
        cdkBuilder.transitGateway(transitGateway.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param transitGateway The transit gateway.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("50266278c0845fca742e5d73d33fa93efb0b72c2fb8141dc083edc1228c4409d")
      override fun transitGateway(transitGateway: AnalysisComponentProperty.Builder.() -> Unit):
          Unit = transitGateway(AnalysisComponentProperty(transitGateway))

      /**
       * @param transitGatewayAttachment The transit gateway attachment.
       */
      override fun transitGatewayAttachment(transitGatewayAttachment: IResolvable) {
        cdkBuilder.transitGatewayAttachment(transitGatewayAttachment.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param transitGatewayAttachment The transit gateway attachment.
       */
      override fun transitGatewayAttachment(transitGatewayAttachment: AnalysisComponentProperty) {
        cdkBuilder.transitGatewayAttachment(transitGatewayAttachment.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param transitGatewayAttachment The transit gateway attachment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1e6dad8a30a668f3899dccee9584f41c7eaec54585d826bd02217e01d514f914")
      override
          fun transitGatewayAttachment(transitGatewayAttachment: AnalysisComponentProperty.Builder.() -> Unit):
          Unit = transitGatewayAttachment(AnalysisComponentProperty(transitGatewayAttachment))

      /**
       * @param transitGatewayRouteTable The transit gateway route table.
       */
      override fun transitGatewayRouteTable(transitGatewayRouteTable: IResolvable) {
        cdkBuilder.transitGatewayRouteTable(transitGatewayRouteTable.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param transitGatewayRouteTable The transit gateway route table.
       */
      override fun transitGatewayRouteTable(transitGatewayRouteTable: AnalysisComponentProperty) {
        cdkBuilder.transitGatewayRouteTable(transitGatewayRouteTable.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param transitGatewayRouteTable The transit gateway route table.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4a7e4cca421d1ea8cc6c7407dd2ac9e6357d695efff1399351669ca0c03d761e")
      override
          fun transitGatewayRouteTable(transitGatewayRouteTable: AnalysisComponentProperty.Builder.() -> Unit):
          Unit = transitGatewayRouteTable(AnalysisComponentProperty(transitGatewayRouteTable))

      /**
       * @param transitGatewayRouteTableRoute The transit gateway route table route.
       */
      override fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: IResolvable) {
        cdkBuilder.transitGatewayRouteTableRoute(transitGatewayRouteTableRoute.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param transitGatewayRouteTableRoute The transit gateway route table route.
       */
      override
          fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: TransitGatewayRouteTableRouteProperty) {
        cdkBuilder.transitGatewayRouteTableRoute(transitGatewayRouteTableRoute.let(TransitGatewayRouteTableRouteProperty.Companion::unwrap))
      }

      /**
       * @param transitGatewayRouteTableRoute The transit gateway route table route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c4950e82f10db35eb78952cfc65d01e2463d6ff92f05eb0e0f7e1c02df89fcc")
      override
          fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: TransitGatewayRouteTableRouteProperty.Builder.() -> Unit):
          Unit =
          transitGatewayRouteTableRoute(TransitGatewayRouteTableRouteProperty(transitGatewayRouteTableRoute))

      /**
       * @param vpc The component VPC.
       */
      override fun vpc(vpc: IResolvable) {
        cdkBuilder.vpc(vpc.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vpc The component VPC.
       */
      override fun vpc(vpc: AnalysisComponentProperty) {
        cdkBuilder.vpc(vpc.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param vpc The component VPC.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01b9579f79b35a2679bdc9a34d7b81d4de6f4b4df83097553d8fd0e8f47ac433")
      override fun vpc(vpc: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          vpc(AnalysisComponentProperty(vpc))

      /**
       * @param vpcEndpoint The VPC endpoint.
       */
      override fun vpcEndpoint(vpcEndpoint: IResolvable) {
        cdkBuilder.vpcEndpoint(vpcEndpoint.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vpcEndpoint The VPC endpoint.
       */
      override fun vpcEndpoint(vpcEndpoint: AnalysisComponentProperty) {
        cdkBuilder.vpcEndpoint(vpcEndpoint.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param vpcEndpoint The VPC endpoint.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf6c7e8e6abb4afdf2a4fcec210177d1c2cbc27eb69931f026da17bc8c57f925")
      override fun vpcEndpoint(vpcEndpoint: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          vpcEndpoint(AnalysisComponentProperty(vpcEndpoint))

      /**
       * @param vpcPeeringConnection The VPC peering connection.
       */
      override fun vpcPeeringConnection(vpcPeeringConnection: IResolvable) {
        cdkBuilder.vpcPeeringConnection(vpcPeeringConnection.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vpcPeeringConnection The VPC peering connection.
       */
      override fun vpcPeeringConnection(vpcPeeringConnection: AnalysisComponentProperty) {
        cdkBuilder.vpcPeeringConnection(vpcPeeringConnection.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param vpcPeeringConnection The VPC peering connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2fb68077a808fd6bb36e2bb7582c7b0d6c7a4e55663ab7f4e19ef9207233ef52")
      override
          fun vpcPeeringConnection(vpcPeeringConnection: AnalysisComponentProperty.Builder.() -> Unit):
          Unit = vpcPeeringConnection(AnalysisComponentProperty(vpcPeeringConnection))

      /**
       * @param vpnConnection The VPN connection.
       */
      override fun vpnConnection(vpnConnection: IResolvable) {
        cdkBuilder.vpnConnection(vpnConnection.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vpnConnection The VPN connection.
       */
      override fun vpnConnection(vpnConnection: AnalysisComponentProperty) {
        cdkBuilder.vpnConnection(vpnConnection.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param vpnConnection The VPN connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a06080ec27a8e104f495416404d4065e86ad807d4c24b86ad554ec55bb6704c0")
      override fun vpnConnection(vpnConnection: AnalysisComponentProperty.Builder.() -> Unit): Unit
          = vpnConnection(AnalysisComponentProperty(vpnConnection))

      /**
       * @param vpnGateway The VPN gateway.
       */
      override fun vpnGateway(vpnGateway: IResolvable) {
        cdkBuilder.vpnGateway(vpnGateway.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vpnGateway The VPN gateway.
       */
      override fun vpnGateway(vpnGateway: AnalysisComponentProperty) {
        cdkBuilder.vpnGateway(vpnGateway.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param vpnGateway The VPN gateway.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc28fbd01369a3708d7b71693a81ceb38cdc4ba3d0de7d8b77fd55f13281aecb")
      override fun vpnGateway(vpnGateway: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          vpnGateway(AnalysisComponentProperty(vpnGateway))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.ExplanationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.ExplanationProperty,
    ) : CdkObject(cdkObject), ExplanationProperty {
      /**
       * The network ACL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-acl)
       */
      override fun acl(): Any? = unwrap(this).getAcl()

      /**
       * The network ACL rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-aclrule)
       */
      override fun aclRule(): Any? = unwrap(this).getAclRule()

      /**
       * The IPv4 address, in CIDR notation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-address)
       */
      override fun address(): String? = unwrap(this).getAddress()

      /**
       * The IPv4 addresses, in CIDR notation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-addresses)
       */
      override fun addresses(): List<String> = unwrap(this).getAddresses() ?: emptyList()

      /**
       * The resource to which the component is attached.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-attachedto)
       */
      override fun attachedTo(): Any? = unwrap(this).getAttachedTo()

      /**
       * The Availability Zones.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-availabilityzones)
       */
      override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
          emptyList()

      /**
       * The CIDR ranges.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-cidrs)
       */
      override fun cidrs(): List<String> = unwrap(this).getCidrs() ?: emptyList()

      /**
       * The listener for a Classic Load Balancer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-classicloadbalancerlistener)
       */
      override fun classicLoadBalancerListener(): Any? =
          unwrap(this).getClassicLoadBalancerListener()

      /**
       * The component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-component)
       */
      override fun component(): Any? = unwrap(this).getComponent()

      /**
       * The AWS account for the component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-componentaccount)
       */
      override fun componentAccount(): String? = unwrap(this).getComponentAccount()

      /**
       * The Region for the component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-componentregion)
       */
      override fun componentRegion(): String? = unwrap(this).getComponentRegion()

      /**
       * The customer gateway.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-customergateway)
       */
      override fun customerGateway(): Any? = unwrap(this).getCustomerGateway()

      /**
       * The destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-destination)
       */
      override fun destination(): Any? = unwrap(this).getDestination()

      /**
       * The destination VPC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-destinationvpc)
       */
      override fun destinationVpc(): Any? = unwrap(this).getDestinationVpc()

      /**
       * The direction. The following are the possible values:.
       *
       * * egress
       * * ingress
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-direction)
       */
      override fun direction(): String? = unwrap(this).getDirection()

      /**
       * The load balancer listener.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-elasticloadbalancerlistener)
       */
      override fun elasticLoadBalancerListener(): Any? =
          unwrap(this).getElasticLoadBalancerListener()

      /**
       * The explanation code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-explanationcode)
       */
      override fun explanationCode(): String? = unwrap(this).getExplanationCode()

      /**
       * The route table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-ingressroutetable)
       */
      override fun ingressRouteTable(): Any? = unwrap(this).getIngressRouteTable()

      /**
       * The internet gateway.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-internetgateway)
       */
      override fun internetGateway(): Any? = unwrap(this).getInternetGateway()

      /**
       * The Amazon Resource Name (ARN) of the load balancer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-loadbalancerarn)
       */
      override fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

      /**
       * The listener port of the load balancer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-loadbalancerlistenerport)
       */
      override fun loadBalancerListenerPort(): Number? = unwrap(this).getLoadBalancerListenerPort()

      /**
       * The target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-loadbalancertarget)
       */
      override fun loadBalancerTarget(): Any? = unwrap(this).getLoadBalancerTarget()

      /**
       * The target group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-loadbalancertargetgroup)
       */
      override fun loadBalancerTargetGroup(): Any? = unwrap(this).getLoadBalancerTargetGroup()

      /**
       * The target groups.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-loadbalancertargetgroups)
       */
      override fun loadBalancerTargetGroups(): Any? = unwrap(this).getLoadBalancerTargetGroups()

      /**
       * The target port.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-loadbalancertargetport)
       */
      override fun loadBalancerTargetPort(): Number? = unwrap(this).getLoadBalancerTargetPort()

      /**
       * The missing component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-missingcomponent)
       */
      override fun missingComponent(): String? = unwrap(this).getMissingComponent()

      /**
       * The NAT gateway.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-natgateway)
       */
      override fun natGateway(): Any? = unwrap(this).getNatGateway()

      /**
       * The network interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-networkinterface)
       */
      override fun networkInterface(): Any? = unwrap(this).getNetworkInterface()

      /**
       * The packet field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-packetfield)
       */
      override fun packetField(): String? = unwrap(this).getPacketField()

      /**
       * The port.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-port)
       */
      override fun port(): Number? = unwrap(this).getPort()

      /**
       * The port ranges.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-portranges)
       */
      override fun portRanges(): Any? = unwrap(this).getPortRanges()

      /**
       * The prefix list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-prefixlist)
       */
      override fun prefixList(): Any? = unwrap(this).getPrefixList()

      /**
       * The protocols.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-protocols)
       */
      override fun protocols(): List<String> = unwrap(this).getProtocols() ?: emptyList()

      /**
       * The route table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-routetable)
       */
      override fun routeTable(): Any? = unwrap(this).getRouteTable()

      /**
       * The route table route.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-routetableroute)
       */
      override fun routeTableRoute(): Any? = unwrap(this).getRouteTableRoute()

      /**
       * The security group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-securitygroup)
       */
      override fun securityGroup(): Any? = unwrap(this).getSecurityGroup()

      /**
       * The security group rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-securitygrouprule)
       */
      override fun securityGroupRule(): Any? = unwrap(this).getSecurityGroupRule()

      /**
       * The security groups.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-securitygroups)
       */
      override fun securityGroups(): Any? = unwrap(this).getSecurityGroups()

      /**
       * The source VPC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-sourcevpc)
       */
      override fun sourceVpc(): Any? = unwrap(this).getSourceVpc()

      /**
       * The state.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-state)
       */
      override fun state(): String? = unwrap(this).getState()

      /**
       * The subnet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-subnet)
       */
      override fun subnet(): Any? = unwrap(this).getSubnet()

      /**
       * The route table for the subnet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-subnetroutetable)
       */
      override fun subnetRouteTable(): Any? = unwrap(this).getSubnetRouteTable()

      /**
       * The transit gateway.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-transitgateway)
       */
      override fun transitGateway(): Any? = unwrap(this).getTransitGateway()

      /**
       * The transit gateway attachment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-transitgatewayattachment)
       */
      override fun transitGatewayAttachment(): Any? = unwrap(this).getTransitGatewayAttachment()

      /**
       * The transit gateway route table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-transitgatewayroutetable)
       */
      override fun transitGatewayRouteTable(): Any? = unwrap(this).getTransitGatewayRouteTable()

      /**
       * The transit gateway route table route.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-transitgatewayroutetableroute)
       */
      override fun transitGatewayRouteTableRoute(): Any? =
          unwrap(this).getTransitGatewayRouteTableRoute()

      /**
       * The component VPC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-vpc)
       */
      override fun vpc(): Any? = unwrap(this).getVpc()

      /**
       * The VPC endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-vpcendpoint)
       */
      override fun vpcEndpoint(): Any? = unwrap(this).getVpcEndpoint()

      /**
       * The VPC peering connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-vpcpeeringconnection)
       */
      override fun vpcPeeringConnection(): Any? = unwrap(this).getVpcPeeringConnection()

      /**
       * The VPN connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-vpnconnection)
       */
      override fun vpnConnection(): Any? = unwrap(this).getVpnConnection()

      /**
       * The VPN gateway.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html#cfn-ec2-networkinsightsanalysis-explanation-vpngateway)
       */
      override fun vpnGateway(): Any? = unwrap(this).getVpnGateway()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExplanationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.ExplanationProperty):
          ExplanationProperty = CdkObjectWrappers.wrap(cdkObject) as? ExplanationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExplanationProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.ExplanationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.ExplanationProperty
    }
  }

  /**
   * Describes a path component.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * PathComponentProperty pathComponentProperty = PathComponentProperty.builder()
   * .aclRule(AnalysisAclRuleProperty.builder()
   * .cidr("cidr")
   * .egress(false)
   * .portRange(PortRangeProperty.builder()
   * .from(123)
   * .to(123)
   * .build())
   * .protocol("protocol")
   * .ruleAction("ruleAction")
   * .ruleNumber(123)
   * .build())
   * .additionalDetails(List.of(AdditionalDetailProperty.builder()
   * .additionalDetailType("additionalDetailType")
   * .component(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .loadBalancers(List.of(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build()))
   * .serviceName("serviceName")
   * .build()))
   * .component(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .destinationVpc(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .elasticLoadBalancerListener(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .explanations(List.of(ExplanationProperty.builder()
   * .acl(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .aclRule(AnalysisAclRuleProperty.builder()
   * .cidr("cidr")
   * .egress(false)
   * .portRange(PortRangeProperty.builder()
   * .from(123)
   * .to(123)
   * .build())
   * .protocol("protocol")
   * .ruleAction("ruleAction")
   * .ruleNumber(123)
   * .build())
   * .address("address")
   * .addresses(List.of("addresses"))
   * .attachedTo(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .availabilityZones(List.of("availabilityZones"))
   * .cidrs(List.of("cidrs"))
   * .classicLoadBalancerListener(AnalysisLoadBalancerListenerProperty.builder()
   * .instancePort(123)
   * .loadBalancerPort(123)
   * .build())
   * .component(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .componentAccount("componentAccount")
   * .componentRegion("componentRegion")
   * .customerGateway(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .destination(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .destinationVpc(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .direction("direction")
   * .elasticLoadBalancerListener(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .explanationCode("explanationCode")
   * .ingressRouteTable(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .internetGateway(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .loadBalancerArn("loadBalancerArn")
   * .loadBalancerListenerPort(123)
   * .loadBalancerTarget(AnalysisLoadBalancerTargetProperty.builder()
   * .address("address")
   * .availabilityZone("availabilityZone")
   * .instance(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .port(123)
   * .build())
   * .loadBalancerTargetGroup(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .loadBalancerTargetGroups(List.of(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build()))
   * .loadBalancerTargetPort(123)
   * .missingComponent("missingComponent")
   * .natGateway(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .networkInterface(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .packetField("packetField")
   * .port(123)
   * .portRanges(List.of(PortRangeProperty.builder()
   * .from(123)
   * .to(123)
   * .build()))
   * .prefixList(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .protocols(List.of("protocols"))
   * .routeTable(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .routeTableRoute(AnalysisRouteTableRouteProperty.builder()
   * .destinationCidr("destinationCidr")
   * .destinationPrefixListId("destinationPrefixListId")
   * .egressOnlyInternetGatewayId("egressOnlyInternetGatewayId")
   * .gatewayId("gatewayId")
   * .instanceId("instanceId")
   * .natGatewayId("natGatewayId")
   * .networkInterfaceId("networkInterfaceId")
   * .origin("origin")
   * .state("state")
   * .transitGatewayId("transitGatewayId")
   * .vpcPeeringConnectionId("vpcPeeringConnectionId")
   * .build())
   * .securityGroup(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .securityGroupRule(AnalysisSecurityGroupRuleProperty.builder()
   * .cidr("cidr")
   * .direction("direction")
   * .portRange(PortRangeProperty.builder()
   * .from(123)
   * .to(123)
   * .build())
   * .prefixListId("prefixListId")
   * .protocol("protocol")
   * .securityGroupId("securityGroupId")
   * .build())
   * .securityGroups(List.of(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build()))
   * .sourceVpc(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .state("state")
   * .subnet(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .subnetRouteTable(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .transitGateway(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .transitGatewayAttachment(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .transitGatewayRouteTable(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .transitGatewayRouteTableRoute(TransitGatewayRouteTableRouteProperty.builder()
   * .attachmentId("attachmentId")
   * .destinationCidr("destinationCidr")
   * .prefixListId("prefixListId")
   * .resourceId("resourceId")
   * .resourceType("resourceType")
   * .routeOrigin("routeOrigin")
   * .state("state")
   * .build())
   * .vpc(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .vpcEndpoint(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .vpcPeeringConnection(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .vpnConnection(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .vpnGateway(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .build()))
   * .inboundHeader(AnalysisPacketHeaderProperty.builder()
   * .destinationAddresses(List.of("destinationAddresses"))
   * .destinationPortRanges(List.of(PortRangeProperty.builder()
   * .from(123)
   * .to(123)
   * .build()))
   * .protocol("protocol")
   * .sourceAddresses(List.of("sourceAddresses"))
   * .sourcePortRanges(List.of(PortRangeProperty.builder()
   * .from(123)
   * .to(123)
   * .build()))
   * .build())
   * .outboundHeader(AnalysisPacketHeaderProperty.builder()
   * .destinationAddresses(List.of("destinationAddresses"))
   * .destinationPortRanges(List.of(PortRangeProperty.builder()
   * .from(123)
   * .to(123)
   * .build()))
   * .protocol("protocol")
   * .sourceAddresses(List.of("sourceAddresses"))
   * .sourcePortRanges(List.of(PortRangeProperty.builder()
   * .from(123)
   * .to(123)
   * .build()))
   * .build())
   * .routeTableRoute(AnalysisRouteTableRouteProperty.builder()
   * .destinationCidr("destinationCidr")
   * .destinationPrefixListId("destinationPrefixListId")
   * .egressOnlyInternetGatewayId("egressOnlyInternetGatewayId")
   * .gatewayId("gatewayId")
   * .instanceId("instanceId")
   * .natGatewayId("natGatewayId")
   * .networkInterfaceId("networkInterfaceId")
   * .origin("origin")
   * .state("state")
   * .transitGatewayId("transitGatewayId")
   * .vpcPeeringConnectionId("vpcPeeringConnectionId")
   * .build())
   * .securityGroupRule(AnalysisSecurityGroupRuleProperty.builder()
   * .cidr("cidr")
   * .direction("direction")
   * .portRange(PortRangeProperty.builder()
   * .from(123)
   * .to(123)
   * .build())
   * .prefixListId("prefixListId")
   * .protocol("protocol")
   * .securityGroupId("securityGroupId")
   * .build())
   * .sequenceNumber(123)
   * .serviceName("serviceName")
   * .sourceVpc(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .subnet(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .transitGateway(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .transitGatewayRouteTableRoute(TransitGatewayRouteTableRouteProperty.builder()
   * .attachmentId("attachmentId")
   * .destinationCidr("destinationCidr")
   * .prefixListId("prefixListId")
   * .resourceId("resourceId")
   * .resourceType("resourceType")
   * .routeOrigin("routeOrigin")
   * .state("state")
   * .build())
   * .vpc(AnalysisComponentProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html)
   */
  public interface PathComponentProperty {
    /**
     * The network ACL rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-aclrule)
     */
    public fun aclRule(): Any? = unwrap(this).getAclRule()

    /**
     * The additional details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-additionaldetails)
     */
    public fun additionalDetails(): Any? = unwrap(this).getAdditionalDetails()

    /**
     * The component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-component)
     */
    public fun component(): Any? = unwrap(this).getComponent()

    /**
     * The destination VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-destinationvpc)
     */
    public fun destinationVpc(): Any? = unwrap(this).getDestinationVpc()

    /**
     * The load balancer listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-elasticloadbalancerlistener)
     */
    public fun elasticLoadBalancerListener(): Any? = unwrap(this).getElasticLoadBalancerListener()

    /**
     * The explanation codes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-explanations)
     */
    public fun explanations(): Any? = unwrap(this).getExplanations()

    /**
     * The inbound header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-inboundheader)
     */
    public fun inboundHeader(): Any? = unwrap(this).getInboundHeader()

    /**
     * The outbound header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-outboundheader)
     */
    public fun outboundHeader(): Any? = unwrap(this).getOutboundHeader()

    /**
     * The route table route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-routetableroute)
     */
    public fun routeTableRoute(): Any? = unwrap(this).getRouteTableRoute()

    /**
     * The security group rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-securitygrouprule)
     */
    public fun securityGroupRule(): Any? = unwrap(this).getSecurityGroupRule()

    /**
     * The sequence number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-sequencenumber)
     */
    public fun sequenceNumber(): Number? = unwrap(this).getSequenceNumber()

    /**
     * The name of the VPC endpoint service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-servicename)
     */
    public fun serviceName(): String? = unwrap(this).getServiceName()

    /**
     * The source VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-sourcevpc)
     */
    public fun sourceVpc(): Any? = unwrap(this).getSourceVpc()

    /**
     * The subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-subnet)
     */
    public fun subnet(): Any? = unwrap(this).getSubnet()

    /**
     * The transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-transitgateway)
     */
    public fun transitGateway(): Any? = unwrap(this).getTransitGateway()

    /**
     * The route in a transit gateway route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-transitgatewayroutetableroute)
     */
    public fun transitGatewayRouteTableRoute(): Any? =
        unwrap(this).getTransitGatewayRouteTableRoute()

    /**
     * The component VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-vpc)
     */
    public fun vpc(): Any? = unwrap(this).getVpc()

    /**
     * A builder for [PathComponentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param aclRule The network ACL rule.
       */
      public fun aclRule(aclRule: IResolvable)

      /**
       * @param aclRule The network ACL rule.
       */
      public fun aclRule(aclRule: AnalysisAclRuleProperty)

      /**
       * @param aclRule The network ACL rule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6b9e5fb37bcac949994745804b82ed1c033b30e301a5f31406638f2fb0f3599")
      public fun aclRule(aclRule: AnalysisAclRuleProperty.Builder.() -> Unit)

      /**
       * @param additionalDetails The additional details.
       */
      public fun additionalDetails(additionalDetails: IResolvable)

      /**
       * @param additionalDetails The additional details.
       */
      public fun additionalDetails(additionalDetails: List<Any>)

      /**
       * @param additionalDetails The additional details.
       */
      public fun additionalDetails(vararg additionalDetails: Any)

      /**
       * @param component The component.
       */
      public fun component(component: IResolvable)

      /**
       * @param component The component.
       */
      public fun component(component: AnalysisComponentProperty)

      /**
       * @param component The component.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8b42bab06edf148158b45f7f08ad246cd07cac9a9629b302bcb7934466b09c37")
      public fun component(component: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param destinationVpc The destination VPC.
       */
      public fun destinationVpc(destinationVpc: IResolvable)

      /**
       * @param destinationVpc The destination VPC.
       */
      public fun destinationVpc(destinationVpc: AnalysisComponentProperty)

      /**
       * @param destinationVpc The destination VPC.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aed0b38314c416675bcc02fc84208d4a40fbb5175e08ff5e6f66e7298554bb73")
      public fun destinationVpc(destinationVpc: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param elasticLoadBalancerListener The load balancer listener.
       */
      public fun elasticLoadBalancerListener(elasticLoadBalancerListener: IResolvable)

      /**
       * @param elasticLoadBalancerListener The load balancer listener.
       */
      public fun elasticLoadBalancerListener(elasticLoadBalancerListener: AnalysisComponentProperty)

      /**
       * @param elasticLoadBalancerListener The load balancer listener.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c150567e448b95a9f8005a637d7dc5e8e7abdee7b2374aad96d90494b32f8fc")
      public
          fun elasticLoadBalancerListener(elasticLoadBalancerListener: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param explanations The explanation codes.
       */
      public fun explanations(explanations: IResolvable)

      /**
       * @param explanations The explanation codes.
       */
      public fun explanations(explanations: List<Any>)

      /**
       * @param explanations The explanation codes.
       */
      public fun explanations(vararg explanations: Any)

      /**
       * @param inboundHeader The inbound header.
       */
      public fun inboundHeader(inboundHeader: IResolvable)

      /**
       * @param inboundHeader The inbound header.
       */
      public fun inboundHeader(inboundHeader: AnalysisPacketHeaderProperty)

      /**
       * @param inboundHeader The inbound header.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc30358ec3aab04fe98b5ec1f273f7c7891cc1e763d58e4161226b193769c2b2")
      public fun inboundHeader(inboundHeader: AnalysisPacketHeaderProperty.Builder.() -> Unit)

      /**
       * @param outboundHeader The outbound header.
       */
      public fun outboundHeader(outboundHeader: IResolvable)

      /**
       * @param outboundHeader The outbound header.
       */
      public fun outboundHeader(outboundHeader: AnalysisPacketHeaderProperty)

      /**
       * @param outboundHeader The outbound header.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("09929f1c3deb93a0b48c6d82717bf6973911749885f3554b2e9a83006bfac9bd")
      public fun outboundHeader(outboundHeader: AnalysisPacketHeaderProperty.Builder.() -> Unit)

      /**
       * @param routeTableRoute The route table route.
       */
      public fun routeTableRoute(routeTableRoute: IResolvable)

      /**
       * @param routeTableRoute The route table route.
       */
      public fun routeTableRoute(routeTableRoute: AnalysisRouteTableRouteProperty)

      /**
       * @param routeTableRoute The route table route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7719d7835b51b6c4c20ba31ae1fedded99239437cee91be48e368d6406fa327")
      public
          fun routeTableRoute(routeTableRoute: AnalysisRouteTableRouteProperty.Builder.() -> Unit)

      /**
       * @param securityGroupRule The security group rule.
       */
      public fun securityGroupRule(securityGroupRule: IResolvable)

      /**
       * @param securityGroupRule The security group rule.
       */
      public fun securityGroupRule(securityGroupRule: AnalysisSecurityGroupRuleProperty)

      /**
       * @param securityGroupRule The security group rule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3f532a27067fb898e19c5feefd6c95abe008985a3c6053993feb740f16b3d26f")
      public
          fun securityGroupRule(securityGroupRule: AnalysisSecurityGroupRuleProperty.Builder.() -> Unit)

      /**
       * @param sequenceNumber The sequence number.
       */
      public fun sequenceNumber(sequenceNumber: Number)

      /**
       * @param serviceName The name of the VPC endpoint service.
       */
      public fun serviceName(serviceName: String)

      /**
       * @param sourceVpc The source VPC.
       */
      public fun sourceVpc(sourceVpc: IResolvable)

      /**
       * @param sourceVpc The source VPC.
       */
      public fun sourceVpc(sourceVpc: AnalysisComponentProperty)

      /**
       * @param sourceVpc The source VPC.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("271f8f4e3a7f246fbe06724418b45c28666322412722a196c2dbae2c981ed375")
      public fun sourceVpc(sourceVpc: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param subnet The subnet.
       */
      public fun subnet(subnet: IResolvable)

      /**
       * @param subnet The subnet.
       */
      public fun subnet(subnet: AnalysisComponentProperty)

      /**
       * @param subnet The subnet.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b14366b69f50d7901a17c23afe28dd824736b469bdd521fbc60c58a79d0977a4")
      public fun subnet(subnet: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param transitGateway The transit gateway.
       */
      public fun transitGateway(transitGateway: IResolvable)

      /**
       * @param transitGateway The transit gateway.
       */
      public fun transitGateway(transitGateway: AnalysisComponentProperty)

      /**
       * @param transitGateway The transit gateway.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("75d76e94aa4d558d65be90501539df3965f1297e1baa9343ddf3a19db4ee7c8e")
      public fun transitGateway(transitGateway: AnalysisComponentProperty.Builder.() -> Unit)

      /**
       * @param transitGatewayRouteTableRoute The route in a transit gateway route table.
       */
      public fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: IResolvable)

      /**
       * @param transitGatewayRouteTableRoute The route in a transit gateway route table.
       */
      public
          fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: TransitGatewayRouteTableRouteProperty)

      /**
       * @param transitGatewayRouteTableRoute The route in a transit gateway route table.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ae17e92a57364345367ca205b5cb743f89bfac694116f8a02f4a062e51962c2e")
      public
          fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: TransitGatewayRouteTableRouteProperty.Builder.() -> Unit)

      /**
       * @param vpc The component VPC.
       */
      public fun vpc(vpc: IResolvable)

      /**
       * @param vpc The component VPC.
       */
      public fun vpc(vpc: AnalysisComponentProperty)

      /**
       * @param vpc The component VPC.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d2d6ccc47cf0bcb91e49542b88c4e4c3cb9ef578ab573f3f08687df866239f2")
      public fun vpc(vpc: AnalysisComponentProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PathComponentProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PathComponentProperty.builder()

      /**
       * @param aclRule The network ACL rule.
       */
      override fun aclRule(aclRule: IResolvable) {
        cdkBuilder.aclRule(aclRule.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param aclRule The network ACL rule.
       */
      override fun aclRule(aclRule: AnalysisAclRuleProperty) {
        cdkBuilder.aclRule(aclRule.let(AnalysisAclRuleProperty.Companion::unwrap))
      }

      /**
       * @param aclRule The network ACL rule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6b9e5fb37bcac949994745804b82ed1c033b30e301a5f31406638f2fb0f3599")
      override fun aclRule(aclRule: AnalysisAclRuleProperty.Builder.() -> Unit): Unit =
          aclRule(AnalysisAclRuleProperty(aclRule))

      /**
       * @param additionalDetails The additional details.
       */
      override fun additionalDetails(additionalDetails: IResolvable) {
        cdkBuilder.additionalDetails(additionalDetails.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param additionalDetails The additional details.
       */
      override fun additionalDetails(additionalDetails: List<Any>) {
        cdkBuilder.additionalDetails(additionalDetails.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param additionalDetails The additional details.
       */
      override fun additionalDetails(vararg additionalDetails: Any): Unit =
          additionalDetails(additionalDetails.toList())

      /**
       * @param component The component.
       */
      override fun component(component: IResolvable) {
        cdkBuilder.component(component.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param component The component.
       */
      override fun component(component: AnalysisComponentProperty) {
        cdkBuilder.component(component.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param component The component.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8b42bab06edf148158b45f7f08ad246cd07cac9a9629b302bcb7934466b09c37")
      override fun component(component: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          component(AnalysisComponentProperty(component))

      /**
       * @param destinationVpc The destination VPC.
       */
      override fun destinationVpc(destinationVpc: IResolvable) {
        cdkBuilder.destinationVpc(destinationVpc.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param destinationVpc The destination VPC.
       */
      override fun destinationVpc(destinationVpc: AnalysisComponentProperty) {
        cdkBuilder.destinationVpc(destinationVpc.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param destinationVpc The destination VPC.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aed0b38314c416675bcc02fc84208d4a40fbb5175e08ff5e6f66e7298554bb73")
      override fun destinationVpc(destinationVpc: AnalysisComponentProperty.Builder.() -> Unit):
          Unit = destinationVpc(AnalysisComponentProperty(destinationVpc))

      /**
       * @param elasticLoadBalancerListener The load balancer listener.
       */
      override fun elasticLoadBalancerListener(elasticLoadBalancerListener: IResolvable) {
        cdkBuilder.elasticLoadBalancerListener(elasticLoadBalancerListener.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param elasticLoadBalancerListener The load balancer listener.
       */
      override
          fun elasticLoadBalancerListener(elasticLoadBalancerListener: AnalysisComponentProperty) {
        cdkBuilder.elasticLoadBalancerListener(elasticLoadBalancerListener.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param elasticLoadBalancerListener The load balancer listener.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c150567e448b95a9f8005a637d7dc5e8e7abdee7b2374aad96d90494b32f8fc")
      override
          fun elasticLoadBalancerListener(elasticLoadBalancerListener: AnalysisComponentProperty.Builder.() -> Unit):
          Unit = elasticLoadBalancerListener(AnalysisComponentProperty(elasticLoadBalancerListener))

      /**
       * @param explanations The explanation codes.
       */
      override fun explanations(explanations: IResolvable) {
        cdkBuilder.explanations(explanations.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param explanations The explanation codes.
       */
      override fun explanations(explanations: List<Any>) {
        cdkBuilder.explanations(explanations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param explanations The explanation codes.
       */
      override fun explanations(vararg explanations: Any): Unit =
          explanations(explanations.toList())

      /**
       * @param inboundHeader The inbound header.
       */
      override fun inboundHeader(inboundHeader: IResolvable) {
        cdkBuilder.inboundHeader(inboundHeader.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inboundHeader The inbound header.
       */
      override fun inboundHeader(inboundHeader: AnalysisPacketHeaderProperty) {
        cdkBuilder.inboundHeader(inboundHeader.let(AnalysisPacketHeaderProperty.Companion::unwrap))
      }

      /**
       * @param inboundHeader The inbound header.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc30358ec3aab04fe98b5ec1f273f7c7891cc1e763d58e4161226b193769c2b2")
      override fun inboundHeader(inboundHeader: AnalysisPacketHeaderProperty.Builder.() -> Unit):
          Unit = inboundHeader(AnalysisPacketHeaderProperty(inboundHeader))

      /**
       * @param outboundHeader The outbound header.
       */
      override fun outboundHeader(outboundHeader: IResolvable) {
        cdkBuilder.outboundHeader(outboundHeader.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param outboundHeader The outbound header.
       */
      override fun outboundHeader(outboundHeader: AnalysisPacketHeaderProperty) {
        cdkBuilder.outboundHeader(outboundHeader.let(AnalysisPacketHeaderProperty.Companion::unwrap))
      }

      /**
       * @param outboundHeader The outbound header.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("09929f1c3deb93a0b48c6d82717bf6973911749885f3554b2e9a83006bfac9bd")
      override fun outboundHeader(outboundHeader: AnalysisPacketHeaderProperty.Builder.() -> Unit):
          Unit = outboundHeader(AnalysisPacketHeaderProperty(outboundHeader))

      /**
       * @param routeTableRoute The route table route.
       */
      override fun routeTableRoute(routeTableRoute: IResolvable) {
        cdkBuilder.routeTableRoute(routeTableRoute.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param routeTableRoute The route table route.
       */
      override fun routeTableRoute(routeTableRoute: AnalysisRouteTableRouteProperty) {
        cdkBuilder.routeTableRoute(routeTableRoute.let(AnalysisRouteTableRouteProperty.Companion::unwrap))
      }

      /**
       * @param routeTableRoute The route table route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7719d7835b51b6c4c20ba31ae1fedded99239437cee91be48e368d6406fa327")
      override
          fun routeTableRoute(routeTableRoute: AnalysisRouteTableRouteProperty.Builder.() -> Unit):
          Unit = routeTableRoute(AnalysisRouteTableRouteProperty(routeTableRoute))

      /**
       * @param securityGroupRule The security group rule.
       */
      override fun securityGroupRule(securityGroupRule: IResolvable) {
        cdkBuilder.securityGroupRule(securityGroupRule.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param securityGroupRule The security group rule.
       */
      override fun securityGroupRule(securityGroupRule: AnalysisSecurityGroupRuleProperty) {
        cdkBuilder.securityGroupRule(securityGroupRule.let(AnalysisSecurityGroupRuleProperty.Companion::unwrap))
      }

      /**
       * @param securityGroupRule The security group rule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3f532a27067fb898e19c5feefd6c95abe008985a3c6053993feb740f16b3d26f")
      override
          fun securityGroupRule(securityGroupRule: AnalysisSecurityGroupRuleProperty.Builder.() -> Unit):
          Unit = securityGroupRule(AnalysisSecurityGroupRuleProperty(securityGroupRule))

      /**
       * @param sequenceNumber The sequence number.
       */
      override fun sequenceNumber(sequenceNumber: Number) {
        cdkBuilder.sequenceNumber(sequenceNumber)
      }

      /**
       * @param serviceName The name of the VPC endpoint service.
       */
      override fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
      }

      /**
       * @param sourceVpc The source VPC.
       */
      override fun sourceVpc(sourceVpc: IResolvable) {
        cdkBuilder.sourceVpc(sourceVpc.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sourceVpc The source VPC.
       */
      override fun sourceVpc(sourceVpc: AnalysisComponentProperty) {
        cdkBuilder.sourceVpc(sourceVpc.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param sourceVpc The source VPC.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("271f8f4e3a7f246fbe06724418b45c28666322412722a196c2dbae2c981ed375")
      override fun sourceVpc(sourceVpc: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          sourceVpc(AnalysisComponentProperty(sourceVpc))

      /**
       * @param subnet The subnet.
       */
      override fun subnet(subnet: IResolvable) {
        cdkBuilder.subnet(subnet.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param subnet The subnet.
       */
      override fun subnet(subnet: AnalysisComponentProperty) {
        cdkBuilder.subnet(subnet.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param subnet The subnet.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b14366b69f50d7901a17c23afe28dd824736b469bdd521fbc60c58a79d0977a4")
      override fun subnet(subnet: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          subnet(AnalysisComponentProperty(subnet))

      /**
       * @param transitGateway The transit gateway.
       */
      override fun transitGateway(transitGateway: IResolvable) {
        cdkBuilder.transitGateway(transitGateway.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param transitGateway The transit gateway.
       */
      override fun transitGateway(transitGateway: AnalysisComponentProperty) {
        cdkBuilder.transitGateway(transitGateway.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param transitGateway The transit gateway.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("75d76e94aa4d558d65be90501539df3965f1297e1baa9343ddf3a19db4ee7c8e")
      override fun transitGateway(transitGateway: AnalysisComponentProperty.Builder.() -> Unit):
          Unit = transitGateway(AnalysisComponentProperty(transitGateway))

      /**
       * @param transitGatewayRouteTableRoute The route in a transit gateway route table.
       */
      override fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: IResolvable) {
        cdkBuilder.transitGatewayRouteTableRoute(transitGatewayRouteTableRoute.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param transitGatewayRouteTableRoute The route in a transit gateway route table.
       */
      override
          fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: TransitGatewayRouteTableRouteProperty) {
        cdkBuilder.transitGatewayRouteTableRoute(transitGatewayRouteTableRoute.let(TransitGatewayRouteTableRouteProperty.Companion::unwrap))
      }

      /**
       * @param transitGatewayRouteTableRoute The route in a transit gateway route table.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ae17e92a57364345367ca205b5cb743f89bfac694116f8a02f4a062e51962c2e")
      override
          fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: TransitGatewayRouteTableRouteProperty.Builder.() -> Unit):
          Unit =
          transitGatewayRouteTableRoute(TransitGatewayRouteTableRouteProperty(transitGatewayRouteTableRoute))

      /**
       * @param vpc The component VPC.
       */
      override fun vpc(vpc: IResolvable) {
        cdkBuilder.vpc(vpc.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vpc The component VPC.
       */
      override fun vpc(vpc: AnalysisComponentProperty) {
        cdkBuilder.vpc(vpc.let(AnalysisComponentProperty.Companion::unwrap))
      }

      /**
       * @param vpc The component VPC.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d2d6ccc47cf0bcb91e49542b88c4e4c3cb9ef578ab573f3f08687df866239f2")
      override fun vpc(vpc: AnalysisComponentProperty.Builder.() -> Unit): Unit =
          vpc(AnalysisComponentProperty(vpc))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PathComponentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PathComponentProperty,
    ) : CdkObject(cdkObject), PathComponentProperty {
      /**
       * The network ACL rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-aclrule)
       */
      override fun aclRule(): Any? = unwrap(this).getAclRule()

      /**
       * The additional details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-additionaldetails)
       */
      override fun additionalDetails(): Any? = unwrap(this).getAdditionalDetails()

      /**
       * The component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-component)
       */
      override fun component(): Any? = unwrap(this).getComponent()

      /**
       * The destination VPC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-destinationvpc)
       */
      override fun destinationVpc(): Any? = unwrap(this).getDestinationVpc()

      /**
       * The load balancer listener.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-elasticloadbalancerlistener)
       */
      override fun elasticLoadBalancerListener(): Any? =
          unwrap(this).getElasticLoadBalancerListener()

      /**
       * The explanation codes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-explanations)
       */
      override fun explanations(): Any? = unwrap(this).getExplanations()

      /**
       * The inbound header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-inboundheader)
       */
      override fun inboundHeader(): Any? = unwrap(this).getInboundHeader()

      /**
       * The outbound header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-outboundheader)
       */
      override fun outboundHeader(): Any? = unwrap(this).getOutboundHeader()

      /**
       * The route table route.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-routetableroute)
       */
      override fun routeTableRoute(): Any? = unwrap(this).getRouteTableRoute()

      /**
       * The security group rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-securitygrouprule)
       */
      override fun securityGroupRule(): Any? = unwrap(this).getSecurityGroupRule()

      /**
       * The sequence number.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-sequencenumber)
       */
      override fun sequenceNumber(): Number? = unwrap(this).getSequenceNumber()

      /**
       * The name of the VPC endpoint service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-servicename)
       */
      override fun serviceName(): String? = unwrap(this).getServiceName()

      /**
       * The source VPC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-sourcevpc)
       */
      override fun sourceVpc(): Any? = unwrap(this).getSourceVpc()

      /**
       * The subnet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-subnet)
       */
      override fun subnet(): Any? = unwrap(this).getSubnet()

      /**
       * The transit gateway.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-transitgateway)
       */
      override fun transitGateway(): Any? = unwrap(this).getTransitGateway()

      /**
       * The route in a transit gateway route table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-transitgatewayroutetableroute)
       */
      override fun transitGatewayRouteTableRoute(): Any? =
          unwrap(this).getTransitGatewayRouteTableRoute()

      /**
       * The component VPC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-pathcomponent.html#cfn-ec2-networkinsightsanalysis-pathcomponent-vpc)
       */
      override fun vpc(): Any? = unwrap(this).getVpc()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PathComponentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PathComponentProperty):
          PathComponentProperty = CdkObjectWrappers.wrap(cdkObject) as? PathComponentProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PathComponentProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PathComponentProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PathComponentProperty
    }
  }

  /**
   * Describes a range of ports.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * PortRangeProperty portRangeProperty = PortRangeProperty.builder()
   * .from(123)
   * .to(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-portrange.html)
   */
  public interface PortRangeProperty {
    /**
     * The first port in the range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-portrange.html#cfn-ec2-networkinsightsanalysis-portrange-from)
     */
    public fun from(): Number? = unwrap(this).getFrom()

    /**
     * The last port in the range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-portrange.html#cfn-ec2-networkinsightsanalysis-portrange-to)
     */
    public fun to(): Number? = unwrap(this).getTo()

    /**
     * A builder for [PortRangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param from The first port in the range.
       */
      public fun from(from: Number)

      /**
       * @param to The last port in the range.
       */
      public fun to(to: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PortRangeProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PortRangeProperty.builder()

      /**
       * @param from The first port in the range.
       */
      override fun from(from: Number) {
        cdkBuilder.from(from)
      }

      /**
       * @param to The last port in the range.
       */
      override fun to(to: Number) {
        cdkBuilder.to(to)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PortRangeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PortRangeProperty,
    ) : CdkObject(cdkObject), PortRangeProperty {
      /**
       * The first port in the range.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-portrange.html#cfn-ec2-networkinsightsanalysis-portrange-from)
       */
      override fun from(): Number? = unwrap(this).getFrom()

      /**
       * The last port in the range.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-portrange.html#cfn-ec2-networkinsightsanalysis-portrange-to)
       */
      override fun to(): Number? = unwrap(this).getTo()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PortRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PortRangeProperty):
          PortRangeProperty = CdkObjectWrappers.wrap(cdkObject) as? PortRangeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortRangeProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PortRangeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PortRangeProperty
    }
  }

  /**
   * Describes a route in a transit gateway route table.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * TransitGatewayRouteTableRouteProperty transitGatewayRouteTableRouteProperty =
   * TransitGatewayRouteTableRouteProperty.builder()
   * .attachmentId("attachmentId")
   * .destinationCidr("destinationCidr")
   * .prefixListId("prefixListId")
   * .resourceId("resourceId")
   * .resourceType("resourceType")
   * .routeOrigin("routeOrigin")
   * .state("state")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-transitgatewayroutetableroute.html)
   */
  public interface TransitGatewayRouteTableRouteProperty {
    /**
     * The ID of the route attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-transitgatewayroutetableroute.html#cfn-ec2-networkinsightsanalysis-transitgatewayroutetableroute-attachmentid)
     */
    public fun attachmentId(): String? = unwrap(this).getAttachmentId()

    /**
     * The CIDR block used for destination matches.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-transitgatewayroutetableroute.html#cfn-ec2-networkinsightsanalysis-transitgatewayroutetableroute-destinationcidr)
     */
    public fun destinationCidr(): String? = unwrap(this).getDestinationCidr()

    /**
     * The ID of the prefix list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-transitgatewayroutetableroute.html#cfn-ec2-networkinsightsanalysis-transitgatewayroutetableroute-prefixlistid)
     */
    public fun prefixListId(): String? = unwrap(this).getPrefixListId()

    /**
     * The ID of the resource for the route attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-transitgatewayroutetableroute.html#cfn-ec2-networkinsightsanalysis-transitgatewayroutetableroute-resourceid)
     */
    public fun resourceId(): String? = unwrap(this).getResourceId()

    /**
     * The resource type for the route attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-transitgatewayroutetableroute.html#cfn-ec2-networkinsightsanalysis-transitgatewayroutetableroute-resourcetype)
     */
    public fun resourceType(): String? = unwrap(this).getResourceType()

    /**
     * The route origin. The following are the possible values:.
     *
     * * static
     * * propagated
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-transitgatewayroutetableroute.html#cfn-ec2-networkinsightsanalysis-transitgatewayroutetableroute-routeorigin)
     */
    public fun routeOrigin(): String? = unwrap(this).getRouteOrigin()

    /**
     * The state of the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-transitgatewayroutetableroute.html#cfn-ec2-networkinsightsanalysis-transitgatewayroutetableroute-state)
     */
    public fun state(): String? = unwrap(this).getState()

    /**
     * A builder for [TransitGatewayRouteTableRouteProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attachmentId The ID of the route attachment.
       */
      public fun attachmentId(attachmentId: String)

      /**
       * @param destinationCidr The CIDR block used for destination matches.
       */
      public fun destinationCidr(destinationCidr: String)

      /**
       * @param prefixListId The ID of the prefix list.
       */
      public fun prefixListId(prefixListId: String)

      /**
       * @param resourceId The ID of the resource for the route attachment.
       */
      public fun resourceId(resourceId: String)

      /**
       * @param resourceType The resource type for the route attachment.
       */
      public fun resourceType(resourceType: String)

      /**
       * @param routeOrigin The route origin. The following are the possible values:.
       * * static
       * * propagated
       */
      public fun routeOrigin(routeOrigin: String)

      /**
       * @param state The state of the route.
       */
      public fun state(state: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.TransitGatewayRouteTableRouteProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.TransitGatewayRouteTableRouteProperty.builder()

      /**
       * @param attachmentId The ID of the route attachment.
       */
      override fun attachmentId(attachmentId: String) {
        cdkBuilder.attachmentId(attachmentId)
      }

      /**
       * @param destinationCidr The CIDR block used for destination matches.
       */
      override fun destinationCidr(destinationCidr: String) {
        cdkBuilder.destinationCidr(destinationCidr)
      }

      /**
       * @param prefixListId The ID of the prefix list.
       */
      override fun prefixListId(prefixListId: String) {
        cdkBuilder.prefixListId(prefixListId)
      }

      /**
       * @param resourceId The ID of the resource for the route attachment.
       */
      override fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
      }

      /**
       * @param resourceType The resource type for the route attachment.
       */
      override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      /**
       * @param routeOrigin The route origin. The following are the possible values:.
       * * static
       * * propagated
       */
      override fun routeOrigin(routeOrigin: String) {
        cdkBuilder.routeOrigin(routeOrigin)
      }

      /**
       * @param state The state of the route.
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.TransitGatewayRouteTableRouteProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.TransitGatewayRouteTableRouteProperty,
    ) : CdkObject(cdkObject), TransitGatewayRouteTableRouteProperty {
      /**
       * The ID of the route attachment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-transitgatewayroutetableroute.html#cfn-ec2-networkinsightsanalysis-transitgatewayroutetableroute-attachmentid)
       */
      override fun attachmentId(): String? = unwrap(this).getAttachmentId()

      /**
       * The CIDR block used for destination matches.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-transitgatewayroutetableroute.html#cfn-ec2-networkinsightsanalysis-transitgatewayroutetableroute-destinationcidr)
       */
      override fun destinationCidr(): String? = unwrap(this).getDestinationCidr()

      /**
       * The ID of the prefix list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-transitgatewayroutetableroute.html#cfn-ec2-networkinsightsanalysis-transitgatewayroutetableroute-prefixlistid)
       */
      override fun prefixListId(): String? = unwrap(this).getPrefixListId()

      /**
       * The ID of the resource for the route attachment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-transitgatewayroutetableroute.html#cfn-ec2-networkinsightsanalysis-transitgatewayroutetableroute-resourceid)
       */
      override fun resourceId(): String? = unwrap(this).getResourceId()

      /**
       * The resource type for the route attachment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-transitgatewayroutetableroute.html#cfn-ec2-networkinsightsanalysis-transitgatewayroutetableroute-resourcetype)
       */
      override fun resourceType(): String? = unwrap(this).getResourceType()

      /**
       * The route origin. The following are the possible values:.
       *
       * * static
       * * propagated
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-transitgatewayroutetableroute.html#cfn-ec2-networkinsightsanalysis-transitgatewayroutetableroute-routeorigin)
       */
      override fun routeOrigin(): String? = unwrap(this).getRouteOrigin()

      /**
       * The state of the route.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-transitgatewayroutetableroute.html#cfn-ec2-networkinsightsanalysis-transitgatewayroutetableroute-state)
       */
      override fun state(): String? = unwrap(this).getState()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TransitGatewayRouteTableRouteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.TransitGatewayRouteTableRouteProperty):
          TransitGatewayRouteTableRouteProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TransitGatewayRouteTableRouteProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransitGatewayRouteTableRouteProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.TransitGatewayRouteTableRouteProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.TransitGatewayRouteTableRouteProperty
    }
  }
}
