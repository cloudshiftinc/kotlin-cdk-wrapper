@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.resourceexplorer2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a view that users can query by using the
 * [Search](https://docs.aws.amazon.com/resource-explorer/latest/apireference/API_Search.html)
 * operation. Results from queries that you make using this view include only resources that match the
 * view's `Filters` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.resourceexplorer2.*;
 * CfnView cfnView = CfnView.Builder.create(this, "MyCfnView")
 * .viewName("viewName")
 * // the properties below are optional
 * .filters(FiltersProperty.builder()
 * .filterString("filterString")
 * .build())
 * .includedProperties(List.of(IncludedPropertyProperty.builder()
 * .name("name")
 * .build()))
 * .scope("scope")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html)
 */
public open class CfnView internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnView,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ARN of the new view. For example:.
   *
   * `arn:aws:resource-explorer-2:us-east-1:123456789012:view/MyView/EXAMPLE8-90ab-cdef-fedc-EXAMPLE22222`
   */
  public open fun attrViewArn(): String = unwrap(this).getAttrViewArn()

  /**
   * An array of strings that include search keywords, prefixes, and operators that filter the
   * results that are returned for queries made using this view.
   */
  public open fun filters(): Any? = unwrap(this).getFilters()

  /**
   * An array of strings that include search keywords, prefixes, and operators that filter the
   * results that are returned for queries made using this view.
   */
  public open fun filters(`value`: IResolvable) {
    unwrap(this).setFilters(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of strings that include search keywords, prefixes, and operators that filter the
   * results that are returned for queries made using this view.
   */
  public open fun filters(`value`: FiltersProperty) {
    unwrap(this).setFilters(`value`.let(FiltersProperty::unwrap))
  }

  /**
   * An array of strings that include search keywords, prefixes, and operators that filter the
   * results that are returned for queries made using this view.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8efc60275e91ea77cfe0ee95bdce8898540e1c5fbb268593760d8e3dfe9c9a57")
  public open fun filters(`value`: FiltersProperty.Builder.() -> Unit): Unit =
      filters(FiltersProperty(`value`))

  /**
   * A list of fields that provide additional information about the view.
   */
  public open fun includedProperties(): Any? = unwrap(this).getIncludedProperties()

  /**
   * A list of fields that provide additional information about the view.
   */
  public open fun includedProperties(`value`: IResolvable) {
    unwrap(this).setIncludedProperties(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of fields that provide additional information about the view.
   */
  public open fun includedProperties(`value`: List<Any>) {
    unwrap(this).setIncludedProperties(`value`)
  }

  /**
   * A list of fields that provide additional information about the view.
   */
  public open fun includedProperties(vararg `value`: Any): Unit =
      includedProperties(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The root ARN of the account, an organizational unit (OU), or an organization ARN.
   */
  public open fun scope(): String? = unwrap(this).getScope()

  /**
   * The root ARN of the account, an organizational unit (OU), or an organization ARN.
   */
  public open fun scope(`value`: String) {
    unwrap(this).setScope(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Tag key and value pairs that are attached to the view.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * Tag key and value pairs that are attached to the view.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The name of the new view.
   */
  public open fun viewName(): String = unwrap(this).getViewName()

  /**
   * The name of the new view.
   */
  public open fun viewName(`value`: String) {
    unwrap(this).setViewName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.resourceexplorer2.CfnView].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An array of strings that include search keywords, prefixes, and operators that filter the
     * results that are returned for queries made using this view.
     *
     * When you use this view in a
     * [Search](https://docs.aws.amazon.com/resource-explorer/latest/apireference/API_Search.html)
     * operation, the filter string is combined with the search's `QueryString` parameter using a
     * logical `AND` operator.
     *
     * For information about the supported syntax, see [Search query reference for Resource
     * Explorer](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html)
     * in the *AWS Resource Explorer User Guide* .
     *
     *
     * This query string in the context of this operation supports only [filter
     * prefixes](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-filters)
     * with optional
     * [operators](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-operators)
     * . It doesn't support free-form text. For example, the string `region:us*
     * service:ec2 -tag:stage=prod` includes all Amazon EC2 resources in any AWS Region that begin with
     * the letters `us` and are *not* tagged with a key `Stage` that has the value `prod` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-filters)
     * @param filters An array of strings that include search keywords, prefixes, and operators that
     * filter the results that are returned for queries made using this view. 
     */
    public fun filters(filters: IResolvable)

    /**
     * An array of strings that include search keywords, prefixes, and operators that filter the
     * results that are returned for queries made using this view.
     *
     * When you use this view in a
     * [Search](https://docs.aws.amazon.com/resource-explorer/latest/apireference/API_Search.html)
     * operation, the filter string is combined with the search's `QueryString` parameter using a
     * logical `AND` operator.
     *
     * For information about the supported syntax, see [Search query reference for Resource
     * Explorer](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html)
     * in the *AWS Resource Explorer User Guide* .
     *
     *
     * This query string in the context of this operation supports only [filter
     * prefixes](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-filters)
     * with optional
     * [operators](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-operators)
     * . It doesn't support free-form text. For example, the string `region:us*
     * service:ec2 -tag:stage=prod` includes all Amazon EC2 resources in any AWS Region that begin with
     * the letters `us` and are *not* tagged with a key `Stage` that has the value `prod` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-filters)
     * @param filters An array of strings that include search keywords, prefixes, and operators that
     * filter the results that are returned for queries made using this view. 
     */
    public fun filters(filters: FiltersProperty)

    /**
     * An array of strings that include search keywords, prefixes, and operators that filter the
     * results that are returned for queries made using this view.
     *
     * When you use this view in a
     * [Search](https://docs.aws.amazon.com/resource-explorer/latest/apireference/API_Search.html)
     * operation, the filter string is combined with the search's `QueryString` parameter using a
     * logical `AND` operator.
     *
     * For information about the supported syntax, see [Search query reference for Resource
     * Explorer](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html)
     * in the *AWS Resource Explorer User Guide* .
     *
     *
     * This query string in the context of this operation supports only [filter
     * prefixes](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-filters)
     * with optional
     * [operators](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-operators)
     * . It doesn't support free-form text. For example, the string `region:us*
     * service:ec2 -tag:stage=prod` includes all Amazon EC2 resources in any AWS Region that begin with
     * the letters `us` and are *not* tagged with a key `Stage` that has the value `prod` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-filters)
     * @param filters An array of strings that include search keywords, prefixes, and operators that
     * filter the results that are returned for queries made using this view. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c101ff1abd5d95a62efbece54fc4a6c86ed1d5bb82015518c12e97e76685c0a")
    public fun filters(filters: FiltersProperty.Builder.() -> Unit)

    /**
     * A list of fields that provide additional information about the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-includedproperties)
     * @param includedProperties A list of fields that provide additional information about the
     * view. 
     */
    public fun includedProperties(includedProperties: IResolvable)

    /**
     * A list of fields that provide additional information about the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-includedproperties)
     * @param includedProperties A list of fields that provide additional information about the
     * view. 
     */
    public fun includedProperties(includedProperties: List<Any>)

    /**
     * A list of fields that provide additional information about the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-includedproperties)
     * @param includedProperties A list of fields that provide additional information about the
     * view. 
     */
    public fun includedProperties(vararg includedProperties: Any)

    /**
     * The root ARN of the account, an organizational unit (OU), or an organization ARN.
     *
     * If left empty, the default is account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-scope)
     * @param scope The root ARN of the account, an organizational unit (OU), or an organization
     * ARN. 
     */
    public fun scope(scope: String)

    /**
     * Tag key and value pairs that are attached to the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-tags)
     * @param tags Tag key and value pairs that are attached to the view. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The name of the new view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-viewname)
     * @param viewName The name of the new view. 
     */
    public fun viewName(viewName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.resourceexplorer2.CfnView.Builder =
        software.amazon.awscdk.services.resourceexplorer2.CfnView.Builder.create(scope, id)

    /**
     * An array of strings that include search keywords, prefixes, and operators that filter the
     * results that are returned for queries made using this view.
     *
     * When you use this view in a
     * [Search](https://docs.aws.amazon.com/resource-explorer/latest/apireference/API_Search.html)
     * operation, the filter string is combined with the search's `QueryString` parameter using a
     * logical `AND` operator.
     *
     * For information about the supported syntax, see [Search query reference for Resource
     * Explorer](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html)
     * in the *AWS Resource Explorer User Guide* .
     *
     *
     * This query string in the context of this operation supports only [filter
     * prefixes](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-filters)
     * with optional
     * [operators](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-operators)
     * . It doesn't support free-form text. For example, the string `region:us*
     * service:ec2 -tag:stage=prod` includes all Amazon EC2 resources in any AWS Region that begin with
     * the letters `us` and are *not* tagged with a key `Stage` that has the value `prod` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-filters)
     * @param filters An array of strings that include search keywords, prefixes, and operators that
     * filter the results that are returned for queries made using this view. 
     */
    override fun filters(filters: IResolvable) {
      cdkBuilder.filters(filters.let(IResolvable::unwrap))
    }

    /**
     * An array of strings that include search keywords, prefixes, and operators that filter the
     * results that are returned for queries made using this view.
     *
     * When you use this view in a
     * [Search](https://docs.aws.amazon.com/resource-explorer/latest/apireference/API_Search.html)
     * operation, the filter string is combined with the search's `QueryString` parameter using a
     * logical `AND` operator.
     *
     * For information about the supported syntax, see [Search query reference for Resource
     * Explorer](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html)
     * in the *AWS Resource Explorer User Guide* .
     *
     *
     * This query string in the context of this operation supports only [filter
     * prefixes](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-filters)
     * with optional
     * [operators](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-operators)
     * . It doesn't support free-form text. For example, the string `region:us*
     * service:ec2 -tag:stage=prod` includes all Amazon EC2 resources in any AWS Region that begin with
     * the letters `us` and are *not* tagged with a key `Stage` that has the value `prod` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-filters)
     * @param filters An array of strings that include search keywords, prefixes, and operators that
     * filter the results that are returned for queries made using this view. 
     */
    override fun filters(filters: FiltersProperty) {
      cdkBuilder.filters(filters.let(FiltersProperty::unwrap))
    }

    /**
     * An array of strings that include search keywords, prefixes, and operators that filter the
     * results that are returned for queries made using this view.
     *
     * When you use this view in a
     * [Search](https://docs.aws.amazon.com/resource-explorer/latest/apireference/API_Search.html)
     * operation, the filter string is combined with the search's `QueryString` parameter using a
     * logical `AND` operator.
     *
     * For information about the supported syntax, see [Search query reference for Resource
     * Explorer](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html)
     * in the *AWS Resource Explorer User Guide* .
     *
     *
     * This query string in the context of this operation supports only [filter
     * prefixes](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-filters)
     * with optional
     * [operators](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-operators)
     * . It doesn't support free-form text. For example, the string `region:us*
     * service:ec2 -tag:stage=prod` includes all Amazon EC2 resources in any AWS Region that begin with
     * the letters `us` and are *not* tagged with a key `Stage` that has the value `prod` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-filters)
     * @param filters An array of strings that include search keywords, prefixes, and operators that
     * filter the results that are returned for queries made using this view. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c101ff1abd5d95a62efbece54fc4a6c86ed1d5bb82015518c12e97e76685c0a")
    override fun filters(filters: FiltersProperty.Builder.() -> Unit): Unit =
        filters(FiltersProperty(filters))

    /**
     * A list of fields that provide additional information about the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-includedproperties)
     * @param includedProperties A list of fields that provide additional information about the
     * view. 
     */
    override fun includedProperties(includedProperties: IResolvable) {
      cdkBuilder.includedProperties(includedProperties.let(IResolvable::unwrap))
    }

    /**
     * A list of fields that provide additional information about the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-includedproperties)
     * @param includedProperties A list of fields that provide additional information about the
     * view. 
     */
    override fun includedProperties(includedProperties: List<Any>) {
      cdkBuilder.includedProperties(includedProperties)
    }

    /**
     * A list of fields that provide additional information about the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-includedproperties)
     * @param includedProperties A list of fields that provide additional information about the
     * view. 
     */
    override fun includedProperties(vararg includedProperties: Any): Unit =
        includedProperties(includedProperties.toList())

    /**
     * The root ARN of the account, an organizational unit (OU), or an organization ARN.
     *
     * If left empty, the default is account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-scope)
     * @param scope The root ARN of the account, an organizational unit (OU), or an organization
     * ARN. 
     */
    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    /**
     * Tag key and value pairs that are attached to the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-tags)
     * @param tags Tag key and value pairs that are attached to the view. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The name of the new view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-viewname)
     * @param viewName The name of the new view. 
     */
    override fun viewName(viewName: String) {
      cdkBuilder.viewName(viewName)
    }

    public fun build(): software.amazon.awscdk.services.resourceexplorer2.CfnView =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.resourceexplorer2.CfnView.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnView {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnView(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnView): CfnView
        = CfnView(cdkObject)

    internal fun unwrap(wrapped: CfnView): software.amazon.awscdk.services.resourceexplorer2.CfnView
        = wrapped.cdkObject
  }

  /**
   * A search filter defines which resources can be part of a search query result set.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.resourceexplorer2.*;
   * SearchFilterProperty searchFilterProperty = SearchFilterProperty.builder()
   * .filterString("filterString")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourceexplorer2-view-searchfilter.html)
   */
  public interface SearchFilterProperty {
    /**
     * The string that contains the search keywords, prefixes, and operators to control the results
     * that can be returned by a Search operation.
     *
     * For information about the supported syntax, see [Search query
     * reference](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html)
     * in the *AWS Resource Explorer User Guide* .
     *
     *
     * This query string in the context of this operation supports only [filter
     * prefixes](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-filters)
     * with optional
     * [operators](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-operators)
     * . It doesn't support free-form text. For example, the string `region:us*
     * service:ec2 -tag:stage=prod` includes all Amazon EC2 resources in any AWS Region that begin with
     * the letters `us` and are *not* tagged with a key `Stage` that has the value `prod` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourceexplorer2-view-searchfilter.html#cfn-resourceexplorer2-view-searchfilter-filterstring)
     */
    public fun filterString(): String

    /**
     * A builder for [SearchFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param filterString The string that contains the search keywords, prefixes, and operators
       * to control the results that can be returned by a Search operation. 
       * For information about the supported syntax, see [Search query
       * reference](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html)
       * in the *AWS Resource Explorer User Guide* .
       *
       *
       * This query string in the context of this operation supports only [filter
       * prefixes](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-filters)
       * with optional
       * [operators](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-operators)
       * . It doesn't support free-form text. For example, the string `region:us*
       * service:ec2 -tag:stage=prod` includes all Amazon EC2 resources in any AWS Region that begin
       * with the letters `us` and are *not* tagged with a key `Stage` that has the value `prod` .
       */
      public fun filterString(filterString: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resourceexplorer2.CfnView.SearchFilterProperty.Builder =
          software.amazon.awscdk.services.resourceexplorer2.CfnView.SearchFilterProperty.builder()

      /**
       * @param filterString The string that contains the search keywords, prefixes, and operators
       * to control the results that can be returned by a Search operation. 
       * For information about the supported syntax, see [Search query
       * reference](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html)
       * in the *AWS Resource Explorer User Guide* .
       *
       *
       * This query string in the context of this operation supports only [filter
       * prefixes](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-filters)
       * with optional
       * [operators](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-operators)
       * . It doesn't support free-form text. For example, the string `region:us*
       * service:ec2 -tag:stage=prod` includes all Amazon EC2 resources in any AWS Region that begin
       * with the letters `us` and are *not* tagged with a key `Stage` that has the value `prod` .
       */
      override fun filterString(filterString: String) {
        cdkBuilder.filterString(filterString)
      }

      public fun build():
          software.amazon.awscdk.services.resourceexplorer2.CfnView.SearchFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.resourceexplorer2.CfnView.SearchFilterProperty,
    ) : CdkObject(cdkObject), SearchFilterProperty {
      /**
       * The string that contains the search keywords, prefixes, and operators to control the
       * results that can be returned by a Search operation.
       *
       * For information about the supported syntax, see [Search query
       * reference](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html)
       * in the *AWS Resource Explorer User Guide* .
       *
       *
       * This query string in the context of this operation supports only [filter
       * prefixes](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-filters)
       * with optional
       * [operators](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-operators)
       * . It doesn't support free-form text. For example, the string `region:us*
       * service:ec2 -tag:stage=prod` includes all Amazon EC2 resources in any AWS Region that begin
       * with the letters `us` and are *not* tagged with a key `Stage` that has the value `prod` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourceexplorer2-view-searchfilter.html#cfn-resourceexplorer2-view-searchfilter-filterstring)
       */
      override fun filterString(): String = unwrap(this).getFilterString()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SearchFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnView.SearchFilterProperty):
          SearchFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? SearchFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SearchFilterProperty):
          software.amazon.awscdk.services.resourceexplorer2.CfnView.SearchFilterProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.resourceexplorer2.CfnView.SearchFilterProperty
    }
  }

  /**
   * Information about an additional property that describes a resource, that you can optionally
   * include in a view.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.resourceexplorer2.*;
   * IncludedPropertyProperty includedPropertyProperty = IncludedPropertyProperty.builder()
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourceexplorer2-view-includedproperty.html)
   */
  public interface IncludedPropertyProperty {
    /**
     * The name of the property that is included in this view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourceexplorer2-view-includedproperty.html#cfn-resourceexplorer2-view-includedproperty-name)
     */
    public fun name(): String

    /**
     * A builder for [IncludedPropertyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the property that is included in this view. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resourceexplorer2.CfnView.IncludedPropertyProperty.Builder
          =
          software.amazon.awscdk.services.resourceexplorer2.CfnView.IncludedPropertyProperty.builder()

      /**
       * @param name The name of the property that is included in this view. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.resourceexplorer2.CfnView.IncludedPropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.resourceexplorer2.CfnView.IncludedPropertyProperty,
    ) : CdkObject(cdkObject), IncludedPropertyProperty {
      /**
       * The name of the property that is included in this view.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourceexplorer2-view-includedproperty.html#cfn-resourceexplorer2-view-includedproperty-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IncludedPropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnView.IncludedPropertyProperty):
          IncludedPropertyProperty = CdkObjectWrappers.wrap(cdkObject) as? IncludedPropertyProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IncludedPropertyProperty):
          software.amazon.awscdk.services.resourceexplorer2.CfnView.IncludedPropertyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.resourceexplorer2.CfnView.IncludedPropertyProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.resourceexplorer2.*;
   * FiltersProperty filtersProperty = FiltersProperty.builder()
   * .filterString("filterString")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourceexplorer2-view-filters.html)
   */
  public interface FiltersProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourceexplorer2-view-filters.html#cfn-resourceexplorer2-view-filters-filterstring)
     */
    public fun filterString(): String

    /**
     * A builder for [FiltersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param filterString the value to be set. 
       */
      public fun filterString(filterString: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resourceexplorer2.CfnView.FiltersProperty.Builder =
          software.amazon.awscdk.services.resourceexplorer2.CfnView.FiltersProperty.builder()

      /**
       * @param filterString the value to be set. 
       */
      override fun filterString(filterString: String) {
        cdkBuilder.filterString(filterString)
      }

      public fun build(): software.amazon.awscdk.services.resourceexplorer2.CfnView.FiltersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.resourceexplorer2.CfnView.FiltersProperty,
    ) : CdkObject(cdkObject), FiltersProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourceexplorer2-view-filters.html#cfn-resourceexplorer2-view-filters-filterstring)
       */
      override fun filterString(): String = unwrap(this).getFilterString()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FiltersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnView.FiltersProperty):
          FiltersProperty = CdkObjectWrappers.wrap(cdkObject) as? FiltersProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FiltersProperty):
          software.amazon.awscdk.services.resourceexplorer2.CfnView.FiltersProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.resourceexplorer2.CfnView.FiltersProperty
    }
  }
}
