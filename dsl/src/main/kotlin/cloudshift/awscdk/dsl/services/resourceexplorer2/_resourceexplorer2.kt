@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.resourceexplorer2

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociation
import software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociationProps
import software.amazon.awscdk.services.resourceexplorer2.CfnIndex
import software.amazon.awscdk.services.resourceexplorer2.CfnIndexProps
import software.amazon.awscdk.services.resourceexplorer2.CfnView
import software.amazon.awscdk.services.resourceexplorer2.CfnViewProps
import software.constructs.Construct

public object resourceexplorer2 {
  /**
   * Sets the specified view as the default for the AWS Region in which you call this operation.
   *
   * If a user makes a search query that doesn't explicitly specify the view to use, Resource
   * Explorer chooses this default view automatically for searches performed in this AWS Region .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.resourceexplorer2.*;
   * CfnDefaultViewAssociation cfnDefaultViewAssociation =
   * CfnDefaultViewAssociation.Builder.create(this, "MyCfnDefaultViewAssociation")
   * .viewArn("viewArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-defaultviewassociation.html)
   */
  public inline fun cfnDefaultViewAssociation(
    scope: Construct,
    id: String,
    block: CfnDefaultViewAssociationDsl.() -> Unit = {},
  ): CfnDefaultViewAssociation {
    val builder = CfnDefaultViewAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnDefaultViewAssociation`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.resourceexplorer2.*;
   * CfnDefaultViewAssociationProps cfnDefaultViewAssociationProps =
   * CfnDefaultViewAssociationProps.builder()
   * .viewArn("viewArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-defaultviewassociation.html)
   */
  public inline
      fun cfnDefaultViewAssociationProps(block: CfnDefaultViewAssociationPropsDsl.() -> Unit = {}):
      CfnDefaultViewAssociationProps {
    val builder = CfnDefaultViewAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Turns on Resource Explorer in the AWS Region in which you called this operation by creating an
   * index.
   *
   * Resource Explorer begins discovering the resources in this Region and stores the details about
   * the resources in the index so that they can be queried by using the
   * [Search](https://docs.aws.amazon.com/resource-explorer/latest/apireference/API_Search.html)
   * operation.
   *
   * You can create either a local index that returns search results from only the AWS Region in
   * which the index exists, or you can create an aggregator index that returns search results from all
   * AWS Regions in the AWS account .
   *
   * For more details about what happens when you turn on Resource Explorer in an AWS Region , see
   * [Turning on Resource Explorer to index your resources in an AWS
   * Region](https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-service-activate.html)
   * in the *AWS Resource Explorer User Guide.*
   *
   * If this is the first AWS Region in which you've created an index for Resource Explorer, this
   * operation also creates a service-linked role in your AWS account that allows Resource Explorer to
   * search for your resources and populate the index.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.resourceexplorer2.*;
   * CfnIndex cfnIndex = CfnIndex.Builder.create(this, "MyCfnIndex")
   * .type("type")
   * // the properties below are optional
   * .tags(Map.of(
   * "tagsKey", "tags"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-index.html)
   */
  public inline fun cfnIndex(
    scope: Construct,
    id: String,
    block: CfnIndexDsl.() -> Unit = {},
  ): CfnIndex {
    val builder = CfnIndexDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnIndex`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.resourceexplorer2.*;
   * CfnIndexProps cfnIndexProps = CfnIndexProps.builder()
   * .type("type")
   * // the properties below are optional
   * .tags(Map.of(
   * "tagsKey", "tags"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-index.html)
   */
  public inline fun cfnIndexProps(block: CfnIndexPropsDsl.() -> Unit = {}): CfnIndexProps {
    val builder = CfnIndexPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a view that users can query by using the
   * [Search](https://docs.aws.amazon.com/resource-explorer/latest/apireference/API_Search.html)
   * operation. Results from queries that you make using this view include only resources that match
   * the view's `Filters` .
   *
   * Example:
   *
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
  public inline fun cfnView(
    scope: Construct,
    id: String,
    block: CfnViewDsl.() -> Unit = {},
  ): CfnView {
    val builder = CfnViewDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object with a `FilterString` that specifies which resources to include in the results of
   * queries made using this view.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.resourceexplorer2.*;
   * FiltersProperty filtersProperty = FiltersProperty.builder()
   * .filterString("filterString")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourceexplorer2-view-filters.html)
   */
  public inline fun cfnViewFiltersProperty(block: CfnViewFiltersPropertyDsl.() -> Unit = {}):
      CfnView.FiltersProperty {
    val builder = CfnViewFiltersPropertyDsl()
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.resourceexplorer2.*;
   * IncludedPropertyProperty includedPropertyProperty = IncludedPropertyProperty.builder()
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourceexplorer2-view-includedproperty.html)
   */
  public inline
      fun cfnViewIncludedPropertyProperty(block: CfnViewIncludedPropertyPropertyDsl.() -> Unit =
      {}): CfnView.IncludedPropertyProperty {
    val builder = CfnViewIncludedPropertyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnView`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.resourceexplorer2.*;
   * CfnViewProps cfnViewProps = CfnViewProps.builder()
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
  public inline fun cfnViewProps(block: CfnViewPropsDsl.() -> Unit = {}): CfnViewProps {
    val builder = CfnViewPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
