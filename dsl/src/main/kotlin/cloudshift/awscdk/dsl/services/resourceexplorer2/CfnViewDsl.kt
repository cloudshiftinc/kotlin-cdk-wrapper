@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.resourceexplorer2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.resourceexplorer2.CfnView
import software.constructs.Construct

/**
 * Creates a view that users can query by using the
 * [Search](https://docs.aws.amazon.com/resource-explorer/latest/apireference/API_Search.html)
 * operation. Results from queries that you make using this view include only resources that match
 * the view's `Filters` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.resourceexplorer2.*;
 * CfnView cfnView = CfnView.Builder.create(this, "MyCfnView")
 * .viewName("viewName")
 * // the properties below are optional
 * .filters(FiltersProperty.builder()
 * .filterString("filterString")
 * .build())
 * .includedProperties(List.of(IncludedPropertyProperty.builder()
 * .name("name")
 * .build()))
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html)
 */
@CdkDslMarker
public class CfnViewDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnView.Builder = CfnView.Builder.create(scope, id)

    private val _includedProperties: MutableList<Any> = mutableListOf()

    /**
     * An array of strings that include search keywords, prefixes, and operators that filter the
     * results that are returned for queries made using this view.
     *
     * When you use this view in a
     * [Search](https://docs.aws.amazon.com/resource-explorer/latest/apireference/API_Search.html)
     * operation, the filter string is combined with the search's `QueryString` parameter using a
     * logical `AND` operator.
     *
     * For information about the supported syntax, see
     * [Search query reference for Resource Explorer](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html)
     * in the *AWS Resource Explorer User Guide* .
     *
     * This query string in the context of this operation supports only
     * [filter prefixes](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-filters)
     * with optional
     * [operators](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-operators)
     * . It doesn't support free-form text. For example, the string `region:us* service:ec2
     * -tag:stage=prod` includes all Amazon EC2 resources in any AWS Region that begin with the
     * letters `us` and are *not* tagged with a key `Stage` that has the value `prod` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-filters)
     *
     * @param filters An array of strings that include search keywords, prefixes, and operators that
     *   filter the results that are returned for queries made using this view.
     */
    public fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters)
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
     * For information about the supported syntax, see
     * [Search query reference for Resource Explorer](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html)
     * in the *AWS Resource Explorer User Guide* .
     *
     * This query string in the context of this operation supports only
     * [filter prefixes](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-filters)
     * with optional
     * [operators](https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-operators)
     * . It doesn't support free-form text. For example, the string `region:us* service:ec2
     * -tag:stage=prod` includes all Amazon EC2 resources in any AWS Region that begin with the
     * letters `us` and are *not* tagged with a key `Stage` that has the value `prod` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-filters)
     *
     * @param filters An array of strings that include search keywords, prefixes, and operators that
     *   filter the results that are returned for queries made using this view.
     */
    public fun filters(filters: CfnView.FiltersProperty) {
        cdkBuilder.filters(filters)
    }

    /**
     * A list of fields that provide additional information about the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-includedproperties)
     *
     * @param includedProperties A list of fields that provide additional information about the
     *   view.
     */
    public fun includedProperties(vararg includedProperties: Any) {
        _includedProperties.addAll(listOf(*includedProperties))
    }

    /**
     * A list of fields that provide additional information about the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-includedproperties)
     *
     * @param includedProperties A list of fields that provide additional information about the
     *   view.
     */
    public fun includedProperties(includedProperties: Collection<Any>) {
        _includedProperties.addAll(includedProperties)
    }

    /**
     * A list of fields that provide additional information about the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-includedproperties)
     *
     * @param includedProperties A list of fields that provide additional information about the
     *   view.
     */
    public fun includedProperties(includedProperties: IResolvable) {
        cdkBuilder.includedProperties(includedProperties)
    }

    /**
     * Tag key and value pairs that are attached to the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-tags)
     *
     * @param tags Tag key and value pairs that are attached to the view.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * The name of the new view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-view.html#cfn-resourceexplorer2-view-viewname)
     *
     * @param viewName The name of the new view.
     */
    public fun viewName(viewName: String) {
        cdkBuilder.viewName(viewName)
    }

    public fun build(): CfnView {
        if (_includedProperties.isNotEmpty()) cdkBuilder.includedProperties(_includedProperties)
        return cdkBuilder.build()
    }
}
