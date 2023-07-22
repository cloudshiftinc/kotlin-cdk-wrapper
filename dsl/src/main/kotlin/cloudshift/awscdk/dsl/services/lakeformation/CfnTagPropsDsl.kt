@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lakeformation.CfnTagProps

/**
 * Properties for defining a `CfnTag`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * CfnTagProps cfnTagProps = CfnTagProps.builder()
 * .tagKey("tagKey")
 * .tagValues(List.of("tagValues"))
 * // the properties below are optional
 * .catalogId("catalogId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html)
 */
@CdkDslMarker
public class CfnTagPropsDsl {
  private val cdkBuilder: CfnTagProps.Builder = CfnTagProps.builder()

  private val _tagValues: MutableList<String> = mutableListOf()

  /**
   * @param catalogId Catalog id string, not less than 1 or more than 255 bytes long, matching the
   * [single-line string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
   * .
   * The identifier for the Data Catalog . By default, the account ID. The Data Catalog is the
   * persistent metadata store. It contains database definitions, table definitions, and other control
   * information to manage your AWS Lake Formation environment.
   */
  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  /**
   * @param tagKey UTF-8 string, not less than 1 or more than 255 bytes long, matching the
   * [single-line string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
   * . 
   * The key-name for the LF-tag.
   */
  public fun tagKey(tagKey: String) {
    cdkBuilder.tagKey(tagKey)
  }

  /**
   * @param tagValues An array of UTF-8 strings, not less than 1 or more than 50 strings. 
   * A list of possible values of the corresponding `TagKey` of an LF-tag key-value pair.
   */
  public fun tagValues(vararg tagValues: String) {
    _tagValues.addAll(listOf(*tagValues))
  }

  /**
   * @param tagValues An array of UTF-8 strings, not less than 1 or more than 50 strings. 
   * A list of possible values of the corresponding `TagKey` of an LF-tag key-value pair.
   */
  public fun tagValues(tagValues: Collection<String>) {
    _tagValues.addAll(tagValues)
  }

  public fun build(): CfnTagProps {
    if(_tagValues.isNotEmpty()) cdkBuilder.tagValues(_tagValues)
    return cdkBuilder.build()
  }
}
