@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceDocumentsMetadataConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.DocumentsMetadataConfigurationProperty.Builder =
      CfnDataSource.DocumentsMetadataConfigurationProperty.builder()

  public fun s3Prefix(s3Prefix: String) {
    cdkBuilder.s3Prefix(s3Prefix)
  }

  public fun build(): CfnDataSource.DocumentsMetadataConfigurationProperty = cdkBuilder.build()
}
