@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * User accounts whose documents should be indexed.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * OneDriveUsersProperty oneDriveUsersProperty = OneDriveUsersProperty.builder()
 * .oneDriveUserList(List.of("oneDriveUserList"))
 * .oneDriveUserS3Path(S3PathProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-onedriveusers.html)
 */
@CdkDslMarker
public class CfnDataSourceOneDriveUsersPropertyDsl {
  private val cdkBuilder: CfnDataSource.OneDriveUsersProperty.Builder =
      CfnDataSource.OneDriveUsersProperty.builder()

  private val _oneDriveUserList: MutableList<String> = mutableListOf()

  /**
   * @param oneDriveUserList A list of users whose documents should be indexed.
   * Specify the user names in email format, for example, `username&#64;tenantdomain` . If you need
   * to index the documents of more than 100 users, use the `OneDriveUserS3Path` field to specify the
   * location of a file containing a list of users.
   */
  public fun oneDriveUserList(vararg oneDriveUserList: String) {
    _oneDriveUserList.addAll(listOf(*oneDriveUserList))
  }

  /**
   * @param oneDriveUserList A list of users whose documents should be indexed.
   * Specify the user names in email format, for example, `username&#64;tenantdomain` . If you need
   * to index the documents of more than 100 users, use the `OneDriveUserS3Path` field to specify the
   * location of a file containing a list of users.
   */
  public fun oneDriveUserList(oneDriveUserList: Collection<String>) {
    _oneDriveUserList.addAll(oneDriveUserList)
  }

  /**
   * @param oneDriveUserS3Path The S3 bucket location of a file containing a list of users whose
   * documents should be indexed.
   */
  public fun oneDriveUserS3Path(oneDriveUserS3Path: IResolvable) {
    cdkBuilder.oneDriveUserS3Path(oneDriveUserS3Path)
  }

  /**
   * @param oneDriveUserS3Path The S3 bucket location of a file containing a list of users whose
   * documents should be indexed.
   */
  public fun oneDriveUserS3Path(oneDriveUserS3Path: CfnDataSource.S3PathProperty) {
    cdkBuilder.oneDriveUserS3Path(oneDriveUserS3Path)
  }

  public fun build(): CfnDataSource.OneDriveUsersProperty {
    if(_oneDriveUserList.isNotEmpty()) cdkBuilder.oneDriveUserList(_oneDriveUserList)
    return cdkBuilder.build()
  }
}
