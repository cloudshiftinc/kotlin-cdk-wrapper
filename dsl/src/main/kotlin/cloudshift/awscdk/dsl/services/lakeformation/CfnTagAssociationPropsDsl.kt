@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnTagAssociation
import software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps

/**
 * Properties for defining a `CfnTagAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * Object catalog;
 * Object tableWildcard;
 * CfnTagAssociationProps cfnTagAssociationProps = CfnTagAssociationProps.builder()
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
public class CfnTagAssociationPropsDsl {
  private val cdkBuilder: CfnTagAssociationProps.Builder = CfnTagAssociationProps.builder()

  private val _lfTags: MutableList<Any> = mutableListOf()

  /**
   * @param lfTags A structure containing an LF-tag key-value pair. 
   */
  public fun lfTags(vararg lfTags: Any) {
    _lfTags.addAll(listOf(*lfTags))
  }

  /**
   * @param lfTags A structure containing an LF-tag key-value pair. 
   */
  public fun lfTags(lfTags: Collection<Any>) {
    _lfTags.addAll(lfTags)
  }

  /**
   * @param lfTags A structure containing an LF-tag key-value pair. 
   */
  public fun lfTags(lfTags: IResolvable) {
    cdkBuilder.lfTags(lfTags)
  }

  /**
   * @param resource UTF-8 string (valid values: `DATABASE | TABLE` ). 
   * The resource for which the LF-tag policy applies.
   */
  public fun resource(resource: IResolvable) {
    cdkBuilder.resource(resource)
  }

  /**
   * @param resource UTF-8 string (valid values: `DATABASE | TABLE` ). 
   * The resource for which the LF-tag policy applies.
   */
  public fun resource(resource: CfnTagAssociation.ResourceProperty) {
    cdkBuilder.resource(resource)
  }

  public fun build(): CfnTagAssociationProps {
    if(_lfTags.isNotEmpty()) cdkBuilder.lfTags(_lfTags)
    return cdkBuilder.build()
  }
}
