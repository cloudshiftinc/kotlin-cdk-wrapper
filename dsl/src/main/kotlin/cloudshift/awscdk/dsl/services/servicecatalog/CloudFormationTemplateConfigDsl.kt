@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.servicecatalog.CloudFormationTemplateConfig

@CdkDslMarker
public class CloudFormationTemplateConfigDsl {
  private val cdkBuilder: CloudFormationTemplateConfig.Builder =
      CloudFormationTemplateConfig.builder()

  /**
   * @param assetBucket The S3 bucket containing product stack assets.
   */
  public fun assetBucket(assetBucket: IBucket) {
    cdkBuilder.assetBucket(assetBucket)
  }

  /**
   * @param httpUrl The http url of the template in S3. 
   */
  public fun httpUrl(httpUrl: String) {
    cdkBuilder.httpUrl(httpUrl)
  }

  public fun build(): CloudFormationTemplateConfig = cdkBuilder.build()
}
