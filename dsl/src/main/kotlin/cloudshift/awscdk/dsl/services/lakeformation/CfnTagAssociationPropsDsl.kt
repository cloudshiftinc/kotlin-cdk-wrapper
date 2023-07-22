@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnTagAssociation
import software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps

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
