@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * The properties that are applied when Salesforce is being used as a destination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * SalesforceDestinationPropertiesProperty salesforceDestinationPropertiesProperty =
 * SalesforceDestinationPropertiesProperty.builder()
 * .object("object")
 * // the properties below are optional
 * .dataTransferApi("dataTransferApi")
 * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .failOnFirstError(false)
 * .build())
 * .idFieldNames(List.of("idFieldNames"))
 * .writeOperationType("writeOperationType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-salesforcedestinationproperties.html)
 */
@CdkDslMarker
public class CfnFlowSalesforceDestinationPropertiesPropertyDsl {
  private val cdkBuilder: CfnFlow.SalesforceDestinationPropertiesProperty.Builder =
      CfnFlow.SalesforceDestinationPropertiesProperty.builder()

  private val _idFieldNames: MutableList<String> = mutableListOf()

  /**
   * @param dataTransferApi Specifies which Salesforce API is used by Amazon AppFlow when your flow
   * transfers data to Salesforce.
   * * **AUTOMATIC** - The default. Amazon AppFlow selects which API to use based on the number of
   * records that your flow transfers to Salesforce. If your flow transfers fewer than 1,000 records,
   * Amazon AppFlow uses Salesforce REST API. If your flow transfers 1,000 records or more, Amazon
   * AppFlow uses Salesforce Bulk API 2.0.
   *
   * Each of these Salesforce APIs structures data differently. If Amazon AppFlow selects the API
   * automatically, be aware that, for recurring flows, the data output might vary from one flow run to
   * the next. For example, if a flow runs daily, it might use REST API on one day to transfer 900
   * records, and it might use Bulk API 2.0 on the next day to transfer 1,100 records. For each of
   * these flow runs, the respective Salesforce API formats the data differently. Some of the
   * differences include how dates are formatted and null values are represented. Also, Bulk API 2.0
   * doesn't transfer Salesforce compound fields.
   *
   * By choosing this option, you optimize flow performance for both small and large data transfers,
   * but the tradeoff is inconsistent formatting in the output.
   *
   * * **BULKV2** - Amazon AppFlow uses only Salesforce Bulk API 2.0. This API runs asynchronous
   * data transfers, and it's optimal for large sets of data. By choosing this option, you ensure that
   * your flow writes consistent output, but you optimize performance only for large data transfers.
   *
   * Note that Bulk API 2.0 does not transfer Salesforce compound fields.
   *
   * * **REST_SYNC** - Amazon AppFlow uses only Salesforce REST API. By choosing this option, you
   * ensure that your flow writes consistent output, but you decrease performance for large data
   * transfers that are better suited for Bulk API 2.0. In some cases, if your flow attempts to
   * transfer a vary large set of data, it might fail with a timed out error.
   */
  public fun dataTransferApi(dataTransferApi: String) {
    cdkBuilder.dataTransferApi(dataTransferApi)
  }

  /**
   * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error when
   * placing data in the Salesforce destination.
   * For example, this setting would determine if the flow should fail after one insertion error, or
   * continue and attempt to insert every record regardless of the initial failure.
   * `ErrorHandlingConfig` is a part of the destination connector details.
   */
  public fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
    cdkBuilder.errorHandlingConfig(errorHandlingConfig)
  }

  /**
   * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error when
   * placing data in the Salesforce destination.
   * For example, this setting would determine if the flow should fail after one insertion error, or
   * continue and attempt to insert every record regardless of the initial failure.
   * `ErrorHandlingConfig` is a part of the destination connector details.
   */
  public fun errorHandlingConfig(errorHandlingConfig: CfnFlow.ErrorHandlingConfigProperty) {
    cdkBuilder.errorHandlingConfig(errorHandlingConfig)
  }

  /**
   * @param idFieldNames The name of the field that Amazon AppFlow uses as an ID when performing a
   * write operation such as update or delete.
   */
  public fun idFieldNames(vararg idFieldNames: String) {
    _idFieldNames.addAll(listOf(*idFieldNames))
  }

  /**
   * @param idFieldNames The name of the field that Amazon AppFlow uses as an ID when performing a
   * write operation such as update or delete.
   */
  public fun idFieldNames(idFieldNames: Collection<String>) {
    _idFieldNames.addAll(idFieldNames)
  }

  /**
   * @param object The object specified in the Salesforce flow destination. 
   */
  public fun `object`(`object`: String) {
    cdkBuilder.`object`(`object`)
  }

  /**
   * @param writeOperationType This specifies the type of write operation to be performed in
   * Salesforce.
   * When the value is `UPSERT` , then `idFieldNames` is required.
   */
  public fun writeOperationType(writeOperationType: String) {
    cdkBuilder.writeOperationType(writeOperationType)
  }

  public fun build(): CfnFlow.SalesforceDestinationPropertiesProperty {
    if(_idFieldNames.isNotEmpty()) cdkBuilder.idFieldNames(_idFieldNames)
    return cdkBuilder.build()
  }
}
