@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Document metadata files that contain information such as the document access control information,
 * source URI, document author, and custom attributes.
 *
 * Each metadata file contains metadata about a single document.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * DocumentsMetadataConfigurationProperty documentsMetadataConfigurationProperty =
 * DocumentsMetadataConfigurationProperty.builder()
 * .s3Prefix("s3Prefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentsmetadataconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceDocumentsMetadataConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.DocumentsMetadataConfigurationProperty.Builder =
      CfnDataSource.DocumentsMetadataConfigurationProperty.builder()

  /**
   * @param s3Prefix A prefix used to filter metadata configuration files in the AWS S3 bucket.
   * The S3 bucket might contain multiple metadata files. Use `S3Prefix` to include only the desired
   * metadata files.
   */
  public fun s3Prefix(s3Prefix: String) {
    cdkBuilder.s3Prefix(s3Prefix)
  }

  public fun build(): CfnDataSource.DocumentsMetadataConfigurationProperty = cdkBuilder.build()
}
