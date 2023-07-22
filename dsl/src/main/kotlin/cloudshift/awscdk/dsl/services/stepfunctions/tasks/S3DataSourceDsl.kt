@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.stepfunctions.tasks.S3DataDistributionType
import software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource
import software.amazon.awscdk.services.stepfunctions.tasks.S3DataType
import software.amazon.awscdk.services.stepfunctions.tasks.S3Location

@CdkDslMarker
public class S3DataSourceDsl {
  private val cdkBuilder: S3DataSource.Builder = S3DataSource.builder()

  private val _attributeNames: MutableList<String> = mutableListOf()

  /**
   * @param attributeNames List of one or more attribute names to use that are found in a specified
   * augmented manifest file.
   */
  public fun attributeNames(vararg attributeNames: String) {
    _attributeNames.addAll(listOf(*attributeNames))
  }

  /**
   * @param attributeNames List of one or more attribute names to use that are found in a specified
   * augmented manifest file.
   */
  public fun attributeNames(attributeNames: Collection<String>) {
    _attributeNames.addAll(attributeNames)
  }

  /**
   * @param s3DataDistributionType S3 Data Distribution Type.
   */
  public fun s3DataDistributionType(s3DataDistributionType: S3DataDistributionType) {
    cdkBuilder.s3DataDistributionType(s3DataDistributionType)
  }

  /**
   * @param s3DataType S3 Data Type.
   */
  public fun s3DataType(s3DataType: S3DataType) {
    cdkBuilder.s3DataType(s3DataType)
  }

  /**
   * @param s3Location S3 Uri. 
   */
  public fun s3Location(s3Location: S3Location) {
    cdkBuilder.s3Location(s3Location)
  }

  public fun build(): S3DataSource {
    if(_attributeNames.isNotEmpty()) cdkBuilder.attributeNames(_attributeNames)
    return cdkBuilder.build()
  }
}
