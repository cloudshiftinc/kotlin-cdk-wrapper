@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

/**
 * Describes the location of the channel data.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * DataSourceProperty dataSourceProperty = DataSourceProperty.builder()
 * .s3DataSource(S3DataSourceProperty.builder()
 * .s3DataType("s3DataType")
 * .s3Uri("s3Uri")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-datasource.html)
 */
@CdkDslMarker
public class CfnModelPackageDataSourcePropertyDsl {
  private val cdkBuilder: CfnModelPackage.DataSourceProperty.Builder =
      CfnModelPackage.DataSourceProperty.builder()

  /**
   * @param s3DataSource The S3 location of the data source that is associated with a channel. 
   */
  public fun s3DataSource(s3DataSource: IResolvable) {
    cdkBuilder.s3DataSource(s3DataSource)
  }

  /**
   * @param s3DataSource The S3 location of the data source that is associated with a channel. 
   */
  public fun s3DataSource(s3DataSource: CfnModelPackage.S3DataSourceProperty) {
    cdkBuilder.s3DataSource(s3DataSource)
  }

  public fun build(): CfnModelPackage.DataSourceProperty = cdkBuilder.build()
}
