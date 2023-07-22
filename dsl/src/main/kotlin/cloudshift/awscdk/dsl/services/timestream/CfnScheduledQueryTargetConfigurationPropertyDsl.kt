@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

/**
 * Configuration used for writing the output of a query.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.timestream.*;
 * TargetConfigurationProperty targetConfigurationProperty = TargetConfigurationProperty.builder()
 * .timestreamConfiguration(TimestreamConfigurationProperty.builder()
 * .databaseName("databaseName")
 * .dimensionMappings(List.of(DimensionMappingProperty.builder()
 * .dimensionValueType("dimensionValueType")
 * .name("name")
 * .build()))
 * .tableName("tableName")
 * .timeColumn("timeColumn")
 * // the properties below are optional
 * .measureNameColumn("measureNameColumn")
 * .mixedMeasureMappings(List.of(MixedMeasureMappingProperty.builder()
 * .measureValueType("measureValueType")
 * // the properties below are optional
 * .measureName("measureName")
 * .multiMeasureAttributeMappings(List.of(MultiMeasureAttributeMappingProperty.builder()
 * .measureValueType("measureValueType")
 * .sourceColumn("sourceColumn")
 * // the properties below are optional
 * .targetMultiMeasureAttributeName("targetMultiMeasureAttributeName")
 * .build()))
 * .sourceColumn("sourceColumn")
 * .targetMeasureName("targetMeasureName")
 * .build()))
 * .multiMeasureMappings(MultiMeasureMappingsProperty.builder()
 * .multiMeasureAttributeMappings(List.of(MultiMeasureAttributeMappingProperty.builder()
 * .measureValueType("measureValueType")
 * .sourceColumn("sourceColumn")
 * // the properties below are optional
 * .targetMultiMeasureAttributeName("targetMultiMeasureAttributeName")
 * .build()))
 * // the properties below are optional
 * .targetMultiMeasureName("targetMultiMeasureName")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-targetconfiguration.html)
 */
@CdkDslMarker
public class CfnScheduledQueryTargetConfigurationPropertyDsl {
  private val cdkBuilder: CfnScheduledQuery.TargetConfigurationProperty.Builder =
      CfnScheduledQuery.TargetConfigurationProperty.builder()

  /**
   * @param timestreamConfiguration Configuration needed to write data into the Timestream database
   * and table. 
   */
  public fun timestreamConfiguration(timestreamConfiguration: IResolvable) {
    cdkBuilder.timestreamConfiguration(timestreamConfiguration)
  }

  /**
   * @param timestreamConfiguration Configuration needed to write data into the Timestream database
   * and table. 
   */
  public
      fun timestreamConfiguration(timestreamConfiguration: CfnScheduledQuery.TimestreamConfigurationProperty) {
    cdkBuilder.timestreamConfiguration(timestreamConfiguration)
  }

  public fun build(): CfnScheduledQuery.TargetConfigurationProperty = cdkBuilder.build()
}
