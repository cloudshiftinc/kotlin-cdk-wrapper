@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

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
