@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions

/**
 * The LF-tag key and values attached to a resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * LFTagProperty lFTagProperty = LFTagProperty.builder()
 * .tagKey("tagKey")
 * .tagValues(List.of("tagValues"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-lftag.html)
 */
@CdkDslMarker
public class CfnPrincipalPermissionsLFTagPropertyDsl {
  private val cdkBuilder: CfnPrincipalPermissions.LFTagProperty.Builder =
      CfnPrincipalPermissions.LFTagProperty.builder()

  private val _tagValues: MutableList<String> = mutableListOf()

  /**
   * @param tagKey The key-name for the LF-tag.
   */
  public fun tagKey(tagKey: String) {
    cdkBuilder.tagKey(tagKey)
  }

  /**
   * @param tagValues A list of possible values of the corresponding `TagKey` of an LF-tag key-value
   * pair.
   */
  public fun tagValues(vararg tagValues: String) {
    _tagValues.addAll(listOf(*tagValues))
  }

  /**
   * @param tagValues A list of possible values of the corresponding `TagKey` of an LF-tag key-value
   * pair.
   */
  public fun tagValues(tagValues: Collection<String>) {
    _tagValues.addAll(tagValues)
  }

  public fun build(): CfnPrincipalPermissions.LFTagProperty {
    if(_tagValues.isNotEmpty()) cdkBuilder.tagValues(_tagValues)
    return cdkBuilder.build()
  }
}
