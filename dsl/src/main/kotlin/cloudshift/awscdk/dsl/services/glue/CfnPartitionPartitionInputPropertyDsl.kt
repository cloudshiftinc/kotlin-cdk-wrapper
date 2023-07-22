@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnPartition

/**
 * The structure used to create and update a partition.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * Object parameters;
 * Object skewedColumnValueLocationMaps;
 * PartitionInputProperty partitionInputProperty = PartitionInputProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html)
 */
@CdkDslMarker
public class CfnPartitionPartitionInputPropertyDsl {
  private val cdkBuilder: CfnPartition.PartitionInputProperty.Builder =
      CfnPartition.PartitionInputProperty.builder()

  private val _values: MutableList<String> = mutableListOf()

  /**
   * @param parameters These key-value pairs define partition parameters.
   */
  public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(parameters)
    cdkBuilder.parameters(builder.map)
  }

  /**
   * @param parameters These key-value pairs define partition parameters.
   */
  public fun parameters(parameters: Any) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param storageDescriptor Provides information about the physical location where the partition
   * is stored.
   */
  public fun storageDescriptor(storageDescriptor: IResolvable) {
    cdkBuilder.storageDescriptor(storageDescriptor)
  }

  /**
   * @param storageDescriptor Provides information about the physical location where the partition
   * is stored.
   */
  public fun storageDescriptor(storageDescriptor: CfnPartition.StorageDescriptorProperty) {
    cdkBuilder.storageDescriptor(storageDescriptor)
  }

  /**
   * @param values The values of the partition. 
   * Although this parameter is not required by the SDK, you must specify this parameter for a valid
   * input.
   *
   * The values for the keys for the new partition must be passed as an array of String objects that
   * must be ordered in the same order as the partition keys appearing in the Amazon S3 prefix.
   * Otherwise AWS Glue will add the values to the wrong keys.
   */
  public fun values(vararg values: String) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values The values of the partition. 
   * Although this parameter is not required by the SDK, you must specify this parameter for a valid
   * input.
   *
   * The values for the keys for the new partition must be passed as an array of String objects that
   * must be ordered in the same order as the partition keys appearing in the Amazon S3 prefix.
   * Otherwise AWS Glue will add the values to the wrong keys.
   */
  public fun values(values: Collection<String>) {
    _values.addAll(values)
  }

  public fun build(): CfnPartition.PartitionInputProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
