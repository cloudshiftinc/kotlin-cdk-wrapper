@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * A physical table type for an S3 data source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * S3SourceProperty s3SourceProperty = S3SourceProperty.builder()
 * .dataSourceArn("dataSourceArn")
 * .inputColumns(List.of(InputColumnProperty.builder()
 * .name("name")
 * .type("type")
 * .build()))
 * // the properties below are optional
 * .uploadSettings(UploadSettingsProperty.builder()
 * .containsHeader(false)
 * .delimiter("delimiter")
 * .format("format")
 * .startFromRow(123)
 * .textQualifier("textQualifier")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-s3source.html)
 */
@CdkDslMarker
public class CfnDataSetS3SourcePropertyDsl {
  private val cdkBuilder: CfnDataSet.S3SourceProperty.Builder =
      CfnDataSet.S3SourceProperty.builder()

  private val _inputColumns: MutableList<Any> = mutableListOf()

  /**
   * @param dataSourceArn The Amazon Resource Name (ARN) for the data source. 
   */
  public fun dataSourceArn(dataSourceArn: String) {
    cdkBuilder.dataSourceArn(dataSourceArn)
  }

  /**
   * @param inputColumns A physical table type for an S3 data source. 
   *
   * For files that aren't JSON, only `STRING` data types are supported in input columns.
   */
  public fun inputColumns(vararg inputColumns: Any) {
    _inputColumns.addAll(listOf(*inputColumns))
  }

  /**
   * @param inputColumns A physical table type for an S3 data source. 
   *
   * For files that aren't JSON, only `STRING` data types are supported in input columns.
   */
  public fun inputColumns(inputColumns: Collection<Any>) {
    _inputColumns.addAll(inputColumns)
  }

  /**
   * @param inputColumns A physical table type for an S3 data source. 
   *
   * For files that aren't JSON, only `STRING` data types are supported in input columns.
   */
  public fun inputColumns(inputColumns: IResolvable) {
    cdkBuilder.inputColumns(inputColumns)
  }

  /**
   * @param uploadSettings Information about the format for the S3 source file or files.
   */
  public fun uploadSettings(uploadSettings: IResolvable) {
    cdkBuilder.uploadSettings(uploadSettings)
  }

  /**
   * @param uploadSettings Information about the format for the S3 source file or files.
   */
  public fun uploadSettings(uploadSettings: CfnDataSet.UploadSettingsProperty) {
    cdkBuilder.uploadSettings(uploadSettings)
  }

  public fun build(): CfnDataSet.S3SourceProperty {
    if(_inputColumns.isNotEmpty()) cdkBuilder.inputColumns(_inputColumns)
    return cdkBuilder.build()
  }
}
