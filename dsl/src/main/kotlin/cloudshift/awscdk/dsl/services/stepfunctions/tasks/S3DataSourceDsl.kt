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

  public fun attributeNames(vararg attributeNames: String) {
    _attributeNames.addAll(listOf(*attributeNames))
  }

  public fun attributeNames(attributeNames: Collection<String>) {
    _attributeNames.addAll(attributeNames)
  }

  public fun s3DataDistributionType(s3DataDistributionType: S3DataDistributionType) {
    cdkBuilder.s3DataDistributionType(s3DataDistributionType)
  }

  public fun s3DataType(s3DataType: S3DataType) {
    cdkBuilder.s3DataType(s3DataType)
  }

  public fun s3Location(s3Location: S3Location) {
    cdkBuilder.s3Location(s3Location)
  }

  public fun build(): S3DataSource {
    if(_attributeNames.isNotEmpty()) cdkBuilder.attributeNames(_attributeNames)
    return cdkBuilder.build()
  }
}
