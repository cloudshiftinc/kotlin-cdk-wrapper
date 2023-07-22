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
