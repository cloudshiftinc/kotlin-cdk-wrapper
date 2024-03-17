@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.resourceexplorer2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnView`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.resourceexplorer2.*;
 * CfnViewProps cfnViewProps = CfnViewProps.builder()
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
public interface CfnViewProps {
  /**
   * An array of strings that include search keywords, prefixes, and operators that filter the
   * results that are returned for queries made using this view.
   *
   * When you use this view in a
   * [Search](https://docs.aws.amazon.com/resource-explorer/latest/apireference/API_Search.html)
   * operation, the filter string is combined with the search's `QueryString` parameter using a logical
   * `AND` operator.
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
   */
  public fun filters(): Any? = unwrap(this).getFilters()

  /**
   * A list of fields that provide additional information about the view.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-includedproperties)
   */
  public fun includedProperties(): Any? = unwrap(this).getIncludedProperties()

  /**
   * The root ARN of the account, an organizational unit (OU), or an organization ARN.
   *
   * If left empty, the default is account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-scope)
   */
  public fun scope(): String? = unwrap(this).getScope()

  /**
   * Tag key and value pairs that are attached to the view.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The name of the new view.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-viewname)
   */
  public fun viewName(): String

  /**
   * A builder for [CfnViewProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param filters An array of strings that include search keywords, prefixes, and operators that
     * filter the results that are returned for queries made using this view.
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
     */
    public fun filters(filters: IResolvable)

    /**
     * @param filters An array of strings that include search keywords, prefixes, and operators that
     * filter the results that are returned for queries made using this view.
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
     */
    public fun filters(filters: CfnView.FiltersProperty)

    /**
     * @param filters An array of strings that include search keywords, prefixes, and operators that
     * filter the results that are returned for queries made using this view.
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("751df53b03533d1981c5b61c14a1dc7b1a5567bfee844a82c82942bf6361a8c6")
    public fun filters(filters: CfnView.FiltersProperty.Builder.() -> Unit)

    /**
     * @param includedProperties A list of fields that provide additional information about the
     * view.
     */
    public fun includedProperties(includedProperties: IResolvable)

    /**
     * @param includedProperties A list of fields that provide additional information about the
     * view.
     */
    public fun includedProperties(includedProperties: List<Any>)

    /**
     * @param includedProperties A list of fields that provide additional information about the
     * view.
     */
    public fun includedProperties(vararg includedProperties: Any)

    /**
     * @param scope The root ARN of the account, an organizational unit (OU), or an organization
     * ARN.
     * If left empty, the default is account.
     */
    public fun scope(scope: String)

    /**
     * @param tags Tag key and value pairs that are attached to the view.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param viewName The name of the new view. 
     */
    public fun viewName(viewName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.resourceexplorer2.CfnViewProps.Builder =
        software.amazon.awscdk.services.resourceexplorer2.CfnViewProps.builder()

    /**
     * @param filters An array of strings that include search keywords, prefixes, and operators that
     * filter the results that are returned for queries made using this view.
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
     */
    override fun filters(filters: IResolvable) {
      cdkBuilder.filters(filters.let(IResolvable::unwrap))
    }

    /**
     * @param filters An array of strings that include search keywords, prefixes, and operators that
     * filter the results that are returned for queries made using this view.
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
     */
    override fun filters(filters: CfnView.FiltersProperty) {
      cdkBuilder.filters(filters.let(CfnView.FiltersProperty::unwrap))
    }

    /**
     * @param filters An array of strings that include search keywords, prefixes, and operators that
     * filter the results that are returned for queries made using this view.
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("751df53b03533d1981c5b61c14a1dc7b1a5567bfee844a82c82942bf6361a8c6")
    override fun filters(filters: CfnView.FiltersProperty.Builder.() -> Unit): Unit =
        filters(CfnView.FiltersProperty(filters))

    /**
     * @param includedProperties A list of fields that provide additional information about the
     * view.
     */
    override fun includedProperties(includedProperties: IResolvable) {
      cdkBuilder.includedProperties(includedProperties.let(IResolvable::unwrap))
    }

    /**
     * @param includedProperties A list of fields that provide additional information about the
     * view.
     */
    override fun includedProperties(includedProperties: List<Any>) {
      cdkBuilder.includedProperties(includedProperties)
    }

    /**
     * @param includedProperties A list of fields that provide additional information about the
     * view.
     */
    override fun includedProperties(vararg includedProperties: Any): Unit =
        includedProperties(includedProperties.toList())

    /**
     * @param scope The root ARN of the account, an organizational unit (OU), or an organization
     * ARN.
     * If left empty, the default is account.
     */
    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    /**
     * @param tags Tag key and value pairs that are attached to the view.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param viewName The name of the new view. 
     */
    override fun viewName(viewName: String) {
      cdkBuilder.viewName(viewName)
    }

    public fun build(): software.amazon.awscdk.services.resourceexplorer2.CfnViewProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnViewProps,
  ) : CdkObject(cdkObject), CfnViewProps {
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
     */
    override fun filters(): Any? = unwrap(this).getFilters()

    /**
     * A list of fields that provide additional information about the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-includedproperties)
     */
    override fun includedProperties(): Any? = unwrap(this).getIncludedProperties()

    /**
     * The root ARN of the account, an organizational unit (OU), or an organization ARN.
     *
     * If left empty, the default is account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-scope)
     */
    override fun scope(): String? = unwrap(this).getScope()

    /**
     * Tag key and value pairs that are attached to the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The name of the new view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-viewname)
     */
    override fun viewName(): String = unwrap(this).getViewName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnViewProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnViewProps):
        CfnViewProps = CdkObjectWrappers.wrap(cdkObject) as? CfnViewProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnViewProps):
        software.amazon.awscdk.services.resourceexplorer2.CfnViewProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.resourceexplorer2.CfnViewProps
  }
}
