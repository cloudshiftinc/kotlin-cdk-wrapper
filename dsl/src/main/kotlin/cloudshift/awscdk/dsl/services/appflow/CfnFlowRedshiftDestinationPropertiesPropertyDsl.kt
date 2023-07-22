@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowRedshiftDestinationPropertiesPropertyDsl {
  private val cdkBuilder: CfnFlow.RedshiftDestinationPropertiesProperty.Builder =
      CfnFlow.RedshiftDestinationPropertiesProperty.builder()

  /**
   * @param bucketPrefix The object key for the bucket in which Amazon AppFlow places the
   * destination files.
   */
  public fun bucketPrefix(bucketPrefix: String) {
    cdkBuilder.bucketPrefix(bucketPrefix)
  }

  /**
   * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error when
   * placing data in the Amazon Redshift destination.
   * For example, this setting would determine if the flow should fail after one insertion error, or
   * continue and attempt to insert every record regardless of the initial failure.
   * `ErrorHandlingConfig` is a part of the destination connector details.
   */
  public fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
    cdkBuilder.errorHandlingConfig(errorHandlingConfig)
  }

  /**
   * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error when
   * placing data in the Amazon Redshift destination.
   * For example, this setting would determine if the flow should fail after one insertion error, or
   * continue and attempt to insert every record regardless of the initial failure.
   * `ErrorHandlingConfig` is a part of the destination connector details.
   */
  public fun errorHandlingConfig(errorHandlingConfig: CfnFlow.ErrorHandlingConfigProperty) {
    cdkBuilder.errorHandlingConfig(errorHandlingConfig)
  }

  /**
   * @param intermediateBucketName The intermediate bucket that Amazon AppFlow uses when moving data
   * into Amazon Redshift. 
   */
  public fun intermediateBucketName(intermediateBucketName: String) {
    cdkBuilder.intermediateBucketName(intermediateBucketName)
  }

  /**
   * @param object The object specified in the Amazon Redshift flow destination. 
   */
  public fun `object`(`object`: String) {
    cdkBuilder.`object`(`object`)
  }

  public fun build(): CfnFlow.RedshiftDestinationPropertiesProperty = cdkBuilder.build()
}
