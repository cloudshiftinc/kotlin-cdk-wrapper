@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

/**
 * Describes the configuration for the file uploader field.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * FileUploaderFieldConfigProperty fileUploaderFieldConfigProperty =
 * FileUploaderFieldConfigProperty.builder()
 * .acceptedFileTypes(List.of("acceptedFileTypes"))
 * .accessLevel("accessLevel")
 * // the properties below are optional
 * .isResumable(false)
 * .maxFileCount(123)
 * .maxSize(123)
 * .showThumbnails(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fileuploaderfieldconfig.html)
 */
@CdkDslMarker
public class CfnFormFileUploaderFieldConfigPropertyDsl {
  private val cdkBuilder: CfnForm.FileUploaderFieldConfigProperty.Builder =
      CfnForm.FileUploaderFieldConfigProperty.builder()

  private val _acceptedFileTypes: MutableList<String> = mutableListOf()

  /**
   * @param acceptedFileTypes The file types that are allowed to be uploaded by the file uploader. 
   * Provide this information in an array of strings specifying the valid file extensions.
   */
  public fun acceptedFileTypes(vararg acceptedFileTypes: String) {
    _acceptedFileTypes.addAll(listOf(*acceptedFileTypes))
  }

  /**
   * @param acceptedFileTypes The file types that are allowed to be uploaded by the file uploader. 
   * Provide this information in an array of strings specifying the valid file extensions.
   */
  public fun acceptedFileTypes(acceptedFileTypes: Collection<String>) {
    _acceptedFileTypes.addAll(acceptedFileTypes)
  }

  /**
   * @param accessLevel The access level to assign to the uploaded files in the Amazon S3 bucket
   * where they are stored. 
   * The valid values for this property are `private` , `protected` , or `public` . For detailed
   * information about the permissions associated with each access level, see [File access
   * levels](https://docs.aws.amazon.com/https://docs.amplify.aws/lib/storage/configureaccess/q/platform/js/)
   * in the *Amplify documentation* .
   */
  public fun accessLevel(accessLevel: String) {
    cdkBuilder.accessLevel(accessLevel)
  }

  /**
   * @param isResumable Allows the file upload operation to be paused and resumed. The default value
   * is `false` .
   * When `isResumable` is set to `true` , the file uploader uses a multipart upload to break the
   * files into chunks before upload. The progress of the upload isn't continuous, because the file
   * uploader uploads a chunk at a time.
   */
  public fun isResumable(isResumable: Boolean) {
    cdkBuilder.isResumable(isResumable)
  }

  /**
   * @param isResumable Allows the file upload operation to be paused and resumed. The default value
   * is `false` .
   * When `isResumable` is set to `true` , the file uploader uses a multipart upload to break the
   * files into chunks before upload. The progress of the upload isn't continuous, because the file
   * uploader uploads a chunk at a time.
   */
  public fun isResumable(isResumable: IResolvable) {
    cdkBuilder.isResumable(isResumable)
  }

  /**
   * @param maxFileCount Specifies the maximum number of files that can be selected to upload.
   * The default value is an unlimited number of files.
   */
  public fun maxFileCount(maxFileCount: Number) {
    cdkBuilder.maxFileCount(maxFileCount)
  }

  /**
   * @param maxSize The maximum file size in bytes that the file uploader will accept.
   * The default value is an unlimited file size.
   */
  public fun maxSize(maxSize: Number) {
    cdkBuilder.maxSize(maxSize)
  }

  /**
   * @param showThumbnails Specifies whether to display or hide the image preview after selecting a
   * file for upload.
   * The default value is `true` to display the image preview.
   */
  public fun showThumbnails(showThumbnails: Boolean) {
    cdkBuilder.showThumbnails(showThumbnails)
  }

  /**
   * @param showThumbnails Specifies whether to display or hide the image preview after selecting a
   * file for upload.
   * The default value is `true` to display the image preview.
   */
  public fun showThumbnails(showThumbnails: IResolvable) {
    cdkBuilder.showThumbnails(showThumbnails)
  }

  public fun build(): CfnForm.FileUploaderFieldConfigProperty {
    if(_acceptedFileTypes.isNotEmpty()) cdkBuilder.acceptedFileTypes(_acceptedFileTypes)
    return cdkBuilder.build()
  }
}
