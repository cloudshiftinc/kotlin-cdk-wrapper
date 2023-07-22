@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamDataFormatConversionConfigurationPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.DataFormatConversionConfigurationProperty.Builder =
      CfnDeliveryStream.DataFormatConversionConfigurationProperty.builder()

  /**
   * @param enabled Defaults to `true` .
   * Set it to `false` if you want to disable format conversion while preserving the configuration
   * details.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Defaults to `true` .
   * Set it to `false` if you want to disable format conversion while preserving the configuration
   * details.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param inputFormatConfiguration Specifies the deserializer that you want Kinesis Data Firehose
   * to use to convert the format of your data from JSON.
   * This parameter is required if `Enabled` is set to true.
   */
  public fun inputFormatConfiguration(inputFormatConfiguration: IResolvable) {
    cdkBuilder.inputFormatConfiguration(inputFormatConfiguration)
  }

  /**
   * @param inputFormatConfiguration Specifies the deserializer that you want Kinesis Data Firehose
   * to use to convert the format of your data from JSON.
   * This parameter is required if `Enabled` is set to true.
   */
  public
      fun inputFormatConfiguration(inputFormatConfiguration: CfnDeliveryStream.InputFormatConfigurationProperty) {
    cdkBuilder.inputFormatConfiguration(inputFormatConfiguration)
  }

  /**
   * @param outputFormatConfiguration Specifies the serializer that you want Kinesis Data Firehose
   * to use to convert the format of your data to the Parquet or ORC format.
   * This parameter is required if `Enabled` is set to true.
   */
  public fun outputFormatConfiguration(outputFormatConfiguration: IResolvable) {
    cdkBuilder.outputFormatConfiguration(outputFormatConfiguration)
  }

  /**
   * @param outputFormatConfiguration Specifies the serializer that you want Kinesis Data Firehose
   * to use to convert the format of your data to the Parquet or ORC format.
   * This parameter is required if `Enabled` is set to true.
   */
  public
      fun outputFormatConfiguration(outputFormatConfiguration: CfnDeliveryStream.OutputFormatConfigurationProperty) {
    cdkBuilder.outputFormatConfiguration(outputFormatConfiguration)
  }

  /**
   * @param schemaConfiguration Specifies the AWS Glue Data Catalog table that contains the column
   * information.
   * This parameter is required if `Enabled` is set to true.
   */
  public fun schemaConfiguration(schemaConfiguration: IResolvable) {
    cdkBuilder.schemaConfiguration(schemaConfiguration)
  }

  /**
   * @param schemaConfiguration Specifies the AWS Glue Data Catalog table that contains the column
   * information.
   * This parameter is required if `Enabled` is set to true.
   */
  public
      fun schemaConfiguration(schemaConfiguration: CfnDeliveryStream.SchemaConfigurationProperty) {
    cdkBuilder.schemaConfiguration(schemaConfiguration)
  }

  public fun build(): CfnDeliveryStream.DataFormatConversionConfigurationProperty =
      cdkBuilder.build()
}
