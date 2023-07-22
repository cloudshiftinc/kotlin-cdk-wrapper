@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnIndex

@CdkDslMarker
public class CfnIndexDocumentMetadataConfigurationPropertyDsl {
  private val cdkBuilder: CfnIndex.DocumentMetadataConfigurationProperty.Builder =
      CfnIndex.DocumentMetadataConfigurationProperty.builder()

  /**
   * @param name The name of the index field. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param relevance Provides tuning parameters to determine how the field affects the search
   * results.
   */
  public fun relevance(relevance: IResolvable) {
    cdkBuilder.relevance(relevance)
  }

  /**
   * @param relevance Provides tuning parameters to determine how the field affects the search
   * results.
   */
  public fun relevance(relevance: CfnIndex.RelevanceProperty) {
    cdkBuilder.relevance(relevance)
  }

  /**
   * @param search Provides information about how the field is used during a search.
   */
  public fun search(search: IResolvable) {
    cdkBuilder.search(search)
  }

  /**
   * @param search Provides information about how the field is used during a search.
   */
  public fun search(search: CfnIndex.SearchProperty) {
    cdkBuilder.search(search)
  }

  /**
   * @param type The data type of the index field. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnIndex.DocumentMetadataConfigurationProperty = cdkBuilder.build()
}
