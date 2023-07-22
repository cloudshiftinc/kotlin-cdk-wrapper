@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Provides the configuration information to connect to Google Drive as your data source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * GoogleDriveConfigurationProperty googleDriveConfigurationProperty =
 * GoogleDriveConfigurationProperty.builder()
 * .secretArn("secretArn")
 * // the properties below are optional
 * .excludeMimeTypes(List.of("excludeMimeTypes"))
 * .excludeSharedDrives(List.of("excludeSharedDrives"))
 * .excludeUserAccounts(List.of("excludeUserAccounts"))
 * .exclusionPatterns(List.of("exclusionPatterns"))
 * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
 * .dataSourceFieldName("dataSourceFieldName")
 * .indexFieldName("indexFieldName")
 * // the properties below are optional
 * .dateFieldFormat("dateFieldFormat")
 * .build()))
 * .inclusionPatterns(List.of("inclusionPatterns"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-googledriveconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceGoogleDriveConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.GoogleDriveConfigurationProperty.Builder =
      CfnDataSource.GoogleDriveConfigurationProperty.builder()

  private val _excludeMimeTypes: MutableList<String> = mutableListOf()

  private val _excludeSharedDrives: MutableList<String> = mutableListOf()

  private val _excludeUserAccounts: MutableList<String> = mutableListOf()

  private val _exclusionPatterns: MutableList<String> = mutableListOf()

  private val _fieldMappings: MutableList<Any> = mutableListOf()

  private val _inclusionPatterns: MutableList<String> = mutableListOf()

  /**
   * @param excludeMimeTypes A list of MIME types to exclude from the index. All documents matching
   * the specified MIME type are excluded.
   * For a list of MIME types, see [Using a Google Workspace Drive data
   * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html) .
   */
  public fun excludeMimeTypes(vararg excludeMimeTypes: String) {
    _excludeMimeTypes.addAll(listOf(*excludeMimeTypes))
  }

  /**
   * @param excludeMimeTypes A list of MIME types to exclude from the index. All documents matching
   * the specified MIME type are excluded.
   * For a list of MIME types, see [Using a Google Workspace Drive data
   * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html) .
   */
  public fun excludeMimeTypes(excludeMimeTypes: Collection<String>) {
    _excludeMimeTypes.addAll(excludeMimeTypes)
  }

  /**
   * @param excludeSharedDrives A list of identifiers or shared drives to exclude from the index.
   * All files and folders stored on the shared drive are excluded.
   */
  public fun excludeSharedDrives(vararg excludeSharedDrives: String) {
    _excludeSharedDrives.addAll(listOf(*excludeSharedDrives))
  }

  /**
   * @param excludeSharedDrives A list of identifiers or shared drives to exclude from the index.
   * All files and folders stored on the shared drive are excluded.
   */
  public fun excludeSharedDrives(excludeSharedDrives: Collection<String>) {
    _excludeSharedDrives.addAll(excludeSharedDrives)
  }

  /**
   * @param excludeUserAccounts A list of email addresses of the users.
   * Documents owned by these users are excluded from the index. Documents shared with excluded
   * users are indexed unless they are excluded in another way.
   */
  public fun excludeUserAccounts(vararg excludeUserAccounts: String) {
    _excludeUserAccounts.addAll(listOf(*excludeUserAccounts))
  }

  /**
   * @param excludeUserAccounts A list of email addresses of the users.
   * Documents owned by these users are excluded from the index. Documents shared with excluded
   * users are indexed unless they are excluded in another way.
   */
  public fun excludeUserAccounts(excludeUserAccounts: Collection<String>) {
    _excludeUserAccounts.addAll(excludeUserAccounts)
  }

  /**
   * @param exclusionPatterns A list of regular expression patterns to exclude certain items in your
   * Google Drive, including shared drives and users' My Drives.
   * Items that match the patterns are excluded from the index. Items that don't match the patterns
   * are included in the index. If an item matches both an inclusion and exclusion pattern, the
   * exclusion pattern takes precedence and the item isn't included in the index.
   */
  public fun exclusionPatterns(vararg exclusionPatterns: String) {
    _exclusionPatterns.addAll(listOf(*exclusionPatterns))
  }

  /**
   * @param exclusionPatterns A list of regular expression patterns to exclude certain items in your
   * Google Drive, including shared drives and users' My Drives.
   * Items that match the patterns are excluded from the index. Items that don't match the patterns
   * are included in the index. If an item matches both an inclusion and exclusion pattern, the
   * exclusion pattern takes precedence and the item isn't included in the index.
   */
  public fun exclusionPatterns(exclusionPatterns: Collection<String>) {
    _exclusionPatterns.addAll(exclusionPatterns)
  }

  /**
   * @param fieldMappings Maps Google Drive data source attributes or field names to Amazon Kendra
   * index field names.
   * To create custom fields, use the `UpdateIndex` API before you map to Google Drive fields. For
   * more information, see [Mapping data source
   * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Google Drive data
   * source field names must exist in your Google Drive custom metadata.
   */
  public fun fieldMappings(vararg fieldMappings: Any) {
    _fieldMappings.addAll(listOf(*fieldMappings))
  }

  /**
   * @param fieldMappings Maps Google Drive data source attributes or field names to Amazon Kendra
   * index field names.
   * To create custom fields, use the `UpdateIndex` API before you map to Google Drive fields. For
   * more information, see [Mapping data source
   * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Google Drive data
   * source field names must exist in your Google Drive custom metadata.
   */
  public fun fieldMappings(fieldMappings: Collection<Any>) {
    _fieldMappings.addAll(fieldMappings)
  }

  /**
   * @param fieldMappings Maps Google Drive data source attributes or field names to Amazon Kendra
   * index field names.
   * To create custom fields, use the `UpdateIndex` API before you map to Google Drive fields. For
   * more information, see [Mapping data source
   * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Google Drive data
   * source field names must exist in your Google Drive custom metadata.
   */
  public fun fieldMappings(fieldMappings: IResolvable) {
    cdkBuilder.fieldMappings(fieldMappings)
  }

  /**
   * @param inclusionPatterns A list of regular expression patterns to include certain items in your
   * Google Drive, including shared drives and users' My Drives.
   * Items that match the patterns are included in the index. Items that don't match the patterns
   * are excluded from the index. If an item matches both an inclusion and exclusion pattern, the
   * exclusion pattern takes precedence and the item isn't included in the index.
   */
  public fun inclusionPatterns(vararg inclusionPatterns: String) {
    _inclusionPatterns.addAll(listOf(*inclusionPatterns))
  }

  /**
   * @param inclusionPatterns A list of regular expression patterns to include certain items in your
   * Google Drive, including shared drives and users' My Drives.
   * Items that match the patterns are included in the index. Items that don't match the patterns
   * are excluded from the index. If an item matches both an inclusion and exclusion pattern, the
   * exclusion pattern takes precedence and the item isn't included in the index.
   */
  public fun inclusionPatterns(inclusionPatterns: Collection<String>) {
    _inclusionPatterns.addAll(inclusionPatterns)
  }

  /**
   * @param secretArn The Amazon Resource Name (ARN) of a AWS Secrets Manager secret that contains
   * the credentials required to connect to Google Drive. 
   * For more information, see [Using a Google Workspace Drive data
   * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html) .
   */
  public fun secretArn(secretArn: String) {
    cdkBuilder.secretArn(secretArn)
  }

  public fun build(): CfnDataSource.GoogleDriveConfigurationProperty {
    if(_excludeMimeTypes.isNotEmpty()) cdkBuilder.excludeMimeTypes(_excludeMimeTypes)
    if(_excludeSharedDrives.isNotEmpty()) cdkBuilder.excludeSharedDrives(_excludeSharedDrives)
    if(_excludeUserAccounts.isNotEmpty()) cdkBuilder.excludeUserAccounts(_excludeUserAccounts)
    if(_exclusionPatterns.isNotEmpty()) cdkBuilder.exclusionPatterns(_exclusionPatterns)
    if(_fieldMappings.isNotEmpty()) cdkBuilder.fieldMappings(_fieldMappings)
    if(_inclusionPatterns.isNotEmpty()) cdkBuilder.inclusionPatterns(_inclusionPatterns)
    return cdkBuilder.build()
  }
}
