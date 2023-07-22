@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnPartition
import software.amazon.awscdk.services.glue.CfnPartitionProps

/**
 * Properties for defining a `CfnPartition`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * Object parameters;
 * Object skewedColumnValueLocationMaps;
 * CfnPartitionProps cfnPartitionProps = CfnPartitionProps.builder()
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .partitionInput(PartitionInputProperty.builder()
 * .values(List.of("values"))
 * // the properties below are optional
 * .parameters(parameters)
 * .storageDescriptor(StorageDescriptorProperty.builder()
 * .bucketColumns(List.of("bucketColumns"))
 * .columns(List.of(ColumnProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .comment("comment")
 * .type("type")
 * .build()))
 * .compressed(false)
 * .inputFormat("inputFormat")
 * .location("location")
 * .numberOfBuckets(123)
 * .outputFormat("outputFormat")
 * .parameters(parameters)
 * .schemaReference(SchemaReferenceProperty.builder()
 * .schemaId(SchemaIdProperty.builder()
 * .registryName("registryName")
 * .schemaArn("schemaArn")
 * .schemaName("schemaName")
 * .build())
 * .schemaVersionId("schemaVersionId")
 * .schemaVersionNumber(123)
 * .build())
 * .serdeInfo(SerdeInfoProperty.builder()
 * .name("name")
 * .parameters(parameters)
 * .serializationLibrary("serializationLibrary")
 * .build())
 * .skewedInfo(SkewedInfoProperty.builder()
 * .skewedColumnNames(List.of("skewedColumnNames"))
 * .skewedColumnValueLocationMaps(skewedColumnValueLocationMaps)
 * .skewedColumnValues(List.of("skewedColumnValues"))
 * .build())
 * .sortColumns(List.of(OrderProperty.builder()
 * .column("column")
 * // the properties below are optional
 * .sortOrder(123)
 * .build()))
 * .storedAsSubDirectories(false)
 * .build())
 * .build())
 * .tableName("tableName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html)
 */
@CdkDslMarker
public class CfnPartitionPropsDsl {
  private val cdkBuilder: CfnPartitionProps.Builder = CfnPartitionProps.builder()

  /**
   * @param catalogId The AWS account ID of the catalog in which the partion is to be created. 
   *
   * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
   * pseudo parameter. For example: `!Ref AWS::AccountId`
   */
  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  /**
   * @param databaseName The name of the catalog database in which to create the partition. 
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  /**
   * @param partitionInput The structure used to create and update a partition. 
   */
  public fun partitionInput(partitionInput: IResolvable) {
    cdkBuilder.partitionInput(partitionInput)
  }

  /**
   * @param partitionInput The structure used to create and update a partition. 
   */
  public fun partitionInput(partitionInput: CfnPartition.PartitionInputProperty) {
    cdkBuilder.partitionInput(partitionInput)
  }

  /**
   * @param tableName The name of the metadata table in which the partition is to be created. 
   */
  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun build(): CfnPartitionProps = cdkBuilder.build()
}
