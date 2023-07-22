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

/**
 * Provides the configuration information to connect to OneDrive as your data source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * OneDriveConfigurationProperty oneDriveConfigurationProperty =
 * OneDriveConfigurationProperty.builder()
 * .oneDriveUsers(OneDriveUsersProperty.builder()
 * .oneDriveUserList(List.of("oneDriveUserList"))
 * .oneDriveUserS3Path(S3PathProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .build())
 * .build())
 * .secretArn("secretArn")
 * .tenantDomain("tenantDomain")
 * // the properties below are optional
 * .disableLocalGroups(false)
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-onedriveconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceOneDriveConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.OneDriveConfigurationProperty.Builder =
      CfnDataSource.OneDriveConfigurationProperty.builder()

  private val _exclusionPatterns: MutableList<String> = mutableListOf()

  private val _fieldMappings: MutableList<Any> = mutableListOf()

  private val _inclusionPatterns: MutableList<String> = mutableListOf()

  /**
   * @param disableLocalGroups `TRUE` to disable local groups information.
   */
  public fun disableLocalGroups(disableLocalGroups: Boolean) {
    cdkBuilder.disableLocalGroups(disableLocalGroups)
  }

  /**
   * @param disableLocalGroups `TRUE` to disable local groups information.
   */
  public fun disableLocalGroups(disableLocalGroups: IResolvable) {
    cdkBuilder.disableLocalGroups(disableLocalGroups)
  }

  /**
   * @param exclusionPatterns A list of regular expression patterns to exclude certain documents in
   * your OneDrive.
   * Documents that match the patterns are excluded from the index. Documents that don't match the
   * patterns are included in the index. If a document matches both an inclusion and exclusion pattern,
   * the exclusion pattern takes precedence and the document isn't included in the index.
   *
   * The pattern is applied to the file name.
   */
  public fun exclusionPatterns(vararg exclusionPatterns: String) {
    _exclusionPatterns.addAll(listOf(*exclusionPatterns))
  }

  /**
   * @param exclusionPatterns A list of regular expression patterns to exclude certain documents in
   * your OneDrive.
   * Documents that match the patterns are excluded from the index. Documents that don't match the
   * patterns are included in the index. If a document matches both an inclusion and exclusion pattern,
   * the exclusion pattern takes precedence and the document isn't included in the index.
   *
   * The pattern is applied to the file name.
   */
  public fun exclusionPatterns(exclusionPatterns: Collection<String>) {
    _exclusionPatterns.addAll(exclusionPatterns)
  }

  /**
   * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map OneDrive data
   * source attributes or field names to Amazon Kendra index field names.
   * To create custom fields, use the `UpdateIndex` API before you map to OneDrive fields. For more
   * information, see [Mapping data source
   * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The OneDrive data
   * source field names must exist in your OneDrive custom metadata.
   */
  public fun fieldMappings(vararg fieldMappings: Any) {
    _fieldMappings.addAll(listOf(*fieldMappings))
  }

  /**
   * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map OneDrive data
   * source attributes or field names to Amazon Kendra index field names.
   * To create custom fields, use the `UpdateIndex` API before you map to OneDrive fields. For more
   * information, see [Mapping data source
   * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The OneDrive data
   * source field names must exist in your OneDrive custom metadata.
   */
  public fun fieldMappings(fieldMappings: Collection<Any>) {
    _fieldMappings.addAll(fieldMappings)
  }

  /**
   * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map OneDrive data
   * source attributes or field names to Amazon Kendra index field names.
   * To create custom fields, use the `UpdateIndex` API before you map to OneDrive fields. For more
   * information, see [Mapping data source
   * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The OneDrive data
   * source field names must exist in your OneDrive custom metadata.
   */
  public fun fieldMappings(fieldMappings: IResolvable) {
    cdkBuilder.fieldMappings(fieldMappings)
  }

  /**
   * @param inclusionPatterns A list of regular expression patterns to include certain documents in
   * your OneDrive.
   * Documents that match the patterns are included in the index. Documents that don't match the
   * patterns are excluded from the index. If a document matches both an inclusion and exclusion
   * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
   *
   * The pattern is applied to the file name.
   */
  public fun inclusionPatterns(vararg inclusionPatterns: String) {
    _inclusionPatterns.addAll(listOf(*inclusionPatterns))
  }

  /**
   * @param inclusionPatterns A list of regular expression patterns to include certain documents in
   * your OneDrive.
   * Documents that match the patterns are included in the index. Documents that don't match the
   * patterns are excluded from the index. If a document matches both an inclusion and exclusion
   * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
   *
   * The pattern is applied to the file name.
   */
  public fun inclusionPatterns(inclusionPatterns: Collection<String>) {
    _inclusionPatterns.addAll(inclusionPatterns)
  }

  /**
   * @param oneDriveUsers A list of user accounts whose documents should be indexed. 
   */
  public fun oneDriveUsers(oneDriveUsers: IResolvable) {
    cdkBuilder.oneDriveUsers(oneDriveUsers)
  }

  /**
   * @param oneDriveUsers A list of user accounts whose documents should be indexed. 
   */
  public fun oneDriveUsers(oneDriveUsers: CfnDataSource.OneDriveUsersProperty) {
    cdkBuilder.oneDriveUsers(oneDriveUsers)
  }

  /**
   * @param secretArn The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that contains
   * the user name and password to connect to OneDrive. 
   * The user name should be the application ID for the OneDrive application, and the password is
   * the application key for the OneDrive application.
   */
  public fun secretArn(secretArn: String) {
    cdkBuilder.secretArn(secretArn)
  }

  /**
   * @param tenantDomain The Azure Active Directory domain of the organization. 
   */
  public fun tenantDomain(tenantDomain: String) {
    cdkBuilder.tenantDomain(tenantDomain)
  }

  public fun build(): CfnDataSource.OneDriveConfigurationProperty {
    if(_exclusionPatterns.isNotEmpty()) cdkBuilder.exclusionPatterns(_exclusionPatterns)
    if(_fieldMappings.isNotEmpty()) cdkBuilder.fieldMappings(_fieldMappings)
    if(_inclusionPatterns.isNotEmpty()) cdkBuilder.inclusionPatterns(_inclusionPatterns)
    return cdkBuilder.build()
  }
}
