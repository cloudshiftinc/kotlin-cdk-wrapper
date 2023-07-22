@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnTagAssociation
import software.constructs.Construct

/**
 * The `AWS::LakeFormation::TagAssociation` resource represents an assignment of an LF-tag to a Data
 * Catalog resource (database, table, or column).
 *
 * During a stack operation, CloudFormation calls AWS Lake Formation `AddLFTagsToResource` API to
 * create a `TagAssociation` resource and calls the `RemoveLFTagsToResource` API to delete it.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * Object catalog;
 * Object tableWildcard;
 * CfnTagAssociation cfnTagAssociation = CfnTagAssociation.Builder.create(this,
 * "MyCfnTagAssociation")
 * .lfTags(List.of(LFTagPairProperty.builder()
 * .catalogId("catalogId")
 * .tagKey("tagKey")
 * .tagValues(List.of("tagValues"))
 * .build()))
 * .resource(ResourceProperty.builder()
 * .catalog(catalog)
 * .database(DatabaseResourceProperty.builder()
 * .catalogId("catalogId")
 * .name("name")
 * .build())
 * .table(TableResourceProperty.builder()
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * // the properties below are optional
 * .name("name")
 * .tableWildcard(tableWildcard)
 * .build())
 * .tableWithColumns(TableWithColumnsResourceProperty.builder()
 * .catalogId("catalogId")
 * .columnNames(List.of("columnNames"))
 * .databaseName("databaseName")
 * .name("name")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html)
 */
@CdkDslMarker
public class CfnTagAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTagAssociation.Builder = CfnTagAssociation.Builder.create(scope, id)

  private val _lfTags: MutableList<Any> = mutableListOf()

  /**
   * A structure containing an LF-tag key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html#cfn-lakeformation-tagassociation-lftags)
   * @param lfTags A structure containing an LF-tag key-value pair. 
   */
  public fun lfTags(vararg lfTags: Any) {
    _lfTags.addAll(listOf(*lfTags))
  }

  /**
   * A structure containing an LF-tag key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html#cfn-lakeformation-tagassociation-lftags)
   * @param lfTags A structure containing an LF-tag key-value pair. 
   */
  public fun lfTags(lfTags: Collection<Any>) {
    _lfTags.addAll(lfTags)
  }

  /**
   * A structure containing an LF-tag key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html#cfn-lakeformation-tagassociation-lftags)
   * @param lfTags A structure containing an LF-tag key-value pair. 
   */
  public fun lfTags(lfTags: IResolvable) {
    cdkBuilder.lfTags(lfTags)
  }

  /**
   * UTF-8 string (valid values: `DATABASE | TABLE` ).
   *
   * The resource for which the LF-tag policy applies.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html#cfn-lakeformation-tagassociation-resource)
   * @param resource UTF-8 string (valid values: `DATABASE | TABLE` ). 
   */
  public fun resource(resource: IResolvable) {
    cdkBuilder.resource(resource)
  }

  /**
   * UTF-8 string (valid values: `DATABASE | TABLE` ).
   *
   * The resource for which the LF-tag policy applies.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html#cfn-lakeformation-tagassociation-resource)
   * @param resource UTF-8 string (valid values: `DATABASE | TABLE` ). 
   */
  public fun resource(resource: CfnTagAssociation.ResourceProperty) {
    cdkBuilder.resource(resource)
  }

  public fun build(): CfnTagAssociation {
    if(_lfTags.isNotEmpty()) cdkBuilder.lfTags(_lfTags)
    return cdkBuilder.build()
  }
}
