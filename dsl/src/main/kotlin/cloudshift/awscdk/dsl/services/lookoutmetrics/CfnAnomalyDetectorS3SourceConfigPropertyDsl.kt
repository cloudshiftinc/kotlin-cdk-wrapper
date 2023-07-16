@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@CdkDslMarker
public class CfnAnomalyDetectorS3SourceConfigPropertyDsl {
  private val cdkBuilder: CfnAnomalyDetector.S3SourceConfigProperty.Builder =
      CfnAnomalyDetector.S3SourceConfigProperty.builder()

  private val _historicalDataPathList: MutableList<String> = mutableListOf()

  private val _templatedPathList: MutableList<String> = mutableListOf()

  public fun fileFormatDescriptor(fileFormatDescriptor: IResolvable) {
    cdkBuilder.fileFormatDescriptor(fileFormatDescriptor)
  }

  public
      fun fileFormatDescriptor(fileFormatDescriptor: CfnAnomalyDetector.FileFormatDescriptorProperty) {
    cdkBuilder.fileFormatDescriptor(fileFormatDescriptor)
  }

  public fun historicalDataPathList(vararg historicalDataPathList: String) {
    _historicalDataPathList.addAll(listOf(*historicalDataPathList))
  }

  public fun historicalDataPathList(historicalDataPathList: Collection<String>) {
    _historicalDataPathList.addAll(historicalDataPathList)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun templatedPathList(vararg templatedPathList: String) {
    _templatedPathList.addAll(listOf(*templatedPathList))
  }

  public fun templatedPathList(templatedPathList: Collection<String>) {
    _templatedPathList.addAll(templatedPathList)
  }

  public fun build(): CfnAnomalyDetector.S3SourceConfigProperty {
    if(_historicalDataPathList.isNotEmpty())
        cdkBuilder.historicalDataPathList(_historicalDataPathList)
    if(_templatedPathList.isNotEmpty()) cdkBuilder.templatedPathList(_templatedPathList)
    return cdkBuilder.build()
  }
}
