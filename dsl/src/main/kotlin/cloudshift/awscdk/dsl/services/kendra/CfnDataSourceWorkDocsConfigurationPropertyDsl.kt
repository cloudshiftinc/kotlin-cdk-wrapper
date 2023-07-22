@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceWorkDocsConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.WorkDocsConfigurationProperty.Builder =
      CfnDataSource.WorkDocsConfigurationProperty.builder()

  private val _exclusionPatterns: MutableList<String> = mutableListOf()

  private val _fieldMappings: MutableList<Any> = mutableListOf()

  private val _inclusionPatterns: MutableList<String> = mutableListOf()

  /**
   * @param crawlComments `TRUE` to include comments on documents in your index.
   * Including comments in your index means each comment is a document that can be searched on.
   *
   * The default is set to `FALSE` .
   */
  public fun crawlComments(crawlComments: Boolean) {
    cdkBuilder.crawlComments(crawlComments)
  }

  /**
   * @param crawlComments `TRUE` to include comments on documents in your index.
   * Including comments in your index means each comment is a document that can be searched on.
   *
   * The default is set to `FALSE` .
   */
  public fun crawlComments(crawlComments: IResolvable) {
    cdkBuilder.crawlComments(crawlComments)
  }

  /**
   * @param exclusionPatterns A list of regular expression patterns to exclude certain files in your
   * Amazon WorkDocs site repository.
   * Files that match the patterns are excluded from the index. Files that don’t match the patterns
   * are included in the index. If a file matches both an inclusion and exclusion pattern, the
   * exclusion pattern takes precedence and the file isn't included in the index.
   */
  public fun exclusionPatterns(vararg exclusionPatterns: String) {
    _exclusionPatterns.addAll(listOf(*exclusionPatterns))
  }

  /**
   * @param exclusionPatterns A list of regular expression patterns to exclude certain files in your
   * Amazon WorkDocs site repository.
   * Files that match the patterns are excluded from the index. Files that don’t match the patterns
   * are included in the index. If a file matches both an inclusion and exclusion pattern, the
   * exclusion pattern takes precedence and the file isn't included in the index.
   */
  public fun exclusionPatterns(exclusionPatterns: Collection<String>) {
    _exclusionPatterns.addAll(exclusionPatterns)
  }

  /**
   * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map Amazon WorkDocs
   * data source attributes or field names to Amazon Kendra index field names.
   * To create custom fields, use the `UpdateIndex` API before you map to Amazon WorkDocs fields.
   * For more information, see [Mapping data source
   * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Amazon WorkDocs
   * data source field names must exist in your Amazon WorkDocs custom metadata.
   */
  public fun fieldMappings(vararg fieldMappings: Any) {
    _fieldMappings.addAll(listOf(*fieldMappings))
  }

  /**
   * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map Amazon WorkDocs
   * data source attributes or field names to Amazon Kendra index field names.
   * To create custom fields, use the `UpdateIndex` API before you map to Amazon WorkDocs fields.
   * For more information, see [Mapping data source
   * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Amazon WorkDocs
   * data source field names must exist in your Amazon WorkDocs custom metadata.
   */
  public fun fieldMappings(fieldMappings: Collection<Any>) {
    _fieldMappings.addAll(fieldMappings)
  }

  /**
   * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map Amazon WorkDocs
   * data source attributes or field names to Amazon Kendra index field names.
   * To create custom fields, use the `UpdateIndex` API before you map to Amazon WorkDocs fields.
   * For more information, see [Mapping data source
   * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Amazon WorkDocs
   * data source field names must exist in your Amazon WorkDocs custom metadata.
   */
  public fun fieldMappings(fieldMappings: IResolvable) {
    cdkBuilder.fieldMappings(fieldMappings)
  }

  /**
   * @param inclusionPatterns A list of regular expression patterns to include certain files in your
   * Amazon WorkDocs site repository.
   * Files that match the patterns are included in the index. Files that don't match the patterns
   * are excluded from the index. If a file matches both an inclusion and exclusion pattern, the
   * exclusion pattern takes precedence and the file isn't included in the index.
   */
  public fun inclusionPatterns(vararg inclusionPatterns: String) {
    _inclusionPatterns.addAll(listOf(*inclusionPatterns))
  }

  /**
   * @param inclusionPatterns A list of regular expression patterns to include certain files in your
   * Amazon WorkDocs site repository.
   * Files that match the patterns are included in the index. Files that don't match the patterns
   * are excluded from the index. If a file matches both an inclusion and exclusion pattern, the
   * exclusion pattern takes precedence and the file isn't included in the index.
   */
  public fun inclusionPatterns(inclusionPatterns: Collection<String>) {
    _inclusionPatterns.addAll(inclusionPatterns)
  }

  /**
   * @param organizationId The identifier of the directory corresponding to your Amazon WorkDocs
   * site repository. 
   * You can find the organization ID in the [AWS Directory
   * Service](https://docs.aws.amazon.com/directoryservicev2/) by going to *Active Directory* , then
   * *Directories* . Your Amazon WorkDocs site directory has an ID, which is the organization ID. You
   * can also set up a new Amazon WorkDocs directory in the AWS Directory Service console and enable a
   * Amazon WorkDocs site for the directory in the Amazon WorkDocs console.
   */
  public fun organizationId(organizationId: String) {
    cdkBuilder.organizationId(organizationId)
  }

  /**
   * @param useChangeLog `TRUE` to use the Amazon WorkDocs change log to determine which documents
   * require updating in the index.
   * Depending on the change log's size, it may take longer for Amazon Kendra to use the change log
   * than to scan all of your documents in Amazon WorkDocs.
   */
  public fun useChangeLog(useChangeLog: Boolean) {
    cdkBuilder.useChangeLog(useChangeLog)
  }

  /**
   * @param useChangeLog `TRUE` to use the Amazon WorkDocs change log to determine which documents
   * require updating in the index.
   * Depending on the change log's size, it may take longer for Amazon Kendra to use the change log
   * than to scan all of your documents in Amazon WorkDocs.
   */
  public fun useChangeLog(useChangeLog: IResolvable) {
    cdkBuilder.useChangeLog(useChangeLog)
  }

  public fun build(): CfnDataSource.WorkDocsConfigurationProperty {
    if(_exclusionPatterns.isNotEmpty()) cdkBuilder.exclusionPatterns(_exclusionPatterns)
    if(_fieldMappings.isNotEmpty()) cdkBuilder.fieldMappings(_fieldMappings)
    if(_inclusionPatterns.isNotEmpty()) cdkBuilder.inclusionPatterns(_inclusionPatterns)
    return cdkBuilder.build()
  }
}
