@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

@CdkDslMarker
public class CfnEventSourceMappingDocumentDBEventSourceConfigPropertyDsl {
  private val cdkBuilder: CfnEventSourceMapping.DocumentDBEventSourceConfigProperty.Builder =
      CfnEventSourceMapping.DocumentDBEventSourceConfigProperty.builder()

  /**
   * @param collectionName The name of the collection to consume within the database.
   * If you do not specify a collection, Lambda consumes all collections.
   */
  public fun collectionName(collectionName: String) {
    cdkBuilder.collectionName(collectionName)
  }

  /**
   * @param databaseName The name of the database to consume within the DocumentDB cluster.
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  /**
   * @param fullDocument Determines what DocumentDB sends to your event stream during document
   * update operations.
   * If set to UpdateLookup, DocumentDB sends a delta describing the changes, along with a copy of
   * the entire document. Otherwise, DocumentDB sends only a partial document that contains the
   * changes.
   */
  public fun fullDocument(fullDocument: String) {
    cdkBuilder.fullDocument(fullDocument)
  }

  public fun build(): CfnEventSourceMapping.DocumentDBEventSourceConfigProperty = cdkBuilder.build()
}
